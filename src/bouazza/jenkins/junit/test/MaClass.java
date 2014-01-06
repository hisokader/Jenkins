package bouazza.jenkins.junit.test;

public class MaClass {
	public int maMethode(int x, int y) {
		// juste un exemple
		if (x > 999) {
			throw new IllegalArgumentException("Z doit etre inferieur A 1000");
		}
		return x * y;
	}
}
