package com.example.richo_han.tutorialapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Richo_Han on 2016/11/18.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {
    public final static String EXTRA_CONTACT = "com.example.richo_han.tutorialapplication.EXTRA_CONTACT";
    public Context context;
    public ArrayList<Contact> contacts;

    public ContactAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
        this.context = context;
        this.contacts = contacts;
    }

    /***
     * For each contact in the data source, generate a view that contains it basic information.
     * @param position
     * @param convertView
     * @param parent
     * @return the view generated with onClick event listener.
     */
    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        final Contact contact = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_contact, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.contact_name);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.contact_phone);
        tvName.setText(contact.name);
        tvPhone.setText(contact.phone);

        return convertView;
    }
}
