package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    String data1[],data2[];
    int images2[];
    Context context;

    public Myadapter(Context ct, String s1[],String s2[],int images[],){

        context=ct;
        data1=s1;
        data2=s2;
        images2=images;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);;
        holder.myimage.setImageResource(images2[position]);

    }



    @Override
    public int getItemCount() {
        return images2.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mytext1,mytext2;
        ImageView myimage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mytext1=itemView.findViewById(R.id.company_txt);
            mytext2=itemView.findViewById(R.id.description_txt);
            myimage=itemView.findViewById(R.id.myImageview);
        }
    }

}