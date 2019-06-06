package defpackage;

/* renamed from: doe */
public interface doe {

    /* renamed from: doe$a */
    public enum a {
        REQUIRE_CAMERA,
        RELEASE_CAMERA
    }

    /* renamed from: doe$b */
    public enum b {
        OPEN,
        START_PREVIEW,
        STOP_PREVIEW,
        CLOSE
    }

    void a(a aVar, idd idd);

    void a(b bVar, int i);
}
