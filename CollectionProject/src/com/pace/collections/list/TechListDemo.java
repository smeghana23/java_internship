package com.pace.collections.list;

import java.util.ArrayList;

public class TechListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation
		ArrayList<String>techList = new ArrayList<String>();
		techList.add("Java");
		techList.add("Python");
		techList.add("Dot Net");
		System.out.println("\"Original Tech List\"");
		for(String technology : techList) {
			System.out.println(technology);
		}
		
		//Updation
		//we can even update the value by using a variable and assigning the value to the variable 
		techList.set(2, "Angular");
		System.out.println("\"Tech List after updation\"");
		for(String technology : techList) {
			System.out.println(technology);
		}
		
		//Removing - index 
		//		   - object value
		techList.remove(1);
		System.out.println("\"Tech List after deletion\"");
		for(String technology : techList) {
			System.out.println(technology);
		}
		
		//Replace
		//by using ctrl+F

	}

}
