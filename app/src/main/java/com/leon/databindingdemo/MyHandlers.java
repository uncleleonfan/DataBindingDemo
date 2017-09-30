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
}
