package cn.ekgc.ovms.base.pojo.enums;
/**
 * <b>公务用车管理系统-系统状态枚举信息</b>
 * @author y
 * @version 1.0.0
 * @since 1.0.0
 * */
public enum StatusEnum {
	STATUS_ENABLE(EnumConstant.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(EnumConstant.STATUS_DISABLE,"禁用");
	private Integer code;               // 编码
	private String remark;              // 说明

	private StatusEnum(Integer code,String remark){
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