/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virsitymanagement;

import need.Person;
import need.Semester;
import need.Department;
import need.Generater;
/**
 *
 * @author <Md. Nafiz Imam Zilani>
 */
public class VirsityManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department d1 = new Department("SWE", 35);
        Semester s1 = new Semester("Fall-19", 193);
        
        Generater g1 = new Generater("Nafiz", 30, d1, s1);
        g1.printInfo();
        Generater g2 = new Generater("Imam", 30, d1, s1);
        g2.printInfo();
        Generater g3 = new Generater("Zilani", 30, d1, s1);
        g3.printInfo();
    }
    
}
