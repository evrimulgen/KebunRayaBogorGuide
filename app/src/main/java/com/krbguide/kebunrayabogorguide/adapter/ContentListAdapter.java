package com.krbguide.kebunrayabogorguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.krbguide.kebunrayabogorguide.R;
import com.krbguide.kebunrayabogorguide.list.ContentList;

import java.util.List;

public class ContentListAdapter extends BaseAdapter {

    private Context mContext;
    private List<ContentList> mListInfo;

    public ContentListAdapter(Context context, List<ContentList> mList) {
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
        ContentList entry = mListInfo.get(position);

        // inflating list view layout if null
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.row_customcontentlist1, null);
        }
        // set icon
        ImageView mIcon = (ImageView) convertView.findViewById(R.id.mContentIcon);
        mIcon.setImageBitmap(entry.getIcon());

        // set label
        TextView mLabel = (TextView) convertView.findViewById(R.id.mContentLabel);
        mLabel.setText(entry.getLabel());
        mLabel.setSelected(true);

        // set label
        TextView mSublabel = (TextView) convertView.findViewById(R.id.mContentSublabel);
        mSublabel.setText(entry.getSublabel());
        mSublabel.setSelected(true);

        return convertView;
    }

}
