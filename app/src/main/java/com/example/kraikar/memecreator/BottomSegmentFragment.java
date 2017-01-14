package com.example.kraikar.memecreator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kraikar on 12/18/2016.
 */

public class BottomSegmentFragment extends Fragment {

    private TextView textViewTop;
    private TextView textViewBottom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment, container, false);

        textViewTop = (TextView) view.findViewById(R.id.textViewTop);
        textViewBottom = (TextView) view.findViewById(R.id.textViewBottom);

        return view;
    }

    public void setMemeText(String top, String bottom) {
        textViewTop.setText(top);
        textViewBottom.setText(bottom);
    }
}
