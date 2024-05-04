package in.ashokit.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data 
public class User {
	private int Id;
	private String name;
	private String city;
	private String email;
	private String gender;
	private Date dob;
	private Long phoneNo;

}
