package com.realeyes.primetime.mbp_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by JohnGainfort on 3/11/15.
 */
public class PlaceAdapter extends ArrayAdapter<Media> {

    Context mContext;
    int mLayoutResourceId;
    Media mData[] = null;

    public PlaceAdapter(Context context, int resource, Media[] data) {
        super(context, resource, data);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mData = data;
    }

    @Override
    public Media getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        PlaceHolder holder = null;

        if (row == null) {
            // Create a new view
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResourceId, parent, false);

            holder = new PlaceHolder();

            holder.titleView = (TextView) row.findViewById(R.id.mediaTitleText);
            holder.authorView = (TextView) row.findViewById(R.id.mediaAuthorText);
            holder.thumbnailView = (ImageView) row.findViewById(R.id.mediaThumbnailView);

            row.setTag(holder);
        } else {
            // Otherwise use an existing one
            holder = (PlaceHolder) row.getTag();
        }

        // Get the data from the data array
        Media media = mData[position];

        holder.thumbnailView.setOnClickListener(PopupListener);
        Integer rowPosition = position;
        holder.thumbnailView.setTag(rowPosition);

        holder.titleView.setText(media.mTitle);
        holder.authorView.setText(media.mAuthor);

        int resId = mContext.getResources().getIdentifier(media.mImageName, "drawable", mContext.getPackageName());
        holder.thumbnailView.setImageResource(resId);

        // Return row view
        return row;
    }

    View.OnClickListener PopupListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Integer viewPosition = (Integer) view.getTag();
            Media m = mData[viewPosition];
            Toast.makeText(getContext(), m.mDescription, Toast.LENGTH_SHORT).show();
        }
    };

    private static class PlaceHolder {
        TextView titleView;
        TextView authorView;
        ImageView thumbnailView;
    }
}
