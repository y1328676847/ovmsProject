package cn.ekgc.ovms.base.pojo.enums;
/**
 * <b>公务用车管理系统-系统响应码枚举信息</b>
 * @author y
 * @version 1.0.0
 * @since 1.0.0
 * */
public enum ResponseEnum {
	RESPONSE_SUCCESS(EnumConstant.RESPONSE_SUCCESS,"系统响应处理成功"),
	RESPONSE_ERROR(EnumConstant.RESPONSE_ERROR,"系统响应处理失败"),
	RESPONSE_EXCEPTION(EnumConstant.RESPONSE_EXCEPTION,"系统响应处理异常");

	private Integer code;               // 编码
	private String remark;              // 说明

	private ResponseEnum(Integer code,String remark){
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
