import java.util.*;

public class rand_gen{
	public int generator(int mod) {
		int seed = time();
		int fmod = 271828182;
		int mult = 961748941;
		int addc = 982451653;
		seed = generate(mult, addc, fmod, seed);
		mult = generate2(mult, addc, fmod, seed);
		addc = generate(mult, addc, fmod, seed);
		seed = generate2(mult, addc, fmod, seed);
		seed = generate(mult, addc, mod, seed);
		if(seed < 0) {
			seed *= -1;
		}
		return seed;
	}
	public static int generate(int a, int c, int m, int seed) {
		int seedn = 0;
		
		seedn = (420 * (a*seed + c) / 69) % m;
		
		return seedn;
	}
	public static int time() {
		Date curr = new Date();
		return (int)curr.getTime();
	}
	
	public static int generate2(int a, int c, int m, int seed) {
		int seedn = 0;
		double r = 3.759816;
		seedn = (int)(r * (double)seed) * (1 - seed); 
		
		return seedn;
	}
}