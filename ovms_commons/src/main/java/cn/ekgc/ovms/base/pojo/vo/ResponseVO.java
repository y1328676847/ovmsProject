package cn.ekgc.ovms.base.pojo.vo;

import cn.ekgc.ovms.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -6807109948745164297L;
	private Integer code;               // 系统响应码
	private E data;                     // 系统响应数据

	private ResponseVO(Integer code){
		this.code = code;
	}
	private ResponseVO(Integer code,E data){
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>获得系统相应处理成功视图信息</b>
	 * @return
	 * */
	public static ResponseVO successResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode(),data);
	}
	/**
	 * <b>获得系统相应处理失败视图信息</b>
	 * @return
	 * */
	public static ResponseVO errorResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_ERROR.getCode(),data);
	}
	/**
	 * <b>获得系统相应处理错误视图信息</b>
	 * @return
	 * */
	public static ResponseVO exceptionResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data);
	}
}
