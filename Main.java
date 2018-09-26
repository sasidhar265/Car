package car;

public class Main 
{
	public static Car findCars(String destination, Car[] c)
	{
		for (int i=0;i<c.length;i++)
		{
			if(c[i].getDestination() == destination)
			{
				System.out.println(c[i].getcarName());
			}
			else
			{
				System.out.println("No Cars Found On this route");
			}
		}
		return null;
	}
	
	public static Car findCars(String destination, String origin, Car[] c)
	{
		for (int i=0;i<c.length;i++)
		{
			if(c[i].getDestination() == destination  && c[i].getOrigin() == origin)
			{
				System.out.println(c[i].getcarName());
			}
			else
			{
				System.out.println("No Cars Found On this route");
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) 
	{
		Car[] c = new Car[10];
		for (int i=0;i<c.length;i++)
		{
			c[i] = new Car();
		}
		
		Driver[] d = new Driver[10];
		for (int i=0;i<d.length;i++)
		{
			d[i] = new Driver();
		}
			
			System.out.println("***First Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[0].setcarName("Audi R8");
			c[0].getcarName();
			c[0].setCarNumber("AP07BH1234");
			c[0].getcarName();
			c[0].setcapacityofTank(75);
			c[0].getcapacityofTank();
			c[0].setcarMaxSpeed(220);
			c[0].getcarMaximumSpeed();
			c[0].setruningSpeed(90);
			c[0].getruningSpeed();
			c[0].setfuelInTank(10);
			c[0].getfuelInTank();
			c[0].setOrigin("Ganapavaram");
			c[0].getOrigin();
			c[0].setDestination("Kphb");
			c[0].getDestination();
			c[0].setTime("22:00");
			c[0].getTime();
			c[0].setHeadLights(true);
			c[0].isHeadLights();
			d[0].setName("Sasidhar");
			d[0].getName();
			d[0].setId("DT-1234");
			d[0].getId();
			c[0].fillFuel(5, c);
			c[0].accelerate(5, c);
			c[0].isHeadLights();
			System.out.println();
			
			
			System.out.println("***Second Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[1].setcarName("Audi Q7");
			c[1].getcarName();
			c[1].setCarNumber("TS07CH2580");
			c[1].getCarNumber();
			c[1].setcapacityofTank(85);
			c[1].getcapacityofTank();
			c[1].setcarMaxSpeed(180);
			c[1].getcarMaximumSpeed();
			c[1].setruningSpeed(100);
			c[1].getruningSpeed();
			c[1].setfuelInTank(50);
			c[1].getfuelInTank();
			c[1].setOrigin("Vijayawada");
			c[1].getOrigin();
			c[1].setDestination("Kphb");
			c[1].getDestination();
			c[1].setTime("21:00");
			c[1].getTime();
			c[1].setHeadLights(true);
			c[1].isHeadLights();
			d[1].setName("Sasi");
			d[1].getName();
			d[1].setId("21224");
			d[1].getId();
			c[1].fillFuel(5, c);
			c[1].accelerate(5, c);
			c[1].isHeadLights();
			System.out.println();
			
			System.out.println("***Third Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[2].setcarName("Audi A7");
			c[2].getcarName();
			c[2].setCarNumber("AP21BD5618");
			c[2].getCarNumber();
			c[2].setcapacityofTank(90);
			c[2].getcapacityofTank();
			c[2].setcarMaxSpeed(180);
			c[2].getcarMaximumSpeed();
			c[2].setruningSpeed(10);
			c[2].getruningSpeed();
			c[2].setfuelInTank(30);
			c[2].getfuelInTank();
			c[2].setOrigin("Guntur");
			c[2].getOrigin();
			c[2].setDestination("Kphb");
			c[2].getDestination();
			c[2].setTime("20:00");
			c[2].getTime();
			c[2].setHeadLights(false);
			c[2].isHeadLights();
			d[2].setName("Naveen");
			d[2].getName();
			d[2].setId("D-456987");
			d[2].getId();
			c[2].fillFuel(5, c);
			c[2].accelerate(5, c);
			c[2].isHeadLights();
			System.out.println();
			
			System.out.println("***Fourth Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[3].setcarName("Audi Q5");
			c[3].getcarName();
			c[3].setCarNumber("TS07BD1793");
			c[3].getCarNumber();
			c[3].setcapacityofTank(85);
			c[3].getcapacityofTank();
			c[3].setcarMaxSpeed(190);
			c[3].getcarMaximumSpeed();
			c[3].setruningSpeed(60);
			c[3].getruningSpeed();
			c[3].setfuelInTank(45);
			c[3].getfuelInTank();
			c[3].setOrigin("Ganapavaram");
			c[3].getOrigin();
			c[3].setDestination("Kphb");
			c[3].getDestination();
			c[3].setTime("06:00");
			c[3].getTime();
			c[3].setHeadLights(false);
			c[3].isHeadLights();
			d[3].setName("Ajaykumar");
			d[3].getName();
			d[3].setId("DT-5677");
			d[3].getId();
			c[3].fillFuel(5, c);
			c[3].accelerate(5, c);
			c[3].isHeadLights();
			System.out.println();
			
			System.out.println("***Fifth Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[4].setcarName("Audi Q3");
			c[4].getcarName();
			c[4].setCarNumber("AP27CH1111");
			c[4].getCarNumber();
			c[4].setcapacityofTank(85);
			c[4].getcapacityofTank();
			c[4].setcarMaxSpeed(150);
			c[4].getcarMaximumSpeed();
			c[4].setruningSpeed(100);
			c[4].getruningSpeed();
			c[4].setfuelInTank(20);
			c[4].getfuelInTank();
			c[4].setOrigin("Vijayawada");
			c[4].getOrigin();
			c[4].setDestination("Chilakaluripet");
			c[4].getDestination();
			c[4].setTime("18:00");
			c[4].getTime();
			c[4].setHeadLights(true);
			c[4].isHeadLights();
			d[4].setName("Sunny");
			d[4].getName();
			d[4].setId("DT-12");
			d[4].getId();
			c[4].fillFuel(5, c);
			c[4].accelerate(5, c);
			c[4].isHeadLights();
			System.out.println();
			
			System.out.println("***Sixth Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[5].setcarName("Audi A6");
			c[5].getcarName();
			c[5].setCarNumber("AP02FD4862");
			c[5].getCarNumber();
			c[5].setcapacityofTank(85);
			c[5].getcapacityofTank();
			c[5].setcarMaxSpeed(190);
			c[5].getcarMaximumSpeed();
			c[5].setruningSpeed(120);
			c[5].getruningSpeed();
			c[5].setfuelInTank(20);
			c[5].getfuelInTank();
			c[5].setOrigin("Kphb");
			c[5].getOrigin();
			c[5].setDestination("Chilakaluripet");
			c[5].getDestination();
			c[5].setTime("20:00");
			c[5].getTime();
			c[5].setHeadLights(true);
			c[5].isHeadLights();
			d[5].setName("Sunny");
			d[5].getName();
			d[5].setId("DT-201824");
			d[5].getId();
			c[5].fillFuel(5, c);
			c[5].accelerate(5, c);
			c[5].isHeadLights();
			System.out.println();
			
			System.out.println("***Seventh Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[6].setcarName("Audi A5");
			c[6].getcarName();
			c[6].setCarNumber("TS02DB7931");
			c[6].getCarNumber();
			c[6].setcapacityofTank(85);
			c[6].getcapacityofTank();
			c[6].setcarMaxSpeed(150);
			c[6].getcarMaximumSpeed();
			c[6].setruningSpeed(100);
			c[6].getruningSpeed();
			c[6].setfuelInTank(20);
			c[6].getfuelInTank();
			c[6].setOrigin("Kphb");
			c[6].getOrigin();
			c[6].setDestination("Vijayawada");
			c[6].getDestination();
			c[6].setTime("18:00");
			c[6].getTime();
			c[6].setHeadLights(true);
			c[6].isHeadLights();
			d[6].setName("Manikantha");
			d[6].getName();
			d[6].setId("DT-201809");
			d[6].getId();
			c[6].fillFuel(5, c);
			c[6].accelerate(5, c);
			c[6].isHeadLights();
			System.out.println();
			
			System.out.println("***Eight Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[7].setcarName("Audi A4");
			c[7].getcarName();
			c[7].setCarNumber("KA03FF5678");
			c[7].getCarNumber();
			c[7].setcapacityofTank(85);
			c[7].getcapacityofTank();
			c[7].setcarMaxSpeed(150);
			c[7].getcarMaximumSpeed();
			c[7].setruningSpeed(130);
			c[7].getruningSpeed();
			c[7].setfuelInTank(20);
			c[7].getfuelInTank();
			c[7].setOrigin("Kphb");
			c[7].getOrigin();
			c[7].setDestination("Vijayawada");
			c[7].getDestination();
			c[7].setTime("23:00");
			c[7].getTime();
			c[7].setHeadLights(true);
			c[7].isHeadLights();
			d[7].setName("Pavan");
			d[7].getName();
			d[7].setId("DT-201807");
			d[7].getId();
			c[7].fillFuel(5, c);
			c[7].accelerate(5, c);
			c[7].isHeadLights();
			System.out.println();
			
			System.out.println("***Nineth Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[8].setcarName("Audi A3");
			c[8].getcarName();
			c[8].setCarNumber("KA27BY007");
			c[8].getCarNumber();
			c[8].setcapacityofTank(85);
			c[8].getcapacityofTank();
			c[8].setcarMaxSpeed(150);
			c[8].getcarMaximumSpeed();
			c[8].setruningSpeed(140);
			c[8].getruningSpeed();
			c[8].setfuelInTank(20);
			c[8].getfuelInTank();
			c[8].setOrigin("Banglore");
			c[8].getOrigin();
			c[8].setDestination("Chilakaluripet");
			c[8].getDestination();
			c[8].setTime("18:00");
			c[8].getTime();
			c[8].setHeadLights(true);
			c[8].isHeadLights();
			d[8].setName("Naga");
			d[8].getName();
			d[8].setId("DT-199507");
			d[8].getId();
			c[8].fillFuel(5, c);
			c[8].accelerate(5, c);
			c[8].isHeadLights();
			System.out.println();
			
			System.out.println("***Tenth Car Details***");
			System.out.println();
			System.out.println("Car Manufacturer Company	: "+Car.manufacturerCompany);
			c[9].setcarName("Audi RS");
			c[9].getcarName();
			c[9].setCarNumber("TS09DF0123");
			c[9].getCarNumber();
			c[9].setcapacityofTank(85);
			c[9].getcapacityofTank();
			c[9].setcarMaxSpeed(150);
			c[9].getcarMaximumSpeed();
			c[9].setruningSpeed(100);
			c[9].getruningSpeed();
			c[9].setfuelInTank(20);
			c[9].getfuelInTank();
			c[9].setOrigin("Bhel");
			c[9].getOrigin();
			c[9].setDestination("Guntur");
			c[9].getDestination();
			c[9].setTime("22:00");
			c[9].getTime();
			c[9].setHeadLights(true);
			c[9].isHeadLights();
			d[9].setName("Ramu");
			d[9].getName();
			d[9].setId("DT-1246");
			d[9].getId();
			c[9].fillFuel(5, c);
			c[9].accelerate(5, c);
			c[9].isHeadLights();
			System.out.println();
			System.out.println("*********************");
			
			findCars("Vijayawada", c);
			//findCars("Kphb", "Chilakaluripet", c);
	}
}
