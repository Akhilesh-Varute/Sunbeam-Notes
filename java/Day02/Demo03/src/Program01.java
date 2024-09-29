
public class Program01 {

	public static void calculateTotalSalary(double basicSalary, double incentive) {
		double totalSalary = basicSalary+incentive;
		System.out.println(totalSalary);
	}

	public static void main(String[] args) {
		calculateTotalSalary(10000,5000);
		
	}

}
