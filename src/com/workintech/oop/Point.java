package com.workintech.oop;

public class Point {

    private int x;
    private int y;

    //constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //getter methods
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    //setter methods
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    //distance methods
    public double distance(){
        return Math.sqrt(Math.pow(this.x-0,2) + Math.pow(this.y-0,2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2) + Math.pow(this.y-p.y,2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow(this.x-a,2) + Math.pow(this.y-b,2));
    }


}
