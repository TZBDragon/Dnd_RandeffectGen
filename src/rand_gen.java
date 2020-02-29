import java.util.*;

public class rand_gen{
	public int generator(int mod) {
		int seed = time();
		int mult = 69;
		int addc = 42069420;
		seed = generate(mult, addc, mod, seed);
		seed = generate(mult, addc, mod, seed);
		return seed;
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