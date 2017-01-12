
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory invent = new Inventory();

		Cellphone phone1 = new Cellphone("sg152", "David C", "Iphone7", 263554, 4500);
		Cellphone phone2 = new Cellphone("dh25", "Mats D", "Sony", 1634, 2625);
		Cellphone phone3 = new Cellphone("dhse25", "Martts yyy", "Sony ericsson", 16364, 262);
		invent.addCellphone(phone1);
		invent.addCellphone(phone2);
		invent.addCellphone(phone3);

		// System.out.println(phone1.getName());
		// System.out.println(phone1.toString());
		// System.out.println(phone2.toString());

		// Cellphone find = invent.findphone("Mats D");
		// if (find !=null) {
		// System.out.println(find.getName());
		// }

		invent.listCellphone();
		System.out.println("*******");
		invent.deleteCellPhoneByName("David C");
		invent.listCellphone();
		// Cellphone phone4 = new Cellphone("sg152", "David C", "Iphone7",
		// 263554, 4500);
		// invent.addCellphone(phone4);
		// invent.addCellphone(phone1);
		System.out.println("*******");
		// invent.listCellphone();

		Cellphone foundPhone = invent.findphone("Mats D");
		if (foundPhone != null)
			System.out.println(foundPhone.getName());

		System.out.println("*******");
		// System.out.println(phone1.toString());

	}

}
