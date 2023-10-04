package DTDFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DTDGetuid {
	FileInputStream fs;
	public Workbook wb;
	String uname;
	  DTDGetuid(String uname) throws EncryptedDocumentException, IOException
	{
		
		this.uname=uname;
		fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\ExcelSheet\\Sayaliexcel.xlsx");
	    wb=WorkbookFactory.create(fs);
	     uname=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		
		FileInputStream fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\ExcelSheet\\Sayaliexcel.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
	String uid=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	String pw=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
System.out.println(uid);
System.out.println(pw);

	}

}
