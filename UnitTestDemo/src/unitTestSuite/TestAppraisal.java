package unitTestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import code.EmpBusinessLogic;
import code.EmployeeDetails;

public class TestAppraisal {
	EmployeeDetails details=new EmployeeDetails();
	EmpBusinessLogic logic=new EmpBusinessLogic();	
	@Test
	public void testAppraisalLessThanTen() {
		try {
			details.setName("Aditi");
			details.setSalary(9000.0);
			details.setAge(20);
			double appraisal = logic.appraisals(details);
			Assert.assertEquals(appraisal, 500.0);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	@Test
public void testAppraisalMoreThanTen() {
		try {
			details.setName("Aditi");
			details.setSalary(39000.0);
			details.setAge(20);
			double appraisal = logic.appraisals(details);
			Assert.assertEquals(appraisal, 1000.0);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	@Test
public void testAppraisalEqualsTen() {
		try {
			details.setName("Aditi");
			details.setSalary(10000.0);
			details.setAge(20);
			double appraisal = logic.appraisals(details);
			Assert.assertEquals(appraisal, 1000.0);
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
