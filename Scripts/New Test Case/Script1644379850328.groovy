import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory2
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.selenium.driver.CChromeDriver

DriverFactory2.openWebDriver()

DriverFactory.changeWebDriver(DriverFactory2.getWebDriver())
//WebUI.navigateToUrl('katalon.com')
WebUI.closeBrowser()
//
//if (OSUtil.isUnix()) {
//	'killall -9 chromedriver'.execute()
//	def list = 'ps -aux | grep -i  chromedriver'.execute()
//	println list.in.text	
//}