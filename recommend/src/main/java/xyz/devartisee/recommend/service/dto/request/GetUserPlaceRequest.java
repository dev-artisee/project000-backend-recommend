package xyz.devartisee.recommend.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class GetUserPlaceRequest {

    String userId;
    Integer pageNo;
    Integer pageSize;
    Boolean isDateAsc;
    String rating;

}
