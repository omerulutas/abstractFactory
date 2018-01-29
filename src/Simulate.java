
import factory.*;

/**
 *
 * @author OMER
 */
public class Simulate {
    public static void main(String[] args) {
        
        StudentFactory msStudentFactory = new MsStudentFactory();
        
        Student msStudent = new Student("MS Student", msStudentFactory.createCourse(), 
                msStudentFactory.createPaper(), msStudentFactory.createDegreeErnDoc());
        
        msStudent.printInfo();
        System.out.println();
        
        StudentFactory underGrStudentFactory = new MsStudentFactory();
        
        Student underGrStudent = new Student("Under Graduate Student", underGrStudentFactory.createCourse(), 
                underGrStudentFactory.createPaper(), underGrStudentFactory.createDegreeErnDoc());
        
        underGrStudent.printInfo();
        
        System.out.println();
        StudentFactory phdStudentFactory = new MsStudentFactory();
        
        Student phdStudent = new Student("Under Graduate Student", phdStudentFactory.createCourse(), 
                phdStudentFactory.createPaper(), phdStudentFactory.createDegreeErnDoc());
        
        phdStudent.printInfo();
        
        
    }
}
