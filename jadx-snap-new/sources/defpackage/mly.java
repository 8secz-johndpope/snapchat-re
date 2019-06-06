package defpackage;

import com.brightcove.player.event.Event;
import com.google.common.io.BaseEncoding;
import java.io.File;

/* renamed from: mly */
public final class mly implements mpd {
    private final mob a;
    private final zfw b;

    /* renamed from: mly$a */
    static final class a<T> implements ajfb<Throwable> {
        private /* synthetic */ File a;

        a(File file) {
            this.a = file;
        }

        public final /* synthetic */ void accept(Object obj) {
            akbf.c(this.a);
        }
    }

    /* renamed from: mly$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ mly a;
        private /* synthetic */ String b;
        private /* synthetic */ File c;
        private /* synthetic */ byte[] d;

        b(mly mly, String str, File file, byte[] bArr) {
            this.a = mly;
            this.b = str;
            this.c = file;
            this.d = bArr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "expected");
            String str2 = this.b;
            obj = ajdx.a((ajea) new c(this.d, str, this.c));
            akcr.a(obj, "Single.create<File> { em…          }\n            }");
            StringBuilder stringBuilder = new StringBuilder("verifying[");
            stringBuilder.append(str2);
            stringBuilder.append(']');
            stringBuilder = new StringBuilder("checksumVerificationFailed[");
            stringBuilder.append(str2);
            stringBuilder.append(']');
            stringBuilder = new StringBuilder("verified[");
            stringBuilder.append(str2);
            stringBuilder.append(']');
            return obj;
        }
    }

    /* renamed from: mly$c */
    static final class c<T> implements ajea<T> {
        private /* synthetic */ byte[] a;
        private /* synthetic */ String b;
        private /* synthetic */ File c;

        c(byte[] bArr, String str, File file) {
            this.a = bArr;
            this.b = str;
            this.c = file;
        }

        public final void subscribe(ajdy<File> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            if (!ajdy.isDisposed()) {
                Object encode = BaseEncoding.base16().encode(this.a);
                if (!akcr.a(this.b, encode)) {
                    akbf.c(this.c);
                    if (!ajdy.isDisposed()) {
                        StringBuilder stringBuilder = new StringBuilder("Checksum mismatch: expected [");
                        stringBuilder.append(this.b);
                        stringBuilder.append("]; actual [");
                        stringBuilder.append(encode);
                        stringBuilder.append(']');
                        ajdy.a((Throwable) new RuntimeException(stringBuilder.toString()));
                    }
                } else if (!ajdy.isDisposed()) {
                    ajdy.a(this.c);
                }
            }
        }
    }

    public mly(mob mob, zfw zfw) {
        akcr.b(mob, "resourceChecksumProvider");
        akcr.b(zfw, "schedulers");
        this.a = mob;
        this.b = zfw;
    }

    public final ajdx<File> a(String str, File file, byte[] bArr) {
        akcr.b(str, "trackingDataName");
        akcr.b(file, "file");
        akcr.b(bArr, "checksum");
        Object e = this.a.a(str).a((ajdw) this.b.b()).e();
        akcr.a(e, "resourceChecksumProvider…          .firstOrError()");
        Object a = e.d((ajfb) new a(file)).a((ajfc) new b(this, str, file, bArr));
        akcr.a(a, "resourceChecksumProvider…le, expected, checksum) }");
        return a;
    }
}
