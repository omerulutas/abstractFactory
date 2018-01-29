
import products.courseProduct.Course;
import products.degreeDocumentProduct.DegreeDocument;
import products.paperProduct.Paper;



/**
 *
 * @author OMER
 */
public class Student {
    
    private String type;
    private Course course;
    private Paper paper;
    private DegreeDocument degreeDocument;
    
    public Student(String type, Course course, Paper paper, DegreeDocument degreeDocument) {
        this.type = type;
        this.course = course;
        this.paper = paper;
        this.degreeDocument = degreeDocument;
    }

    public String getType() {
        return type;
    }

    public Course getCourse() {
        return course;
    }

    public Paper getPaper() {
        return paper;
    }

    public DegreeDocument getDegreeDocument() {
        return degreeDocument;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setDegreeDocument(DegreeDocument degreeDocument) {
        this.degreeDocument = degreeDocument;
    }
    
    public void printInfo(){
        System.out.println("Type: "+ this.type);
        System.out.println("Course: "+ this.course.getCourseName());
        System.out.println("Paper: "+ this.paper.getPaperName());
        System.out.println("Degree Document: "+ this.degreeDocument.getDegreeDocName());
    }
    
}
