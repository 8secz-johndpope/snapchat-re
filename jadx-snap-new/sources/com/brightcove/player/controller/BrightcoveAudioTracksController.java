package com.brightcove.player.controller;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.brightcove.player.R;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.List;

@ListensFor(events = {"audioTracks", "enterTvMode", "hidePlayerOptions"})
@Emits(events = {"audioTracksDialogOk", "selectAudioTrack"})
public class BrightcoveAudioTracksController extends AbstractComponent {
    static final String a = "BrightcoveAudioTracksController";
    int b = 0;
    List<String> c;
    boolean d;
    RadioGroup e;
    private Context f;
    private BaseVideoView g;
    private final int h = R.id.audio_tracks;
    private OnCheckedChangeListener i = new OnCheckedChangeListener() {
        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            radioGroup.check(i);
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            BrightcoveAudioTracksController.this.b = radioGroup.indexOfChild(radioButton);
            BrightcoveAudioTracksController brightcoveAudioTracksController = BrightcoveAudioTracksController.this;
            brightcoveAudioTracksController.a(brightcoveAudioTracksController.b);
        }
    };

    public BrightcoveAudioTracksController(BaseVideoView baseVideoView, Context context) {
        super(baseVideoView.getEventEmitter(), BrightcoveAudioTracksController.class);
        this.g = baseVideoView;
        this.f = context;
        addListener(EventType.AUDIO_TRACKS, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                List list = (List) event.properties.get(Event.TRACKS);
                BrightcoveAudioTracksController.this.c = list;
                Log.v(BrightcoveAudioTracksController.a, "tracks = ".concat(String.valueOf(list)));
                String str = (String) event.properties.get(Event.SELECTED_TRACK);
                if (str != null) {
                    for (int i = 0; i < list.size(); i++) {
                        if (((String) list.get(i)).equals(str)) {
                            BrightcoveAudioTracksController.this.b = i;
                            return;
                        }
                    }
                }
            }
        });
        addListener(EventType.ENTER_TV_MODE, new EventListener() {
            public final void processEvent(Event event) {
                BrightcoveAudioTracksController.this.d = true;
            }
        });
        addListener(EventType.HIDE_PLAYER_OPTIONS, new EventListener() {
            public final void processEvent(Event event) {
                BrightcovePlayerOptionsManager.getInstance().hidePlayerOptions(BrightcoveAudioTracksController.this.eventEmitter);
                BrightcoveAudioTracksController brightcoveAudioTracksController = BrightcoveAudioTracksController.this;
                if (brightcoveAudioTracksController.e != null) {
                    BrightcovePlayerOptionsManager.getInstance().hideAudioTracksOptions();
                    brightcoveAudioTracksController.e.removeAllViews();
                }
            }
        });
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        String str = (String) this.c.get(i);
        HashMap hashMap = new HashMap();
        hashMap.put(Event.SELECTED_TRACK, str);
        this.eventEmitter.emit(EventType.SELECT_AUDIO_TRACK, hashMap);
    }

    public void showAudioTracksDialog() {
        CharSequence[] charSequenceArr = new CharSequence[this.c.size()];
        for (int i = 0; i < this.c.size(); i++) {
            charSequenceArr[i] = (CharSequence) this.c.get(i);
        }
        if (this.d) {
            RadioGroup radioGroup;
            if (this.e == null) {
                BrightcovePlayerOptionsManager.getInstance().initPlayerOptions(this.g);
                this.e = BrightcovePlayerOptionsManager.getInstance().getAudioTracksGroup();
                radioGroup = this.e;
                if (radioGroup != null) {
                    radioGroup.setOnCheckedChangeListener(this.i);
                }
            }
            radioGroup = this.e;
            if (radioGroup != null && radioGroup.getChildCount() <= 0) {
                LayoutInflater layoutInflater = (LayoutInflater) this.g.getContext().getSystemService("layout_inflater");
                if (layoutInflater != null) {
                    for (String text : this.c) {
                        RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.tv_player_options_item, this.e, false);
                        radioButton.setText(text);
                        this.e.addView(radioButton);
                    }
                    BrightcovePlayerOptionsManager.getInstance().showPlayerOptions(this.eventEmitter);
                    BrightcovePlayerOptionsManager.getInstance().showAudioTracksOptions();
                    RadioButton radioButton2 = (RadioButton) this.e.getChildAt(this.b);
                    radioButton2.requestFocus();
                    this.e.check(radioButton2.getId());
                }
            }
            return;
        }
        new Builder(this.f).setTitle(R.string.brightcove_audio_track_selection).setSingleChoiceItems(charSequenceArr, this.b, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                BrightcoveAudioTracksController.this.b = i;
                Log.v(BrightcoveAudioTracksController.a, "onClick: which = ".concat(String.valueOf(i)));
                BrightcoveAudioTracksController.this.a(i);
            }
        }).setPositiveButton(17039370, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                BrightcoveAudioTracksController.this.eventEmitter.emit(EventType.AUDIO_TRACKS_DIALOG_OK);
                dialogInterface.dismiss();
            }
        }).show();
    }
}
