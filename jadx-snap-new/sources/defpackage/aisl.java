package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aisl */
public abstract class aisl<T> {
    private Context a;
    protected final airh b;
    public aism c;
    public List<aisn> d = new CopyOnWriteArrayList();
    private aisk<T> e;
    private final int f;
    private volatile long g;

    /* renamed from: aisl$1 */
    class 1 implements Comparator<a> {
        1() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) (((a) obj).b - ((a) obj2).b);
        }
    }

    /* renamed from: aisl$a */
    static class a {
        final File a;
        final long b;

        public a(File file, long j) {
            this.a = file;
            this.b = j;
        }
    }

    public aisl(Context context, aisk<T> aisk, airh airh, aism aism) {
        this.a = context.getApplicationContext();
        this.e = aisk;
        this.c = aism;
        this.b = airh;
        this.g = this.b.a();
        this.f = 100;
    }

    private static long a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private void g() {
        for (aisn a : this.d) {
            try {
                a.a();
            } catch (Exception unused) {
                airf.b(this.a, "One of the roll over listeners threw an exception");
            }
        }
    }

    public abstract String a();

    public final void a(T t) {
        byte[] a = this.e.a(t);
        if (!this.c.a(a.length, c())) {
            airf.c(this.a, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.c.a()), Integer.valueOf(r0), Integer.valueOf(c())}));
            d();
        }
        this.c.a(a);
    }

    /* Access modifiers changed, original: protected */
    public int b() {
        return 100;
    }

    /* Access modifiers changed, original: protected */
    public int c() {
        return 8000;
    }

    public final boolean d() {
        boolean z = true;
        if (this.c.b()) {
            z = false;
        } else {
            this.c.a(a());
            airf.c(this.a, String.format(Locale.US, "generated new file %s", new Object[]{r0}));
            this.g = this.b.a();
        }
        g();
        return z;
    }

    public final List<File> e() {
        return this.c.c();
    }

    public final void f() {
        List<File> d = this.c.d();
        int b = b();
        if (d.size() > b) {
            int size = d.size() - b;
            airf.a(this.a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(d.size()), Integer.valueOf(b), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new 1());
            for (File file : d) {
                treeSet.add(new a(file, aisl.a(file.getName())));
            }
            List d2 = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                d2.add(((a) it.next()).a);
                if (d2.size() == size) {
                    break;
                }
            }
            this.c.a(d2);
        }
    }
}
