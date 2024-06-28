package Linked.org.List;
import java.util.*;

public class ProductModule {

	private int id;
	private String pname;
	private int price;
	
	ProductDetails pd;
	
	public ProductDetails getPd() {
		return pd;
	}
	public void setPd(ProductDetails pd) {
		this.pd = pd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
