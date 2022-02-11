import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.selenium.driver.CChromeDriver

System.setProperty(DriverFactory.CHROME_DRIVER_PATH_PROPERTY_KEY, DriverFactory.getChromeDriverPath());
CChromeDriver driver = new CChromeDriver(new DesiredCapabilities(), 0)
driver.get('katalon.com')

DriverFactory.changeWebDriver(driver)
WebUI.closeBrowser()
//
//if (OSUtil.isUnix()) {
//	'killall -9 chromedriver'.execute()
//	def list = 'ps -aux | grep -i  chromedriver'.execute()
//	println list.in.text	
//}