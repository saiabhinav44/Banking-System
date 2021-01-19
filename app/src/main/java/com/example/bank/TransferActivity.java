package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class TransferActivity extends AppCompatActivity {
    EditText from1,to1,amount;
    Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        from1=(EditText)findViewById(R.id.from);
        to1=(EditText)findViewById(R.id.to);
        amount=(EditText)findViewById(R.id.money);
        pay=(Button)findViewById(R.id.pay);
        Bundle b1=getIntent().getExtras();
        if (b1 != null) {
            String fr=b1.getString("from");
            from1.setText(fr);
        }
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(from1.getText().toString().equals("") || to1.getText().toString().equals("") || amount.getText().equals("") ){
                    Toast.makeText(TransferActivity.this, "Enter Valid values", Toast.LENGTH_SHORT).show();
                }
                else {
                    DataBaseHelper t1 = new DataBaseHelper(TransferActivity.this);
                    String msg = t1.TransferMoney(from1.getText().toString(), to1.getText().toString(), Double.parseDouble(amount.getText().toString()));
                    ClearText();
                    List<Transaction> arr= t1.selectAllTransactions();
                    for(Transaction t:arr){
                        Log.i("Demo","from = "+t.getmFrom());
                        Log.i("Demo","to = "+t.getmTo());
                        Log.i("Demo","status = "+t.getmStatus());
                        Log.i("Demo","amount = "+t.getmAmount());
                        Log.i("Demo","Date = "+t.getMdate());
                    }
                    Toast.makeText(TransferActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void ClearText(){
        from1.setText("");
        to1.setText("");
        //amount.setText(0);
    }
}