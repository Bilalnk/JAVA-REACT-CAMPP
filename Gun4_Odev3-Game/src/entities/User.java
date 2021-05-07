package entities;

import java.util.Date;

import abstracts.IEntity;

public class User implements IEntity{
	
	 private int Id;
	    private String firstName;
	    private String LastName;
	    private Date DateOfBirth;
	    private String NationalityId;
	
	    public User() {
			// TODO Auto-generated constructor stub
		}
	    
		public User(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
			super();
			Id = id;
			this.firstName = firstName;
			LastName = lastName;
			DateOfBirth = dateOfBirth;
			NationalityId = nationalityId;
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
