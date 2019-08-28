//package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
    	for (int i =0; i< 5; i++)
    	{
    		System.out.println(new App().getMessage());
    	}
    }
    	private final String getMessage() {
    		return message;
    	}   
}
