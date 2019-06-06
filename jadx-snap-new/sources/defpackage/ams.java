package defpackage;

import java.io.File;
import java.io.InputStream;

/* renamed from: ams */
public final class ams implements aof<InputStream, File> {
    private static final a a = new a();
    private final aiq<File, File> b = new amp();
    private final ain<InputStream> c = new akz();

    /* renamed from: ams$a */
    static class a implements aiq<InputStream, File> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ ajn a(Object obj, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        public final String a() {
            return "";
        }
    }

    public final aiq<File, File> a() {
        return this.b;
    }

    public final aiq<InputStream, File> b() {
        return a;
    }

    public final ain<InputStream> c() {
        return this.c;
    }

    public final air<File> d() {
        return alr.a;
    }
}
