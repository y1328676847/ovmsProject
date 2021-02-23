package cn.ekgc.ovms.util;


import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * <b>公务用车管理系统-Json转换工具类</b>
 * @author y
 * @version 1.0.0
 * @since 1.0.0
 */
public class JsonUtil {
	/**
	 * <b>将对象转换为 Json 格式数据</b>
	 * @param obj
	 * @return
	 * */
	public static String parseToJson(Object obj){
		// 创建 JSONMapper 对象
		JsonMapper jsonMapper  = new JsonMapper();
		// 进行数据转换
		try {
				return jsonMapper.writeValueAsString(obj);
		} catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}
	/**
	 * <b>按照目标对象类型将 JSON 转换为该类型对象</b>
	 * @param json
	 * @param argClass
	 * @return
	 * */

	public static Object parseToObject(String json,Class argClass){
		// 创建 JSONMapper 对象
		JsonMapper jsonMapper  = new JsonMapper();
		try {
			return jsonMapper.readValue(json,argClass);
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
