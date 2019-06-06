package com.snap.ui.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.snapchat.android.framework.ui.animations.ArcView;
import defpackage.ajxe;
import defpackage.ajyl;
import defpackage.ajyw;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.idl;
import defpackage.jxj.a;
import java.util.List;

public final class AvatarView extends FrameLayout {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(AvatarView.class), "arcView", "getArcView()Lcom/snapchat/android/framework/ui/animations/ArcView;"), new akdc(akde.a(AvatarView.class), "storyView", "getStoryView()Landroid/widget/ImageView;")};
    private final ajxe arcView$delegate;
    private AvatarRendererController rendererController;
    private final ajxe storyView$delegate;

    public AvatarView(Context context) {
        akcr.b(context, "context");
        this(context, null, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    public AvatarView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
        r4 = this;
        r0 = "customAttrs";
        r1 = "context";
        defpackage.akcr.b(r5, r1);
        r4.<init>(r5, r6, r7);
        r1 = new com.snap.ui.avatar.AvatarView$arcView$2;
        r1.<init>(r4);
        r1 = (defpackage.akbk) r1;
        r1 = defpackage.ajxh.a(r1);
        r4.arcView$delegate = r1;
        r1 = new com.snap.ui.avatar.AvatarView$storyView$2;
        r1.<init>(r4);
        r1 = (defpackage.akbk) r1;
        r1 = defpackage.ajxh.a(r1);
        r4.storyView$delegate = r1;
        r1 = 0;
        r4.setWillNotDraw(r1);
        r2 = 0;
        r5 = r5.getTheme();	 Catch:{ all -> 0x0051 }
        r3 = defpackage.fsw.a.a;	 Catch:{ all -> 0x0051 }
        r5 = r5.obtainStyledAttributes(r6, r3, r1, r7);	 Catch:{ all -> 0x0051 }
        r7 = "context.theme.obtainStyl….AvatarView, 0, defStyle)";
        defpackage.akcr.a(r5, r7);	 Catch:{ all -> 0x0051 }
        r7 = new com.snap.ui.avatar.ViewBasedAvatarRendererControllerFactory;	 Catch:{ all -> 0x004f }
        r7.<init>();	 Catch:{ all -> 0x004f }
        if (r5 != 0) goto L_0x0042;
    L_0x003f:
        defpackage.akcr.a(r0);	 Catch:{ all -> 0x004f }
    L_0x0042:
        r6 = r7.newController(r4, r6, r5);	 Catch:{ all -> 0x004f }
        r6.setup(r4);	 Catch:{ all -> 0x004f }
        r4.rendererController = r6;	 Catch:{ all -> 0x004f }
        r5.recycle();
        return;
    L_0x004f:
        r6 = move-exception;
        goto L_0x0053;
    L_0x0051:
        r6 = move-exception;
        r5 = r2;
    L_0x0053:
        if (r5 != 0) goto L_0x0058;
    L_0x0055:
        defpackage.akcr.a(r0);
    L_0x0058:
        r5.recycle();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.avatar.AvatarView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static final /* synthetic */ AvatarRendererController access$getRendererController$p(AvatarView avatarView) {
        AvatarRendererController avatarRendererController = avatarView.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        return avatarRendererController;
    }

    public static /* synthetic */ void arcView$annotations() {
    }

    public static /* synthetic */ void setAvatarInfo$default(AvatarView avatarView, Avatar avatar, FeedStoryInfo feedStoryInfo, boolean z, boolean z2, idl idl, int i, Object obj) {
        if ((i & 2) != 0) {
            feedStoryInfo = null;
        }
        avatarView.setAvatarInfo(avatar, feedStoryInfo, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, idl);
    }

    public static /* synthetic */ void setAvatarsInfo$default(AvatarView avatarView, List list, FeedStoryInfo feedStoryInfo, boolean z, boolean z2, idl idl, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ajyw.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            feedStoryInfo = null;
        }
        avatarView.setAvatarsInfo(list2, feedStoryInfo, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, idl);
    }

    public static /* synthetic */ void storyView$annotations() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.dispatchDraw(canvas);
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.draw(canvas);
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.draw(canvas);
    }

    public final ArcView getArcView() {
        return (ArcView) this.arcView$delegate.b();
    }

    public final ImageView getStoryView() {
        return (ImageView) this.storyView$delegate.b();
    }

    public final void hideCircle() {
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.hideCircle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.onMeasure();
    }

    public final void recycle() {
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.recycle();
    }

    public final void setAvatarInfo(Avatar avatar, FeedStoryInfo feedStoryInfo, boolean z, boolean z2, idl idl) {
        akcr.b(avatar, "avatar");
        akcr.b(idl, "uiPage");
        setAvatarsInfo(ajyl.a(avatar), feedStoryInfo, z, z2, idl);
    }

    public final void setAvatarsInfo(List<Avatar> list, FeedStoryInfo feedStoryInfo, boolean z, boolean z2, idl idl) {
        akcr.b(list, "avatars");
        akcr.b(idl, "uiPage");
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.setAvatarsInfo((List) list, feedStoryInfo, z, z2, idl);
    }

    public final void setAvatarsInfo(List<Avatar> list, boolean z, Drawable drawable, boolean z2, idl idl) {
        akcr.b(list, "avatars");
        akcr.b(idl, "uiPage");
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.setAvatarsInfo((List) list, z, drawable, z2, idl);
    }

    public final void setStoryThumbnailRequestListener(a aVar) {
        akcr.b(aVar, "requestListener");
        AvatarRendererController avatarRendererController = this.rendererController;
        if (avatarRendererController == null) {
            akcr.a("rendererController");
        }
        avatarRendererController.setStoryThumbnailRequestListener(aVar);
    }

    public final void superDispatchDraw$shared_ui_release(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.dispatchDraw(canvas);
    }
}
