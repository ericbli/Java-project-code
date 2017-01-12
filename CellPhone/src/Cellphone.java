
public class Cellphone {
	private String productid;
	private String name;
	private String model;
	private int serialnumber;
	private int price_sek;

	public Cellphone(String productid, String name, String model, int serialnumber, int price_sek) {
		super();
		this.productid = productid;
		this.name = name;
		this.model = model;
		this.serialnumber = serialnumber;
		this.price_sek = price_sek;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productid == null) ? 0 : productid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cellphone other = (Cellphone) obj;
		if (productid == null) {
			if (other.productid != null)
				return false;
		} else if (!productid.equals(other.productid))
			return false;
		return true;
	}

	@Override
	public  String toString() {
		return "Phone: [productid=" + productid + ", name=" + name + ", model=" + model + "]";
	}

}
