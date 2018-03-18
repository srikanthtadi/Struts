package com.model;

import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.ValidationParameter;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

@Validations
public class UserModel {
private String dob;
private String sex;
private String contactNo;
private String firstName;
private String password;
@RequiredStringValidator(fieldName="password",key="error.required",trim=true,type=ValidatorType.FIELD)
@CustomValidator(fieldName="password",type="custompasswordvalidation",message="Your password must contain one letter, one number, and one of the following \"${specialChars}\"",parameters={@ValidationParameter(name="specialChars",value="$!@#?")})
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}


}
