package com.ArrayJavaCollections;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayPrint {
	
public static void main(String[] args) {
	
	
	int[] Array = {1,2,3,4};
	
	System.out.println(Arrays.toString(Array));
	
	String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones", "Das"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        //Mr.Das
        System.out.println(names[0][0] + names[1][2]);
    }
	
	
}
	
	
	
	

