package com.Cucumber;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static String value;

//1.browser launch
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
		return driver;
	}

//2.get
	public static void get(String url) {
		driver.get(url);

	
	}
//	<!-- https://mvnrepository.com/artifact/junit/junit -->
//	<dependency>
//	<groupId>junit</groupId>
//	<artifactId>junit</artifactId>
//	<version>4.12</version>
//	<scope>test</scope>
//</dependency>
//3.close
	public static void close() {
		driver.close();
	}

//4.quit
	public static void quit() {
		driver.quit();
		
	}

//5.navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

//6.navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}

//7.navigate back
	public static void navigateBack() {
		driver.navigate().back();
	}

//8.navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

//9.alert
	Alert a = new Alert() {

		public String getText() {
			//System.out.println(driver.switchTo().alert().getText());
			String text=driver.switchTo().alert().getText();
			System.out.println(text);
			return null;
			
		}

		public void dismiss() {
			driver.switchTo().alert().dismiss();
		}

		public void accept() {
			driver.switchTo().alert().accept();
		}

		public void sendKeys(String keysToSend) {
			driver.switchTo().alert().sendKeys(keysToSend);
		}
	};

//10.actions
	public static void click(WebElement element, String method) {
		Actions act = new Actions(driver);
		if (method.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		} else if (method.equalsIgnoreCase("contextclick")) {
			act.contextClick(element).build().perform();
		} else if (method.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		}
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(source, target).build().perform();
	}

//11.scroll down and up
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		

	}

	public static void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -500);");

	}

//12.sendkeys
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

//13.click
	public static void click(WebElement element) {
		element.click();

	}

//14.radio button	
	public static void buttonRadio(WebElement element) {
		element.click();
	}

//15.checkbutton	
	public static void checkButton(WebElement element) {
		element.click();
	}

//16.is enable	
	public static void isEnable(WebElement element) {
		boolean b = element.isEnabled();
		System.out.println("element is enable-" + b);
	}

//17.is disable	
	public static void isDisable(WebElement element) {
		boolean b = element.isEnabled();
		System.out.println("element is disable-" + b);
	}

//18.is selected	
	public static void isSelected(WebElement element) {
	boolean	b = element.isSelected();
		System.out.println("element is selected-" + b);
	}

//19.get atribute
	public static void getAtribute(WebElement element, String name) {
		element.getAttribute(name);
		System.out.println("Attribute is " + name);
	}

//20.wait	implicit
	public static void waits(int num) {
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.NANOSECONDS);
    }
	
 //thread sleep
	public static void thread(int millis) throws Throwable {
Thread.sleep(millis);
	}
	

//21.frames	
	public static void framesIn(int index) {
		driver.switchTo().frame(index);

	}

	public static void framesout() {
		driver.switchTo().defaultContent();

	}

//22.screenshot
	public static void takeScreenshot(String folder) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sorce = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(folder);
		FileHandler.copy(sorce, destination);
	}

//23.dropdown select
	public static void dropDown(WebElement element, String method, String value) {
		Select s = new Select(element);
		if (method.equalsIgnoreCase("selectbyvalue")) {
			s.selectByValue(value);
		} else if (method.equalsIgnoreCase("selectbyindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (method.equalsIgnoreCase("selectbyvisibleText")) {
			s.selectByVisibleText(value);
		}
	}

//24.is muliple	
	public static void isMultipl(WebElement element, boolean check) {
		Select c = new Select(element);
		check = c.isMultiple();
		System.out.println("muliple dropdown" + check);
	}

//25.get options
	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		List<WebElement> option = s1.getOptions();
		for (int i = 0; i < option.size(); i++) {
			WebElement e= option.get(i);
			String s=e.getText();
			System.out.println("options are-" + s);
		}
	}

//26.get 1st option	    
	public static void getFirstOption(WebElement element, String option) {
		Select s2 = new Select(element);
		System.out.println(s2.getFirstSelectedOption());
	}

//27.getAll selected options	
	public static void getAllSelectedOptions(WebElement element) {
		Select s3 = new Select(element);
		List<WebElement> option = s3.getAllSelectedOptions();
		for (int i = 0; i < option.size(); i++) {
			WebElement e= option.get(i);
			String s=e.getText();
			System.out.println(s);
			
		}
		//for (WebElement each : option) {
			//String text = each.getText();
			//System.out.println("all selected option= " + text);}
	}

//28.get text	
	public static String getText(WebElement element) {
		System.out.println(element.getText());
		return value;
	}

//29.robot	
	public static void keys() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

//30.window handle		
	public static void windowHandle() {
		String url = driver.getWindowHandle();
		System.out.println("Title of the current window=" + url);
//31.get current url

	}

	public static void windowHandles(Set<String> allUrl) {
		allUrl = driver.getWindowHandles();
		for (String each : allUrl) {
			String title = driver.switchTo().window(each).getTitle();
// 32.get title
			System.out.println("the title of all windows-" + title);}}
	
	
		
		
//33.read data driven
//	public static String readExcelData(String pathname,int rownum,int cellnum) throws IOException {
//    File f= new File(pathname);
//     FileInputStream fis = new FileInputStream(f);
//    Workbook wb=new XSSFWorkbook(fis);
//    Sheet sheet = wb.getSheet("Sheet3");
//    Row row = sheet.getRow(rownum);
//    Cell cell = row.getCell(cellnum);
//    CellType cellType = cell.getCellType();
//    if (cellType.equals(CellType.STRING)) {
//    	 value = cell.getStringCellValue();
//          
//    }
//    else if (cellType.equals(CellType.NUMERIC)) {
//    	double numcellValue = cell.getNumericCellValue();
//    	int cellvalue=(int) numcellValue;
//		value=String.valueOf(cellvalue);	
//		}
//    wb.close();
//    return value;
    
		
	//}

}
