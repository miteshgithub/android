package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data1[], data2[] ;
    int img[];
    Context ctx ;

    public MyOwnAdapter(Context ct, String s1[] ,String s2[], int i1[])
    {
     ctx = ct ;
     data1 = s1 ;
     data2 = s2 ;
     img = i1 ;
    }



    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        LayoutInflater myInflator = LayoutInflater.from(ctx);

        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnView = myInflator.inflate(R.layout.my_row, viewGroup,false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder myOwnHolder, int position) {
        myOwnHolder.t1.setText(data1[position]);
        myOwnHolder.t2.setText(data2[position]);
        myOwnHolder.myImage.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends  RecyclerView.ViewHolder {
        TextView t1 , t2 ;
        ImageView myImage ;
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            t1  = (TextView)itemView.findViewById(R.id.text1);
            t2  = (TextView)itemView.findViewById(R.id.text2);
            myImage = (ImageView)itemView.findViewById(R.id.myImage);
        }
    }
}
