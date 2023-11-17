package xyz.devartisee.recommend.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetUserAddressRequest {

    String userId;
    String addressName;
    String latitude;
    String longitude;
}
