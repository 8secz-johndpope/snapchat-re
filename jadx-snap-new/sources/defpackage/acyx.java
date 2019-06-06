package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.common.base.Supplier;
import defpackage.aczs.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: acyx */
public final class acyx implements acmp {
    final int a;
    final acyk b;
    private final zfw c;
    private final Context d;
    private final Supplier<File> e;
    private boolean f = false;
    private final ajei g = new ajei();
    private final ajwl<acmr> h = new ajwl();
    private final ajdp<acmr> i = this.h.j(ajfu.a).f();
    private acmh j;

    /* renamed from: acyx$a */
    static class a implements ajej {
        private final WeakReference<ajej> a;

        public a(WeakReference<ajej> weakReference) {
            this.a = weakReference;
        }

        public final void dispose() {
            ajej ajej = (ajej) this.a.get();
            if (ajej != null) {
                ajej.dispose();
            }
        }

        public final boolean isDisposed() {
            return false;
        }
    }

    /* renamed from: acyx$b */
    class b implements aczq<aljn> {
        private final File a;
        private final File b;
        private final String c;
        private final boolean d;
        private final ajwy<aczt> e;

        public b(File file, File file2, String str, boolean z, ajwy<aczt> ajwy) {
            this.a = file;
            this.b = file2;
            this.c = str;
            this.d = z;
            this.e = ajwy;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7 A:{SYNTHETIC, Splitter:B:41:0x00c7} */
        /* JADX WARNING: Missing block: B:47:0x00cd, code skipped:
            if (r2 != null) goto L_0x00b9;
     */
        public final /* synthetic */ void a(java.lang.Object r12, defpackage.aczw r13) {
            /*
            r11 = this;
            r12 = (defpackage.aljn) r12;
            r13 = 1;
            r0 = 0;
            if (r12 == 0) goto L_0x0103;
        L_0x0006:
            r1 = r12.c;
            r2 = r12.b;
            r8 = r12.d;
            r3 = r12.a;
            r3 = r3 & 64;
            r4 = 0;
            if (r3 == 0) goto L_0x0015;
        L_0x0013:
            r3 = 1;
            goto L_0x0016;
        L_0x0015:
            r3 = 0;
        L_0x0016:
            if (r3 == 0) goto L_0x001b;
        L_0x0018:
            r12 = r12.e;
            goto L_0x001c;
        L_0x001b:
            r12 = 0;
        L_0x001c:
            if (r2 == 0) goto L_0x0085;
        L_0x001e:
            r3 = defpackage.acyx.this;
            r3 = r3.b;
            r5 = "token";
            defpackage.akcr.b(r2, r5);
            r5 = "styleEtag";
            defpackage.akcr.b(r8, r5);
            r3.a = r2;
            r2 = r3.a();
            r2 = r2.edit();
            r5 = new java.lang.StringBuilder;
            r6 = "snapchat.access_token";
            r5.<init>(r6);
            r6 = r3.c;
            r5.append(r6);
            r5 = r5.toString();
            r6 = r3.a;
            r2.putString(r5, r6);
            if (r12 != 0) goto L_0x0060;
        L_0x004d:
            r5 = new java.lang.StringBuilder;
            r6 = "sc-map-style-etag";
            r5.<init>(r6);
            r3 = r3.c;
            r5.append(r3);
            r3 = r5.toString();
            r2.putString(r3, r8);
        L_0x0060:
            r2.apply();
            if (r12 == 0) goto L_0x0085;
        L_0x0065:
            r12 = r11.b;
            if (r12 == 0) goto L_0x007d;
        L_0x0069:
            r0 = java.lang.System.currentTimeMillis();
            r12.setLastModified(r0);
            r3 = defpackage.acyx.this;
            r4 = r11.b;
            r5 = 0;
            r6 = r11.c;
            r7 = r11.e;
            r3.a(r4, r5, r6, r7, r8);
            return;
        L_0x007d:
            r12 = new java.lang.IllegalStateException;
            r13 = "We cannot use a non modified json if backup file is missing.";
            r12.<init>(r13);
            throw r12;
        L_0x0085:
            r12 = r1.length();	 Catch:{ JSONException -> 0x00a2 }
            r2 = (long) r12;	 Catch:{ JSONException -> 0x00a2 }
            r5 = 50;
            r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
            if (r12 <= 0) goto L_0x009a;
        L_0x0090:
            r12 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00a2 }
            r12.<init>(r1);	 Catch:{ JSONException -> 0x00a2 }
            r12.length();	 Catch:{ JSONException -> 0x00a2 }
            r12 = r0;
            goto L_0x00a9;
        L_0x009a:
            r12 = new java.io.IOException;	 Catch:{ JSONException -> 0x00a2 }
            r2 = "Response size was too small.";
            r12.<init>(r2);	 Catch:{ JSONException -> 0x00a2 }
            goto L_0x00a9;
        L_0x00a2:
            r12 = new java.io.IOException;
            r2 = "Response was not a valid json file";
            r12.<init>(r2);
        L_0x00a9:
            if (r12 != 0) goto L_0x00d0;
        L_0x00ab:
            r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00cb, all -> 0x00c4 }
            r3 = r11.a;	 Catch:{ IOException -> 0x00cb, all -> 0x00c4 }
            r2.<init>(r3);	 Catch:{ IOException -> 0x00cb, all -> 0x00c4 }
            r3 = r1.getBytes();	 Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            defpackage.aklc.a(r3, r2);	 Catch:{ IOException -> 0x00c2, all -> 0x00bf }
        L_0x00b9:
            r2.close();	 Catch:{ IOException -> 0x00bd }
            goto L_0x00d0;
        L_0x00bd:
            r12 = move-exception;
            goto L_0x00d0;
        L_0x00bf:
            r12 = move-exception;
            r0 = r2;
            goto L_0x00c5;
        L_0x00c2:
            r12 = move-exception;
            goto L_0x00cd;
        L_0x00c4:
            r12 = move-exception;
        L_0x00c5:
            if (r0 == 0) goto L_0x00ca;
        L_0x00c7:
            r0.close();	 Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            throw r12;
        L_0x00cb:
            r12 = move-exception;
            r2 = r0;
        L_0x00cd:
            if (r2 == 0) goto L_0x00d0;
        L_0x00cf:
            goto L_0x00b9;
        L_0x00d0:
            r2 = r11.d;
            if (r2 == 0) goto L_0x0102;
        L_0x00d4:
            if (r12 != 0) goto L_0x00e9;
        L_0x00d6:
            r12 = r11.a;
            r2 = java.lang.System.currentTimeMillis();
            r12.setLastModified(r2);
            r12 = defpackage.acyx.this;
            r13 = r11.c;
            r0 = r11.e;
            r12.a(r1, r4, r13, r0);
            return;
        L_0x00e9:
            r6 = r11.b;
            if (r6 == 0) goto L_0x00f9;
        L_0x00ed:
            r5 = defpackage.acyx.this;
            r7 = 1;
            r8 = r11.c;
            r9 = r11.e;
            r10 = 0;
            r5.a(r6, r7, r8, r9, r10);
            return;
        L_0x00f9:
            r12 = defpackage.acyx.this;
            r1 = r11.c;
            r2 = r11.e;
            r12.a(r0, r13, r1, r2);
        L_0x0102:
            return;
        L_0x0103:
            r12 = r11.d;
            if (r12 == 0) goto L_0x0120;
        L_0x0107:
            r2 = r11.b;
            if (r2 == 0) goto L_0x0117;
        L_0x010b:
            r1 = defpackage.acyx.this;
            r3 = 1;
            r4 = r11.c;
            r5 = r11.e;
            r6 = 0;
            r1.a(r2, r3, r4, r5, r6);
            return;
        L_0x0117:
            r12 = defpackage.acyx.this;
            r1 = r11.c;
            r2 = r11.e;
            r12.a(r0, r13, r1, r2);
        L_0x0120:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acyx$b.a(java.lang.Object, aczw):void");
        }
    }

    acyx(Context context, int i, Supplier<File> supplier) {
        this.a = i;
        this.d = context;
        this.e = supplier;
        this.c = zgb.a(adck.a.callsite("MapboxStyleManager"));
        this.b = new acyk(context, this.a);
    }

    private static String a(a aVar) {
        InputStream a;
        Throwable th;
        Throwable th2;
        if (aVar == null) {
            return null;
        }
        try {
            a = aVar.a((String) aVar.a().get(0));
            if (a != null) {
                try {
                    String a2 = aklc.a(a, Charset.forName("UTF-8"));
                    if (a != null) {
                        a.close();
                    }
                    return a2;
                } catch (Throwable th22) {
                    Throwable th3 = th22;
                    th22 = th;
                    th = th3;
                }
            } else {
                if (a != null) {
                    a.close();
                }
                return null;
            }
        } catch (Exception unused) {
        }
        if (a != null) {
            if (th22 != null) {
                try {
                    a.close();
                } catch (Throwable th4) {
                    th22.addSuppressed(th4);
                }
            } else {
                a.close();
            }
        }
        throw th;
        throw th;
    }

    static /* synthetic */ void a(acyx acyx, ajwy ajwy, ajwy ajwy2, boolean z, String str, long j, boolean z2) {
        String str2;
        long j2;
        String str3;
        File file;
        boolean z3;
        File file2;
        Object obj;
        acyx acyx2 = acyx;
        String str4 = "com.snapchat.map.style.js_";
        File file3;
        if (acyx2.a == acmm.PROTOTYPE.ordinal()) {
            str2 = "";
            file3 = new File(acyx.b(), str4.concat(str2));
            j2 = 0;
            str3 = str2;
            file = file3;
        } else {
            file3 = acyx.b();
            StringBuilder stringBuilder = new StringBuilder(str4);
            stringBuilder.append(acyx2.a);
            j2 = j;
            file = new File(file3, stringBuilder.toString());
            str3 = null;
        }
        if (file.length() < 50) {
            z3 = z2 ^ 1;
            file2 = null;
            obj = 1;
        } else {
            boolean z4;
            obj = null;
            if (System.currentTimeMillis() - file.lastModified() > j2) {
                z4 = true;
            } else if (acyx2.b.b() == null || z) {
                if (!z2) {
                    acyx.a(file, false, str, ajwy2, null);
                    z4 = false;
                } else {
                    return;
                }
            } else if (!z2) {
                acyx.a(file, false, str, ajwy2, null);
                z4 = false;
                z3 = z4;
                file2 = file;
            } else {
                return;
            }
            obj = 1;
            z3 = z4;
            file2 = file;
        }
        if (obj != null) {
            aljm aljm = new aljm();
            acyk acyk = acyx2.b;
            SharedPreferences a = acyk.a();
            StringBuilder stringBuilder2 = new StringBuilder("sc-map-style-etag");
            stringBuilder2.append(acyk.c);
            str2 = a.getString(stringBuilder2.toString(), null);
            if (!(str2 == null || file2 == null || str3 != null)) {
                if (str2 != null) {
                    aljm.d = str2;
                    aljm.a |= 8;
                } else {
                    throw new NullPointerException();
                }
            }
            int i = acyx2.a;
            if (i > 0) {
                aljm.b = i;
                aljm.a |= 1;
            }
            if (str3 != null) {
                if (str3 != null) {
                    aljm.c = str3;
                    aljm.a |= 4;
                } else {
                    throw new NullPointerException();
                }
            }
            acyx2.h.a(new acmo(acyx2.a));
            ((aczu) ajwy.get()).a(aljm, new b(file, file2, str, z3, ajwy2));
        }
    }

    public final ajdp<acmr> a() {
        return this.i;
    }

    public final synchronized void a(acmh acmh) {
        this.j = acmh;
    }

    public final void a(final ajwy<? extends aczu> ajwy, final ajwy<aczt> ajwy2, final String str) {
        this.g.a(new a(new WeakReference(ajcx.b(new Callable<Object>() {
            private /* synthetic */ long d = 86400000;

            public final Object call() {
                acyx acyx = acyx.this;
                ajwy ajwy = ajwy;
                ajwy ajwy2 = ajwy2;
                File b = acyx.b();
                StringBuilder stringBuilder = new StringBuilder("com.snapchat.map.style.js_");
                stringBuilder.append(acyx.a);
                acyx.a(acyx, ajwy, ajwy2, System.currentTimeMillis() - new File(b, stringBuilder.toString()).lastModified() > 300000, str, this.d, false);
                return this;
            }
        }).b((ajdw) this.c.f()).e())));
    }

    /* Access modifiers changed, original: final */
    public final void a(File file, boolean z, String str, ajwy<aczt> ajwy, String str2) {
        final File file2 = file;
        final String str3 = str2;
        final boolean z2 = z;
        final String str4 = str;
        final ajwy<aczt> ajwy2 = ajwy;
        this.g.a(new a(new WeakReference(ajdx.c(new Callable<Object>() {
            public final Object call() {
                System.currentTimeMillis();
                try {
                    String a = akkz.a(file2, Charset.defaultCharset());
                    if (((long) a.length()) > 50 && a.charAt(0) == '{' && a.charAt(a.length() - 1) == '}') {
                        if (str3 != null) {
                            acyk acyk = acyx.this.b;
                            String str = str3;
                            Editor edit = acyk.a().edit();
                            StringBuilder stringBuilder = new StringBuilder("sc-map-style-etag");
                            stringBuilder.append(acyk.c);
                            edit.putString(stringBuilder.toString(), str).apply();
                            file2.setLastModified(System.currentTimeMillis());
                        }
                        acyx.this.a(a, z2, str4, ajwy2);
                        return this;
                    }
                    file2.delete();
                    acyx.this.a(null, z2, str4, ajwy2);
                    return this;
                } catch (IOException unused) {
                    acyx.this.a(null, z2, str4, ajwy2);
                }
            }
        }).b((ajdw) this.c.f()).c())));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str, boolean z, String str2, ajwy<aczt> ajwy) {
        if (str != null) {
            if (this.f || !z) {
                this.f = z;
                adbs.a.a(this.d, str);
                String b = this.b.b();
                if (b == null) {
                    this.h.a(new acmn(this.a));
                    return;
                }
                Locale locale = Locale.getDefault();
                if (locale != null) {
                    z = "IN".equals(locale.getCountry());
                } else {
                    z = false;
                }
                if (!z) {
                    if (this.j == null || !this.j.a()) {
                        this.h.a((Object) new acms(this.a, str, b, str2, null));
                        return;
                    }
                }
                ((aczt) ajwy.get()).a(new -$$Lambda$acyx$at66Raq9F-PmyhbOO--PpZycm6k(this, str, b, str2));
                return;
            }
        }
        this.h.a(new acmn(this.a));
    }

    /* Access modifiers changed, original: final */
    public final File b() {
        return (File) this.e.get();
    }

    public final void b(final ajwy<? extends aczu> ajwy, final ajwy<aczt> ajwy2, final String str) {
        this.g.a(new a(new WeakReference(ajcx.b(new Callable<Object>() {
            private /* synthetic */ boolean d = true;

            public final Object call() {
                acyx.a(acyx.this, ajwy, ajwy2, false, str, 86400000, this.d);
                return this;
            }
        }).b((ajdw) this.c.f()).e())));
    }

    public final Context c() {
        return this.d;
    }

    public final String d() {
        return this.b.b();
    }

    public final int e() {
        return this.a;
    }
}
