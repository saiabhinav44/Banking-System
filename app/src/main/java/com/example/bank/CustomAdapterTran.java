package com.example.bank;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapterTran extends ArrayAdapter<Transaction> {
    public CustomAdapterTran(Context context, List<Transaction> objects){
        super(context,0,objects);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Transaction currTran=getItem(position);
        View listitem=convertView;
        if(listitem==null){
            listitem= LayoutInflater.from(getContext()).inflate(R.layout.custom_display_tran,parent,false);
        }
        TextView fro=(TextView)listitem.findViewById(R.id.fromac);
        fro.setText(currTran.getmFrom());
        TextView to2=(TextView)listitem.findViewById(R.id.toac);
        to2.setText(currTran.getmTo());
        TextView dat=(TextView)listitem.findViewById(R.id.data);
        dat.setText(currTran.getMdate());
        TextView amo=(TextView)listitem.findViewById(R.id.amo);
        amo.setText("Amount :"+currTran.getmAmount());
        ImageView im=(ImageView)listitem.findViewById(R.id.imgv);
        RelativeLayout re1=(RelativeLayout)listitem.findViewById(R.id.retr);
        if(currTran.getmStatus().equals("success")){
            im.setImageResource(R.drawable.success);
            re1.setBackgroundColor(Color.parseColor("#80ffaa"));
        }
        else{
            im.setImageResource(R.drawable.fail);
            re1.setBackgroundColor(Color.parseColor("#ff99aa"));
        }
        return listitem;
    }
}
