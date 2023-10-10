package org.tmf.sms.app;

import org.tmf.sms.services.StudentServices;
import org.tmf.sms.services.StudentServicesTemplate;

public class StudentApp {
	public static void main(String[] args) {
		StudentServicesTemplate service = new StudentServices();
		service.menu();
	}
}