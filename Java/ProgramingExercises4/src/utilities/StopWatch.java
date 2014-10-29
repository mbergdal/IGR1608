package utilities;

public class StopWatch{
	private long startTime;
	private long stopTime;

	public void start(){
		startTime = System.currentTimeMillis();
	}

	public void stop(){
		stopTime = System.currentTimeMillis();
	}

	public String getElapsedTime(){
		long elapsedTime = stopTime - startTime;
		int seconds = (int)elapsedTime / 1000;
		return seconds + " secounds";
	}

	public void reset(){
		startTime = 0;
		stopTime = 0;
	}
}
