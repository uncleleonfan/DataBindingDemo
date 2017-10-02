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
//            User user = new User("FirstName", "LastName");
            User user = new User();
//            user.setFirstName("FirstName");
//            user.setLastName("LastName");
            user.firstName.set("FirstName");
            user.lastName.set("LastName");
            binding.setUser(user);
            binding.setHandlers(new MyHandlers());
        }
}
