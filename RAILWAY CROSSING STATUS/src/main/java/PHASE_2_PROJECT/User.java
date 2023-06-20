package PHASE_2_PROJECT;

import jakarta.annotation.*;
import jakarta.*;

@Entity
public class User
{
	@Id
	@Column(name="email")
	private String email;
	@Column(name="username")
	private String uname;
	@Column(name="password")
	private String password;
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
