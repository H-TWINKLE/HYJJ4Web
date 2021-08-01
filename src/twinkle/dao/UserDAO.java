package twinkle.dao;

import java.util.List;



import twinkle.user.*;

public interface UserDAO {
	
	public boolean findLogin(User user) throws Exception;
	public boolean doCreate(User user) throws Exception;
	public boolean doUpgrade(User user) throws Exception;
	public List<User> findAll() throws Exception;
	public boolean findSomeone(User user)throws Exception;
	
	public List<User> findAlltree() throws Exception;
	public boolean doCreatetree(User user) throws Exception;
	
	
	
	public boolean doCreatetest(User user) throws Exception;
	public boolean doUpgradetest(User user) throws Exception;
	public List<User> findAlltest(String keyword) throws Exception;

}
