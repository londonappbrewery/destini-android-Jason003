package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
    private Button buttonTop = (Button) findViewById(R.id.buttonTop);
    private Button buttonBottom = (Button) findViewById(R.id.buttonBottom);
    private TextView storyTextView=(TextView) findViewById(R.id.storyTextView);
    private int myStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            buttonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(myStoryIndex==1) {
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setText(R.string.T3_Ans2);
                        storyTextView.setText(R.string.T3_Story);
                        myStoryIndex = 3;
                    }
                    else if(myStoryIndex==3){
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setVisibility(View.GONE);
                        storyTextView.setText(R.string.T6_End);
                    }
                }
            });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myStoryIndex==1) {
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    storyTextView.setText(R.string.T2_Story);
                    myStoryIndex = 2;
                }
                else if(myStoryIndex==2){
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T4_End);
                }
                else if(myStoryIndex==3){
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T5_End);
                }
            }
        });


    }
}
