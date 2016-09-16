/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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
@DiscriminatorColumn(name="Employee", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value="employee")
public class Employee extends Person{
    private static final long serialVersionUID = 1L;
    
    private int soSecNr;
    private float wage;
    private String taxClass;
    
    public Employee(int soSecNr, float wage, String taxClass){
    this.soSecNr = soSecNr;
    this.wage = wage;
    this.taxClass = taxClass;
    }
    
    //default constructor
    public Employee(){
    
    }
    
    //Getters&Setters

    public int getSoSecNr() {
        return soSecNr;
    }

    public void setSoSecNr(int soSecNr) {
        this.soSecNr = soSecNr;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }
    
}
