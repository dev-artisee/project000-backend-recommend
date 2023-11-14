package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Meta{
	@JsonProperty
	private Integer total_count;
	@JsonProperty
	private Boolean is_end;
	@JsonProperty
	private Integer pageable_count;
	@JsonProperty
	private Object same_name;
}