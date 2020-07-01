
public class Vehicles {
	
	//defining class properties
	//defined properties as private so that it can not be accessed from other classes
	
	private String ModelNumber;
	private double EnginePower;
	private double tireSize;
	
	//defining constructor except EngineType. 
	//Based on the problem definition EngineType will be taken using setter method
	public Vehicles(String modelNumber, double enginePower, double tireSize) {
		this.ModelNumber = modelNumber;
		this.EnginePower = enginePower;
		this.tireSize = tireSize;
	}
	
	//This will return ModelNumber
	public String getModelNumber() {
		return this.ModelNumber;
	}
	
	//This is setter method to set ModelNumber
	public void setModelNumber(String modelNumber) {
		this.ModelNumber = modelNumber;
	}
	
	
	//This is getter method to get EnginePower
	//This will return a double type value
	public double getEnginePower() {
		return this.EnginePower;
	}

	//This is setter method to set Engine value
	//It will take double data type value as a parameter
	public void setEnginePower(double enginePower) {
		this.EnginePower = enginePower;
	}

	//This is getter method for getting TireSize
	//This method will return a double data type value
	public double getTireSize() {
		return this.tireSize;
	}

	//This is setter method to set TireSize
	//This method will take double type data as a parameter
	public void setTireSize(double tireSize) {
		this.tireSize = tireSize;
	}

	
}
