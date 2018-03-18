package com;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;
import com.service.FileService;

public class MultipleFileAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File[] mfile; //This is the variable name in the jsp
	private String[] mfileContentType; // This <variablename>ContentType,<variablename>FileName is automatically set by the file-upload interceptor of struts -2
	private String[] mfileFileName; // the file upload interceptor transforms the multipart/form-data into request parameters along with these metadata.
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public File[] getMfile() {
		return mfile;
	}
	public void setMfile(File[] mfile) {
		this.mfile = mfile;
	}
	public String[] getMfileContentType() {
		return mfileContentType;
	}
	public void setMfileContentType(String[] mfileContentType) {
		this.mfileContentType = mfileContentType;
	}
	public String[] getMfileFileName() {
		return mfileFileName;
	}
	public void setMfileFileName(String[] mfileFileName) {
		this.mfileFileName = mfileFileName;
	}
	public String execute()
	{
		File[] uploadedFile = getMfile();
		//System.out.println("uplaoded file name "+uploadedFile.getAbsolutePath()+ " "+ uploadedFile.getName());
		String result = "";
		FileService f = new FileService();
		for(int i = 0;i<uploadedFile.length;i++){
			File file = uploadedFile[i];
		 result = f.uploadFile(file,getMfileFileName()[i]);
		}
		if(result.equals("success")){
		setMessage(getText("upload.success"));
		return "success";
		}
		else {
			setMessage(getText("upload.failure"));
		}
			return "error";
	}



}
