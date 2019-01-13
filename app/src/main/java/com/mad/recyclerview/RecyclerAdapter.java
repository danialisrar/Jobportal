package com.mad.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{
    private List<RecylerModel> recyclerModels;
    private Context context;

    public RecyclerAdapter(Context context,List<RecylerModel> recyclerModels) {
        this.context=context;
        this.recyclerModels = recyclerModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.row,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        RecylerModel model= recyclerModels.get(i);
        if(model != null)
        {


            myViewHolder.tvcompanyname.setText(model.getName());
            myViewHolder.tvcompanylocation.setText(model.getLoc());
        }
    }

    @Override
    public int getItemCount() {
        return recyclerModels.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView tvcompanyname,tvcompanylocation,tvfirstletter;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            tvcompanyname=itemView.findViewById(R.id.companyname);
            tvcompanylocation=itemView.findViewById(R.id.companylocation);
            tvfirstletter=itemView.findViewById(R.id.firstLetter);
        }

        @Override
        public void onClick(View v) {
            Intent i=new Intent(context,Broadpeakinfo.class);
            context.startActivity(i);

        }
    }
}

