/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Acer
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Student", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value="student")
public class Student extends Person{
    private static final long serialVersionUID = 1L;
    
    private int matNr;
    private Date matDate;
    
    public Student(int matNr, Date matDate){
    this.matNr = matNr;
    this.matDate = matDate;
    }
    
    //default constructor
    public Student(){
    
    }
    //Getters&Setters
    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public Date getMatDate() {
        return matDate;
    }

    public void setMatDate(Date matDate) {
        this.matDate = matDate;
    }
    
}
