package com.example.donarhub1;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Page extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page);
    }
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.profile:
                Toast.makeText(getApplicationContext(),"you selected Profile", Toast.LENGTH_LONG).show();
                Log.d("option","you selected Profile");
                Intent intent=new Intent(Page.this,MainActivity2.class);
                startActivity(intent);
                return true;
            case R.id.donor_form:
                Toast.makeText(getApplicationContext(),"you selected donor_form", Toast.LENGTH_LONG).show();
                Log.d("option","you selected donor_form");
                intent = new Intent(Page.this, MainActivity5.class);
                startActivity(intent);
                return true;
            case R.id.facts:
                Toast.makeText(getApplicationContext(),"you selected facts", Toast.LENGTH_LONG).show();
                Log.d("option","you selected facts");
                intent = new Intent(Page.this, facts.class);
                startActivity(intent);
                return true;
            case R.id.receipt:
                Toast.makeText(getApplicationContext(),"you selected receipt", Toast.LENGTH_LONG).show();
                Log.d("option","you selected receipt");
                intent = new Intent(Page.this, MainActivity5.class);
                startActivity(intent);
                return true;
            case R.id.feedback:
                Toast.makeText(getApplicationContext(),"you selected feedback", Toast.LENGTH_LONG).show();
                Log.d("option","you selected feedback");
                intent = new Intent(Page.this, MainActivity6.class);
                startActivity(intent);
                return true;
            case R.id.about_us:
                Toast.makeText(getApplicationContext(),"you selected Aboutus", Toast.LENGTH_LONG).show();
                Log.d("option","you selected Aboutus");
                intent = new Intent(Page.this, About.class);
                startActivity(intent);
                return true;
            case R.id.contact:
                Toast.makeText(getApplicationContext(),"you selected contact", Toast.LENGTH_LONG).show();
                Log.d("option","you selected contact");
                intent = new Intent(Page.this, About.class);
                startActivity(intent);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
