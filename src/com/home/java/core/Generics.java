/*
 * Generics.java
 *
 * Created on December 12, 2009, 7:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.home.java.core;

class Gen<T> {   
  T ob;  
     
  Gen(T o) {   
    ob = o;   
  }   
   
  // Return ob.   
  T getob() {   
    return ob;   
  }   
}   
  
// A subclass of Gen.  
class Gen2<T> extends Gen<T> {  
  Gen2(T o) {  
    super(o);  
  }  
}  
  
 // Demonstrate runtime type ID implications of generic class hierarchy.  
public class Generics {   
  public static void main(String args[]) {   
     
    // Create a Gen object for Integers.  
    Gen<Integer> iOb = new Gen<Integer>(88);  
  
    // Create a Gen2 object for Integers.  
    Gen2<Integer> iOb2 = new Gen2<Integer>(99);   
    
    // Create a Gen2 object for Strings.  
    Gen2<String> strOb2 = new Gen2<String>("Generics Test");   
  
    // See if iOb2 is some form of Gen2. 
    if(iOb2 instanceof Gen2<?>)   
      System.out.println("iOb2 is instance of Gen2");  
 
    // See if iOb2 is some form of Gen. 
    if(iOb2 instanceof Gen<?>)   
      System.out.println("iOb2 is instance of Gen");  
  
    System.out.println();  
  
    // See if strOb2 is a Gen2. 
    if(strOb2 instanceof Gen2<?>)   
      System.out.println("strOb is instance of Gen2");  
  
    // See if strOb2 is a Gen. 
    if(strOb2 instanceof Gen<?>)   
      System.out.println("strOb is instance of Gen");  
 
    System.out.println();  
  
    // See if iOb is an instance of Gen2, which its not. 
    if(iOb instanceof Gen2<?>)   
      System.out.println("iOb is instance of Gen2");  
  
    // See if iOb is an instance of Gen, which it is. 
    if(iOb instanceof Gen<?>)   
      System.out.println("iOb is instance of Gen");  
  
    // The following can't be compiled because  
    // generic type info does not exist at runtime. 
//    if(iOb2 instanceof Gen2<Integer>)   
//      System.out.println("iOb2 is instance of Gen2<Integer>");  
  }   
}
