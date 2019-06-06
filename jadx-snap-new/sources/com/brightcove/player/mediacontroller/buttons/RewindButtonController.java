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

public class RewindButtonController extends SeekButtonController {
    private EventListener l = new EventListener() {
        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty(Event.FROM_SEEK_POSITION);
            int integerProperty2 = event.getIntegerProperty(Event.SEEK_POSITION);
            if (integerProperty == RewindButtonController.this.f && integerProperty2 == RewindButtonController.this.g) {
                RewindButtonController.this.eventEmitter.emit(EventType.DID_REWIND, event.properties);
            }
        }
    };

    public RewindButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.rewind, typeface, EventType.REWIND);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_rewind, R.string.desc_rewind, brightcoveControlBar.getImage(BrightcoveControlBar.REWIND_IMAGE), EventType.REWIND));
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i, int i2) {
        i -= i2;
        return i > 0 ? i : 0;
    }

    public EventListener getDidSeekHandler() {
        return this.l;
    }

    public boolean onRewind(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.eventEmitter.emit(EventType.REWIND);
        }
        return a(keyEvent);
    }
}
