package Praktikum.Customer;

public class Customer {
    public String name;
    public int id;

    public Customer(){};
    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return String.format(" ID: %s Nama: %s", this.id, this.name);
    }
}
