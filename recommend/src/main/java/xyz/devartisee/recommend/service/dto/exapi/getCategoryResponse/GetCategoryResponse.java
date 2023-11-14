package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetCategoryResponse {
	@JsonProperty
	private List<DocumentsItem> documents;
	@JsonProperty
	private Meta meta;
}