/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Manh-PC
 */
public class Person {

    private String _name;
    private int _age;
    
    public void SetName(String name) {
        this._name = name;
    }
    
    public void SetAge(int age) {
        this._age = age;
    }
    
    public String GetName() {
        return this._name;
    }
    
    public int GetAge() {
        return this._age;
    }
    
    public Person() {        
    }
    
    public Person(String name, int age) {
        this._name = name;
        this._age = age;
    }
    
    public boolean KiemTraNguyenTo() {
        if (this._age < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(this._age); i++) {
                if (this._age % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
