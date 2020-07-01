
/* This class is for the Sports Vehicles.
   This class extends Vehicles class as Sports vehicles has the 
   same vehicles properties defined in Vehicles class. 
   Additionally this class has two extra properties.
*/
public class Sports extends Vehicles{
	
	//defining class properties
	private boolean Turbo;
	private String EngineType;

	//Inheriting parent class properties using Super
	public Sports(String modelNumber, double enginePower, double tireSize) {
		super(modelNumber, enginePower, tireSize);
		
	}

	//This will return a boolean value for Turbo
	public boolean isTurbo() {
		return this.Turbo;
	}

	//This method is for setting Turbo values as a boolean
	public void setTurbo(boolean turbo) {
		this.Turbo = turbo;
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
		return "Turbo = " + this.Turbo + ", EngineType=" + this.EngineType + ", ModelNumber = " + this.getModelNumber()
				+ ", EnginePower = " + this.getEnginePower() + ", TireSize = " + this.getTireSize() ;
	}
	
	
	
	
	 
}
