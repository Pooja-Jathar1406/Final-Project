package com.pooja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ListOfPlaces")  
public class Places {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String nameOfPlace;
	String description;
	String location;
	String linkOnMap;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getNameOfPlace() {
		return nameOfPlace;
	}
	public void setNameOfPlace(String nameOfPlace) {
		this.nameOfPlace = nameOfPlace;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLinkOnMap() {
		return linkOnMap;
	}
	public void setLinkOnMap(String linkOnMap) {
		this.linkOnMap = linkOnMap;
	}
	
}
