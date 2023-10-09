
package com.pepper.homewtrains;

class Train 
{
    public int speed;
    public double distance;
    public int acceleration;
    public int maxSpeed;
    
    
    public Train ( int acc, int maxSp)
    {
        acceleration = acc;
        maxSpeed = maxSp;
        speed = 0;
        distance = 0;
    }
    
    public void step()
    {
        /*double currentSp = speed;
        double currentDi = distance;*/
        
        if ( speed < maxSpeed)
        {
            speed += acceleration;
            distance += speed;
        } 
        else if (speed >= maxSpeed)
        {            
            distance += speed;
        }
    }
    
    
    
    
    
    
}
