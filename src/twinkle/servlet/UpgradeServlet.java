package twinkle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twinkle.factory.DAOFactory;
import twinkle.user.User;


/**
 * Servlet implementation class LookServlet
 */
@WebServlet("/UpgradeServlet")
public class UpgradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpgradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("UTF-8");
		String path="look.jsp";
		User user = new User();
		user.setAdmin(request.getParameter("admin"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setSay(request.getParameter("say"));
		user.setLevel(request.getParameter("level"));
		user.setXuehao(request.getParameter("xuehao"));
		user.setXuehaopassword(request.getParameter("xuehaopassword"));
		
		
		try{
			if(DAOFactory.getIEmpDAOInstance().doUpgrade(user)){
				
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location",path);
		
			}else{
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location",path);
		
		
			}}catch(Exception e){
				e.printStackTrace();
			}

	}
		
		
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String path="look.jsp";
		User user = new User();
		user.setAdmin(request.getParameter("admin"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setSay(request.getParameter("say"));
		user.setLevel(request.getParameter("level"));
		user.setXuehao(request.getParameter("xuehao"));
		user.setXuehaopassword(request.getParameter("xuehaopassword"));
		
		
		try{
			if(DAOFactory.getIEmpDAOInstance().doUpgrade(user)){
				
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location",path);
		
			}else{
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location",path);
		
		
			}}catch(Exception e){
				e.printStackTrace();
			}

	}

}
