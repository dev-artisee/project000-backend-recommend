package xyz.devartisee.recommend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse.GetCategoryResponse;
import xyz.devartisee.recommend.service.dto.request.GetPlaceRequest;
import xyz.devartisee.recommend.service.dto.response.GetPlaceResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Transactional
@Service
public class MapServiceImpl implements MapService {

    WebClient webClient = WebClient.builder()
                            .baseUrl("https://dapi.kakao.com")
                            .defaultHeader(HttpHeaders.AUTHORIZATION, "KakaoAK eac97934f12a27f83e1c9cdd30f46041")
                            .build();

    @Override
    public List<GetPlaceResponse> getPlaceList(GetPlaceRequest request) {

        GetCategoryResponse getCategoryResponse;
        getCategoryResponse = webClient.get().uri(uriBuilder -> uriBuilder.path("/v2/local/search/category.json")
                        .queryParam("category_group_code", "FD6")
                        .queryParam("x", request.getLongitude().toString())
                        .queryParam("y", request.getLatitude().toString())
                        .queryParam("radius", request.getRadius().toString())
                        .build())
                .retrieve()
                .bodyToMono(GetCategoryResponse.class).block();
        List<GetPlaceResponse> getPlaceResponseList = new ArrayList<>();
        for (int i = 0; i < Objects.requireNonNull(getCategoryResponse).getDocuments().size(); i++) {
            getPlaceResponseList.add(
                    GetPlaceResponse.builder()
                            .addressName(getCategoryResponse.getDocuments().get(i).getAddress_name())
                            .categoryName(getCategoryResponse.getDocuments().get(i).getCategory_name())
                            .phone(getCategoryResponse.getDocuments().get(i).getPhone())
                            .placeName(getCategoryResponse.getDocuments().get(i).getPlace_name())
                            .placeUrl(getCategoryResponse.getDocuments().get(i).getPlace_url())
                            .roadAddressName(getCategoryResponse.getDocuments().get(i).getRoad_address_name())
                            .latitude(getCategoryResponse.getDocuments().get(i).getY())
                            .longitude(getCategoryResponse.getDocuments().get(i).getX())
                            .build()
            );
        }
        return getPlaceResponseList;
    }
    // 카테고리로 장소 검색하기 - 카테고리 그룹 코드
    //MT1	대형마트
    //CS2	편의점
    //PS3	어린이집, 유치원
    //SC4	학교
    //AC5	학원
    //PK6	주차장
    //OL7	주유소, 충전소
    //SW8	지하철역
    //BK9	은행
    //CT1	문화시설
    //AG2	중개업소
    //PO3	공공기관
    //AT4	관광명소
    //AD5	숙박
    //FD6	음식점
    //CE7	카페
    //HP8	병원
    //PM9	약국

//    private List<GetPlaceResponse> searchPlaces(GetPlaceRequest) {
//
//    }

}

