package xyz.devartisee.recommend.controller.dto.requset;

import lombok.Data;

@Data
public class RecommendPostAddressRequest {

    String userId;
    String address;
    String latitude;
    String longitude;
}
