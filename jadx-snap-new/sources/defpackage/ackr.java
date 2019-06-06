package defpackage;

/* renamed from: ackr */
public final class ackr {
    public boolean a = true;
    public boolean b = true;
    boolean c = true;
    public a d = a.MARKER_DRAWING_PRIORITY;

    /* renamed from: ackr$a */
    public enum a {
        MARKER_DRAWING_PRIORITY,
        THUMBNAILS_FIRST,
        MARKERS_FIRST
    }

    public final ackr a(boolean z) {
        this.a = z;
        return this;
    }

    public final void a() {
        this.a = true;
        this.b = false;
    }

    public final void a(a aVar) {
        this.d = aVar;
    }
}
