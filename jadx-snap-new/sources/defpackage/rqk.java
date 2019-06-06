package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import defpackage.abjd.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rqk */
public final class rqk implements abjd {
    final ecu a = rqk.a(true, 1000000000);
    rql b;
    abje c = abje.FRONT_FACING;
    boolean d;
    final dqg e;
    private final ajxe f;
    private final ajxe g = ajxh.a(b.a);
    private final abpx<a> h = new abpx();
    private final ecu i = rqk.a(false, 24);
    private final ecu j = rqk.a(false, 15);
    private final Map<abjx, rql> k = new ConcurrentHashMap();
    private int l;
    private final rqs m;
    private final dqi n;

    /* renamed from: rqk$b */
    static final class b extends akcs implements akbk<dom> {
        public static final b a = new b();

        /* renamed from: rqk$b$1 */
        static final class 1 implements dom {
            public static final 1 a = new 1();

            1() {
            }

            public final void onAutoFocus(boolean z, dpp dpp) {
            }
        }

        b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return 1.a;
        }
    }

    /* renamed from: rqk$c */
    static final class c extends akcs implements akbk<abus> {
        private /* synthetic */ rqk a;
        private /* synthetic */ Context b;

        c(rqk rqk, Context context) {
            this.a = rqk;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abus abus = new abus(this.b);
            abus.a(new a());
            return abus;
        }
    }

    /* renamed from: rqk$a */
    final class a extends abvo {

        /* renamed from: rqk$a$a */
        static final class a extends akcq implements akbk<Boolean> {
            a(rqk rqk) {
                super(0, rqk);
            }

            public final String getName() {
                return "isCameraStarted";
            }

            public final akej getOwner() {
                return akde.a(rqk.class);
            }

            public final String getSignature() {
                return "isCameraStarted()Z";
            }

            public final /* synthetic */ Object invoke() {
                return Boolean.valueOf(((rqk) this.receiver).d);
            }
        }

        private final void a(SurfaceTexture surfaceTexture) {
            rqk rqk = rqk.this;
            rqk.b = new rql(rqk.e, (akbk) new a(rqk.this), surfaceTexture, rqk.this.a);
            rql rql = rqk.this.b;
            if (rql != null) {
                rql.a(rqk.this.c);
            }
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (rqk.this.b == null) {
                a(surfaceTexture);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            rql rql = rqk.this.b;
            if (rql != null) {
                rql.a(rqp.UNREGISTER_DISPOSE);
                rqk.this.b = null;
            }
            return false;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (rqk.this.d) {
                rql rql = rqk.this.b;
                if (rql != null) {
                    rql.a(rqp.UNREGISTER);
                    a(surfaceTexture);
                }
            }
        }
    }

    /* renamed from: rqk$d */
    static final class d extends akcq implements akbk<Boolean> {
        d(rqk rqk) {
            super(0, rqk);
        }

        public final String getName() {
            return "isCameraStarted";
        }

        public final akej getOwner() {
            return akde.a(rqk.class);
        }

        public final String getSignature() {
            return "isCameraStarted()Z";
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((rqk) this.receiver).d);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rqk.class), "previewView", "getPreviewView()Lcom/snapchat/android/framework/ui/views/MultiListenerTextureView;"), new akdc(akde.a(rqk.class), "noopAutofocusCallback", "getNoopAutofocusCallback()Lcom/snap/camera/api/callback/AutoFocusCallback;")};
    }

    public rqk(Context context, rqs rqs, dqg dqg, dqi dqi) {
        akcr.b(context, "context");
        akcr.b(rqs, "codecConfig");
        akcr.b(dqg, "cameraFrameProvider");
        akcr.b(dqi, "cameraFunctionProvider");
        this.m = rqs;
        this.e = dqg;
        this.n = dqi;
        this.f = ajxh.a(new c(this, context));
    }

    private static ecu a(boolean z, int i) {
        return new ecu(z ? ecw.VIDEO_CHAT_PREVIEW : ecw.CUSTOM, i, 3, true, (dpn) new rqo(), false, false);
    }

    private final void a(rqp rqp) {
        rql rql = this.b;
        if (rql != null) {
            rql.a(rqp.UNREGISTER);
        }
        Iterable<rql> values = this.k.values();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) values, 10));
        for (rql add : values) {
            arrayList.add(add);
        }
        for (rql a : (List) arrayList) {
            a.a(rqp);
        }
    }

    private final void a(boolean z) {
        for (a softwareEncoderStatusChanged : this.h) {
            softwareEncoderStatusChanged.softwareEncoderStatusChanged(z);
        }
    }

    private final void b(abje abje) {
        if (this.d) {
            rql rql = this.b;
            if (rql != null) {
                rql.a(abje);
            }
            for (rql a : this.k.values()) {
                a.a(abje);
            }
        }
    }

    public final void a() {
        acbm.d().a("MessagingCameraServices");
        this.d = true;
        b(this.c);
    }

    public final void a(float f, float f2) {
        this.n.a((dom) this.g.b(), (int) f, (int) f2, c().getWidth(), c().getHeight());
    }

    public final void a(a aVar) {
        akcr.b(aVar, "listener");
        this.h.c(aVar);
    }

    public final void a(abje abje) {
        akcr.b(abje, "cameraType");
        if (abje != this.c) {
            this.c = abje;
            if (this.d) {
                a(rqp.UNREGISTER_RESET);
                b(abje);
            }
        }
    }

    public final void a(abjx abjx) {
        akcr.b(abjx, "receiver");
        if (!this.k.containsKey(abjx)) {
            boolean a = abjx.a().a();
            this.k.put(abjx, new rql(this.e, (akbk) new d(this), abjx, a ? this.j : this.i));
            b(this.c);
            if (a) {
                if (this.l == 0) {
                    a(true);
                }
                this.l++;
            }
        }
    }

    public final boolean a(String str, boolean z) {
        String str2 = "mime";
        akcr.b(str, str2);
        rqs rqs = this.m;
        akcr.b(str, str2);
        str = (String) ajyu.i(new akfr("[/\\.-]").a((CharSequence) str, 0));
        if (str == null) {
            str = null;
        } else if (str != null) {
            str = str.toLowerCase();
            akcr.a((Object) str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        }
        if (str != null) {
            dnd dnd;
            int hashCode = str.hashCode();
            if (hashCode != 96974) {
                if (hashCode != 116926) {
                    if (hashCode == 3199082 && str.equals("hevc")) {
                        dnd = dnd.VIDEOCHAT_HW_HEVC;
                    }
                } else if (str.equals("vp8")) {
                    dnd = dnd.VIDEOCHAT_HW_VP8;
                }
            } else if (str.equals("avc")) {
                dnd = dnd.VIDEOCHAT_HW_AVC;
            }
            if (((z ? 2 : 1) & rqs.a.h(dnd)) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        acbm.d().a("MessagingCameraServices");
        this.d = false;
        a(rqp.UNREGISTER);
    }

    public final void b(a aVar) {
        akcr.b(aVar, "listener");
        this.h.d(aVar);
    }

    public final void b(abjx abjx) {
        akcr.b(abjx, "receiver");
        if (this.k.containsKey(abjx)) {
            rql rql = (rql) this.k.get(abjx);
            if (rql != null) {
                rql.a(rqp.UNREGISTER_DISPOSE);
            }
            this.k.remove(abjx);
            if (abjx.a().a()) {
                if (this.l == 1) {
                    a(false);
                }
                this.l--;
            }
        }
    }

    public final abus c() {
        return (abus) this.f.b();
    }

    public final abje d() {
        return this.c;
    }

    public final boolean e() {
        dpp a = this.n.a();
        if (a != null) {
            List b = a.b();
            if (b != null && b.contains(ecd.AUTO)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.l > 0;
    }
}
