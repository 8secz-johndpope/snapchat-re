package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.zm.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aci */
public final class aci<Data> implements acq<File, Data> {
    private final d<Data> a;

    /* renamed from: aci$d */
    public interface d<Data> {
        Class<Data> a();

        Data a(File file);

        void a(Data data);
    }

    /* renamed from: aci$a */
    public static class a<Data> implements acr<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        public final acq<File, Data> a(acu acu) {
            return new aci(this.a);
        }
    }

    /* renamed from: aci$c */
    static final class c<Data> implements zm<Data> {
        private final File a;
        private final d<Data> b;
        private Data c;

        c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        public final Class<Data> a() {
            return this.b.a();
        }

        public final void a(yk ykVar, a<? super Data> aVar) {
            try {
                this.c = this.b.a(this.a);
                aVar.a(this.c);
            } catch (FileNotFoundException e) {
                String str = "FileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to open file", e);
                }
                aVar.a(e);
            }
        }

        public final void b() {
            Object obj = this.c;
            if (obj != null) {
                try {
                    this.b.a(obj);
                } catch (IOException unused) {
                }
            }
        }

        public final void c() {
        }

        public final yx d() {
            return yx.LOCAL;
        }
    }

    /* renamed from: aci$b */
    public static class b extends a<ParcelFileDescriptor> {

        /* renamed from: aci$b$1 */
        class 1 implements d<ParcelFileDescriptor> {
            1() {
            }

            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }
        }

        public b() {
            super(new 1());
        }
    }

    /* renamed from: aci$e */
    public static class e extends a<InputStream> {

        /* renamed from: aci$e$1 */
        class 1 implements d<InputStream> {
            1() {
            }

            public final Class<InputStream> a() {
                return InputStream.class;
            }
        }

        public e() {
            super(new 1());
        }
    }

    public aci(d<Data> dVar) {
        this.a = dVar;
    }

    public final /* synthetic */ acq.a a(Object obj, int i, int i2, zf zfVar) {
        File file = (File) obj;
        return new acq.a(new ahb(file), new c(file, this.a));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }
}
