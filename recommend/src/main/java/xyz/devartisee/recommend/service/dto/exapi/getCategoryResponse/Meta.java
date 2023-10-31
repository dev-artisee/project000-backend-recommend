package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import lombok.Data;

@Data
public class Meta{
	private Integer totalCount;
	private Boolean isEnd;
	private Integer pageableCount;
	private Object sameName;
}