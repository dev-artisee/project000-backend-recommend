package xyz.devartisee.recommend.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class GetUserAddressRequest {

    String userId;
    String addressName;
    String latitude;
    String longitude;

}
