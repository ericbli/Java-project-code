package bookingsystem.copy;

import java.util.ArrayList;

public class FoodList {
	public ArrayList<Food> food = new ArrayList<>();

	public ArrayList<Food> getFood() {
		return food;

	}

	public void add(Food food) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Food> createmenu(){
	Food nofood = new Food(0, "No food", 0, false);
	Food food1 = new Food(1, "Biff with Rice", 99, false);
	Food food2 = new Food(2, "Chicken with Rice", 99, false);
	Food food3 = new Food(3, "Chicken with pasta", 129, false);
	Food food4 = new Food(4, "Beef with pasta", 129, false);
	Food food5 = new Food(5, "General Biff", 179, true);
	Food food6 = new Food(6, "Seafoodgryta", 179, true);
	
	ArrayList<Food> foodlist = new ArrayList<>();
	
	foodlist.add(nofood);
	foodlist.add(food1);
	foodlist.add(food2);
	foodlist.add(food3);
	foodlist.add(food4);
	foodlist.add(food5);
	foodlist.add(food6);
	 
	return foodlist;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}