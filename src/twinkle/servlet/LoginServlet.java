package twinkle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twinkle.factory.DAOFactory;
import twinkle.user.User;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String path = "login.jsp";
		String admin = request.getParameter("admin");
		String password = request.getParameter("password");
		
		List<String> info = new ArrayList<String>();
		
		
		if(info.size()==0){
			User user = new User();
			user.setAdmin(admin);
			user.setPassword(password);
			
			User userone = new User();
			userone.setAdmin(admin);
			
			
			try{
				if(DAOFactory.getIEmpDAOInstance().findSomeone(user)){
					
					System.out.println("找到用户："+admin);
					if(DAOFactory.getIEmpDAOInstance().findLogin(user)){
					
					info.add(user.getName());
					request.getSession().setAttribute("info", info);
					request.setAttribute("info", info);
					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
					response.setHeader("Location",path);
										
				}
				else{
					info.add("密码错误");
					request.getSession().setAttribute("info", info);
					request.setAttribute("info", info);
					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
					response.setHeader("Location",path);
					
				}
				}else{
					
					DAOFactory.getIEmpDAOInstance().doCreate(user);
					info.add("创建用户成功");
					request.setAttribute("info", info);
					request.getSession().setAttribute("info", info);
					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
					response.setHeader("Location",path);
				}
				
				
				
				
				
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = "login.jsp";
		String admin = request.getParameter("admin");
		String password = request.getParameter("password");
		
		List<String> info = new ArrayList<String>();
		
		
		if(info.size()==0){
			User user = new User();
			user.setAdmin(admin);
			user.setPassword(password);
			
			User userone = new User();
			userone.setAdmin(admin);
			
			
			try{
				if(DAOFactory.getIEmpDAOInstance().findSomeone(user)){
					
					System.out.println("找到用户："+admin);
					if(DAOFactory.getIEmpDAOInstance().findLogin(user)){
					
					info.add(user.getName());
					request.getSession().setAttribute("info", info);
					request.setAttribute("info", info);
					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
					response.setHeader("Location",path);
										
				}
				else{
					info.add("密码错误");
					request.getSession().setAttribute("info", info);
					request.setAttribute("info", info);
					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
					response.setHeader("Location",path);
					
				}
				}else{
					
					DAOFactory.getIEmpDAOInstance().doCreate(user);
					info.add("创建用户成功");
					request.setAttribute("info", info);
					request.getSession().setAttribute("info", info);
					response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
					response.setHeader("Location",path);
				}
				
				
				
				
				
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}
		
	}

}
