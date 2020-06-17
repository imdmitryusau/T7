package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class House {
    private final String address;
    private ArrayList<Room> house = new ArrayList<>();

    public House(String address) {
        this.address = address;
    }

    public static House createHouse(String address)
    {
        House obj = new House(address);
        return obj; //return createHouse(address);
    }

    //1st method
    public void addRoom(Room newRoom)
    {
       house.add(newRoom);
    }

    //2nd method
    public void addRoom(ArrayList<Room> newRoom)
    {
        house.addAll(newRoom);
    }

    //getting number of rooms
    public int getRoomCount()
    {
        return house.size();
    }
}
