package com.example.androidbtl;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class accountAdapter extends BaseAdapter {

    private ArrayList<Account> data;
    private Activity context;
    private LayoutInflater inflater;

    public accountAdapter(ArrayList<Account> data, Activity act) {
        this.data = data;
        this.context = act;
        this.inflater = (LayoutInflater)act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return data.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if(v == null){
            v = inflater.inflate(R.layout.account_item, null);
        }
        TextView tvAccName = v.findViewById(R.id.txtAccName);
        tvAccName.setText(data.get(i).getAccount_name());
        TextView tvAccMoney = v.findViewById(R.id.txtAccMoney);
        tvAccMoney.setText(String.valueOf(data.get(i).getMoney()));
        return v;
    }
}
