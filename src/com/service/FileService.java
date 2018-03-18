package com.service;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;

public class FileService {

	public String uploadFile(File file,String name)
	{
		
		String path=getPath()+File.separator;
		File destpath = new File(path+name);
		if(!destpath.exists())
		{
			destpath.mkdir();
		}
		try {
			FileUtils.copyFile(file,destpath);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	private String getPath()
	{
		System.out.println("in get path");
		Timestamp t = new Timestamp(new Date().getTime());
		String temp = t.toString();
		System.out.println(temp);
		temp = temp.replaceAll(" ", "").replaceAll(":", "").replaceAll("-", "").replace(".", "");//;
		System.out.println(temp);
		return File.separator+"Temporary"+File.separator+temp;
	}
	public static void main(String[] args)
	{
		System.out.println("in main");
		FileService a = new FileService();
		System.out.println(a.getPath());
	}
}
