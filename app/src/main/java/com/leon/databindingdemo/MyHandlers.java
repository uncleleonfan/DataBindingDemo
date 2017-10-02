package com.leon.databindingdemo;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyHandlers {
    private static final String TAG = "MyHandlers";

    public void onClickFriend(View view) {
        Log.d(TAG, "onClickFriend: ");
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }

/*
    public void onClickFriend(User user) {
        Log.d(TAG, "onClickFriend: " + user.getFirstName());
    }
*/

    public void onClickFriend(User user) {
        Log.d(TAG, "onClickFriend: " + user.firstName.get());
    }


/*
    public void onClickFriend(View view, User user) {
        Toast.makeText(view.getContext(), "onClickFriend：" + user.getFirstName(), Toast.LENGTH_SHORT).show();
    }
*/

    public void onClickFriend(View view, User user) {
        Log.d(TAG, "onClickFriend: ");
        Toast.makeText(view.getContext(), "onClickFriend：" + user.firstName.get(), Toast.LENGTH_SHORT).show();
    }
/*

    public void updateUser(User user) {
        user.setFirstName("Leon");
        user.setLastName("Fan");
    }
*/

    public void updateUser(User user) {
        user.firstName.set("Leon");
        user.lastName.set("Fan");
    }
}
