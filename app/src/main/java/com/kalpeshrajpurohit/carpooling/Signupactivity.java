package com.kalpeshrajpurohit.carpooling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signupactivity extends AppCompatActivity {

    //variables for signup
    TextInputLayout reguname,regemail,regphone,regpassword;
    Button regBtn,regTologinBtn;
    FirebaseDatabase rootnode;
    DatabaseReference referencenode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);

        reguname=findViewById(R.id.name);
        regemail=findViewById(R.id.email);
        regphone=findViewById(R.id.Phone);
        regpassword=findViewById(R.id.password);
        regBtn=findViewById(R.id.go);
        regTologinBtn=findViewById(R.id.loginpage);

        regBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                rootnode=FirebaseDatabase.getInstance();
                referencenode=rootnode.getReference("Users");
                String name=reguname.getEditText().getText().toString();
                String email=regemail.getEditText().getText().toString();
                String phone=regphone.getEditText().getText().toString();
                String password=regpassword.getEditText().getText().toString();


                UserHelper helperclass = new UserHelper(name,email,phone,password);

                referencenode.child(phone).setValue(helperclass);
            }
        });


    }
}