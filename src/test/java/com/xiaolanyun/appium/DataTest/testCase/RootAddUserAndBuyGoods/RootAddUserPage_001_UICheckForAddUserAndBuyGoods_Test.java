package com.xiaolanyun.appium.DataTest.testCase.RootAddUserAndBuyGoods;
import org.testng.annotations.Test;

import com.xiaolanyun.appium.DataTest.base.BasePrepare;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_BuyerBuyGoodsPage;
import com.xiaolanyun.appium.DataTest.pages.Mart_BuyerFruitPage;
import com.xiaolanyun.appium.DataTest.pages.Mart_BuyerSellerNavigationPage;
import com.xiaolanyun.appium.DataTest.pages.Mart_LoginPage;
import com.xiaolanyun.appium.DataTest.pages.Mart_RootManagePage;
import com.xiaolanyun.appium.DataTest.pages.Mart_RootNavigationPage;
import com.xiaolanyun.appium.DataTest.pages.Mart_SellerOrdersPage;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_BuyerBuyGoodsPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_BuyerFruitPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_BuyerSellerNavigationPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_LoginPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_RootManagePageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_RootNavigationPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_SellerOrdersPageHelper;
/*
 * @author 24075
 * @classname:RootAddUser_Test
 * @Description:本测试用例用于添加买家卖家账户，并进行登陆，购买商品，卖家进行发货
 */
public class RootAddUserPage_001_UICheckForAddUserAndBuyGoods_Test extends BasePrepare{
	@Test
	public void rootAddUser(){
		//登录管理员账户
		Mart_LoginPageHelper.clickForBuyerSellerLogin(appiumUtil, Mart_LoginPage.MLP_TEXT_USER, "root", Mart_LoginPage.MLP_TEXT_PASSWORD, "123456", Mart_LoginPage.MLP_BUTTON_ROOT, Mart_LoginPage.MLP_BUTTON_LOGIN);
		//切换到添加用户界面
		Mart_RootNavigationPageHelper.clickRootNavigation(appiumUtil, Mart_RootNavigationPage.MRNP_BUTTON_TABADDUSER);
		//输入卖家用户名
		Mart_RootManagePageHelper.inputAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_TEXT_USER, "卖1");
		//输入密码
		Mart_RootManagePageHelper.inputAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_TEXT_PASSWORD1, "123456");
		Mart_RootManagePageHelper.inputAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_TEXT_PASSWORD2, "123456");
		//选择商家按钮
		Mart_RootManagePageHelper.clickAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_BUTTON_ADDSELLER);
		appiumUtil.pause(2);
		//点击增加卖家按钮
		Mart_RootManagePageHelper.clickAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_BUTTON_ADDUSER);
		
		//自动返回登陆页面，再次登陆管理员账户，添加买家1
		appiumUtil.pause(2);
		Mart_LoginPageHelper.clickForBuyerSellerLogin(appiumUtil, Mart_LoginPage.MLP_TEXT_USER, "root", Mart_LoginPage.MLP_TEXT_PASSWORD, "123456", Mart_LoginPage.MLP_BUTTON_ROOT, Mart_LoginPage.MLP_BUTTON_LOGIN);
		//切换到添加用户界面
		Mart_RootNavigationPageHelper.clickRootNavigation(appiumUtil, Mart_RootNavigationPage.MRNP_BUTTON_TABADDUSER);
		//输入买家用户名
		Mart_RootManagePageHelper.inputAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_TEXT_USER, "买1");
		//输入密码
		Mart_RootManagePageHelper.inputAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_TEXT_PASSWORD1, "123456");
		Mart_RootManagePageHelper.inputAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_TEXT_PASSWORD2, "123456");
		//选择客户按钮
		Mart_RootManagePageHelper.clickAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_BUTTON_ADDBUYER);
		appiumUtil.pause(2);
		//点击增加买家按钮
		Mart_RootManagePageHelper.clickAddUserInfo(appiumUtil, Mart_RootManagePage.MRMP_BUTTON_ADDUSER);
		
		
		//登录买家界面，点击高山苹果进行购买
		Mart_LoginPageHelper.clickForBuyerSellerLogin(appiumUtil, Mart_LoginPage.MLP_TEXT_USER, "买1", Mart_LoginPage.MLP_TEXT_PASSWORD, "123456", Mart_LoginPage.MLP_BUTTON_BUYER, Mart_LoginPage.MLP_BUTTON_LOGIN);
		//点击高山苹果
		Mart_BuyerFruitPageHelper.clickFruit(appiumUtil, Mart_BuyerFruitPage.MBFP_BUTTON_PINGGUO);
		//点击购买以及验证身份
		Mart_BuyerBuyGoodsPageHelper.clickBuy(appiumUtil, Mart_BuyerBuyGoodsPage.MBBGP_BUTTON_BUY);
		Mart_BuyerBuyGoodsPageHelper.inputPass(appiumUtil, Mart_BuyerBuyGoodsPage.MBBGP_BUTTON_BUYPASSWORD, "123456");
		Mart_BuyerBuyGoodsPageHelper.clickBuy(appiumUtil, Mart_BuyerBuyGoodsPage.MBBGP_BUTTON_BUYON);
		//退回两次退出app
		Mart_BuyerSellerNavigationPageHelper.Back(appiumUtil);
		Mart_BuyerSellerNavigationPageHelper.Back(appiumUtil);
		
		//重新打开app登录卖家账户发货
		Mart_BuyerSellerNavigationPageHelper.startApp(appiumUtil, "com.example.xiaolanyun.ldmart", "com.example.xiaolanyun.mart.ui.SplashActivity");
		Mart_LoginPageHelper.clickForBuyerSellerLogin(appiumUtil, Mart_LoginPage.MLP_TEXT_USER, "卖1", Mart_LoginPage.MLP_TEXT_PASSWORD, "123456", Mart_LoginPage.MLP_BUTTON_SELLER, Mart_LoginPage.MLP_BUTTON_LOGIN);
		//切换到订单页面
		Mart_BuyerSellerNavigationPageHelper.clickNavigation(appiumUtil, Mart_BuyerSellerNavigationPage.MSNP_BUTTON_BUYERSELLERORDERS);
		//点击发货
		Mart_SellerOrdersPageHelper.clickSend(appiumUtil);

		
	
	
	
	}
}
