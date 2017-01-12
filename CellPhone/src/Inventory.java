import java.util.Arrays;

public class Inventory {

	private Cellphone[] phoneArray = new Cellphone[10];
	private int nextPosition = 0;

	

	public void addCellphone(Cellphone newCellPhone) {
		phoneArray[nextPosition] = newCellPhone;
		nextPosition++;
	}

	
	public void deleteCellPhoneByName(String name){
	
		for (int counter = 0; counter < phoneArray.length; counter++) {
			if (phoneArray[counter] != null) {
				if(phoneArray[counter].getName().equals(name)){
					phoneArray[counter] = null;
		/////////////////////////////////////////
				
					//////////////////
					
					
				}
			}
			
		}
			
		
	}
	
	public Cellphone findphone(String name) {		
		for (int counter = 0; counter < nextPosition; counter++) {
			if (phoneArray[counter] != null) {
				if (phoneArray[counter].getName().equalsIgnoreCase(name)) {
					return phoneArray[counter];
				}
			}			
		}
		return null;
	}

	public void listCellphone() {
		for (int counter = 0; counter < phoneArray.length; counter++) {
			if (phoneArray[counter] != null) {
				System.out.println((phoneArray[counter].toString()));
				// listPhone(Inventory[counter]);
			}
		}
	}

}