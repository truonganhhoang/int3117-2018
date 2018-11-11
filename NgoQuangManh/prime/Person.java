/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.prime;

/**
 *
 * @author Manh-PC
 */
public class Person {

    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public Person() {        
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public boolean checkPrime() {
        if (this.age < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(this.age); i++) {
                if (this.age % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
