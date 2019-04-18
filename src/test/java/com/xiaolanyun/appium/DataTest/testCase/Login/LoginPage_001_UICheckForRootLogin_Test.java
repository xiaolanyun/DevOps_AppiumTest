package com.xiaolanyun.appium.DataTest.testCase.Login;
//import java.util.Map;数据驱动使用
import org.testng.annotations.Test;
import com.xiaolanyun.appium.DataTest.base.BasePrepare;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;

import com.xiaolanyun.appium.DataTest.pagesHelper.Mart_LoginPageHelper;
import com.xiaolanyun.appium.DataTest.pages.*;

/*
 * @author 24075
 * @classname:LoginPage_001_UICheckForRootLogin_Test
 * @Description:本类用于管理员登录测试用例
 */
public class LoginPage_001_UICheckForRootLogin_Test extends BasePrepare{
	
	@Test
	public void checkLoginUI(){
		//等待登录界面元素加载
		Mart_LoginPageHelper.waitLoginUi(appiumUtil);
		//验证登录界面部分元素
		Mart_LoginPageHelper.checkLoginText(appiumUtil, "客户", "商户", "管理员");
		//点击输入root,123456,选择管理员登录
		Mart_LoginPageHelper.clickForBuyerSellerLogin(appiumUtil, Mart_LoginPage.MLP_TEXT_USER, "root", Mart_LoginPage.MLP_TEXT_PASSWORD, "123456", Mart_LoginPage.MLP_BUTTON_ROOT, Mart_LoginPage.MLP_BUTTON_LOGIN);
	}
}
