package com.goodsoft.yuanlin.domain.entity.maintenance;
/**
 * 全局统一的返回结果类
 * @author 龙宏
 *
 */
public class Result {
	
	//状态
	private int status;
	//消息信息
	private String msg;
	//存放的数据
	private Object data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Result(int status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	
	public Result() {
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", msg=" + msg + ", data=" + data
				+ "]";
	}
	
}
