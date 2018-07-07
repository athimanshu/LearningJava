package com.com.com.designpattern.creational;

interface Polygon
{
    String getType();
}
class Triangle implements Polygon{
    public  String getType()
    {
        return "Triangle";
    }
}
class Rectangle implements Polygon
{
    public String getType()
    {
        return "Rectangle";
    }
}
class PolygonFactory
{
    public Polygon getPolygon(int noOfSides)
    {
        if(noOfSides == 3)
        {
            return new Triangle();
        }
        else if (noOfSides == 4)
        {
            return new Rectangle();
        }
        else
        {
            return null;
        }
    }
}
public class FactoryDesign
{
    public static void main(String[] args) {
        PolygonFactory obj = new PolygonFactory();
        Polygon polyObj=obj.getPolygon(3);
        System.out.println(polyObj.getType());
        System.out.println(obj.getPolygon(4).getType());

    }
}