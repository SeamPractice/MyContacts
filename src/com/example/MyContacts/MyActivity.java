package com.example.MyContacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void renderAddContact(View view){
        Intent addContactActivity = new Intent(this, AddContactActivity.class);
        startActivity(addContactActivity);
    }

    public void renderSelectContact(View view){
        Intent showContactActivity = new Intent(this, ShowContactActivity.class);
        startActivity(showContactActivity);
    }
}
