package com;
 class  Mobile{
	 String Name;
	 int ram;
	 int rom;
	 String color;
	 Mobile(){
			 
	 }
	 Mobile(String name){
		 this();
		 this.Name=name;
	 }
	 Mobile(String name,int ram){
		 this(name);
		 this.ram=ram;
	 }
	 Mobile(String name,int ram,int rom){
		 this(name,ram);
		 this.rom=rom;
		 
	 }
	 Mobile(String name,int ram,int rom,String color){
		 this(name,ram,rom);
		 this.color=color;
	 }
	 public void display() {
		 System.out.println(Name+" "+ram+" "+rom+" "+color);
	 }
 }
public class Student {
 public static void main(String[] args) {
	Mobile m1=new Mobile("ooppo",4,128,"Black");
	m1.display();
 }
}

