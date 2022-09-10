package com.example.actionbarinternacionalizacao;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.action_menu, menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == R.id.act_add){
                Toast.makeText(this,  R.string.addContact, Toast.LENGTH_SHORT).show();
                return true;
            }
            else if (item.getItemId() == R.id.act_edit){
                Toast.makeText(this, R.string.editContact, Toast.LENGTH_SHORT).show();
                return true;
            }
            else if (item.getItemId() == R.id.act_delete){
                Toast.makeText(this, R.string.deleteContact, Toast.LENGTH_SHORT).show();
                return true;
            } else if (item.getItemId() == R.id.act_help){
                Toast.makeText(this, R.string.act_help, Toast.LENGTH_SHORT).show();
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }