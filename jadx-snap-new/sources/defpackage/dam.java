package defpackage;

import android.os.SystemClock;
import defpackage.doe.a;
import defpackage.doe.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: dam */
public final class dam extends dan {
    private final Map<String, Long> a = new HashMap(1);
    private final abqo b;
    private long c = 0;
    private long d = 0;
    private boolean e = false;
    private long f;
    private e g = e.FULL;
    private long h;
    private long i = 0;
    private long j = 0;
    private long k = 0;
    private final a l;
    private final ajdw m;
    private final igw n = new igw();
    private final ajwy<ilv> o;
    private final ajwy<gqr> p;
    private final idd q;

    /* renamed from: dam$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[b.values().length];
        static final /* synthetic */ int[] b = new int[a.values().length];
        private static /* synthetic */ int[] c = new int[e.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|20) */
        static {
            /*
            r0 = defpackage.doe.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.doe.a.REQUIRE_CAMERA;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.doe.a.RELEASE_CAMERA;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = defpackage.doe.b.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = defpackage.doe.b.OPEN;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r3 = defpackage.doe.b.CLOSE;	 Catch:{ NoSuchFieldError -> 0x003c }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r2 = defpackage.dam.e.values();
            r2 = r2.length;
            r2 = new int[r2];
            c = r2;
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x004f }
            r3 = defpackage.dam.e.FULL;	 Catch:{ NoSuchFieldError -> 0x004f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x004f }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x004f }
        L_0x004f:
            r0 = c;	 Catch:{ NoSuchFieldError -> 0x0059 }
            r2 = defpackage.dam.e.LOWEST_FPS;	 Catch:{ NoSuchFieldError -> 0x0059 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0059 }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x0059 }
        L_0x0059:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dam$1.<clinit>():void");
        }
    }

    /* renamed from: dam$e */
    public enum e {
        FULL,
        LOWEST_FPS
    }

    /* renamed from: dam$a */
    static class a {
        boolean a;
        private final Map<String, dao> b;
        private String c;
        private String d;
        private boolean e;
        private long f;
        private long g;
        private final idd h;
        private final ajwy<gqr> i;
        private final ajwy<ilv> j;

        private a(ajwy<gqr> ajwy, ajwy<ilv> ajwy2) {
            this.a = false;
            this.b = new HashMap();
            this.c = null;
            this.d = null;
            this.e = true;
            this.g = 0;
            this.h = dad.a.callsite("CameraOpenMetricsCollectorBasicImpl");
            this.i = ajwy;
            this.j = ajwy2;
        }

        /* synthetic */ a(ajwy ajwy, ajwy ajwy2, byte b) {
            this(ajwy, ajwy2);
        }

        private static dao a(String str, Map<String, dao> map) {
            dao dao = (dao) map.get(str);
            if (dao != null) {
                return dao;
            }
            dao = new dao();
            map.put(str, dao);
            return dao;
        }

        private void a(inb inb, String str, String str2) {
            ((ilv) this.j.get()).c(inb.a("prev_caller", Objects.toString(str)).a("current_caller", str2), 1);
        }

        private void a(String str, long j) {
            a.a(str, this.b, j - this.g);
            this.g = j;
        }

        private static void a(String str, Map<String, dao> map, long j) {
            if (j != 0) {
                a.a(str, (Map) map).a(j);
            }
        }

        private static void b(String str, Map<String, dao> map, long j) {
            if (j != 0) {
                a.a(str, (Map) map).b(j);
            }
        }

        private static void c(String str, Map<String, dao> map, long j) {
            if (j != 0) {
                a.a(str, (Map) map).c(j);
            }
        }

        public final synchronized void a() {
            this.e = false;
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void a(long j, boolean z) {
            if (!z) {
                if (this.c == null) {
                    String str;
                    if (this.e) {
                        this.c = "CAMERA_USER_ON_FOREGROUND_EVENT";
                        str = "CAMERA_USER_ON_FOREGROUND_EVENT";
                    } else if (this.a) {
                        this.c = this.d;
                    } else {
                        this.c = "NO_CAMERA_USER";
                        str = "NO_CAMERA_USER";
                    }
                    this.d = str;
                }
                if (this.a) {
                    this.g = j;
                }
                this.f = j;
                this.e = false;
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized boolean a(String str, long j, boolean z) {
            String str2 = str;
            long j2 = j;
            boolean z2 = z;
            synchronized (this) {
                boolean z3 = this.a;
                if (this.a) {
                    gqr gqr = (gqr) this.i.get();
                    gqt gqt = gqt.NORMAL;
                    String str3 = this.d;
                    defpackage.doe.a aVar = defpackage.doe.a.REQUIRE_CAMERA;
                    Throwable th = r2;
                    Throwable cVar = new c(str3, str, aVar, aVar, (byte) 0);
                    gqr.a(gqt, th, this.h, "onCameraVisible");
                    a(inb.CAMERA_SHOW_MISMATCH_COUNT, this.d, str2);
                    ieg.a("Camera lifecycle exception, please shake2Report.", true, 0);
                    b(this.d, j2, z2);
                }
                if (z2) {
                    long j3 = j2 - this.f;
                    if (!(j3 == 0 || this.c == null || this.c.equals("NO_CAMERA_USER"))) {
                        a.c(this.c.equals("CAMERA_USER_ON_FOREGROUND_EVENT") ? str2 : this.c, this.b, j3);
                        a.b(this.c, this.b, j3);
                        this.f = j2;
                    }
                }
                this.c = str2;
                this.d = str2;
                this.g = j2;
                this.a = true;
                if (z3) {
                    return false;
                }
                return true;
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void b() {
            this.b.clear();
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void b(long j, boolean z) {
            if (z) {
                if (this.a) {
                    a(this.c, j);
                }
                a.b(this.c, this.b, j - this.f);
                a.c(this.c, this.b, j - this.f);
                this.c = null;
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized boolean b(String str, long j, boolean z) {
            if (!this.a) {
                gqr gqr = (gqr) this.i.get();
                gqt gqt = gqt.NORMAL;
                String str2 = this.d;
                defpackage.doe.a aVar = defpackage.doe.a.RELEASE_CAMERA;
                gqr.a(gqt, new c(str2, str, aVar, aVar, (byte) 0), this.h, "onCameraHidden");
                a(inb.CAMERA_HIDE_MISMATCH_COUNT, this.d, str);
                ieg.a("Camera lifecycle exception, please shake2Report.", true, 0);
                return false;
            } else if (str.equals(this.c) || str.equals(this.d)) {
                if (z) {
                    a(str, j);
                }
                this.a = false;
                return true;
            } else {
                ((gqr) this.i.get()).a(gqt.NORMAL, new c(this.d, str, defpackage.doe.a.REQUIRE_CAMERA, defpackage.doe.a.RELEASE_CAMERA, (byte) 0), this.h, "onCameraHidden");
                a(inb.CAMERA_CALLER_MISMATCH_COUNT, this.d, str);
                ieg.a("Camera lifecycle exception, please shake2Report.", true, 0);
                return false;
            }
        }

        public final synchronized Map<String, dao> c(long j, boolean z) {
            Map a;
            a = das.a(this.b, null);
            if (z) {
                long j2 = j - this.f;
                if (j2 != 0) {
                    a.c(this.c, a, j2);
                    a.b(this.c, a, j2);
                }
            }
            if (this.a && z) {
                a.a(this.d, a, j - this.g);
            }
            return a;
        }
    }

    /* renamed from: dam$b */
    static class b extends RuntimeException {
        private defpackage.doe.b a;

        private b(defpackage.doe.b bVar) {
            this.a = bVar;
        }

        /* synthetic */ b(defpackage.doe.b bVar, byte b) {
            this(bVar);
        }

        public final String getMessage() {
            StringBuilder stringBuilder = new StringBuilder("Double call ");
            stringBuilder.append(this.a);
            stringBuilder.append('.');
            return stringBuilder.toString();
        }
    }

    /* renamed from: dam$d */
    static class d extends RuntimeException {
        final String a;
        final String b;

        private d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* synthetic */ d(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    /* renamed from: dam$c */
    static class c extends d {
        private a c;
        private a d;

        private c(String str, String str2, a aVar, a aVar2) {
            super(str, str2, (byte) 0);
            this.c = aVar2;
            this.d = aVar;
        }

        /* synthetic */ c(String str, String str2, a aVar, a aVar2, byte b) {
            this(str, str2, aVar, aVar2);
        }

        public final String getMessage() {
            StringBuilder stringBuilder = new StringBuilder("State ");
            stringBuilder.append(this.d);
            stringBuilder.append(" set by ");
            stringBuilder.append(this.a);
            stringBuilder.append(". State ");
            stringBuilder.append(this.c);
            stringBuilder.append(" requested by ");
            stringBuilder.append(this.b);
            stringBuilder.append('.');
            return stringBuilder.toString();
        }
    }

    public dam(abqo abqo, ajwy<gqr> ajwy, ajwy<ilv> ajwy2) {
        String str = "CameraOpenMetricsCollectorBasicImpl";
        this.q = dad.a.callsite(str);
        this.b = abqo;
        this.a.put(e.LOWEST_FPS.name(), Long.valueOf(0));
        this.o = ajwy2;
        this.p = ajwy;
        this.l = new a(ajwy, ajwy2, (byte) 0);
        this.m = zfx.a((ajdw) zgb.a(dad.a.callsite(str)).j(), 1);
    }

    /* JADX WARNING: Missing block: B:22:0x0060, code skipped:
            return;
     */
    private synchronized void a(long r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.isDisposed();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r5);
        return;
    L_0x0009:
        r0 = r5.l;	 Catch:{ all -> 0x0061 }
        r0 = r0.a;	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        r5.c = r6;	 Catch:{ all -> 0x0061 }
    L_0x0011:
        r0 = r5.l;	 Catch:{ all -> 0x0061 }
        r1 = r5.e;	 Catch:{ all -> 0x0061 }
        r0.a(r6, r1);	 Catch:{ all -> 0x0061 }
        r0 = r5.e;	 Catch:{ all -> 0x0061 }
        r1 = 1;
        if (r0 == 0) goto L_0x0044;
    L_0x001d:
        r6 = r5.p;	 Catch:{ all -> 0x0061 }
        r6 = r6.get();	 Catch:{ all -> 0x0061 }
        r6 = (defpackage.gqr) r6;	 Catch:{ all -> 0x0061 }
        r7 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x0061 }
        r0 = new dam$b;	 Catch:{ all -> 0x0061 }
        r2 = defpackage.doe.b.OPEN;	 Catch:{ all -> 0x0061 }
        r3 = 0;
        r0.<init>(r2, r3);	 Catch:{ all -> 0x0061 }
        r2 = r5.q;	 Catch:{ all -> 0x0061 }
        r4 = "onCameraOpened";
        r6.a(r7, r0, r2, r4);	 Catch:{ all -> 0x0061 }
        r6 = "opened";
        r7 = "open";
        r5.a(r6, r7);	 Catch:{ all -> 0x0061 }
        r6 = "Camera lifecycle exception, please shake2Report.";
        defpackage.ieg.a(r6, r1, r3);	 Catch:{ all -> 0x0061 }
        monitor-exit(r5);
        return;
    L_0x0044:
        r5.e = r1;	 Catch:{ all -> 0x0061 }
        r5.f = r6;	 Catch:{ all -> 0x0061 }
        r6 = r5.l;	 Catch:{ all -> 0x0061 }
        r6 = r6.a;	 Catch:{ all -> 0x0061 }
        if (r6 != 0) goto L_0x005f;
    L_0x004e:
        r6 = r5.f;	 Catch:{ all -> 0x0061 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 + r0;
        r5.d = r6;	 Catch:{ all -> 0x0061 }
        r6 = r5.g;	 Catch:{ all -> 0x0061 }
        r7 = defpackage.dam.e.FULL;	 Catch:{ all -> 0x0061 }
        if (r6 == r7) goto L_0x005f;
    L_0x005b:
        r6 = r5.f;	 Catch:{ all -> 0x0061 }
        r5.h = r6;	 Catch:{ all -> 0x0061 }
    L_0x005f:
        monitor-exit(r5);
        return;
    L_0x0061:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dam.a(long):void");
    }

    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            return;
     */
    private synchronized void a(long r3, java.lang.String r5) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.isDisposed();	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r2);
        return;
    L_0x0009:
        r0 = r2.l;	 Catch:{ all -> 0x002f }
        r1 = r2.e;	 Catch:{ all -> 0x002f }
        r5 = r0.a(r5, r3, r1);	 Catch:{ all -> 0x002f }
        if (r5 == 0) goto L_0x002d;
    L_0x0013:
        r5 = r2.e;	 Catch:{ all -> 0x002f }
        if (r5 == 0) goto L_0x0026;
    L_0x0017:
        r2.d(r3);	 Catch:{ all -> 0x002f }
        r5 = r2.g;	 Catch:{ all -> 0x002f }
        r0 = defpackage.dam.e.FULL;	 Catch:{ all -> 0x002f }
        if (r5 == r0) goto L_0x002b;
    L_0x0020:
        r5 = r2.g;	 Catch:{ all -> 0x002f }
        r2.a(r5, r3);	 Catch:{ all -> 0x002f }
        goto L_0x002b;
    L_0x0026:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 + r3;
        r2.d = r0;	 Catch:{ all -> 0x002f }
    L_0x002b:
        r2.c = r3;	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r2);
        return;
    L_0x002f:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dam.a(long, java.lang.String):void");
    }

    private synchronized void a(e eVar, long j) {
        a(this.a, eVar, j);
    }

    private void a(String str, String str2) {
        ((ilv) this.o.get()).c(inb.CAMERA_OPERATION_MISMATCH_COUNT.a("current_state", str).a("operation", str2), 1);
    }

    private synchronized void a(Map<String, Long> map, e eVar, long j) {
        Long l = (Long) map.get(eVar.name());
        map.put(eVar.name(), Long.valueOf(((l == null ? 0 : l.longValue()) + j) - Math.max(this.c, this.h)));
    }

    private synchronized boolean a(dal dal) {
        dau.a((Object) dal, "Null value passed to getSnapshot!");
        Map hashMap = new HashMap(this.a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 0;
        long j2 = this.e ? elapsedRealtime - this.f : 0;
        long j3 = (this.l.a && this.e) ? elapsedRealtime - this.c : 0;
        if (this.e && !this.l.a) {
            long j4 = elapsedRealtime - this.d;
            if (j4 > 0) {
                j = j4;
            }
            if (this.g != e.FULL) {
                a(hashMap, this.g, elapsedRealtime);
            }
        }
        dal.c = this.k + j;
        dal.a = this.i + j2;
        dal.b = this.j + j3;
        dal.a(hashMap);
        dal.b(this.l.c(elapsedRealtime, this.e));
        return true;
    }

    /* JADX WARNING: Missing block: B:26:0x006e, code skipped:
            return;
     */
    private synchronized void b(long r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.isDisposed();	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);
        return;
    L_0x0009:
        r0 = r6.l;	 Catch:{ all -> 0x006f }
        r1 = r6.e;	 Catch:{ all -> 0x006f }
        r0.b(r7, r1);	 Catch:{ all -> 0x006f }
        r0 = r6.e;	 Catch:{ all -> 0x006f }
        r1 = 0;
        if (r0 == 0) goto L_0x0048;
    L_0x0015:
        r0 = r6.l;	 Catch:{ all -> 0x006f }
        r0 = r0.a;	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x001e;
    L_0x001b:
        r6.c(r7);	 Catch:{ all -> 0x006f }
    L_0x001e:
        r2 = r6.i;	 Catch:{ all -> 0x006f }
        r4 = r6.f;	 Catch:{ all -> 0x006f }
        r4 = r7 - r4;
        r2 = r2 + r4;
        r6.i = r2;	 Catch:{ all -> 0x006f }
        r6.e = r1;	 Catch:{ all -> 0x006f }
        r0 = r6.l;	 Catch:{ all -> 0x006f }
        r0 = r0.a;	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x0038;
    L_0x002f:
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6.d = r7;	 Catch:{ all -> 0x006f }
        monitor-exit(r6);
        return;
    L_0x0038:
        r6.d(r7);	 Catch:{ all -> 0x006f }
        r0 = r6.g;	 Catch:{ all -> 0x006f }
        r1 = defpackage.dam.e.FULL;	 Catch:{ all -> 0x006f }
        if (r0 == r1) goto L_0x006d;
    L_0x0041:
        r0 = r6.g;	 Catch:{ all -> 0x006f }
        r6.a(r0, r7);	 Catch:{ all -> 0x006f }
        monitor-exit(r6);
        return;
    L_0x0048:
        r7 = r6.p;	 Catch:{ all -> 0x006f }
        r7 = r7.get();	 Catch:{ all -> 0x006f }
        r7 = (defpackage.gqr) r7;	 Catch:{ all -> 0x006f }
        r8 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x006f }
        r0 = new dam$b;	 Catch:{ all -> 0x006f }
        r2 = defpackage.doe.b.CLOSE;	 Catch:{ all -> 0x006f }
        r0.<init>(r2, r1);	 Catch:{ all -> 0x006f }
        r2 = r6.q;	 Catch:{ all -> 0x006f }
        r3 = "onCameraClosed";
        r7.a(r8, r0, r2, r3);	 Catch:{ all -> 0x006f }
        r7 = "closed";
        r8 = "close";
        r6.a(r7, r8);	 Catch:{ all -> 0x006f }
        r7 = "Camera lifecycle exception, please shake2Report.";
        r8 = 1;
        defpackage.ieg.a(r7, r8, r1);	 Catch:{ all -> 0x006f }
    L_0x006d:
        monitor-exit(r6);
        return;
    L_0x006f:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dam.b(long):void");
    }

    /* JADX WARNING: Missing block: B:13:0x001b, code skipped:
            return;
     */
    private synchronized void b(long r3, java.lang.String r5) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.isDisposed();	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r2);
        return;
    L_0x0009:
        r0 = r2.l;	 Catch:{ all -> 0x001c }
        r1 = r2.e;	 Catch:{ all -> 0x001c }
        r5 = r0.b(r5, r3, r1);	 Catch:{ all -> 0x001c }
        if (r5 == 0) goto L_0x001a;
    L_0x0013:
        r5 = r2.e;	 Catch:{ all -> 0x001c }
        if (r5 == 0) goto L_0x001a;
    L_0x0017:
        r2.c(r3);	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r2);
        return;
    L_0x001c:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dam.b(long, java.lang.String):void");
    }

    private void c(long j) {
        this.j += j - this.c;
        this.c = j;
        this.d = j + 5300;
    }

    private synchronized void d(long j) {
        j -= this.d;
        if (j > 0) {
            this.k += j;
        }
    }

    private /* synthetic */ void e(long j) {
        b(j);
    }

    private /* synthetic */ void f(long j) {
        a(j);
    }

    public final synchronized void a() {
        super.a();
        this.l.a();
    }

    public final void a(a aVar, idd idd) {
        if (!isDisposed()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 1.b[aVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.n.a(this.m.a(new -$$Lambda$dam$MSonBXct9eXEaex-X4TwViPdMPk(this, elapsedRealtime, idd)));
                }
                return;
            }
            this.n.a(this.m.a(new -$$Lambda$dam$O4MoO3HtBWg_iycSiyQQN0z6pJw(this, elapsedRealtime, idd)));
        }
    }

    public final void a(b bVar, int i) {
        if (!isDisposed()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 1.a[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.n.a(this.m.a(new -$$Lambda$dam$8nDPqnU2FTjmAm0tO7rtJkvgv4Y(this, elapsedRealtime)));
                }
                return;
            }
            this.n.a(this.m.a(new -$$Lambda$dam$8XipBqW42J1q83XGpBSgok_CKmw(this, elapsedRealtime)));
        }
    }

    public final /* synthetic */ das b() {
        return new dal();
    }

    public final synchronized void dispose() {
        if (!isDisposed()) {
            this.n.dispose();
            this.a.clear();
            this.l.b();
            super.dispose();
        }
    }
}
