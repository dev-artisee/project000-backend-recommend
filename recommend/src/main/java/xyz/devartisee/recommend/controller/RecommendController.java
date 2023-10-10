package xyz.devartisee.recommend.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.devartisee.recommend.controller.dto.base.BaseResponse;
import xyz.devartisee.recommend.controller.dto.requset.PatchAddressRequest;
import xyz.devartisee.recommend.controller.dto.requset.PostAddressRequest;
import xyz.devartisee.recommend.controller.dto.response.GetAddressResponse;

import java.util.List;

@Tag(
        name = "추천",
        description = "추천 관련 API"
)
@RestController
@RequestMapping("/recommend")
@RequiredArgsConstructor
public class RecommendController {

    @Operation(summary = "주소 조회", description = "회원 아이디로 주소 조회하여 주소에 대한 배열 반환")
    @GetMapping("/address")
    public ResponseEntity<BaseResponse> getAddress(@RequestParam String userId) {

        return ResponseEntity.ok(BaseResponse.of(200, "getAddress", List.of(
                new GetAddressResponse(),
                new GetAddressResponse()
        )));
    }

    @Operation(summary = "주소 생성", description = "")
    @PostMapping("/address")
    public ResponseEntity<BaseResponse> postAddress(@RequestBody PostAddressRequest request) {

        return ResponseEntity.ok(BaseResponse.of(200, "postAddress", null));
    }

    @Operation(summary = "주소 수정", description = "")
    @PatchMapping("/address")
    public ResponseEntity<BaseResponse> patchAddress(@RequestBody PatchAddressRequest request) {

        return ResponseEntity.ok(BaseResponse.of(200, "patchAddress", null));
    }

    @Operation(summary = "주소 삭제", description = "")
    @DeleteMapping("/address")
    public ResponseEntity<BaseResponse> deleteAddress(@RequestParam String userId, @RequestParam String addressId) {

        return ResponseEntity.ok(BaseResponse.of(200, "deleteAddress", null));
    }

}
