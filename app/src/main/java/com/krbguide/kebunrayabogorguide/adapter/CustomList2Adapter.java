package com.krbguide.kebunrayabogorguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.krbguide.kebunrayabogorguide.R;
import com.krbguide.kebunrayabogorguide.list.CustomList2;

import java.util.List;

public class CustomList2Adapter extends BaseAdapter {

    private Context mContext;
    private List<CustomList2> mList;

    public CustomList2Adapter(Context context, List<CustomList2> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // get selected entry
        CustomList2 entry = mList.get(position);

        // Inflating ListView Layout if null
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.row_customlist2, null);
        }

        // Set Label
        TextView mLabel = (TextView) convertView.findViewById(R.id.mLabel);
        mLabel.setText(entry.getLabel());

        return convertView;

    }

}
