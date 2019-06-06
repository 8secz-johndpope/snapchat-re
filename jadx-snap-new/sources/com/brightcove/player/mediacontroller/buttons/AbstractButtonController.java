package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.brightcove.player.R;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import defpackage.yc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractButtonController extends AbstractComponent implements ButtonController, RemoteControlKeyState {
    public static final int DEFAULT_AUDIO_TRACKS_BUTTON_ID = R.id.audio_tracks;
    public static final int DEFAULT_CAPTIONS_BUTTON_ID = R.id.captions;
    public static final int DEFAULT_FAST_FORWARD_BUTTON_ID = R.id.fast_forward;
    public static final int DEFAULT_FULL_SCREEN_BUTTON_ID = R.id.full_screen;
    public static final int DEFAULT_LIVE_BUTTON_ID = R.id.live;
    public static final int DEFAULT_PLAY_BUTTON_ID = R.id.play;
    public static final int DEFAULT_REWIND_BUTTON_ID = R.id.rewind;
    public static final int DEFAULT_SEEK_BUTTON_ID = R.id.seek_bar;
    private static final String d = AbstractButtonController.class.getSimpleName();
    protected final Map<String, Object> a = new HashMap();
    protected final List<ButtonState> b = new ArrayList();
    protected final BaseVideoView c;
    private final Context e;
    private Button f;
    private final int g;
    private final Typeface h;

    public AbstractButtonController(Context context, BaseVideoView baseVideoView, View view, int i, Typeface typeface) {
        super(baseVideoView.getEventEmitter());
        this.e = context;
        this.c = baseVideoView;
        this.g = i;
        this.h = typeface;
        this.f = (Button) view.findViewById(i);
        Button button = this.f;
        if (button != null) {
            button.setOnClickListener(new yc(this));
            if (typeface != null) {
                this.f.setTypeface(typeface);
            }
        }
    }

    public Button getButton() {
        return this.f;
    }

    public EventEmitter getEventEmitter() {
        return this.eventEmitter;
    }

    public Typeface getFont() {
        return this.h;
    }

    public int getId() {
        return this.g;
    }

    public Map<String, Object> getProperties() {
        return this.a;
    }

    public List<ButtonState> getStateList() {
        return this.b;
    }

    public int getVisibilityState() {
        return 0;
    }

    public boolean onBack(KeyEvent keyEvent) {
        return false;
    }

    public boolean onDpadCenter(KeyEvent keyEvent) {
        return false;
    }

    public boolean onDpadDown(KeyEvent keyEvent) {
        return false;
    }

    public boolean onDpadLeft(KeyEvent keyEvent) {
        return false;
    }

    public boolean onDpadRight(KeyEvent keyEvent) {
        return false;
    }

    public boolean onDpadUp(KeyEvent keyEvent) {
        return false;
    }

    public boolean onFastForward(KeyEvent keyEvent) {
        return false;
    }

    public boolean onHome(KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenu(KeyEvent keyEvent) {
        return false;
    }

    public boolean onPause(KeyEvent keyEvent) {
        return false;
    }

    public boolean onPlay(KeyEvent keyEvent) {
        return false;
    }

    public boolean onPlayPause(KeyEvent keyEvent) {
        return false;
    }

    public boolean onRewind(KeyEvent keyEvent) {
        return false;
    }

    public boolean onSkipBackward(KeyEvent keyEvent) {
        return false;
    }

    public boolean onSkipForward(KeyEvent keyEvent) {
        return false;
    }

    public void syncStates() {
        int managedState = getManagedState();
        if (this.b.size() < managedState) {
            Log.wtf(d, String.format("There is no, or insufficient, state information for the button with text: %s.", new Object[]{this.f.getText()}));
            return;
        }
        if (this.b.size() > 0) {
            Log.v(d, String.format("Start of sync update: text = %s; description = %s.", new Object[]{this.f.getText(), this.f.getContentDescription()}));
            ButtonState buttonState = (ButtonState) this.b.get(managedState);
            this.f.setContentDescription(buttonState.getContentDescription());
            Drawable image = buttonState.getImage();
            if (image != null) {
                this.f.setCompoundDrawablesWithIntrinsicBounds(image, null, null, null);
                this.f.setText("");
            } else {
                this.f.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f.setText(buttonState.getText());
            }
            Log.v(d, String.format("End of sync update: text = %s; description = %s.", new Object[]{this.f.getText(), this.f.getContentDescription()}));
        }
    }
}
