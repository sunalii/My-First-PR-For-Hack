/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Sunali
 */
public class Student {  //Declaring a class
    private String name;
    private String indexNo;
    private float courseworkMarks;
    private float finalMarks;
    
    public Student(){   //Creating a Constructor
        //1. The name of the constructor and the class is the same.
        //2. A default constructor has no parameteres. 
    }
    
    public Student(String name, String indexNo){    //To display name and Index No
        this.name=name;     //this.name indicated the class variable of the Student()class
        this.indexNo=indexNo;
    }
    
    public Student(String indexNo){ //To display only the Index No
        this.indexNo=indexNo;
    }
    
    public float calculateFinalMarks(float cw,float ex){    //Return the final result marks
        return (float)(cw*0.4 + ex*0.6); //coursework 40% final marks 60%
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student st1 = new Student();
        //object    reference/variable  =   new   constructor of the class()
        
        Student st2 = new Student("2405");
        Student st3 = new Student("abc","2405");
        
        float result1 = st1.calculateFinalMarks(56.0f,85.0f);
        float result2 = st2.calculateFinalMarks(78.0f,46.8f);
        float result3 = st3.calculateFinalMarks(38.8f,78.0f);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    
}
