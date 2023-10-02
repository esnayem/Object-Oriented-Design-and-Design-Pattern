public class Owner {
    private int owner_id;
    private String owner_name;
    private String address;
    private String contract_number;
    
    // constractor for set Owner information
    public Owner(int owner_id, String owner_name, String address, String contract_number){
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.address = address;
        this.contract_number = contract_number;
    }
    int getId(){return owner_id;}
    String getOwner_name(){return owner_name;}
    String getAddress(){return address;}
    String getContract_number(){return contract_number;}

    public void owner_info(){
        System.out.println("The Owner id = " + owner_id + ", Owner Name is : " + 
        owner_name + ", Address: " + address + ", Contract number : " + contract_number);
    }
}
