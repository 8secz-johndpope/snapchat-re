package defpackage;

import android.media.MediaExtractor;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: adkj */
public final class adkj {
    final List<Long> a;
    final CountDownLatch b;
    private final adnp c;
    private final List<Integer> d;
    private final List<Long> e;
    private MediaExtractor f;

    public adkj() {
        this(new MediaExtractor());
    }

    private adkj(MediaExtractor mediaExtractor) {
        this.c = adnp.a;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = new ArrayList();
        this.b = new CountDownLatch(1);
        this.f = mediaExtractor;
    }

    public final List<Integer> a() {
        Preconditions.checkState(this.b.getCount() == 0, "key frames indices not ready yet");
        return this.d;
    }

    public final void a(String str) {
        try {
            this.f.setDataSource(str);
        } catch (IOException e) {
            throw new adkd(e);
        }
    }

    public final List<Long> b() {
        Preconditions.checkState(this.b.getCount() == 0, "frames times not ready yet");
        return this.e;
    }

    public final void c() {
        for (int i = 0; i < this.f.getTrackCount(); i++) {
            if (adnp.a(this.f.getTrackFormat(i)).startsWith("video/")) {
                this.f.selectTrack(i);
                break;
            }
        }
        long sampleTime = this.f.getSampleTime();
        long j = sampleTime;
        int sampleFlags = this.f.getSampleFlags();
        Object obj = 1;
        int i2 = 0;
        while (sampleTime != -1) {
            if ((sampleFlags & 1) != 0) {
                this.d.add(Integer.valueOf(i2));
                this.a.add(Long.valueOf(sampleTime));
            }
            this.e.add(Long.valueOf(sampleTime));
            this.f.advance();
            if (sampleTime < j) {
                obj = null;
            }
            j = this.f.getSampleTime();
            sampleFlags = this.f.getSampleFlags();
            i2++;
            long j2 = sampleTime;
            sampleTime = j;
            j = j2;
        }
        if (obj == null) {
            Collections.sort(this.e);
        }
        this.b.countDown();
    }

    public final void d() {
        try {
            this.f.release();
        } catch (Exception unused) {
        }
        this.f = null;
    }
}
