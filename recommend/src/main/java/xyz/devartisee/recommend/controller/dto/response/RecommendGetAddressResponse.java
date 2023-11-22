package xyz.devartisee.recommend.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecommendGetAddressResponse {

    String id;
    String userId;
    String address;
    String latitude;
    String longitude;
}
