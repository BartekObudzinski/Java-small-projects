package projectsjava;

import java.util.Scanner;



public class WeightCalculator {
	
	static int kilosIntoLbs(int weight) {
		weight *= 2.20462262;
		return weight;
	}
	
	static float bmi(float weight, float height) {
		float bmi = (float)Math.round(((weight/Math.pow(height, 2))*10000));
		
		
		if(bmi <=18.5) {
			System.out.println("You are underweight");
		}
		else if(bmi>18.5&&bmi<=24.9) {
			System.out.println("Your weight is normal");
		}
		else if(bmi>=25&&bmi<30) {
			System.out.println("You are overweight");
		}else {
			System.out.println("You are obese");
		}
		return bmi;
	}
	
	static int kcalCounterWomen(int weight, float height, int age) {
		int womenKcal = (int)(655+(9.6*weight)+(1.8*height)-(4.7*age));
		return womenKcal;
	}
	
	static int kcalCounterMan(int weight, float height, int age) {
		int manKcal = (int)(66+(13.7*weight)+(5*height)-(6.76*age));
		return manKcal;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your gender? male or female");
		String gender = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("Enter the weight in kg");
		int weight = scanner.nextInt();
		System.out.println("Enter the height in centimeters");
		float height = scanner.nextFloat();
		System.out.println("Your weight is "+ weight +" in lbs is " + kilosIntoLbs(weight)+" \nYour height is "+ height/100+"m");
		System.out.println("Your BMI: "+ bmi(weight,height));
		System.out.println("What you want to do? \n 1. Lose Weight \n 2. Put on weight \n 3. Keep your weight");
	
		while(true) {
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				System.out.println("If you want to lose weight, you need to eat ");
				if((gender.toLowerCase()).equals("male")){
					System.out.println(kcalCounterMan(weight,height,age)-300+" kcal");
				}
				else if((gender.toLowerCase()).equals("female")){
					System.out.println(kcalCounterWomen(weight,height,age)-250+" kcal");
				}else {
					System.out.println("Your gender were incorret");
				}
				break;
			case 2:
				System.out.println("If you want to put on weight, you need to eat ");
				if((gender.toLowerCase()).equals("male")){
					System.out.println(kcalCounterMan(weight,height,age)+300+" kcal");
				}
				else if((gender.toLowerCase()).equals("female")){
					System.out.println(kcalCounterWomen(weight,height,age)+250+" kcal");
				}else {
					System.out.println("Your gender were incorret");
				}
				break;
			case 3:
				System.out.println("If you want to keep your weight, you need to eat ");
				if((gender.toLowerCase()).equals("male")){
					System.out.println(kcalCounterMan(weight,height,age)+" kcal");
				}
				else if((gender.toLowerCase()).equals("female")){
					System.out.println(kcalCounterWomen(weight,height,age)+" kcal");
				}else {
					System.out.println("Your gender were incorret");
				}
				break;
			default:
				break;
	
		}
		if (choice == 9) {
			System.out.println("You close the program");
	        break;
	    }
		}
	}
}

