package xyz.devartisee.recommend.service;

import xyz.devartisee.recommend.service.dto.request.GetPlaceRequest;
import xyz.devartisee.recommend.service.dto.response.GetPlaceResponse;

import java.util.List;

public interface MapService {

    public List<GetPlaceResponse> getPlaceList(GetPlaceRequest request);

}
