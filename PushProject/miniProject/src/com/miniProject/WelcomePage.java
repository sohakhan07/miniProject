package com.miniProject;

import java.util.Scanner;

public class WelcomePage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			
				System.out.println("Online Quiz System....");
				System.out.println("........Welcome!........");
				System.out.println(" Attend Quiz");
				System.out.println("Press 1 and enter to begin your test");
				int choice = sc.nextInt();
				
				
				switch(choice){
						case 1 : QuizPage.getQuiz();
							break;
						
				}
				 
					System.out.println("Thank you!");
					Joining.getScore();
			
			}
//This project is done by Anjali Patil,Ankur More,Saurabh Bijawe,Soha Pathan(Group D)
	
}

