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
public class Department {
    private String name;
    private int Code;

    public Department(String name, int Code) {
        this.name = name;
        this.Code = Code;
    }

    public Department() {
    }
    
    
    
    public String getName() {
        return name;
    }

    public int getCode() {
        return Code;
    }
    
    
}
