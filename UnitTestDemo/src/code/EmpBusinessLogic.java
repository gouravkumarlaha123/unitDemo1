package code;

public class EmpBusinessLogic {	
	public double annualSalary(EmployeeDetails details) {
		double annualSalary=details.getSalary()*11;
		return annualSalary;
	}
	public double appraisals(EmployeeDetails details) {
		double appraisals=0.0;
		if (details.getSalary()<10000) {
			appraisals=500;
		} else {
			appraisals=1000;
		}
		return appraisals;
	}
	
}
