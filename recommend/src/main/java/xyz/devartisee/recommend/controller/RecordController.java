package xyz.devartisee.recommend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.devartisee.recommend.controller.dto.base.BaseResponse;
import xyz.devartisee.recommend.controller.dto.base.PaginationResponse;
import xyz.devartisee.recommend.controller.dto.requset.PostPlaceRequest;
import xyz.devartisee.recommend.controller.dto.response.GetPlaceResponse;

import java.util.List;

@Tag(
        name = "기록",
        description = "기록 관련 API"
)
@RestController
@RequestMapping("/record")
@RequiredArgsConstructor
public class RecordController {

    @Operation(summary = "유저 그룹 장소(북마크) 조회", description = "")
    @GetMapping("/place")
    public ResponseEntity<BaseResponse> getPlace(@RequestParam String userId, @RequestParam Integer pageNo, @RequestParam Integer pageSize,
                                                 @RequestParam Boolean isDateAsc, @RequestParam String rating) {

        PaginationResponse<GetPlaceResponse> result = new PaginationResponse<>();
        result.setList(List.of(new GetPlaceResponse(), new GetPlaceResponse()));

        return ResponseEntity.ok(BaseResponse.of(200, "getPlace", result));
    }

    @Operation(summary = "유저 그룹 장소(북마크) 생성", description = "")
    @PostMapping("/place")
    public ResponseEntity<BaseResponse> postPlace(@RequestBody PostPlaceRequest request) {

        return ResponseEntity.ok(BaseResponse.of(200, "postPlace", null));
    }

    @Operation(summary = "유저 그룹 장소(북마크) 삭제", description = "")
    @DeleteMapping("/place")
    public ResponseEntity<BaseResponse> deletePlace(@RequestParam String userId, @RequestParam String placeId) {

        return ResponseEntity.ok(BaseResponse.of(200, "deletePlace", null));
    }
}
