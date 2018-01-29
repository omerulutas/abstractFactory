/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import products.courseProduct.Course;
import products.courseProduct.PhdStudentCourse;
import products.degreeDocumentProduct.DegreeDocument;
import products.degreeDocumentProduct.Dissertation;
import products.paperProduct.JournalPaper;
import products.paperProduct.Paper;

/**
 *
 * @author OMER
 */
public class PhdStudentFactory implements StudentFactory {

   
    
    @Override
    public Course createCourse() {
        
        return new PhdStudentCourse();
    }

    @Override
    public Paper createPaper() {
        
        return new JournalPaper();
    }

    @Override
    public DegreeDocument createDegreeErnDoc() {
        
        return new Dissertation();
    }
}
