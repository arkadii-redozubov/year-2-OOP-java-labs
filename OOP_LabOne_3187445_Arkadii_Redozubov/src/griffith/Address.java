//Arkadii Redozubov, 3187445
package griffith;

public class Address {
//	declare encapsulated private attributes
	private String eircode;
	private String streetName;
	private String cityTown;
//	instance of Location class
	private Location location;
	
//	constructor, initializes Address attributes and Location object (Aggregation)
	public Address(String eircode, String streetName, String cityName, Location location) {
		this.eircode = eircode;
		this.streetName = streetName;
		this.cityTown = cityName;
		this.location = location;
	}
	
//	Getters and Setters
	public String getEircode() {
		return eircode;
	}
	public void setEircode(String eircode) {
		this.eircode = eircode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityTown() {
		return cityTown;
	}
	public void setCityName(String cityName) {
		this.cityTown = cityName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
//	Returns full address as a String
	public String getFullAddress() {
		return "\n   Eircode: " + eircode + " \n   Street: " + streetName + " \n   City/Town: " + cityTown;
	}

}
