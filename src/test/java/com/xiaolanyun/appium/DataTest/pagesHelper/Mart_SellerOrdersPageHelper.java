package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_SellerOrdersPage;; 
/*
 * @author 24075
 * @classname:Mart_SellerOrdersPageHelper
 * @Description:
 */
public class Mart_SellerOrdersPageHelper {
	public static Logger logger = Logger.getLogger(Mart_SellerOrdersPageHelper.class);
	//发货
	public static void clickSend(AppiumUtil appiumUtil){
		appiumUtil.click(Mart_SellerOrdersPage.MSOP_BUTTON_SEND);
	}
}
