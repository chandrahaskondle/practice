package myStudyApp;

public class Mutlithreading1 {

	public static void main(String[] args) {
		
		// thread are created by implementing 
		// Implementing Runnable interface in ThreadHelper class
		ThreadHelper t1 = new ThreadHelper();
		ThreadHelper t2 = new ThreadHelper();
		t1.run();
		t2.run();
	}
}
