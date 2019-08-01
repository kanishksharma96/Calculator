package com.epsilon.training.sbcalculator.bean;

import org.springframework.context.annotation.Configuration;

public class Calculator 
{
	private int ip1;
	private int ip2;
	public int getIp1() {
		return ip1;
	}
	public void setIp1(int ip1) {
		this.ip1 = ip1;
	}
	public int getIp2() {
		return ip2;
	}
	public void setIp2(int ip2) {
		this.ip2 = ip2;
	}
	public Calculator(int ip1, int ip2) {
		super();
		this.ip1 = ip1;
		this.ip2 = ip2;
	}
	@Override
	public String toString() {
		return "Calculator [ip1=" + ip1 + ", ip2=" + ip2 + "]";
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		System.out.println("Instance of Calculator is created");
	}
	
	public int addition(int i,int j)
	{
		return i+j;
	}
	
	public int subtraction(int i,int j)
	{
		return i-j;
	}
	public int multiplication(int i,int j)
	{
		return i*j;
	}
	public int division(int i,int j)
	{
		return i/j;
	}
	
}
