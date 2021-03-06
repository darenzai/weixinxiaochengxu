package com.darenzai.service.Impl;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.darenzai.dao.UserDao;
import com.darenzai.model.User;
import com.darenzai.service.UserService;
 
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//表示一个方法声明的目的是覆盖父类方法声明。如果一个方法是注释，该注释类型但不重写基类方法，编译器必须生成一个错误消息。
	
	public String addInfo(User addInfo) {
		if (userDao.insertSelective(addInfo) == 1) {
			return "添加成功";
		}
		return "添加失败";
	}
	
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	public String delete(int id) {
		if (userDao.deleteByPrimaryKey(id) == 1) {
			return "删除成功";
		}
		return "删除失败";
	}
	
	public User findById(int id) {
		return userDao.selectByPrimaryKey(id);
	}
	
	public String update(User addInfo) {
		if (userDao.updateByPrimaryKeySelective(addInfo) == 1) {
			return "更新成功";
		}
		return "更新失败";
	}
	
	public User login(User user) {
		return userDao.selectByUsernameAndPassword(user);
	}
}
