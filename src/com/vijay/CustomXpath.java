package com.vijay;

public class CustomXpath {

	public static void main(String[] args) {
		
		//WITHOUT CONTAINS
		//without contains - xpath - "//tagname[@attributename='attributevalue']"  (eg: "//input[@class='name']")
		
		//CONTAINS
		//withcontains - xpath - "//tagname[contains(@attributename, 'attributevalue')]" (eg: "//input[contains(@class,'name')]"
		//contains is used to handle dynamic ID's
		
		//STARTS-WITH
		//we can also use 'starts-with' instead of 'contains' when the initial words of the attribute value is static (eg: "//input[starts-with(@class,'name_')]"
		
		//ENDS-WITH
		//we can also use 'ends-with' instead of 'starts-with' with last words of the value is static (eg: "//input[ends-with(@class,'name_')]"
	
		//FOR LINTS - custom xpath
		//we can use TEXT() function to identify the links with text (eg: "//a[contains(text(),'My Account')]"
		
		//disadvantage of ABSOLUTE XPATH
		//performance issue
		//not reliable
		//can be changed at any time in future
		
		//advantages of RELATIVE XPATH
		//fast
		//reliable
		//
		
	
	
	
	
	}

}
