package com.sellabs.TestngExam;
import org.testng.annotations.*;

public class Groups {
	@BeforeGroups("security")
    public void setUpSecurity() {
        System.out.println("setUpSecurity()");
    }
  
    @AfterGroups("security")
    public void tearDownSecurity() {
        System.out.println("tearDownSecurity()\n");
    }
 
    @BeforeGroups("database")
    public void setUpDatabase() {
        System.out.println("setUpDatabase()");
    }
  
    @AfterGroups(groups="database", enabled=false)
    public void tearDownDatabase() {
        System.out.println("tearDownDatabase()\n");
    }
  
    @BeforeGroups(value="ui")
    public void setUpUI() {
        System.out.println("setUpUI()");
    }
  
    @AfterGroups(value="ui")
    public void tearDownUI() {
        System.out.println("tearDownUI()\n");
    }
 
    @Test(groups= "database")
    public void testInsert(){
        System.out.println("testInsert()");
    }
     
    @Test(groups= "database")
    public void testUpdate(){
        System.out.println("testUpdate()");
    }
 
    @Test(groups= "database")
    public void testDelete(){
        System.out.println("testDelete()");
    }
 
    @Test(groups= "security")
    public void accessHomePage() {
        System.out.println("accessHomePage()");
    }
  
    @Test(groups= "security")
    public void accessAdminPage() {
        System.out.println("accessAdminPage()");
        throw new RuntimeException();
    }
 
    @Test(groups= "ui")
    public void openConfirmationDialog() {
        System.out.println("openConfirmationDialog()");
    }
 
    @Test(groups= "ui")
    public void openFileDialog() {
        System.out.println("openFileDialog()");
    }
     
    @Test(dependsOnGroups= {"ui"})
    public void uiGroupDependentTest(){
        System.out.println("uiGroupDependentTest()");
    }
 
     
    @Test(dependsOnGroups= {"security"})
    public void backendGroupDependentTest1(){
        System.out.println("backendGroupDependentTest1()");
    }
 
    @Test(dependsOnGroups= {"security","database"}, alwaysRun=true)
    public void backendGroupDependentTest2(){
        System.out.println("backendGroupDependentTest2()");
    }
 
}
	
//	@BeforeGroups (groups = {"sanity"})
//	public void logIn () {
//		System.out.println("LogIn successful..");
//		}
//	
//	@Test (groups = {"sanity"})
//	public void search () {
//		System.out.println("Search succesful........");
//		}
//	
//	@Test (dependsOnMethods = {"search"}, groups = {"sanity", "regression"})
//	public void advancedSearch () {
//		System.out.println("Advanced Search successful...");
//		}
//	
//	@Test (dependsOnMethods = {"advancedSearch"}, groups = {"regression"})
//	public void buyProducts () {
//		System.out.println("Buy Products successful...");
//		}
//	
//	@AfterGroups (groups = {"sanity"})
//	public void logOut () {
//		System.out.println("LogOut successful...");
//		}
//
//}
