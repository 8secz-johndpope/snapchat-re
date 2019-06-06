package com.snap.stickers.content;

import com.snap.core.db.record.StorySyncStateModel;
import com.snap.stickers.net.StickerHttpInterface;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akhw;
import defpackage.akws;
import defpackage.gqr;
import defpackage.gqt;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.hwm;
import defpackage.ide;
import defpackage.xsd;
import defpackage.xso;
import defpackage.xsq;
import defpackage.zfw;
import defpackage.zgb;

@hwk(a = "DELETE_CUSTOM_STICKERS", b = xsq.class)
public final class DeleteCustomStickersJob extends hwg<xsq> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements hwm<DeleteCustomStickersJob, akws<akhw>> {
        final ajxe a;
        private final zfw b = zgb.a(xsd.a.callsite("DeleteCustomStickersJobProcessor"));
        private final aipn<StickerHttpInterface> c;

        static final class a<T> implements ajfb<Throwable> {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (Throwable) obj;
                gqr gqr = (gqr) this.a.a.b();
                gqt gqt = gqt.HIGH;
                akcr.a(obj, "it");
                gqr.a(gqt, obj, xsd.a.callsite("DeleteCustomStickersJobProcessor"));
            }
        }

        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akws akws = (akws) obj;
                akcr.b(akws, "result");
                if (akws.e()) {
                    return akws;
                }
                throw new Exception("failed to upload");
            }
        }

        static final class c extends akcq implements akbk<gqr> {
            c(aipn aipn) {
                super(0, aipn);
            }

            public final String getName() {
                return "get";
            }

            public final akej getOwner() {
                return akde.a(aipn.class);
            }

            public final String getSignature() {
                return "get()Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke() {
                return (gqr) ((aipn) this.receiver).get();
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(b.class), "tracker", "getTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;");
        }

        public b(zgb zgb, aipn<StickerHttpInterface> aipn, aipn<gqr> aipn2) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(aipn, "httpInterface");
            akcr.b(aipn2, "exceptionTracker");
            this.c = aipn;
            this.a = ajxh.a(new c(aipn2));
        }

        public final void a(String str) {
            String str2 = "uuid";
            akcr.b(str, str2);
            akcr.b(str, str2);
        }

        public final void a(String str, Integer num) {
            String str2 = "uuid";
            akcr.b(str, str2);
            akcr.b(str, str2);
        }

        public final boolean a(Throwable th) {
            String str = "throwable";
            akcr.b(th, str);
            akcr.b(th, str);
            return false;
        }

        public final /* bridge */ /* synthetic */ void b(hwg hwg) {
            DeleteCustomStickersJob deleteCustomStickersJob = (DeleteCustomStickersJob) hwg;
            String str = "durableJob";
            akcr.b(deleteCustomStickersJob, str);
            akcr.b(deleteCustomStickersJob, str);
        }

        public final /* synthetic */ ajcx c(hwg hwg) {
            DeleteCustomStickersJob deleteCustomStickersJob = (DeleteCustomStickersJob) hwg;
            akcr.b(deleteCustomStickersJob, "durableJob");
            return defpackage.hwm.a.a(deleteCustomStickersJob);
        }

        public final /* bridge */ /* synthetic */ ide c() {
            return xsd.a;
        }

        public final void d() {
        }

        public final /* synthetic */ void d(hwg hwg) {
            DeleteCustomStickersJob deleteCustomStickersJob = (DeleteCustomStickersJob) hwg;
            String str = "durableJob";
            akcr.b(deleteCustomStickersJob, str);
            akcr.b(deleteCustomStickersJob, str);
        }

        public final /* synthetic */ ajcx e(hwg hwg) {
            DeleteCustomStickersJob deleteCustomStickersJob = (DeleteCustomStickersJob) hwg;
            akcr.b(deleteCustomStickersJob, "durableJob");
            return defpackage.hwm.a.b(deleteCustomStickersJob);
        }
    }

    static {
        a aVar = new a();
    }

    public DeleteCustomStickersJob(hwh hwh, xsq xsq) {
        akcr.b(hwh, "jobConfig");
        akcr.b(xsq, StorySyncStateModel.METADATA);
        super(hwh, xsq);
    }

    public /* synthetic */ DeleteCustomStickersJob(xsq xsq) {
        this(xso.a, xsq);
    }
}
