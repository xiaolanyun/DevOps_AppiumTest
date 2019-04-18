package com.xiaolanyun.appium.DataTest.pages;
import org.openqa.selenium.By;

/*
 * @author 24075
 * @classname:Mart_LoginPage
 * @Description:定义Mart应用的登陆界面元素
 */
public class Mart_LoginPage {
	//用户名
	public static final By MLP_TEXT_USER = By.id("com.example.xiaolanyun.ldmart:id/et_username");
	//密码框
	public static final By MLP_TEXT_PASSWORD = By.id("com.example.xiaolanyun.ldmart:id/et_password"); 
	//客户
	public static final By MLP_BUTTON_BUYER = By.id("com.example.xiaolanyun.ldmart:id/rbtn_buyer");
	//商户
	public static final By MLP_BUTTON_SELLER = By.id("com.example.xiaolanyun.ldmart:id/rbtn_seller");
	//管理员
	public static final By MLP_BUTTON_ROOT = By.id("com.example.xiaolanyun.ldmart:id/rbtn_root");
	//登录
	public static final By MLP_BUTTON_LOGIN = By.id("com.example.xiaolanyun.ldmart:id/btn_login");
}
