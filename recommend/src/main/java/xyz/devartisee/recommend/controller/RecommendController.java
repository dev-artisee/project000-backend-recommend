package xyz.devartisee.recommend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.devartisee.recommend.controller.dto.base.BaseResponse;
import xyz.devartisee.recommend.controller.dto.base.PaginationResponse;
import xyz.devartisee.recommend.controller.dto.requset.RecommendPatchAddressRequest;
import xyz.devartisee.recommend.controller.dto.requset.RecommendPostAddressRequest;
import xyz.devartisee.recommend.controller.dto.response.RecommendGetAddressResponse;
import xyz.devartisee.recommend.controller.dto.response.RecommendGetPlaceResponse;
import xyz.devartisee.recommend.controller.dto.response.RecordGetPlaceResponse;
import xyz.devartisee.recommend.service.MapService;
import xyz.devartisee.recommend.service.dto.request.GetPlaceRequest;

import java.util.ArrayList;
import java.util.List;

@Tag(
        name = "추천",
        description = "추천 관련 API"
)
@RestController
@RequestMapping("/recommend")
@RequiredArgsConstructor
public class RecommendController {

    @Autowired
    private MapService mapService;


    @Operation(summary = "주소 조회", description = "회원 아이디로 주소 조회하여 주소에 대한 배열 반환")
    @GetMapping("/address")
    public ResponseEntity<BaseResponse> getAddress(@RequestParam String userId) {

        return ResponseEntity.ok(BaseResponse.of(200, "getAddress", List.of(
                new RecommendGetAddressResponse(),
                new RecommendGetAddressResponse()
        )));
    }

    @Operation(summary = "주소 생성", description = "")
    @PostMapping("/address")
    public ResponseEntity<BaseResponse> postAddress(@RequestBody RecommendPostAddressRequest request) {

        return ResponseEntity.ok(BaseResponse.of(200, "postAddress", null));
    }

    @Operation(summary = "주소 수정", description = "")
    @PatchMapping("/address")
    public ResponseEntity<BaseResponse> patchAddress(@RequestBody RecommendPatchAddressRequest request) {

        return ResponseEntity.ok(BaseResponse.of(200, "patchAddress", null));
    }

    @Operation(summary = "주소 삭제", description = "")
    @DeleteMapping("/address")
    public ResponseEntity<BaseResponse> deleteAddress(@RequestParam String userId, @RequestParam String addressId) {

        return ResponseEntity.ok(BaseResponse.of(200, "deleteAddress", null));
    }

    @Operation(summary = "위치 기반 음식점 리스트 조회", description = "")
    @GetMapping("/place")
    public ResponseEntity<BaseResponse> getRecommendPlace(@RequestParam String latitude, @RequestParam String longitude,
                                                 @RequestParam String radius, @RequestParam String category) {

        mapService.getPlaceList(new GetPlaceRequest(latitude, longitude, radius, category));

        List<RecommendGetPlaceResponse> result = new ArrayList<>();
        result.add(new RecommendGetPlaceResponse());
        result.add(new RecommendGetPlaceResponse());

        return ResponseEntity.ok(BaseResponse.of(200, "getPlace", result));
    }

}
