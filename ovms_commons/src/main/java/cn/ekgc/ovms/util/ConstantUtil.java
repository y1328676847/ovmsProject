package cn.ekgc.ovms.util;

import java.util.Properties;

/**
 * <b>公务用车管理系统-常用工具类</b>
 * @author y
 * @version 1.0.0
 * @since 1.0.0
 * */
public class ConstantUtil {
	private static Properties props = new Properties();
	static {
		try {
			// 加载 properties 配置文件
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}


	/**
	 * <b>系统分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>系统分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}
