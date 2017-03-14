package com.karbur.bitirmeprojesi;
import java.util.HashMap;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
 
public class SessionManager {
    private SharedPreferences preferences;
    private Editor editor;
    private Context context;
    private int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "bitirmeprojesi";
    private static final String IS_LOGIN = "IsLoggedIn";
    private static final String USER_COUNTER = "userCounter";
    public static final String NAME = "kullaniciadi";
    public static final String SIFRE = "sifre";
    public static final String URL = "url";
    
    public SessionManager(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit(); 
    }
    
    public void createLoginSession(String name, String sifre, String url,boolean value){
        editor.putBoolean(IS_LOGIN, true);
        editor.putString(NAME, name);
        editor.putString(SIFRE, sifre);
        editor.putString(URL, url);
        editor.putBoolean(USER_COUNTER, value);
        editor.commit();  
    }
    
   
    public HashMap<String, String> getUserDetails(){
        HashMap<String, String> user = new HashMap<String, String>();
        user.put(NAME, preferences.getString(NAME, null));
        user.put(SIFRE, preferences.getString(SIFRE, null)); 
        return user;
    }
    
    
    public boolean isLoggedIn(){
        return preferences.getBoolean(IS_LOGIN, false);
    }
    
    public boolean isThereUser(){
    	return preferences.getBoolean(USER_COUNTER, false);
    }
    
    public String getName(){
    	return preferences.getString(NAME, null);
    }
    
    public String getPassword(){
    	return preferences.getString(SIFRE, null);
    }
    
    
    public void updateName(String name){
    	editor.putString(NAME, name);
    	editor.commit();
    }
    
    public void updatePassword(String password){
    	editor.putString(SIFRE, password);
    	editor.commit();
    }
    
    public String getUrl(){
    	return preferences.getString(URL, null);
    }
    
    
    public void updateUrl(String url){
    	editor.putString(URL, url);
    	editor.commit();
    }
 
}