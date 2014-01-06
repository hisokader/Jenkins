package bouazza.jenkins.junit.test;

public class MaClass {
	public int maMethode(int z, int y) {
		// juste un exemple
		if (z > 999) {
			throw new IllegalArgumentException("Z doit etre inferieur a 1000");
		}
		return z * y;
	}
}
