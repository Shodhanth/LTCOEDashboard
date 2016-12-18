package net.ltjss.ltce.ltcoedashborard;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import net.ltjss.ltce.ltcoedashborard.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mUicn, mUsername, mPassword;
    private TextInputLayout mFloatingUicnLayout, mFloatingUsernameLayout, mFloatingPasswordLayout;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUicn = (EditText) findViewById(R.id.uidTextInput);
        mUsername = (EditText) findViewById(R.id.usernameTextInput);
        mPassword = (EditText) findViewById(R.id.passwordTextInput);

        mFloatingUicnLayout = (TextInputLayout) findViewById(R.id.uidTextInputFloating);
        mFloatingUsernameLayout = (TextInputLayout) findViewById(R.id.usernameTextInputFloating);
        mFloatingPasswordLayout = (TextInputLayout) findViewById(R.id.passwordTextInputFloating);

        mBtnLogin = (Button) findViewById(R.id.loginBtn);
    }
}
