package com.dqj.myapplication.adpter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.dqj.myapplication.R;
import com.dqj.myapplication.bean.news_info;

import java.util.List;

/**
 * Created by 木土其金建 on 2018/5/11.
 */

public class NewItmesRecycler extends RecyclerView.Adapter<NewItmesRecycler.ViewHoler>{
private List<news_info> mnew_info;
    public NewItmesRecycler(List<news_info> list)
    {
        this.mnew_info=list;
    }

    public ViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
      View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_content,parent,false);
        ViewHoler holer=new ViewHoler(view);
        return  holer;

    }

    @Override
    public void onBindViewHolder(ViewHoler holder, int position) {
        news_info Mnews_info =mnew_info.get(position);
        holder.news_time.setText(Mnews_info.getTime());
        holder.news_from.setText(Mnews_info.getFrom());
holder.news_titile.setText(Mnews_info.getTitle());

    }

        public int getItemCount() {
        return mnew_info.size();
    }

    static class ViewHoler extends RecyclerView.ViewHolder{
        TextView news_titile,news_from,news_time;
        CardView cardView;
        public ViewHoler(View view) {
            super(view);
            news_from=(TextView) view.findViewById(R.id.news_from);
            news_titile=(TextView) view.findViewById(R.id.news_title);
            news_time=(TextView) view.findViewById(R.id.news_time);
        }
    }
}
