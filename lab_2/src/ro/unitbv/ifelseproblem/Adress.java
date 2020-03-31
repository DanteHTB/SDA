package ro.unitbv.ifelseproblem;

public class Adress {
	String street;
	String city;
	int number;
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getNumber() {
		return number;
	}

	public Adress(String City, String Street, int Number)
	{
		city=City;
		street=Street;
		number=Number;
		
	}
	public String getCompleteAdress()
	{
		return city+street+number;
	}

}