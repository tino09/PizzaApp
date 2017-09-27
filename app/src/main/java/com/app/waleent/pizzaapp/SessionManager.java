package com.app.waleent.pizzaapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by wale on 9/27/17.
 */

public class SessionManager {
    private static String TAG = SessionManager.class.getSimpleName();

    // Shared Preferences
    SharedPreferences pref;

    SharedPreferences.Editor editor;
    Context _context;

    // Shared preferences file name
    private static final String PREF_NAME = "PizzaApp";
    private static final String PREF_USERNAME = "username";

    private static final String LOGGEDIN = "isLoggedIn";

    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }

    public void setLogin (boolean isLoggedIn){
        editor.putBoolean(LOGGEDIN,isLoggedIn);
        editor.commit();
        Log.d(TAG,"User is Logged in");
    }

    public boolean isLoggedIn (){
        return pref.getBoolean(LOGGEDIN,false);
    }
}
