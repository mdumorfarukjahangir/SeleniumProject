package TestCase;

import org.openqa.selenium.By;

public class PluginTopMenu extends Methods{
	
	public void isPluginLogoVisible() {
		driver.findElement(By.xpath("//div[contains(text(),'Fluent Support')]")).click();
		boolean a =  driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/div[1]/a[1]")).isDisplayed();
		if(a != true ) {
			System.out.println("Plugin Logo not visible : Failed");
		}
		else {
			System.out.println("Plugin Logo   visible : Passed");
		}
	}
	
	public void PluginMenu() {
		String pm =  driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]")).getText();
		
		
 		if(pm.contains("Dashboard") && pm.contains("Tickets") && pm.contains("Reports") && pm.contains("Customers") && pm.contains("Saved Replies") && pm.contains("Activities") && pm.contains("Business Settings") && pm.contains("Workflows") && pm.contains("Global Settings")){
 			System.out.println("Plugin top menu show properly -- Passed");
 		}else {
 		System.out.println("Plugin top menu don't show properly -- Failed");
 		}
	}
	
	public void isClickableMenu() {
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		String durl = driver.getCurrentUrl();
		if(durl.contains("page=fluent-support#/")) {
			System.out.println("Plugin topmenu -- Dashboard item work correctly : Passed");
		}
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[1]/li[2]")).click();
		String turl = driver.getCurrentUrl();
		if(turl.contains("page=fluent-support#/tickets")) {
			System.out.println("Plugin topmenu -- Ticket item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		String rurl = driver.getCurrentUrl();
		if(rurl.contains("fluent-support#/reports")) {
			System.out.println("Plugin topmenu -- Reports item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		String curl = driver.getCurrentUrl();
		if(curl.contains("page=fluent-support#/customers")) {
			System.out.println("Plugin topmenu -- Customers item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Saved Replies')]")).click();
		String surl = driver.getCurrentUrl();
		if(surl.contains("page=fluent-support#/saved-replies")) {
			System.out.println("Plugin topmenu -- Saved replies item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[2]/li[2]/a[1]")).click();
		String aurl = driver.getCurrentUrl();
		if(aurl.contains("page=fluent-support#/activity-logger")) {
			System.out.println("Plugin topmenu -- Activities item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[2]/li[3]")).click();
		String burl = driver.getCurrentUrl();
		if(burl.contains("page=fluent-support#/mailboxes")) {
			System.out.println("Plugin topmenu -- Business Setting item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[2]/li[4]")).click();
		String wurl = driver.getCurrentUrl();
		if(wurl.contains("page=fluent-support#/saved-replies")) {
			System.out.println("Plugin topmenu -- Workflows item work correctly : Passed");
		}
		
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[2]/li[5]")).click();
		String gurl = driver.getCurrentUrl();
		if(gurl.contains("page=fluent-support#/settings")) {
			System.out.println("Plugin topmenu -- Global Setting item work correctly : Passed");
		}
		
		
	}

	public static void main(String[] args) {
		
		PluginTopMenu ptm = new PluginTopMenu();
		ptm.launchBrowser();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ptm.Login("demo", "7BrTrZIHgfLo");
		ptm.isPluginLogoVisible();
		ptm.PluginMenu();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ptm.isClickableMenu();
		
		ptm.closeBrowser();
		 

	}

}
