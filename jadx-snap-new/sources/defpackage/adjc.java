package defpackage;

import android.media.MediaFormat;
import defpackage.adiy.a;

/* renamed from: adjc */
public final class adjc {
    private static final adiy e = adiy.a(a.VIDEO);
    private static final adiy f = adiy.a(a.AUDIO);
    public final a a;
    public final MediaFormat b;
    public boolean c;
    public long d;
    private final adiy g;

    /* renamed from: adjc$a */
    public enum a {
        VIDEO("video/avc", true),
        AUDIO("audio/mp4a-latm", false);
        
        public final String value;
        public final boolean video;

        private a(String str, boolean z) {
            this.value = str;
            this.video = z;
        }
    }

    public adjc(a aVar, MediaFormat mediaFormat) {
        this(aVar, mediaFormat, null);
    }

    public adjc(a aVar, MediaFormat mediaFormat, adiy adiy) {
        this.d = -1;
        this.a = aVar;
        this.b = mediaFormat;
        this.g = adiy;
        this.c = false;
    }

    public final MediaFormat a() {
        return this.b;
    }

    public final adiy b() {
        return this.c ? this.a.video ? e : f : this.g;
    }

    public final boolean c() {
        return this.c;
    }
}
