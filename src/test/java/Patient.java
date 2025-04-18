//THIS DOCUMENT IS FOR THE JAVA PATIENT CLASS
public class Patient {
    private int id, age;
    private String Name, Gender, Address, Contact;
    
    public Patient(){
    this.id = 0;
        this.age = 0;
        this.Name = "";
        this.Gender = "";
        this.Address = ""; 
        this.Contact = "";
 }
    
    public Patient(int id, int age, String Name, String Gender, String Address, String Contact){
        this.id = id;
        this.age = age;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address; 
        this.Contact = Contact;
 
    }
    //Next part comes the setters and getters for the information that is to be processed

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", age=" + age + ", Name=" + Name + ", Gender=" + Gender + ", Address=" + Address + ", Contact=" + Contact + '}';
    }
    
    
        
}
