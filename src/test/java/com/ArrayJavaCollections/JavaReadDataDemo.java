package com.ArrayJavaCollections;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class JavaReadDataDemo {

	public static void main(String[] args) throws IOException {
		String filePath = ".\\data.xlsx";
		System.out.println("print filepath : " + filePath);

		FileInputStream f = new FileInputStream(filePath);
		Workbook book = WorkbookFactory.create(f);
		Sheet sh = book.getSheet("CrateUserUser");

		System.out.println("rows count : " + sh.getLastRowNum());

	int rows = sh.getLastRowNum();
	
	System.out.println("col count : "+ sh.getRow(0).getLastCellNum());
	
	
	int cols = sh.getRow(0).getLastCellNum();
	System.out.println(sh.getRow(1).getCell(2));
	
	
	Object[][] data = new Object[rows][cols];
	
	
	 data[0][0] = sh.getRow(1).getCell(0); data[0][1] = sh.getRow(1).getCell(1);
	 data[0][2] = sh.getRow(1).getCell(2); data[0][3] = sh.getRow(1).getCell(3);
	 
	
	
	for(int i=0; i<rows; i++ ) {
		for(int j =0; j<cols; j++) {
			data[i][j]	=  sh.getRow(i+1).getCell(j).toString();
			System.out.println(data[i][j]);
		}
	}
}
}
