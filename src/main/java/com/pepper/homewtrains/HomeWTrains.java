

package com.pepper.homewtrains;

public class HomeWTrains 
{
    final static double destination = 10000;
    
    public static void main(String[] args) 
    {
        // s = v * t; a = v / t;
        Train first = new Train(1, 100);
        Train second = new Train(1, 80);
        Train third = new Train(1, 90);
        
        Race(first, second, third);
        
    }
    
    private static void Race(Train first, Train second, Train third) 
    {
        //int dest = (int) Math.round(destination);
        
        while(first.distance <= destination && second.distance <= destination && third.distance <= destination)
        {
            first.step();
            second.step();
            third.step();
        }        
        
        System.out.println(first.distance + " " + second.distance + " " + third.distance);
        
       
       if(first.distance >= destination) 
       {
           System.out.println("Az első nyert"); 
       }
       else if (second.distance >= destination)
       {
           System.out.println("A második nyert");
       }
       else
       {
           System.out.println("A harmadik nyert"); 
       } 
    }
    
   
    
    
}
