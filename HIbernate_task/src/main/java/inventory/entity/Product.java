package inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {

	@Id
	@Column(name="p_Id")
	private String productId;
	
	
	@Column(name="pname")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private float price;
	
	public Product() {
		super();
	}
	
	
	public Product(String productId, String name, String description, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
	}



	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
