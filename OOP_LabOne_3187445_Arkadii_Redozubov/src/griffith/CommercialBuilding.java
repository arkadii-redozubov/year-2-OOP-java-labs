//Arkadii Redozubov, 3187445
package griffith;

//Extends Building class, inheriting its attributes and methods
public class CommercialBuilding extends Building{
//	declare encapsulated private attributes
	private String openingHours;
	
//	constructor, initializes CommercialBuilding attributes and inherited Building attributes
	public CommercialBuilding(String openingHours, String buildingName, int buildingNumber, Address adress) {
//		initialize inherited Building attributes 
		super(buildingName,buildingNumber,adress);
		this.openingHours = openingHours;
	}
	
//	second constructor, sets opening hours to null if it wasn't entered 
	public CommercialBuilding(String buildingName, int buildingNumber, Address adress) {
		super(buildingName,buildingNumber,adress);
		this.openingHours = null;
	}

//	Getters and Setters
	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	
//	Override existing method in parent Building, return CommercialBuilding details followed by Building details
	@Override
	public String getInfo() {
		return "Commercial building: " + super.getInfo()+ " \nOpening hours:\n" + openingHours ;
	}
	
	

}
