package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.Locale;

/* renamed from: aktg */
public abstract class aktg extends akqz {
    final akra b;

    protected aktg(akra akra) {
        if (akra != null) {
            this.b = akra;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public abstract int a(long j);

    /* Access modifiers changed, original: protected */
    public int a(String str, Locale locale) {
        try {
            str = Integer.parseInt(str);
            return str;
        } catch (NumberFormatException unused) {
            throw new akri(this.b, str);
        }
    }

    public int a(Locale locale) {
        int h = h();
        if (h >= 0) {
            if (h < 10) {
                return 1;
            }
            if (h < 100) {
                return 2;
            }
            if (h < MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
                return 3;
            }
        }
        return Integer.toString(h).length();
    }

    public long a(long j, int i) {
        return d().a(j, i);
    }

    public long a(long j, long j2) {
        return d().a(j, j2);
    }

    public long a(long j, String str, Locale locale) {
        return b(j, a(str, locale));
    }

    public final akra a() {
        return this.b;
    }

    public String a(int i, Locale locale) {
        return Integer.toString(i);
    }

    public String a(long j, Locale locale) {
        return a(a(j), locale);
    }

    public final String a(akrx akrx, Locale locale) {
        return a(akrx.a(this.b), locale);
    }

    public int b(long j, long j2) {
        return d().b(j, j2);
    }

    public abstract long b(long j, int i);

    public final String b() {
        return this.b.x;
    }

    public String b(int i, Locale locale) {
        return a(i, locale);
    }

    public String b(long j, Locale locale) {
        return b(a(j), locale);
    }

    public final String b(akrx akrx, Locale locale) {
        return b(akrx.a(this.b), locale);
    }

    public boolean b(long j) {
        return false;
    }

    public int c(long j) {
        return h();
    }

    public long c(long j, long j2) {
        return d().c(j, j2);
    }

    public final boolean c() {
        return true;
    }

    public abstract long d(long j);

    public abstract akrf d();

    public long e(long j) {
        return j - d(j);
    }

    public akrf f() {
        return null;
    }

    public abstract int h();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DateTimeField[");
        stringBuilder.append(this.b.x);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
