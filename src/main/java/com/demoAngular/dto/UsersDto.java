package com.demoAngular.dto;

import javax.validation.constraints.NotEmpty;

public class UsersDto {
	
    private Long usId;
    @NotEmpty(message = "{validate.loginName.notempty}")
    private String usLogin;
    @NotEmpty(message = "{validate.password.notempty}")
    private String usPassword;
    private Long usRol;
    @NotEmpty(message = "{validate.userName.notempty}")
	private String usName;
	private String usLastName;

	public Long getUsId() {
		return usId;
	}

	public void setUsId(Long usId) {
		this.usId = usId;
	}

	public String getUsLogin() {
		return usLogin;
	}

	public void setUsLogin(String usLogin) {
		this.usLogin = usLogin;
	}

	public String getUsPassword() {
		return usPassword;
	}

	public void setUsPassword(String usPassword) {
		this.usPassword = usPassword;
	}

	public Long getUsRol() {
		return usRol;
	}

	public void setUsRol(Long usRol) {
		this.usRol = usRol;
	}

	public String getUsName() {
		return usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public String getUsLastName() {
		return usLastName;
	}

	public void setUsLastName(String usLastName) {
		this.usLastName = usLastName;
	}

	@Override
	public String toString() {
		return "Users [usId=" + usId + ", usLogin=" + usLogin + ", usPassword=" + usPassword + ", usRol=" + usRol
				+ ", usName=" + usName + ", usLastName=" + usLastName + "]";
	}
	
}
