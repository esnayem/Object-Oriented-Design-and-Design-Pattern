public class Animal extends Owner{

    private String type;
    private int id;
    private String name;
    private int age;
    private double weight;
    private String color;
    private String breed;

    private String desease;
    private String desease_type;
    private String lastDate;

    public Animal(int owner_id, String owner_name, String address, String contract_number, String type, int id, String name, int age, double weight, String color, String breed) {
        super(owner_id, owner_name, address, contract_number);
        this.type = type;
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.breed = breed;
    }

    public Animal(int owner_id, String owner_name, String address, String contract_number, String type, int id) {
        super(owner_id, owner_name, address, contract_number);
        this.type = type;
        this.id = id;
    }
   
    // Getters and setters
    public void setDesease(String desease) {
        this.desease = desease;
    }
    public void setDesease_type(String desease_type) {
        this.desease_type = desease_type;
    }
    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }
    String getName() {return name;}
    String getType(){return type;}
    int getId(){return id;}
    String getColor(){return color;}
    String getBreed(){return breed;}
    int getAge(){return age;}
    double getWeight(){return weight;}

    public void info(){
        System.out.println("Type : " + type + ", id : " + id + ", Name : " + name + ", age : " + 
        age + ", Weight : " + weight + ", Color : " + color + ", Breed : " + breed);
        if(desease == null){
            System.out.println("The "+ type + "has no desease");
        }
        else{
            System.out.println("This " + type + " has : " + desease + ", desease type : " + desease_type + ", Last Checkup Date : " + lastDate);
        }
    }

}

// Dog class (inherits from Animal)
class Dog extends Animal {
    public Dog(int owner_id, String owner_name, String address, String contract_number, String type, int id, String name, int age, double weight, String color, String breed) {
        super(owner_id, owner_name, address, contract_number, type, id, name, age, weight, color, breed);
    }
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

// Cat class (inherits from Animal)
class Cat extends Animal {
    public Cat(int owner_id, String owner_name, String address, String contract_number, String type, int id, String name, int age, double weight, String color, String breed) {
        super(owner_id, owner_name, address, contract_number, type, id, name, age, weight, color, breed);
    }

    public void meow() {
        System.out.println("Meow!");
    }
}

// Bird class (inherits from Animal)
class Bird extends Animal {
    public Bird(int owner_id, String owner_name, String address, String contract_number, String type, int id, String name, int age, double weight, String color, String breed) {
        super(owner_id, owner_name, address, contract_number, type, id, name, age, weight, color, breed);
    }

    public void chirp() {
        System.out.println("Chirp! Chirp!");
    }
}

//Rabit class(inherits from Animal)
class Rabit extends Animal{
    public Rabit(int owner_id, String owner_name, String address, String contract_number, String type, int id, String name, int age, double weight, String color, String breed){
        super(owner_id, owner_name, address, contract_number, type, id, name, age, weight, color, breed);
    }
    public void makeHoles(){
        System.out.println("expert in making holes .");
    }
}
