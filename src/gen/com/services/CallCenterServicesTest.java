package gen.com.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import gen.com.to.Employee;
import gen.com.to.Fresher;
import gen.com.to.TechnicalLeader;

public class CallCenterServicesTest {

	public CallCenterServices callCenterServices;

	@Before
	public void setup() {
		List<Employee> ondutyList = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			ondutyList.add(new Fresher("ken" + i, 10 + i));
		}
		for (int i = 0; i <= 10; i++) {
			ondutyList.add(new TechnicalLeader("TL_ken" + i, 10 + i));
		}
		callCenterServices = new CallCenterServices(ondutyList);
	}

	@Test
	public void testExamples() {
		for (int i = 0; i <= 2; i++) {
			callCenterServices.solveProblem(500);
		}
	}
	
}
