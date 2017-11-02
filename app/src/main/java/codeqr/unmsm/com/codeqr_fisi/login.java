package codeqr.unmsm.com.codeqr_fisi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class login extends AppCompatActivity {

    private Button pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pass = (Button) findViewById(R.id.pass);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
