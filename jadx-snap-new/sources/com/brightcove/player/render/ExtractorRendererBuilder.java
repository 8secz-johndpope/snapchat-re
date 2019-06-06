package com.brightcove.player.render;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent.RendererBuilderCallback;
import defpackage.bcd;
import defpackage.bce;
import defpackage.bch;
import defpackage.bcm;
import defpackage.bcq;
import defpackage.bcs;
import defpackage.ber;
import defpackage.beu;
import defpackage.bii;
import defpackage.bjj;
import defpackage.bjo;
import defpackage.bjp;
import defpackage.bjq;
import defpackage.bjr;
import defpackage.bjw;
import defpackage.bjx;
import java.util.Map;
import java.util.Map.Entry;

public class ExtractorRendererBuilder extends AbstractRendererBuilder {
    private final Context a;
    private final String b;
    private final Uri c;
    private final Map<String, String> d;

    static {
        ExtractorRendererBuilder.class.getSimpleName();
    }

    public ExtractorRendererBuilder(Context context, String str, Uri uri, Map<String, String> map) {
        this.a = context;
        this.b = str;
        this.c = uri;
        this.d = map;
    }

    public void buildRenderers(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, RendererBuilderCallback rendererBuilderCallback) {
        ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent2 = exoPlayerVideoDisplayComponent;
        bjo bjo = new bjo();
        Handler mainHandler = exoPlayerVideoDisplayComponent.getMainHandler();
        bjj bandwidthMeter = exoPlayerVideoDisplayComponent.getBandwidthMeter();
        if (bandwidthMeter == null) {
            bandwidthMeter = new bjp(mainHandler, exoPlayerVideoDisplayComponent2);
        }
        bjw bjw = bandwidthMeter;
        bjx bjq = new bjq(this.b, bjw, b(), a());
        Map map = this.d;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                bjq.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Handler handler = mainHandler;
        ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent3 = exoPlayerVideoDisplayComponent;
        bch bch = new bch(this.a, new beu(this.c, new bjr(this.a, bjw, bjq), bjo, new ber[0]), bce.a, handler, exoPlayerVideoDisplayComponent3);
        bcd bcd = new bcd(new bcm[]{r11}, bce.a, null, handler, exoPlayerVideoDisplayComponent3, bcs.a(this.a));
        bii bii = new bii(new bcm[]{r11}, exoPlayerVideoDisplayComponent2, mainHandler.getLooper());
        bcq[] bcqArr = new bcq[4];
        bcqArr[0] = bch;
        bcqArr[1] = bcd;
        bcqArr[2] = bii;
        rendererBuilderCallback.onRenderers(bcqArr, bjw);
    }

    public void cancel() {
    }
}
