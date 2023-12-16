package xyz.devartisee.recommend.service;

import org.springframework.data.domain.Page;
import xyz.devartisee.recommend.entity.UserPlace;
import xyz.devartisee.recommend.service.dto.request.GetUserPlaceRequest;
import xyz.devartisee.recommend.service.dto.response.GetUserPlaceResponse;

public interface RecordService {

    // 유저 음식점 그룹에서 음식점 리스트 조회
    // pagination 사용
    // params: userId, pageNo, pageSize, isDateAcs, rating
    // return: place 배열과 pageNo, pageSize

    // 유저 음식점 그룹에 음식점 추가
    // params: userId, placeId
    // 추가된 place ? 관련 정보

    // 유저 음식점 그룹에서 음식점 삭제
    // params: userId, placeId
    // 삭제된 place 관련 정보

    public Page<GetUserPlaceResponse> getUserPlaceResponsePage(GetUserPlaceRequest request);
    public Page<UserPlace> getUserPlaceEntityPage(GetUserPlaceRequest request);

}
