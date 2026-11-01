//Arkadii Redozubov, 3187445
package griffith;

public class Building {
//	declare encapsulated private attributes
	private String name;
	private int buildingNumber;
	private Address address;
	
//	constructor, initializes Building attributes and Address object(Aggregation)
	public Building(String name, int buildingNumber, Address adress) {
		this.name = name;
		this.buildingNumber = buildingNumber;
		this.address = adress;
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address adress) {
		this.address = adress;
	}

//	Returns full Building details followed by the Address details as a String
	public String getInfo() {
		return "\nBuilding: " + name + " \nBuilding number: " + buildingNumber + " \nAddress: " + address.getFullAddress();
	}
}
