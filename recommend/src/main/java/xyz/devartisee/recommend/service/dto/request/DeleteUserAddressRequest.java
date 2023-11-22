package xyz.devartisee.recommend.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class DeleteUserAddressRequest {

    String id;
    String userId;
}
