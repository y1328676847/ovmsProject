package cn.ekgc.ovms.base.pojo.enums;


import java.util.Properties;
/**
 * <b>公务用车管理系统-枚举常量工具类</b>
 * @author y
 * @version 1.0.0
 * @since 1.0.0
 * */
class EnumConstant {
	private static Properties props = new Properties();
	static {
		try {
			// 加载 properties 配置文件
			props.load(EnumConstant.class.getClassLoader().getResourceAsStream("props/enum.properties"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}


	/**
	 * <b>系统状态枚举信息：启用状态</b>
	 */
	static final Integer STATUS_ENABLE = Integer.parseInt(props.getProperty("status.enable"));
	/**
	 * <b>系统状态枚举信息：禁用状态</b>
	 */
	static final Integer STATUS_DISABLE = Integer.parseInt(props.getProperty("status.disable"));
	/**
	 * <b>系统响应码枚举信息：系统响应处理成功</b>
	 */
	static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("response_success"));
	/**
	 * <b>系统响应码枚举信息：系统响应处理异常</b>
	 */
	static final Integer RESPONSE_ERROR = Integer.parseInt(props.getProperty("response_error"));
	/**
	 * <b>系统响应码枚举信息：系统响应处理失败</b>
	 */
	static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("response_exception"));



}

