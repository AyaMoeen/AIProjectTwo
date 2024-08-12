/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class shapeDraw {
      
    double x;
    double y;
    double x1 , x2 ,y1 , y2 ;
    String typeOfShape;
    
    
    public shapeDraw()
    {
        typeOfShape=new String();
    }
    
    public void setX(double x)
    {
        this.x=x;
    }
    
    public void setY(double y)
    {
        this.y=y;
    }
    
    public void setType(String type)
    {
        this.typeOfShape=type;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public String getType()
    {
        return typeOfShape;
    }
    
    
}
