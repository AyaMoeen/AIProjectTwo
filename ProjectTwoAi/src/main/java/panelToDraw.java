/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class panelToDraw extends javax.swing.JPanel {

    /**
     * Creates new form panelToDraw
     */
     public double x;
    public double y;
    public shapeDraw shp;
    public ArrayList<shapeDraw> listOfShp;
    public ArrayList<Point> listLine;
 
    
    
    public panelToDraw() {
        initComponents();
        listOfShp=new ArrayList<shapeDraw>();
        listLine=new ArrayList <Point>();
     
         
    }
    
    
      public void clear() 
    {
        listOfShp.clear();
        listLine.clear();
        repaint();
    }
    
    public void clearLines(){
    listLine.clear();
    repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
     public void DrawShape(shapeDraw shape) 
    {
        this.shp=new shapeDraw();
        this.shp.setX(shape.getX());
        this.shp.setY(shape.getY());
        this.shp.setType(shape.getType());
        listOfShp.add(this.shp);
        repaint();
    }

     
     @Override
        public void paintComponent(Graphics Gp){
            
            super.paintComponent(Gp);
            Graphics2D G = (Graphics2D) Gp;
            G.setStroke(new BasicStroke(2));
            
            
            for(int i=0;i<listOfShp.size();i++)
            {
               
            if(listOfShp.get(i).typeOfShape.equals("circle"))
                {
                    G.setColor(Color.PINK);
                    G.drawOval((int)listOfShp.get(i).x,(int)listOfShp.get(i).y,20,20);
                }
                
                
            if(listOfShp.get(i).typeOfShape.equals("triangle"))
                {
                    G.setColor(Color.green);
                    G.drawLine((int)listOfShp.get(i).x,(int)listOfShp.get(i).y,(int)listOfShp.get(i).x+20,(int)listOfShp.get(i).y);
                    G.drawLine((int)listOfShp.get(i).x,(int)listOfShp.get(i).y,(int)listOfShp.get(i).x+20,(int)listOfShp.get(i).y+20);
                    G.drawLine((int)listOfShp.get(i).x+20,(int)listOfShp.get(i).y+20,(int)listOfShp.get(i).x+20,(int)listOfShp.get(i).y);
                }
            
            
                
           
         
            
            int C=0;
              for(int j=0;j<listLine.size();j=j+2 )
            {
                
                G.setColor(Color.ORANGE);
                G.drawLine(listLine.get(j).x,listLine.get(j).y,listLine.get(j+1).x,listLine.get(j+1).y);
                C++;
            }

            }
        }

    
    
     
  public void LineDraw(int x1, int y1, int x2, int y2)
        {
            Point pt1 = new Point(x1 ,y1);
            Point pt2 = new Point(x2 ,y2);
            
            listLine.add(pt1);
            listLine.add(pt2);
            repaint();
            
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
