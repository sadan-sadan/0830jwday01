

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login2")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public loginServlet() {
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		PrintWriter writer = response.getWriter();
		if (username.equals("") || password.equals("")) {
			// 通知客户端
			writer.print("参数非法！");
			return;
		}	
		writer.print("用户名" + username);
		writer.print("密码" + password);
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		System.out.println("已经开始处理请求");
		System.out.println("嘻嘻");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
