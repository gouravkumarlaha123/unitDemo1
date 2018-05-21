package unitTestSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import code.EmpBusinessLogic;
import code.EmployeeDetails;

public class TestAnnualSalary {
	EmployeeDetails details=new EmployeeDetails();
	EmpBusinessLogic logic=new EmpBusinessLogic();	
	@Test
	public void testAnnualSal() {
		try {
			details.setName("Sahil");
			details.setAge(23);
			details.setSalary(10000.0);
			double annualSalary = logic.annualSalary(details);
			Reporter.log("The annual Salary of employee with 10000/month =  "+annualSalary, true);
			Assert.assertEquals(annualSalary, 120000.0);
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
