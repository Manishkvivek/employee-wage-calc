public class EmpWageBuilder{

		public static final int NO_OF_WORKING_DAYS = 20;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static final int MAX_WORKING_HOURS = 100;

	public static void main(String[] argc) {
		int empHrs = 0;
		int empWage = 0;
		int totalWorkingHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		for (int day = 0; day < NO_OF_WORKING_DAYS && totalWorkingHrs < MAX_WORKING_HOURS; day++) {
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}

			totalWorkingHrs += empHrs;
		}

		empWage = totalWorkingHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
