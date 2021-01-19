package com.example.bank;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomerAdapter extends ArrayAdapter<Customer> {
    public CustomerAdapter(Context context, List<Customer> objects){
        super(context,0,objects);
    }
    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        Customer currentCustomer=getItem(position);
      View listitem=convertView;
      if(listitem==null){
        listitem= LayoutInflater.from(getContext()).inflate(R.layout.custom_adapter,parent,false);
      }
        TextView Lname=(TextView)listitem.findViewById(R.id.name);
        Lname.setText(currentCustomer.getmCustomerName());
        TextView bal=(TextView)listitem.findViewById(R.id.balance);
        bal.setText(""+currentCustomer.getmBalance());
        TextView Acno=(TextView)listitem.findViewById(R.id.acno);
        Acno.setText(currentCustomer.getmAccountNumber());
        ImageView im=(ImageView)listitem.findViewById(R.id.imvi);
        String gem=currentCustomer.getmGender();
        Log.i("Outside ","gem = "+currentCustomer.getmGender());
//        Log.i("Outside1 ","gem = male ");
        RelativeLayout re=(RelativeLayout)listitem.findViewById(R.id.rely);
        if(gem.equals("Male")){
            im.setImageResource(R.drawable.male1);
            re.setBackgroundColor(Color.parseColor("#e6ffe6"));
        }
        else{
            im.setImageResource(R.drawable.female1);
            re.setBackgroundColor(Color.parseColor("#ffe6ff"));
        }
//        Log.i("Outside ","img = "+currentCustomer.getmResourceImg());
//        if(currentCustomer.hasImage()) {
//            im.setImageResource(currentCustomer.getmResourceImg());
//            Log.i("Inside ","img = "+currentCustomer.getmResourceImg());
//        }
//        else{
//            im.setVisibility(View.GONE);
//          //  im.setImageResource(R.drawable.male);
//        }
        return listitem;
    }
}
