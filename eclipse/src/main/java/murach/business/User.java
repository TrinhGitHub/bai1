package murach.business;

public class User {
	private String firstName;
    private String lastName;
    private String email;
 
    
    public User(){
    firstName = "";
    lastName = "";
    email = "";
    }
    public User(String firstName,String lastName,String email){
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    }
    public String getFirstName(){
        return firstName;
    } 
    public void setFirstName(String firstName){
        this.firstName = firstName;
        
    }
    public String getlastName(){
        return lastName;
    } 
    public void setlastName(String lastName){
        this.lastName = lastName;
        
    }
    public String getemail(){
        return email;
    } 
    public void setemail(String email){
        this.email = email;
        
    }
}
