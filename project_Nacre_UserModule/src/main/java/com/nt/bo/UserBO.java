package com.nt.bo;

public class UserBO {
	private int userId;
	private String firstName;
	private String lastName;
	
	private long shipment_Id;
	private long customer_Id;
	private String resFrom;
	private String destination;
	private String shipment_date;
	private String res_date;
	private long amount_paid;
	private String ship_name;
	
	
	private long ship_id;
	private String operate_from;
	private String operate_to;
	private String launch_date;
	private String last_maintained;
	private long maintainance_cost;
	private String ship_type;
	
	private long shipres_id;
	private String jour_date;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getShipment_Id() {
		return shipment_Id;
	}
	public void setShipment_Id(long shipment_Id) {
		this.shipment_Id = shipment_Id;
	}
	public long getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(long customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getResFrom() {
		return resFrom;
	}
	public void setResFrom(String resFrom) {
		this.resFrom = resFrom;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getShipment_date() {
		return shipment_date;
	}
	public void setShipment_date(String shipment_date) {
		this.shipment_date = shipment_date;
	}
	public String getRes_date() {
		return res_date;
	}
	public void setRes_date(String res_date) {
		this.res_date = res_date;
	}
	public long getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(long amount_paid) {
		this.amount_paid = amount_paid;
	}
	public String getShip_name() {
		return ship_name;
	}
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}
	public long getShip_id() {
		return ship_id;
	}
	public void setShip_id(long ship_id) {
		this.ship_id = ship_id;
	}
	public String getOperate_from() {
		return operate_from;
	}
	public void setOperate_from(String operate_from) {
		this.operate_from = operate_from;
	}
	public String getOperate_to() {
		return operate_to;
	}
	public void setOperate_to(String operate_to) {
		this.operate_to = operate_to;
	}
	public String getLaunch_date() {
		return launch_date;
	}
	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}
	public String getLast_maintained() {
		return last_maintained;
	}
	public void setLast_maintained(String last_maintained) {
		this.last_maintained = last_maintained;
	}
	public long getMaintainance_cost() {
		return maintainance_cost;
	}
	public void setMaintainance_cost(long maintainance_cost) {
		this.maintainance_cost = maintainance_cost;
	}
	public String getShip_type() {
		return ship_type;
	}
	public void setShip_type(String ship_type) {
		this.ship_type = ship_type;
	}
	public long getShipres_id() {
		return shipres_id;
	}
	public void setShipres_id(long shipres_id) {
		this.shipres_id = shipres_id;
	}
	public String getJour_date() {
		return jour_date;
	}
	public void setJour_date(String jour_date) {
		this.jour_date = jour_date;
	}
	@Override
	public String toString() {
		return "UserBO [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", shipment_Id="
				+ shipment_Id + ", customer_Id=" + customer_Id + ", resFrom=" + resFrom + ", destination=" + destination
				+ ", shipment_date=" + shipment_date + ", res_date=" + res_date + ", amount_paid=" + amount_paid
				+ ", ship_name=" + ship_name + ", ship_id=" + ship_id + ", operate_from=" + operate_from
				+ ", operate_to=" + operate_to + ", launch_date=" + launch_date + ", last_maintained=" + last_maintained
				+ ", maintainance_cost=" + maintainance_cost + ", ship_type=" + ship_type + ", shipres_id=" + shipres_id
				+ ", jour_date=" + jour_date + "]";
	}
	
	
	

}
