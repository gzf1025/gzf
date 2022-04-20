package cn.itcast.bookStore.web.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.bookStore.dao.UserDao;
import cn.itcast.bookStore.domain.User;

public class UserUpdatePawword extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html;charset=utf-8");
	 String id = req.getParameter("id");
	 String gender  = req.getParameter("radiobutton");
	 String telephone = req.getParameter("telephone");
	 String password = req.getParameter("password");
	 PrintWriter out = resp.getWriter();
	 User user = new User();
	 user.setId(Integer.parseInt(id));
	 user.setPassword(password);
	 user.setGender(gender);
	 user.setTelephone(telephone);
	 UserDao dao =new  UserDao();
	 boolean b = false;
	 try {
		b= dao.updatePassword(user);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 if (b == true) {
		 out.print("<script>");
			out.print("alert('修改成功');");
			out.print("window.location='client/login.jsp'");
			out.print("</script>");
	}else {
		out.print("<script>");
		out.print("alert('修改失败，请重新修改')");
		out.print("window.location='client/login.jsp'");
		out.print("</script>");
	}
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
