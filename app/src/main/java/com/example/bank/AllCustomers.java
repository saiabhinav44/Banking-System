package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AllCustomers extends AppCompatActivity {
        ListView customerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_customers);
        customerList=(ListView)findViewById(R.id.list);
        //final ArrayList<Customer> customers= new ArrayList<>();

        DataBaseHelper dab=new DataBaseHelper(this);

        dab.addOne(new Customer("Robert Downey, Jr.","NAT12345566",1000000.34,"Male"));
        dab.addOne(new Customer("Leonardo DiCaprio","NAT12345567",2000000.34,"Male"));
        dab.addOne(new Customer("Brad Pitt","NAT12345565",3050000.34,"Male"));
        dab.addOne(new Customer("Robert De Niro","NAT12345560",9002000.32,"Male"));
        dab.addOne(new Customer("Scarlett Jhansson","NAT12344598",4023400.34,"Female"));
        dab.addOne(new Customer("Jhonny Depp","NAT12345564",4000000.34,"Male"));
        dab.addOne(new Customer("Tom Cruise","NAT12345561",4050000.34,"Male"));
        dab.addOne(new Customer("Alexa","NAT12345599",1056700.34,"Female"));
        dab.addOne(new Customer("Joaquin Phoenix","NAT12345598",1043200.34,"Male"));
        dab.addOne(new Customer("Sitha","NAT12345597",1023400.34,"Female"));
        dab.addOne(new Customer("Dwayne Johnson","NAT12345544",5056700.44,"Male"));
        dab.addOne(new Customer("Chris Hemsworth","NAT12345500",2077700.34,"Male"));
        dab.addOne(new Customer("Liam Neeson","NAT12345529",1026700.34,"Male"));
        dab.addOne(new Customer("Morgan Freeman","NAT22345537",2015900.34,"Male"));
        dab.addOne(new Customer("Hemma Watson","NAT22355538",3316900.34,"Female"));


        List<Customer> customers =dab.selectAll();
        final CustomerAdapter cadpt=new CustomerAdapter(this,customers);
        customerList.setAdapter(cadpt);
        customerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Customer cu=cadpt.getItem(i);
                Intent in=new Intent(AllCustomers.this,TransferActivity.class);
                in.putExtra("from",cu.getmAccountNumber());
                startActivity(in);
            }
        });
    }

}