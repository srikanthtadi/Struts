package com;

import com.model.UserModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class Action  extends ActionSupport implements ModelDriven<UserModel>{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private UserModel user;
private String name;
private int age;
private int salary;
public UserModel getUser() {
	return user;
}
public void setUser(UserModel user) {
	this.user = user;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setting name");
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void validate()
{
	/* Validate method is used for custom validations, how ever struts 2 provides a wide range of inbuilt validators. Below are the list.
	 * requiredstring
	 * stringlength
	 * email
	 * date
	 * int
	 * double
	 * url
	 * regex. These above validators are defined in xml, where the name of the xml must be <ActionClassName>-validations.xml */
	if(this.getSalary() < 100000 )
		addFieldError("salary", "salary must be greater than 1lakh");
}
public String execute()
{
	System.out.println("in execute");
	if(getName().equals("") || getName() == null || getSalary() == 0 || getAge() == 0)
	return "error";
	else
		return "success";
	
}
@Override
public UserModel getModel() {
	// TODO Auto-generated method stub
	user = new UserModel();
	/* get model is over ridden function as this aciton calss implents Model driven interface.
	 * struts 2 by default has modeldriven interceptor 
	 * The modelDriven interceptor makes other model object as the default object of valuestack.
    By default, action object is the default object of valuestack.*/
	return user;
}
public String setBundle()
{
	/* this method is set in the struts.xml file for default action
	 * when the server is started, this method is called which returns result as success so that index.jsp is loaded
	 * hence using the proerties set in aciton.properties file
	 * Note: if the properties that are set in action class are to be used then the global properties entry in struts.properties file should not be present.*/
	return "success";
}
// the above method is not used. because this implements the validation, the home page is coming with validation. the this entry is struts.xml is changed
}
