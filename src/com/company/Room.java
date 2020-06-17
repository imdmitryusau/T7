package com.company;

import java.util.ArrayList;

public class Room {
    private int room_area;
    private ArrayList<Furniture> room;
    //Furniture getprice;

    //empty room ready
    public Room(int room_area) {
        this.room_area = room_area;
        this.room= new ArrayList<>();
    }

    public void addFurniture(ArrayList<Furniture> newFurniture)
    {
        room.addAll(newFurniture);
    }

    /*
    public double getPriceAllFurniture()
    {
        return getprice.getPrice();
    }
    */

}
