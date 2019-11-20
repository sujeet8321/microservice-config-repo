package com.example;
import java.util.function.Function;
/*  ww w  .  java 2 s  .  c  o  m*/
public class Main {

	
  public static void main(String[] argv) {

	   String x = "Hello"; 
    Function<String,String> func1 = y -> {
    	
    	return y + " "+ x ;};
    	
    System.out.println(func1.apply("java2s.com"));
   
  }
 
}
