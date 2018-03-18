package com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.service.FileService;

public class FileAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File file; //This is the variable name in the jsp
	private String fileContentType; // This <variablename>ContentType,<variablename>FileName is automatically set by the file-upload interceptor of struts -2
	private String fileFileName; // the file upload interceptor transforms the multipart/form-data into request parameters along with these metadata.
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		System.out.println("setting file");
		this.file = file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		System.out.println("setting content type"+fileContentType);
		this.fileContentType = fileContentType;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		System.out.println("setting file name"+fileFileName);
		this.fileFileName = fileFileName;
	}
	
	public String execute()
	{
		File uploadedFile = getFile();
		System.out.println("uplaoded file name "+uploadedFile.getAbsolutePath()+ " "+ uploadedFile.getName());
		if(uploadedFile.length() > 0){
		FileService f = new FileService();
		String result = f.uploadFile(uploadedFile,getFileFileName());
		if(result.equals("success"))
		setMessage(getText("upload.success"));
		return "success";
		}
		else {
			setMessage(getText("upload.failure"));
		}
			return "error";
	}

}
