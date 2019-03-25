package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.listview.adaptadores.adaptadorPersona;
import com.example.listview.modelos.Persona;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;
    adaptadorPersona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lista);
        persona = new adaptadorPersona(llenar_lista(),this);
        lvItems.setAdapter(persona);

        /*String alumnos[] =  {"Pedro", "Jose", "Paula", "María","Carmen"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alumnos);
        lvItems.setAdapter(array);*/
    }

    private ArrayList<Persona> llenar_lista()
    {
        ArrayList<Persona> people = new ArrayList<>();
        people.add(new Persona(1,"Michel","Pedroza", 12));
        people.add(new Persona(2,"Pedro","Fernandez", 12));
        people.add(new Persona(3,"Carlos","Márquez", 12));
        people.add(new Persona(4,"Omar","Martínez", 12));
        people.add(new Persona(5,"Julissa","Macias", 12));
        people.add(new Persona(6,"Fernanda","Gamón", 12));
        return  people;
    }

}
