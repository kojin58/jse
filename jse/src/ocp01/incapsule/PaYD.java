package ocp01.incapsule;

public class PaYD {
	public static void main(String[] args) {
		String hulk = "헐크";
		int hulkSalary = 200;
		String iron = "아이언";
		int ironSalary = 300;
		String hawk = "호크";
		int hawkSalary = 500;
		
		PayC hulkPay = new PayC();
		hulkPay.setTaxVal(hulkSalary);
		hulkPay.setIncome(hulkSalary);
		PayC ironPay = new PayC();
		ironPay.setTaxVal(ironSalary);
		ironPay.setIncome(ironSalary);
		PayC hawkPay = new PayC();
		hawkPay.setTaxVal(hawkSalary);
		hawkPay.setIncome(hawkSalary);
			
		System.out.println("=== "+hulk+"의 5월 급여내역 ===");
		System.out.println("급여 : "+hulkSalary);
		System.out.println("세금 : "+hulkPay.getTaxVal());
		System.out.println("실수령액 : "+hulkPay.getIncome());
		System.out.println();
		System.out.println("=== "+iron+" 5월 급여내역 ===");
		System.out.println("급여 : "+ironSalary);
		System.out.println("세금 : "+ironPay.getTaxVal());
		System.out.println("실수령액 : "+ironPay.getIncome());
		System.out.println();
		System.out.println("=== "+hawk+" 5월 급여내역 ===");
		System.out.println("급여 : "+hawkSalary);
		System.out.println("세금 : "+hawkPay.getTaxVal());
		System.out.println("실수령액 : ");
		System.out.println();
	}

}


