package cn.itcast.bookStore.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sun.xml.internal.bind.v2.model.core.ID;

import cn.itcast.bookStore.domain.User;
import cn.itcast.bookStore.utils.DataSourceUtils;

public class UserDao {
	// 添加用户
	public void addUser(User user) throws SQLException {
		String sql = "insert into user(username,password,gender,email,telephone,introduce,activecode) values(?,?,?,?,?,?,?)";
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		int row = runner.update(sql, user.getUsername(), user.getPassword(),
				user.getGender(), user.getEmail(), user.getTelephone(),
				user.getIntroduce(), user.getActiveCode());
		if (row == 0) {
			throw new RuntimeException();
		}
	}

	// 根据激活码查找用户
	public User findUserByActiveCode(String activeCode) throws SQLException {
		String sql = "select * from user where activecode=?";
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		return runner.query(sql, new BeanHandler<User>(User.class), activeCode);

	}
	// 激活用戶
	public void activeUser(String activeCode) throws SQLException {
		String sql = "update user set state=? where activecode=?";
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		runner.update(sql, 1, activeCode);
	}
	
	//根据用户名与密码查找用户
	public User findUserByUsernameAndPassword(String username, String password) throws SQLException {
		String sql="select * from user where username=? and password=?";
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		return runner.query(sql, new BeanHandler<User>(User.class),username,password);
	}
	
	  //修改用户密码 
	public boolean updatePassword(User user) throws SQLException { 
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql ="update user set PASSWORD = ?,telephone=? where id = ?";
		int i= runner.update(sql,user.getPassword(),user.getTelephone(),user.getId());
		if (i >0) {
			return true;
		}else {
			return false;
		}
	}
	//查询所有用户
	public List<User> selectSupperUser() throws SQLException{
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user ";
		List<User> list = runner.query(sql, new BeanListHandler<User>(User.class));
		return list;
	}
	//根据用户id删除用户
	public boolean deleteUser(int id) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "delete from user where id=?";
		int i = runner.update(sql, id);
		if (i>=1) {
			return true;
		}else {
			return false;
		}
	}
	//根据用户id查找用户信息
	public User selectUserById(int id) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where id = ?";
		User user = runner.query(sql, new BeanHandler<User>(User.class),id);
		return user;
	}
	//根据用户id进行用户修改
	public boolean updateUser(User user) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update user set PASSWORD=?,email=?,telephone=?,role=? where id = ?";
		int i = runner.update(sql, user.getPassword(),user.getEmail(),user.getTelephone(),user.getRole(),user.getId());
		if (i >=0) {
			return true;
		}else {
			return false;
		}
	}
}
