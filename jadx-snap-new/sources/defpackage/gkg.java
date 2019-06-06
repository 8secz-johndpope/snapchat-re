package defpackage;

import defpackage.sak.a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: gkg */
public final class gkg extends saa {
    private final ajxe a = ajxh.a(a.a);
    private final gqr b;

    /* renamed from: gkg$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return iew.a.callsite("GzipFilter");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gkg.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public gkg(gqr gqr) {
        akcr.b(gqr, "exceptionTracker");
        this.b = gqr;
    }

    private static byte[] a(InputStream inputStream) {
        akcr.b(inputStream, "originalPayload");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Closeable gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            aklc.a(inputStream, (OutputStream) (GZIPOutputStream) gZIPOutputStream);
            akax.a(gZIPOutputStream, null);
            Object toByteArray = byteArrayOutputStream.toByteArray();
            akcr.a(toByteArray, "newPayloadOutputStream.toByteArray()");
            return toByteArray;
        } catch (Throwable th) {
            akax.a(gZIPOutputStream, th);
        }
    }

    public final void a(sak<sai> sak, sab sab) {
        Throwable th;
        Object obj = "request";
        akcr.b(sak, obj);
        akcr.b(sab, "chain");
        Map m = sak.m();
        if (akcr.a(obj, m != null ? m.get("__xsc_local__gzip") : null)) {
            Closeable e;
            try {
                sai sai = (sai) sak.n();
                if ((sai != null ? sai.c() : -1) >= 512) {
                    a h = sak.h();
                    Object n = sak.n();
                    if (n == null) {
                        akcr.a();
                    }
                    akcr.a(n, "request.payload!!");
                    sai sai2 = (sai) n;
                    e = sai2.e();
                    Object obj2 = (InputStream) e;
                    akcr.a(obj2, "inputStream");
                    byte[] a = gkg.a(obj2);
                    sbl sbl = new sbl(sai2.b(), (long) a.length, sai2.d(), sbe.a.a(a));
                    sai2.close();
                    h.b(sbl);
                    akax.a(e, null);
                    Object l = sak.l();
                    akcr.a(l, "request.headers");
                    Map d = ajzm.d(l);
                    d.put("content-encoding", "gzip");
                    h.d(d);
                    sab.a(h.e());
                    return;
                }
                sab.a((sak) sak);
                return;
            } catch (IOException e2) {
                th = e2;
                this.b.a(gqt.NORMAL, th, (idd) this.a.b());
                sab.a(th);
                return;
            } catch (Throwable th2) {
                akax.a(e, th);
            }
        }
        sab.a((sak) sak);
    }
}
