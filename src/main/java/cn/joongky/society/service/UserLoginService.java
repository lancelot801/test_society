package cn.joongky.society.service;

import cn.joongky.society.pojo.UserLogin;

public interface UserLoginService {
	//登录方法
	UserLogin login(String token, String password);
}
