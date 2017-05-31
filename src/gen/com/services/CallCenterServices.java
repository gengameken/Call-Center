package gen.com.services;

import java.util.ArrayList;
import java.util.List;

import gen.com.to.Employee;

/**
 * 
 * @author kanghaofan
 *
 */
public class CallCenterServices {

	public List<Employee> ondutyList = new ArrayList<>();
	
	public CallCenterServices(List<Employee> ondutyList) {
		this.ondutyList = ondutyList;
	}

	public synchronized void solveProblem(int time) {
		Employee e;
		if (time > 0) {
			try {
				if (ondutyList.isEmpty()){
					System.out.println("Sorry, is Empty");
				} else {
					e = ondutyList.get(0);
					System.out.println(e.getName() + " " + e.getLv());
		
					ondutyList.remove(e);
					//do something
					Thread.sleep(time); // 工作都是在睡覺
					
					ondutyList.add(e); //處理完，又可以接電話。
				}
			} catch (InterruptedException ex) {ex.printStackTrace();}
		} else {
			System.out.println("Sorry, time is money");
		}
	}
}
