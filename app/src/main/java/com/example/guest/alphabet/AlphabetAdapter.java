package com.example.guest.alphabet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Guest on 3/13/18.
 */

public class AlphabetAdapter extends BaseAdapter {
    private Context context;
    private String[] letters;

    public AlphabetAdapter (Context context, String[] letters){
        this.context = context;
        this.letters = letters;
    }

    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public Object getItem(int i) {
        String letter = letters[i];
        return letter;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (view == null) {
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
            String letter = this.letters[i];

            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);
            letterView.setText(this.getItem(i).toString());
        } else {
            gridView = (View) view;
        }
        return gridView;
    }

}
