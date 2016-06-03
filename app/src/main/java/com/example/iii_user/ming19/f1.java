package com.example.iii_user.ming19;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class f1 extends Fragment {
    private View thisView; //Inflate the layout for this fragment
    private TextView tv;
    private Button f1btn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, //控點在這
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thisView = inflater.inflate(R.layout.fragment_f1, container, false);

        tv = (TextView)thisView.findViewById(R.id.f1_tv);
        f1btn = (Button)thisView.findViewById(R.id.f1_btn);

        f1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(""+(int)(Math.random()*49+1));
            }
        });
        tv.setText("Hello f1");
        return thisView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}