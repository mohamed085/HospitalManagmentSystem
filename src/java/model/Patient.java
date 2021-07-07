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
public class Patient extends User {
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private List<Appointment> appointments = new ArrayList<Appointment>();
   
}
