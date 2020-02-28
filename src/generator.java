import java.util.*;
public class generator{
	public static void main(String[] args) {
		rand_gen randn = new rand_gen();
		int rand = randn.generator();
		System.out.println(rand);
	}
}