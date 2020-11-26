package com.christien.springboot.objects;

import org.springframework.beans.factory.annotation.Autowired;

public class Hunter {
	
	private Archer archer;
	private License license;
	
	public Hunter(Archer archer, License license) {
		this.archer = archer;
		this.license = license;
	}

	public Archer getArcher() {
		return archer;
	}

	public void setArcher(Archer archer) {
		this.archer = archer;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Hunter [archer=" + archer + ", license=" + license + "]";
	}

}
