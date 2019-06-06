package com.brightcove.player.render;

import android.content.Context;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent.RendererBuilderCallback;
import defpackage.bhk;
import defpackage.bhl;
import defpackage.bjq;
import defpackage.bjr;
import defpackage.bjx;
import defpackage.bkh;
import defpackage.bkh.b;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class HLSRendererBuilder extends AbstractRendererBuilder {
    private final Context a;
    private final String b;
    private final String c;
    private final Map<String, String> d;
    private a e;

    final class a implements b<bhk> {
        final ExoPlayerVideoDisplayComponent a;
        final bkh<bhk> b;
        boolean c;
        private final Context d;
        private final String e;
        private final String f;
        private final Map<String, String> g;
        private final RendererBuilderCallback h;

        public a(Context context, String str, String str2, Map<String, String> map, ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, RendererBuilderCallback rendererBuilderCallback) {
            this.d = context;
            this.e = str;
            this.f = str2;
            this.g = map;
            this.a = exoPlayerVideoDisplayComponent;
            this.h = rendererBuilderCallback;
            bjx bjq = new bjq(str, null, HLSRendererBuilder.this.b(), HLSRendererBuilder.this.a());
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    bjq.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            this.b = new bkh(str2, new bjr(context, null, bjq), new bhl());
        }

        public final void a(IOException iOException) {
            if (!this.c) {
                this.h.onRenderersError(iOException);
            }
        }
    }

    static {
        HLSRendererBuilder.class.getSimpleName();
    }

    public HLSRendererBuilder(Context context, String str, String str2, Map<String, String> map) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public void buildRenderers(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, RendererBuilderCallback rendererBuilderCallback) {
        this.e = new a(this.a, this.b, this.c, this.d, exoPlayerVideoDisplayComponent, rendererBuilderCallback);
        b bVar = this.e;
        bVar.b.a(bVar.a.getMainHandler().getLooper(), bVar);
    }

    public void cancel() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.c = true;
            this.e = null;
        }
    }
}
