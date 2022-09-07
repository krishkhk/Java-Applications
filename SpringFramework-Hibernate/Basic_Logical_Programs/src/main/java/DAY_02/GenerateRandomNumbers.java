package DAY_02;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		System.out.println("Random Numbers From 1 to 10");

		Random randomGenerator=new Random();
		for(int i=0;i<25;i++) {
			System.out.println(randomGenerator.nextInt(25)+1);
		}
	}

}
