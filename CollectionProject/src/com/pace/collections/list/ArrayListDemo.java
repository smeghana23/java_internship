package com.pace.collections.list;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Hyderabad");
		cityList.add("Pune");
		cityList.add("Bengaluru");
		cityList.add("Delhi");
		int listSize;
		listSize = cityList.size();
		System.out.println("City Size:" + listSize);
		System.out.println(cityList.get(0));
		System.out.println(cityList.get(1));
		System.out.println(cityList.get(2));
		System.out.println(cityList.get(3));
		
//		using for loop
		for(int index = 0; index < cityList.size(); index++) {
			System.out.println(cityList.get(index));
		}
		
//		using for each loop
		for(String city : cityList) {
			System.out.println(city);
		}

	}

}
