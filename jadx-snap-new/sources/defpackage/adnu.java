package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: adnu */
public final class adnu {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    private final boolean f;
    private final a g;

    /* renamed from: adnu$a */
    public enum a {
        INSUFFICIENT_MEMORY,
        INVALID_MEDIA
    }

    public adnu(a aVar) {
        this.a = false;
        this.b = false;
        this.f = false;
        this.g = aVar;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public adnu(boolean z, boolean z2, int i, int i2, int i3) {
        this.a = true;
        this.b = z;
        this.f = z2;
        this.g = null;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final a c() {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("playback_rewind_supported", this.a).add("encoding_rewind_supported", this.b).add("rewind_not_supported_reason", this.g).add("buffer_pool_size", this.c).toString();
    }
}
