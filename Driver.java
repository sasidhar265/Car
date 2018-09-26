package car;

public class Driver 
{
	String name;
	String id;
	
	public void setName(String name) 
	{
		this.name = name;
		if(name.length()>3)
		 {
			 if(name.charAt(0)>='A' && name.charAt(0)<='a')
			 {
				 if(name.indexOf("a")==-1 || 
						name.indexOf("e")==-1 || 
						 	name.indexOf("i")==-1 || 
						 		name.indexOf("o")==-1 || 
						 			name.indexOf("u")==-1 ||
						 				name.indexOf("y")==-1)
				 {
					 System.out.println("Driver Name is			:"+name);
				 }
				 else
				 {
					 System.out.println(" invalid name ");
				 }
			 }
			 else
			 {
				 System.out.println(" invalid name because the name was started without capital");
			 }
		 }
		 else
		 {
			 System.out.println(" invalid name because length of was less than 3");
		 }
	}	
	public String getName() 
	{
		return name;
	}
	
	public void setId(String id) 
	{
		this.id = id;
		{
			if(id.length() > 4)
			{
				System.out.println("Driver Id is			:"+id);
			}
			else
			{
				System.out.println("Invlaid id");
			}
		}
	}
	public String getId() 
	{
		return id;
	}
}
