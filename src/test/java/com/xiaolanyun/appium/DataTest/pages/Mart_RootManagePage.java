package com.xiaolanyun.appium.DataTest.pages;
import org.openqa.selenium.By;
/*
 * @author 24075
 * @classname:Mart_RootManagePage
 * @Description:管理员添加买家卖家界面元素定义
 */
public class Mart_RootManagePage {
	//用户名
	public static final By MRMP_TEXT_USER = By.id("com.example.xiaolanyun.ldmart:id/username");
	//密码
	public static final By MRMP_TEXT_PASSWORD1 = By.id("com.example.xiaolanyun.ldmart:id/password1");
	//重复密码
	public static final By MRMP_TEXT_PASSWORD2 = By.id("com.example.xiaolanyun.ldmart:id/password2");
	//添加买家
	public static final By MRMP_BUTTON_ADDBUYER = By.id("com.example.xiaolanyun.ldmart:id/rbtn_buyer");
	//添加卖家
	public static final By MRMP_BUTTON_ADDSELLER = By.id("com.example.xiaolanyun.ldmart:id/rbtn_seller");
	//添加确认按钮
	public static final By MRMP_BUTTON_ADDUSER = By.id("com.example.xiaolanyun.ldmart:id/btn_add_user");
	
	
}
