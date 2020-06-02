package ro.unitbv.ifelseproblem;

public class tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adress address=new Adress("Ploiesti ", "Vest ", 12);
		PaymentMethod pm = new PaymentMethod("card");
		Customer c=new Customer(address, pm);
		Customer c1=new Customer("Angelescu", "Alexandru ", 20);
		System.out.println(c1.getCompleteName());
		System.out.println(c.getAdress().getCompleteAdress());
		System.out.println(c.getPaymentMethod().getType());

	}

}
