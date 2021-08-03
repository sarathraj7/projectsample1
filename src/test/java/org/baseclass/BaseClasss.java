package org.baseclass;	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.OutputStream;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
import org.pojo.AdactinHotel;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClasss {

		public static WebDriver driver;
		
		public static Actions a;
		
		public static Robot r;
		
		public static JavascriptExecutor js;
		
		public static TakesScreenshot tk;
		
		public static Alert at;
		
		public static Select s;
		
		static String value;
		
		//1
		
		   public static void ChromeBrowserLaunch() {
			   WebDriverManager.chromedriver().setup();
		         driver=new ChromeDriver();

		       }
	        public static void Launchbrowser(String browser) {
	    	 if(browser.equals("chrome")) {
	    	 WebDriverManager.chromedriver().setup();
	         driver=new ChromeDriver();
	    	 }
	         else if (browser.equals("firefox")) {
		    	 WebDriverManager.firefoxdriver().setup();
		    	 driver=new FirefoxDriver();
              }  
	         else {
	        	 
		    	 WebDriverManager.edgedriver().setup();
		    	 driver=new EdgeDriver();
	         }
				
			}
		
		public static void LaunchUrl(String url) {
			driver.get(url);
	     }
		
		public static void toMaximize() {
	      driver.manage().window().maximize();
		}
		public static String toGetTitle() {
	       String title = driver.getTitle();
		  return title;
		}
		
	    public static String ToGetCurrentUrl() {
	      String currentUrl = driver.getCurrentUrl();
		  return currentUrl;
	      }
	    
		public static void toClose() {
	      driver.close();
		}
		
		public static void toQuit() {
	      driver.quit();
		}
		
		public static void toPassValue(WebElement element,String value) {
	       element.sendKeys(value);
		}
		
		public static void toClick(WebElement element) {
	      element.click();
		}
		
		public static void validpage(WebElement element) {
			Assert.assertTrue(element.isDisplayed());

		}
		public static void validpageforcombination() {
			Assert.assertTrue(ToGetCurrentUrl().contains("SearchHotel"));

		}
		
		public static void invalidpage(WebElement  h) {
			Assert.assertTrue(h.getText().contains("Invalid Login details"));

			
		}
		
		public static void impwait() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);

		}
		
		public static String toGetText(WebElement element) {
	      String text = element.getText();
	      return text;
		}
		
		public static String toGetAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
			}
		
	 	public static void toDragandDrop(WebElement drag,WebElement drop) {
	      a=new Actions(driver);
	      a.dragAndDrop(drag, drop).perform();
		}
	 	
		public static void toMoveToElement(WebElement element) {
	        a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		//14
		public static void toKeyUp(WebElement element,String value) {
			a=new Actions(driver);
	        a.keyDown(Keys.SHIFT).sendKeys(element,value).keyUp(Keys.SHIFT).perform();

		}
		public static void toDoubleClick(WebElement element) {
			a=new Actions(driver);
	        a.doubleClick().perform();
		}
		public static void toKeyPress(int keycode) throws AWTException {
	       r=new Robot();
	       r.keyPress(keycode);
	      }
	   public static void toKeyRelease(int keycode) throws AWTException {
		       r=new Robot();
		       r.keyRelease(keycode);
		      }
	   public static void javaScriptGetAttribute(WebDriver driver,WebElement element) {
           js=(JavascriptExecutor)driver;
	       String text= (String)js.executeScript("return arguments[0].getAttribute('value')", element);
	       System.out.println(text);
	   }
	   public static void javaScriptSendKeys(WebDriver driver,String passvalue,WebElement element) {
	        js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].seAttribute('value',"+passvalue+")",element);
		}
	   
		public static void javaScriptclick(WebDriver driver,WebElement arg1) {
	        js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", arg1);
		}
		//19
		public static void toPageUp(WebDriver driver,WebElement arg1) {
	        js=(JavascriptExecutor)driver;
	       js.executeScript("arguments[0].scrollIntoView(false)", arg1);
		}
		
	   public static void toPageDown(WebDriver driver,WebElement arg1) {
	           js=(JavascriptExecutor)driver;
	          js.executeScript("arguments[0].scrollIntoView(true)", arg1);
	       
	       }
		public static void toTakesScreenshot(String filename) throws IOException{
			tk=(TakesScreenshot)driver;
			File src=tk.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\sarath\\eclipse-workspace\\Maven\\Scrrenshots\\"+ filename +".png");
		    FileUtils.copyFile(src, des);
		}
		//21
		public static String toGetText() {
	    at=driver.switchTo().alert();
	    String a1 = at.getText();
	    System.out.println(a1);
	    return a1;
		}
		//22
		public static void toAccept() {
		    at=driver.switchTo().alert();
		    at.accept();
	}
	//23
		public static void toDismiss() {
		    at=driver.switchTo().alert();
		    at.dismiss();
	}
		//24
		public static String toSendKeys(WebElement element,String arg0) {
			element.click();
		    at=driver.switchTo().alert();
	        at.sendKeys(arg0);
	        return value;
		}
		//25
		public static void toUseFrame(String id) {
	      driver.switchTo().frame(id);
		}
		//26
		
		public static void toUseFrame1(String name,WebElement element) {
		      driver.switchTo().frame(name);
		      element.click();
		      
			}
		//27
		public static void toUseFrame2(WebElement arg0) {
		      driver.switchTo().frame(arg0);
			}
		//28
		public static void toUseFrame3(int index) {
		      driver.switchTo().frame(index);
			}
		//29
	  public static void toSelectByIndex(WebElement element,int index) {
	    s=new Select(element);
	    s.selectByIndex(index);
	}
	  //30
	  public static void toSelectByVisibleText(WebElement element,String value) {
		    s=new Select(element);
		    s.selectByVisibleText(value);
		}
	  
	  //31
	  
	  public static void toSelectByValue(WebElement element,String value) {
		    s=new Select(element);
		    s.selectByVisibleText(value);
	  
	}
	  //32
	  public static void toIsMuliple(WebElement element) {
		    s=new Select(element);
		    boolean multiple = s.isMultiple();
	        System.out.println(multiple);
	}
	  //33
	  
	  public static List<WebElement> toGetOptions(WebElement element){
		    s=new Select(element);
		    List<WebElement> options = s.getOptions();
	        return options;
	}
	  //34
	  public static List<WebElement> toGetAllSelectedOptions(WebElement element){
		    s=new Select(element);
		    List<WebElement> options = s.getOptions();
	        return options;
	  }
	   //35
	  public static List<WebElement> toGetFirstSelectedOptions(WebElement element){
		    s=new Select(element);
		    List<WebElement> options = s.getOptions();
	      return options;
	      
	      
	  }
	  //36
	 public static void toDeSelectByIndex(WebElement element,int index){
		    s=new Select(element);
		    s.deselectByIndex(index);
	}
	//37
	public static void toDeselectByVisibleText(WebElement element,String value){
		    s=new Select(element);
		    s.deselectByVisibleText(value);
	}
	 //38
	public static void toDeselectByValue(WebElement element,String value){
	    s=new Select(element);
	    s.deselectByValue(value);
	}
	//39
	public static void toDeselectAll(WebElement element,String value){
	    s=new Select(element);
	    s.deselectAll();
	}
	//40
	public static String windowHandle() {
	String ParentId = driver.getWindowHandle();
	System.out.println(ParentId);
	return ParentId;
	}
	//41
	public static Set<String> allWindowHandle() {
	 Set<String> list =driver.getWindowHandles();
	 System.out.println(list);
	 return list;
	}
//	 public static String excelRead(int rowNo,int cellNo) throws IOException {
//			//path of the file
//			 
//				File f=new File("C:\\Users\\sarath\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\Adactin.xlsx");
//
//			    //to read the excel file
//					FileInputStream input=new FileInputStream(f);
//					
//					//workbook
//					Workbook s= new XSSFWorkbook(input);
//					 
//					//to get a particular sheet from the workbook
//					Sheet l = s.getSheet("login");
//					
//			       //to get row
//					//Row r = l.getRow(rowNo);
//					
//					//to get cell
//					//Cell c =r.getCell(cellNo);
//													
//						Row r = l.getRow(rowNo);
//												
//							Cell c = r.getCell(cellNo);				
//							
//							int type = c.getCellType();
//							
//							if(type==1)
//							{
//								 value = c.getStringCellValue();
//								
//							}
//							else if(DateUtil.isCellInternalDateFormatted(c)){
//								Date dateCellValue = c.getDateCellValue();
//								SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
//								value = sdf.format(dateCellValue);
//								}
//							else {
//								double numericCellValue = c.getNumericCellValue();
//								long l1=(long)numericCellValue;
//								value = String.valueOf(l1);
//							}	           
//				
//					return value;
//				
//					
//		 }

//		  public static void toIterateAllvalue(String filename,String sheetName ) throws IOException {
//			  
//			     String value;
//				
//				File f=new File("C:\\Users\\sarath\\eclipse-workspace\\Maven\\\\src\\test\\resources\\ExcelSheet\\"+filename+".xlsx");
//				
//				//to read file
//				FileInputStream fs=new FileInputStream(f);
//				
//				Workbook wb=new XSSFWorkbook(fs);
//				
//				Sheet s = wb.getSheet(sheetName);
//				
//				for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
//					
//					Row r = s.getRow(i);
//					
//					for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
//						
//						Cell c = r.getCell(j);				
//						
//						//int type= c.getCellType();
//						
////						if(type==1)
////						{
////							 value = c.getStringCellValue();
////							
////						}
////						else if(DateUtil.isCellInternalDateFormatted(c)){
////							Date dateCellValue = c.getDateCellValue();
////							SimpleDateFormat sdf=new SimpleDateFormat("dd//MM/yy");
////							 value = sdf.format(dateCellValue);
////							}
////						else {
////							double numericCellValue = c.getNumericCellValue();
////							long l=(long)numericCellValue;
////							 value = String.valueOf(l);
////						}
////						System.out.println(value);
////					}
////					
////					}}
//		  public static String toIterateSingleValue(String filename,String sheetName,int i,int j,String value) throws IOException {
//			  
//				
//				File f=new File("C:\\Users\\sarath\\eclipse-workspace\\Maven\\ExcelSheet\\"+filename+".xlsx");
//				
//				//to read file
//				FileInputStream fs=new FileInputStream(f);
//				
//				Workbook wb=new XSSFWorkbook(fs);
//				
//				Sheet s = wb.getSheet(sheetName);
//							
//					Row r = s.getRow(i);
//									
//						Cell c = r.getCell(j);				
//						
//						int type = c.getCellType();
//						
//						if(type==1)
//						{
//							 value = c.getStringCellValue();
//							
//						}
//						else if(DateUtil.isCellInternalDateFormatted(c)){
//							Date dateCellValue = c.getDateCellValue();
//							SimpleDateFormat sdf=new SimpleDateFormat("dd//MM/yy");
//							 value = sdf.format(dateCellValue);
//							}
//						else {
//							double numericCellValue = c.getNumericCellValue();
//							long l=(long)numericCellValue;
//							 value = String.valueOf(l);
//						}
//						System.out.println(value);
//						return value;
//					}
		  
		          public static void toCreateExcel(String filename,String sheetName,int rowNo,int cellNo,String value) throws IOException {
		    	 
		    	 File f= new File("C:\\Users\\sarath\\eclipse-workspace\\Maven\\ExcelSheet\\"+filename+".xlsx");
		    	 
		    	 
		    	 //object instantiation
		    	 Workbook w= new XSSFWorkbook();
		    	 Sheet s = w.createSheet(sheetName);
		    	 Row r = s.createRow(rowNo);
		    	 Cell c = r.createCell(cellNo);
		    	 c.setCellValue(value);
		        	 
		    	 FileOutputStream output= new FileOutputStream(f);
		         w.write(output);
		    	 
		}
		 
		          public static void toUpdateExcel(String sheetName,int rowNo,int cellNo,String value1,String value2 ) throws IOException {
		        	  
		        	  File f= new File("C:\\Users\\sarath\\eclipse-workspace\\Maven\\ExcelSheet\\orderNo.xlsx");
		        	  
		        	  FileInputStream fi=new FileInputStream(f);
		        	  
		        	  Workbook w=new XSSFWorkbook(fi);
		        	  
		        	  Sheet s = w.getSheet(sheetName);
		        	  
		        	  Row r = s.getRow(rowNo);
		        	  
		        	  Cell c = r.getCell(cellNo);
		        		  
		              c.setCellValue(value2);
		     
		        	  FileOutputStream fo= new FileOutputStream(f);
		        	 
		        	  w.write(fo);
		        	  
		        	  

				}
		}

		 


	
	        	 