package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import defpackage.jwr.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: epy */
public abstract class epy<Media extends ept> {
    final ContentResolver a;
    final ifs b;
    final Uri c;
    private final eqv d;
    private final a e;
    private final String[] f;
    private final String g;

    /* renamed from: epy$a */
    public enum a {
        IMAGE,
        VIDEO,
        ALL
    }

    public epy(ContentResolver contentResolver, ifs ifs, eqv eqv, a aVar, Uri uri, String[] strArr, String str) {
        akcr.b(contentResolver, "contentResolver");
        akcr.b(ifs, "permissionHelper");
        akcr.b(eqv, "videoMetadataReaderProvider");
        akcr.b(aVar, "mediaType");
        akcr.b(uri, "mediaUri");
        akcr.b(strArr, "projection");
        akcr.b(str, "orderBy");
        this.a = contentResolver;
        this.b = ifs;
        this.d = eqv;
        this.e = aVar;
        this.c = uri;
        this.f = strArr;
        this.g = str;
    }

    private final eps a(Cursor cursor, eqf eqf, String str) {
        Closeable closeable;
        eps eps;
        Throwable th;
        Throwable th2;
        Cursor cursor2 = cursor;
        eqf eqf2 = eqf;
        String str2 = str;
        if (eqf2 != null) {
            eqi eqi = (eqi) eqf2;
            int i = cursor2.getInt(eqf2.f);
            int i2 = cursor2.getInt(eqf2.g);
            long j = cursor2.getLong(eqf2.b);
            long j2 = cursor2.getLong(eqf2.d);
            long j3 = cursor2.getLong(eqf2.e);
            File file = new File(str2);
            if (!file.exists() || file.isDirectory()) {
                return null;
            }
            String string = cursor2.getString(eqi.a());
            if (string == null || eqa.a.contains(string)) {
                return null;
            }
            int i3;
            int i4;
            long j4;
            int i5 = cursor2.getInt(eqi.b());
            if (i2 <= 0 || i <= 0) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(str2);
                    closeable = fileInputStream;
                    try {
                        jxe a = a.a(fileInputStream);
                        akax.a(closeable, null);
                        int i6 = a.a;
                        i2 = a.b;
                        if (i2 <= 0 || i6 <= 0) {
                            return null;
                        }
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("width", Integer.valueOf(i6));
                            contentValues.put("height", Integer.valueOf(i2));
                            int i7 = i2;
                            try {
                                int i8 = i6;
                                this.a.update(Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(String.valueOf(j)).build(), contentValues, "_id= ?", new String[]{String.valueOf(j)});
                                i2 = i7;
                                i = i8;
                            } catch (UnsupportedOperationException unused) {
                                eps = null;
                                return eps;
                            } catch (IllegalArgumentException unused2) {
                                eps = null;
                                return eps;
                            }
                        } catch (UnsupportedOperationException unused3) {
                            eps = null;
                            return eps;
                        } catch (IllegalArgumentException unused4) {
                            eps = null;
                            return eps;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Exception unused5) {
                    return null;
                }
            }
            if (i <= i2 || !(i5 == 90 || i5 == 270)) {
                i3 = i;
                i4 = i2;
            } else {
                i4 = i;
                i3 = i2;
            }
            if (eqi instanceof eqh) {
                j4 = cursor2.getLong(((eqh) eqi).a);
                if (j4 != 0) {
                    j3 = j4;
                }
            } else {
                j3 = cursor2.getLong(eqf2.e);
            }
            j4 = 1000 * j3;
            return new eps.a(j, j2, i3, i4, j4 < System.currentTimeMillis() ? new akqy(j4) : new akqy(j3), i5);
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.cameraroll.providers.CameraRollImageColumns");
        akax.a(closeable, th);
        throw th2;
    }

    private static boolean a(SQLException sQLException) {
        String message = sQLException.getMessage();
        return message != null ? akgc.a((CharSequence) message, (CharSequence) "cloud_server_id", false) : false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc  */
    private final defpackage.epu b(android.database.Cursor r20, defpackage.eqf r21, java.lang.String r22) {
        /*
        r19 = this;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        if (r1 == 0) goto L_0x00f0;
    L_0x0008:
        r3 = r1;
        r3 = (defpackage.eqo) r3;
        r4 = r1.f;
        r4 = r0.getInt(r4);
        r5 = r1.g;
        r5 = r0.getInt(r5);
        r6 = r1.b;
        r8 = r0.getLong(r6);
        r6 = r1.d;
        r10 = r0.getLong(r6);
        r6 = r1.e;
        r6 = r0.getLong(r6);
        r12 = r3.c();
        r12 = r0.getLong(r12);
        r14 = new java.io.File;
        r14.<init>(r2);
        r15 = r14.exists();
        r16 = 0;
        if (r15 == 0) goto L_0x00ef;
    L_0x003e:
        r15 = r14.isDirectory();
        if (r15 == 0) goto L_0x0046;
    L_0x0044:
        goto L_0x00ef;
    L_0x0046:
        r17 = 0;
        if (r4 <= 0) goto L_0x005d;
    L_0x004a:
        if (r5 <= 0) goto L_0x005d;
    L_0x004c:
        r15 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r15 > 0) goto L_0x0051;
    L_0x0050:
        goto L_0x005d;
    L_0x0051:
        r14 = new eqs;
        r14.<init>(r2);
        r14 = (defpackage.epv) r14;
        r15 = r12;
        r12 = r4;
        r13 = r5;
        r4 = r14;
        goto L_0x0096;
    L_0x005d:
        r2 = r19;
        r15 = r2.d;	 Catch:{ adke -> 0x00e8, RuntimeException -> 0x00e0, all -> 0x00d7 }
        r14 = r15.a(r14);	 Catch:{ adke -> 0x00e8, RuntimeException -> 0x00e0, all -> 0x00d7 }
        if (r4 <= 0) goto L_0x0069;
    L_0x0067:
        if (r5 > 0) goto L_0x0076;
    L_0x0069:
        r4 = r14.a();	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        r5 = r14.b();	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        if (r4 <= 0) goto L_0x00d1;
    L_0x0073:
        if (r5 > 0) goto L_0x0076;
    L_0x0075:
        goto L_0x00d1;
    L_0x0076:
        r15 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r15 > 0) goto L_0x007e;
    L_0x007a:
        r12 = r14.e();	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
    L_0x007e:
        r15 = r14.c();	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        r2 = r14.j();	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        r22 = r4;
        r4 = new eqt;	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        r4.<init>(r15, r2);	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        r4 = (defpackage.epv) r4;	 Catch:{ adke -> 0x00ea, RuntimeException -> 0x00e2, all -> 0x00d5 }
        r14.l();
        r15 = r12;
        r12 = r22;
        r13 = r5;
    L_0x0096:
        r2 = r3 instanceof defpackage.eqn;
        if (r2 == 0) goto L_0x00a8;
    L_0x009a:
        r3 = (defpackage.eqn) r3;
        r1 = r3.a;
        r0 = r0.getLong(r1);
        r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1));
        if (r2 == 0) goto L_0x00ae;
    L_0x00a6:
        r6 = r0;
        goto L_0x00ae;
    L_0x00a8:
        r1 = r1.e;
        r6 = r0.getLong(r1);
    L_0x00ae:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r6;
        r2 = java.lang.System.currentTimeMillis();
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 >= 0) goto L_0x00c0;
    L_0x00b9:
        r2 = new akqy;
        r2.<init>(r0);
        r14 = r2;
        goto L_0x00c6;
    L_0x00c0:
        r0 = new akqy;
        r0.<init>(r6);
        r14 = r0;
    L_0x00c6:
        r0 = new epu$b;
        r7 = r0;
        r17 = r4;
        r7.<init>(r8, r10, r12, r13, r14, r15, r17);
        r0 = (defpackage.epu) r0;
        return r0;
    L_0x00d1:
        r14.l();
        return r16;
    L_0x00d5:
        r0 = move-exception;
        goto L_0x00da;
    L_0x00d7:
        r0 = move-exception;
        r14 = r16;
    L_0x00da:
        if (r14 == 0) goto L_0x00df;
    L_0x00dc:
        r14.l();
    L_0x00df:
        throw r0;
    L_0x00e0:
        r14 = r16;
    L_0x00e2:
        if (r14 == 0) goto L_0x00e7;
    L_0x00e4:
        r14.l();
    L_0x00e7:
        return r16;
    L_0x00e8:
        r14 = r16;
    L_0x00ea:
        if (r14 == 0) goto L_0x00ef;
    L_0x00ec:
        r14.l();
    L_0x00ef:
        return r16;
    L_0x00f0:
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type com.snap.cameraroll.providers.CameraRollVideoColumns";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epy.b(android.database.Cursor, eqf, java.lang.String):epu");
    }

    private static boolean b(SQLException sQLException) {
        String message = sQLException.getMessage();
        return message != null ? akgc.a((CharSequence) message, (CharSequence) "oma.drm", false) : false;
    }

    public final int a(String str) {
        if (!this.b.i()) {
            return 0;
        }
        Closeable closeable;
        try {
            Cursor query = this.a.query(this.c, new String[]{"count(*) AS count"}, str, null, null);
            if (query == null) {
                return 0;
            }
            closeable = query;
            int i = !query.moveToFirst() ? 0 : ((Cursor) closeable).getInt(0);
            akax.a(closeable, null);
            return i;
        } catch (SQLException e) {
            if ((epy.a(e) | epy.b(e)) != 0) {
                return 0;
            }
            throw e;
        } catch (Throwable th) {
            akax.a(closeable, th);
        }
    }

    public abstract eqf a(Cursor cursor);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:62:0x00fd in {3, 12, 17, 22, 27, 29, 30, 31, 33, 34, 36, 37, 39, 40, 41, 44, 50, 53, 55, 59, 61} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.List<Media> a(com.google.common.base.Predicate<android.database.Cursor> r16, android.net.Uri r17, java.lang.String r18, java.lang.String[] r19, int r20, int r21) {
        /*
        r15 = this;
        r1 = r15;
        r0 = r16;
        r2 = "java.lang.String.format(format, *args)";
        r3 = "uri";
        r5 = r17;
        defpackage.akcr.b(r5, r3);
        r3 = r1.b;
        r3 = r3.i();
        if (r3 != 0) goto L_0x0019;
        r0 = defpackage.ajyw.a;
        r0 = (java.util.List) r0;
        return r0;
        r3 = "LIMIT %s OFFSET %s";	 Catch:{ SQLException -> 0x00ec }
        r10 = 2;	 Catch:{ SQLException -> 0x00ec }
        r4 = new java.lang.Object[r10];	 Catch:{ SQLException -> 0x00ec }
        r6 = java.lang.Integer.valueOf(r20);	 Catch:{ SQLException -> 0x00ec }
        r11 = 0;	 Catch:{ SQLException -> 0x00ec }
        r4[r11] = r6;	 Catch:{ SQLException -> 0x00ec }
        r6 = java.lang.Integer.valueOf(r21);	 Catch:{ SQLException -> 0x00ec }
        r12 = 1;	 Catch:{ SQLException -> 0x00ec }
        r4[r12] = r6;	 Catch:{ SQLException -> 0x00ec }
        r4 = java.util.Arrays.copyOf(r4, r10);	 Catch:{ SQLException -> 0x00ec }
        r3 = java.lang.String.format(r3, r4);	 Catch:{ SQLException -> 0x00ec }
        defpackage.akcr.a(r3, r2);	 Catch:{ SQLException -> 0x00ec }
        r4 = r1.a;	 Catch:{ SQLException -> 0x00ec }
        r6 = r1.f;	 Catch:{ SQLException -> 0x00ec }
        r7 = "%s %s";	 Catch:{ SQLException -> 0x00ec }
        r8 = new java.lang.Object[r10];	 Catch:{ SQLException -> 0x00ec }
        r9 = r1.g;	 Catch:{ SQLException -> 0x00ec }
        r8[r11] = r9;	 Catch:{ SQLException -> 0x00ec }
        r8[r12] = r3;	 Catch:{ SQLException -> 0x00ec }
        r3 = java.util.Arrays.copyOf(r8, r10);	 Catch:{ SQLException -> 0x00ec }
        r9 = java.lang.String.format(r7, r3);	 Catch:{ SQLException -> 0x00ec }
        defpackage.akcr.a(r9, r2);	 Catch:{ SQLException -> 0x00ec }
        r5 = r17;	 Catch:{ SQLException -> 0x00ec }
        r7 = r18;	 Catch:{ SQLException -> 0x00ec }
        r8 = r19;	 Catch:{ SQLException -> 0x00ec }
        r2 = r4.query(r5, r6, r7, r8, r9);	 Catch:{ SQLException -> 0x00ec }
        if (r2 == 0) goto L_0x00e7;	 Catch:{ SQLException -> 0x00ec }
        r3 = r2;	 Catch:{ SQLException -> 0x00ec }
        r3 = (java.io.Closeable) r3;	 Catch:{ SQLException -> 0x00ec }
        r4 = 0;
        r5 = r3;	 Catch:{ Throwable -> 0x00e0 }
        r5 = (android.database.Cursor) r5;	 Catch:{ Throwable -> 0x00e0 }
        r2 = r2.moveToFirst();	 Catch:{ Throwable -> 0x00e0 }
        if (r2 != 0) goto L_0x006e;	 Catch:{ Throwable -> 0x00e0 }
        r0 = defpackage.ajyw.a;	 Catch:{ Throwable -> 0x00e0 }
        r0 = (java.util.List) r0;	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x00da;	 Catch:{ Throwable -> 0x00e0 }
        r2 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x00e0 }
        r2.<init>();	 Catch:{ Throwable -> 0x00e0 }
        r6 = r15.a(r5);	 Catch:{ Throwable -> 0x00e0 }
        r7 = r5.getCount();	 Catch:{ Throwable -> 0x00e0 }
        r8 = 0;	 Catch:{ Throwable -> 0x00e0 }
        if (r8 >= r7) goto L_0x00d7;	 Catch:{ Throwable -> 0x00e0 }
        r5.moveToPosition(r8);	 Catch:{ Throwable -> 0x00e0 }
        r9 = r6.c;	 Catch:{ Throwable -> 0x00e0 }
        r9 = r5.getString(r9);	 Catch:{ Throwable -> 0x00e0 }
        if (r9 != 0) goto L_0x008a;	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x00d4;	 Catch:{ Throwable -> 0x00e0 }
        r13 = "/data/";	 Catch:{ Throwable -> 0x00e0 }
        r13 = defpackage.akgb.b(r9, r13, r11);	 Catch:{ Throwable -> 0x00e0 }
        if (r13 != 0) goto L_0x00d4;	 Catch:{ Throwable -> 0x00e0 }
        if (r0 == 0) goto L_0x009a;	 Catch:{ Throwable -> 0x00e0 }
        r13 = r0.apply(r5);	 Catch:{ Throwable -> 0x00e0 }
        if (r13 == 0) goto L_0x00d4;	 Catch:{ Throwable -> 0x00e0 }
        r13 = r1.e;	 Catch:{ Throwable -> 0x00e0 }
        r14 = defpackage.epz.a;	 Catch:{ Throwable -> 0x00e0 }
        r13 = r13.ordinal();	 Catch:{ Throwable -> 0x00e0 }
        r13 = r14[r13];	 Catch:{ Throwable -> 0x00e0 }
        r14 = 3;	 Catch:{ Throwable -> 0x00e0 }
        if (r13 == r12) goto L_0x00bd;	 Catch:{ Throwable -> 0x00e0 }
        if (r13 == r10) goto L_0x00bb;	 Catch:{ Throwable -> 0x00e0 }
        if (r13 != r14) goto L_0x00b5;	 Catch:{ Throwable -> 0x00e0 }
        r13 = r6;	 Catch:{ Throwable -> 0x00e0 }
        r13 = (defpackage.eqb) r13;	 Catch:{ Throwable -> 0x00e0 }
        r13 = r13.a;	 Catch:{ Throwable -> 0x00e0 }
        r13 = r5.getInt(r13);	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x00be;	 Catch:{ Throwable -> 0x00e0 }
        r0 = new ajxk;	 Catch:{ Throwable -> 0x00e0 }
        r0.<init>();	 Catch:{ Throwable -> 0x00e0 }
        throw r0;	 Catch:{ Throwable -> 0x00e0 }
        r13 = 3;	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x00be;	 Catch:{ Throwable -> 0x00e0 }
        r13 = 1;	 Catch:{ Throwable -> 0x00e0 }
        if (r13 != r12) goto L_0x00c7;	 Catch:{ Throwable -> 0x00e0 }
        r9 = r15.a(r5, r6, r9);	 Catch:{ Throwable -> 0x00e0 }
        r9 = (defpackage.ept) r9;	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x00cf;	 Catch:{ Throwable -> 0x00e0 }
        if (r13 != r14) goto L_0x00ce;	 Catch:{ Throwable -> 0x00e0 }
        r9 = r15.b(r5, r6, r9);	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x00c4;	 Catch:{ Throwable -> 0x00e0 }
        r9 = r4;	 Catch:{ Throwable -> 0x00e0 }
        if (r9 == 0) goto L_0x00d4;	 Catch:{ Throwable -> 0x00e0 }
        r2.add(r9);	 Catch:{ Throwable -> 0x00e0 }
        r8 = r8 + 1;	 Catch:{ Throwable -> 0x00e0 }
        goto L_0x007c;	 Catch:{ Throwable -> 0x00e0 }
        r0 = r2;	 Catch:{ Throwable -> 0x00e0 }
        r0 = (java.util.List) r0;	 Catch:{ Throwable -> 0x00e0 }
        defpackage.akax.a(r3, r4);	 Catch:{ SQLException -> 0x00ec }
        return r0;
        r0 = move-exception;
        goto L_0x00e3;
        r0 = move-exception;
        r4 = r0;
        throw r4;	 Catch:{ all -> 0x00de }
        defpackage.akax.a(r3, r4);	 Catch:{ SQLException -> 0x00ec }
        throw r0;	 Catch:{ SQLException -> 0x00ec }
        r0 = defpackage.ajyw.a;	 Catch:{ SQLException -> 0x00ec }
        r0 = (java.util.List) r0;	 Catch:{ SQLException -> 0x00ec }
        return r0;
        r0 = move-exception;
        r2 = defpackage.epy.a(r0);
        r3 = defpackage.epy.b(r0);
        r2 = r2 | r3;
        if (r2 == 0) goto L_0x00fa;
        goto L_0x0014;
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epy.a(com.google.common.base.Predicate, android.net.Uri, java.lang.String, java.lang.String[], int, int):java.util.List");
    }
}
