package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: hh */
public final class hh {

    /* renamed from: hh$a */
    public static abstract class a {
        public final void a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                }
            });
        }

        public abstract void a(Typeface typeface);

        public final void a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    a.this.a(typeface);
                }
            });
        }
    }

    public static int a(Resources resources, int i) {
        return VERSION.SDK_INT >= 23 ? resources.getColor(i, null) : resources.getColor(i);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return hh.a(context, i, new TypedValue(), 0, null, false);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = hh.a(context, resources, typedValue, i, i2, aVar, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder("Font resource ID #0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(" could not be retrieved.");
        throw new NotFoundException(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A:{Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073 A:{Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARNING: Missing block: B:28:0x006c, code skipped:
            if (r11 == null) goto L_0x006e;
     */
    private static android.graphics.Typeface a(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, defpackage.hh.a r21, boolean r22) {
        /*
        r0 = r16;
        r8 = r17;
        r1 = r18;
        r9 = r19;
        r10 = r20;
        r11 = r21;
        r12 = "ResourcesCompat";
        r2 = r1.string;
        if (r2 == 0) goto L_0x00d2;
    L_0x0012:
        r1 = r1.string;
        r13 = r1.toString();
        r1 = "res/";
        r1 = r13.startsWith(r1);
        r14 = -3;
        r15 = 0;
        if (r1 != 0) goto L_0x0028;
    L_0x0022:
        if (r11 == 0) goto L_0x0027;
    L_0x0024:
        r11.a(r14, r15);
    L_0x0027:
        return r15;
    L_0x0028:
        r1 = defpackage.hl.b;
        r2 = defpackage.hl.a(r8, r9, r10);
        r1 = r1.a(r2);
        r1 = (android.graphics.Typeface) r1;
        if (r1 == 0) goto L_0x003c;
    L_0x0036:
        if (r11 == 0) goto L_0x003b;
    L_0x0038:
        r11.a(r1, r15);
    L_0x003b:
        return r1;
    L_0x003c:
        r1 = r13.toLowerCase();	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r2 = ".xml";
        r1 = r1.endsWith(r2);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r1 == 0) goto L_0x00a6;
    L_0x0048:
        r1 = r8.getXml(r9);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r1 = defpackage.hg.a(r1, r8);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r1 != 0) goto L_0x005d;
    L_0x0052:
        r0 = "Failed to find font-family tag";
        android.util.Log.e(r12, r0);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r11 == 0) goto L_0x005c;
    L_0x0059:
        r11.a(r14, r15);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
    L_0x005c:
        return r15;
    L_0x005d:
        r2 = r1 instanceof defpackage.hg.d;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0087;
    L_0x0061:
        r1 = (defpackage.hg.d) r1;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r2 = 1;
        r3 = 0;
        if (r22 == 0) goto L_0x006c;
    L_0x0067:
        r4 = r1.c;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r4 != 0) goto L_0x0070;
    L_0x006b:
        goto L_0x006e;
    L_0x006c:
        if (r11 != 0) goto L_0x0070;
    L_0x006e:
        r5 = 1;
        goto L_0x0071;
    L_0x0070:
        r5 = 0;
    L_0x0071:
        if (r22 == 0) goto L_0x0077;
    L_0x0073:
        r2 = r1.b;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r6 = r2;
        goto L_0x0079;
    L_0x0077:
        r2 = -1;
        r6 = -1;
    L_0x0079:
        r2 = r1.a;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r4 = 0;
        r1 = r16;
        r3 = r21;
        r7 = r20;
        r0 = defpackage.ip.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        goto L_0x009a;
    L_0x0087:
        r2 = defpackage.hl.a;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r1 = (defpackage.hg.b) r1;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r0 = r2.a(r0, r1, r8, r10);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r11 == 0) goto L_0x009a;
    L_0x0091:
        if (r0 == 0) goto L_0x0097;
    L_0x0093:
        r11.a(r0, r15);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        goto L_0x009a;
    L_0x0097:
        r11.a(r14, r15);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
    L_0x009a:
        if (r0 == 0) goto L_0x00a5;
    L_0x009c:
        r1 = defpackage.hl.b;	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r2 = defpackage.hl.a(r8, r9, r10);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        r1.a(r2, r0);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
    L_0x00a5:
        return r0;
    L_0x00a6:
        r0 = defpackage.hl.a(r0, r8, r9, r13, r10);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        if (r11 == 0) goto L_0x00b5;
    L_0x00ac:
        if (r0 == 0) goto L_0x00b2;
    L_0x00ae:
        r11.a(r0, r15);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
        goto L_0x00b5;
    L_0x00b2:
        r11.a(r14, r15);	 Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00b6 }
    L_0x00b5:
        return r0;
    L_0x00b6:
        r0 = move-exception;
        r1 = java.lang.String.valueOf(r13);
        r2 = "Failed to read xml resource ";
        goto L_0x00c5;
    L_0x00be:
        r0 = move-exception;
        r1 = java.lang.String.valueOf(r13);
        r2 = "Failed to parse xml resource ";
    L_0x00c5:
        r1 = r2.concat(r1);
        android.util.Log.e(r12, r1, r0);
        if (r11 == 0) goto L_0x00d1;
    L_0x00ce:
        r11.a(r14, r15);
    L_0x00d1:
        return r15;
    L_0x00d2:
        r0 = new android.content.res.Resources$NotFoundException;
        r2 = new java.lang.StringBuilder;
        r3 = "Resource \"";
        r2.<init>(r3);
        r3 = r8.getResourceName(r9);
        r2.append(r3);
        r3 = "\" (";
        r2.append(r3);
        r3 = java.lang.Integer.toHexString(r19);
        r2.append(r3);
        r3 = ") is not a Font: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, hh$a, boolean):android.graphics.Typeface");
    }

    public static Drawable a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
