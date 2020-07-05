
/* This class is for the Normal Vehicles.
   This class extends Vehicles class as Normal vehicles has the 
   same vehicles properties defined in Vehicles class.
*/

public class Normal extends Vehicles {
	
	private String EngineType;

	//Inheriting parents class properties
	public Normal(String modelNumber, double enginePower, double tireSize) {
		super(modelNumber, enginePower, tireSize);
		
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
		return "EngineType = " + this.EngineType + ", ModelNumber = " + this.getModelNumber() + ", EnginePower = "
				+ this.getEnginePower() + ", TireSize = " + this.getTireSize() ;
	}
	
	
}
