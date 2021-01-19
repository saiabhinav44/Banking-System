package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class TransactionDisplay extends AppCompatActivity {
    ListView li2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_display);
        li2=(ListView)findViewById(R.id.dis_tran);
        DataBaseHelper dab=new DataBaseHelper(this);
        List<Transaction> arr=dab.selectAllTransactions();
        CustomAdapterTran ctr=new CustomAdapterTran(this,arr);
        li2.setAdapter(ctr);
    }
}