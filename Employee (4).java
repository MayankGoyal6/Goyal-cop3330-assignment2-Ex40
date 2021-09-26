/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution, Exercise 40
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Date;
import java.util.TreeMap;

public class Employee {
    static TreeMap<Integer, Employee> employees = new TreeMap<>();
    
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;
      
    public Employee(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
  
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    
    public String getSeparationDate() { return separationDate; }
    public void setSeparationDate(String separationDate) { this.separationDate = separationDate; }
      
    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lastName=" + lastName
        + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }
      
    public static int search(String name)
    {
        int count = 0;
        System.out.println("");
        System.out.println("Results:");
        System.out.println("");
        System.out.printf("%-20s %2s %-20s %2s %-20s", "Name", "|", "Position", "|", "Seperation Date");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

        String src = name.toLowerCase();        
        for(int k : employees.keySet())
        {
            if(employees.get(k).getFirstName().toLowerCase().contains(src) || 
                employees.get(k).getLastName().toLowerCase().contains(src))
            {
                count++;
                
                System.out.format("%-20s %2s %-20s %2s %-20s",
                        employees.get(k).getFirstName() + " " + employees.get(k).getLastName(), "|", employees.get(k).getPosition(), "|", employees.get(k).getSeparationDate());
                System.out.println();
            }
        }
        return count;
    }
}