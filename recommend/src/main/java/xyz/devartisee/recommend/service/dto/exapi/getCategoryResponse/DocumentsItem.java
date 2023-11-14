package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DocumentsItem{
	@JsonProperty
	private String placeUrl;
	@JsonProperty
	private String placeName;
	@JsonProperty
	private String roadAddressName;
	@JsonProperty
	private String categoryGroupName;
	@JsonProperty
	private String categoryName;
	@JsonProperty
	private String distance;
	@JsonProperty
	private String phone;
	@JsonProperty
	private String categoryGroupCode;
	@JsonProperty
	private String x;
	@JsonProperty
	private String y;
	@JsonProperty
	private String addressName;
	@JsonProperty
	private String id;
}