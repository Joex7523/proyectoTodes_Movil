package com.example.projectotodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.categorias_incidencias,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int num=item.getItemId();
        if (num==R.id.item1){
            Toast.makeText(this,"ESTAS EN LA OPCION 1", Toast.LENGTH_LONG).show();
        }else if(num==R.id.item2){
            Toast.makeText(this,"ESTAS EN LA OPCION 2", Toast.LENGTH_LONG).show();
        }
        else if(num==R.id.item3){
            Toast.makeText(this,"ESTAS EN LA OPCION 3", Toast.LENGTH_LONG).show();
        }


        return super.onOptionsItemSelected(item);
    }

    public void pasar1(View view){


    }
}