package com.company;

import java.util.ArrayList;
public class MobilePhones {
    private Contacts contacts;
    private String name;
    private String number;
    ArrayList<Contacts> myContacts;

    public MobilePhones(Contacts contacts) {
        this.contacts = contacts;
        myContacts = new ArrayList<Contacts>();

    }

    public boolean addContact(String name, String number) {
        Contacts contacts = new Contacts(name, number);
        if (findContacts(contacts) >= 0) return false;
        myContacts.add(contacts);
        System.out.println("Contact is adding "+ name +" with phone number "+number );
        return true;

    }
    public void printContact(){
        for (int i = 0; i <myContacts.size() ; i++) {
            System.out.println(myContacts.get(i).getName());
        }
    }
    public void updateContact(String oldName, String newName, String newNo){


    }

    public int findContacts(Contacts contacts) {
        return myContacts.indexOf(contacts);
    }
//    public boolean exist(String name){
//        boolean exist =true;
//        for (int i = 0; i < myContacts.size() ; i++) {
//            if(myContacts.contains(contacts.getName())){
//
//            }
//        }
//    }

}
