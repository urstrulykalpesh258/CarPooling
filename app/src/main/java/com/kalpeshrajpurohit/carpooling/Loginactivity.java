package com.kalpeshrajpurohit.carpooling;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class Loginactivity extends AppCompatActivity {

    Button callsignup,login_btn;
    ImageView logoimage;
    TextView logo,slogan;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loginactivity);

        //hoos
        callsignup= findViewById(R.id.signup);
        logoimage =findViewById(R.id.logoimage);
        logo =findViewById(R.id.logo);
        slogan =findViewById(R.id.slogan_name);
        username =findViewById(R.id.username);
        password =findViewById(R.id.password);
        login_btn =findViewById(R.id.go);






        callsignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Loginactivity.this,Signupactivity.class);
                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(logoimage,"logoimage");
                pairs[1] = new Pair<View,String>(logo,"logo");
                pairs[2] = new Pair<View,String>(slogan,"slogan_name");
                pairs[3] = new Pair<View,String>(username,"username");
                pairs[4] = new Pair<View,String>(password,"password");
                pairs[5] = new Pair<View,String>(login_btn,"go");
                pairs[6] = new Pair<View,String>(callsignup,"signup");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options =ActivityOptions.makeSceneTransitionAnimation(Loginactivity.this,pairs);
                    startActivity(intent,options.toBundle());

                }


            }
        });


    }
}