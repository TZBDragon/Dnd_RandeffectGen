import java.util.*;

public class rand_gen{
	public int generator(int mod) {
		int seed = time();
		int mult = 961748941;
		int addc = 982451653;
		seed = generate(mult, addc, mod, seed);
		if(seed < 0) {
			seed *= -1;
		}
		return seed;
	}
	public static int generate(int a, int c, int m, int seed) {
		int seedn = 0;
		
		seedn = (a*seed + c) % m;
		
		return seedn;
	}
	//Adapted from information on wikipedia https://en.wikipedia.org/wiki/Linear_congruential_generator
	public static int time() {
		Date curr = new Date();
		return (int)curr.getTime();
	}
}