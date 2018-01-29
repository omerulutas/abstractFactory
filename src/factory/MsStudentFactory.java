
package factory;

import products.courseProduct.Course;
import products.courseProduct.MsStudentCourse;
import products.degreeDocumentProduct.DegreeDocument;
import products.degreeDocumentProduct.MsThesis;
import products.paperProduct.ConferencePaper;
import products.paperProduct.Paper;

/**
 *
 * @author OMER
 */
public class MsStudentFactory implements StudentFactory {
    
    @Override
    public Course createCourse() {
        
        return new MsStudentCourse();
    }

    @Override
    public Paper createPaper() {
        
        return new ConferencePaper();
    }

    @Override
    public DegreeDocument createDegreeErnDoc() {
        
        return new MsThesis();
    }
    
}
