
/* This class is for the Heavy Vehicles.
   This class extends Vehicles class as Heavy vehicles has the 
   same vehicles properties defined in Vehicles class. 
   Additionally this class has two extra properties.
*/

public class Heavy extends Vehicles {
	
	//defining class properties
	private double Weight;
	private String EngineType;

	//Inheriting parent class properties
	public Heavy(String modelNumber, double enginePower, double tireSize) {
		super(modelNumber, enginePower, tireSize);
		
	}
	
	//This will return a double value as weight
	public double getWeight() {
		return this.Weight;
	}

	//This is setter method to set weight value
	public void setWeight(double weight) {
		this.Weight = weight;
	}
	
	//This is getter method to get EngineType
	//This method will return a String type value
	public String getEngineType() {
		return this.EngineType;
	}
	
	//This is setter method to set EngineType
	//This method will take a String type parameter
	public void setEngineType(String engineType) {
		this.EngineType = engineType;
	}

	//This is for showing all the values as a String
	public String toString() {
		return "Weight = " + this.Weight + ", EngineType = " + this.EngineType + ", ModelNumber = " + this.getModelNumber()
				+ ", EnginePower = " + this.getEnginePower() + ", TireSize = " + this.getTireSize();
	}


}
