package com.leon.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leon.databindingdemo.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
//        User user = new User("Test", "User");
        User user = new User();
        user.firstName.set("Test");
        user.lastName.set("User");
        binding.setUser(user);
        binding.setHandlers(new MyHandlers());
    }
}
