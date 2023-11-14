package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DocumentsItem{
	@JsonProperty
	private String place_url;
	@JsonProperty
	private String place_name;
	@JsonProperty
	private String road_address_name;
	@JsonProperty
	private String category_group_name;
	@JsonProperty
	private String category_name;
	@JsonProperty
	private String distance;
	@JsonProperty
	private String phone;
	@JsonProperty
	private String category_group_code;
	@JsonProperty
	private String x;
	@JsonProperty
	private String y;
	@JsonProperty
	private String address_name;
	@JsonProperty
	private String id;
}