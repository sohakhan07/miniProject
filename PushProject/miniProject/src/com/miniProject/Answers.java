package com.miniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Answers {
public static void main(String[] args) {
		
		List<String> question1 = new ArrayList<>();
		
		question1.add("A. 6");
		question1.add("B. 7");
		question1.add("C. 8");
		question1.add("D. 10");
		
		List<String> question2 = new ArrayList<>();
		
		question2.add("A. java.lang.package");
		question2.add("B. java.util.package");
		question2.add("C. java.io.package");
		question2.add("D. null");
		
		
		List<String> question3 = new ArrayList<>();
		
		question3.add("A. .js");
		question3.add("B. .class");
		question3.add("C. .text");
		question3.add("D. .java");
		
		
		List<String> question4 = new ArrayList<>();
		
		question4.add("A. 32 and 64");
		question4.add("B. 32 and 32");
		question4.add("C. 64 and 64");
		question4.add("D. 64 and 32");
		
		List<String> question5 = new ArrayList<>();
		
		question5.add("A. polymorphism");
		question5.add("B. inheritance");
		question5.add("C. compilation");
		question5.add("D. encapsulation");
		
		List<String> question6 = new ArrayList<>();
		
		question6.add("A. object reference");
		question6.add("B. object");
		question6.add("C. primitive data type");
		question6.add("D. null");
		
		List<String> question7 = new ArrayList<>();
		
		question7.add("A. Array list");
		question7.add("B. Object class");
		question7.add("C. Abstract Class");
		question7.add("D. String");
		
		
		List<String> question8 = new ArrayList<>();
		
		question8.add("A. check");
		question8.add("B. throw");
		question8.add("C. catch");
		question8.add("D. try");
		
		List<String> question9 = new ArrayList<>();
		
		question9.add("A. Protected");
		question9.add("B. Void");
		question9.add("C. Public");
		question9.add("D. Private");
		
		
		List<String> question10 = new ArrayList<>();
		
		question10.add("A. At Runtime");
		question10.add("B. At Compiletime");
		question10.add("C. Depend on code");
		question10.add("D. null");
		
		
		//Hashmap
		
		HashMap<String,List<String>> questionList = new HashMap<String,List<String>>();
		
		questionList.put("1",question1);
		questionList.put("2",question2);
		questionList.put("3",question3);
		questionList.put("4",question4);
		questionList.put("5",question5);
		questionList.put("6",question6);
		questionList.put("7",question7);
		questionList.put("8",question8);
		questionList.put("9",question9);
		questionList.put("10",question10);
		
		
		Set<String> s = questionList.keySet();
		
		//code to print options one by one
		for(String str:s) {
			for(int i=0; i<4; i++) {
				System.out.println(questionList.get(str).get(i));
				
			}
			System.out.println();
			
		
		}
			
		
	}
	
}
