package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_RootManagePage;;
/*
 * @author 24075
 * @classname:Mart_RootManagePageHelper
 * @Description:本类是对管理员界面的添加用户界面封装操作
 */
public class Mart_RootManagePageHelper {
	/*
	 * 定义日志对象
	 */
	public static Logger logger = Logger.getLogger(Mart_RootManagePageHelper.class);
	/*
	 * 封装输入操作
	 */
	public static void inputAddUserInfo(AppiumUtil appiumUtil,By by,String info){
		logger.info("输入"+appiumUtil.getText(by)+"信息");
		appiumUtil.typeContent(by, info);
		logger.info("输入"+appiumUtil.getText(by)+"信息完毕");
	}
	/*
	 * 封装点击操作
	 */
	public static void clickAddUserInfo(AppiumUtil appiumUtil,By by)
	{
		logger.info("点击"+appiumUtil.getText(by)+"按钮");
		String bytextString = appiumUtil.getText(by);
		appiumUtil.click(by);
		logger.info("已经点击"+bytextString+"按钮");
	}
}
