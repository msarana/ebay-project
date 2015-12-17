package com.totsy.draft;

import java.lang.reflect.InvocationTargetException;

public class split_ex {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		
	String data="col|Username";
	
	String temp[]= data.split("\\|");
	System.out.println(temp[0]);
	System.out.println(temp[1]);

	
	System.out.println();
		
	}
}
