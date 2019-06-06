package com.brightcove.player.controller;

import com.brightcove.player.event.EventEmitter;

public class ExoPlayerSourceSelectionController extends DefaultSourceSelectionController {
    public ExoPlayerSourceSelectionController(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    public com.brightcove.player.model.Source selectSource(com.brightcove.player.model.Video r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0043;
    L_0x0002:
        r0 = r3.getSourceCollections();
        if (r0 == 0) goto L_0x003d;
    L_0x0008:
        r1 = r0.size();
        if (r1 == 0) goto L_0x003d;
    L_0x000e:
        r1 = com.brightcove.player.media.DeliveryType.DASH;
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x0035;
    L_0x0016:
        r1 = com.brightcove.player.media.DeliveryType.DASH;
        r0 = r0.get(r1);
        r0 = (com.brightcove.player.model.SourceCollection) r0;
        r0 = r0.getSources();
        if (r0 == 0) goto L_0x0035;
    L_0x0024:
        r1 = r0.size();
        if (r1 <= 0) goto L_0x0035;
    L_0x002a:
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (com.brightcove.player.model.Source) r0;
        goto L_0x0036;
    L_0x0035:
        r0 = 0;
    L_0x0036:
        if (r0 != 0) goto L_0x003c;
    L_0x0038:
        r0 = super.selectSource(r3);
    L_0x003c:
        return r0;
    L_0x003d:
        r3 = new com.brightcove.player.controller.NoSourceFoundException;
        r3.<init>();
        throw r3;
    L_0x0043:
        r3 = new java.lang.IllegalArgumentException;
        r0 = "videoRequired";
        r0 = com.brightcove.player.util.ErrorUtil.getMessage(r0);
        r3.<init>(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.controller.ExoPlayerSourceSelectionController.selectSource(com.brightcove.player.model.Video):com.brightcove.player.model.Source");
    }
}
