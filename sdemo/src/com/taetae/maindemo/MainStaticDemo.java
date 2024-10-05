package com.taetae.maindemo;

import com.taetae.sdemo.StaticDemo;

public class MainStaticDemo {
  
	
	public static void main(String[] args) {
		

		
		StaticDemo StaticDemo1= new StaticDemo();
		StaticDemo StaticDemo2= new StaticDemo();
	{	
		
	
		StaticDemo.pincode=421004;
			
				System.out.println(StaticDemo1.pincode); 
		      
				System.out.println(StaticDemo2.pincode1); 
	
	}{    
			StaticDemo.pincode1=42100;
		
		System.out.println(StaticDemo1.pincode);
		
		System.out.println(StaticDemo2.pincode1); 
	
	
}
}
}