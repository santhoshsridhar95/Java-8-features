package com.workspace;

public class Prg1 {
public static void main(String[] args) {
	int x=0;
	x=++x;
	x=++x;
	x=++x;
	System.out.println(x);
}

int z;
//	Prg1(){
//		
//	}
	Prg1(int z){
	this.z=z;	
	}
}

class Prg11 extends Prg1{
	
	int x;
	double y;
	public Prg11(int x, double y,int z) {
		super(z);
		this.x = x;
		this.y = y;
	}
	
	
}