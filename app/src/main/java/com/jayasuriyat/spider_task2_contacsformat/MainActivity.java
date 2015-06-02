package com.jayasuriyat.spider_task2_contacsformat;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity
{
    public String font="Times New Roman",col="Red";
    public int size=10;
    public Boolean b,i;
    public EditText t;



    public String[] fonts = {"Times New Roman", "Arial","Comic Sans","Monotype Corsiva"};
    public String[] colours = {"Red", "Blue", "Black", "Yellow", "Green"};
    public Integer[] sizes= {10,12,14,18,22,26,30,36};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (EditText) findViewById(R.id.editText);
        b=false;
        i=false;



        final Spinner spin_col = (Spinner) findViewById(R.id.spinnercol);
        ArrayAdapter<String> adapter_col = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colours);
        adapter_col.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_col.setAdapter(adapter_col);



        final Spinner spin_size = (Spinner) findViewById(R.id.spinnersize);
        ArrayAdapter<Integer> adapter_size = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, sizes);
        spin_size.setAdapter(adapter_size);


        ArrayAdapter fontAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fonts);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(fontAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        TextView c=(TextView)view;
                        font=c.getText().toString();
                        col= String.valueOf(spin_col.getSelectedItem());
                        size=Integer.parseInt(String.valueOf(spin_size.getSelectedItem()));

                        Intent i=new Intent(MainActivity.this,ActivityDisplayText.class);
                        i.putExtra("font",font);
                        i.putExtra("col",col);
                        i.putExtra("size",size);
                        i.putExtra("bold",b);
                        i.putExtra("italics",i);
                        i.putExtra("result",t.getText().toString());
                        startActivity(i);

                    }
                }
        );



    }
    public void bold(View view)
    {
        boolean checked=((CheckBox) view).isChecked();
        if(checked)
            b=true;
        else
            b=false;
    }


    public void italics(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked)
            i = true;
        else
            i = false;
    }
}

