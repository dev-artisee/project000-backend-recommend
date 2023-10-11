package xyz.devartisee.recommend.controller.dto.requset;

import lombok.Data;

@Data
public class RecommendPatchAddressRequest {

    String userId;
    String addressId;
    String address;
    String latitude;
    String longitude;
}
