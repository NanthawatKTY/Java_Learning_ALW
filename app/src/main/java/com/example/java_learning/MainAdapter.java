//*** Create variables and Context to send data to show on display
//****
package com.example.java_learning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {
    private Context context; //Data Pipe a to b
    private int[] intPics;
    private String[] stringsName, stringsDetail;

    public MainAdapter(Context context, int[] intPics, String[] stringsName, String[] stringsDetail) {
        this.context = context;
        this.intPics = intPics;
        this.stringsName = stringsName;
        this.stringsDetail = stringsDetail;
    }

    @Override
    public int getCount() {
        return intPics.length; //Count picture that got
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);  //Open simulator layout
        View view1 = layoutInflater.inflate(R.layout.listview_layout, parent, false);
        ImageView imageCharacter = view1.findViewById(R.id.imageView);
        TextView textHeader = view1.findViewById(R.id.textName);
        TextView textDetail = view1.findViewById(R.id.textDetails);

        imageCharacter.setImageResource(intPics[position]);
        textHeader.setText(stringsName[position]);
        textDetail.setText(stringsDetail[position]);

        return view1;
    }
}
