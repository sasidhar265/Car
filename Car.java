package car;

public class Car 
{
	final static String manufacturerCompany="AUDI";
	//private static String carObjectCount;
	private String carName;
	private String carNumber;
	private int capacityofTank;
	private int carMaxSpeed;
	private int runingSpeed;
	private int fuelInTank;
	private String origin;
	private String destination;
	private String time;
	private boolean headLights;
	private Driver driver;
	
	
	public String setcarName(String carName)
	{
		this.carName = carName;
		if (carName.length()>=2 && carName.length()<=10)
		{
			System.out.println("Car Model   	 		:"+carName);
		}
		else
		{
			System.out.println("Car Name is Invald");
		}
		return carName;
	}
	public String getcarName()
	{
		return carName;
	}
	
	public String setCarNumber(String carNumber) 
	{
		this.carNumber = carNumber;
		{
		String upperCaseChars = "(.*[A-Z].*)";//need to understand why there is .* mandatory. without we cannot get accurate results.
	 	String numbers = "(.*[0-9].*)";
	 	String lowerCaseChars = "(.*[a-z].*)";

	 	if (carNumber.length()>=5 && carNumber.length()<=10)
	    {
	 		if (carNumber.matches(upperCaseChars))
	 			{          
	 				if (!carNumber.matches(lowerCaseChars))
	 				{
	 					if (carNumber.matches(numbers))
	 					{ 
	 						System.out.println("Car Number is    		:"+carNumber);
	 					}
	 					else
	 					{
	 						System.out.println(" invalid car number ");
	 					}
	 				}
	 				else
	 				{
	 					System.out.println(" invalid car number because you entered lowercase alphabet ");
	 				}
	 			}
	 		else
	 		{
	 			System.out.println(" invalid car number because you didn't entered uppercase alphabet ");
	 		}
	    }
	 	else
	 	{
	 		System.out.println(" invalid car number because you entered wrong format.");
	 	}
		}
		return carNumber;
	}
	public String getCarNumber() 
	{
		return carNumber;
	}
	
	public int setcapacityofTank(int capacity)
	{
		this.capacityofTank = capacity;
		if (capacity > 0 && capacity < 100)
		{
			System.out.println("Capacity of Fuel Tank 		:"+capacity);
		}
		else
		{
			System.out.println("Invalid Capacity");
		}
		return capacityofTank;
	}	
	public int getcapacityofTank()
	{
		return capacityofTank;
	}
	
	public int setcarMaxSpeed(int maxspeed)
	{
		this.carMaxSpeed = maxspeed;
		if(carMaxSpeed < 300)
		{
			System.out.println("Car Maximum Speed is 		:"+maxspeed);
		}
		else
		{
			System.out.println("Car OverSpeeded");
		}
		return maxspeed;
	}
	public  int getcarMaximumSpeed()
	{
		return carMaxSpeed;
	}
	
	public int setruningSpeed(int runspeed)
	{
		this.runingSpeed = runspeed; 
		if(runspeed < 120)
		{
			System.out.println("Car Running Speed is 		:"+runingSpeed);
		}
		else
		{
			System.out.println("Car is not Running");
		}
		return runspeed;
	}
	public int getruningSpeed()
	{
		return runingSpeed;
	}
	
	public int setfuelInTank(int fuel)
	{
		this.fuelInTank = fuel;
		//int reserved = fuel+fuelInTank;
		if(fuel > capacityofTank)
		{
			System.out.println("Fuel Tank is Full and Stop Filling");
		}
		else if (fuel < capacityofTank)
		{
			System.out.println("Fuel Tank is  			:"+fuel);
		}
		/*else if (reserved < 10)
		{
			System.out.println("Fuel is in Reserved Point");
		}*/
		else
		{
			System.out.println("Fuel Tank is Empty");
		}
		return fuel;
	}
	public int getfuelInTank()
	{
		return fuelInTank;
	}
	
	public void setOrigin(String origin) 
	{
		this.origin = origin;
		if (origin != destination)
		{
			System.out.println("Car Origin Point is 		:"+origin);
		}
		else
		{
			System.out.println("Origin point and Destination is Same");
		}
	}
	public String getOrigin() 
	{
		return origin;
	}
	
	public void setDestination(String destination) 
	{
		this.destination = destination;
		if (destination != origin)
		{
			System.out.println("Car Destination Point is 	:"+destination);
		}
		else
		{
			System.out.println("Destination point and Origin is Same");
		}
	}
	public String getDestination() 
	{
		return destination;
	}
	
	public void setTime(String time) 
	{
		this.time = time;
	}
	public String getTime() 
	{
		return time;
	}
	
	public void setHeadLights(boolean headLights) 
	{
		this.headLights = headLights;
		if(headLights==true)
		{
			System.out.println("Car HeadLights are 		:ON");
		}
		else
		{
			System.out.println("Car HeadLights are 		:OFF");
		}
	}
	public boolean isHeadLights() 
	{
		return headLights;
	}
	
	public void setDriver(Driver driver) 
	{
		this.driver = driver;
	}
	public Driver getDriver() 
	{
		return driver;
	}
	
	
	public void fillFuel(int fuel,Car[] c)
	{
		if (fuel > 0)
		{
			if (fuel < capacityofTank)
			{
				int t = fuel+fuelInTank;
				if(t < capacityofTank || t == capacityofTank)
				{
					System.out.println("Fuel in Tank after Filling 	:"+t);
				}
				else
				{
					System.out.println("Already Tank is Full Stop Filling");
				}
			}
		}
		else
		{
			System.out.println("Invalid Fuel Input");
		}
	}
	
	public void accelerate(int speed, Car[] c)
	{
		if (speed > 0)
		{
			if (speed < carMaxSpeed)
			{
				int t = speed+runingSpeed;
				if(t < carMaxSpeed || t == carMaxSpeed)
				{
					System.out.println("Car Running Speed 		:"+t);
					int fuel = --fuelInTank;
					System.out.println("Fuel in Tank 			:"+fuel);
					/*speed = speed*2;
					fuel = fuel-1;*/
				}
				else
				{
					System.out.println("Car is Over Speeded");
				}
			}
		}
		else if(speed == runingSpeed)
		{
			System.out.println("Car going at Running Speed only");
		}
		else
		{
			System.out.println("Invalid Car Speed");
		}
	}
	
	public boolean isLightsOn(boolean headLights, Car[] c)
	{	
		if(headLights == true)
		{
			System.out.println("The HeadLights of the car is ON");
		}
		else
		{
			System.out.println("The HeadLights of the car is OFF");
		}
		return headLights;
	}
}
