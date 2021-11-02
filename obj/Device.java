package obj;

import java.util.Random;


public class Device{

	private int cost;
	private String name;
	private int model;
	
	public Device(int model,String name,int cost ) {
		this.name = name;
		this.cost= cost;
		this.model = model;
	}
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getcost() {
		return cost;
	}
	public void setcost(int cost) {
		this.cost = cost;
	}
	public int getmodel() {
		return model;
	}
	public void setmodel(int model) {
		this.model = model;
	}


	
	@Override
	public String toString() {
		
		if(name == null) name = "";
		return cost+" - "+name+" - "+model;
	
		///return super.toString();
	}
public boolean equals(Object obj) {
		
		if(obj instanceof Device)
		{
		
			System.out.println("Equals called for "+this.name);
			Device e = (Device)obj;
			
			
			if(((Device)obj.getname!= ))
			
			
			return b1&&b2&&b3;
		}
		else
		{
			return false;
		}
		

}