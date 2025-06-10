package Praktikum;
import java.util.ArrayList;
import java.util.Collections;

import Praktikum.Customer.Customer;

public class DemoArrayList {
    public static void main(String[] args) {
    
        ArrayList<Customer> customers = new ArrayList<>(2);

        Customer c1 = new Customer("Zakia", 1);
        Customer c2 = new Customer("Budi", 5);

        customers.add(c1);
        customers.add(c2);

        customers.add(new Customer("Cica", 4));
        
        customers.add(2, new Customer("Rosa", 100));
        
        Customer customer = customers.get(1);;
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for(Customer c : customers) {
            System.out.println(c.toString());
        }

        System.out.println("\nArray List Customer Baru");

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer("Della", 201));
        newCustomers.add(new Customer("Victor", 202));
        newCustomers.add(new Customer("Sarah", 203));
    
        customers.addAll(newCustomers);

        for(Customer c : customers) {
            System.out.println(c.toString());
        }

        System.out.println("\nSorting Customers");
        customers.sort((cus1,cus2)->cus1.name.compareTo(cus2.name));
        customers.forEach(System.out::println);


        System.out.println("\nSorting");
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);
    
     
    }


}

