package com.foc.pmdm.u5.agendapersonal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db =new DatabaseHandler(this);

        db.addContact(new Contacto(1,"Pp","6565656"));
        db.addContact(new Contacto(2,"Pp1","6565121656"));
        db.addContact(new Contacto(3,"Pp2","6565126"));
        db.addContact(new Contacto(4,"Pp3","65656"));


        List<Contacto> contacts = db.getAllContacts();

        String log="";
        for (Contacto cn : contacts) {
            log += "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            log+="\n"; // Nueva línea
        }

        TextView tvLog=(TextView)findViewById(R.id.tvLog);
        tvLog.setText(log);

        //TODO: mostrar los datos en un listview
    }
}
