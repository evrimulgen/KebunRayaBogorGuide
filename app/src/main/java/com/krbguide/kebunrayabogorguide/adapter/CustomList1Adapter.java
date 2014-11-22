package com.krbguide.kebunrayabogorguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.krbguide.kebunrayabogorguide.R;
import com.krbguide.kebunrayabogorguide.list.CustomList1;

import java.util.List;

public class CustomList1Adapter extends BaseAdapter {

    private Context mContext;
    private List<CustomList1> mList;

    public CustomList1Adapter(Context context, List<CustomList1> list) {
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
        CustomList1 entry = mList.get(position);

        // inflating list view layout if null
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.row_customlist1, null);
        }
        // set icon
        ImageView mIcon = (ImageView) convertView.findViewById(R.id.mIcon);
        mIcon.setImageBitmap(entry.getIcon());

        // set label
        TextView mLabel = (TextView) convertView.findViewById(R.id.mLabel);
        mLabel.setText(entry.getLabel());

        return convertView;

    }

}
