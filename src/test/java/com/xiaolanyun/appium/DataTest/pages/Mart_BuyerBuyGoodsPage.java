package com.xiaolanyun.appium.DataTest.pages;
import org.openqa.selenium.By;
/*
 * @author 24075
 * @classname:Mart_BuyerBuyGoodsPage
 * @Description:买家购买商品页面
 */
public class Mart_BuyerBuyGoodsPage {

	//购买商品
	public static final By MBBGP_BUTTON_BUY = By.id("com.example.xiaolanyun.ldmart:id/btn_buy");
	//购买商品验证身份弹窗
	//输入密码
	public static final By MBBGP_BUTTON_BUYPASSWORD = By.className("android.widget.EditText");
	//取消
	public static final By MBBGP_BUTTON_BUYOFF = By.id("android:id/button2");
	//确定
	public static final By MBBGP_BUTTON_BUYON = By.id("android:id/button1");
}
