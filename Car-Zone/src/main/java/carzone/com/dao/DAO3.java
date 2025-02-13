package carzone.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import carzone.com.entity.Product;
import carzone.com.entity.cart;
import carzone.com.entity.customer;
import carzone.com.entity.berlina;
import carzone.com.entity.dilusso;
import carzone.com.entity.orders;
import carzone.com.entity.order_details;
import carzone.com.entity.elettrica;
import carzone.com.entity.usermaster;
import carzone.com.entity.viewlist;
import carzone.com.entity.suv;
import carzone.com.utility.MyUtilities;



public class DAO3 {
	private Connection conn;
	
	public DAO3(Connection conn) {
		this.conn = conn;
	}
	
	
	// view berlina
	
	public List<berlina> getAllberlina(){
		List<berlina> listv = new ArrayList<berlina>();
		
		berlina v = null;
		
		try {
			String sql = "select * from berlina";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				v = new berlina();
				v.setBname(rs.getString(1));
				v.setCname(rs.getString(2));
				v.setCarname(rs.getString(3));
				v.setCarprice(rs.getInt(4));
				v.setCarquantity(rs.getInt(5));
				v.setCarimage(rs.getString(6));
				listv.add(v);
				
			}
			
			
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return listv;
		}
		
	// view suv
	
		public List<suv> getAllsuv(){
			List<suv> listv = new ArrayList<suv>();
			
			suv v = null;
			
			try {
				String sql = "select * from suv";
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					v = new suv();
					v.setBname(rs.getString(1));
					v.setCname(rs.getString(2));
					v.setCarname(rs.getString(3));
					v.setCarprice(rs.getInt(4));
					v.setCarquantity(rs.getInt(5));
					v.setCarimage(rs.getString(6));
					listv.add(v);
					
				}
				
				
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return listv;
			}

		// view elettrica
		
			public List<elettrica> getAllelettrica(){
				List<elettrica> listv = new ArrayList<elettrica>();
				
				elettrica v = null;
				
				try {
					String sql = "select * from elettrica";
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next())
					{
						v = new elettrica();
						v.setBname(rs.getString(1));
						v.setCname(rs.getString(2));
						v.setCarname(rs.getString(3));
						v.setCarprice(rs.getInt(4));
						v.setCarquantity(rs.getInt(5));
						v.setCarimage(rs.getString(6));
						listv.add(v);
						
					}
					
					
						
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					return listv;
				}
			
			// view dilusso
			
			public List<dilusso> getAlldilusso(){
				List<dilusso> listv = new ArrayList<dilusso>();
				
				dilusso v = null;
				
				try {
					String sql = "select * from dilusso";
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next())
					{
						v = new dilusso();
						v.setBname(rs.getString(1));
						v.setCname(rs.getString(2));
						v.setCarname(rs.getString(3));
						v.setCarprice(rs.getInt(4));
						v.setCarquantity(rs.getInt(5));
						v.setCarimage(rs.getString(6));
						listv.add(v);
						
					}
					
					
						
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					return listv;
				}


	
	
		

	
//==================================
			// addtocartnull
			
			public boolean checkaddtocartnull(cart c)
			{
				boolean f = false;
			
			
				try{
					String sql = "select * from cart  where Name =? and bname=? and cname =? and name = ? and carprice = ? and carimage = ?";
					PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1,c.getName());
				ps.setString(2, c.getBname());
				ps.setString(3, c.getCname());
				ps.setString(4, c.getCarname());
				ps.setInt(5, c.getCarprice());
				ps.setString(6, c.getCarimage());
				
				ResultSet rs=ps.executeQuery();
				if (rs.next()==true)
					f = true;
				else
					f = false;
				
				}catch(Exception ex){
				   System.out.println(ex.getMessage());
				}

			return f;
					
			}
			
		// update cart	
			public int updateaddtocartnull(cart c) {
				
				int i = 0;
				try{
					String sql = "update cart set pquantity = (pquantity + 1) where Name =? and bname = ? and cname = ? and carname = ? and carprice = ? and carimage = ?" ;
					PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, c.getName());
				ps.setString(2, c.getBname());
				ps.setString(3, c.getCname());
				ps.setString(4, c.getCarname());
				ps.setInt(5, c.getCarprice());
				ps.setString(6, c.getCarimage());
				
				i = ps.executeUpdate();
				if(i > 0)
					i = 1;
				
				
				}catch(Exception ex){
				   System.out.println(ex.getMessage());
				}

			return i;
				
				
				
			}
			
			//
	public int addtocartnull(cart c) {
				
				int i = 0;
				try{
					String sql = "insert into cart values(?,?,?,?,?,?,?)" ;
					PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, c.getName());
				ps.setString(2, c.getBname());
				ps.setString(3, c.getCname());
				ps.setString(4, c.getCarname());
				ps.setInt(5, c.getCarprice());
				ps.setInt(6, c.getCarquantity());
				ps.setString(7, c.getCarimage());
				
				i = ps.executeUpdate();
				if(i > 0)
					i = 1;
				
				
				}catch(Exception ex){
				   System.out.println(ex.getMessage());
				}

			return i;
				
				
				
			}
		
		
	
		
		// view orders
	
	
	public List<orders> getOrders(String o){
		List<orders> listv = new ArrayList<orders>();
		
		orders v = null;
		
		try {
			String sql = "select * from orders where Customer_Name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, o);
			
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

	
	//view orders by Date
		

	public List<orders> getOrdersbydate(String d){
		List<orders> listv = new ArrayList<orders>();
		
		orders v = null;
		
		try {
			String sql = "select * from orders where Date = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, d);
			
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

			//view order_details by date
	
	public List<order_details> getOrderdetails(String d){
		List<order_details> listd = new ArrayList<order_details>();
		
		order_details v = null;
		
		try {
			String sql = "select * from Order_details where Date = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, d);
			
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
				
				listd.add(v);
				
			}
			
			
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return listd;
		}

	
}
