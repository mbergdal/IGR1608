package methods;

public class TestMax {


	public static int max(double i, double j) {
		if (i > j)
			return (int)i;
		else
			return (int)j;
	}
	
	public static int max(int i, int j) {
		if (i > j)
			return (int)i;
		else
			return (int)j;
	}
	
	public static int max(int i) {
		return i;
	}

}
