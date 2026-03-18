package Day2;

import java.util.Scanner;

public class IVR2 {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);
        
        String prompt = """
		Welcome to MTN self service.
		To Listen
		Press 1 -> English
		Press 2 -> Yoruba
		Press 3 -> Hausa
			""";
        System.out.println(prompt);
	int userInput = inputCollector.nextInt();
	switch(userInput){ // use -> instead of : in newer versions.
		case 2-> System.out.println("Yoruba");
		case 3-> System.out.println("Hausa");
		case 1-> {
			System.out.println("English");
			prompt = """
				Press 1-> For Complain
				Press 2 -> To Dash me money
				Press 3 -> To Rant
			""";
			System.out.println(prompt);
			userInput = inputCollector.nextInt();
			
			switch(userInput){
				case 1 -> System.out.println("Oya dey complain");
				case 2 -> System.out.println("Make I send you my account number");
				case 3 -> System.out.println("Oya rant");
				default -> System.out.println("Dey go");
			}
		}
		default -> System.out.println("You no get sense!!!");
	}
    }
}