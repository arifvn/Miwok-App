package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.getColor;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        this.mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWordPosition = getItem(position);

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false );
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWordPosition.getmDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWordPosition.getmMiwokTranslation());

        ImageView imageViewIcon = (ImageView) listItemView.findViewById(R.id.imageIcon);
        if (currentWordPosition.hasImage()) {
            imageViewIcon.setImageResource(currentWordPosition.getmImageResourceId());
            imageViewIcon.setVisibility(View.VISIBLE);
        } else {
            imageViewIcon.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int colorBackground = getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(colorBackground);

        return listItemView;
    }
}
