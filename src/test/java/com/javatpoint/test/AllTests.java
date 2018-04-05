package com.javatpoint.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountantLoginTest.class, AddAccountantFormTest.class, AddAccountantTest.class,
		AddStudentFormTest.class, AddStudentTest.class, AdminLoginTest.class, DeleteAccountantTest.class,
		DeleteStudentTest.class, DueFeeTest.class, EditAccountantFormTest.class, EditAccountantTest.class,
		EditStudentFormTest.class, EditStudentTest.class, LogoutAccountantTest.class, LogoutAdminTest.class,
		SearchStudentFormTest.class, SearchStudentTest.class, ViewAccountantTest.class, ViewStudentTest.class })
public class AllTests {

}
