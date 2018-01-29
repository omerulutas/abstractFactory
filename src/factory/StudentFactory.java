
package factory;

import products.courseProduct.Course;
import products.degreeDocumentProduct.DegreeDocument;
import products.paperProduct.Paper;

/**
 *
 * @author OMER
 */
public interface StudentFactory {
    
    public Course createCourse();
    public Paper createPaper();
    public  DegreeDocument createDegreeErnDoc();
}
