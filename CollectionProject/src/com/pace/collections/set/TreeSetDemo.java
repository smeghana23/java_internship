package com.pace.collections.set;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> citySet = new TreeSet<String>();
		citySet.add("Hyderabad");
		citySet.add("Pune");
		citySet.add("Bengaluru");
		citySet.add("hyderabad");
		
		for(String city : citySet) {
			System.out.println(city);
		}

	}

}
//tree set follows sorted order