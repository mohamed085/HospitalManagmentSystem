package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String instituteName;
    private String qualificationDate;
    private String qualificationName;
    private String degree;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public Qualification() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getQualificationDate() {
        return qualificationDate;
    }

    public void setQualificationDate(String qualificationDate) {
        this.qualificationDate = qualificationDate;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Qualification{" + "id=" + id + ", instituteName=" + instituteName + ", qualificationDate=" + qualificationDate + ", qualificationName=" + qualificationName + ", degree=" + degree + '}';
    }


    
    
}
