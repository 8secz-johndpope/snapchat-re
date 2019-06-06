package defpackage;

import android.content.Context;

/* renamed from: ljj */
public abstract class ljj {

    /* renamed from: ljj$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: ljj$d */
    public interface d {
        Context a();

        eqm<eps> b();

        zgb c();
    }

    /* renamed from: ljj$a */
    public static abstract class a implements mhi<ljj> {
        public abstract a a(ide ide);

        public abstract a a(d dVar);

        public abstract a a(mhg mhg);

        public abstract a a(miw miw);

        public abstract a a(mzn mzn);
    }

    /* renamed from: ljj$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ljg a(Context context) {
            akcr.b(context, "context");
            return new lje(new ljf(context));
        }

        public static final ljh a(ljh ljh) {
            akcr.b(ljh, "facesCache");
            return new lji(ljh);
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x0160 A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0160 A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0160 A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0160 A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0160 A:{Catch:{ Throwable -> 0x00e6 }} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A:{Catch:{ Throwable -> 0x00e6 }} */
        public static final defpackage.mtj a(defpackage.ajwy<defpackage.mti> r7, defpackage.miw r8, defpackage.ajwy<defpackage.mhg> r9, defpackage.ajwy<defpackage.ljg> r10, defpackage.ajwy<defpackage.eqm<defpackage.eps>> r11, defpackage.ajwy<defpackage.ljh> r12, defpackage.ajwy<defpackage.zfw> r13) {
            /*
            r0 = "externalImagesFilter";
            defpackage.akcr.b(r7, r0);
            r0 = "configurationRepository";
            defpackage.akcr.b(r8, r0);
            r0 = "bitmapLoader";
            defpackage.akcr.b(r9, r0);
            r0 = "faceDetector";
            defpackage.akcr.b(r10, r0);
            r0 = "cameraRollImageProvider";
            defpackage.akcr.b(r11, r0);
            r0 = "facesCache";
            defpackage.akcr.b(r12, r0);
            r0 = "schedulers";
            defpackage.akcr.b(r13, r0);
            r8 = r8.a(defpackage.miw.b.a.a);	 Catch:{ all -> 0x0170 }
            r0 = defpackage.mja.ENABLE_EXTERNAL_IMAGES;	 Catch:{ all -> 0x0170 }
            r0 = (defpackage.mje) r0;	 Catch:{ all -> 0x0170 }
            r1 = java.lang.Boolean.class;
            r2 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00e6 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 != 0) goto L_0x00ca;
        L_0x0035:
            r2 = java.lang.Boolean.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 == 0) goto L_0x003f;
        L_0x003d:
            goto L_0x00ca;
        L_0x003f:
            r2 = java.lang.Integer.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 != 0) goto L_0x00c5;
        L_0x0047:
            r2 = java.lang.Integer.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 == 0) goto L_0x0050;
        L_0x004f:
            goto L_0x00c5;
        L_0x0050:
            r2 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00e6 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 != 0) goto L_0x00c0;
        L_0x0058:
            r2 = java.lang.Long.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 == 0) goto L_0x0061;
        L_0x0060:
            goto L_0x00c0;
        L_0x0061:
            r2 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00e6 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 != 0) goto L_0x00bb;
        L_0x0069:
            r2 = java.lang.Float.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 == 0) goto L_0x0072;
        L_0x0071:
            goto L_0x00bb;
        L_0x0072:
            r2 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00e6 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 != 0) goto L_0x00b6;
        L_0x007a:
            r2 = java.lang.Double.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 == 0) goto L_0x0083;
        L_0x0082:
            goto L_0x00b6;
        L_0x0083:
            r2 = java.lang.String.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r2 != 0) goto L_0x00b1;
        L_0x008b:
            r2 = java.lang.String.class;
            r1 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00e6 }
            if (r1 == 0) goto L_0x0094;
        L_0x0093:
            goto L_0x00b1;
        L_0x0094:
            r8 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00e6 }
            r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00e6 }
            r2 = "Unsupported input type: [";
            r1.<init>(r2);	 Catch:{ Throwable -> 0x00e6 }
            r2 = java.lang.Boolean.class;
            r1.append(r2);	 Catch:{ Throwable -> 0x00e6 }
            r2 = 93;
            r1.append(r2);	 Catch:{ Throwable -> 0x00e6 }
            r1 = r1.toString();	 Catch:{ Throwable -> 0x00e6 }
            r8.<init>(r1);	 Catch:{ Throwable -> 0x00e6 }
            r8 = (java.lang.Throwable) r8;	 Catch:{ Throwable -> 0x00e6 }
            throw r8;	 Catch:{ Throwable -> 0x00e6 }
        L_0x00b1:
            r8 = r8.f(r0);	 Catch:{ Throwable -> 0x00e6 }
            goto L_0x00ce;
        L_0x00b6:
            r8 = r8.c(r0);	 Catch:{ Throwable -> 0x00e6 }
            goto L_0x00ce;
        L_0x00bb:
            r8 = r8.b(r0);	 Catch:{ Throwable -> 0x00e6 }
            goto L_0x00ce;
        L_0x00c0:
            r8 = r8.e(r0);	 Catch:{ Throwable -> 0x00e6 }
            goto L_0x00ce;
        L_0x00c5:
            r8 = r8.d(r0);	 Catch:{ Throwable -> 0x00e6 }
            goto L_0x00ce;
        L_0x00ca:
            r8 = r8.a(r0);	 Catch:{ Throwable -> 0x00e6 }
        L_0x00ce:
            r1 = java.lang.Boolean.class;
            r8 = r8.a(r1);	 Catch:{ Throwable -> 0x00e6 }
            r1 = "cast(R::class.java)";
            defpackage.akcr.a(r8, r1);	 Catch:{ Throwable -> 0x00e6 }
            r8 = r8.b();	 Catch:{ Throwable -> 0x00e6 }
            r1 = "observe<T>(key).blockingFirst()";
            defpackage.akcr.a(r8, r1);	 Catch:{ Throwable -> 0x00e6 }
            goto L_0x0107;
        L_0x00e3:
            r7 = move-exception;
            goto L_0x016f;
        L_0x00e6:
            r8 = move-exception;
            r1 = com.google.common.base.Throwables.getRootCause(r8);	 Catch:{ all -> 0x00e3 }
            r1 = r1 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x016e;
        L_0x00ef:
            r8 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00e3 }
            r8.interrupt();	 Catch:{ all -> 0x00e3 }
            r8 = r0.a();	 Catch:{ all -> 0x00e3 }
            r0 = "key.delegate";
            defpackage.akcr.a(r8, r0);	 Catch:{ all -> 0x00e3 }
            r8 = r8.b();	 Catch:{ all -> 0x00e3 }
            if (r8 == 0) goto L_0x0166;
        L_0x0105:
            r8 = (java.lang.Boolean) r8;	 Catch:{ all -> 0x00e3 }
        L_0x0107:
            r8 = (java.lang.Boolean) r8;	 Catch:{ all -> 0x0170 }
            r8 = r8.booleanValue();	 Catch:{ all -> 0x0170 }
            if (r8 == 0) goto L_0x0160;
        L_0x010f:
            r8 = new ljc;	 Catch:{ all -> 0x0170 }
            r13 = r13.get();	 Catch:{ all -> 0x0170 }
            r0 = "schedulers.get()";
            defpackage.akcr.a(r13, r0);	 Catch:{ all -> 0x0170 }
            r1 = r13;
            r1 = (defpackage.zfw) r1;	 Catch:{ all -> 0x0170 }
            r9 = r9.get();	 Catch:{ all -> 0x0170 }
            r13 = "bitmapLoader.get()";
            defpackage.akcr.a(r9, r13);	 Catch:{ all -> 0x0170 }
            r3 = r9;
            r3 = (defpackage.mhg) r3;	 Catch:{ all -> 0x0170 }
            r9 = r10.get();	 Catch:{ all -> 0x0170 }
            r10 = "faceDetector.get()";
            defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x0170 }
            r4 = r9;
            r4 = (defpackage.ljg) r4;	 Catch:{ all -> 0x0170 }
            r9 = r11.get();	 Catch:{ all -> 0x0170 }
            r10 = "cameraRollImageProvider.get()";
            defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x0170 }
            r5 = r9;
            r5 = (defpackage.eqm) r5;	 Catch:{ all -> 0x0170 }
            r9 = r12.get();	 Catch:{ all -> 0x0170 }
            r10 = "facesCache.get()";
            defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x0170 }
            r2 = r9;
            r2 = (defpackage.ljh) r2;	 Catch:{ all -> 0x0170 }
            r7 = r7.get();	 Catch:{ all -> 0x0170 }
            r9 = "externalImagesFilter.get()";
            defpackage.akcr.a(r7, r9);	 Catch:{ all -> 0x0170 }
            r6 = r7;
            r6 = (defpackage.mti) r6;	 Catch:{ all -> 0x0170 }
            r0 = r8;
            r0.<init>(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0170 }
            r8 = (defpackage.mtj) r8;	 Catch:{ all -> 0x0170 }
            goto L_0x0165;
        L_0x0160:
            r7 = defpackage.mtj.b.a;	 Catch:{ all -> 0x0170 }
            r8 = r7;
            r8 = (defpackage.mtj) r8;	 Catch:{ all -> 0x0170 }
        L_0x0165:
            return r8;
        L_0x0166:
            r7 = new ajxt;	 Catch:{ all -> 0x00e3 }
            r8 = "null cannot be cast to non-null type kotlin.Boolean";
            r7.<init>(r8);	 Catch:{ all -> 0x00e3 }
            throw r7;	 Catch:{ all -> 0x00e3 }
        L_0x016e:
            throw r8;	 Catch:{ all -> 0x00e3 }
        L_0x016f:
            throw r7;	 Catch:{ all -> 0x0170 }
        L_0x0170:
            r7 = move-exception;
            throw r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ljj$c.a(ajwy, miw, ajwy, ajwy, ajwy, ajwy, ajwy):mtj");
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("ExternalImages"));
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mtj f();
}
