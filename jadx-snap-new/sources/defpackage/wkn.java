package defpackage;

import com.brightcove.player.media.ErrorFields;
import defpackage.wkm.b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wkn */
public final class wkn implements ajej, wkm {
    ajdx<List<abyi>> a;
    final ajei b;
    final ajws<tpk> c;
    ajdx<List<zub>> d;
    final b e;
    String f;
    ajdx<List<abyi>> g;
    tpl h;
    dnn i;
    final puk j;
    final pth k;
    final tob l;
    rhl m;
    final rgq n;
    final wjx o;
    final Boolean p;
    final gtt q;
    final tod r;
    final AtomicBoolean s;
    final String t;
    abll u;
    private final ajxe v;

    /* renamed from: wkn$a */
    public static final class a implements defpackage.wkm.a {
        private String a;
        private b b = b.EDIT_AND_SEND_TO;
        private rhl c = new rhl(ajyw.a, null, null, false, null, 126);
        private ajdx<List<abyi>> d;
        private ajdx<List<abyi>> e;
        private rgq f;
        private ebp g;
        private tob h;
        private wjx i;
        private Boolean j;
        private dpv k;
        private gtt l;
        private tod m;
        private dnq n;
        private final puk o;
        private final pth p;

        public a(puk puk, pth pth) {
            puk puk2 = puk;
            pth pth2 = pth;
            akcr.b(puk2, ErrorFields.MESSAGE);
            akcr.b(pth2, "messageAnalytics");
            this.o = puk2;
            this.p = pth2;
            Object b = ajdx.b((Object) ajyw.a);
            String str = "Single.just(emptyList())";
            akcr.a(b, str);
            this.d = b;
            b = ajdx.b((Object) ajyw.a);
            akcr.a(b, str);
            this.e = b;
            this.f = new rgq(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, false, false, false, null, false, false, false, -1, 1);
            this.h = new tob(null, null, false, 31);
            this.n = defpackage.dnq.a.a;
        }

        public final defpackage.wkm.a a() {
            this.j = Boolean.TRUE;
            return this;
        }

        public final defpackage.wkm.a a(ajdx<List<abyi>> ajdx) {
            akcr.b(ajdx, "media");
            this.d = ajdx;
            this.e = ajdx;
            return this;
        }

        public final defpackage.wkm.a a(dnq dnq) {
            akcr.b(dnq, "cameraLoadingOverlay");
            this.n = dnq;
            return this;
        }

        public final defpackage.wkm.a a(dpv dpv) {
            this.k = dpv;
            return this;
        }

        public final defpackage.wkm.a a(ebp ebp) {
            akcr.b(ebp, "mediaTypeConfig");
            this.g = ebp;
            return this;
        }

        public final defpackage.wkm.a a(gtt gtt) {
            this.l = gtt;
            return this;
        }

        public final defpackage.wkm.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.wkm.a a(rgq rgq) {
            akcr.b(rgq, "sendToConfig");
            this.f = rgq;
            return this;
        }

        public final defpackage.wkm.a a(rhl rhl) {
            akcr.b(rhl, "sendToData");
            this.c = rhl;
            return this;
        }

        public final defpackage.wkm.a a(tob tob) {
            akcr.b(tob, "previewAnalytics");
            this.h = tob;
            return this;
        }

        public final defpackage.wkm.a a(tod tod) {
            akcr.b(tod, "previewFlavor");
            this.m = tod;
            return this;
        }

        public final defpackage.wkm.a a(wjx wjx) {
            akcr.b(wjx, "destination");
            this.i = wjx;
            return this;
        }

        public final defpackage.wkm.a a(b bVar) {
            akcr.b(bVar, "type");
            this.b = bVar;
            return this;
        }

        public final defpackage.wkm.a b(ajdx<List<abyi>> ajdx) {
            akcr.b(ajdx, "previewMedia");
            this.e = ajdx;
            return this;
        }

        public final wkm b() {
            tpl a;
            if (this.b == b.EDIT_AND_SEND_TO) {
                tod tod = this.m;
                if (tod != null) {
                    ebp ebp = this.g;
                    if (ebp == null) {
                        akcr.a();
                    }
                    a = defpackage.tpl.a.a(ebp, tod);
                } else {
                    ebp ebp2 = this.g;
                    if (ebp2 == null) {
                        akcr.a();
                    }
                    gcn gcn = this.p.a;
                    akcr.b(ebp2, "mediaTypeConfig");
                    akcr.b(gcn, "source");
                    int i = tpm.b[gcn.sourceType.ordinal()];
                    tod tod2 = (i == 1 || i == 2) ? tod.GALLERY : i != 3 ? i != 4 ? tod.MAIN : tod.FEED : tod.DISCOVER;
                    a = defpackage.tpl.a.a(ebp2, tod2);
                }
            } else {
                a = null;
            }
            return new wkn(this.b, this.a, this.d, this.e, a, new dnn(this.a, this.k, false, this.n), this.o, this.p, this.h, this.c, this.f, this.i, this.j, this.l, this.m);
        }
    }

    /* renamed from: wkn$b */
    static final class b extends akcs implements akbk<idd> {
        private /* synthetic */ wkn a;

        b(wkn wkn) {
            this.a = wkn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return pry.a.callsite(this.a.k.a.sourceType.toString());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wkn.class), "caller", "getCaller()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public /* synthetic */ wkn(b bVar, String str, ajdx ajdx, ajdx ajdx2, tpl tpl, dnn dnn, puk puk, pth pth, tob tob, rhl rhl, rgq rgq, wjx wjx, Boolean bool, gtt gtt, tod tod) {
        b bVar2 = bVar;
        String str2 = str;
        ajdx ajdx3 = ajdx;
        ajdx ajdx4 = ajdx2;
        tpl tpl2 = tpl;
        dnn dnn2 = dnn;
        puk puk2 = puk;
        pth pth2 = pth;
        tob tob2 = tob;
        rhl rhl2 = rhl;
        rgq rgq2 = rgq;
        wjx wjx2 = wjx;
        Boolean bool2 = bool;
        gtt gtt2 = gtt;
        tod tod2 = tod;
        AtomicBoolean atomicBoolean = r0;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        Object uuid = iig.a().toString();
        String str3 = uuid;
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        this(bVar, str2, ajdx3, ajdx4, tpl2, dnn2, puk2, pth2, tob2, rhl2, rgq2, wjx2, bool2, gtt2, tod2, atomicBoolean, str3);
    }

    private wkn(b bVar, String str, ajdx<List<abyi>> ajdx, ajdx<List<abyi>> ajdx2, tpl tpl, dnn dnn, puk puk, pth pth, tob tob, rhl rhl, rgq rgq, wjx wjx, Boolean bool, gtt gtt, tod tod, AtomicBoolean atomicBoolean, String str2) {
        b bVar2 = bVar;
        ajdx<List<abyi>> ajdx3 = ajdx;
        ajdx<List<abyi>> ajdx4 = ajdx2;
        dnn dnn2 = dnn;
        puk puk2 = puk;
        pth pth2 = pth;
        tob tob2 = tob;
        rhl rhl2 = rhl;
        rgq rgq2 = rgq;
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        String str3 = str2;
        akcr.b(bVar, "type");
        akcr.b(ajdx3, "initialMedia");
        akcr.b(ajdx4, "sendToPreviewMedia");
        akcr.b(dnn2, "cameraStartUpConfig");
        akcr.b(puk2, "messageContent");
        akcr.b(pth2, "messageAnalytics");
        akcr.b(tob2, "previewAnalytics");
        akcr.b(rhl2, "sendToData");
        akcr.b(rgq2, "sendToConfig");
        akcr.b(atomicBoolean2, "sending");
        akcr.b(str3, "sessionId");
        this.e = bVar2;
        this.f = str;
        this.g = ajdx4;
        this.h = tpl;
        this.i = dnn2;
        this.j = puk2;
        this.k = pth2;
        this.l = tob2;
        this.m = rhl2;
        this.n = rgq2;
        this.o = wjx;
        this.p = bool;
        this.q = gtt;
        this.r = tod;
        this.s = atomicBoolean2;
        this.t = str3;
        this.u = null;
        this.a = ajdx3;
        this.b = new ajei();
        List emptyList = Collections.emptyList();
        akcr.a((Object) emptyList, "Collections.emptyList()");
        Object i = ajwl.i(new tpk(emptyList, null, null, null, 0, 0, false, false, 1022));
        akcr.a(i, "BehaviorSubject.createDe…Collections.emptyList()))");
        this.c = (ajws) i;
        this.v = ajxh.a(new b(this));
    }

    public final idd a() {
        return (idd) this.v.b();
    }

    public final void a(ajdx<List<abyi>> ajdx) {
        akcr.b(ajdx, "value");
        this.a = ajdx;
        this.g = ajdx;
    }

    public final void a(rhl rhl) {
        akcr.b(rhl, "<set-?>");
        this.m = rhl;
    }

    public final void dispose() {
        ajdx b = ajdx.b((Object) ajyw.a);
        String str = "Single.just(emptyList())";
        akcr.a((Object) b, str);
        a(b);
        Object b2 = ajdx.b((Object) ajyw.a);
        akcr.a(b2, str);
        this.g = b2;
        this.m = new rhl(ajyw.a, null, null, false, null, 126);
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }
}
