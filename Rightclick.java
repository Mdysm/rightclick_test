package com.sep30;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail")));
		ac.contextClick().perform();
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		ArrayList<String> brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		System.out.println("title: "+driver.getTitle());
		Thread.sleep(3000);
		//click on sign in
		driver.findElement(By.linkText("Sign in")).click();
		ArrayList<String> brw1= new ArrayList<String>(driver.getWindowHandles());
		//login to gmail
		driver.switchTo().window(brw1.get(1));
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("pranga2010");
		Thread.sleep(5000);
	
	driver.close();
	
	}

}
