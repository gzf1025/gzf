package cn.itcast.bookStore.web.servlet.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.bookStore.dao.UserDao;
import cn.itcast.bookStore.domain.User;

public class UpdateUserServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String telephone = req.getParameter("telephone");
		String role = req.getParameter("role");
		UserDao dao = new UserDao();
		boolean b = false;
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setPassword(password);
		user.setEmail(email);
		user.setTelephone(telephone);
		user.setRole(role);
		try {
			b = dao.updateUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (b == true) {
			out.print("<script>");
			out.print("alert('修改成功');");
			out.print("window.location='SupperUserManager'");
			out.print("</script>");
		}else {
			out.print("<script>");
			out.print("alert('修改失败');");
			out.print("window.location='findUserId'");
			out.print("</script>");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}
}
