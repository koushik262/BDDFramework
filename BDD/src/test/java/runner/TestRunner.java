package runner;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\selinium\\COMPREHENSIVE\\BDD\\src\\test\\java\\Features",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
