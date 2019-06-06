package defpackage;

/* renamed from: rzf */
public interface rzf<Req extends sak> {

    /* renamed from: rzf$a */
    public enum a {
        METADATA,
        SMALL_MEDIA,
        LARGE_MEDIA,
        UPLOAD,
        STREAMING,
        METADATA_AND_UPLOAD
    }

    Req a();

    long b();

    String c();

    a d();
}
