package duan.travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorizedDto {
	private Integer id;
	private Integer account_id;
	private Integer role_id;
}
