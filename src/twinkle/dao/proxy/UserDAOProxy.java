package twinkle.dao.proxy;

import java.util.List;

import twinkle.dao.UserDAO;
import twinkle.dao.impl.UserDAOIpml;
import twinkle.dbc.DatabaseConnection;
import twinkle.user.User;

public class UserDAOProxy implements UserDAO{
	
	
	
	private DatabaseConnection dbc = null;
    private UserDAO dao=null;
    public UserDAOProxy(){
	  try{
		  this.dbc = new DatabaseConnection();
		  
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	  this.dao = new UserDAOIpml(dbc.geConnection());
	
}

	@Override
	public boolean findLogin(User user) throws Exception {
		boolean flag = false;
    	try{
    		flag = this.dao.findLogin(user);
    		
    	}catch(Exception e){
    		throw e;
    	}finally{
    		this.dbc.close();
    	}
    	return flag;
	}

	@Override
	public boolean doCreate(User user) throws Exception {
		boolean flag = false;
		try{
			
				flag = this.dao.doCreate(user);
			
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doUpgrade(User user) throws Exception {
		boolean flag = false;
		try{
		
				flag = this.dao.doUpgrade(user);
		
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public List<User> findAll() throws Exception {
		List<User>all = null;
		try{
			all = this.dao.findAll();
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return all;
	}
	
	@Override
	public boolean findSomeone(User user) throws Exception {
		
		boolean flag = false;
    	try{
    		flag = this.dao.findSomeone(user);
    		
    	}catch(Exception e){
    		throw e;
    	}finally{
    		this.dbc.close();
    	}
    	return flag;
	}

    
	@Override
	public boolean doCreatetest(User user) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean doUpgradetest(User user) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public List<User> findAlltest(String keyword) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<User> findAlltree() throws Exception {
		List<User>all = null;
		try{
			all = this.dao.findAlltree();
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return all;
	}

	@Override
	public boolean doCreatetree(User user) throws Exception {
		boolean flag = false;
		try{
			
				flag = this.dao.doCreatetree(user);
			
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	
	
	

}
