package xyz.devartisee.recommend.service.dto.exapi.getCategoryResponse;

import java.util.List;
import lombok.Data;

@Data
public class GetCategoryResponse {
	private List<DocumentsItem> documents;
	private Meta meta;
}