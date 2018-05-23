package dk.comet.models;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nationality")
public class Nationality {

    @Id
    @Column(name = "nationality")
    private String Nationality;

    @Column(name = "usa")
    private String USA;

    @Column(name = "uk")
    private String UK;

    @Column(name = "canada")
    private String Canada;

    @Column(name = "australia")
    private String Australia;


    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getUSA() {
        return USA;
    }

    public void setUSA(String USA) {
        this.USA = USA;
    }

    public String getUK() {
        return UK;
    }

    public void setUK(String UK) {
        this.UK = UK;
    }

    public String getCanada() {
        return Canada;
    }

    public void setCanada(String canada) {
        Canada = canada;
    }

    public String getAustralia() {
        return Australia;
    }

    public void setAustralia(String australia) {
        Australia = australia;
    }
}
