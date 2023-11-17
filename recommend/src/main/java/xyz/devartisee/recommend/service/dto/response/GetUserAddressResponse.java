package xyz.devartisee.recommend.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class GetUserAddressResponse {

    String id;
    String userId;
    String address;
    String latitude;
    String longitude;
}
