package com.Java.Practice;

public class HouseSwitch implements Building{
	private int noOfWindows;
	 
    private int noOfDoors;
 
 
    public HouseSwitch(int noOfWindows,int noOfDoors){
 
        this.noOfWindows = noOfWindows;
        this.noOfDoors = noOfDoors;
    }
 
    public int getNoOfWindows(){
 
        return noOfWindows;
    }
 
    public int getNoOfDoors(){
 
        return noOfDoors;
    }
}
