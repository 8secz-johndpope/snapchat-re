package com.snap.messaging.chat.ui.viewbinding.delegate;

import android.net.Uri;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.messaging.chat.ui.view.VideoCapableThumbnailView;
import defpackage.akcr;
import defpackage.gcp;
import defpackage.gey;
import defpackage.k;
import defpackage.prl;
import defpackage.pvt;
import defpackage.qfd;
import defpackage.qhy;
import defpackage.qjb;
import defpackage.qjg;
import defpackage.qks;
import defpackage.qlv;
import defpackage.s;
import defpackage.zke;

public final class VideoCapableThumbnailController implements k, qjg {
    zke a;
    qks b;
    final qjb c;
    private Uri d;
    private gcp e;
    private final VideoCapableThumbnailView f;
    private final qfd g;

    public static final class a implements qhy {
        private /* synthetic */ VideoCapableThumbnailController a;

        a(VideoCapableThumbnailController videoCapableThumbnailController) {
            this.a = videoCapableThumbnailController;
        }

        public final void a(gey gey) {
            this.a.c.a(gey != null ? gey.c() : null);
        }

        public final void a(pvt pvt) {
            akcr.b(pvt, "uris");
            qks qks = this.a.b;
            if (qks != null) {
                qjb qjb = this.a.c;
                zke zke = this.a.a;
                if (zke == null) {
                    akcr.a("eventDispatcher");
                }
                qjb.b(qks, zke);
            }
        }
    }

    public VideoCapableThumbnailController(VideoCapableThumbnailView videoCapableThumbnailView, qjb qjb, qfd qfd) {
        akcr.b(videoCapableThumbnailView, "videoCapableThumbnailView");
        akcr.b(qjb, "loadingStateController");
        akcr.b(qfd, "bindingContext");
        this.f = videoCapableThumbnailView;
        this.c = qjb;
        this.g = qfd;
    }

    private final void a() {
        if (this.b != null && this.d != null && this.e != null) {
            this.f.a();
        }
    }

    private final void a(qks qks, Uri uri, gcp gcp) {
        this.f.a(uri, gcp, qks.o(), this.g, c());
    }

    private final a c() {
        return new a(this);
    }

    public final void a(qks qks, Uri uri, gcp gcp, Integer num, zke zke) {
        akcr.b(qks, MapboxEvent.KEY_MODEL);
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(gcp, "snapType");
        akcr.b(zke, "eventDispatcher");
        this.a = zke;
        qks qks2 = this.b;
        this.b = qks;
        this.d = uri;
        this.e = gcp;
        if (!(qks instanceof qlv) || (qks.h == prl.SUCCESS && !(qks2 != null && qks2.getId() == ((qlv) qks).getId() && qks2.h == qks.h))) {
            a(qks, uri, gcp);
        }
        this.g.m.a(this);
    }

    public final void b() {
        this.g.m.b(this);
        a();
        this.b = null;
        this.d = null;
        this.e = null;
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        qks qks = this.b;
        if (qks != null && this.d != null && this.e != null) {
            if (qks == null) {
                akcr.a();
            }
            Uri uri = this.d;
            if (uri == null) {
                akcr.a();
            }
            gcp gcp = this.e;
            if (gcp == null) {
                akcr.a();
            }
            a(qks, uri, gcp);
        }
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onStop() {
        a();
    }
}
