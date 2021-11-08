automationpackage com.example.chatbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //logo display also changed in manifest

        new Handler().postDelayed(() -> startActivity(new Intent(SplashscreenActivity.this,MainActivity.class)),3000);



    }
}