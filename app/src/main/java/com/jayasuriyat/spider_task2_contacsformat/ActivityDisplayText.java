package com.jayasuriyat.spider_task2_contacsformat;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class ActivityDisplayText extends ActionBarActivity
{
    public Typeface tf=null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text);


        Bundle b=getIntent().getExtras();
        if (b!=null)
        {
            String r = b.getString("result");
            TextView t = (TextView) findViewById(R.id.textView);
            t.setText(r);
            String f = b.getString("font");
            String c = b.getString("col");
            int s = b.getInt("size");
            Boolean bold = b.getBoolean("bold");
            Boolean italics = b.getBoolean("italics");


            if (c.equals("Red")) {
                t.setTextColor(Color.RED);
            }

            if (c.equals("Blue")) {
                t.setTextColor(Color.BLUE);
            }

            if (c.equals("Black")) {
                t.setTextColor(Color.BLACK);
            }

            if (c.equals("Yellow")) {
                t.setTextColor(Color.YELLOW);
            }

            if (c.equals("Green") ) {
                t.setTextColor(Color.GREEN);
            }


            t.setTextSize(TypedValue.COMPLEX_UNIT_SP,s);


            if (f.equals("Times New Roman") ) {
                tf=Typeface.createFromAsset(getAssets(),"times.ttf");
            }

            if (f.equals("Arial") ) {
                tf = Typeface.createFromAsset(getAssets(),"arial_0.ttf");
            }

            if (f.equals("Comic Sans") ) {
                tf = Typeface.createFromAsset(getAssets(),"comic_0.ttf");
            }
            if (f.equals("Monotype Corsiva") ) {
                tf = Typeface.createFromAsset(getAssets(),"MTCORSVA.TTF");
            }


            t.setTypeface(tf);


            if (bold) {
                t.setTypeface(null, Typeface.BOLD);
            }

            if (italics) {
                t.setTypeface(null, Typeface.ITALIC);
            }

            if (bold&&italics) {
                t.setTypeface(null, Typeface.BOLD_ITALIC);
            }

        }



    }

    public void ToMain(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void Exit(View v)
    {
        finish();
        System.exit(0);
    }



}
