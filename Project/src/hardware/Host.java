package hardware;

public class Host {
	static private int id=0;
	private int uniqueID=0;
	private double average;
	private double max;
		
	
	public Host(){
		id++;
		this.uniqueID=id;
		this.max=-1;
		this.average=-1;
	}
	
	
	public Host(double max, double average){
		id++;
		this.uniqueID=id;
		this.max=max;
		this.average=average;
		
	}
	
	
	public double getMax(){
		return max;
	}
	
	public double getAverage(){
		return average;
	}
	
	public double getID(){
		return uniqueID;
	}
	
	public void resetCounter(){
		id=0;
	}
	
	
	
	
}
