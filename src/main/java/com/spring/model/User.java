package com.spring.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
	public User(long userId, List<Subscriptions> subscriptions, String name, String email, boolean active, String password) {
		this.userId = userId;
		this.subscriptions = subscriptions;
		this.name = name;
		this.email = email;
		this.active = active;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "subscriptions_fid", referencedColumnName = "userId")
	List< Subscriptions > subscriptions = new ArrayList< >();


	public List<Subscriptions> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscriptions> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public User() {
	}

	@Column(name = "name")
	private String name;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "email")
	private String email;

	@Column(name = "active")
	private boolean active;

	@Column(name = "password")
	private String password;


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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		active = active;
	}

	public User(String name, String email, boolean active, String password, List<Subscriptions> subscriptions) {
		this.name = name;
		this.email = email;
		this.active = active;
		this.password = password;
		this.subscriptions = subscriptions;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
