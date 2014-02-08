package testProject;

import java.util.Random;


public class TestClass {

	
	public static void main(String[] args){
		for(int i=0; i <=10;i++)
			System.out.println(getRandom());
		
	}
	
	public static int getRandom(){
		Random random = new Random();
		return random.nextInt()/100000000;
	}
}
