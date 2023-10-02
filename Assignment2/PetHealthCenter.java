import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetHealthCenter {
    public static void main(String[] args) {
         // Create a list of animals
        List<Animal> animals = new ArrayList<>();
        List<PetDoctor> petDoctors = new ArrayList<>();

        // Add new animals 
        Scanner scan = new Scanner(System.in);
        int count = 0, oi = 5000, pi = 200, first = 0;

        System.out.println();
        System.out.println("__________Wellcome to Pet Health Center________ ");
        System.out.println();

        while(true)
        {
            if(count == 0){
                System.out.println("1 => Add new pet");
                System.out.println("2 => Show all the pet");
                System.out.println("3 => Show the Pet doctor list / vatenarians ");
                System.out.println("4 => Arrange an appoinment");
                System.out.println();
                count++;
            }

            System.out.print("Take an action : ");
            int occur = scan.nextInt();
            scan.nextLine();

            if(first == 0){
                first++;
                animals.add(new Dog(4996, "Hridoy", "Norail", "01711111111", "Dog", 196, "Papi", 2, 23.5, "White", "Affengriffon"));
                animals.add(new Cat(4997, "Ahnaf", "Mymanshing", "0172222222", "Cat", 197, "Black Don", 1, 2.3, "Black", "Persian"));
                animals.add(new Bird(4998, "Toufiq", "Dhaka", "0173333333", "Bird", 198, "Parot", 2, .5, "Green and Red", "Abyssinian Lovebird"));
                animals.add(new Rabit(4999, "Mamun", "Narainganj", "0174444444", "Rabit", 199, "Miki", 1, 1, "White", "Chinchilla"));
                
                petDoctors.add(new PetDoctor("d145", "Amin", "Dog Specialist", "01733333333", "amin@gmail.com", 28));
                petDoctors.add(new PetDoctor("d146", "Bee", "Cat Specialist", "01744444444", "bee@gmail.com", 30));
                petDoctors.add(new PetDoctor("d147", "Cob", "Bird Specialist", "0175555555", "cob@gmail.com", 32));
                petDoctors.add(new PetDoctor("d150", "Mustofa", "Rabit Specialist", "01766666666", "mustofa@gmail.com", 35));
            }

            if(occur == 1)
            {
                System.out.print("Owner name = ");
                String owner_name = scan.nextLine();

                int owner_id = ++oi;

                System.out.print("Address = ");
                String address = scan.nextLine();

                System.out.print("Contract Number = ");
                String contract_number = scan.nextLine();

                System.out.print("Take the animal type : ");
                String animal_type = scan.nextLine();

                int id = ++pi;

                System.out.print("Animal Name = ");
                String name = scan.nextLine();

                System.out.print("Take age = ");
                int age = scan.nextInt();
                scan.nextLine();

                System.out.print("Animal weight = ");
                double weight = scan.nextDouble();
                scan.nextLine();

                System.out.print("Animal color is = ");
                String color = scan.nextLine();

                System.out.print("Animal Breed = ");
                String breed = scan.nextLine();

                if(animal_type.equals("Dog")){
                    animals.add(new Dog(owner_id, owner_name, address, contract_number, animal_type, id, name, age, weight, color, breed));
                }
                else if(animal_type.equals("Cat")){
                    animals.add(new Cat(owner_id, owner_name, address, contract_number, animal_type, id, name, age, weight, color, breed));
                }
                else if(animal_type.equals("Bird")){
                    animals.add(new Bird(owner_id, owner_name, address, contract_number, animal_type, id, name, age, weight, color, breed));
                }
                else if(animal_type.equals("Rabit")){
                    animals.add(new Rabit(owner_id, owner_name, address, contract_number, animal_type, id, name, age, weight, color, breed));
                }
                else{
                    System.out.println("Illigal input ");
                    scan.close();
                    break;
                }
                
                System.out.println();
                System.out.println("Added a new Animal here is the information ");
                System.out.println("Type : " + animal_type + " id : " + id + " Name : " + name + " age : " + age + " Weight : " + weight + " Color : " + color + " Breed : " + breed);
                System.out.println();
                continue;
            }

            else if(occur == 2)
            {
                System.out.println("The pets list");

                for (Animal animal : animals) {
                    animal.info();
                    
                    animal.owner_info();
                    System.out.println();
                }
            }
            else if(occur == 3){
                System.out.println("Pet doctors list : ");
                for(PetDoctor petDoctor : petDoctors)
                {
                    petDoctor.showInfo();
                    System.out.println();
                }
            }   
            else if(occur == 4)
            {
                System.out.println("Before appoinment See the doctor list (=> 3)");
                System.out.print("Enter the doctor id = ");
                String doc_id = scan.nextLine();
                System.out.print("Enter the pet id = ");
                int pet_id = scan.nextInt();
                System.out.println();
                for(Animal pet : animals)
                {
                    int pid = pet.getId();
                    if(pid == pet_id)
                    {
                        for(PetDoctor petdoc : petDoctors)
                        {
                            String pd = petdoc.getId();
                            if(pd.equals(doc_id)){
                                System.out.println("Manage an appoinment with >>>> ");
                                System.out.println("\nThe Owner and Pet information is");
                                pet.owner_info();
                                pet.info();
                                System.out.println("\nThe Doctor is");
                                petdoc.showInfo();
                    
                                pet.setDesease("Desease");
                                pet.setDesease_type("spacial desease");
                                pet.setLastDate("12/09/2023\n");

                                System.out.println("\nUpdate the info ");
                                pet.owner_info();
                                pet.info();
                                System.out.println();
                            }
                        }
                    }
                }
                 
            }
            else
            {
                scan.close();
                break;
            }
        }
    }
}
