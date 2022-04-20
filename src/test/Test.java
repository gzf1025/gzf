package test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

import cn.itcast.bookStore.dao.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
//		try {
//			///System.out.println(dao.selectSupperUser("超级用户"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner input = new Scanner(System.in);
		System.out.println("输入");
		String ss =input.nextLine();
	    
	}
	   public boolean checkRecord(String s) {
		   char a =s.charAt(1);
		   if (s.indexOf("A") <=1 && s.indexOf("L") <=2) {
			return true;
		} 
		   else {
			return false;
		}
	    }
}
