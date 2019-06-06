package com.brightcove.player.captioning;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.R;
import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.brightcove.player.captioning.preferences.ColorPreference;
import com.brightcove.player.captioning.preferences.EdgeTypePreference;
import com.brightcove.player.captioning.preferences.ListDialogPreference;
import com.brightcove.player.captioning.preferences.ListDialogPreference.OnValueChangedListener;
import com.brightcove.player.captioning.preferences.ListPreferenceWithSummary;
import com.brightcove.player.captioning.preferences.PresetPreference;
import com.brightcove.player.management.BrightcoveClosedCaptioningManager;

@TargetApi(16)
public class BrightcoveCaptionPropertiesFragment extends PreferenceFragment implements OnPreferenceChangeListener, OnValueChangedListener {
    public static final String TAG = "BrightcoveCaptionPropertiesFragment";
    private BrightcoveClosedCaptioningTextView a;
    private SwitchPreference b;
    private ListPreferenceWithSummary c;
    private PresetPreference d;
    private ListPreferenceWithSummary e;
    private ColorPreference f;
    private ColorPreference g;
    private EdgeTypePreference h;
    private ColorPreference i;
    private ColorPreference j;
    private ColorPreference k;
    private ColorPreference l;
    private ColorPreference m;
    private PreferenceCategory n;
    private PreferenceCategory o;
    private boolean p;

    private void a() {
        Object obj = ((float) this.d.getValue()) == -1.0f ? 1 : null;
        if (obj == null && this.p) {
            getPreferenceScreen().removePreference(this.o);
            this.p = false;
            return;
        }
        if (!(obj == null || this.p)) {
            getPreferenceScreen().addPreference(this.o);
            this.p = true;
        }
    }

    private void a(boolean z) {
        this.o.setEnabled(z);
        this.n.setEnabled(z);
        this.b.setEnabled(true);
        if (this.a.getParent() != null) {
            ((ViewGroup) this.a.getParent()).setVisibility(z ? 0 : 4);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.brightcove_captioning_settings);
        this.b = (SwitchPreference) findPreference(CaptionConstants.PREF_MASTER_SWITCH);
        this.c = (ListPreferenceWithSummary) findPreference(CaptionConstants.PREF_FONT_SIZE);
        int[] intArray = getResources().getIntArray(R.array.captioning_preset_selector_values);
        String[] stringArray = getResources().getStringArray(R.array.captioning_preset_selector_titles);
        this.d = (PresetPreference) findPreference(CaptionConstants.PREF_PRESET);
        this.d.setValues(intArray);
        this.d.setTitles(stringArray);
        this.n = (PreferenceCategory) findPreference(CaptionConstants.PREF_STANDARD);
        this.o = (PreferenceCategory) findPreference(CaptionConstants.PREF_CUSTOM);
        this.p = true;
        int[] intArray2 = getResources().getIntArray(R.array.captioning_color_selector_values);
        String[] stringArray2 = getResources().getStringArray(R.array.captioning_color_selector_titles);
        this.f = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_FOREGROUND_COLOR);
        this.f.setTitles(stringArray2);
        this.f.setValues(intArray2);
        int[] intArray3 = getResources().getIntArray(R.array.captioning_opacity_selector_values);
        String[] stringArray3 = getResources().getStringArray(R.array.captioning_opacity_selector_titles);
        this.g = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_FOREGROUND_OPACITY);
        this.g.setTitles(stringArray3);
        this.g.setValues(intArray3);
        this.i = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_EDGE_COLOR);
        this.i.setTitles(stringArray2);
        this.i.setValues(intArray2);
        int[] iArr = new int[(intArray2.length + 1)];
        String[] strArr = new String[(stringArray2.length + 1)];
        System.arraycopy(intArray2, 0, iArr, 1, intArray2.length);
        System.arraycopy(stringArray2, 0, strArr, 1, stringArray2.length);
        iArr[0] = 0;
        strArr[0] = getString(R.string.color_none);
        this.j = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_BACKGROUND_COLOR);
        this.j.setTitles(strArr);
        this.j.setValues(iArr);
        this.k = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_BACKGROUND_OPACITY);
        this.k.setTitles(stringArray3);
        this.k.setValues(intArray3);
        this.l = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_WINDOW_COLOR);
        this.l.setTitles(strArr);
        this.l.setValues(iArr);
        this.m = (ColorPreference) this.o.findPreference(CaptionConstants.PREF_WINDOW_OPACITY);
        this.m.setTitles(stringArray3);
        this.m.setValues(intArray3);
        this.h = (EdgeTypePreference) this.o.findPreference(CaptionConstants.PREF_EDGE_TYPE);
        this.e = (ListPreferenceWithSummary) this.o.findPreference(CaptionConstants.PREF_TYPEFACE);
        a();
        this.d.setOnValueChangedListener(this);
        this.f.setOnValueChangedListener(this);
        this.g.setOnValueChangedListener(this);
        this.i.setOnValueChangedListener(this);
        this.j.setOnValueChangedListener(this);
        this.k.setOnValueChangedListener(this);
        this.l.setOnValueChangedListener(this);
        this.m.setOnValueChangedListener(this);
        this.h.setOnValueChangedListener(this);
        this.e.setOnPreferenceChangeListener(this);
        this.c.setOnPreferenceChangeListener(this);
        this.b.setOnPreferenceChangeListener(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.captioning_preview, viewGroup, false);
        ((ViewGroup) inflate.findViewById(R.id.properties_fragment)).addView(super.onCreateView(layoutInflater, viewGroup, bundle), -1, -1);
        this.a = (BrightcoveClosedCaptioningTextView) inflate.findViewById(R.id.preview_text);
        this.a.setStyle(BrightcoveClosedCaptioningManager.getInstance(getActivity()).getStyle());
        a(PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean(CaptionConstants.PREF_MASTER_SWITCH, false));
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (preference.getKey().equals(CaptionConstants.PREF_MASTER_SWITCH)) {
            a(((Boolean) obj).booleanValue());
        } else {
            BrightcoveCaptionStyle updateStyleByPreferenceKey = BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveClosedCaptioningManager.getInstance(getActivity()).getStyle(), preference.getKey(), obj);
            this.a.setStyle(updateStyleByPreferenceKey);
            BrightcoveClosedCaptioningManager.getInstance(getActivity()).setStyle(updateStyleByPreferenceKey);
        }
        return true;
    }

    public void onResume() {
        super.onResume();
    }

    public void onValueChanged(ListDialogPreference listDialogPreference, int i) {
        BrightcoveCaptionStyle styleForPreset;
        if (listDialogPreference.getKey().equals(CaptionConstants.PREF_PRESET)) {
            styleForPreset = ((PresetPreference) listDialogPreference).getStyleForPreset(i);
            a();
        } else {
            styleForPreset = BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveClosedCaptioningManager.getInstance(getActivity()).getStyle(), listDialogPreference.getKey(), Integer.valueOf(i));
        }
        this.a.setStyle(styleForPreset);
        BrightcoveClosedCaptioningManager.getInstance(getActivity()).setStyle(styleForPreset);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
