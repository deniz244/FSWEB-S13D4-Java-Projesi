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
        return Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2));
    }

    public double distance(Point p){
        if(p != null ){
            return distance(p.x,p.y);
        }
        System.out.println("Point can't be null");
        return -1;
        //return Math.sqrt(Math.pow(getX()-p.x,2) + Math.pow(getY()-p.y,2));
        // getX getY yerine this.x/y hatta direk x/y de yazılabilirdi
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow(getX()-a,2) + Math.pow(getY()-b,2));
    }


}
