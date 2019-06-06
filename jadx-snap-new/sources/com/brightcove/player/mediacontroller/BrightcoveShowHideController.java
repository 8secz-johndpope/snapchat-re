package com.brightcove.player.mediacontroller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.buttons.PlayButtonController;
import com.brightcove.player.view.BaseVideoView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class BrightcoveShowHideController extends AbstractComponent implements ShowHideController {
    private static final String b = "BrightcoveShowHideController";
    BrightcoveControlBar a;
    private int c = 0;
    private a d;
    private float e;
    private b f;
    private c g = c.FADE;
    private int h = BrightcoveMediaController.DEFAULT_TIMEOUT;
    private boolean i;

    /* renamed from: com.brightcove.player.mediacontroller.BrightcoveShowHideController$5 */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[c.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.brightcove.player.mediacontroller.BrightcoveMediaController.c.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.brightcove.player.mediacontroller.BrightcoveMediaController.c.SLIDE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.brightcove.player.mediacontroller.BrightcoveMediaController.c.FADE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.mediacontroller.BrightcoveShowHideController$AnonymousClass5.<clinit>():void");
        }
    }

    @TargetApi(12)
    class a extends AnimatorListenerAdapter {
        private a() {
        }

        /* synthetic */ a(BrightcoveShowHideController brightcoveShowHideController, byte b) {
            this();
        }

        public final void onAnimationEnd(Animator animator) {
            BrightcoveShowHideController.this.a.setVisibility(8);
        }
    }

    static class b extends Handler {
        private final WeakReference<BrightcoveShowHideController> a;

        b(BrightcoveShowHideController brightcoveShowHideController) {
            this.a = new WeakReference(brightcoveShowHideController);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                BrightcoveShowHideController brightcoveShowHideController = (BrightcoveShowHideController) this.a.get();
                if (brightcoveShowHideController != null) {
                    brightcoveShowHideController.hide();
                }
            }
        }
    }

    @TargetApi(12)
    public BrightcoveShowHideController(BrightcoveControlBar brightcoveControlBar, BaseVideoView baseVideoView) {
        super(baseVideoView.getEventEmitter());
        this.a = brightcoveControlBar;
        this.c = baseVideoView.getContext().getResources().getInteger(17694720);
        if (VERSION.SDK_INT > 12) {
            this.d = new a(this, (byte) 0);
            this.e = brightcoveControlBar.getY();
        }
        this.f = new b(this);
        AnonymousClass1 anonymousClass1 = new EventListener() {
            public final void processEvent(Event event) {
                BrightcoveShowHideController.this.hide();
            }
        };
        AnonymousClass2 anonymousClass2 = new EventListener() {
            public final void processEvent(Event event) {
                BrightcoveShowHideController.this.show();
            }
        };
        EventEmitter eventEmitter = baseVideoView.getEventEmitter();
        eventEmitter.on(ShowHideController.SHOW_MEDIA_CONTROLS, anonymousClass2);
        eventEmitter.on(ShowHideController.HIDE_MEDIA_CONTROLS, anonymousClass1);
        eventEmitter.on(EventType.ENTER_FULL_SCREEN, anonymousClass1);
        eventEmitter.on(EventType.EXIT_FULL_SCREEN, anonymousClass1);
        eventEmitter.on(EventType.DID_ENTER_FULL_SCREEN, anonymousClass1);
        eventEmitter.on(EventType.DID_EXIT_FULL_SCREEN, anonymousClass1);
    }

    @TargetApi(12)
    public void hide() {
        this.i = false;
        if (VERSION.SDK_INT < 12) {
            this.a.setVisibility(8);
        } else {
            (AnonymousClass5.a[this.g.ordinal()] != 1 ? this.a.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration((long) this.c) : this.a.animate().setInterpolator(new DecelerateInterpolator(1.0f)).setDuration((long) this.c).translationY(this.e + ((float) this.a.getHeight()))).setListener(this.d);
        }
        this.eventEmitter.emit(ShowHideController.DID_HIDE_MEDIA_CONTROLS);
    }

    public boolean isShowing() {
        return this.i;
    }

    public void setShowHideAnimationStyle(c cVar) {
        this.g = cVar;
    }

    public void setShowHideTimeout(int i) {
        this.h = i;
        if (this.h == 0) {
            this.f.removeMessages(1);
        }
    }

    @TargetApi(12)
    public void show() {
        Log.d(b, String.format("Showing the media controls.  They will be hidden in %d milliseconds using animation style: %s.", new Object[]{Integer.valueOf(this.h), this.g}));
        this.a.setVisibility(0);
        if (!this.i) {
            final Button button = (Button) this.a.findViewById(PlayButtonController.DEFAULT_PLAY_BUTTON_ID);
            if (button != null) {
                button.postDelayed(new Runnable() {
                    public final void run() {
                        button.requestFocus();
                    }
                }, 100);
            }
        }
        this.i = true;
        if (VERSION.SDK_INT >= 12) {
            (AnonymousClass5.a[this.g.ordinal()] != 1 ? this.a.animate().alpha(1.0f).setDuration((long) this.c) : this.a.animate().setInterpolator(new DecelerateInterpolator(1.0f)).setDuration((long) this.c).translationY(this.e)).setListener(null);
        }
        if (this.a.getHeight() == 0) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    HashMap hashMap = new HashMap();
                    hashMap.put(ShowHideController.CONTROLS_HEIGHT, Integer.valueOf(BrightcoveShowHideController.this.a.getHeight()));
                    BrightcoveShowHideController.this.eventEmitter.emit(ShowHideController.DID_SHOW_MEDIA_CONTROLS, hashMap);
                }
            }, 150);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(ShowHideController.CONTROLS_HEIGHT, Integer.valueOf(this.a.getHeight()));
            this.eventEmitter.emit(ShowHideController.DID_SHOW_MEDIA_CONTROLS, hashMap);
        }
        this.f.removeMessages(1);
        if (this.h > 0) {
            this.f.sendMessageDelayed(this.f.obtainMessage(1), (long) this.h);
        }
    }
}
