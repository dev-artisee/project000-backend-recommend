package xyz.devartisee.recommend.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UserPlaceRequest {

    // post
    String userId;
    String placeId;

    // get
    // userId
    int pageNo;
    int pageSize;
    boolean isSortByDateAsc;
    String rating;

}
