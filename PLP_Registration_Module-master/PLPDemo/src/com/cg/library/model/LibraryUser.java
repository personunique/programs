package com.cg.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="userinfo")
public class LibraryUser
{
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="userid_sequence", allocationSize=1)
    @Id
    @Column(name="userId")
	private int userId;
	
	@Column(name="username")
	@NotEmpty(message="Please enter username")
	@Pattern(regexp="[a-zA-Z,0-9]{4,10}",message="Username must contain minimum 4 maximum 10 characters")
	private String username;
	
	@Column(name="passwrd")
	@NotEmpty(message="Please enter password")
	@Pattern(regexp="[a-zA-Z,0-9]{8,16}",message="Password must contain minimum 8 maximum 16 characters")
	private String passwrd;
	
	@Column(name="email")
	@Pattern(regexp="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$", message="Please enter valid Email") 
	@NotEmpty(message="Please enter your Email ID")
	private String email;
	
	@Column(name="librarian")
	@NotEmpty(message="Please choose appropriate field")
	private String librarian;
	
	@Column(name="qustn")
	@NotEmpty(message="please enter your answer")
	private String qustn;
	
	
	
	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPasswrd() {
		return passwrd;
	}



	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLibrarian() {
		return librarian;
	}



	public void setLibrarian(String librarian) {
		this.librarian = librarian;
	}



	public String getQustn() {
		return qustn;
	}



	public void setQustn(String qustn) {
		this.qustn = qustn;
	}



	@Override
	public String toString() {
		return "LibraryUser [userId=" + userId + ", username=" + username
				+ ", passwrd=" + passwrd + ", email=" + email + ", librarian="
				+ librarian + ", qustn=" + qustn + "]";
	}



	public LibraryUser() 
	{
		
	}
	
	
	
	
	
}
