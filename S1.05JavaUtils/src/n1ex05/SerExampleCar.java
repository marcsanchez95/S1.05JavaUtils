package n1ex05;

import java.io.Serializable;

public class SerExampleCar implements Serializable {
	private String brand;
	private String model;
	private int power;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public SerExampleCar(String brand, String model, int power) {
		super();
		this.brand = brand;
		this.model = model;
		this.power = power;
	}

	@Override
	public String toString() {
		return "SerExampleCar [brand=" + brand + ", model=" + model + ", power=" + power + "]";
	}

}
