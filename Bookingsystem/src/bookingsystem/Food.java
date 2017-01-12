package bookingsystem;

public class Food {
	int foodnumber;
	String menuname;
	double foodprice;
	boolean firstclass;
	



	

	public Food(int foodnumber, String menuname, double foodprice, boolean firstclass) {
	
		this.foodnumber = foodnumber;
		this.menuname = menuname;
		this.foodprice = foodprice;
		this.firstclass = firstclass;
	}






	public Food() {

	}






	@Override
	public String toString() {
		if(firstclass){
		return "Food [foodnumber=" + foodnumber + ", menuname=" + menuname + ", foodprice=" + foodprice
				+ ", firstclass only ]";
	}
		else  {
			return "Food [foodnumber=" + foodnumber + ", menuname=" + menuname + ", foodprice=" + foodprice + "]";
		}
	}





//
//	@Override
//	public String toString() {
//		
//		return "Food [foodnumber=" + foodnumber + ", menuname=" + menuname + ", foodprice=" + foodprice + "]";
//	}
//   
//   
//   
   
	

}
