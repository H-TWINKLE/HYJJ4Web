package twinkle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import twinkle.dao.UserDAO;
import twinkle.user.User;


public class UserDAOIpml implements UserDAO{
	
	private Connection conn = null;
	private PreparedStatement pstmt =null;
	public UserDAOIpml(Connection conn){
		this.conn = conn;
	}
	
	

	@Override
	public boolean findLogin(User user) throws Exception {
		boolean flag=false;
		String sql="select name FROM admin WHERE admin=? AND password=?";		
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getAdmin());
		this.pstmt.setString(2, user.getPassword());
		ResultSet rs = this.pstmt.executeQuery();
		if(rs.next()){
			user.setName(rs.getString(1));
			flag = true;
		}
		this.pstmt.close();
		return flag;
	}

	@Override
	public boolean doCreate(User user) throws Exception {
		
		boolean flag=false;
		String sql="INSERT INTO admin(admin,password)"+
					"VALUES(?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getAdmin());
		this.pstmt.setString(2, user.getPassword());
		if(this.pstmt.executeUpdate()>0){
			flag = true;
		}
		this.pstmt.close();
		return flag;
	}

	@Override
	public boolean doUpgrade(User user) throws Exception {
		boolean flag=false;
		String sql="UPDATE admin SET password=?,name=?,say=?,level=?,xuehao=?,xuehaopassword=? WHERE admin=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getPassword());
		this.pstmt.setString(2, user.getName());
		this.pstmt.setString(3, user.getSay());
		this.pstmt.setString(4, user.getLevel());
		this.pstmt.setString(5, user.getXuehao());
		this.pstmt.setString(6, user.getXuehaopassword());
		this.pstmt.setString(7, user.getAdmin());
		if(this.pstmt.executeUpdate()>0){
			flag = true;
		}
		this.pstmt.close();
		return flag;
	}



	@Override
	public List<User> findAll() throws Exception {
		
		List<User>all = new ArrayList<User>();
		String sql = "SELECT * FROM admin ";
		this.pstmt = this.conn.prepareStatement(sql);
		ResultSet rs = this.pstmt.executeQuery();
		User user = null;
		while(rs.next()){
		    user = new User();
			user.setAdmin(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setName(rs.getString(3));
			user.setSay(rs.getString(4));
			user.setLevel(rs.getString(5));
			user.setXuehao(rs.getString(6));
			user.setXuehaopassword(rs.getString(7));
			all.add(user);
		}
		this.pstmt.close();
		return all;
	}

@Override
	public boolean findSomeone(User user) throws Exception {
	boolean flag=false;
	String sql="select admin FROM admin WHERE admin=?";		
	this.pstmt = this.conn.prepareStatement(sql);
	this.pstmt.setString(1, user.getAdmin());
	ResultSet rs = this.pstmt.executeQuery();
	if(rs.next()){		
		flag = true;
	}
	this.pstmt.close();
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
		List<User>all = new ArrayList<User>();
		String sql = "SELECT * FROM tree ";
		this.pstmt = this.conn.prepareStatement(sql);
		ResultSet rs = this.pstmt.executeQuery();
		User user = null;
		while(rs.next()){
		    user = new User();
			user.setName(rs.getString(1));
			user.setInformation(rs.getString(2));
			user.setTime(rs.getString(3));
			all.add(user);
		}
		this.pstmt.close();
		return all;
	}



	@Override
	public boolean doCreatetree(User user) throws Exception {
		boolean flag=false;
		String sql="INSERT INTO tree(name,information,time)"+
					"VALUES(?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getName());
		this.pstmt.setString(2, user.getInformation());
		this.pstmt.setString(3, user.getTime());
		if(this.pstmt.executeUpdate()>0){
			flag = true;
		}
		this.pstmt.close();
		return flag;
	}



	

}
