package Gson;

import com.google.gson.Gson;

import Pojo.Mobile;

public class ConvertJSON extends Mobile{


	public static Mobile getMobile(Mobile mobile){
		
		mobile.setBrand("NOKIA");
		mobile.setName("N82");
		mobile.setRam(2);
		mobile.setRom(250);
		
	
		return mobile;
		
	}
	
	public static  Mobile getDetails(Mobile m){
		
		m.setBrand("Mi");
		m.setName("Redmi Note 9 Pro");
		m.setRam(6);
		m.setRom(2);
		
		return m;
		
	}
	
	public static void main(String[] args) {
		
		Mobile mb=new Mobile();
		
		
		mb=getMobile(mb);
		
		Mobile mb1=new Mobile();
		mb1=getDetails(mb1);
		
		
		
		
		System.out.println("JSON represents of Objects is");
		
		System.out.println(new Gson().toJson(mb));
		System.out.println(new Gson().toJson(mb1));
		
		
		System.out.println();
		
		

	}

}
