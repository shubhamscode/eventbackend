package com.casestudy.events.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eventId;
	@NotNull(message = "Name shouldn't be null  ")
	private String eventName;
	@NotNull(message = "Cost shouldn't be null  ")
	private double eventCost;
	@NotNull(message = "Capacity shouldn't be null  ")
	private long Capacity;
	private boolean food;
	public Event(int eventId, String eventName, double eventCost, long capacity, boolean food) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventCost = eventCost;
		Capacity = capacity;
		this.food = food;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public double getEventCost() {
		return eventCost;
	}
	public void setEventCost(double eventCost) {
		this.eventCost = eventCost;
	}
	public long getCapacity() {
		return Capacity;
	}
	public void setCapacity(long capacity) {
		Capacity = capacity;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	
	

}
