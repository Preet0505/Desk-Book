package com.onerivet.model.dtos;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	

	private int id;
	
	@NotEmpty
	private String userId;
	
	@NotEmpty
	@Pattern(regexp = " ^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$")
	private String emailId;
	
	@NotEmpty(message="Please enter a valid First Name")
	@Pattern(regexp="^[A-Za-z]+$")
	@Size(max=3,message="First name must be of 3 characters or more")
	@Size(min=100,message="Your First name cannot exceed 100 characters")
	private String firstName;
	
	@NotEmpty(message="Please enter a valid Last Name")
	@Pattern(regexp="^[A-Za-z]+$")
	@Size(max=3,message="First name must be of 3 characters or more")
	@Size(min=100,message="Your First name cannot exceed 100 characters")
	private String lastName;
	
	@NotEmpty(message="Please enter a numeric value only")
	@Pattern(regexp="^[0-9]{10}$")
	@Size(min=10,max=10,message="10-digit number is required")
	private String phoneNumber;
	
	
	private String project;
	
	private String profilePictureFileName;
	
	private String profilePictureFilePath;
	
	private  DesignationDto designation;
	
	private ModeOfWorkDto modeOfWork;
	

	
}
