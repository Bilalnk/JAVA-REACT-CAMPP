package Entities;

import Abstract.IEntity;

import java.util.Date;

public class Customer implements IEntity {

    private int Id;
    private String firstName;
    private String LastName;
    private Date DateOfBirth;
    private String NationalityId;

    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        Id = id;
        this.firstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }

    public Customer() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
