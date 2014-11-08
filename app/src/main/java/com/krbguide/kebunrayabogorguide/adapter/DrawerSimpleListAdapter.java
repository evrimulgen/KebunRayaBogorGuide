package com.krbguide.kebunrayabogorguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.krbguide.kebunrayabogorguide.R;
import com.krbguide.kebunrayabogorguide.adapter.list.DrawerSimpleList;

import java.util.List;

public class DrawerSimpleListAdapter extends BaseAdapter {

    private Context mContext;
    private List<DrawerSimpleList> mListInfo;

    public DrawerSimpleListAdapter(Context context, List<DrawerSimpleList> mList) {
        mContext = context;
        mListInfo = mList;
    }

    @Override
    public int getCount() {
        return mListInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return mListInfo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get selected entry
        DrawerSimpleList entry = mListInfo.get(position);

        // Inflating ListView Layout if null
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.row_custom_drawerlist_2, null);
        }

        // Set Label
        TextView mLabel = (TextView) convertView.findViewById(R.id.mLabel);
        mLabel.setText(entry.getLabel());

        return convertView;
    }

}
