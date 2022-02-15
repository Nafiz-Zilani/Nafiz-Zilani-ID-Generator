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
public class Generater extends Person{
    private String iD;
    private int batch;
    private Semester sem = new Semester();
    private final int serial = 0000;
    private static int count;

    public Generater(String name, int batch,  Department dept, Semester sem) {
        this.name = name;
        this.dept = dept;
        this.batch = batch;
        this.sem = sem;
        count++;
        this.iD = createId();
    }
    
    public String createId(){
        int idSerial= serial+count;
        return sem.getCode()+"-"+dept.getCode()+"-"+idSerial;
    }
    
    public void printInfo(){
        System.out.println("Name: "+ name+"\nID: "+iD+"\nDepartment: "+dept.getName()+"\nSemester: "+sem.getName()+"\nBatch: "+batch+"\n");
    }
    
}
