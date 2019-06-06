package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.brightcove.player.R;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;

public class FullScreenButtonController extends AbstractButtonController {

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(FullScreenButtonController fullScreenButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            FullScreenButtonController.this.syncStates();
        }
    }

    static {
        FullScreenButtonController.class.getSimpleName();
    }

    public FullScreenButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.full_screen, typeface);
        Drawable image = brightcoveControlBar.getImage(BrightcoveControlBar.ENTER_FULL_SCREEN_IMAGE);
        Drawable image2 = brightcoveControlBar.getImage(BrightcoveControlBar.EXIT_FULL_SCREEN_IMAGE);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_enter_full_screen, R.string.desc_enter_full_screen, image, EventType.ENTER_FULL_SCREEN));
        this.b.add(new ButtonState(context, R.string.brightcove_controls_exit_full_screen, R.string.desc_exit_full_screen, image2, EventType.EXIT_FULL_SCREEN));
        a aVar = new a(this, (byte) 0);
        addListener(EventType.ENTER_FULL_SCREEN, aVar);
        addListener(EventType.EXIT_FULL_SCREEN, aVar);
        addListener(EventType.DID_ENTER_FULL_SCREEN, aVar);
        addListener(EventType.DID_EXIT_FULL_SCREEN, aVar);
        addListener(EventType.ENTERED_VR_MODE, new EventListener() {
            public final void processEvent(Event event) {
                FullScreenButtonController.this.getButton().setVisibility(8);
            }
        });
        addListener(EventType.EXITED_VR_MODE, new EventListener() {
            public final void processEvent(Event event) {
                FullScreenButtonController.this.getButton().setVisibility(0);
            }
        });
        syncStates();
    }

    public int getManagedState() {
        return this.c.isFullScreen() ? 1 : 0;
    }

    public int getVisibilityState() {
        return this.c.getRenderView().isVrMode() ? 8 : super.getVisibilityState();
    }
}
