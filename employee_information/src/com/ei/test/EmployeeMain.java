package com.ei.test;

public class EmployeeMain {

	public static void main(String[] args) {
		long startTimeForSimple = System.currentTimeMillis();
		CalculateTime calBySimpleStatement = new CalculateTime();
		calBySimpleStatement.timeBySimpleStatement();
		long endTimeForSimple = System.currentTimeMillis();
		long totalTimeForSimple = endTimeForSimple - startTimeForSimple;
		
		long startTimeForPreparedStmt = System.currentTimeMillis();
		CalculateTime calByPreparedStmt = new CalculateTime();
		calByPreparedStmt.timeByPrepareStatement();
		long endTimeForPreparedStmt = System.currentTimeMillis();
		long totalTimeForPreparedStmt = endTimeForPreparedStmt - startTimeForPreparedStmt;
		
		System.out.println("time taken by Simple Statement = " + totalTimeForSimple + " ms");
		System.out.println("time taken by prepared Statement = " + totalTimeForPreparedStmt + " ms");
	}
}
