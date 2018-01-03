/*
 * Person.java
 */
/**
 * CPS 151, Section 02
 * 
 * Lab Project 7
 *
 *@author
 * Kristi Hicks
 * hicksk2
 */
public class Person extends LabProj7{
    private int numofpeople = 0;
	private String name;
    private static int count=0;

    public Person(String name)
    {	numofpeople = count;
    	count ++;
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
        
    }

    public String getName()
    {
        return name;
    }

    public void speak()
    {
        System.out.println("My name is " + name);
    }
    
    public static void printCount()
    {
    	System.out.println("Number of people: " + count);
    }
} // end class Person

/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 7
*
* Description:
*	This program creates a person and declares its name and for every person
*	that is created it keeps a count of how many people are created.
*   
* Bug Report:
*   None.
*/
