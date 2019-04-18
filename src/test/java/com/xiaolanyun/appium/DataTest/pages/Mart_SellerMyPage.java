package com.xiaolanyun.appium.DataTest.pages;
import org.openqa.selenium.By;
/*
 * @author 24075
 * @classname:Mart_SellerMyPages
 * @Description:卖家基本信息元素定义
 */
public class Mart_SellerMyPage {
	//修改信息
	public static final By MSMP_BUTTON_SELLERCHANGE = By.id("com.example.xiaolanyun.ldmart:id/btn_change");
	//保存信息
	public static final By MSMP_BUTTON_SELLERSAVE = By.id("com.example.xiaolanyun.ldmart:id/btn_save");	
	//姓名
	public static final By MSMP_BUTTON_SELLERNAME = By.id("com.example.xiaolanyun.ldmart:id/seller_name");
	//新密码
	public static final By MSMP_BUTTON_SELLERPASSWORD1 = By.id("com.example.xiaolanyun.ldmart:id/seller_password1");
	//确认密码
	public static final By MSMP_BUTTON_SELLERPASSWORD2 = By.id("com.example.xiaolanyun.ldmart:id/seller_password2");
	//电话
	public static final By MSMP_BUTTON_SELLERPHONE = By.id("com.example.xiaolanyun.ldmart:id/seller_phone");
	//地址
	public static final By MSMP_BUTTON_SELLERADDRESS = By.id("com.example.xiaolanyun.ldmart:id/seller_address");
	//提前触发保存信息告警弹框
		//确定
		public static final By MSMP_BUTTON_SELLERINFOALARMON = By.id("android:id/button1");
		//取消
		public static final By MSMP_BUTTON_SELLERINFOALARMOFF = By.id("android:id/button2");
}
