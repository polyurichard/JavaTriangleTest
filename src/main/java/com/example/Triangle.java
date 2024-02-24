package com.example;

public class Triangle {
	int a,b,c; //the three sides of a triangle

	public Triangle (int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c =c;
	}

	public String getTriangleType (){
		String result="";
		if (a<=0 || b<=0 || c<=0) {
			result = "Error: The length should be positive";
		}
		else if(a<b+c && b<a+c && c<a+b){
			if(a==b && b==c)
				result = "Equilateral";
			else if (a==b || b==c || a==c)
				result = "Isosceles";
			else 
				result = "Scalene";
		}
		else 
			result = "Error: Not a triangle";
		return result;
	}

}
