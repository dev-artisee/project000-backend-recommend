package xyz.devartisee.recommend.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetPlaceRequest {

    String latitude;
    String longitude;
    String radius;
    String category;

}
//
//              위도 string latitude
//        경도 string longitude
//        반경 string radius
//        카테고리 string category