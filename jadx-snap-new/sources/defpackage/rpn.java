package defpackage;

import android.provider.Settings.System;
import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rpn */
final class rpn extends rpp {
    private final ajxe f;
    private final ajxe g = ajxh.a(new a(this));

    /* renamed from: rpn$b */
    static final class b extends akcs implements akbk<rqi> {
        private /* synthetic */ rpn a;
        private /* synthetic */ defpackage.rpy.b b;

        b(rpn rpn, defpackage.rpy.b bVar) {
            this.a = rpn;
            this.b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new rqi(this.a.j(), this.b);
        }
    }

    /* renamed from: rpn$a */
    static final class a extends akcs implements akbk<Integer> {
        private /* synthetic */ rpn a;

        a(rpn rpn) {
            this.a = rpn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(rpx.a(this.a.j()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rpn.class), "volumeObserver", "getVolumeObserver()Lcom/snap/messaging/talk/binding/audio/VolumeObserver;"), new akdc(akde.a(rpn.class), "minVolume", "getMinVolume()I")};
    }

    public rpn(b bVar) {
        akcr.b(bVar, "delegate");
        super(3, 0, bVar);
        this.f = ajxh.a(new b(this, bVar));
    }

    private rqi m() {
        return (rqi) this.f.b();
    }

    public final String a() {
        return "COGNAC_VOICE";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.d() && aVar.c();
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        int streamVolume = j().getStreamVolume(3);
        boolean z = false;
        j().setStreamVolume(0, streamVolume, 0);
        b bVar = this.b;
        if (streamVolume <= ((Number) this.g.b()).intValue()) {
            z = true;
        }
        bVar.b(z);
        this.b.b().getContentResolver().registerContentObserver(System.CONTENT_URI, true, m());
        super.c();
    }

    public final void d() {
        super.d();
        this.b.b().getContentResolver().unregisterContentObserver(m());
    }
}
