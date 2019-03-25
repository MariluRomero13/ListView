package com.example.listview.adaptadores;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listview.R;
import com.example.listview.modelos.Persona;

import java.util.ArrayList;

public class adaptadorPersona extends BaseAdapter {

    ArrayList<Persona> people;
    Context c;

    public adaptadorPersona(ArrayList<Persona> people, Context c) {
        this.people = people;
        this.c = c;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return people.get(position);
    }

    @Override
    public long getItemId(int position) {
        return people.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listaPersonalizada = convertView;

        if(listaPersonalizada == null){
            listaPersonalizada = LayoutInflater.from(c).inflate(R.layout.items_personas, parent, false);
        }

        Persona personas = (Persona) getItem(position);

        TextView nombre =  listaPersonalizada.findViewById(R.id.tv_name);
        nombre.setText(personas.getNombre());

        TextView apellido =  listaPersonalizada.findViewById(R.id.tv_apellido);
        apellido.setText(personas.getApellido());

        TextView edad =  listaPersonalizada.findViewById(R.id.tv_edad);
        edad.setText(String.valueOf(personas.getEdad()));

        TextView id =  listaPersonalizada.findViewById(R.id.tv_id);
        id.setText(String.valueOf(personas.getId()));
        return listaPersonalizada;

    }
}
