package xyz.devartisee.recommend.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendGetAddressResponse {

    String id;
    String userId;
    String address;
    String latitude;
    String longitude;
}
