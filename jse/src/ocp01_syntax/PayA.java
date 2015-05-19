package ocp01_syntax;

public class PayA {
    private String name;
	private int salary; //급여
	private static final double TAX = 0.1; //세금   0.1
	private int taxVal;
	private int income; //실급여 = 급여 - 급여*세율

	public void setTaxVal(int salary){
		System.out.println("세금계산 : " + (int)(salary*TAX) );
		this.taxVal =  (int) (salary*TAX);
	}
	public void setIncome(int salary){
		this.income = (int) (salary-taxVal);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return this.income;
		
		
	}
}
