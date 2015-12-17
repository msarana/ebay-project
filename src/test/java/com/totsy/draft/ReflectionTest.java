package com.totsy.draft;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {


	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ReflectionTest t =  new ReflectionTest();
		//t.abc();
		
		Method method[] = t.getClass().getMethods();
		String a="xxxx";
		String b="yyyy";
		for(int i=0;i<method.length;i++){
			//System.out.println(method[i].getName());
			
			if(method[i].getName().equals("abc")){
				method[i].invoke(t,a,b);
			}
		}

	}
	
	
	public void abc(String x, String y){
		System.out.println("ABC");
		System.out.println(x);
		System.out.println(y);
	}
	
	public void xyz(){
		System.out.println("XYZ");
	}

}
