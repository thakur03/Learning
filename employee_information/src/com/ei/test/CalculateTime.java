package com.ei.test;

import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CalculateTime {

	public void timeBySimpleStatement(){
		EmployeeManage em = new EmployeeManage();
		List<Employee> e =  em.viewAllEmployee();
		Collections.sort(e, Employee.COMPARE_BY_NAME);
		Iterator<Employee> itr = e.iterator();
		Calendar cal = Calendar.getInstance();
		while(itr.hasNext()){
			Employee emp = itr.next();
			for(int i =0; i < 10; i++){
				//System.out.print("Current time is  ");
				//System.out.println(cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + ":" + cal.get(Calendar.MILLISECOND));
				System.out.print("	"+emp.getId());
				System.out.print("		"+emp.getName());
				System.out.print("		"+emp.getAddress());
				System.out.print("		"+emp.getSalary());
				System.out.print("		"+emp.getDob());
				System.out.print("		"+emp.getDepartment().getId());
				System.out.print("		"+emp.getDepartment().getName());
				System.out.print("		"+emp.getDepartment().getDesc());
				System.out.println();
		
			}
		}
	}
	
	public void timeByPrepareStatement(){
		ByPrepareStatement em = new ByPrepareStatement();
		List<Employee> e =  em.viewAllEmployee();
		Collections.sort(e, Employee.COMPARE_BY_NAME);
		Iterator<Employee> itr = e.iterator();
		Calendar cal = Calendar.getInstance();
		while(itr.hasNext()){
			Employee emp = itr.next();
			for(int i =0; i < 10; i++){
				//System.out.print("Current time is  ");
				//System.out.println(cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + ":" + cal.get(Calendar.MILLISECOND));
				System.out.print("	"+emp.getId());
				System.out.print("		"+emp.getName());
				System.out.print("		"+emp.getAddress());
				System.out.print("		"+emp.getSalary());
				System.out.print("		"+emp.getDob());
				System.out.print("		"+emp.getDepartment().getId());
				System.out.print("		"+emp.getDepartment().getName());
				System.out.print("		"+emp.getDepartment().getDesc());
				System.out.println();
		
			}
		}
	}
}
