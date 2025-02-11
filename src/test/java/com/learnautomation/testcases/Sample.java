package com.learnautomation.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample 
{
	
	@Test
	public void sampleTest()
	{
		System.out.println("Sample Test Executed");
	}
	
	@Parameters("TestParameter")
	@Test
	public void sampleTest1(String TestPara)
	{
		System.out.println("Sample Test Executed By Passing Parameters from  pom file with value "+TestPara);
	}

}
