package javascript_study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("user_id");
		String userPwd = request.getParameter("user_pw");


		 System.out.printf(" userId : %s,%n userPwd : %s%n " , userId, userPwd);
		 
		 String name = null;
		 if(userId.equals("korean") && userPwd.equals("12345")){
			 name="박부장";
		 }else if (userId.equals("seoul")&&userPwd.equals("56789")){
			 name= "홍대리";
		 }
		 
		 //클라이언트로 응답 전송
		 
		 String msg =  String.format("{\"user_id\":\"%s\", \"user_name\":\"%s\"}", userId, name);
		 System.out.print(String.format("{\"user_id\":\"%s\", \"user_name\":\"%s\"}", userId, name));
		 PrintWriter out = response.getWriter();
		 out.print(msg);
		 out.close();
		 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("user_id");
		String userPwd = request.getParameter("user_pw");


		 System.out.printf(" userId : %s,%n userPwd : %s%n " , userId, userPwd);
		 
		 String name = null;
		 if(userId.equals("korean") && userPwd.equals("12345")){
			 name="박부장";
		 }else if (userId.equals("seoul")&&userPwd.equals("56789")){
			 name= "홍대리";
		 }
		 
		 //클라이언트로 응답 전송
		 
		 String msg =  String.format("{\"user_id\":\"%s\", \"user_name\":\"%s\"}", userId, name);
		 System.out.print(String.format("{\"user_id\":\"%s\", \"user_name\":\"%s\"}", userId, name));
		 
		 PrintWriter out = response.getWriter();
	//	out.print("alert('" + msg + "');");
		 out.print(msg);
		 out.close();
		 
	}

}
