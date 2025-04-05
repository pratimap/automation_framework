package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author pratima
 */

public class ExcelUtility {
	
	/**
	 * getting string data from excel
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData");

	Workbook wb = WorkbookFactory.create(fis);
	
	return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
}
	
	public int getIntDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData");

	Workbook wb = WorkbookFactory.create(fis);
	
	return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getRowIndex();
}
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData");

	Workbook wb = WorkbookFactory.create(fis);
	
	return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	
}
	public LocalDateTime getLocalDateTimeDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData");

	Workbook wb = WorkbookFactory.create(fis);
	
	return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	
}
}
