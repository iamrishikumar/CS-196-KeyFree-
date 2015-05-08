package com.example.rishikumar.apptest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class Another extends Activity {

    Boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
    }

    public void change_image(View v)
    {
        ImageView iv=(ImageView)findViewById(R.id.imageButton);
        Switch ding = (Switch) findViewById(R.id.switch1);
        //use flag to change image
        if(flag==false)
        {
            //locked
            iv.setImageResource(R.drawable.door10);
            ding.setChecked(true);
            v.requestLayout();
            flag=true;
        }
        else
        {
            //unlocked
            iv.setImageResource(R.drawable.door12);
            ding.setChecked(false);
            v.requestLayout();
            flag=false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_another, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
