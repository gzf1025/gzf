package cn.itcast.bookStore.web.servlet.manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.itcast.bookStore.dao.UserDao;
import cn.itcast.bookStore.domain.User;

public class ShowUsersManager extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf8");
		resp.setContentType("text/html;charset=utf-8");
		//String id = req.getParameter("id");
		//String role = req.getParameter("role");
		UserDao dao = new UserDao();
		List<User> list1 = new ArrayList<User>();;
		HttpSession session = req.getSession();
		try {
			List<User> list = dao.selectSupperUser();
			for (int i = 0; i < list.size(); i++) {
				User user = list.get(i);
				list1.add(user);
			}
			session.setAttribute("list1", list1);
			req.getRequestDispatcher("/admin/orders/showUsers.jsp").forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
