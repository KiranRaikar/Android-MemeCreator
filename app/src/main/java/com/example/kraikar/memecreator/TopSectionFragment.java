package com.example.kraikar.memecreator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kraikar on 12/18/2016.
 */

public class TopSectionFragment extends Fragment {

    private EditText editTextTop;
    private EditText editTextBottom;

    TopSectionListener activityCommander;

    public interface TopSectionListener {
        public void createMeme(String top, String bottom);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        editTextTop = (EditText) view.findViewById(R.id.editTextTop);
        editTextBottom = (EditText) view.findViewById(R.id.editTextBottom);

        final Button buttonSetMeme = (Button) view.findViewById(R.id.buttonSetMeme);

        buttonSetMeme.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v){
                    buttonClicked(v);
                }
            }
        );
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activityCommander = (TopSectionListener) activity;
    }

    private void buttonClicked(View view) {
        activityCommander.createMeme(editTextTop.getText().toString(), editTextBottom.getText().toString());
    }
}
