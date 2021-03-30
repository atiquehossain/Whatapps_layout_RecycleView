package com.example.whatapps_layout_recycleview;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<ModelClass> userList;


    public Adapter(List<ModelClass> userList)
    {
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource =userList.get(position).getImageview();
        String name=userList.get(position).getTextviewOne();
        String msg =userList.get(position).getTextthree();
        String time =userList.get(position).getTextviewtwo();
        String line=userList.get(position).getDevider();
        holder.setData(resource,name,msg,time,line);


    }

    @Override
    public int getItemCount() {

        return userList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private  TextView textViewTwo;
        private TextView textviewthree;
        private  TextView devider;

        public ViewHolder(@NonNull View ItemView){
            super(ItemView);


            imageView= itemView.findViewById(R.id.imageview);
            textView=itemView.findViewById(R.id.textview);
            textViewTwo=itemView.findViewById(R.id.textview2);
            textviewthree = itemView.findViewById(R.id.textview3);
            devider=itemView.findViewById(R.id.divider);
    }

        public void setData(int resource, String name, String msg, String time, String line) {


            imageView.setImageResource(resource);
            textView.setText(name);
            textViewTwo.setText(msg);
            textviewthree.setText(time);
            devider.setText(line);


        }
    }
}
