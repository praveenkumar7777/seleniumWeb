package config;
 
public class Constants {
 
	//List of System Variables
	public static final String URL = "http://mspot.rubique.com";
	public static final String Path_TestData = "C://Users//praveen.kumar//eclipse-workspace//mspot.rubique.com//src//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "C://Users//praveen.kumar//eclipse-workspace//mspot.rubique.com//src//config//OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =3 ;
	public static final int Col_ActionKeyword =4 ;
	//New entry in Constant variable
	public static final int Col_RunMode =2 ;
	
	//Create two new Constants variables for the results column of Test Case sheet and Test Step sheet
	public static final int Col_Result =3 ;
	public static final int Col_TestStepResult =5 ;
	

   // Create a new constant variable for column Data Set.
   // As we have shifted the result columns, do not forget to increment the number of column for Result constant variable.

	
	public static final int Col_DataSet =5 ;
	public static final int Col_TestStepResult1 =6 ;
	//Create two new Constants variables for the Pass results & Fail result
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
 
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	//New entry in Constant variable
    public static final String Sheet_TestCases = "Test Cases";
 
	//List of Test Data
	public static final String UserName = "Cross777@sel.com";
	public static final String Password = "rub!que@123";
 
}

/*package config;

public class Constants {

	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "http://mspot.rubique.com";
	public static final String Path_TestData = "C://Users//praveen.kumar//eclipse-workspace//mspot.rubique.com//src//dataEngine//DataEngine.xlsx";
	public static final String File_TestData = "DataEngine.xlsx";
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_ActionKeyword =3 ;
 
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
 
	// List of Test Data
	public static final String UserName = "testuser_3";
	public static final String Password = "Test@123";
	
}
*/