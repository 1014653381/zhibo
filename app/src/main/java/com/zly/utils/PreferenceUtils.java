package com.zly.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.zly.app.YuYouBangApp;


import java.lang.reflect.Type;

public class PreferenceUtils {

    public static void putJsessionId(String value){
        SharedPreferences sp = YuYouBangApp.getContext().getSharedPreferences(
                "config", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("sessionid", value);
        edit.commit();
    }

    public static String getPrefString(Context context, String key, final String defaultValue) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        return settings.getString(key, defaultValue);
    }

    public static void setPrefString(Context context, final String key, final String value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings.edit().putString(key, value).commit();
    }

    public static boolean getPrefBoolean(Context context, final String key,
                                         final boolean defaultValue) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        return settings.getBoolean(key, defaultValue);
    }

    public static boolean hasKey(Context context, final String key) {
        return PreferenceManager.getDefaultSharedPreferences(context).contains(key);
    }

    public static void setPrefBoolean(Context context, final String key, final boolean value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings.edit().putBoolean(key, value).commit();
    }

    public static void setPrefInt(Context context, final String key, final int value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings.edit().putInt(key, value).commit();
    }

    public static int getPrefInt(Context context, final String key, final int defaultValue) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        return settings.getInt(key, defaultValue);
    }

    public static void setPrefFloat(Context context, final String key, final float value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings.edit().putFloat(key, value).commit();
    }

    public static float getPrefFloat(Context context, final String key, final float defaultValue) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        return settings.getFloat(key, defaultValue);
    }

    public static void setSettingLong(Context context, final String key, final long value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings.edit().putLong(key, value).commit();
    }

    public static long getPrefLong(Context context, final String key, final long defaultValue) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        return settings.getLong(key, defaultValue);
    }

    public static void clearPreference(Context context, final SharedPreferences p) {
        final SharedPreferences.Editor editor = p.edit();
        editor.clear();
        editor.commit();
    }

    public static boolean isEmpty(String key){
        return TextUtils.isEmpty(PreferenceUtils.getPrefString(YuYouBangApp.getContext(), key, ""));
    }

    public static <T> T getClaz(String key, Type type){
        try{
            String prefString = PreferenceUtils.getPrefString(YuYouBangApp.getContext(), key, "");
            return new Gson().fromJson(prefString, type);
        }catch (Exception e){
            LogUtils.e(e.getMessage());
        }
        return null;
    }

    public static <T> T getClaz(String key, Class<T> clazz){
        try{
            String prefString = PreferenceUtils.getPrefString(YuYouBangApp.getContext(), key, "");
            return new Gson().fromJson(prefString, clazz);
        }catch (Exception e){
            LogUtils.e(e.getMessage());
        }
        return null;
    }

}
