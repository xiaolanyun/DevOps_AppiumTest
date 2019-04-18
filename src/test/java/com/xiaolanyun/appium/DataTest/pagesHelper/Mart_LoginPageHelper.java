package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_LoginPage;
/*
 * @author 24075
 * @classname:Mart_LoginPageHelper
 * @Description:本类为在登陆界面上进行操作登录类
 */
public class Mart_LoginPageHelper {
	/*
	 * 定义日志对象
	 */
	public static Logger logger = Logger.getLogger(Mart_LoginPageHelper.class);
	//等待登录界面元素加载
	public static void waitLoginUi(AppiumUtil appiumUtil)
	{
		logger.info("等待登陆界面加载");
		appiumUtil.pause(5);;
		logger.info("等待5s完成");
		appiumUtil.findElement(Mart_LoginPage.MLP_TEXT_USER);
		appiumUtil.findElement(Mart_LoginPage.MLP_TEXT_PASSWORD);
		appiumUtil.findElement(Mart_LoginPage.MLP_BUTTON_BUYER);
		appiumUtil.findElement(Mart_LoginPage.MLP_BUTTON_SELLER);
		appiumUtil.findElement(Mart_LoginPage.MLP_BUTTON_ROOT);
		logger.info("登陆界面元素加载完成");
	}
	//验证登录界面部分元素
	public static void checkLoginText(AppiumUtil appiumUtil,String expected1,String expected2,String expected3)
	{
		logger.info("验证登陆界面客户，商户，管理员三个元素");
		appiumUtil.isTextCorrect(appiumUtil.getText(Mart_LoginPage.MLP_BUTTON_BUYER), expected1);
		appiumUtil.isTextCorrect(appiumUtil.getText(Mart_LoginPage.MLP_BUTTON_SELLER), expected2);
		appiumUtil.isTextCorrect(appiumUtil.getText(Mart_LoginPage.MLP_BUTTON_ROOT), expected3);
		logger.info("验证完成");
	}
	//点击输入root,123456,选择管理员登录
	public static void clickForRootLogin(AppiumUtil appiumUtil)
	{
		logger.info("管理员登陆");
		appiumUtil.typeContent(Mart_LoginPage.MLP_TEXT_USER, "root");
		appiumUtil.typeContent(Mart_LoginPage.MLP_TEXT_PASSWORD, "123456");
		appiumUtil.click(Mart_LoginPage.MLP_BUTTON_ROOT);
		logger.info("等待2s加载登录按钮");
		appiumUtil.Wait(2000);
		appiumUtil.click(Mart_LoginPage.MLP_BUTTON_LOGIN);
		logger.info("管理员账户登陆成功");
	}
	//点击输入买家或卖家姓名，密码，选择买家登录
	public static void clickForBuyerSellerLogin(AppiumUtil appiumUtil,By user,String name,By password,String pass,By roles,By Login)
	{
		logger.info("账户登陆");
		logger.info("输入账户名称");
		appiumUtil.pause(2);
		appiumUtil.typeContent(user, name);
		logger.info("输入账户密码");
		appiumUtil.pause(2);
		appiumUtil.typeContent(password, pass);
		logger.info("选择账户类型");
		appiumUtil.click(roles);
		String rolesname = appiumUtil.getText(roles); 
		logger.info("等待2s加载登录按钮");
		appiumUtil.pause(2);
		logger.info("点击登陆");
		appiumUtil.click(Login);
		appiumUtil.pause(2);
		logger.info(rolesname+"账户登陆成功");
	}
}
