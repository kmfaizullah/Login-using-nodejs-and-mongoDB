import java.util.Scanner;
/* 
 This class contains all the required variables and functions to complete Vehicle Showroom.
 As a common property of all classes and for allocating memory once I used Static variables and functions 
 outside the main method.
 
 */
 
public class Main {
	static Scanner scan = new Scanner (System.in);
	/* This is required to trace the different types of car in the showroom and the visitor.*/
	static int  LengthNormal = 0;
	static int  LengthSports = 0;
	static int  LengthHeavy  = 0;
	static int totalvahicles = 0;
	static int totalVisitor = 30;
	
	
	/*Three different car object array is defined to store three different types of Vehicles.
	  Maximum capacity of each array is defined 100.
	  These array will be used to store the cars, delete the cars, show the cars.
	 */
	static Normal [] normal = new Normal[100];
	static Sports [] sports = new Sports[100];
	static Heavy  [] heavy  = new Heavy[100];
	
	static String ModelNumber() {
		/* This method is for taking model number from user.
		 	Return : Model Number, Data type : String
		 */
		System.out.println("Enter the model number : ");
		scan.nextLine();
		String model = scan.nextLine();
		return model;
	}
	
	static String EngineType() {
		/* This method is for taking Engine Type from user.
		 * The engine type can be three gas, oil and diesel.
		 * Checked the type of engine.
	 	   Return : Engine Type, Data type : String
	    */
		System.out.println("Enter the engine type : ");
		scan.nextLine();
		String engine = scan.nextLine();
		if((engine.equals("oil"))||(engine.equals("gas"))||engine.equals("diesel")) {
			
		}
		else {
			System.out.println("Enter either oil, gas or diesel");
			EngineType();
		}
		return engine;
	}
	
	static double TireSize() {
		/* This method is for taking tire size from user.
	 	   Return : Tire Size, Data type : double
	    */
		System.out.println("Enter Tire Size : ");
		double tire = scan.nextDouble();
		return tire;
	}
	
	static double EnginePower() {
		/* This method is for taking Engine Power from user.
	 	   Return : Engine Power, Data type : double
	    */
		System.out.println("Enter Engine power value : ");
		double power = scan.nextDouble();
		return power;
	}
	
	static void AddNormal() {
		/* This method is for adding Normal cars into array as an object.
	 	   Return : void
	    */
		String model = ModelNumber();
		String engine = EngineType();
		double tire = TireSize();
		double power = EnginePower();
		
		Normal normal_car = new Normal(model,power,tire);
		normal_car.setEngineType(engine);
		normal[LengthNormal]= normal_car;
		LengthNormal++;
		totalvahicles++;
	}
	
	static void AddSports() {
		/* This method is for adding sports cars as object.
		 * after adding one sports car visitor number will increase by 2.
		 * engine type is defined oil as it has only oil type engine.
	 	   Return : void
	    */
		String model = ModelNumber();
		String engine = "oil";
		double tyre = TireSize();
		double power = EnginePower();
		System.out.println("Inster turbo value true or false : ");
		boolean turbo = scan.nextBoolean();
		
		Sports sport_car = new Sports (model,power,tyre);
		sport_car.setEngineType(engine);
		sport_car.setTurbo(turbo);
		sports[LengthSports]= sport_car;
		LengthSports++;
		totalvahicles++;
		totalVisitor = totalVisitor + 20;
	}
	
	static void AddHeavy() {
		/* This method is for adding Heavy cars into array as an object.
		 * it has only diesel engine.
	 	   Return : void
	    */
		String model = ModelNumber();
		String engine = "diesel";
		double tyre = TireSize();
		double power = EnginePower();
		System.out.println("Inster weight value : ");
		double weight = scan.nextDouble();
		Heavy heavy_car = new Heavy (model,power,tyre);
		heavy_car.setEngineType(engine);
		heavy_car.setWeight(weight);
		heavy[LengthHeavy]= heavy_car;
		LengthHeavy++;
		totalvahicles++;
	}
	
	static void RemoveNormal() {
		/* This method is for removing Normal cars.
		 * each time it remove one car.
		 * after removing total vehicle and normal vehicle will reduce by 1.
	 	   Return : void
	    */
		System.out.println("Enter Model number to remove : ");
		scan.nextLine();
		String model = scan.nextLine();
		for(int i =0;i<LengthNormal; i++) {
			if(normal[i].getModelNumber().equals(model)) {
				for(int j = i; j<(LengthNormal-1);j++) {
					normal[j]= normal[j+1];
				}
				break;
			}
		}
		LengthNormal--;
		totalvahicles--;
	}
	
	static void RemoveSports() {
		/* This method is for removing sports cars.
		 * each time it remove one car.
		 * after removing total vehicle and sports vehicle will reduce by 1 and vistor will drop by 20.
	 	   Return : void
	    */
		System.out.println("Enter Model number to remove : ");
		scan.nextLine();
		String model = scan.nextLine();
		for(int i =0;i<LengthSports; i++) {
			if(sports[i].getModelNumber().equals(model)) {
				for(int j = i; j<(LengthSports-1);j++) {
					sports[j]= sports[j+1];
				}
				break;
			}
		}
		LengthSports--;
		totalvahicles--;
		totalVisitor = totalVisitor -20;
	}
	
	static void RemoveHeavy() {
		/* This method is for removing Heavy cars.
		 * Each time it remove one car.
		 * after removing total vehicle and heavy vehicle will reduce by 1.
	 	   Return : void
	    */
		System.out.println("Enter Model number to remove : ");
		scan.nextLine();
		String model = scan.nextLine();
		for(int i =0;i<LengthHeavy; i++) {
			if(heavy[i].getModelNumber().equals(model)) {
				for(int j = i; j<(LengthHeavy-1);j++) {
					heavy[j]= heavy[j+1];
				}
				break;
			}
		}
		LengthHeavy--;
		totalvahicles--;
	}
	
	static void ShowNormal() {
		/* This method is for showing the normal cars.
		 * If car is not added, it will show message to user.
		 * If card is added, it will show the car details.
	 	   Return : void
	    */
		if(LengthNormal==0) {
			System.out.println("Sorry!!! Normal car is yet to add!");
		}
		else {
			for(int i =0;i<LengthNormal;i++) {
				System.out.print(normal[i].toString() + " ");
				System.out.println();
			}
			
			System.out.println();
		}
	}
	
	static void ShowSports() {
		/* This method is for showing the Sports cars.
		 * If car is not added, it will show message to user.
		 * If card is added, it will show the car details.
	 	   Return : void
	    */
		if(LengthSports==0) {
			System.out.println("Sorry!!! Sports car is yet to add!");
		}
		else {
			for(int i =0;i<LengthSports;i++) {
				System.out.print(sports[i].toString() + " ");
				System.out.println();
			}
			
			System.out.println();
		}
	}
	
	static void ShowHeavy() {
		/* This method is for showing the Heavy cars.
		 * If car is not added, it will show message to user.
		 * If card is added, it will show the car details.
	 	   Return : void
	    */
		if(LengthHeavy==0) {
			System.out.println("Sorry!!! Heavy car is yet to add!");
		}
		else {
			for(int i =0;i<LengthHeavy;i++) {
				System.out.print(heavy[i].toString() + " ");
				System.out.println();
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		/* This method main method.
		 * Program will start from here.
		 * Infinite loop has been used here to keep user within the system until press exit value.
		 * Normal, Sports and Heavy car is added, removed and showed separately.
	    */
		Scanner sc = new Scanner (System.in);
		int exit = 1;
		while(exit !=0) {
			System.out.println();
			System.out.println("************************** User Dashboard*************************");
			System.out.println();
			System.out.println("Insert 0 for exit, 1 for Add vehicles, 2 for Remove Vehicles, "
					+ "3 for Show Vehicles and 4 for show vichle list and visitor");
			System.out.println("1. Add Vehicles");
			System.out.println("2. Remove Vehicles");
			System.out.println("3. Show Vehicles");
			System.out.println("4. Show vihicles and User list");
			System.out.println("0. Exit from User Dashboard");
			System.out.println();
			System.out.println("******************************************************************");
			System.out.println("******************************************************************");
			System.out.println("Enter your desired Option Number : ");
			int val = sc.nextInt();
			if(val==1) {
				int exit_add = 1;
				while(exit_add != 0) {
					System.out.println("******************************Options************************");
					System.out.println();
					System.out.println("Insert 0 for exit, 1 for Add Normal vehicles, 2 for Add Sports Vehicles and 3 for Add Heavy Vehicles");
					System.out.println("1. Add Normal Vehicles");
					System.out.println("2. Add Sports Vehicles");
					System.out.println("3. Add Heavy Vehicles");
					System.out.println("0. Exit from Add Dashboard to main dashboard");
					System.out.println();
					System.out.println("*************************************************************");
					System.out.println("*************************************************************");
					System.out.println("Enter your desired Option Number : ");
					int add_val = sc.nextInt();
					
					if(add_val==1) {
						System.out.println("*********************************************************");
						System.out.println("Add Normal Vehicles");
						System.out.println("*********************************************************");
						AddNormal(); //calling addNormal static method to add normal car.
					}
					else if(add_val == 2) {
						System.out.println("*********************************************************");
						System.out.println("Add Sports Vehicles");
						System.out.println("*********************************************************");
						AddSports(); //calling addSports static method to add sports car.
					}
					else if(add_val==3) {
						System.out.println("********************************************************");
						System.out.println("Add Heavy Vehicles");
						System.out.println("********************************************************");
						AddHeavy(); //calling addHeavy static method to add Heavy car.
					}
					else if(add_val == 0) {
						exit_add = 0;
					}
				}
				
			}
			else if(val == 2) {
				int exit_remove = 1;
				while(exit_remove != 0) {
					System.out.println("******************************Options***************************");
					System.out.println();
					System.out.println("Insert 0 for exit, 1 for Remove Normal vehicles, 2 for Remove Sports Vehicles and 3 for Remove Heavy Vehicles");
					System.out.println("1. Remove Normal Vehicles");
					System.out.println("2. Remove Sports Vehicles");
					System.out.println("3. Remove Heavy Vehicles");
					System.out.println("0. Exit from Remove dashboard to main dashboard");
					System.out.println();
					System.out.println("*****************************************************************");
					System.out.println("*****************************************************************");
					System.out.println("Enter your desired Option Number : ");
					int remove_val = sc.nextInt();
					
					if(remove_val==1) {
						System.out.println("*************************************************************");
						System.out.println("Remove Normal Vehicles");
						System.out.println("*************************************************************");
						RemoveNormal(); //calling removeNormal static method to remove normal car.
					}
					else if(remove_val == 2) {
						System.out.println("*************************************************************");
						System.out.println("Remove Sports Vehicles");
						System.out.println("*************************************************************");
						RemoveSports(); //calling removeSports static method to remove sports car.
					}
					else if(remove_val==3) {
						System.out.println("************************************************************");
						System.out.println("Remove Heavy Vehicles");
						System.out.println("************************************************************");
						RemoveHeavy(); //calling removeHeavy static method to remove Heavy car.
					}
					else if(remove_val == 0) {
						exit_remove = 0;
					}
				}
			}
			else if(val == 3) {
				int exit_show = 1;
				while(exit_show != 0) {
					System.out.println("****************************Options**************************");
					System.out.println();
					System.out.println("Insert 0 for exit, 1 for Remove Normal vehicles, 2 for Remove Sports Vehicles and 3 for Remove Heavy Vehicles");
					System.out.println("1. Show Normal Vehicles");
					System.out.println("2. Show Sports Vehicles");
					System.out.println("3. Show Heavy Vehicles");
					System.out.println("0. Exit from Show dashboard to main dashboard");
					System.out.println();
					System.out.println("*************************************************************");
					System.out.println("Enter your desired Option Number : ");
					int show_val = sc.nextInt();
					
					if(show_val==1) {
						System.out.println("****************************************************************");
						System.out.println("Normal Vehicles");
						System.out.println("****************************************************************");
						ShowNormal(); //calling ShowNormal static method to show the Normal car
					}
					
					else if(show_val == 2) {
						System.out.println("****************************************************************");
						System.out.println("Sports Vehicles");
						System.out.println("****************************************************************");
						ShowSports(); //calling ShowSports static method to show the Sports car
					}
					
					else if(show_val==3) {
						System.out.println("****************************************************************");
						System.out.println("Heavy Vehicles");
						System.out.println("****************************************************************");
						ShowHeavy(); ////calling ShowHeavy static method to show the Heavy car
					}
					else if(show_val == 0) {
						exit_show = 0;
					}
				}
				
			}
			else if(val == 4) {
				/*
				 * This will show the visitor number, total car numbers and will show all the cars
				 */
				System.out.println("************************************************************************");
				if(totalvahicles==0) {
					System.out.println("Visitor Number is : " + 0);
				}
				else {
					System.out.println("Visitor Number is : " + totalVisitor);
				}
				System.out.println("Total car in this showroom is : " + totalvahicles );
				System.out.println("Currently available total Normal car : " + LengthNormal);
				System.out.println("Currently available total Sports car : " + LengthSports);
				System.out.println("Currently available total Heavy car : " + LengthHeavy);
				System.out.println();
				System.out.println("**************************************************************************");
				System.out.println();
				System.out.println("***************************Cars of this Showroom**************************");
				System.out.println();
				ShowNormal();
				ShowSports();
				ShowHeavy();
			}
			else if (val == 0) {
				System.out.println("Thank you !!!");
				exit = 0;
			}
		}
	}
}
