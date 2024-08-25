package com.neotech.lesson40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Demo {

	public static void main(String[] args) throws IOException {

		// Step1: Create the path
		String fullPath = System.getProperty("user.dir") + "/test_data/Excel.xlsx";

		// Step2: Inputs
		FileInputStream fis = new FileInputStream(fullPath);

		// Step3: Read the whole excel file
		Workbook book = new XSSFWorkbook(fis);

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		
		// Step1: Get one specific sheet 
		Sheet sheet = book.getSheet("Sheet1");
		
		// Step2: Get the specific row (row=2)
		Row row2 = sheet.getRow(2);
		
		// Step3: Get the specific cell from the specific row (row=2, cell=1)
		Cell cell1 = row2.getCell(1);

		// Step4: Print the information of cell
		System.out.println(cell1.toString());
		
		System.out.println();
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */	
		
		// Find how many cell row have
		int cellNumber = sheet.getLastRowNum();
		System.out.println(cellNumber);
		
		System.out.println();
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */		
		
		// Get the rows data
		for(int i=0; i<cellNumber; i++) {
			String cellData = row2.getCell(i).toString();
			System.out.print(cellData + "\t");
		}
		
		System.out.println();
		System.out.println();
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		// Find out how many rows are in the sheet
		int rows = sheet.getPhysicalNumberOfRows();
		
		for(int row = 1; row < rows; row++) {
			
			for (int cell = 0; cell < cellNumber; cell++) {
				
			String cellInfo = sheet.getRow(row).getCell(cell).toString();
			System.out.print(cellInfo + "\t");
			}
		}

	}

}


// Note1: For reading a excel file --> apache poi <-- Google search 

// Note2: We should put the file name of the path in the --> Workbook x = new XSSFWorkbook(filepath);

/* Note3: While you are getting sheet from the book (excel)
			-> Write the code with "Sheet" 
			-> Use method ---> getSheet()
			-> Use index of the sheet (0) or get the name of the sheet("Sheet1") */

// Note4: When you are importing the Sheet import --> org.apache.poi.ss.usermodel.Sheet;

// Note5: While you are getting the row or column, you should specify the index of them. 

// Note6: For getting row use --> getRow() method & Row import 

// Note7: For getting cell use --> getCell() method & Cell import

// Note8: While you are printing the cell, use toString method to get the value as String even tho it is number

/* Note9: For knowing how many cells in a row use --> getLastCellNum() method
		  -> Since it will give as a number, use int */

// Note10: When you want to put space between words shortcut -->  "\t" <-- means tab

// Note11: While getting the number of rows with for loop, since we have index 0 already --> skip the index 0 

// Note12: Second for-loop for --> for each row iterate from cell 0 to last one







