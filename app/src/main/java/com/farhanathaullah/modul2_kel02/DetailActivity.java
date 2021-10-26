package com.farhanathaullah.modul2_kel02;

import androidx.appcompat.app.AppCompatActivity;

// TODO Tambahan tugas
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.farhanathaullah.modul2_kel02.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama;
    // TODO Tambahan tugas
    private TextView tvFullName, tvEmail;
    private ImageView ivPhoto;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO Tambahan tugas
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> openAboutActivity());
        tvFullName = findViewById(R.id.tv_full_name);
        tvEmail = findViewById(R.id.tv_email);
        ivPhoto = findViewById(R.id.iv_user_photo);

        if (getIntent().hasExtra("name")) {

            String nama = getIntent().getStringExtra("name");
            // TODO Tambahan tugas
            String lastName = getIntent().getStringExtra("lastName");
            tvFullName.setText(nama + " " + lastName);
            String email = getIntent().getStringExtra("email");
            tvEmail.setText(email);
            String userImage = getIntent().getStringExtra("photo");
            Glide.with(this).load(userImage).into(ivPhoto);
        }
    }

    // TODO Tambahan tugas
    public void openAboutActivity(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}