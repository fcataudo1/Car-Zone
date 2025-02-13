package carzone.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


import carzone.com.entity.category;
import carzone.com.entity.customer;
import carzone.com.utility.MyUtilities;
import carzone.com.entity.Product;
import carzone.com.entity.customer;
import carzone.com.entity.brand;

public class DAO {
	private Connection conn;
	
	public DAO(Connection conn) {
		this.conn = conn;
	}
	
	
	// list all brand
	
	public List<brand> getAllbrand(){
		List<brand> listb = new ArrayList<brand>();
		
		brand b = null;
		
		try {
			String sql = "select * from brand";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				b = new brand();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				listb.add(b);
				
			}
			
			
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return listb;
		}
	
	
	// list all category
	
	public List<category> getAllcategory(){
		List<category> listc = new ArrayList<category>();
		
		category c = null;
		
		try {
			String sql = "select * from category";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				c = new category();
				c.setCid(rs.getInt(1));
				c.setCname(rs.getString(2));
				listc.add(c);
				
			}
			
			
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return listc;
		}
	
	
	//
public int  addproduct(HttpServletRequest request) {
		
	String path = "C:/Users/user/Desktop/IsProjects/Car-Zone/src/main/webapp/";
	
	
	
	
		int a =  0;
		try {
			
			String carname = "";
			int carprice = 0;
			int carquantity = 0;
			String carimage = "";
			int bid = 0;
			int cid = 0;
			
			String sql = "insert into car(carname,carprice,carquantity,carimage,bid,cid) values(?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			

			List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
			
			for (FileItem item1 : multiparts) {
				if (item1.isFormField()) {
					if (item1.getFieldName().equals("carname"))
						carname = item1.getString();

					if (item1.getFieldName().equals("carprice"))
						carprice = Integer.parseInt(item1.getString());

					if (item1.getFieldName().equals("carquantity"))
						carquantity = Integer.parseInt(item1.getString());
					

					if (item1.getFieldName().equals("bname"))
						{
						if(item1.getString().equals("Fiat"))
							bid = 1;
						if(item1.getString().equals("Volkswagen"))
							bid = 2;
						if(item1.getString().equals("Audi"))
							bid = 3;
						if(item1.getString().equals("Mercedes-Benz"))
							bid = 4;
						if(item1.getString().equals("BMW"))
							bid = 5;
						if(item1.getString().equals("Porsche"))
							bid = 6;
						if(item1.getString().equals("Ferrari"))
							bid = 7;
						if(item1.getString().equals("Tesla"))
							bid = 8;
						if(item1.getString().equals("Jeep"))
							bid = 9;
						if(item1.getString().equals("Alfa Romeo"))
							bid = 10;
						}
					if (item1.getFieldName().equals("cname"))
					{
						if(item1.getString().equals("Berlina"))
							cid = 1;
						if(item1.getString().equals("Suv"))
							cid = 2;
						if(item1.getString().equals("Elettrica"))
							cid = 3;
						if(item1.getString().equals("Di Lusso"))
							cid = 4;
					}

				}
				
				else
					{
					carzone.com.utility.MyUtilities m1=new MyUtilities();
					String destinationpath=path + "images/";
					ArrayList <String> ext=new ArrayList();
					ext.add(".jpg");ext.add(".bmp");ext.add(".jpeg");ext.add(".png");ext.add(".webp");
					
					carimage = m1.UploadFile(item1, destinationpath, ext);
					
					}
			}
			
			if(carimage.equals("Problema con upload") == false)
			{
				
				
				ps.setString(1, carname);
				ps.setInt(2,carprice);
				ps.setInt(3,carquantity);
				ps.setString(4,carimage);
				ps.setInt(5,bid);
				ps.setInt(6,cid);
				ps.executeUpdate();
				a = 1;
			}
			
			System.out.println("carname: " + carname);
			System.out.println("carprice: " + carprice);
			System.out.println("carquantity: " + carquantity);
			System.out.println("carimage: " + carimage);
			System.out.println("bid: " + bid);
			System.out.println("cid: " + cid);

			
			conn.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	return a;
		
	}

public Product getProductById(int carid) {
    Product product = null;
    try {
        String sql = "SELECT * FROM car WHERE carid=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, carid);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            product = new Product();
            product.setCarid(rs.getInt("carid"));
            product.setCarname(rs.getString("carname"));
            product.setCarprice(rs.getInt("carprice"));
            product.setCarquantity(rs.getInt("carquantity"));
            product.setCarimage(rs.getString("carimage"));
            product.setCarDescription(rs.getString("description"));
            product.setBid(rs.getInt("bid"));
            product.setCid(rs.getInt("cid"));
        }
        rs.close();
        ps.close();
    } catch (Exception e){
        System.out.println(e);
    }
    return product;
}


    
    public int updateaproductname(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set carname=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, p.getCarname());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}
    
    
    
    public int updateaproductdescription(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set description=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, p.getCarDescription());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}
    
    // Metodo per aggiornare il prezzo del prodotto
   
    public int updateproductprice(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set carprice=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, p.getCarprice());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}
    
	
    
    
    public int updateproductquantity(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set carquantity=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, p.getCarquantity());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}
    
    
    public int updateaproductimage(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set carimage=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, p.getCarimage());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}
    
    
    
    public int updateaproductbrandid(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set bid=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, p.getBid());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}
    
   
    
    public int updateaproductcategoryid(Product p) {
		
		int i = 0;
		try{
			String sql = "update car set cid=? WHERE carid=?" ;
			PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, p.getCid());
		ps.setInt(2, p.getCarid());
	
		
		i = ps.executeUpdate();
		if(i > 0)
			i = 1;
		
		
		}catch(Exception ex){
		   System.out.println(ex.getMessage());
		}

	return i;
		
		
		
	}











//delete product 
public boolean deleteProduct(Product p)
{
	boolean f = false;
	
	try {
		
		String sql = "delete from car where carid = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getCarid());
		
		
		
		int i = ps.executeUpdate();
		
		
		if(i == 1)
		{
			f = true;
		}
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return f;
}


	
	
	



//list Product

	public List<Product> getAllProducts() {
      List<Product> list = new ArrayList<>();
      try {
          String sql = "SELECT * FROM car";
          PreparedStatement ps = conn.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              Product p = new Product();
              p.setCarid(rs.getInt("carid"));
              p.setCarname(rs.getString("carname"));
              p.setCarprice(rs.getInt("carprice"));
              p.setCarquantity(rs.getInt("carquantity"));
              p.setCarimage(rs.getString("carimage"));
              p.setCarDescription(rs.getString("description"));
              p.setBid(rs.getInt("bid"));
              p.setCid(rs.getInt("cid"));
              list.add(p);
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return list;
  }


//display all customers

public List<customer> getAllCustomer()
{
	List<customer> list = new ArrayList <customer>();
	
	customer c = null;
	
	try {
		String sql = "select * from customer";
		PreparedStatement ps = conn.prepareStatement(sql);
		
	ResultSet rs = ps.executeQuery();
	
	while(rs.next())
	{
		c = new customer();
		c.setName(rs.getString(1));
		c.setPassword(rs.getString(2));
		c.setEmail_Id(rs.getString(3));
		c.setContact_Number(rs.getInt(4));
		list.add(c);
		
	}
	
	
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return list;
}


//Delete Customer

	public boolean deleteCustomer(customer c)
	{
		boolean f = false;
		
		try {
			
			String sql = "delete from customer where Name = ? and Email_Id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail_Id());
			
			
			int i = ps.executeUpdate();
			
			
			if(i == 1)
			{
				f = true;
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	
	// display selected customer

public List<customer> getCustomer(String eid)
{
	List<customer> list = new ArrayList <customer>();
	
	customer c = null;
	
	try {
		String sql = "select * from customer where Email_Id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, eid);
	ResultSet rs = ps.executeQuery();
	
	while(rs.next())
	{
		c = new customer();
		c.setName(rs.getString(1));
		c.setPassword(rs.getString(2));
		c.setEmail_Id(rs.getString(3));
		c.setContact_Number(rs.getInt(4));
		list.add(c);
		
	}
	
	
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return list;
}
	
}
