package defpackage;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: bmi */
final class bmi {
    final a a;
    int b;
    long c;
    long d;
    long e;
    long f;

    @TargetApi(19)
    /* renamed from: bmi$a */
    static final class a {
        final AudioTrack a;
        final AudioTimestamp b = new AudioTimestamp();
        long c;
        long d;
        long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public final long a() {
            return this.b.nanoTime / 1000;
        }
    }

    public bmi(AudioTrack audioTrack) {
        if (bzo.a >= 19) {
            this.a = new a(audioTrack);
            a();
            return;
        }
        this.a = null;
        a(3);
    }

    public final void a() {
        if (this.a != null) {
            a(0);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        this.b = i;
        long j = 5000;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.d = 5000;
            return;
        } else if (i == 2 || i == 3) {
            j = 10000000;
        } else if (i == 4) {
            j = 500000;
        } else {
            throw new IllegalStateException();
        }
        this.d = j;
    }

    public final long b() {
        a aVar = this.a;
        return aVar != null ? aVar.a() : -9223372036854775807L;
    }

    public final long c() {
        a aVar = this.a;
        return aVar != null ? aVar.e : -1;
    }
}
