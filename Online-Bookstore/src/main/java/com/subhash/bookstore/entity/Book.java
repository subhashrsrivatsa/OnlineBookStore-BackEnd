/**
 * 
 */
package com.subhash.bookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Subhash
 *
 */

@Entity
@Table(name="tbl_book")
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// since the names are same as that of the MySQL DB column names, no need to explicitly specify. JPA takes care of it
	private String sku;
	private String name;
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "image_url")
	private String imageURL;
	
	private boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	@Column(name = "date_created")
	private Date createdOn;
	
	@Column(name = "last_updated")
	private Date updatedOn;
	
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", unitPrice="
				+ unitPrice + ", imageURL=" + imageURL + ", active=" + active + ", unitsInStock=" + unitsInStock
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", category=" + category + "]";
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}



	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/**
	 * @return the unitPrice
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}



	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}



	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}



	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}



	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}



	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}



	/**
	 * @return the unitsInStock
	 */
	public int getUnitsInStock() {
		return unitsInStock;
	}



	/**
	 * @param unitsInStock the unitsInStock to set
	 */
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}



	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}



	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



	/**
	 * @return the updatedOn
	 */
	public Date getUpdatedOn() {
		return updatedOn;
	}



	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}



	/**
	 * @return the category
	 */
	public BookCategory getCategory() {
		return category;
	}



	/**
	 * @param category the category to set
	 */
	public void setCategory(BookCategory category) {
		this.category = category;
	}



	// mapping
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private BookCategory category;
	

}
