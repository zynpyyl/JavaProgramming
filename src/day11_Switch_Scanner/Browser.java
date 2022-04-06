package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        /*  Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name
	        Ex:
	        	String browser = "chrome";
	    	Output:
	    		Chrome Browser is selected
			Note: MUST use nested if
         */
        String browserName="Chrome";
        if (browserName=="Chrome"||browserName=="Firefox"||browserName=="Opera"||browserName=="Safari"|| browserName=="Edge") {
            System.out.println(browserName + " browser is selected.");
        }else{
            System.out.println("Invalid browser name.");
        }
    }
        }
