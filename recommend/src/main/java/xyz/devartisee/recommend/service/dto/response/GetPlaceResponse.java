package xyz.devartisee.recommend.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetPlaceResponse {

    String addressName;
    String categoryName;
    String phone;
    String placeName;
    String placeUrl;
    String roadAddressName;
    String latitude;
    String longitude;

}

//{
//        "addressName”: "서울 구로구 구로동 810-3",
//        "categoryName": "교통,수송 > 지하철,전철 > 수도권2호선",
//        "phone": "02-6110-2321",
//        "placeName": "구로디지털단지역 2호선",
//        "placeUrl": "http://place.map.kakao.com/21160579",
//        "roadAddressName": "서울 구로구 도림천로 477",
//        ”latitude”: “1.1111”,
//        ”longitude”: “2.2222”
//        },