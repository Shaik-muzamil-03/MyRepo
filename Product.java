package com.mvn.OnlineSportsAccessoriesStore.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iD;
	private String name;
	private int cost;
	private String sportType;
	

	@Embedded
	@Column(nullable = true)
	private Discounts discount;
	
	@ManyToMany
	private Set<Orders> manyOrders;
	
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub

	}
	
	public Product(int iD, String name, int cost, String sportType, Discounts discount, Set<Orders> manyOrders) {
			super();
			this.iD = iD;
			this.name = name;
			this.cost = cost;
			this.sportType = sportType;
			this.discount = discount;
			this.manyOrders = manyOrders;
		}



	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSportType() {
		return sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	public Discounts getDiscount() {
		return discount;
	}
	public void setDiscount(Discounts discount) {
		this.discount = discount;
	}
	public Set<Orders> getManyOrders() {
		return manyOrders;
	}
	public void setManyOrders(Set<Orders> manyOrders) {
		this.manyOrders = manyOrders;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, discount, iD, manyOrders, name, sportType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return cost == other.cost && Objects.equals(discount, other.discount) && iD == other.iD
				&& Objects.equals(manyOrders, other.manyOrders) && Objects.equals(name, other.name)
				&& Objects.equals(sportType, other.sportType);
	}
	@Override
	public String toString() {
		return "Product [iD=" + iD + ", name=" + name + ", cost=" + cost + ", sportType=" + sportType + ", discount="
				+ discount + ", manyOrders=" + manyOrders + "]";
	}

	
	
	

}
