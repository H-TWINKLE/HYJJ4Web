package twinkle.factory;

import twinkle.dao.UserDAO;
import twinkle.dao.proxy.UserDAOProxy;

public class DAOFactory {
	  public static UserDAO getIEmpDAOInstance() throws Exception{
		  return new UserDAOProxy();
	  }
	}
