package duan.travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	private Integer id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String avatar;
	
}
