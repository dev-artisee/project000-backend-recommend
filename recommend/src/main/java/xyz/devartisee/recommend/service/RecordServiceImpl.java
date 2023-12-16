package xyz.devartisee.recommend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.devartisee.recommend.entity.UserAddress;
import xyz.devartisee.recommend.entity.UserPlace;
import xyz.devartisee.recommend.repository.UserPlaceRepository;
import xyz.devartisee.recommend.service.dto.request.GetUserAddressRequest;
import xyz.devartisee.recommend.service.dto.request.GetUserPlaceRequest;
import xyz.devartisee.recommend.service.dto.response.GetUserAddressResponse;
import xyz.devartisee.recommend.service.dto.response.GetUserPlaceResponse;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class RecordServiceImpl implements RecordService {

    private final UserPlaceRepository userPlaceRepository;

    // 유저 음식점 그룹에서 음식점 리스트 조회
    // pagination 사용
    // params: userId, pageNo, pageSize, isDateAcs, rating
    // return: place 배열과 pageNo, pageSize

    @Override
    public Page<GetUserPlaceResponse> getUserPlaceResponsePage(GetUserPlaceRequest request) {
        // Page<UserPlace> entityPage = getUserPlaceEntityPage(request);

        // entityPage.getContent()
        getUserPlaceEntityPage(request);
        return null;

    }

    @Override
    public Page<UserPlace> getUserPlaceEntityPage(GetUserPlaceRequest request) {

        // parameter 용 Pageable 생성
        Pageable pageRequest = PageRequest.of(
                request.getPageNo(), // page number
                request.getPageSize(),  // page size
                request.getIsDateAsc() ? Sort.by("reg_date").ascending() : Sort.by("reg_date").descending());   // sort
        // 조회
        // Page<UserPlace> userPlaceList = userPlaceRepository.findAllByUserId(Integer.valueOf(request.getUserId()), pageRequest);
        //     Page<ReviewResponseDto> page = reviewRepository.findAllByUser(user, pageable).map(ReviewResponseDto::from);

        Page<UserPlace> page = userPlaceRepository.findAllByUserId(Integer.valueOf(request.getUserId()), pageRequest);
        List<UserPlace> list = page.getContent();
        return page;
    }

    // 유저 음식점 그룹에 음식점 추가
    // params: userId, placeId
    // 추가된 place ? 관련 정보

    // 유저 음식점 그룹에서 음식점 삭제
    // params: userId, placeId
    // 삭제된 place 관련 정보

}
