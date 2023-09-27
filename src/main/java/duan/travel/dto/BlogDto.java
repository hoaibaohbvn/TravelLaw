package duan.travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogDto {
	private Integer id;
	private Integer category_id;
	private String title;
	private String image;
	private String description;
	private Integer stutus;
	private String create_date;
}
