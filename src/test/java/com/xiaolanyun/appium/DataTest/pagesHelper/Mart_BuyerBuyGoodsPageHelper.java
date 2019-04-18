package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;

import com.xiaolanyun.appium.DataTest.pages.Mart_BuyerBuyGoodsPage;
/*
 * @author 24075
 * @classname:Mart_BuyerBuyGoodsPageHelper
 * @Description:
 */
public class Mart_BuyerBuyGoodsPageHelper {
	public static Logger logger = Logger.getLogger(Mart_BuyerBuyGoodsPageHelper.class);
	public static void clickBuy(AppiumUtil appiumUtil,By by){
		appiumUtil.click(by);
	}
	public static void inputPass(AppiumUtil appiumUtil,By by,String pass){
		appiumUtil.typeContent(by, pass);
	}

}
