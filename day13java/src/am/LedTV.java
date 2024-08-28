package am;

public class LedTV implements TV{

//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void changeVolume(int volume) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void changeChannel(int channel) {
//		// TODO Auto-generated method stub
//		
//	}
    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {

        // TODO Auto-generated method stub
        System.out.println("볼륨을 조절하다");
    }

    @Override
    public void changeChannel(int channel) {
        // TODO Auto-generated method stub
        System.out.println("채널을 변경하다");
    }
    
    public void showModle() {
    	System.out.println("LED TV 입니다..");
    }
	
	

}
