package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.brightcove.player.R;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

@ListensFor(events = {"activityResumed", "captionsDialogOk", "captionsDialogSettings", "fragmentResumed", "enterTvMode", "willChangeVideo"})
public class CaptionsButtonController extends AbstractButtonController {
    static final String d = "CaptionsButtonController";
    boolean e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    EventListener k = new EventListener() {
        public final void processEvent(Event event) {
            if (CaptionsButtonController.this.e) {
                ((ButtonState) CaptionsButtonController.this.getStateList().get(CaptionsButtonController.this.getManagedState())).getHandler().onClick(CaptionsButtonController.this.getButton());
            }
        }
    };

    class a implements OnClickListener {
        private a() {
        }

        /* synthetic */ a(CaptionsButtonController captionsButtonController, byte b) {
            this();
        }

        public final void onClick(View view) {
            Log.d(CaptionsButtonController.d, "Showing the captions dialog.");
            if (CaptionsButtonController.this.c.isPlaying()) {
                CaptionsButtonController.this.c.pause();
                CaptionsButtonController captionsButtonController = CaptionsButtonController.this;
                captionsButtonController.f = captionsButtonController.eventEmitter.once(EventType.CAPTIONS_DIALOG_OK, new EventListener() {
                    public final void processEvent(Event event) {
                        CaptionsButtonController.this.c.start();
                        CaptionsButtonController.this.eventEmitter.off(EventType.CAPTIONS_DIALOG_SETTINGS, CaptionsButtonController.this.g);
                    }
                });
                captionsButtonController = CaptionsButtonController.this;
                captionsButtonController.g = captionsButtonController.eventEmitter.once(EventType.CAPTIONS_DIALOG_SETTINGS, new EventListener() {
                    public final void processEvent(Event event) {
                        CaptionsButtonController.this.h = CaptionsButtonController.this.eventEmitter.once(EventType.ACTIVITY_RESUMED, new EventListener() {
                            public final void processEvent(Event event) {
                                CaptionsButtonController.this.c.start();
                                CaptionsButtonController.this.eventEmitter.off(EventType.FRAGMENT_RESUMED, CaptionsButtonController.this.i);
                            }
                        });
                        CaptionsButtonController.this.i = CaptionsButtonController.this.eventEmitter.once(EventType.FRAGMENT_RESUMED, new EventListener() {
                            public final void processEvent(Event event) {
                                CaptionsButtonController.this.c.start();
                                CaptionsButtonController.this.eventEmitter.off(EventType.ACTIVITY_RESUMED, CaptionsButtonController.this.h);
                            }
                        });
                        CaptionsButtonController.this.eventEmitter.off(EventType.CAPTIONS_DIALOG_OK, CaptionsButtonController.this.f);
                    }
                });
            }
            CaptionsButtonController.this.c.getClosedCaptioningController().showCaptionsDialog();
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(CaptionsButtonController captionsButtonController, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            List list = (List) event.properties.get(Event.LANGUAGES);
            CaptionsButtonController captionsButtonController = CaptionsButtonController.this;
            boolean z = (list == null || list.isEmpty()) ? false : true;
            captionsButtonController.e = z;
            if (!CaptionsButtonController.this.j) {
                CaptionsButtonController.this.getButton().setVisibility(CaptionsButtonController.this.getVisibilityState());
            }
        }
    }

    public CaptionsButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface, Bundle bundle) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.captions, typeface);
        boolean z = false;
        OnClickListener aVar = new a(this, (byte) 0);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_captions, R.string.desc_captions, brightcoveControlBar.getImage(BrightcoveControlBar.CLOSED_CAPTIONS_IMAGE), aVar));
        addListener(EventType.CAPTIONS_LANGUAGES, new b(this, (byte) 0));
        if (bundle != null) {
            String str = Event.CAPTIONS_STATE;
            if (bundle.containsKey(str) && bundle.getBoolean(str)) {
                z = true;
            }
        }
        this.e = z;
        addListener(EventType.ENTER_TV_MODE, new EventListener() {
            public final void processEvent(Event event) {
                CaptionsButtonController captionsButtonController = CaptionsButtonController.this;
                captionsButtonController.j = true;
                captionsButtonController.addListener(EventType.SHOW_PLAYER_OPTIONS, captionsButtonController.k);
            }
        });
        addListener(EventType.WILL_CHANGE_VIDEO, new EventListener() {
            public final void processEvent(Event event) {
                CaptionsButtonController.this.e = false;
            }
        });
    }

    public int getManagedState() {
        return 0;
    }

    public int getVisibilityState() {
        return this.e ? 0 : 8;
    }
}
