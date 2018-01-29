
package factory;

import products.courseProduct.Course;
import products.courseProduct.UndrGraduateStudentCourse;
import products.degreeDocumentProduct.DegreeDocument;
import products.degreeDocumentProduct.ProjectReport;
import products.paperProduct.Paper;
import products.paperProduct.TechnicalReport;

/**
 *
 * @author OMER
 */
public class UndrGraduateStudentFactory implements StudentFactory {

    @Override
    public Course createCourse() {
        
        return new UndrGraduateStudentCourse();
    }

    @Override
    public Paper createPaper() {
        
        return  new TechnicalReport();
    }

    @Override
    public DegreeDocument createDegreeErnDoc() {
        
        return new ProjectReport();
    } 
}
