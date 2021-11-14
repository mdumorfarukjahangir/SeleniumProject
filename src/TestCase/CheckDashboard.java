package TestCase;

import org.openqa.selenium.By;

public class CheckDashboard extends Methods {
	public void CheckAdminLocation(String testcase) {
	 
		String title = driver.getTitle();
		if(title.contains("Dashboard")) {
			System.out.println(testcase + ": Mr Admin - Your are in the rigth place -- Passed");
		}else {
			System.out.println(testcase + ": Mr Admin - Your are in the wrong  place -- Failed");
		}
	}
	
	public void CheckPlugin() {
		driver.findElement(By.xpath("//div[contains(text(),'Plugins')]")).click();
	  
		if(driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/form[2]/table[1]")).getText().contains("Fluent Support Pro")){
			System.out.println("Plugin Installed"); 
			 
		}else {
			System.out.println("Plugin not Installed");
		}
	}
	
 

	public static void main(String[] args) {
		CheckDashboard cd = new CheckDashboard();
		cd.launchBrowser();
		cd.Login("demo", "7BrTrZIHgfLo");
		cd.CheckAdminLocation("Right Test Case");
		cd.closeBrowser();
		
		
		cd.launchBrowser();
		cd.Login("demo1", "7BrTrZIHgfLo");
		cd.CheckAdminLocation("Wrong Test Case");
		cd.closeBrowser();
		
		
		cd.launchBrowser();
		cd.Login("demo", "7BrTrZIHgfLo");
		cd.CheckPlugin();
		cd.closeBrowser();
		
		

		
	}

}
