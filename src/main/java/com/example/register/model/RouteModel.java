package com.example.register.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class RouteModel{
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int routeId;
	private String startPoint;
	private String endPoint;
	private int distance;
	
	
	public RouteModel() {
		super();
	}
	public RouteModel(int routeId, String startPoint, String endPoint, int distance) {
		super();
		this.routeId = routeId;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.distance = distance;
	}
	public int getRouteId() {
		return routeId;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public int getDistance() {
		return distance;
	}
	public void setRouteId(int routeId ) {
		this.routeId=routeId;
	}
	public void  setStartPoint(String startPoint) {
		this.startPoint=startPoint;
	}
	public void  setEndPoint(String endPoint) {
		this.endPoint=endPoint;
	}
	public void setDistance(int distance) {
		this.distance=distance;
	}
	
	@Override
	public String toString() {
		return "routeId :"+routeId+" startPoint :"+startPoint+" endPoint :"+endPoint+" distance :"+distance;
		
	}
	
	
	
	

}