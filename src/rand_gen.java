import java.util.*;

public class rand_gen{
	public static void main(String[] args) {
		int seed = time();
		int mult = 69;
		int addc = 42069420;
		int mod = 43;
		seed = generate(mult, addc, mod, seed);
		System.out.println(seed);
	}
	public static int generate(int a, int c, int m, int seed) {
		int seedn = 0;
		
		seedn = (a*seed + c) % m;
		
		return seedn;
	}
	public static int time() {
		Date curr = new Date();
		return (int)curr.getTime();
	}
}