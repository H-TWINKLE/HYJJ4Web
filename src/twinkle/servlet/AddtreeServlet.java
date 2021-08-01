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
 * Servlet implementation class AddtreeServlet
 */
@WebServlet("/AddtreeServlet")
public class AddtreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtreeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");

		User user = new User();
		user.setName(request.getParameter("name"));
		user.setInformation(request.getParameter("information"));
		user.setTime(request.getParameter("time"));
		try{
			if(DAOFactory.getIEmpDAOInstance().doCreatetree(user)){
				
				
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location","treelook.jsp");
			}
			else{
				
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location","treelook.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");

		User user = new User();
		user.setName(request.getParameter("name"));
		user.setInformation(request.getParameter("information"));
		user.setTime(request.getParameter("time"));
		try{
			if(DAOFactory.getIEmpDAOInstance().doCreatetree(user)){
				
				
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location","treelook.jsp");
			}
			else{
				
				response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				response.setHeader("Location","treelook.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
