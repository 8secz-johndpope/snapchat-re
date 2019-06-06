package com.brightcove.player.controller;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.accessibility.CaptioningManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.brightcove.player.R;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.BrightcoveCaptionPropertiesActivity;
import com.brightcove.player.captioning.LoadCaptionsService;
import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.VideoFields;
import com.brightcove.player.model.Video;
import com.brightcove.player.model.Video.Fields;
import com.brightcove.player.view.BaseVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@ListensFor(events = {"didSetVideo", "stop", "enterTvMode", "hidePlayerOptions"})
@Emits(events = {"captionsDialogOk", "captionsDialogSettings", "toggleClosedCaptions", "captionsLanguages", "selectClosedCaptionTrack"})
public class BrightcoveClosedCaptioningController extends AbstractComponent {
    static final String a = "BrightcoveClosedCaptioningController";
    protected Context b;
    int c = 0;
    LoadCaptionsService d;
    boolean e;
    Video f;
    boolean g;
    RadioGroup h;
    private CaptioningManager i;
    private BaseVideoView j;
    private List<String> k;
    private final int l = R.id.captions;
    private EventListener m = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            BrightcoveClosedCaptioningController.this.f = (Video) event.properties.get(Event.VIDEO);
            String string = PreferenceManager.getDefaultSharedPreferences(BrightcoveClosedCaptioningController.this.b).getString(CaptionConstants.PREF_LOCALE, Locale.getDefault().getLanguage());
            BrightcoveClosedCaptioningController brightcoveClosedCaptioningController = BrightcoveClosedCaptioningController.this;
            List<Pair> a = brightcoveClosedCaptioningController.a(brightcoveClosedCaptioningController.f);
            if (a != null) {
                for (Pair pair : a) {
                    if (!((Uri) pair.first).equals(Uri.EMPTY) && ((BrightcoveCaptionFormat) pair.second).language().equals(string)) {
                        BrightcoveClosedCaptioningController.this.d.loadCaptions((Uri) pair.first, ((BrightcoveCaptionFormat) pair.second).type());
                        break;
                    }
                }
            }
            if (VERSION.SDK_INT >= 19 && BrightcoveClosedCaptioningController.this.e) {
                BrightcoveClosedCaptioningController.a(BrightcoveClosedCaptioningController.this);
            }
        }
    };
    private OnCheckedChangeListener n = new OnCheckedChangeListener() {
        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            radioGroup.check(i);
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            BrightcoveClosedCaptioningController.this.c = radioGroup.indexOfChild(radioButton);
            BrightcoveClosedCaptioningController brightcoveClosedCaptioningController = BrightcoveClosedCaptioningController.this;
            brightcoveClosedCaptioningController.a(brightcoveClosedCaptioningController.c);
        }
    };

    public BrightcoveClosedCaptioningController(BaseVideoView baseVideoView, Context context) {
        super(baseVideoView.getEventEmitter(), BrightcoveClosedCaptioningController.class);
        this.b = context;
        this.j = baseVideoView;
        this.e = true;
        addListener(EventType.DID_SET_VIDEO, this.m);
        this.d = new LoadCaptionsService(this.eventEmitter, context.getContentResolver());
        if (VERSION.SDK_INT >= 19) {
            this.i = (CaptioningManager) this.b.getSystemService(VideoFields.CAPTIONING);
            CaptioningManager captioningManager = this.i;
            if (captioningManager != null) {
                saveClosedCaptioningState(captioningManager.isEnabled());
            }
        }
        addListener(EventType.ENTER_TV_MODE, new EventListener() {
            public final void processEvent(Event event) {
                BrightcoveClosedCaptioningController.this.g = true;
            }
        });
        addListener(EventType.HIDE_PLAYER_OPTIONS, new EventListener() {
            public final void processEvent(Event event) {
                BrightcovePlayerOptionsManager.getInstance().hidePlayerOptions(BrightcoveClosedCaptioningController.this.eventEmitter);
                BrightcoveClosedCaptioningController brightcoveClosedCaptioningController = BrightcoveClosedCaptioningController.this;
                if (brightcoveClosedCaptioningController.h != null) {
                    BrightcovePlayerOptionsManager.getInstance().hideAudioTracksOptions();
                    brightcoveClosedCaptioningController.h.removeAllViews();
                }
            }
        });
    }

    private void a() {
        RadioGroup radioGroup;
        if (this.h == null) {
            BrightcovePlayerOptionsManager.getInstance().initPlayerOptions(this.j);
            this.h = BrightcovePlayerOptionsManager.getInstance().getCaptionsGroup();
            radioGroup = this.h;
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener(this.n);
            }
        }
        radioGroup = this.h;
        if (radioGroup != null && radioGroup.getChildCount() <= 0) {
            LayoutInflater layoutInflater = (LayoutInflater) this.j.getContext().getSystemService("layout_inflater");
            if (layoutInflater != null) {
                for (CharSequence text : a(this.k)) {
                    RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.tv_player_options_item, this.h, false);
                    radioButton.setText(text);
                    this.h.addView(radioButton);
                }
                BrightcovePlayerOptionsManager.getInstance().showPlayerOptions(this.eventEmitter);
                BrightcovePlayerOptionsManager.getInstance().showCaptionsOptions();
                RadioButton radioButton2 = (RadioButton) this.h.getChildAt(this.c);
                if (!BrightcovePlayerOptionsManager.getInstance().isAudioTracksVisible()) {
                    radioButton2.requestFocus();
                }
                this.h.check(radioButton2.getId());
            }
        }
    }

    private CharSequence[] a(List<String> list) {
        CharSequence[] charSequenceArr = new CharSequence[(list.size() + 1)];
        int i = 0;
        charSequenceArr[0] = this.b.getString(R.string.color_none);
        while (i < list.size()) {
            int i2 = i + 1;
            charSequenceArr[i2] = new Locale((String) list.get(i)).getDisplayLanguage();
            i = i2;
        }
        return charSequenceArr;
    }

    /* Access modifiers changed, original: final */
    public final List<Pair<Uri, BrightcoveCaptionFormat>> a(Video video) {
        Object obj = video.getProperties().get(Fields.CAPTION_SOURCES);
        if (!validateCaptionSourcesField(obj)) {
            return null;
        }
        List<Pair> list = (List) obj;
        if (list != null && list.size() > 0) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Pair pair : list) {
                arrayList.add(((BrightcoveCaptionFormat) pair.second).language());
            }
            hashMap.put(Event.LANGUAGES, arrayList);
            getEventEmitter().emit(EventType.CAPTIONS_LANGUAGES, hashMap);
        }
        return list;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        if (i != 0) {
            List list = this.k;
            if (!(list == null || list.isEmpty())) {
                saveClosedCaptioningState(true);
                String str = (String) this.k.get(i - 1);
                setLocaleCode(str);
                if (this.d != null) {
                    List<Pair> a = a(this.f);
                    if (a != null) {
                        for (Pair pair : a) {
                            if (((BrightcoveCaptionFormat) pair.second).language().equals(str)) {
                                break;
                            }
                        }
                    }
                    Pair pair2 = null;
                    HashMap hashMap;
                    if (((Uri) pair2.first).equals(Uri.EMPTY)) {
                        hashMap = new HashMap();
                        hashMap.put(Event.BOOLEAN, Boolean.TRUE);
                        this.eventEmitter.emit(EventType.TOGGLE_CLOSED_CAPTIONS, hashMap);
                    } else {
                        if (!((Uri) pair2.first).toString().startsWith(BrightcoveCaptionFormat.BRIGHTCOVE_SCHEME)) {
                            this.d.loadCaptions((Uri) pair2.first, ((BrightcoveCaptionFormat) pair2.second).type());
                        }
                        hashMap = new HashMap();
                        hashMap.put(Event.CAPTION_FORMAT, pair2.second);
                        hashMap.put(Event.CAPTION_URI, pair2.first);
                        this.eventEmitter.emit(EventType.SELECT_CLOSED_CAPTION_TRACK, hashMap);
                        return;
                    }
                }
                return;
            }
        }
        saveClosedCaptioningState(false);
    }

    public boolean checkIfCaptionsExist(Video video) {
        if (video == null) {
            Log.e(a, "Got null video, cannot load captions.");
            return false;
        }
        Object obj = video.getProperties().get(Fields.CAPTION_SOURCES);
        if (validateCaptionSourcesField(obj)) {
            List list = (List) obj;
            if (list != null && list.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public LoadCaptionsService getLoadCaptionsService() {
        return this.d;
    }

    public boolean isCaptioningEnabled() {
        return PreferenceManager.getDefaultSharedPreferences(this.b).getBoolean(CaptionConstants.PREF_MASTER_SWITCH, false);
    }

    public void saveClosedCaptioningState(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.BOOLEAN, Boolean.valueOf(z));
        this.eventEmitter.emit(EventType.TOGGLE_CLOSED_CAPTIONS, hashMap);
        PreferenceManager.getDefaultSharedPreferences(this.b).edit().putBoolean(CaptionConstants.PREF_MASTER_SWITCH, z).apply();
    }

    public void setLocaleCode(String str) {
        PreferenceManager.getDefaultSharedPreferences(this.b).edit().putString(CaptionConstants.PREF_LOCALE, str).apply();
    }

    public void setShouldImportSystemSettings(boolean z) {
        this.e = z;
    }

    public void showCaptionsDialog() {
        ArrayList arrayList = new ArrayList();
        List<Pair> a = a(this.f);
        if (a != null) {
            for (Pair pair : a) {
                if (pair.second != null) {
                    arrayList.add(((BrightcoveCaptionFormat) pair.second).language());
                }
            }
        }
        this.k = arrayList;
        CharSequence[] a2 = a(this.k);
        if (isCaptioningEnabled()) {
            String displayLanguage = new Locale(PreferenceManager.getDefaultSharedPreferences(this.b).getString(CaptionConstants.PREF_LOCALE, Locale.getDefault().getLanguage())).getDisplayLanguage();
            for (int i = 1; i < a2.length; i++) {
                if (a2[i].toString().equals(displayLanguage)) {
                    this.c = i;
                    break;
                }
            }
        } else {
            this.c = 0;
        }
        if (this.g) {
            a();
        } else {
            new Builder(this.b).setTitle(R.string.brightcove_caption_selection).setSingleChoiceItems(a2, this.c, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BrightcoveClosedCaptioningController brightcoveClosedCaptioningController = BrightcoveClosedCaptioningController.this;
                    brightcoveClosedCaptioningController.c = i;
                    brightcoveClosedCaptioningController.a(i);
                }
            }).setPositiveButton(17039370, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BrightcoveClosedCaptioningController.this.eventEmitter.emit(EventType.CAPTIONS_DIALOG_OK);
                    dialogInterface.dismiss();
                }
            }).setNeutralButton(R.string.brightcove_settings, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BrightcoveClosedCaptioningController.this.e = false;
                    Log.d(BrightcoveClosedCaptioningController.a, "Showing the captions preference activity.");
                    BrightcoveClosedCaptioningController.this.b.startActivity(new Intent(BrightcoveClosedCaptioningController.this.b, BrightcoveCaptionPropertiesActivity.class));
                    BrightcoveClosedCaptioningController.this.eventEmitter.emit(EventType.CAPTIONS_DIALOG_SETTINGS);
                }
            }).show();
        }
    }

    public boolean validateCaptionSourcesField(Object obj) {
        int i;
        if (obj instanceof List) {
            i = 0;
            for (Object obj2 : (List) obj) {
                if (!(obj2 instanceof Pair)) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return i == 0;
    }
}
