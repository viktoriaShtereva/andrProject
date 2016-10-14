package com.example.dell.data;

import android.content.Context;
import android.content.SharedPreferences;


public class LoginManager {

    //with this instance will save data to local storage
    SharedPreferences sharedPreferences;

    //with this we gonna commit action to the editor
    SharedPreferences.Editor editor;
    Context context;
    int PrIVATE_MOTE=0;

    //prefs name->with this we are going to load out xml preference file from the sistem
    private static final String prefsName="SoftUni";

    //is_logged KEy
    private static final String KEY_LOGIN="login";

    //username

    private static final String KEY_USERNAME="username";
    private static final String USER_PASSOWORD="pass";




    public LoginManager(Context cxt) {

        this.context=cxt;
        this.sharedPreferences=context.getSharedPreferences(prefsName,PrIVATE_MOTE);
        this.editor=sharedPreferences.edit();

    }

    //this scope will return true if user is logged in
    public boolean loginUser(String username,String password){
      return applyPreferenceChanges(username,password,true);

    }

    private boolean applyPreferenceChanges(String username,String password,boolean isLogged){

        if(sharedPreferences!=null && editor!=null){
            editor.putString(USER_PASSOWORD,username);
            editor.putString(KEY_USERNAME,password);
            editor.putBoolean(KEY_LOGIN,isLogged);
            editor.apply();

            return true;

        }
        else {
            return false;
        }
    }

public boolean loginSignOut() {
if(isLoggedIn()) {
    return isLoggedIn() && applyPreferenceChanges("", "", false);
}
    return false;

}
    public boolean isLoggedIn(){
        if(sharedPreferences !=null){
            return false;
        }
        else {
            return sharedPreferences.getBoolean(KEY_LOGIN,false);
        }

    }
}
