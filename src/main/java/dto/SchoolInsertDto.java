package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "school")
public class SchoolInsertDto {
	
	@Id
	private String username;
	private String password;
	private String schoolname;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	@Override
	public String toString() {
		return "SchoolInsertDto [username=" + username + ", password=" + password + ", schoolname=" + schoolname + "]";
	}
	
}
