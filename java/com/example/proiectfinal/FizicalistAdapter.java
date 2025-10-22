package com.example.proiectfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
public class FizicalistAdapter  extends BaseAdapter{
    private ArrayList<com.example.proiectfinal.Fizicalist> listData;
    private LayoutInflater layoutInflater;
    public FizicalistAdapter(Context aContext,
                             ArrayList<com.example.proiectfinal.Fizicalist> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }
    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View v, ViewGroup vg) {
        ViewHolder holder;
        if (v == null) {
            v = layoutInflater.inflate(R.layout.fizicalist_rows, null);
            holder = new ViewHolder();
            holder.uName = (TextView) v.findViewById(R.id.name);
            holder.uDefinitie = (TextView)
                    v.findViewById(R.id.definitie);
            holder.uFormula = (TextView) v.findViewById(R.id.formula);
            holder.uUnitatedemasurare = (TextView) v.findViewById(R.id.unitatedemasurare);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.uName.setText(listData.get(position).getName());
        holder.uDefinitie.setText(listData.get(position).getdefinitie());
        holder.uFormula.setText(listData.get(position).getformula());
        holder.uUnitatedemasurare.setText(listData.get(position).getunitatedemasurare());
        return v;
    }
    static class ViewHolder {
        TextView uFormula;
        TextView uName;
        TextView uDefinitie;
        TextView uUnitatedemasurare;
    }
}
