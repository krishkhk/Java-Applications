package Pojo;

public class Mobile {
	
	 private String Brand;    
	    private String Name;    
	    private int Ram;  
	    private int Rom;
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = brand;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getRam() {
			return Ram;
		}
		public void setRam(int ram) {
			Ram = ram;
		}
		public int getRom() {
			return Rom;
		}
		public void setRom(int rom) {
			Rom = rom;
		}
		@Override
		public String toString() {
			return "Mobile [Brand=" + Brand + ", Name=" + Name + ", Ram=" + Ram + ", Rom=" + Rom + "]";
		}  
	    
	    
		

	

}
