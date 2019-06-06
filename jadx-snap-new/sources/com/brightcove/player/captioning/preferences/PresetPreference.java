package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.brightcove.player.R;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;

public class PresetPreference extends ListDialogPreference {
    public static final float PRESET_CUSTOM = -1.0f;

    public PresetPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDialogLayoutResource(R.layout.grid_picker_dialog);
        setListItemLayoutResource(R.layout.preset_picker_item);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, int i) {
        BrightcoveClosedCaptioningTextView brightcoveClosedCaptioningTextView = (BrightcoveClosedCaptioningTextView) view.findViewById(R.id.preview);
        brightcoveClosedCaptioningTextView.setStyle(getStyleForPreset(this.a[i]));
        brightcoveClosedCaptioningTextView.setTextSize(getContext().getResources().getDisplayMetrics().density * 32.0f);
        CharSequence a = a(i);
        if (a != null) {
            ((TextView) view.findViewById(R.id.summary)).setText(a);
        }
    }

    public BrightcoveCaptionStyle getStyleForPreset(int i) {
        String str = "1.0";
        String str2 = CaptionConstants.PREF_FONT_SIZE;
        if (i != -1) {
            return BrightcoveCaptionStyle.createCaptionStyleFromPreset(PreferenceManager.getDefaultSharedPreferences(getContext()).getString(str2, str), i);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        return BrightcoveCaptionStyle.builder().preset(defaultSharedPreferences.getInt(CaptionConstants.PREF_PRESET, -1)).fontSize(defaultSharedPreferences.getString(str2, str)).typeface(defaultSharedPreferences.getString(CaptionConstants.PREF_TYPEFACE, CaptionConstants.DEFAULT_TYPEFACE)).foregroundColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_FOREGROUND_COLOR, -1)).foregroundOpacity(defaultSharedPreferences.getInt(CaptionConstants.PREF_FOREGROUND_OPACITY, -1)).edgeType(defaultSharedPreferences.getInt(CaptionConstants.PREF_EDGE_TYPE, 0)).edgeColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_EDGE_COLOR, -16777216)).backgroundColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_BACKGROUND_COLOR, -16777216)).backgroundOpacity(defaultSharedPreferences.getInt(CaptionConstants.PREF_BACKGROUND_OPACITY, -1)).windowColor(defaultSharedPreferences.getInt(CaptionConstants.PREF_WINDOW_COLOR, 0)).windowOpacity(defaultSharedPreferences.getInt(CaptionConstants.PREF_WINDOW_OPACITY, 0)).build();
    }

    public boolean shouldDisableDependents() {
        return ((float) getValue()) != -1.0f || super.shouldDisableDependents();
    }
}
