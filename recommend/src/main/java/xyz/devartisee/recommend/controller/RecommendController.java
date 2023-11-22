package xyz.devartisee.recommend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.devartisee.recommend.controller.dto.base.BaseResponse;
import xyz.devartisee.recommend.controller.dto.requset.RecommendPatchAddressRequest;
import xyz.devartisee.recommend.controller.dto.requset.RecommendPostAddressRequest;
import xyz.devartisee.recommend.controller.dto.response.RecommendGetAddressResponse;
import xyz.devartisee.recommend.controller.dto.response.RecommendGetPlaceResponse;
import xyz.devartisee.recommend.service.MapService;
import xyz.devartisee.recommend.service.dto.request.DeleteUserAddressRequest;
import xyz.devartisee.recommend.service.dto.request.GetPlaceRequest;
import xyz.devartisee.recommend.service.dto.request.GetUserAddressRequest;
import xyz.devartisee.recommend.service.dto.response.GetPlaceResponse;
import xyz.devartisee.recommend.service.dto.response.GetUserAddressResponse;

import java.util.ArrayList;
import java.util.List;

@Tag(
        name = "추천",
        description = "추천 관련 API"
)
@RestController
@RequestMapping("/recommend")
@RequiredArgsConstructor
public class RecommendController {

    private final MapService mapService;


    @Operation(summary = "주소 조회", description = "회원 아이디로 주소 조회하여 주소에 대한 배열 반환")
    @GetMapping("/address")
    public ResponseEntity<BaseResponse> getAddress(@RequestParam String userId) {
        List<GetUserAddressResponse> address = mapService.getAddress(
                                                        GetUserAddressRequest.builder()
                                                                .userId(userId)
                                                                .build()
                                                );
        return ResponseEntity.ok(BaseResponse.of(200, "getAddress", address));
    }

    @Operation(summary = "주소 생성", description = "")
    @PostMapping("/address")
    public ResponseEntity<BaseResponse> postAddress(@RequestBody RecommendPostAddressRequest request) {
        GetUserAddressResponse response = mapService.addAddress(
                GetUserAddressRequest.builder()
                        .userId(request.getUserId())
                        .addressName(request.getAddress())
                        .latitude(request.getLatitude())
                        .longitude(request.getLongitude())
                        .build()
        );
        return ResponseEntity.ok(BaseResponse.of(200, "postAddress",
                RecommendGetAddressResponse.builder()
                        .userId(response.getUserId())
                        .address(response.getAddress())
                        .latitude(response.getLatitude())
                        .longitude(response.getLongitude())
                        .build()
                ));
    }

    @Operation(summary = "주소 수정", description = "")
    @PatchMapping("/address")
    public ResponseEntity<BaseResponse> patchAddress(@RequestBody RecommendPatchAddressRequest request) {
        GetUserAddressResponse response = mapService.updateAddress(
                GetUserAddressRequest.builder()
                        .userId(request.getUserId())
                        .addressName(request.getAddress())
                        .latitude(request.getLatitude())
                        .longitude(request.getLongitude())
                        .build()
        );
        return ResponseEntity.ok(BaseResponse.of(200, "patchAddress", response));
    }

    @Operation(summary = "주소 삭제", description = "")
    @DeleteMapping("/address")
    public ResponseEntity<BaseResponse> deleteAddress(@RequestParam String userId, @RequestParam String addressId) {
        mapService.deleteAddress(
                DeleteUserAddressRequest.builder()
                        .id(addressId)
                        .userId(userId)
                        .build()
        );
        return ResponseEntity.ok(BaseResponse.of(200, "deleteAddress", null));
    }

    @Operation(summary = "위치 기반 음식점 리스트 조회", description = "")
    @GetMapping("/place")
    public ResponseEntity<BaseResponse> getRecommendPlace(@RequestParam String latitude, @RequestParam String longitude,
                                                 @RequestParam String radius, @RequestParam String category) {

        List<RecommendGetPlaceResponse> result = new ArrayList<>();
        List<GetPlaceResponse> mapServicePlaceList = mapService.getPlaceList(new GetPlaceRequest(latitude, longitude, radius, category));
        for (int i = 0; i < mapServicePlaceList.size(); i++) {
            result.add(
                    RecommendGetPlaceResponse.builder()
                            .addressName(mapServicePlaceList.get(i).getAddressName())
                            .categoryName(mapServicePlaceList.get(i).getCategoryName())
                            .phone(mapServicePlaceList.get(i).getPhone())
                            .placeName(mapServicePlaceList.get(i).getPlaceName())
                            .placeUrl(mapServicePlaceList.get(i).getPlaceUrl())
                            .roadAddressName(mapServicePlaceList.get(i).getRoadAddressName())
                            .placeName(mapServicePlaceList.get(i).getPlaceName())
                            .latitude(mapServicePlaceList.get(i).getLatitude())
                            .longitude(mapServicePlaceList.get(i).getLongitude())
                            .build()
            );
        }
        return ResponseEntity.ok(BaseResponse.of(200, "getPlace", result));
    }

}
