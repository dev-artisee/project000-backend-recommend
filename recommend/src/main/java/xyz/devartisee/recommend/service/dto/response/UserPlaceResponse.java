package xyz.devartisee.recommend.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UserPlaceResponse {

    String addressName;
    String categoryName;
    String phone;
    String placeName;
    String placeUrl;
    String roadAddressName;
    String rating;
    String regDate;
}
