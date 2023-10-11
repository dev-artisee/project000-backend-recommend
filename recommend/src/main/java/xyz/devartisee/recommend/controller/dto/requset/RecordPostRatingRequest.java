package xyz.devartisee.recommend.controller.dto.requset;

import lombok.Data;

@Data
public class RecordPostRatingRequest {

    String userId;
    String placeId;
    String rating;
}
