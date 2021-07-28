package sg.rp.edu.c346.id20040896.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Contact> al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.listView);
        al = new ArrayList<>();
        al.add(new Contact("Mary",65,1234567, 'F'));
        al.add(new Contact("Ken",65,7654321, 'M'));
        ca = new CustomAdapter(this,R.layout.row, al);
        lvContact.setAdapter(ca);
    }
}