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
@Setter
@Getter
@ToString
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
	
	@Column(name = "unit_in_stock")
	private int unitsInStock;
	
	@Column(name = "date_created")
	private Date createdOn;
	
	@Column(name = "last_updated")
	private Date updatedOn;
	
	// mapping
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private BookCategory category;
	

}
