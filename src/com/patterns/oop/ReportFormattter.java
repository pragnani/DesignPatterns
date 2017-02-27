package com.patterns.oop;

public class ReportFormattter {

	private String formatToString(Employee employee) {
		return employee.toString();
	}

	private String formatJson(Employee employee) {
		return "{" + employee.toString() + "}";
	}

	public String formatReport(Employee employee, FormatType type) {
		if (type == FormatType.STRING) {
			return formatToString(employee);
		} else {
			return formatJson(employee);
		}

	}

}
