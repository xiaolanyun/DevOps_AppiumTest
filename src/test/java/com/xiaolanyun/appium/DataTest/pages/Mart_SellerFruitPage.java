package com.xiaolanyun.appium.DataTest.pages;
import org.openqa.selenium.By;
/*
 * @author 24075
 * @classname:Mart_SellerFruitPage
 * @Description:卖家水果商品列表元素定义
 */
public class Mart_SellerFruitPage {
	//搜索
	public static final By MSFP_TEXT_SEARCH = By.id("android:id/search_src_text");
	//水果
	public static final By MSFP_BUTTON_FRUIT = By.id("com.example.xiaolanyun.ldmart:id/fruits_ibt");
	//精品脐橙
	public static final By MSFP_BUTTON_QICHENG = By.xpath("//android.widget.TextView[@text='精品脐橙']");	
	//四川丑柑
	public static final By MSFP_BUTTON_CHOUGAN = By.xpath("//android.widget.TextView[@text='四川丑柑']");
	//高山苹果
	public static final By MSFP_BUTTON_PINGGUO = By.xpath("//android.widget.TextView[@text='高山苹果']");
	//库尔勒香梨
	public static final By MSFP_BUTTON_XIANGLI = By.xpath("//android.widget.TextView[@text='库尔勒香梨']");
	//桂圆
	public static final By MSFP_BUTTON_GUIYUAN = By.xpath("//android.widget.TextView[@text='桂圆']");
	//冰糖橙
	public static final By MSFP_BUTTON_TANGCHENG = By.xpath("//android.widget.TextView[@text='冰糖橙']");
}
