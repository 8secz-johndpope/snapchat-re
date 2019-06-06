package defpackage;

import java.io.File;

/* renamed from: grq */
public final class grq {
    final igc a;

    /* renamed from: grq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: grq$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return new File(file, "/crash/details");
        }
    }

    /* renamed from: grq$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return new File(file, "/crash/native_crash");
        }
    }

    /* renamed from: grq$c */
    public static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: grq$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return new File(file, "/crash/latest_crash");
        }
    }

    static {
        a aVar = new a();
    }

    public grq(igc igc) {
        akcr.b(igc, "storage");
        this.a = igc;
    }

    public final ajdx<File> a() {
        Object f = this.a.b().f(b.a);
        akcr.a(f, "storage.internalFilesDir…, CRASH_DETAILS_FOLDER) }");
        return f;
    }

    public final ajdx<File> b() {
        Object f = this.a.b().f(d.a);
        akcr.a(f, "storage.internalFilesDir…FOLDER)\n                }");
        return f;
    }
}
