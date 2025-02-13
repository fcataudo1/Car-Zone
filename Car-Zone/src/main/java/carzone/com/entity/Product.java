package carzone.com.entity;

public class Product {
	
	private int carid;
	private String carname;
	private int carprice;
	private int carquantity;
	private String carimage;
	private String description;
	
	
	private int bid;
	private int cid;
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int pid) {
		this.carid = pid;
	}
	
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarprice() {
		return carprice;
	}
	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}
	public int getCarquantity() {
		return carquantity;
	}
	public void setCarquantity(int carquantity) {
		this.carquantity = carquantity;
	}
	public String getCarimage() {
		return carimage;
	}
	public void setCarimage(String carimage) {
		this.carimage = carimage;
	}
	public String getCarDescription() {
		return description;
	}
	public void setCarDescription(String description) {
		this.description = description;
	}
	
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
}
