package cn.itcast.bookStore.web.servlet.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.bookStore.dao.UserDao;

public class DeleteUserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		//调用响应对象向服务器索要一个打印流对象
		PrintWriter out = resp.getWriter();
			UserDao dao = new UserDao();
			boolean b = false;
			try {
				b = dao.deleteUser(Integer.parseInt(id));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (b == true) {
				out.print("<script>");
				out.print("alert('删除成功');");
				out.print("window.location='SupperUserManager'");
				out.print("</script>");
			}else {
				out.print("<script>");
				out.print("alert('删除失败')");
				out.print("window.location='admin/orders/superUser.jsp'");
				out.print("</script>");
			}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
