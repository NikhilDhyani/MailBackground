package com.example.nikhil.mailbackground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.creativityapps.gmailbackgroundlibrary.BackgroundMail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BackgroundMail.newBuilder(this)
                .withUsername("username@gmail.com")
                .withPassword("Password@123")
                .withMailto("toemail@gmail.com")
                .withType(BackgroundMail.TYPE_PLAIN)
                .withSubject("this is the subject")
                .withBody("this is the body")
                .withOnSuccessCallback(new BackgroundMail.OnSuccessCallback() {
                    @Override
                    public void onSuccess() {
                        //do some magic
                    }
                })
                .withOnFailCallback(new BackgroundMail.OnFailCallback() {
                    @Override
                    public void onFail() {
                        //do some magic
                    }
                })
                .send();
    }
}
