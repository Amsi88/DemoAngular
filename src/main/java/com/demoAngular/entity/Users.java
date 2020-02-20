package com.demoAngular.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
    private Long usId;
	
    @Column(name = "US_LOGIN")
    private String usLogin;
    
    @Column(name = "US_PASSWORD")
    private String usPassword;
    
    @Column(name = "US_ROL")
    private Long usRol;
    
    @Column(name = "US_NAME")
	private String usName;
    
    @Column(name = "US_LASTNAME")
	private String usLastName;

	public Users() {
		super();
	}

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
