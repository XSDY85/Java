package com.Suraj;

public class Rectangle {
	
	private double width;
	private double height;
	
	Rectangle()
	{
		this(1.0, 3.0);
		
	}

	Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	double getArea()
	{
		return this.width*this.height;
	}
	
	double getPeri()
	{
		return 2*(this.width + this.height);
	}
	
	double getWidth()
	{
		return this.width;
	}
	void setWidth(double width)
	{
		this.width = width;
	}
	
	double getHeight()
	{
		return this.height;
	}
	void setHeight(double height)
	{
		this.height = height;
	}
	
}
