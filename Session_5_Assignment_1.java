/*
Calculate area of rectangle and triangle using
single inheritance.

 */
package acadglid;

//Problem 1
class Rectangle 
           { 
               int l,b; 
               Rectangle(int x,int y) 
                 { 
                    l=x; 
                    b=y; 
                 } 
                    int getRectangle() //rectangle area
                     { 
                        return l*b; 
                     } 
           } 
                   class Triangle extends Rectangle //single inheritance
                      { 
                          float a; 
                          Triangle(int v,int u) 
                             { 
                                 super(u,v); 
                             } 
                                 float getTriangle() 
                                    { 
                                        a=(float)l/2*l*b;  //area of triangle
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

