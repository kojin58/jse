package ocp01.incapsule;

public class PayC {
	  private String name;
		private int salary; //급여
		private static final double TAX = 0.1; //세금   0.1
		private int taxVal;
		private int income; //실급여 = 급여 - 급여*세율
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getTaxVal() {
			return (int) taxVal;
		}
		public void setTaxVal(int salary) {
			this.taxVal = (int) (salary*TAX);
		}
		public int getIncome() {
			return this.income;
		}
		public void setIncome(int income) {
			this.income = (int) (salary-taxVal);
		}


}
