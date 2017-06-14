package database;

import java.util.Date;

public class Track {

	private String car_id;
	private double longitude;
	private double latitude;
	private Date date;
	private double speed;
	private boolean is_idle;
	
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double lantitude) {
		this.latitude = lantitude;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public boolean isIs_idle() {
		return is_idle;
	}
	public void setIs_idle(boolean is_idle) {
		this.is_idle = is_idle;
	}

}
