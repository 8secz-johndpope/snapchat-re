package com.brightcove.player.management;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.preferences.CaptionConstants;

public class BrightcoveClosedCaptioningManager {
    public static final String TAG = "BrightcoveClosedCaptioningManager";
    private static BrightcoveClosedCaptioningManager a;
    private final Context b;

    private BrightcoveClosedCaptioningManager(Context context) {
        this.b = context.getApplicationContext();
    }

    public static BrightcoveClosedCaptioningManager getInstance(Context context) {
        if (a == null) {
            a = new BrightcoveClosedCaptioningManager(context);
        }
        return a;
    }

    public BrightcoveCaptionStyle getStyle() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
        String str = CaptionConstants.PREF_PRESET;
        int i = defaultSharedPreferences.getInt(str, 0);
        String str2 = "1.0";
        String str3 = CaptionConstants.PREF_FONT_SIZE;
        return i != -1 ? BrightcoveCaptionStyle.createCaptionStyleFromPreset(defaultSharedPreferences.getString(str3, str2), i) : BrightcoveCaptionStyle.builder().preset(defaultSharedPreferences.getInt(str, -1)).fontSize(defaultSharedPreferences.getString(str3, str2)).typeface(defaultSharedPreferences.getString(CaptionConstants.PREF_TYPEFACE, CaptionConstants.DEFAULT_TYPEFACE)).foregroundColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_FOREGROUND_COLOR, -1)).foregroundOpacity(defaultSharedPreferences.getInt(CaptionConstants.PREF_FOREGROUND_OPACITY, -1)).edgeType(defaultSharedPreferences.getInt(CaptionConstants.PREF_EDGE_TYPE, 0)).edgeColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_EDGE_COLOR, -16777216)).backgroundColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_BACKGROUND_COLOR, -16777216)).backgroundOpacity(defaultSharedPreferences.getInt(CaptionConstants.PREF_BACKGROUND_OPACITY, -1)).windowColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_WINDOW_COLOR, 0)).windowOpacity(defaultSharedPreferences.getInt(CaptionConstants.PREF_WINDOW_OPACITY, 0)).build();
    }

    public void setStyle(BrightcoveCaptionStyle brightcoveCaptionStyle) {
        Editor edit;
        int preset;
        String str;
        Log.d(TAG, "Writing CaptionsStyle to SharedPreferences");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
        if (brightcoveCaptionStyle.preset() != -1) {
            edit = defaultSharedPreferences.edit();
            preset = brightcoveCaptionStyle.preset();
            str = CaptionConstants.PREF_PRESET;
        } else {
            edit = defaultSharedPreferences.edit().putString(CaptionConstants.PREF_FONT_SIZE, brightcoveCaptionStyle.fontSize()).putString(CaptionConstants.PREF_TYPEFACE, brightcoveCaptionStyle.typeface()).putInt(CaptionConstants.PREF_FOREGROUND_COLOR, brightcoveCaptionStyle.foregroundColor()).putInt(CaptionConstants.PREF_FOREGROUND_OPACITY, brightcoveCaptionStyle.foregroundOpacity()).putInt(CaptionConstants.PREF_EDGE_TYPE, brightcoveCaptionStyle.edgeType()).putInt(CaptionConstants.PREF_EDGE_COLOR, brightcoveCaptionStyle.edgeColor()).putInt(CaptionConstants.PREF_BACKGROUND_COLOR, brightcoveCaptionStyle.backgroundColor()).putInt(CaptionConstants.PREF_BACKGROUND_OPACITY, brightcoveCaptionStyle.backgroundOpacity()).putInt(CaptionConstants.PREF_WINDOW_COLOR, brightcoveCaptionStyle.windowColor());
            preset = brightcoveCaptionStyle.windowOpacity();
            str = CaptionConstants.PREF_WINDOW_OPACITY;
        }
        edit.putInt(str, preset).apply();
    }
}
