package defpackage;

import com.google.common.base.Supplier;
import com.snap.lenses.app.data.LensesAssetsUploadingHttpInterface;
import defpackage.lnr.b;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: lfi */
public final class lfi implements lnr {
    final Supplier<File> a;
    final akbl<File, byte[]> b;
    final akbw<byte[], byte[], abnb> c;
    final lfm d;
    final Supplier<LensesAssetsUploadingHttpInterface> e;
    final zfw f;
    final ajei g;

    /* renamed from: lfi$a */
    static final class a implements ajda {
        final /* synthetic */ lfi a;
        final /* synthetic */ b b;

        /* renamed from: lfi$a$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            private /* synthetic */ a a;

            2(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                byte[] bArr = (byte[]) obj;
                akcr.b(bArr, "compressedMediaData");
                return ((abnb) this.a.a.c.invoke(this.a.b.c, this.a.b.d)).a(bArr);
            }
        }

        /* renamed from: lfi$a$3 */
        static final class 3<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ a a;

            3(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                byte[] bArr = (byte[]) obj;
                akcr.b(bArr, "encryptedAndCompressedMediaData");
                alfp alfp = new alfp();
                alfp.a(bArr);
                alfp.a(this.a.b.a);
                alfp.b();
                alfp.a();
                alfq alfq = new alfq();
                alfq.a = alfp;
                return ((LensesAssetsUploadingHttpInterface) this.a.a.e.get()).uploadAssets(alfq);
            }
        }

        a(lfi lfi, b bVar) {
            this.a = lfi;
            this.b = bVar;
        }

        public final void subscribe(final ajcy ajcy) {
            akcr.b(ajcy, "it");
            String str = this.b.b.a;
            if (str != null) {
                Object substring = str.substring(5);
                akcr.a(substring, "(this as java.lang.String).substring(startIndex)");
                final File file = new File(substring);
                Object b = ajdx.c((Callable) new Callable<T>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object call() {
                        return (byte[]) this.a.a.b.invoke(file);
                    }
                }).f(new 2(this)).a((ajfc) new 3(this)).b((ajdw) this.a.f.f()).b((ajew) new ajew<Object, Throwable>(this) {
                    final /* synthetic */ a a;

                    /* renamed from: lfi$a$4$1 */
                    static final class 1 implements Runnable {
                        private /* synthetic */ 4 a;

                        1(4 4) {
                            this.a = 4;
                        }

                        public final void run() {
                            this.a.a.a.d.a(file);
                        }
                    }

                    /* renamed from: lfi$a$4$2 */
                    static final class 2 implements Runnable {
                        private /* synthetic */ 4 a;

                        2(4 4) {
                            this.a = 4;
                        }

                        public final void run() {
                            lfm lfm = this.a.a.a.d;
                            Object obj = this.a.a.a.a.get();
                            akcr.a(obj, "assetsCacheDirectorySupplier.get()");
                            lfm.b((File) obj);
                        }
                    }

                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        if (this.a.b.e) {
                            this.a.a.f.f().a((Runnable) new 1(this));
                        }
                        this.a.a.f.f().a((Runnable) new 2(this));
                        ajcy.a();
                    }
                });
                akcr.a(b, "Single.fromCallable { di…e()\n                    }");
                std.a(b, this.a.g);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        }
    }

    public lfi(Supplier<File> supplier, akbl<? super File, byte[]> akbl, akbw<? super byte[], ? super byte[], ? extends abnb> akbw, lfm lfm, Supplier<LensesAssetsUploadingHttpInterface> supplier2, zfw zfw, ajei ajei) {
        akcr.b(supplier, "assetsCacheDirectorySupplier");
        akcr.b(akbl, "directoryCompressor");
        akcr.b(akbw, "encryptionAlgorithmProvider");
        akcr.b(lfm, "fileDeleter");
        akcr.b(supplier2, "lensesAssetsUploadingHttpInterfaceSupplier");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "disposables");
        this.a = supplier;
        this.b = akbl;
        this.c = akbw;
        this.d = lfm;
        this.e = supplier2;
        this.f = zfw;
        this.g = ajei;
    }

    public final ajcx a(b bVar) {
        akcr.b(bVar, "request");
        Object a = ajcx.a((ajda) new a(this, bVar));
        akcr.a(a, "Completable.create {\n   …To(disposables)\n        }");
        return a;
    }
}
