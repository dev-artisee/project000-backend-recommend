package xyz.devartisee.recommend.service;

import xyz.devartisee.recommend.controller.dto.response.RecommendGetAddressResponse;
import xyz.devartisee.recommend.service.dto.request.GetPlaceRequest;
import xyz.devartisee.recommend.service.dto.request.GetUserAddressRequest;
import xyz.devartisee.recommend.service.dto.response.GetPlaceResponse;
import xyz.devartisee.recommend.service.dto.response.GetUserAddressResponse;

import java.util.List;

public interface MapService {

    List<GetUserAddressResponse> getAddress(GetUserAddressRequest request);

    GetUserAddressResponse addAddress(GetUserAddressRequest request);

    List<GetPlaceResponse> getPlaceList(GetPlaceRequest request);

}
