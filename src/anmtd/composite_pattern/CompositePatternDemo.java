package anmtd.composite_pattern;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMaketing = new Employee("Michel", "Head Maketing", 20000);

		Employee clerk1 = new Employee("Laura", "Maketing", 10000);
		Employee clerk2 = new Employee("Bob", "Maketing", 10000);

		Employee salesExcutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExcutive2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMaketing);

		headSales.add(salesExcutive1);
		headSales.add(salesExcutive2);

		headMaketing.add(clerk1);
		headMaketing.add(clerk2);

		// print all employee of the organization
		System.out.println(CEO);

		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
