package com.utility.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestData {
	
	public static ArrayList<Object[]> excelsetup() {
		ArrayList<Object[]>mydata=new ArrayList<Object[]>();
		
	try {
	File src=new File("C:\\Users\\Sameer Dhumal\\eclipse-workspace\\AmazonTest\\src\\test\\resources\\ExcelTestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	fis.getFD();
	//FileOutputStream fos=new FileOutputStream(src);
	System.out.println("Reach that line....."+fis.getFD());
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	 XSSFSheet sheet=wb.getSheetAt(0);
	 //System.out.println("post Reach that line.....");
	 int rowcount=sheet.getLastRowNum();
	 System.out.println("Excel row count is:  "+rowcount);
	 for(int rownum=1;rownum<=rowcount;rownum++) {
			String yourName	=sheet.getRow(rownum).getCell(0).getStringCellValue();
			String mobile=sheet.getRow(rownum).getCell(1).getStringCellValue();
			String email=sheet.getRow(rownum).getCell(2).getStringCellValue();
			String pwd=sheet.getRow(rownum).getCell(3).getStringCellValue();
			System.out.println("post Reach that line.....");
			Object ob[]= {yourName,mobile,email,pwd};
			System.out.println(mydata.add(ob));
			}
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	return mydata;
}
	

	
}
