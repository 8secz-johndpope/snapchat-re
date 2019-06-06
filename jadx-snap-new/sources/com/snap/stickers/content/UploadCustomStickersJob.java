package com.snap.stickers.content;

import com.snap.core.db.record.StorySyncStateModel;
import com.snap.stickers.net.StickerHttpInterface;
import defpackage.abmv;
import defpackage.aeiy;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajyl;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akhw;
import defpackage.aklc;
import defpackage.akws;
import defpackage.gej;
import defpackage.ggh;
import defpackage.gij;
import defpackage.gqr;
import defpackage.gqt;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.hwm;
import defpackage.ide;
import defpackage.xsd;
import defpackage.xso;
import defpackage.xsp;
import defpackage.xtl;
import defpackage.xuy;
import defpackage.xwj;
import defpackage.zfw;
import defpackage.zgb;
import java.io.InputStream;

@hwk(a = "UPLOAD_CUSTOM_STICKERS", b = xtl.class)
public final class UploadCustomStickersJob extends hwg<xtl> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static UploadCustomStickersJob a(xtl xtl) {
            akcr.b(xtl, "uploadCustomStickerData");
            return new UploadCustomStickersJob(xtl);
        }
    }

    public static final class b implements hwm<UploadCustomStickersJob, akws<akhw>> {
        final zfw a = zgb.a(xsd.a.callsite("UploadCustomStickersJobProcessor"));
        final aipn<StickerHttpInterface> b;
        final aipn<gqr> c;
        private final aipn<xuy> d;
        private final aipn<xsp> e;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
            final /* synthetic */ b a;
            private /* synthetic */ UploadCustomStickersJob b;

            /* renamed from: com.snap.stickers.content.UploadCustomStickersJob$b$b$1 */
            static final class AnonymousClass1<T> implements ajfb<Throwable> {
                private /* synthetic */ b a;

                AnonymousClass1(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ void accept(Object obj) {
                    obj = (Throwable) obj;
                    gqr gqr = (gqr) this.a.a.c.get();
                    gqt gqt = gqt.HIGH;
                    akcr.a(obj, "exception");
                    gqr.a(gqt, obj, xsd.a.callsite("UploadCustomStickersJobProcessor"));
                }
            }

            b(b bVar, UploadCustomStickersJob uploadCustomStickersJob) {
                this.a = bVar;
                this.b = uploadCustomStickersJob;
            }

            public final /* synthetic */ Object apply(Object obj) {
                gej gej = (gej) obj;
                String str = "it";
                akcr.b(gej, str);
                if (gej.a()) {
                    String str2 = ((xtl) this.b.d).b;
                    String str3 = ((xtl) this.b.d).c;
                    akcr.b(str2, "mediaKey");
                    akcr.b(str3, "mediaIv");
                    akcr.b(gej, str);
                    abmv abmv = new ggh(str2, str3).a;
                    akbl cVar = abmv != null ? new defpackage.ggh.c(abmv) : gij.b;
                    obj = gej.b();
                    akcr.a(obj, "it.openDefaultAsset()");
                    Object a = aklc.a((InputStream) cVar.invoke(obj));
                    akcr.a(a, "IOUtils.toByteArray(inputStream)");
                    b bVar = this.a;
                    UploadCustomStickersJob uploadCustomStickersJob = this.b;
                    StickerHttpInterface stickerHttpInterface = (StickerHttpInterface) bVar.b.get();
                    str2 = ((xtl) uploadCustomStickersJob.d).a;
                    Object a2 = aeiy.SCISSORS_STICKER.a();
                    akcr.a(a2, "CustomStickerType.SCISSORS_STICKER.value()");
                    obj = stickerHttpInterface.createCustomSticker(new defpackage.xsn.b(str2, a2, ((xtl) uploadCustomStickersJob.d).d, ((xtl) uploadCustomStickersJob.d).b, ((xtl) uploadCustomStickersJob.d).c, a)).b((ajdw) bVar.a.g());
                    akcr.a(obj, "httpInterface.get().crea…eOn(schedulers.network())");
                    return obj.d((ajfb) new AnonymousClass1(this)).f(AnonymousClass2.a);
                }
                obj = gej.e();
                akcr.a(obj, "it.failureReason");
                return ajdx.b(obj.c());
            }
        }

        static final class c<T> implements ajfb<Throwable> {
            public static final c a = new c();

            c() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            a aVar = new a();
        }

        public b(zgb zgb, aipn<StickerHttpInterface> aipn, aipn<xuy> aipn2, aipn<xsp> aipn3, aipn<gqr> aipn4) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(aipn, "httpInterface");
            akcr.b(aipn2, "stickerRepository");
            akcr.b(aipn3, "customStickerUriHandler");
            akcr.b(aipn4, "exceptionTracker");
            this.b = aipn;
            this.d = aipn2;
            this.e = aipn3;
            this.c = aipn4;
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

        public final /* synthetic */ void b(hwg hwg) {
            UploadCustomStickersJob uploadCustomStickersJob = (UploadCustomStickersJob) hwg;
            String str = "durableJob";
            akcr.b(uploadCustomStickersJob, str);
            akcr.b(uploadCustomStickersJob, str);
            xwj xwj = new xwj(xso.b(((xtl) uploadCustomStickersJob.d).a, ((xtl) uploadCustomStickersJob.d).b, ((xtl) uploadCustomStickersJob.d).c, ((xtl) uploadCustomStickersJob.d).e, ((xtl) uploadCustomStickersJob.d).f));
            xwj.i = true;
            ((xuy) this.d.get()).a(ajyl.a(((xtl) uploadCustomStickersJob.d).a), ajyl.a(xwj));
        }

        public final /* synthetic */ ajcx c(hwg hwg) {
            UploadCustomStickersJob uploadCustomStickersJob = (UploadCustomStickersJob) hwg;
            akcr.b(uploadCustomStickersJob, "durableJob");
            return defpackage.hwm.a.a(uploadCustomStickersJob);
        }

        public final /* bridge */ /* synthetic */ ide c() {
            return xsd.a;
        }

        public final void d() {
        }

        public final /* synthetic */ void d(hwg hwg) {
            UploadCustomStickersJob uploadCustomStickersJob = (UploadCustomStickersJob) hwg;
            String str = "durableJob";
            akcr.b(uploadCustomStickersJob, str);
            akcr.b(uploadCustomStickersJob, str);
        }

        public final /* synthetic */ ajcx e(hwg hwg) {
            UploadCustomStickersJob uploadCustomStickersJob = (UploadCustomStickersJob) hwg;
            akcr.b(uploadCustomStickersJob, "durableJob");
            return defpackage.hwm.a.b(uploadCustomStickersJob);
        }
    }

    static {
        a aVar = new a();
    }

    public UploadCustomStickersJob(hwh hwh, xtl xtl) {
        akcr.b(hwh, "jobConfig");
        akcr.b(xtl, StorySyncStateModel.METADATA);
        super(hwh, xtl);
    }

    public /* synthetic */ UploadCustomStickersJob(xtl xtl) {
        this(xso.a, xtl);
    }
}
