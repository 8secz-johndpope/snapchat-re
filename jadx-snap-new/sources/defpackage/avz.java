package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.File;
import java.util.Arrays;

/* renamed from: avz */
public final class avz {
    public final Uri a;
    public final int b;
    private final a c;
    private final awb d;
    private File e;
    private final boolean f;
    private final boolean g;
    private final avt h;
    private final avk i;
    private final avl j;
    private final auy k;
    private final avh l;
    private final b m;
    private final boolean n;
    private final awc o;
    private final avj p;

    /* renamed from: avz$a */
    public enum a {
        SMALL,
        DEFAULT
    }

    /* renamed from: avz$b */
    public enum b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        private b(int i) {
            this.mValue = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    protected avz(defpackage.awa r7) {
        /*
        r6 = this;
        r6.<init>();
        r0 = r7.e;
        r6.c = r0;
        r0 = r7.a;
        r6.a = r0;
        r0 = r6.a;
        r1 = 1;
        r2 = 0;
        r3 = 0;
        if (r0 == 0) goto L_0x00ae;
    L_0x0012:
        r4 = defpackage.auw.a(r0);
        if (r4 == 0) goto L_0x001b;
    L_0x0018:
        r0 = 0;
        goto L_0x00af;
    L_0x001b:
        r4 = defpackage.auw.d(r0);
        r5 = "file";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x0073;
    L_0x0027:
        r0 = r0.getPath();
        r4 = 46;
        r4 = r0.lastIndexOf(r4);
        if (r4 < 0) goto L_0x0041;
    L_0x0033:
        r5 = r0.length();
        r5 = r5 - r1;
        if (r4 != r5) goto L_0x003b;
    L_0x003a:
        goto L_0x0041;
    L_0x003b:
        r4 = r4 + r1;
        r0 = r0.substring(r4);
        goto L_0x0042;
    L_0x0041:
        r0 = r3;
    L_0x0042:
        if (r0 != 0) goto L_0x0046;
    L_0x0044:
        r0 = r3;
        goto L_0x0060;
    L_0x0046:
        r4 = java.util.Locale.US;
        r0 = r0.toLowerCase(r4);
        r4 = android.webkit.MimeTypeMap.getSingleton();
        r4 = r4.getMimeTypeFromExtension(r0);
        if (r4 != 0) goto L_0x005f;
    L_0x0056:
        r4 = defpackage.aun.a;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        goto L_0x0060;
    L_0x005f:
        r0 = r4;
    L_0x0060:
        if (r0 == 0) goto L_0x006c;
    L_0x0062:
        r4 = "video/";
        r0 = r0.startsWith(r4);
        if (r0 == 0) goto L_0x006c;
    L_0x006a:
        r0 = 1;
        goto L_0x006d;
    L_0x006c:
        r0 = 0;
    L_0x006d:
        if (r0 == 0) goto L_0x0071;
    L_0x006f:
        r0 = 2;
        goto L_0x00af;
    L_0x0071:
        r0 = 3;
        goto L_0x00af;
    L_0x0073:
        r4 = defpackage.auw.d(r0);
        r5 = "content";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x0081;
    L_0x007f:
        r0 = 4;
        goto L_0x00af;
    L_0x0081:
        r4 = defpackage.auw.b(r0);
        if (r4 == 0) goto L_0x0089;
    L_0x0087:
        r0 = 5;
        goto L_0x00af;
    L_0x0089:
        r4 = defpackage.auw.c(r0);
        if (r4 == 0) goto L_0x0091;
    L_0x008f:
        r0 = 6;
        goto L_0x00af;
    L_0x0091:
        r4 = defpackage.auw.d(r0);
        r5 = "data";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x009f;
    L_0x009d:
        r0 = 7;
        goto L_0x00af;
    L_0x009f:
        r0 = defpackage.auw.d(r0);
        r4 = "android.resource";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00ae;
    L_0x00ab:
        r0 = 8;
        goto L_0x00af;
    L_0x00ae:
        r0 = -1;
    L_0x00af:
        r6.b = r0;
        r6.d = r3;
        r6.f = r2;
        r6.g = r2;
        r0 = r7.d;
        r6.h = r0;
        r6.i = r3;
        r0 = r7.c;
        if (r0 != 0) goto L_0x00c4;
    L_0x00c1:
        r0 = defpackage.avl.a;
        goto L_0x00c6;
    L_0x00c4:
        r0 = r7.c;
    L_0x00c6:
        r6.j = r0;
        r6.k = r3;
        r0 = r7.f;
        r6.l = r0;
        r0 = r7.b;
        r6.m = r0;
        r0 = r7.g;
        if (r0 == 0) goto L_0x00df;
    L_0x00d6:
        r7 = r7.a;
        r7 = defpackage.auw.a(r7);
        if (r7 == 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00e0;
    L_0x00df:
        r1 = 0;
    L_0x00e0:
        r6.n = r1;
        r6.o = r3;
        r6.p = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avz.<init>(awa):void");
    }

    public final synchronized File a() {
        if (this.e == null) {
            this.e = new File(this.a.getPath());
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avz)) {
            return false;
        }
        avz avz = (avz) obj;
        return aug.a(this.a, avz.a) && aug.a(this.c, avz.c) && aug.a(null, null) && aug.a(this.e, avz.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, null, this.e});
    }

    public final String toString() {
        return aug.a(this).a(MessageMediaRefModel.URI, this.a).a("cacheChoice", this.c).a("decodeOptions", this.h).a("postprocessor", null).a("priority", this.l).a("resizeOptions", null).a("rotationOptions", this.j).a("bytesRange", null).a("mediaVariations", null).toString();
    }
}
