package io.devhub.bts.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Document
public class Login {

    @Id
    @NotNull
	private String userId;
    @NotNull
	private String password;
    @NotNull
	private String name;
	@Email
	private String email;
	@Digits(fraction = 0, integer = 10)
	private String phone;
	@NotNull
	private String type;
	
	public Login() {
		super();
		
	}
	
	public Login(String userId, String name, String password, String email, String phone, String type) {
		super();
        this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
        this.phone = phone;
        this.type = type;
	}

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
