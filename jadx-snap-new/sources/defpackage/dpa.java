package defpackage;

/* renamed from: dpa */
public interface dpa {

    /* renamed from: dpa$b */
    public enum b {
        SCREENSHOT,
        API,
        POST_PROCESS_SCREENSHOT,
        SCREENSHOT_PLUS,
        API_FALLBACK
    }

    /* renamed from: dpa$c */
    public enum c {
        BITMAP,
        JPEG
    }

    /* renamed from: dpa$a */
    public enum a {
        INVALID_STATE,
        CAPTURE_ERROR
    }

    void a();

    void a(a aVar, String str, boolean z, int i, b bVar);

    void a(b bVar);

    void a(dpb dpb, Integer num, String str, long j, boolean z, int i, b bVar);

    void a(dpb dpb, String str, long j, b bVar);
}
