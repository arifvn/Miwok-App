/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.numbers)
    TextView numbers;

    @Bind(R.id.family)
    TextView family;

    @Bind(R.id.colors)
    TextView colors;

    @Bind(R.id.phrases)
    TextView phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        // Set a click listener on that View
        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }

    @OnClick(R.id.numbers)
    public void toNumbersActivity() {
        //Create a new intent to open the {@link NumbersActivity}
        Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
        // Start the new activity
        startActivity(numbersIntent);
    }

    @OnClick(R.id.family)
    public void toFamilyActivity() {
        //Create a new intent to open the {@link NumbersActivity}
        Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
        // Start the new activity
        startActivity(numbersIntent);
    }

    @OnClick(R.id.colors)
    public void toColorsActivity() {
        //Create a new intent to open the {@link NumbersActivity}
        Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
        // Start the new activity
        startActivity(numbersIntent);
    }
}
