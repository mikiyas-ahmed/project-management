package com.miki.pma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_accounts")
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="user_accounts_seq")
	@SequenceGenerator(name = "user_accounts_seq", allocationSize = 1)
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "username")
	private String username;
	
	private String email;
	
	private String password;
	
	private boolean enabled = true;

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public UserAccount() {
		
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isenabled() {
		return enabled;
	}

	public void setenabled(boolean eenabled) {
		this.enabled = eenabled;
	}
}
