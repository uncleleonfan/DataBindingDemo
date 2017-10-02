package com.leon.databindingdemo;


/*public class User {
    private final String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}*/
/*
public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
*/

import android.databinding.ObservableField;

public class User {
    public final ObservableField<String> firstName =
            new ObservableField<>();
    public final ObservableField<String> lastName =
            new ObservableField<>();
}
