package cn.joongky.society.service.impl;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import cn.joongky.exception.AdminException;
import cn.joongky.society.dao.UserLoginMapper;
import cn.joongky.society.pojo.UserLogin;
import cn.joongky.society.pojo.UserLoginExample;
import cn.joongky.society.service.UserLoginService;
import cn.joongky.society.util.EncryptUtil;

@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService{
	@Inject
	private UserLoginMapper userLoginMapper;
	
	@Override
	public UserLogin login(String token, String password) {
		UserLoginExample example = new UserLoginExample();
		example.or().andNicknameEqualTo(token);
		example.or().andEmailEqualTo(token);
		example.or().andMobileEqualTo(token);
		List<UserLogin> userlist = userLoginMapper.selectByExample(example);
		UserLogin ul = null;
		if (userlist.size() == 1) {
			ul = userlist.get(0);
			String salt = ul.getSalt();
			String currentPassword = ul.getCurrentPassword();
			if (EncryptUtil.encodeByMD5(password + salt).equals(currentPassword)) {
				return ul;
			} else {
				throw new AdminException("用户名或密码错误,拒绝登录");
			}
		} else {
			// TODO 提示信息不正确
			throw new AdminException("存在重名用户或用户不存在,拒绝登录");
		}
	}
	
}
