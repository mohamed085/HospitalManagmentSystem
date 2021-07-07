package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Doctor extends User {
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
    private List<Qualification> qualifications = new ArrayList<Qualification>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
    private List<WorkExperince> workExperinces = new ArrayList<WorkExperince>();
       
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
    private List<Appointment> appointments = new ArrayList<Appointment>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    public Doctor() {
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public List<WorkExperince> getWorkExperinces() {
        return workExperinces;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
