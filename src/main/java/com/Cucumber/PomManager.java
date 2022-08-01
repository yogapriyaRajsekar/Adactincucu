package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PomManager {
	
	public static WebDriver driver;
	
	private FirstPageAdatin fp;
	private SecondPageAdatin sp;
	private ThirdPageAdatin tp;
	private ForthPageAdatin ap;
	private FifthPageAdatin bp;
	
	

	public PomManager(WebDriver driver2) {
		PomManager.driver=driver2;
		PageFactory.initElements(driver, this);
		}

	public FirstPageAdatin getInstanceFp() {
		fp = new FirstPageAdatin(driver);
		return fp;
	}
	public SecondPageAdatin getInstanceSp() {
		sp = new SecondPageAdatin(driver);
		return sp;
	}
	public ThirdPageAdatin getInstanceTp() {
		tp=new ThirdPageAdatin(driver);
		return tp;
	}
	public ForthPageAdatin getInstanceAp() {
		ap=new ForthPageAdatin(driver);
		return ap;
	}
	public FifthPageAdatin getInstanceBp() {
		bp= new FifthPageAdatin(driver);
		return bp;
	}

	
	

}
