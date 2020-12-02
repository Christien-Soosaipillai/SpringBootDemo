package com.christien.springbootdemo.common.Bow;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.christien.springbootdemo.common.user.Archer;

@Entity
public class Bow {
	
	@Id
	private int id;
	private String name;
	private double cost;
	@ManyToOne
	private Archer archer;

	public Bow() {}
	
	public Bow(int id, String name, double cost, Integer archerId) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.archer = new Archer(archerId, "", "", "", "");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Archer getArcher() {
		return archer;
	}

	public void setArcher(Archer archer) {
		this.archer = archer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
