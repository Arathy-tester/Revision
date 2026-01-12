package samplepages;

public class Car_Aggregation {
	String brand;
	String color;
	int wheels;
	Bike_Aggregation ref;
	
	public Car_Aggregation(String brand, String color,int wheels,Bike_Aggregation ref) 
	{
		this.brand= brand;
		this.color= color;
		this.wheels= wheels;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.comp_name+" "+ ref.cc);
		System.out.println(this.brand+" "+this.color+" "+this.wheels );
	}

	public static void main(String[] args) {
		Bike_Aggregation bike= new Bike_Aggregation("ROYAL ENFIELD",1000);
		Car_Aggregation car=new Car_Aggregation("BMW", "WHITE",4,bike);
		car.display();

	}

}
