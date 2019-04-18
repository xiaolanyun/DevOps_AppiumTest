package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_BuyerFruitPage;
/*
 * @author 24075
 * @classname:Mart_BuyerFruitPageHelper
 * @Description:本类是对买家水果界面操作方法封装
 */
public class Mart_BuyerFruitPageHelper {
	public static Logger logger = Logger.getLogger(Mart_BuyerFruitPageHelper.class);
	public static void clickFruit(AppiumUtil appiumUtil,By by){
		logger.info("点击"+appiumUtil.getText(by));
		appiumUtil.click(by);
	}

}
