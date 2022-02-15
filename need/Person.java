/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package need;

/**
 *
 * @author <Md. Nafiz Imam Zilani>
 */
public abstract class Person {
    protected String name;
    protected Department dept = new Department();

    public Person(String name, Department dept) {
        this.name = name;
        this.dept = dept;
    }

    public Person() {
    }
    
    
    
    public void showInfo(){
        //Null
    }
}
