package com.example.mydem;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText edtUsername, edtPassword;
    private TextView txtWelcomeMessage;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainContainerLayout = new LinearLayout(this);
        mainContainerLayout.setOrientation(LinearLayout.VERTICAL);
        mainContainerLayout.setPadding(20, 20, 202, 20);
        mainContainerLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);


        ViewGroup.LayoutParams layoutParams =
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);


        mainContainerLayout.setLayoutParams(layoutParams);


        TextView txtWelcomeMessage = new TextView(this);
        txtWelcomeMessage.setText("Welcome Android@BitCode");
        txtWelcomeMessage.setTextSize(30);
        txtWelcomeMessage.setTextColor(Color.BLACK);

        ViewGroup.LayoutParams paramForView =
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);


        txtWelcomeMessage.setLayoutParams(paramForView);


        mainContainerLayout.addView(txtWelcomeMessage);
        //setContentView(txtWelcomeMessage);


        edtUsername = new EditText(this);
        edtUsername.setHint("Enter username");
        edtUsername.setLayoutParams(paramForView);
        // setContentView(edtUsername);


        mainContainerLayout.addView(edtUsername);


        EditText edtPassword = new EditText(this);
        edtPassword.setLayoutParams(paramForView);
        mainContainerLayout.addView(edtPassword);

        btnSignIn = new Button(this);
        btnSignIn.setText("Sign In");
        btnSignIn.setLayoutParams(paramForView);
        mainContainerLayout.addView(btnSignIn);


        setContentView(mainContainerLayout);


        btnSignIn.setOnClickListener(new btnSignClickListener());
    }


    class btnSignClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if (edtUsername.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode@123")) {
                txtWelcomeMessage.setText("Welcome" + edtUsername.getText().toString());

            } else {
                txtWelcomeMessage.setText("Login Failed.....");
            }

        }
    }
}