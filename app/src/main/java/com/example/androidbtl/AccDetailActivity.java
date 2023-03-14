package com.example.androidbtl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AccDetailActivity extends AppCompatActivity {

    private EditText accName, accMoney;
    private Button addBtn, cancelBtn;
    private static int accId = 1;
    private static String accID = "10";

    /*public int autoSetID(int id){
        boolean check = false;
        do{
            ArrayList<Account> ar = db.select(id);
            if(ar.size() == 0){
                check = true;
            }
            else{
                id += 1;
            }
        } while(check == false);
        return id;
    }*/
    /*public int random(int id){
        boolean check = false;
        do{
            ArrayList<Account> ar = MainActivity.AccountList;
            if(ar.size() == 0){
                check = true;
            }
            else{
                id += 1;
            }
        } while(check == false);
        return id;
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc_detail);

        accName = findViewById(R.id.edtAccName);
        accMoney = findViewById(R.id.edtMoney);
        addBtn = findViewById(R.id.addBtn);
        cancelBtn = findViewById(R.id.cancelBtn);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            int id = bundle.getInt("Id");
            String name = bundle.getString("AccountName");
            Float money = Float.valueOf(bundle.getString("AccountMoney"));
            accName.setText(String.valueOf(name));
            accMoney.setText(String.valueOf(money));
            System.out.println("money hey hey= " + money);
            addBtn.setText("Edit");
        }
        else{
            /*int idd = random(accId);
            *//*editID.setText(String.valueOf(pId));
            pId++;*//*
            //editID.setText(String.valueOf(random(pId)));
            accID = String.valueOf(random(accId));*/
        }

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                int id = Integer.parseInt(accID);
                String name = accName.getText().toString();
                Float money = Float.valueOf(accMoney.getText().toString());
                bundle.putInt("Id", id);
                bundle.putString("AccountName", name);
                bundle.putFloat("AccountMoney", money);
                intent.putExtras(bundle);
                setResult(150, intent);
                System.out.println("money money = " + money);
                finish();
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}