package defpackage;

import defpackage.zm.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: ace */
public final class ace<Data> implements acq<byte[], Data> {
    private final b<Data> a;

    /* renamed from: ace$b */
    public interface b<Data> {
        Class<Data> a();

        Data a(byte[] bArr);
    }

    /* renamed from: ace$a */
    public static class a implements acr<byte[], ByteBuffer> {

        /* renamed from: ace$a$1 */
        class 1 implements b<ByteBuffer> {
            1() {
            }

            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final /* synthetic */ Object a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final acq<byte[], ByteBuffer> a(acu acu) {
            return new ace(new 1());
        }
    }

    /* renamed from: ace$c */
    static class c<Data> implements zm<Data> {
        private final byte[] a;
        private final b<Data> b;

        c(byte[] bArr, b<Data> bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        public final Class<Data> a() {
            return this.b.a();
        }

        public final void a(yk ykVar, a<? super Data> aVar) {
            aVar.a(this.b.a(this.a));
        }

        public final void b() {
        }

        public final void c() {
        }

        public final yx d() {
            return yx.LOCAL;
        }
    }

    /* renamed from: ace$d */
    public static class d implements acr<byte[], InputStream> {

        /* renamed from: ace$d$1 */
        class 1 implements b<InputStream> {
            1() {
            }

            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final /* synthetic */ Object a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final acq<byte[], InputStream> a(acu acu) {
            return new ace(new 1());
        }
    }

    public ace(b<Data> bVar) {
        this.a = bVar;
    }

    public final /* synthetic */ acq.a a(Object obj, int i, int i2, zf zfVar) {
        byte[] bArr = (byte[]) obj;
        return new acq.a(new ahb(bArr), new c(bArr, this.a));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }
}
