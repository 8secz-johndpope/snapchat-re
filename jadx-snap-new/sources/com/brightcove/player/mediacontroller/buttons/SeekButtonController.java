package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.brightcove.player.view.BaseVideoView;
import com.snap.ui.view.TakeSnapButton;
import java.util.HashMap;
import java.util.Map;

public abstract class SeekButtonController extends AbstractButtonController {
    static final String d = RewindButtonController.class.getSimpleName();
    protected int e = BrightcoveMediaController.DEFAULT_TIMEOUT;
    protected int f;
    protected int g;
    protected boolean h = false;
    protected int i = 1;
    protected int j = TakeSnapButton.LONG_PRESS_TIME;
    protected int k = 40;
    private OnHoldHandler l;

    public class OnHoldHandler extends Handler {
        private final int a = 0;
        private final int b = 1;
        private final int c = 2;
        private int d;
        private boolean e;

        public OnHoldHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    SeekButtonController seekButtonController = SeekButtonController.this;
                    this.d = seekButtonController.a(this.d, seekButtonController.e);
                    HashMap hashMap = new HashMap();
                    hashMap.put(Event.SEEK_PROGRESS, Integer.valueOf(this.d));
                    SeekButtonController.this.eventEmitter.emit(EventType.SEEKBAR_DRAGGING_PROGRESS, hashMap);
                    sendMessageDelayed(obtainMessage(1), (long) SeekButtonController.this.k);
                } else if (i == 2) {
                    removeMessages(1);
                    SeekButtonController.this.eventEmitter.emit(EventType.SEEKBAR_DRAGGING_STOP);
                    this.e = false;
                }
            } else if (!this.e) {
                sendMessageAtFrontOfQueue(obtainMessage(1));
                this.d = SeekButtonController.this.c.getCurrentPosition();
                this.e = true;
            }
        }
    }

    public class HideSeekControlsHandler implements EventListener {
        protected HideSeekControlsHandler() {
        }

        @Default
        public void processEvent(Event event) {
            SeekButtonController.this.getButton().setVisibility(4);
        }
    }

    public class SeekConfigurationHandler implements EventListener {
        protected SeekConfigurationHandler() {
        }

        @Default
        public void processEvent(Event event) {
            if (event.properties != null) {
                try {
                    Integer num = (Integer) event.properties.get(Event.SEEK_DEFAULT);
                    if (num != null) {
                        SeekButtonController.this.e = num.intValue();
                    }
                    Boolean bool = (Boolean) event.properties.get(Event.SEEK_RELATIVE_ENABLED);
                    if (bool != null) {
                        SeekButtonController.this.h = bool.booleanValue();
                    }
                    num = (Integer) event.properties.get(Event.SEEK_PERCENTAGE);
                    if (num != null) {
                        SeekButtonController.this.i = num.intValue();
                    }
                    num = (Integer) event.properties.get(Event.SEEK_ON_HOLD_WAIT_TIME);
                    if (num != null) {
                        SeekButtonController.this.j = num.intValue();
                    }
                    Integer num2 = (Integer) event.properties.get(Event.SEEK_ON_HOLD_UPDATE_FREQ);
                    if (num2 != null) {
                        SeekButtonController.this.k = num2.intValue();
                    }
                } catch (ClassCastException e) {
                    Log.e(SeekButtonController.d, "Failed to update seek bar controller settings", e);
                }
            }
        }
    }

    public class SeekHandler implements EventListener {
        protected SeekHandler() {
        }

        @Default
        public void processEvent(Event event) {
            SeekButtonController seekButtonController;
            int i = SeekButtonController.this.c.getVideoDisplay().isLive() ? 10000 : SeekButtonController.this.e;
            SeekButtonController.this.f = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
            if (SeekButtonController.this.f <= 0) {
                seekButtonController = SeekButtonController.this;
                seekButtonController.f = seekButtonController.c.getCurrentPosition();
            }
            seekButtonController = SeekButtonController.this;
            seekButtonController.g = seekButtonController.a(seekButtonController.f, i);
            HashMap hashMap = new HashMap();
            hashMap.put(Event.SEEK_POSITION, Integer.valueOf(SeekButtonController.this.g));
            SeekButtonController.this.eventEmitter.emit(EventType.SEEK_TO, hashMap);
            EventListener didSeekHandler = SeekButtonController.this.getDidSeekHandler();
            if (didSeekHandler != null) {
                SeekButtonController.this.eventEmitter.once(EventType.DID_SEEK_TO, didSeekHandler);
            }
        }
    }

    public class SeekOffsetHandler implements EventListener {
        protected SeekOffsetHandler() {
        }

        public void processEvent(Event event) {
            if (SeekButtonController.this.h) {
                int duration = (SeekButtonController.this.c.getDuration() * SeekButtonController.this.i) / 100;
                if (duration > 0 && duration < SeekButtonController.this.c.getDuration()) {
                    SeekButtonController.this.e = duration;
                }
            }
        }
    }

    public class ShowSeekControlsHandler implements EventListener {
        protected ShowSeekControlsHandler() {
        }

        @Default
        public void processEvent(Event event) {
            SeekButtonController.this.getButton().setVisibility(0);
        }
    }

    public SeekButtonController(Context context, BaseVideoView baseVideoView, View view, int i, Typeface typeface, String str) {
        super(context, baseVideoView, view, i, typeface);
        addListener(str, new SeekHandler());
        addListener(EventType.HIDE_SEEK_CONTROLS, new HideSeekControlsHandler());
        addListener(EventType.SHOW_SEEK_CONTROLS, new ShowSeekControlsHandler());
        addListener(EventType.VIDEO_DURATION_CHANGED, new SeekOffsetHandler());
        addListener(EventType.SEEK_CONTROLLER_CONFIGURATION, new SeekConfigurationHandler());
        this.l = new OnHoldHandler(context.getMainLooper());
    }

    public abstract int a(int i, int i2);

    /* Access modifiers changed, original: protected|final */
    public final boolean a(KeyEvent keyEvent) {
        OnHoldHandler onHoldHandler;
        Message obtainMessage;
        int action = keyEvent.getAction();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (action == 0) {
            if (uptimeMillis - keyEvent.getDownTime() > ((long) this.j)) {
                onHoldHandler = this.l;
                obtainMessage = onHoldHandler.obtainMessage(0);
            }
            return false;
        }
        if (action == 1 && uptimeMillis - keyEvent.getDownTime() > ((long) this.j)) {
            onHoldHandler = this.l;
            obtainMessage = onHoldHandler.obtainMessage(2);
        }
        return false;
        onHoldHandler.sendMessage(obtainMessage);
        return true;
    }

    public abstract EventListener getDidSeekHandler();

    public int getManagedState() {
        return 0;
    }

    public int getOnHoldUpdateFrequency() {
        return this.k;
    }

    public int getOnHoldWaitTime() {
        return this.j;
    }

    public Map<String, Object> getProperties() {
        this.a.clear();
        this.a.put(Event.PLAYHEAD_POSITION, Integer.valueOf(this.c.getCurrentPosition()));
        return this.a;
    }

    public int getSeekDefault() {
        return this.e;
    }

    public int getSeekPercentage() {
        return this.i;
    }

    public int getVisibilityState() {
        return (!this.c.getVideoDisplay().isLive() || this.c.getVideoDisplay().hasDvr()) ? 0 : 8;
    }

    public boolean isSeekRelativeEnabled() {
        return this.h;
    }

    public boolean onDpadCenter(KeyEvent keyEvent) {
        return a(keyEvent);
    }

    public void setOnHoldUpdateFrequency(int i) {
        this.k = i;
    }

    public void setOnHoldWaitTime(int i) {
        this.j = i;
    }

    public void setSeekDefault(int i) {
        this.e = i;
    }

    public void setSeekPercentage(int i) {
        if (i > 0 || i < 100) {
            this.i = i;
        }
    }

    public void setSeekRelativeEnabled(boolean z) {
        this.h = z;
    }
}
