package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Meta{
	@JsonProperty
	private Integer totalCount;
	@JsonProperty
	private Boolean isEnd;
	@JsonProperty
	private Integer pageableCount;
	@JsonProperty
	private Object sameName;
}