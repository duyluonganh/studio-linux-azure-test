import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.util.OSUtil

System.setProperty(DriverFactory.CHROME_DRIVER_PATH_PROPERTY_KEY, DriverFactory.getChromeDriverPath());
ChromeOptions options = new ChromeOptions()
ChromeDriver driver = new ChromeDriver(options)

DriverFactory.changeWebDriver(driver)
WebUI.closeBrowser()

if (OSUtil.isUnix()) {
	'killall -9 chromedriver'.execute()
}