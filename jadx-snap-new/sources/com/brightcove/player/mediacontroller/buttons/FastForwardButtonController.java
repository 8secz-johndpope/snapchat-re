package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.KeyEvent;
import com.brightcove.player.R;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;

public class FastForwardButtonController extends SeekButtonController {
    private EventListener l = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty(Event.FROM_SEEK_POSITION);
            int integerProperty2 = event.getIntegerProperty(Event.SEEK_POSITION);
            if (integerProperty == FastForwardButtonController.this.f && integerProperty2 == FastForwardButtonController.this.g) {
                FastForwardButtonController.this.eventEmitter.emit(EventType.DID_FAST_FORWARD, event.properties);
            }
        }
    };

    public FastForwardButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.fast_forward, typeface, EventType.FAST_FORWARD);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_fast_forward, R.string.desc_fast_forward, brightcoveControlBar.getImage(BrightcoveControlBar.FAST_FORWARD), EventType.FAST_FORWARD));
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i, int i2) {
        int liveEdge;
        if (this.c.getVideoDisplay().isLive()) {
            liveEdge = this.c.getVideoDisplay().getLiveEdge();
            if (liveEdge < 0) {
                liveEdge = i;
            }
        } else {
            liveEdge = this.c.getDuration();
        }
        i += i2;
        return i < liveEdge ? i : liveEdge;
    }

    public EventListener getDidSeekHandler() {
        return this.l;
    }

    public boolean onFastForward(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.eventEmitter.emit(EventType.FAST_FORWARD);
        }
        return a(keyEvent);
    }
}
