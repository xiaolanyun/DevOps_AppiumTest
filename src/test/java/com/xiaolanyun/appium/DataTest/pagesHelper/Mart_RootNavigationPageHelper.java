package com.xiaolanyun.appium.DataTest.pagesHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;
import com.xiaolanyun.appium.DataTest.pages.Mart_RootNavigationPage;;
/*
 * @author 24075
 * @classname:Mart_RootNavigationPageHelper
 * @Description:本类是对管理员账户底部导航栏，买家列表，卖家列表，增加买家卖家
 */
public class Mart_RootNavigationPageHelper {
	/*
	 * 定义日志对象
	 */
	public static Logger logger = Logger.getLogger(Mart_RootNavigationPageHelper.class);
	/*
	 * 对底部导航栏操作
	 */
	public static void clickRootNavigation(AppiumUtil appiumUtil,By by)
	{
		logger.info("点击管理员账户导航栏");
		String bytext = appiumUtil.getText(by);
		appiumUtil.click(by);
		logger.info("已经切换到"+bytext+"界面");
	}
}
