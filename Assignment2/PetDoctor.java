import java.util.List;

public class PetDoctor {
    private String ID, name, specialization, address, phone, mail;
    private int age;
    //private Patient patient;

    PetDoctor(String ID, String name, String specialization, String phone, String mail, int age)
    {
        this.ID = ID;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.age = age;
        this.mail = mail;
    }

    void showInfo()
    {
        System.out.println("Name: " + name + ", Doctor ID: " + ID + ", Age: " + age + ", Specialization: "
         + specialization + ", Address: " + address + ", Phone: " + phone + ", Mail: " + mail);
    }
    // getter and setter 
    String getId(){return ID;}
    String getName(){return name;}
    String getSpe(){return specialization;}
    String getPhone(){return phone;}
    int getAge(){return age;}
    String getMail(){return mail;}
}
