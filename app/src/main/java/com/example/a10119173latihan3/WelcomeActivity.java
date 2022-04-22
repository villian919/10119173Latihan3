package com.example.a10119173latihan3;


import static com.example.a10119173latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends AppCompatActivity {
    ////22 April 2022, 10119173, Birliano Ekayan Arsyad, IF5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //mendeklarasikan butterknife di activity
        ButterKnife.bind(this);

        // logika untuk menampung nilai putekstra dari kelas DoneActivity,
        // agar ketika dihalaman akhir (DoneActivity) ditekan button ok,
        // Semua activity dapat tertutup juga (finish).
        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
    }
}

    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}