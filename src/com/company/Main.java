package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	//Task 1
	Furniture f = new Furniture("Chair",100);
	Furniture f1 = new Furniture("Table",200);
	System.out.println("Price without VAT "+f.getPrice());
	System.out.println("Price with VAT "+f.getPriceTax());


    Room r = new Room (25);
	ArrayList<Furniture> list = new ArrayList<>();
	list.add(f);
	list.add(f1);
	r.addFurniture(list);

	//System.out.println(r.getPriceAllFurniture());

		//Task 2
		Room r1 = new Room (25);
		House h =new House("Kazimirowska 11");

		//adding one room by using 1st method
		h.addRoom(r);

		//adding the list of rooms by using the 2nd method
		ArrayList<Room> list1 = new ArrayList<>();
		list1.add(r1);
		h.addRoom(list1);

		//getting the number of rooms in the house
		System.out.println("There are "+h.getRoomCount()+ " rooms");
	}
}
