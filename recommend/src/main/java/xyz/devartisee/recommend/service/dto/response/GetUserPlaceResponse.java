package xyz.devartisee.recommend.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import xyz.devartisee.recommend.entity.UserPlace;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Builder
public class GetUserPlaceResponse {

    String addressName;
    String categoryName;
    String phone;
    String placeName;
    String placeUrl;
    String roadAddressName;
    String rating;
    LocalDateTime regDate;

}
