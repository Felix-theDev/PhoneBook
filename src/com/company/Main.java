package com.company;
/** A telephone book for saving and displaying existing contacts
 * @author Felix Ogbonnaya
 * @since 2019-07-11
 */

public class Main {

    public static void main(String[] args) {
    Contacts contacts = new Contacts("name", "number");
    MobilePhones phone = new MobilePhones(contacts);

    phone.addContact("DIEGO", "090");
    phone.addContact("DIEGO", "090");
    phone.printContact();


    }
}
