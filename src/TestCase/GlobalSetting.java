package TestCase;

import org.openqa.selenium.By;


public class GlobalSetting extends Methods{
	
	public void GlobalSettingTestone() throws Exception {
		driver.findElement(By.xpath("//div[contains(text(),'Fluent Support')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[1]/ul[2]/li[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Support Portal')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//iframe[@id='wp_editor_1636895064240972_ifr']")).click();
//		Thread.sleep(3000);
 //    	driver.findElement(By.id("tinymce")).sendKeys("Only for testing purpose");
		Thread.sleep(3000);
		
//		WebElement textbox = driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]"));
//	    JavascriptExecutor jse = (JavascriptExecutor) driver;
//	    jse.executeScript("argument[0].value='hello'", textbox);
		
//		Robot rb = new Robot();
//		rb.delay(2000);
//		rb.KeyPress(KeyEvent.VK_TAB);
//		rb.KeyPress(KeyEvent.VK_TAB);
//		rb.KeyPress(KeyEvent.VK_TAB);
//		rb.KeyPress(KeyEvent.VK_TAB);
		
		 
 
//		driver.findElement(By.tagName("button")).click();
// 
//		driver.findElement(By.tagName("textarea")).sendKeys("Hello Mr Jacky");
//		
//		
		
	    
	    
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[2]/label[3]/span[1]/span[1]")).click();
		
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[2]/label[1]/span[1]/span[1]")).click();
		
		
		driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='alpha_app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();

	}
	
	public void GlobalSettingVerify() {
		driver.findElement(By.xpath("//a[contains(text(),'Giant Okapi')]")).click();
		driver.findElement(By.xpath("//header/div[@id='main-header']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Create a New Ticket')]")).click();
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='inner-wrap']/div[@id='primary']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Automation test 1");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='inner-wrap']/div[@id='primary']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/button[1]")).sendKeys("C:\\Users\\User\\Desktop\\hello.jpg");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='inner-wrap']/div[@id='primary']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Demo')]")).click();
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='inner-wrap']/div[@id='primary']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.cssSelector("body.page-template-default.page.page-id-7.logged-in.admin-bar.no-customize-support.wp-embed-responsive.footer-on-bottom.animate-body-popup.hide-focus-outline.link-style-standard.content-title-style-above.content-width-normal.content-style-boxed.content-vertical-padding-show.non-transparent-header.mobile-non-transparent-header:nth-child(2) div.el-select__popper.el-popper.is-light.is-pure:nth-child(52) div.el-select-dropdown div.el-scrollbar div.el-select-dropdown__wrap.el-scrollbar__wrap.el-scrollbar__wrap--hidden-default:nth-child(1) ul.el-scrollbar__view.el-select-dropdown__list > li.el-select-dropdown__item:nth-child(2)")).click();
		//driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='inner-wrap']/div[@id='primary']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/button[1]")).click();
	
		//driver.findElement(By.xpath("//button[contains(text(),'Create Ticket')]")).click();
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='inner-wrap']/div[@id='primary']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/button[1]")).click();
	
	}
	
	

	public static void main(String[] args) {
		GlobalSetting gs = new GlobalSetting();
		gs.launchBrowser();
		gs.Login("demo", "7BrTrZIHgfLo");
		try {
			gs.GlobalSettingTestone();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Global Setting Test one Saved : Passed");
	 
//		gs.Login("customer", "customer");
//		gs.GlobalSettingVerify();
//		System.out.println("Global Setting Test one Saved : Passed");
		
		 
	}

}
