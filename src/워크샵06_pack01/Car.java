package 워크샵06_pack01;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	public void addOil(int oil) {
		restOil += oil
		if (restOil > getOilTankSize()) {
		    restOil = getOilTankSize();
		    }
		
	}
	public void moving(int distance) {
		
	}
	
	@Override
	public String toString() {
		return "Car [restOil=" + restOil + ", curWeight=" + curWeight + "]";
	}
	
	
}
