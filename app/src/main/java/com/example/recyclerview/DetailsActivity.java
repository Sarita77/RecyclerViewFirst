package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView circImg;
    TextView tvFullname, tvPhoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg = findViewById(R.id.circImg);
        tvFullname =  findViewById(R.id.tvFullname);
        tvPhoneNo = findViewById(R.id.tvPhoneNo);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            circImg.setImageResource(bundle.getInt("image"));
            tvFullname.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));

        }

    }
}
