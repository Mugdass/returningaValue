/*******************
Name: Matas Backevicius

Date: April 21, 2021

Notes: Here we create a method and return its Value by printing the variable and calling the method to return that value.
*******************/

public class ReturnValue          /* because we want to return the value of a string*/
{
public static void main(String[] args)
{
System.out.println(sub("Adams"));   /* the string variable will contain 'x' as a value*/
}
public static String sub(String x)    /* when we call x it will print the 'string value' "Adams" */
{                                      /* but first we must identify the name of the stirng in this case 'sub' */
return ("My great-grandfather was John " + x + "\n"+ "," +
 " but I'm the fifth John " + x + ";"+"\n"+" and yet they still call me 'John " + x + " the IV. ");
}
}           /* here we return the argument in the method by calling the value of a 'string x'
                            and printing the returning statement with the value= "Adams". */