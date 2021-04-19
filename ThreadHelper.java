package myStudyApp;

public class ThreadHelper extends Thread {

	private int value = 3;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public void run() {
		System.out.println("Entered to thread: "+ this.getName());
		this.setValue(this.getValue() - 2);
	}
}
