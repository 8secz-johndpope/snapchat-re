package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import java.io.IOException;
import java.util.Locale;

/* renamed from: akty */
public final class akty {
    public final akui a;
    public final akug b;
    public final Locale c;
    public final boolean d;
    public final akqx e;
    public final akrc f;
    public final Integer g;
    public final int h;

    akty(akui akui, akug akug) {
        this.a = akui;
        this.b = akug;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS;
    }

    public akty(akui akui, akug akug, Locale locale, boolean z, akqx akqx, akrc akrc, Integer num, int i) {
        this.a = akui;
        this.b = akug;
        this.c = locale;
        this.d = z;
        this.e = akqx;
        this.f = akrc;
        this.g = num;
        this.h = i;
    }

    private akqx a(akqx akqx) {
        akqx = akrb.a(akqx);
        akqx akqx2 = this.e;
        if (akqx2 != null) {
            akqx = akqx2;
        }
        akrc akrc = this.f;
        return akrc != null ? akqx.a(akrc) : akqx;
    }

    private akui a() {
        akui akui = this.a;
        if (akui != null) {
            return akui;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private void a(Appendable appendable, long j, akqx akqx) {
        long j2 = j;
        akui a = a();
        akqx a2 = a(akqx);
        akrc a3 = a2.a();
        int b = a3.b(j2);
        long j3 = (long) b;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j3 ^ j2) >= 0) {
            a3 = akrc.a;
            b = 0;
            j4 = j2;
        }
        akui akui = a;
        Appendable appendable2 = appendable;
        long j5 = j4;
        akui.a(appendable2, j5, a2.b(), b, a3, this.c);
    }

    private akug b() {
        akug akug = this.b;
        if (akug != null) {
            return akug;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    public final long a(String str) {
        return new akub(a(this.e), this.c, this.g, this.h).a(b(), (CharSequence) str);
    }

    public final akty a(akrc akrc) {
        if (this.f == akrc) {
            return this;
        }
        return new akty(this.a, this.b, this.c, false, this.e, akrc, this.g, this.h);
    }

    public final akty a(Locale locale) {
        Locale locale2 = this.c;
        if (locale == locale2 || (locale != null && locale.equals(locale2))) {
            return this;
        }
        return new akty(this.a, this.b, locale, this.d, this.e, this.f, this.g, this.h);
    }

    public final String a(long j) {
        StringBuilder stringBuilder = new StringBuilder(a().a());
        try {
            a(stringBuilder, j, null);
        } catch (IOException unused) {
        }
        return stringBuilder.toString();
    }

    public final String a(akrw akrw) {
        StringBuilder stringBuilder = new StringBuilder(a().a());
        try {
            a(stringBuilder, akrb.a(akrw), akrb.b(akrw));
        } catch (IOException unused) {
        }
        return stringBuilder.toString();
    }

    public final String a(akrx akrx) {
        StringBuilder stringBuilder = new StringBuilder(a().a());
        try {
            a().a(stringBuilder, akrx, this.c);
        } catch (IOException unused) {
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    public final defpackage.akqy b(java.lang.String r7) {
        /*
        r6 = this;
        r0 = r6.b();
        r1 = 0;
        r1 = r6.a(r1);
        r2 = new akub;
        r3 = r6.c;
        r4 = r6.g;
        r5 = r6.h;
        r2.<init>(r1, r3, r4, r5);
        r3 = 0;
        r0 = r0.a(r2, r7, r3);
        if (r0 < 0) goto L_0x0050;
    L_0x001b:
        r3 = r7.length();
        if (r0 < r3) goto L_0x0052;
    L_0x0021:
        r3 = r2.a(r7);
        r7 = r6.d;
        if (r7 == 0) goto L_0x0038;
    L_0x0029:
        r7 = r2.d;
        if (r7 == 0) goto L_0x0038;
    L_0x002d:
        r7 = r2.d;
        r7 = r7.intValue();
        r7 = defpackage.akrc.a(r7);
        goto L_0x003e;
    L_0x0038:
        r7 = r2.c;
        if (r7 == 0) goto L_0x0042;
    L_0x003c:
        r7 = r2.c;
    L_0x003e:
        r1 = r1.a(r7);
    L_0x0042:
        r7 = new akqy;
        r7.<init>(r3, r1);
        r0 = r6.f;
        if (r0 == 0) goto L_0x004f;
    L_0x004b:
        r7 = r7.a(r0);
    L_0x004f:
        return r7;
    L_0x0050:
        r0 = r0 ^ -1;
    L_0x0052:
        r1 = new java.lang.IllegalArgumentException;
        r7 = defpackage.akud.a(r7, r0);
        r1.<init>(r7);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akty.b(java.lang.String):akqy");
    }
}
