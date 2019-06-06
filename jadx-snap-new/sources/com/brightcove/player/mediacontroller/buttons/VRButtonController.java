package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import com.brightcove.player.R;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import com.brightcove.player.view.RenderView;
import java.util.Collections;

public class VRButtonController extends AbstractButtonController {
    final boolean d;

    class b implements OnClickListener {
        private b() {
        }

        /* synthetic */ b(VRButtonController vRButtonController, byte b) {
            this();
        }

        public final void onClick(View view) {
            RenderView renderView = VRButtonController.this.c.getRenderView();
            if (renderView.isVrMode()) {
                VRButtonController.a(VRButtonController.this, renderView);
                return;
            }
            VRButtonController.this.eventEmitter.emit(EventType.CHANGE_ORIENTATION, Collections.singletonMap(Event.REQUESTED_ORIENTATION, Integer.valueOf(6)));
            VRButtonController.this.eventEmitter.emit(EventType.ENTER_FULL_SCREEN);
            renderView.setVrMode(true);
            VRButtonController.this.eventEmitter.emit(EventType.ENTERED_VR_MODE);
        }
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(VRButtonController vRButtonController, byte b) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        public final void processEvent(com.brightcove.player.event.Event r6) {
            /*
            r5 = this;
            r0 = r6.getType();
            r1 = r0.hashCode();
            r2 = -1465496402; // 0xffffffffa8a64cae float:-1.8462957E-14 double:NaN;
            r3 = 0;
            r4 = 1;
            if (r1 == r2) goto L_0x001f;
        L_0x000f:
            r2 = 1792586013; // 0x6ad8b11d float:1.3098219E26 double:8.85655166E-315;
            if (r1 == r2) goto L_0x0015;
        L_0x0014:
            goto L_0x0029;
        L_0x0015:
            r1 = "activityPaused";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0029;
        L_0x001d:
            r0 = 0;
            goto L_0x002a;
        L_0x001f:
            r1 = "projectionFormatChanged";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0029;
        L_0x0027:
            r0 = 1;
            goto L_0x002a;
        L_0x0029:
            r0 = -1;
        L_0x002a:
            if (r0 == 0) goto L_0x0060;
        L_0x002c:
            if (r0 == r4) goto L_0x002f;
        L_0x002e:
            goto L_0x0073;
        L_0x002f:
            r6 = r6.properties;
            r0 = "projectionFormat";
            r6 = r6.get(r0);
            if (r6 == 0) goto L_0x0073;
        L_0x0039:
            r0 = r6 instanceof com.brightcove.player.model.Video.ProjectionFormat;
            if (r0 == 0) goto L_0x0073;
        L_0x003d:
            r6 = (com.brightcove.player.model.Video.ProjectionFormat) r6;
            r0 = com.brightcove.player.mediacontroller.buttons.VRButtonController.this;
            r0 = r0.d;
            if (r0 != 0) goto L_0x0054;
        L_0x0045:
            r0 = com.brightcove.player.model.Video.ProjectionFormat.NORMAL;
            if (r6 != r0) goto L_0x004a;
        L_0x0049:
            goto L_0x0054;
        L_0x004a:
            r6 = com.brightcove.player.mediacontroller.buttons.VRButtonController.this;
            r6 = r6.getButton();
            r6.setVisibility(r3);
            goto L_0x0073;
        L_0x0054:
            r6 = com.brightcove.player.mediacontroller.buttons.VRButtonController.this;
            r6 = r6.getButton();
            r0 = 8;
            r6.setVisibility(r0);
            return;
        L_0x0060:
            r6 = com.brightcove.player.mediacontroller.buttons.VRButtonController.this;
            r6 = r6.c;
            r6 = r6.getRenderView();
            r0 = r6.isVrMode();
            if (r0 == 0) goto L_0x0073;
        L_0x006e:
            r0 = com.brightcove.player.mediacontroller.buttons.VRButtonController.this;
            com.brightcove.player.mediacontroller.buttons.VRButtonController.a(r0, r6);
        L_0x0073:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.mediacontroller.buttons.VRButtonController$a.processEvent(com.brightcove.player.event.Event):void");
        }
    }

    public VRButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface) {
        super(context, baseVideoView, brightcoveControlBar, R.id.vr_mode, typeface);
        this.d = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        Context context2 = context;
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_vr_mode, R.string.desc_vr_mode, brightcoveControlBar.getImage(BrightcoveControlBar.VR_MODE_IMAGE), new b(this, (byte) 0)));
        a aVar = new a(this, (byte) 0);
        addListener(EventType.ACTIVITY_PAUSED, aVar);
        addListener(EventType.PROJECTION_FORMAT_CHANGED, aVar);
        syncStates();
    }

    static /* synthetic */ void a(VRButtonController vRButtonController, RenderView renderView) {
        vRButtonController.eventEmitter.emit(EventType.CHANGE_ORIENTATION, Collections.singletonMap(Event.REQUESTED_ORIENTATION, Integer.valueOf(4)));
        vRButtonController.eventEmitter.emit(EventType.EXIT_FULL_SCREEN);
        renderView.setVrMode(false);
        vRButtonController.eventEmitter.emit(EventType.EXITED_VR_MODE);
    }

    public int getManagedState() {
        return 0;
    }

    public int getVisibilityState() {
        return (this.d || !this.c.getVideoDisplay().isCurrentVideo360Mode()) ? 8 : 0;
    }
}
