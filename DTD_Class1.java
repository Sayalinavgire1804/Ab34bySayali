package DTDFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DTD_Class1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\ExcelSheet\\Sayaliexcel.xlsx");
	Workbook wb=WorkbookFactory.create(fs);//
	Sheet s1=wb.getSheet("Login");
	Row r1=s1.getRow(1);
	Cell c1=r1.getCell(0);
	String uname=c1.getStringCellValue();
	System.out.println(uname);
	Row r2=s1.getRow(1);
	Cell c2=r2.getCell(1);
	//Cell c2=r2.getCell(10);

	String pw=c2.getStringCellValue();
	System.out.println(pw);
	String cname=wb.getSheet("Login").getRow(4).getCell(0).getStringCellValue();
	System.out.println(cname);
	String uname1=NumberToTextConverter.toText(wb.getSheet("Login").getRow(5).getCell(6).getNumericCellValue());
	System.out.println(uname1);
	}

}
