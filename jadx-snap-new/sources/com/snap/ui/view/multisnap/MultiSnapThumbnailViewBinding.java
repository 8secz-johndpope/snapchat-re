package com.snap.ui.view.multisnap;

import android.view.View;
import defpackage.akcr;
import defpackage.zmd;

public final class MultiSnapThumbnailViewBinding extends zmd<MultiSnapThumbnailViewModel> {
    private MultiSnapThumbnailView thumbnailView;

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARNING: Missing block: B:31:0x0081, code skipped:
            if (r0 == r3.size()) goto L_0x00b7;
     */
    public final void onBind(com.snap.ui.view.multisnap.MultiSnapThumbnailViewModel r7, com.snap.ui.view.multisnap.MultiSnapThumbnailViewModel r8) {
        /*
        r6 = this;
        r0 = "model";
        defpackage.akcr.b(r7, r0);
        r0 = r7.isDisposed();
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r6.thumbnailView;
        r1 = "thumbnailView";
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        defpackage.akcr.a(r1);
    L_0x0015:
        r2 = r7.getStartTimestampMs();
        r0.setStartingTimestamp(r2);
        r0 = r7.getEndTimestampMs();
        r2 = 1;
        if (r0 == 0) goto L_0x0042;
    L_0x0023:
        if (r8 == 0) goto L_0x0034;
    L_0x0025:
        r0 = r8.getEndTimestampMs();
        r3 = r7.getEndTimestampMs();
        r0 = defpackage.akcr.a(r0, r3);
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x0042;
    L_0x0034:
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x003b;
    L_0x0038:
        defpackage.akcr.a(r1);
    L_0x003b:
        r3 = r7.getEndTimestampMs();
        r0.setEndingTimestamp(r3);
    L_0x0042:
        r0 = r7.getSegmentKey();
        if (r0 == 0) goto L_0x0067;
    L_0x0048:
        if (r8 == 0) goto L_0x0059;
    L_0x004a:
        r0 = r8.getSegmentKey();
        r3 = r7.getSegmentKey();
        r0 = defpackage.akcr.a(r0, r3);
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x0067;
    L_0x0059:
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0060;
    L_0x005d:
        defpackage.akcr.a(r1);
    L_0x0060:
        r3 = r7.getSegmentKey();
        r0.setSegmentKey(r3);
    L_0x0067:
        r0 = r7.getPlayheadPresenter();
        if (r0 != 0) goto L_0x00b7;
    L_0x006d:
        r0 = r7.getBaseBitmaps();
        r0 = r0.size();
        if (r8 == 0) goto L_0x0083;
    L_0x0077:
        r3 = r8.getBaseBitmaps();
        if (r3 == 0) goto L_0x0083;
    L_0x007d:
        r3 = r3.size();
        if (r0 == r3) goto L_0x00b7;
    L_0x0083:
        r0 = r7.getBaseBitmaps();
        r0 = r0.lastKey();
        r0 = (java.lang.Integer) r0;
        r3 = r7.getBaseBitmaps();
        r0 = r3.get(r0);
        r0 = (defpackage.kaz) r0;
        if (r0 == 0) goto L_0x00fd;
    L_0x0099:
        r3 = r6.thumbnailView;
        if (r3 != 0) goto L_0x00a0;
    L_0x009d:
        defpackage.akcr.a(r1);
    L_0x00a0:
        r4 = r7.getBaseBitmaps();
        r4 = r4.lastKey();
        r5 = "model.baseBitmaps.lastKey()";
        defpackage.akcr.a(r4, r5);
        r4 = (java.lang.Number) r4;
        r4 = r4.intValue();
        r3.load(r4, r0, r2);
        goto L_0x00fd;
    L_0x00b7:
        r0 = r7.getPlayheadPresenter();
        if (r0 == 0) goto L_0x00fd;
    L_0x00bd:
        r0 = r7.getBaseBitmaps();
        r0 = (java.util.Map) r0;
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x00cb:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x00fd;
    L_0x00d1:
        r2 = r0.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r6.thumbnailView;
        if (r3 != 0) goto L_0x00de;
    L_0x00db:
        defpackage.akcr.a(r1);
    L_0x00de:
        r4 = r2.getKey();
        r5 = "item.key";
        defpackage.akcr.a(r4, r5);
        r4 = (java.lang.Number) r4;
        r4 = r4.intValue();
        r2 = r2.getValue();
        r5 = "item.value";
        defpackage.akcr.a(r2, r5);
        r2 = (defpackage.kaz) r2;
        r5 = 0;
        r3.load(r4, r2, r5);
        goto L_0x00cb;
    L_0x00fd:
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0104;
    L_0x0101:
        defpackage.akcr.a(r1);
    L_0x0104:
        r2 = r7.getTrimStartTimestampMs();
        r3 = r7.getTrimEndTimestampMs();
        r0.setTrimmingTimestamps(r2, r3);
        r0 = r7.getComposingOperation();
        if (r0 == 0) goto L_0x011f;
    L_0x0115:
        r2 = r6.thumbnailView;
        if (r2 != 0) goto L_0x011c;
    L_0x0119:
        defpackage.akcr.a(r1);
    L_0x011c:
        r2.updateThumbnailComposingOperation(r0);
    L_0x011f:
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0126;
    L_0x0123:
        defpackage.akcr.a(r1);
    L_0x0126:
        r2 = r7.isDeletionEnabled();
        r0.setDeletionEnabled(r2);
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0134;
    L_0x0131:
        defpackage.akcr.a(r1);
    L_0x0134:
        r2 = r7.isSplitEnabled();
        r0.setSplitEnabled(r2);
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0142;
    L_0x013f:
        defpackage.akcr.a(r1);
    L_0x0142:
        r2 = r7.isImage();
        r0.setImage(r2);
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0150;
    L_0x014d:
        defpackage.akcr.a(r1);
    L_0x0150:
        r2 = r7.getDisplayMode();
        r0.updateViewState(r2);
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x015e;
    L_0x015b:
        defpackage.akcr.a(r1);
    L_0x015e:
        r2 = new com.snap.ui.view.multisnap.MultiSnapThumbnailViewBinding$onBind$3;
        r2.<init>(r6);
        r2 = (com.snap.ui.view.multisnap.ThumbnailDeletedListener) r2;
        r0.setThumbnailDeletedListener(r2);
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x016f;
    L_0x016c:
        defpackage.akcr.a(r1);
    L_0x016f:
        r2 = new com.snap.ui.view.multisnap.MultiSnapThumbnailViewBinding$onBind$4;
        r2.<init>(r6);
        r2 = (defpackage.akca) r2;
        r0.setThumbnailViewTrimmingListener(r2);
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x0180;
    L_0x017d:
        defpackage.akcr.a(r1);
    L_0x0180:
        r2 = r7.getTrimmingListener();
        r0.setTrimmingListener(r2);
        if (r8 == 0) goto L_0x018e;
    L_0x0189:
        r0 = r8.getPlayheadPresenter();
        goto L_0x018f;
    L_0x018e:
        r0 = 0;
    L_0x018f:
        r2 = r7.getPlayheadPresenter();
        if (r0 == r2) goto L_0x01ba;
    L_0x0195:
        if (r8 == 0) goto L_0x01a0;
    L_0x0197:
        r8 = r8.getPlayheadPresenter();
        if (r8 == 0) goto L_0x01a0;
    L_0x019d:
        r8.dropTarget();
    L_0x01a0:
        r8 = r7.getPlayheadPresenter();
        if (r8 == 0) goto L_0x01ba;
    L_0x01a6:
        r0 = r6.thumbnailView;
        if (r0 != 0) goto L_0x01ad;
    L_0x01aa:
        defpackage.akcr.a(r1);
    L_0x01ad:
        r8.takeTarget(r0);
        r0 = new com.snap.ui.view.multisnap.MultiSnapThumbnailViewBinding$onBind$$inlined$let$lambda$1;
        r0.<init>(r6);
        r0 = (defpackage.akbw) r0;
        r8.setThumbnailSplitListener(r0);
    L_0x01ba:
        r8 = r6.thumbnailView;
        if (r8 != 0) goto L_0x01c1;
    L_0x01be:
        defpackage.akcr.a(r1);
    L_0x01c1:
        r0 = new com.snap.ui.view.multisnap.MultiSnapThumbnailViewBinding$onBind$6;
        r0.<init>(r6, r7);
        r0 = (android.view.View.OnTouchListener) r0;
        r8.setOnTouchListener(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.MultiSnapThumbnailViewBinding.onBind(com.snap.ui.view.multisnap.MultiSnapThumbnailViewModel, com.snap.ui.view.multisnap.MultiSnapThumbnailViewModel):void");
    }

    public final void onCreate(View view) {
        akcr.b(view, "itemView");
        this.thumbnailView = (MultiSnapThumbnailView) view;
    }

    public final void onRecycle() {
        super.onRecycle();
        MultiSnapThumbnailView multiSnapThumbnailView = this.thumbnailView;
        if (multiSnapThumbnailView == null) {
            akcr.a("thumbnailView");
        }
        multiSnapThumbnailView.recycle();
    }
}
