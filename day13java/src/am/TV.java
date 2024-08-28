package am;

public interface TV {
	
	//인터페이스는 다중 구현이 가능하다.
	
	public int MIN_VOLUME = 0;
	public int Max_VOLUME = 100;

	public void turnOn();

	public void turnOff();

	public void changeVolume(int volume);

	public void changeChannel(int channel);
}
