package TestCase;

import org.openqa.selenium.By;

public class GlobalSettingTag extends Methods{
	
	public void CreateTag() {
		driver.findElement(By.xpath("//div[contains(text(),'Fluent Support')]")).click();
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[2]/li[5]")).click();
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")).click();
		driver.findElement(By.xpath("//body/div[18]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[18]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Tag");
		driver.findElement(By.xpath("//body/div[14]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/textarea[1]")).sendKeys("Test Tag dec");
		driver.findElement(By.xpath("//body[1]/div[14]/div[1]/div[3]/span[1]/button[1]/span[1]")).click();
	
	}

	public static void main(String[] args) {
		 
		GlobalSettingTag gst = new GlobalSettingTag();
		gst.launchBrowser();
		gst.Login("demo", "7BrTrZIHgfLo");
		gst.CreateTag();
		

	}

}
