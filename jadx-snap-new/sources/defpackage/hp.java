package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import defpackage.hg.c;
import defpackage.hl.a;
import defpackage.ip.b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: hp */
class hp implements a {

    /* renamed from: hp$a */
    interface a<T> {
        boolean a(T t);

        int b(T t);
    }

    /* renamed from: hp$1 */
    class 1 implements a<b> {
        1() {
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return ((b) obj).d;
        }

        public final /* bridge */ /* synthetic */ int b(Object obj) {
            return ((b) obj).c;
        }
    }

    /* renamed from: hp$2 */
    class 2 implements a<c> {
        2() {
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return ((c) obj).c;
        }

        public final /* bridge */ /* synthetic */ int b(Object obj) {
            return ((c) obj).b;
        }
    }

    hp() {
    }

    protected static Typeface a(Context context, InputStream inputStream) {
        File a = hq.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!hq.a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    private static <T> T a(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.b(t2) - i2) << 1) + (aVar.a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a = hq.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!hq.a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    public Typeface a(Context context, hg.b bVar, Resources resources, int i) {
        c cVar = (c) hp.a(bVar.a, i, new 2());
        return cVar == null ? null : hl.a(context, resources, cVar.d, cVar.a, i);
    }

    public Typeface a(Context context, b[] bVarArr, int i) {
        Throwable th;
        Closeable closeable = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        Closeable openInputStream;
        try {
            openInputStream = context.getContentResolver().openInputStream(a(bVarArr, i).a);
            try {
                Typeface a = hp.a(context, (InputStream) openInputStream);
                hq.a(openInputStream);
                return a;
            } catch (IOException unused) {
                hq.a(openInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                closeable = openInputStream;
                hq.a(closeable);
                throw th;
            }
        } catch (IOException unused2) {
            openInputStream = null;
            hq.a(openInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            hq.a(closeable);
            throw th;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final b a(b[] bVarArr, int i) {
        return (b) hp.a((Object[]) bVarArr, i, new 1());
    }
}
