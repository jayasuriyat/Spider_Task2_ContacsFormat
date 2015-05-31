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
    Typeface arial = Typeface.createFromAsset(getAssets(),"arial_0.ttf");
    Typeface comic = Typeface.createFromAsset(getAssets(),"comic_0.ttf");
    Typeface mono = Typeface.createFromAsset(getAssets(),"MTCORSVA.ttf");
    Typeface times = Typeface.createFromAsset(getAssets(),"times.ttf");

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
            String s = b.getString("size");
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


            if (s.equals("10") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10);
            }

            if (s.equals("12") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
            }

            if (s.equals("14") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
            }

            if (s.equals("18") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            }

            if (s.equals("22") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
            }

            if (s.equals("26") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);
            }

            if (s.equals("30") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
            }

            if (s.equals("36") ) {
                t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 36);
            }


            if (f.equals("Comic Sans") ) {
                t.setTypeface(comic);
            }

            if (f.equals("Monotype Corsiva") ) {
                t.setTypeface(mono);
            }

            if (f.equals("Arial") ) {
                t.setTypeface(arial);
            }

            if (f.equals("Times New Roman") ) {
                t.setTypeface(times);
            }


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
