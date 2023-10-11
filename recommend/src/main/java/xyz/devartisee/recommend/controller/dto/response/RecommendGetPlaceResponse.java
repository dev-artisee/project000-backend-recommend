package xyz.devartisee.recommend.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendGetPlaceResponse {

    String addressName;
    String categoryName;
    String phone;
    String placeName;
    String placeUrl;
    String roadAddressName;
    String latitude;
    String longitude;
}
