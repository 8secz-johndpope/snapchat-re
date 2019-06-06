package defpackage;

import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.geg.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: gem */
public final class gem {

    /* renamed from: gem$b */
    public static final class b implements gej {
        final /* synthetic */ Supplier a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;
        private final gdt d = new a(this);
        private /* synthetic */ boolean e;
        private /* synthetic */ Optional f;
        private /* synthetic */ gey g;

        /* renamed from: gem$b$a */
        public static final class a implements gdt {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final String a() {
                return this.a.b;
            }

            public final InputStream b() {
                Object obj = this.a.a.get();
                akcr.a(obj, "inputStreamSupplier.get()");
                return (InputStream) obj;
            }

            public final File c() {
                throw new UnsupportedOperationException();
            }

            public final Uri d() {
                throw new UnsupportedOperationException();
            }

            public final long e() {
                return this.a.c;
            }
        }

        b(boolean z, Supplier supplier, String str, Optional optional, long j, gey gey) {
            this.e = z;
            this.a = supplier;
            this.b = str;
            this.f = optional;
            this.c = j;
            this.g = gey;
        }

        public final boolean a() {
            return this.e;
        }

        public final InputStream b() {
            Object b = this.d.b();
            akcr.a(b, "defaultAsset.openStream()");
            return b;
        }

        public final List<gdt> c() {
            return ajyl.a(this.d);
        }

        public final void close() {
            Closeable closeable = (Closeable) this.f.orNull();
            if (closeable != null) {
                closeable.close();
            }
        }

        public final gej d() {
            return gem.a(this.a, this.b, this.f, this.e, this.c, 32);
        }

        public final gey e() {
            if (this.e) {
                throw new IllegalStateException("Result was successful");
            }
            gey gey = this.g;
            if (gey != null) {
                return gey;
            }
            throw new IllegalStateException("No failure reason provided");
        }

        public final gff f() {
            return new gff(gfc.IMPORT, false, 0, null, null, null, null, 254);
        }
    }

    /* renamed from: gem$h */
    static final class h<T> implements ajfb<gej> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ void accept(Object obj) {
            aklc.a((Closeable) (gej) obj);
        }
    }

    /* renamed from: gem$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ CompressFormat a;
        private /* synthetic */ int b = 60;

        g(CompressFormat compressFormat, int i) {
            this.a = compressFormat;
        }

        public final /* synthetic */ Object apply(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "refCountBitmap");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jwz.a(kaz).compress(this.a, this.b, byteArrayOutputStream);
            kaz.dispose();
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }
    }

    /* renamed from: gem$f */
    public static final class f implements a {
        final /* synthetic */ String a;
        private /* synthetic */ ajdx b;

        /* renamed from: gem$f$a */
        static final class a<T, R> implements ajfc<T, R> {
            private /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                InputStream inputStream = (InputStream) obj;
                akcr.b(inputStream, "inputStream");
                Supplier ofInstance = Suppliers.ofInstance(inputStream);
                akcr.a((Object) ofInstance, "Suppliers.ofInstance(inputStream)");
                String str = this.a.a;
                Optional absent = Optional.absent();
                akcr.a((Object) absent, "Optional.absent()");
                return gem.a(ofInstance, str, absent, false, 0, 56);
            }
        }

        f(ajdx ajdx, String str) {
            this.b = ajdx;
            this.a = str;
        }

        public final ajdx<gej> a() {
            Object f = this.b.f(new a(this));
            akcr.a(f, "inputStream.map { inputS…l.absent())\n            }");
            return f;
        }
    }

    /* renamed from: gem$i */
    public static final class i implements gej {
        private /* synthetic */ List a;
        private /* synthetic */ List b;
        private /* synthetic */ gff c;

        i(List list, List list2, gff gff) {
            this.a = list;
            this.b = list2;
            this.c = gff;
        }

        public final boolean a() {
            return true;
        }

        public final InputStream b() {
            Object b = ((gdt) this.a.get(0)).b();
            akcr.a(b, "flattenAssets[0].openStream()");
            return b;
        }

        public final List<gdt> c() {
            return this.a;
        }

        public final void close() {
            for (gej a : this.b) {
                aklc.a((Closeable) a);
            }
        }

        public final gej d() {
            Iterable<gej> iterable = this.b;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (gej d : iterable) {
                arrayList.add(d.d());
            }
            return gem.a((Iterable) (List) arrayList);
        }

        public final gey e() {
            throw new IllegalStateException("Result succeeds");
        }

        public final gff f() {
            return this.c;
        }
    }

    /* renamed from: gem$c */
    public static final class c implements a {
        private /* synthetic */ ajdx a;

        c(ajdx ajdx) {
            this.a = ajdx;
        }

        public final ajdx<gej> a() {
            return this.a;
        }
    }

    /* renamed from: gem$a */
    public static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "inputStream");
            Supplier ofInstance = Suppliers.ofInstance(inputStream);
            akcr.a((Object) ofInstance, "Suppliers.ofInstance(inputStream)");
            String str = this.a;
            Optional absent = Optional.absent();
            akcr.a((Object) absent, "Optional.absent()");
            return gem.a(ofInstance, str, absent, false, 0, 56);
        }
    }

    /* renamed from: gem$d */
    public static final class d implements a {
        private /* synthetic */ ajdx a;

        d(ajdx ajdx) {
            this.a = ajdx;
        }

        public final ajdx<gej> a() {
            return this.a;
        }
    }

    /* renamed from: gem$e */
    public static final class e implements a {
        private /* synthetic */ InputStream a;
        private /* synthetic */ String b;

        e(InputStream inputStream, String str) {
            this.a = inputStream;
            this.b = str;
        }

        public final ajdx<gej> a() {
            Supplier ofInstance = Suppliers.ofInstance(this.a);
            akcr.a((Object) ofInstance, "Suppliers.ofInstance(inputStream)");
            String str = this.b;
            Optional absent = Optional.absent();
            akcr.a((Object) absent, "Optional.absent()");
            Object b = ajdx.b(gem.a(ofInstance, str, absent, false, 0, 56));
            akcr.a(b, "Single.just(fromInputStr…Name, Optional.absent()))");
            return b;
        }
    }

    public static final ajdx<InputStream> a(ajdx<kaz<jwj>> ajdx, CompressFormat compressFormat) {
        Object f = ajdx.f(new g(compressFormat, 60));
        akcr.a(f, "bitmapProvider.map { ref…(out.toByteArray())\n    }");
        return f;
    }

    public static final ajdx<gej> a(ajdx<gej> ajdx, boolean z) {
        akcr.b(ajdx, "receiver$0");
        return gem.a(z, (ajdx) ajdx);
    }

    public static final ajdx<gej> a(boolean z, ajdx<gej> ajdx) {
        akcr.b(ajdx, "result");
        if (!z) {
            return ajdx;
        }
        Object a = ajdx.a((ajfb) h.a);
        akcr.a(a, "result.doAfterSuccess { IOUtils.closeQuietly(it) }");
        return a;
    }

    public static final gdt a(gej gej, String str) {
        akcr.b(gej, "receiver$0");
        akcr.b(str, "prefix");
        if (gej.a()) {
            if (gej.c().size() == 1) {
                return (gdt) gej.c().get(0);
            }
            for (Object obj : gej.c()) {
                akcr.a(obj, "asset");
                Object a = obj.a();
                akcr.a(a, "asset.name");
                if (akgb.b(a, str, false)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static final a a(ajdx<gej> ajdx) {
        akcr.b(ajdx, "importFrom");
        return new d(ajdx);
    }

    public static final a a(ajdx<InputStream> ajdx, String str) {
        akcr.b(ajdx, "inputStream");
        akcr.b(str, "assetName");
        return new f(ajdx, str);
    }

    private static a a(InputStream inputStream, String str) {
        akcr.b(inputStream, "inputStream");
        akcr.b(str, "assetName");
        return new e(inputStream, str);
    }

    public static final gej a(Supplier<InputStream> supplier, String str, Optional<Closeable> optional, boolean z, long j, gey gey) {
        akcr.b(supplier, "inputStreamSupplier");
        akcr.b(str, "assetName");
        akcr.b(optional, "closeable");
        return new b(z, supplier, str, optional, j, gey);
    }

    public static final gej a(Iterable<? extends gej> iterable) {
        akcr.b(iterable, "results");
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((gej) next).a()) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        Iterable<gej> iterable2 = list;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
        for (gej f : iterable2) {
            arrayList2.add(f.f());
        }
        gff a = gfg.a((List) arrayList2);
        if (list.isEmpty()) {
            return ghx.a.a((Throwable) new IllegalArgumentException("No successful results"), null);
        }
        Collection arrayList3 = new ArrayList();
        for (gej f2 : iterable2) {
            ajyr.a(arrayList3, (Iterable) f2.c());
        }
        return new i((List) arrayList3, list, a);
    }

    public static final gej a(gej... gejArr) {
        akcr.b(gejArr, "results");
        return gem.a((Iterable) ajyi.i(gejArr));
    }

    public static final gdt b(gej gej, String str) {
        akcr.b(gej, "receiver$0");
        akcr.b(str, "prefix");
        if (gej.a()) {
            for (Object obj : gej.c()) {
                akcr.a(obj, "asset");
                Object a = obj.a();
                akcr.a(a, "asset.name");
                if (akgb.b(a, str, false)) {
                    return obj;
                }
            }
        }
        return null;
    }

    public static final a b(ajdx<kaz<jwj>> ajdx, CompressFormat compressFormat) {
        akcr.b(ajdx, "bitmapProvider");
        akcr.b(compressFormat, "compressionFormat");
        return gem.a(gem.a((ajdx) ajdx, compressFormat), "media");
    }

    public static final a c(ajdx<gej> ajdx) {
        akcr.b(ajdx, "contentResult");
        return new c(ajdx);
    }
}
