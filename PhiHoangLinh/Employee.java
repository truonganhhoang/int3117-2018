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
    String name;
    int id;
    double salary;
    
    //Constructors
    Employee(){
    }
    
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    /*
    @param name    an employee's name
    @param id      an employee's ID
    @return        the name and ID of an employee
    */
    public String getInfo(String name, int id){
        String info;
        
        if((name == null) || (id < 0)){
            throw new IllegalArgumentException("Invalid name or ID");
        }
        info = "Name: " + name + " ID: " + id;
        return info;
    }
    
    /*
    @param id   an employee's ID
    @return     true if the employee's ID is a prime number
                false of the employee's ID is not a prime number
    */
    public boolean idIsPrime(int id){
        boolean b = true;
        
        if(id <= 1){
            b = false;
            return b;
        }
        else{
            for(int i = 2; i <= Math.sqrt(id); i++){
                if(id%i == 0){
                    b = false;
                   return b;
                }
            }
        }
        return b;
    }
    
    /*
    @param id       an employee's ID
    @param salary   an employee's salary
    @return         the bonus that's 13% of the salary if id is a prime number
                    the bonus that's 10% of the salary if id is not a prime number
    */
    public double salaryBonus (int id, double salary){
        double bonus;
        
        if(idIsPrime(id) == true){
            bonus = salary * 0.13;
        }
        else{
            bonus = salary * 0.1;
        }
        return bonus;
    }
}
