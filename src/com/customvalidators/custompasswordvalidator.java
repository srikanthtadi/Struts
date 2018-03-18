package com.customvalidators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class custompasswordvalidator extends FieldValidatorSupport{
	static Pattern digitPattern = Pattern.compile( "[0-9]");
	static Pattern letterPattern = Pattern.compile( "[a-zA-Z]");
	static Pattern specialCharsDefaultPattern = Pattern.compile( "!@#$");
	private String specialChars ; // this is the param to be defined in the action-validtaion.xml file for the validator name sepcified in validator.xml file . In this case this is a non mandatory param.
	public String getSpecialChars() {
		return specialChars;
	}
	public void setSpecialChars(String specialChars) {
		this.specialChars = specialChars;
	}
	public void validate(Object object) throws ValidationException {
		// TODO Auto-generated method stub
		String fieldName = getFieldName(); //getting the feild name which is defined in the action-validation.xml file for which this validation is to be performed. In this case this validation is perfomed for password in index.jsp
		System.out.println("field name in validator"+fieldName);
		String fieldValue = (String) getFieldValue(fieldName, object); // getting the feild value
		fieldValue = fieldValue.trim();
		Matcher digitMatcher = digitPattern.matcher(fieldValue);
		Matcher letterMatcher = letterPattern.matcher(fieldValue);
		Matcher specialCharacterMatcher;
		if(getSpecialChars()!=null)
		{
			Pattern specialcharpattern = Pattern.compile("["+getSpecialChars()+"]");
			specialCharacterMatcher = specialcharpattern.matcher(fieldValue);
		}
		else
			specialCharacterMatcher = specialCharsDefaultPattern.matcher(fieldValue);
		
		if ( !digitMatcher.find() ) {
			addFieldError( fieldName, object );
			}else if ( !letterMatcher.find() ) {
			addFieldError( fieldName, object );
			}else if ( !specialCharacterMatcher.find() ) {
			addFieldError( fieldName, object );
			}
	}

}
