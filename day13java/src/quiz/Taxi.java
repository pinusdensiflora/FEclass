package quiz;

public class Taxi implements TaxiMeter{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int stop(int distance) {
		// TODO Auto-generated method stub
		return distance * 2;
	}
	
}
