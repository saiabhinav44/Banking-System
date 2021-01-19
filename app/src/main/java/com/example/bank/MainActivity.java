package com.example.bank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        b1=(Button)findViewById(R.id.viewCustmers);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,AllCustomers.class);
                startActivity(in);
            }
        });
//        b2=(Button)findViewById(R.id.tm);
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent in1=new Intent(MainActivity.this,TransferActivity.class);
//                startActivity(in1);
//            }
//        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch(item.getItemId()){
//            case R.id.itemSE:
//                printToast("Search");
//                return true;
//            case R.id.itemSet:
//                printToast("Setting");
//                return true;
//            case R.id.Sa:
//                printToast("Save");
//                return true;
//            default:
//                return false;
//        }
//    }
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    switch(item.getItemId()) {
        case R.id.item1:
            //Add Customer table activity intent here
            Intent in=new Intent(MainActivity.this,AllCustomers.class);
            startActivity(in);
            break;
        case R.id.item2:
            //Add Transfer table activity intent here
            Intent in2=new Intent(MainActivity.this,TransactionDisplay.class);
            startActivity(in2);
            break;
        case R.id.item3:
           // go_to_transfer_activity();
            Intent in1=new Intent(MainActivity.this,TransferActivity.class);
            startActivity(in1);
            break;
    }
    return super.onOptionsItemSelected(item);
}


}