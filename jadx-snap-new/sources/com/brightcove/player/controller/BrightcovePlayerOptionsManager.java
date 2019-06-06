package com.brightcove.player.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.brightcove.player.R;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.mediacontroller.ShowHideController;

public class BrightcovePlayerOptionsManager {
    private static final BrightcovePlayerOptionsManager f = new BrightcovePlayerOptionsManager();
    private View a;
    private TextView b;
    private RadioGroup c;
    private TextView d;
    private RadioGroup e;

    private BrightcovePlayerOptionsManager() {
    }

    private static void a(EventEmitter eventEmitter, String str) {
        if (eventEmitter instanceof RegisteringEventEmitter) {
            ((RegisteringEventEmitter) eventEmitter).getRootEmitter().emit(str);
        } else {
            eventEmitter.emit(str);
        }
    }

    public static BrightcovePlayerOptionsManager getInstance() {
        return f;
    }

    public RadioGroup getAudioTracksGroup() {
        return this.c;
    }

    public TextView getAudioTracksTitle() {
        return this.b;
    }

    public RadioGroup getCaptionsGroup() {
        return this.e;
    }

    public TextView getCaptionsTitle() {
        return this.d;
    }

    public View getPlayerOptionsView() {
        return this.a;
    }

    public void hideAudioTracksOptions() {
        RadioGroup radioGroup = this.c;
        if (radioGroup != null) {
            radioGroup.setVisibility(8);
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void hideCaptionsOptions() {
        RadioGroup radioGroup = this.e;
        if (radioGroup != null) {
            radioGroup.setVisibility(8);
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void hidePlayerOptions(EventEmitter eventEmitter) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(8);
            a(eventEmitter, ShowHideController.SHOW_MEDIA_CONTROLS);
        }
    }

    public View initPlayerOptions(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        this.a = viewGroup.findViewById(R.id.playerOptions);
        if (this.a == null) {
            this.a = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.tv_player_options, viewGroup, false);
            View view = this.a;
            if (view != null) {
                viewGroup.addView(view);
                viewGroup.invalidate();
                this.c = (RadioGroup) this.a.findViewById(R.id.audioTracksGroup);
                this.b = (TextView) this.a.findViewById(R.id.audioTracksTitle);
                this.e = (RadioGroup) this.a.findViewById(R.id.captionsGroup);
                this.d = (TextView) this.a.findViewById(R.id.captionsTitle);
            }
        }
        return this.a;
    }

    public boolean isAudioTracksVisible() {
        if (this.a != null) {
            RadioGroup radioGroup = this.c;
            if (radioGroup != null && radioGroup.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isCaptionsVisible() {
        if (this.a != null) {
            RadioGroup radioGroup = this.e;
            if (radioGroup != null && radioGroup.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isPlayerOptionsVisible() {
        View view = this.a;
        return view != null && view.getVisibility() == 0;
    }

    public void showAudioTracksOptions() {
        RadioGroup radioGroup = this.c;
        if (radioGroup != null) {
            radioGroup.setVisibility(0);
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void showCaptionsOptions() {
        RadioGroup radioGroup = this.e;
        if (radioGroup != null) {
            radioGroup.setVisibility(0);
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void showPlayerOptions(EventEmitter eventEmitter) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
            a(eventEmitter, ShowHideController.HIDE_MEDIA_CONTROLS);
        }
    }
}
