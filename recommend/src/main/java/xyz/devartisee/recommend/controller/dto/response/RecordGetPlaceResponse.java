package xyz.devartisee.recommend.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordGetPlaceResponse {

    String addressName;
    String categoryName;
    String phone;
    String placeName;
    String placeUrl;
    String roadAddressName;
    String rating;
    String regDate;
}
