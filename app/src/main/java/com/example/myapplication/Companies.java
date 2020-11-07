package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Companies extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]={R.drawable.google,R.drawable.williams,R.drawable.dove,R.drawable.microsoft,R.drawable.toyota};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies);

        recyclerView=findViewById(R.id.recyclerView);
        s1=getResources().getStringArray(R.array.companies);
        s2=getResources().getStringArray(R.array.description);

        Myadapter myadapter=new Myadapter(this,s1,s2,images);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}