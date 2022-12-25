
public class Car {

	String make;
	String model;
	int year ;
	
	Car() {
		
	}
	
	Car(String make, String model, int year) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);	
	}
	
	Car(Car car) {
		this.copy(car);
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void copy(Car car) {
		this.setMake(car.make);
		this.setModel(car.model);
		this.setYear(car.year);
	}
	
	
}
