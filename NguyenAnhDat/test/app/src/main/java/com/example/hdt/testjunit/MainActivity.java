package com.example.hdt.testjunit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textKq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editInput = findViewById(R.id.edit_input);
        final int n = Integer.parseInt(editInput.getText().toString());
        textKq = findViewById(R.id.text_kq);

        Button btnRun = findViewById(R.id.btn_run);
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                textKq.setText(inKetQua(n));
            }
        });
    }

    public boolean kiemTraSNT(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String inKetQua(int n) {
        StringBuilder kq = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (kiemTraSNT(i)) {
                kq.append(String.valueOf(i)).append(" ");
            }
        }
        return kq.toString();
    }
}
