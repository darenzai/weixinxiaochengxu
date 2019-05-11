package com.dbteam.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserSecond {
	public int id;

	@NotBlank(message = "用户名不能为空")
	public String userName;
	@NotBlank(message = "微信名不能为空")
	public String userWeChat;
	@Pattern(regexp="[1][3|4|5|6|7|8][0-9]{9}",message="手机号码格式不正确")
	public String userPhone;

	public String workingPosition;

	public String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserWeChat() {
		return userWeChat;
	}

	public void setUserWeChat(String userWeChat) {
		this.userWeChat = userWeChat;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getWorkingPosition() {
		return workingPosition;
	}

	public void setWorkingPosition(String workingPosition) {
		this.workingPosition = workingPosition;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
