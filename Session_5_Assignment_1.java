/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acadglid;

/**
 *
 * @author My
 */
class Rectangle 
           { 
               int l,b; 
               Rectangle(int x,int y) 
                 { 
                    l=x; 
                    b=y; 
                 } 
                    int getRectangle() 
                     { 
                        return l*b; 
                     } 
           } 
                   class Triangle extends Rectangle 
                      { 
                          float a; 
                          Triangle(int v,int u) 
                             { 
                                 super(u,v); 
                             } 
                                 float getTriangle() 
                                    { 
                                        a=(float)l/2*l*b; 
                                        return (a); 
                                    } 
                     } 
                             class Session_5_Assignment_1 
                                 { 
                                     public static void main(String args[]) 
                                          { 
                                              Triangle m=new Triangle(500,80); 
                                              System.out.println("Area of Rectangle is : " +m.getRectangle()); 
                                              System.out.println("Area of Triangle is : "+m.getTriangle()); 
                                          } 
                                 } 

