package xyz.devartisee.recommend.controller.dto.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationResponse<T> {

    List<T> list;
    Integer pageNo;
    Integer pageSize;
}
