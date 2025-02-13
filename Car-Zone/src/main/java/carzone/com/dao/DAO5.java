package carzone.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import carzone.com.entity.cart;
import carzone.com.entity.contactus;
import carzone.com.entity.order_details;
import carzone.com.entity.orders;
import carzone.com.entity.viewlist;

public class DAO5 {
	private Connection conn;
	
	public DAO5(Connection conn) {
		this.conn = conn;
	}
	
	
	// view all cart
	
		public List<cart> getAllcart(){
			List<cart> listv = new ArrayList<cart>();
			
			cart v = null;
			
			try {
				String sql = "select * from cart";
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					v = new cart();
					v.setName(rs.getString(1));
					v.setBname(rs.getString(2));
					v.setCname(rs.getString(3));
					v.setCarname(rs.getString(4));
					v.setCarprice(rs.getInt(5));
					v.setCarquantity(rs.getInt(6));
					v.setCarimage(rs.getString(7));
					listv.add(v);
					
				}
				
				
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return listv;
			}
		
		
		// view all orders
		
		public List<orders> getAllorders(){
			List<orders> listv = new ArrayList<orders>();
			
			orders v = null;
			
			try {
				String sql = "select * from orders";
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					v = new orders();
					v.setOrder_Id(rs.getInt(1));
					v.setCustomer_Name(rs.getString(2));
					v.setCustomer_City(rs.getString(3));
					v.setDate(rs.getString(4));
					v.setTotal_Price(rs.getInt(5));
					v.setStatus(rs.getString(6));
					listv.add(v);
					
				}
				
				
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return listv;
			}
		
		
		// view all order_details
		
		
		public List<order_details> getAllorder_details(){
			List<order_details> listv = new ArrayList<order_details>();
			
			order_details v = null;
			
			try {
				String sql = "select * from order_details";
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					v = new order_details();
					v.setDate(rs.getString(1));
					v.setName(rs.getString(2));
					v.setBname(rs.getString(3));
					v.setCname(rs.getString(4));
					v.setCarname(rs.getString(5));
					v.setCarprice(rs.getInt(6));
					v.setCarquantity(rs.getInt(7));
					v.setCarimage(rs.getString(8));
					listv.add(v);
					
				}
				
				
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return listv;
			}
		
		
		//remove order_details
		
		

		public int removeorder_details(order_details c) {
		
		int j = 0;
		try{
			String sql = "delete from order_details where Date= ? and carimage= ?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, c.getDate());
			ps.setString(2, c.getCarimage());

		
		j = ps.executeUpdate();
		if(j > 0)
			j = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

		return j;
			
		
		
		}
		
		
		// add to contact us
		
public int addContactus(contactus c) {
			
			int i = 0;
			try{
				String sql = "insert into Contactus(Name,Email_Id,Contact_Number,Message) values(?,?,?,?)" ;
				PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail_Id());
			ps.setInt(3, c.getContact_Number());
			ps.setString(4, c.getMessage());
			
			
			i = ps.executeUpdate();
			if(i > 0)
				i = 1;
			
			
			}catch(Exception ex){
			   System.out.println(ex.getMessage());
			}

		return i;
			
			
			
		}
	

	// view table contactus
public List<contactus> getcontactus(){
	List<contactus> listv = new ArrayList<contactus>();
	
	contactus v = null;
	
	try {
		String sql = "select * from Contactus";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			v = new contactus();
			v.setId(rs.getInt(1));
			v.setName(rs.getString(2));
			v.setEmail_Id(rs.getString(3));
			v.setContact_Number(rs.getInt(4));
			v.setMessage(rs.getString(5));
			
			listv.add(v);
			
		}
		
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return listv;
	}

		//remove from contactus



	public int removecont(contactus c) {
	
	int j = 0;
	try{
		String sql = "delete from Contactus where id= ?";
		PreparedStatement ps = conn.prepareStatement(sql);
	
		ps.setInt(1, c.getId());
		

	
	j = ps.executeUpdate();
	if(j > 0)
		j = 1;
	
	
	}catch(Exception ex){
	   System.out.println(ex.getMessage());
	}

	return j;
		
	
	
	}
	
	

}
