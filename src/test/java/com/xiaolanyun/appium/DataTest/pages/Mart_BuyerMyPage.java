package com.xiaolanyun.appium.DataTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
/*
 * @author 24075
 * @classname:Mart_BuyerMyPage
 * @Description:买家个人信息界面元素定义
 */
public class Mart_BuyerMyPage {
	//修改信息
	public static final By MSMP_BUTTON_BUYERCHANGE = By.id("com.example.xiaolanyun.ldmart:id/btn_change");
	//保存信息
	public static final By MSMP_BUTTON_BUYERSAVE = By.id("com.example.xiaolanyun.ldmart:id/btn_save");	
	//姓名
	public static final By MSMP_BUTTON_BUYERNAME = By.id("com.example.xiaolanyun.ldmart:id/buyer_name");
	//新密码
	public static final By MSMP_BUTTON_BUYERPASSWORD1 = By.id("com.example.xiaolanyun.ldmart:id/buyer_password1");
	//确认密码
	public static final By MSMP_BUTTON_BUYERPASSWORD2 = By.id("com.example.xiaolanyun.ldmart:id/buyer_password2");
	//电话
	public static final By MSMP_BUTTON_BUYERPHONE = By.id("com.example.xiaolanyun.ldmart:id/buyer_phone");
	//地址
	public static final By MSMP_BUTTON_BUYERADDRESS = By.id("com.example.xiaolanyun.ldmart:id/buyer_address");
	//提前触发保存信息告警弹框
	//确定
	public static final By MSMP_BUTTON_BUYERINFOALARMON = By.id("android:id/button1");
	//取消
	public static final By MSMP_BUTTON_BUYERINFOALARMOFF = By.id("android:id/button2");
}
