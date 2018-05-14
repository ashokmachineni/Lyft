package com.example.ashokmachineni.lyft;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclAdapter extends RecyclerView.Adapter<RecyclAdapter.MyViewHolder> {
    private Context mContext;
    private List<Action> mData;

    public RecyclAdapter(Context mContext, List<Action> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.row_action,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tnstudio.setText(mData.get(position).getStudio());
        holder.tnview.setText(mData.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tnview,tnstudio;

        public MyViewHolder(View itemView) {
            super(itemView);
            tnview = itemView.findViewById(R.id.tname);
            tnstudio = itemView.findViewById(R.id.tstudio);
        }
    }
}
