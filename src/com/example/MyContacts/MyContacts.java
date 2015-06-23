package com.example.MyContacts;

import android.app.Application;
import com.example.MyContacts.data.Contact;

import java.util.ArrayList;

/**
 * Created by fcecursos on 23/06/2015.
 */
public class MyContacts extends Application {

    public ArrayList<Contact> myContacts;

    public MyContacts(){
        myContacts = new ArrayList<Contact>();
    }

    public Contact searchContactByName(String name){
        Contact myContact = null;
        for(Contact contact : myContacts){
            if(contact.getName().equals(name)){
                myContact = contact;
                break;
            }
        }
        return myContact;
    }
}
