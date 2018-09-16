/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author Linh
 */

public class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary)
    {
        if(name == null || id < 0)
        {
            throw new IllegalArgumentException("Invalid name or ID");
        }
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public String getInfo()
    {
        String name = this.name;
        int id = this.id;
        String info = "Name: " + name + " ID: " +id;
        return info;
    }
    
    public boolean idPrime(int id)
    {
        this.id = id;
        if(id<=1) return false;
        for(int i = 2; i<=Math.sqrt(id); i++)
        {
            if(id%i == 0) return false;
        }
        return true;
    }
    
    public double salaryBonus (int id, double salary)
    {
        this.id = id;
        this.salary = salary;
        double bonus;
        if(idPrime(id))
        {
            bonus = salary * 0.13;
        }
        else bonus = salary + 0.1;
        return bonus;
    }
}
