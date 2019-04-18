package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_BuyerSellerNavigationPage;;
/*
 * @author 24075
 * @classname:Mart_BuyerOrdersPageHelp
 * @Description:
 */
public class Mart_BuyerSellerNavigationPageHelper {
	public static Logger logger = Logger.getLogger(Mart_BuyerSellerNavigationPageHelper.class);
	public static void clickNavigation(AppiumUtil appiumUtil,By by){
		logger.info("点击"+appiumUtil.getText(by));
		appiumUtil.click(by);
	}
	//返回
	public static void Back(AppiumUtil appiumUtil){
		appiumUtil.comeBack();
	}
	//重新打开app
	public static void startApp(AppiumUtil appiumUtil,String appPackage,String appActivity){
		appiumUtil.startActivity(appPackage, appActivity);
	}

}
