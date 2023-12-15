package com.example.marketlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.marketlist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        EditText email=findViewById(R.id.email);
        TextView tx = findViewById(R.id.phone);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+tx.getText().toString()));
                startActivity(intent);
            }
        });
        Button butt= findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"vav11011@yandex.ru"});
                intent.putExtra(Intent.EXTRA_TEXT,"NIIII");
                intent.putExtra(Intent.EXTRA_SUBJECT,"SENDDDDDD");
                startActivity(intent);
            }
        });
    }
}