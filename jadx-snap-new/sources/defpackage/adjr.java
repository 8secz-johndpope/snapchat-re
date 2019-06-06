package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: adjr */
public class adjr {
    public final MediaCodec a;
    public final adgy b;
    private final a c;
    private final adjs d;
    private final boolean e;
    private boolean f = false;
    private BufferInfo g = null;
    private int h = 0;
    private int i = 0;
    private final AtomicInteger j = new AtomicInteger(0);
    private int k = 0;
    private boolean l = false;
    private final long m;

    /* renamed from: adjr$a */
    public enum a {
        DECODER,
        ENCODER
    }

    public adjr(MediaCodec mediaCodec, a aVar, adjs adjs, boolean z, long j, boolean z2, boolean z3) {
        this.a = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.c = (a) Preconditions.checkNotNull(aVar);
        this.d = (adjs) Preconditions.checkNotNull(adjs);
        this.b = new adgy(z3);
        this.e = z2;
        this.m = j;
        adjs.a(this.a);
        if (z) {
            adni.c("Codec was initialized: %s", this.a.toString());
            return;
        }
        l();
        adni.c("Codec was initialized: %s outputBufferInfo %s", this.a.toString(), this.g);
    }

    private int b(long j) {
        StringBuilder stringBuilder;
        Object[] objArr = new Object[1];
        int i = this.i;
        this.i = i + 1;
        objArr[0] = Integer.valueOf(i);
        adni.a("calling dequeueOutputBuffer: %d", objArr);
        try {
            if (this.c == a.DECODER && !d()) {
                return -1;
            }
            this.k++;
            this.b.c();
            int dequeueOutputBuffer = this.a.dequeueOutputBuffer(this.g, j);
            this.b.d();
            adni.a("Done calling dequeueOutputBuffer: %d size: %d Buffer flag is: %d", Integer.valueOf(dequeueOutputBuffer), Integer.valueOf(this.g.size), Integer.valueOf(this.g.flags));
            if (this.j.get() > 0) {
                if (dequeueOutputBuffer >= 0) {
                    this.j.decrementAndGet();
                    this.k = 0;
                } else if (this.k >= k() && this.e) {
                    this.k = 0;
                    this.j.decrementAndGet();
                }
            }
            if (adjr.d(this.g.flags)) {
                adni.a("end of stream, pending: %d, attempt: %d", Integer.valueOf(this.j.get()), Integer.valueOf(this.k));
                this.k = 0;
                this.j.set(0);
            }
            return dequeueOutputBuffer;
        } catch (IllegalStateException e) {
            String concat = "Failed to dequeue output buffer: ".concat(String.valueOf(e));
            if (this.g != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                stringBuilder.append(" outputBufferInfo:[");
                concat = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                stringBuilder.append("offset:");
                stringBuilder.append(this.g.offset);
                concat = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                stringBuilder.append(", size:");
                stringBuilder.append(this.g.size);
                concat = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                stringBuilder.append(", presentationTimeUs:");
                stringBuilder.append(this.g.presentationTimeUs);
                concat = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                stringBuilder.append(", flags:");
                stringBuilder.append(this.g.flags);
                concat = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                concat = "]";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(concat);
                concat = " outputBufferInfo:null";
            }
            stringBuilder.append(concat);
            concat = stringBuilder.toString();
            adni.a(concat, e);
            throw new adkc(concat, e);
        }
    }

    private static boolean d(int i) {
        return (i & 4) != 0;
    }

    private void l() {
        if (VERSION.SDK_INT >= 21) {
            m();
        } else {
            n();
        }
        this.g = new BufferInfo();
        this.f = true;
    }

    @TargetApi(21)
    private void m() {
        try {
            this.a.start();
        } catch (IllegalStateException e) {
            if (e instanceof CodecException) {
                CodecException codecException = (CodecException) e;
                adni.c("Catch codec exception on starting codec: %s", codecException.getDiagnosticInfo());
                StringBuilder stringBuilder;
                if (codecException.isRecoverable()) {
                    this.a.stop();
                    this.d.a(this.a);
                    this.a.start();
                    return;
                } else if (codecException.isTransient()) {
                    stringBuilder = new StringBuilder("Transient codec exception, diagnostic info: ");
                    stringBuilder.append(codecException.getDiagnosticInfo());
                    throw new adkd(stringBuilder.toString(), e);
                } else {
                    stringBuilder = new StringBuilder("Unexpected codec exception, diagnostic info: ");
                    stringBuilder.append(codecException.getDiagnosticInfo());
                    throw new adkd(stringBuilder.toString(), e);
                }
            }
            throw new adkd("Catch IllegalStateException above Lollipop", e);
        }
    }

    private void n() {
        try {
            this.a.start();
        } catch (IllegalStateException e) {
            throw new adkd("Catch IllegalStateException under Lollipop", e);
        }
    }

    public int a(long j) {
        return b(j);
    }

    public ByteBuffer a(int i) {
        return abnl.e ? this.a.getInputBuffer(i) : this.a.getInputBuffers()[i];
    }

    public void a() {
        if (!this.f) {
            l();
        }
    }

    public void a(int i, int i2, int i3, long j, int i4) {
        this.b.c();
        this.a.queueInputBuffer(i, i2, i3, j, i4);
        this.b.d();
        this.j.incrementAndGet();
        this.l = true;
    }

    public void a(int i, boolean z) {
        adni.a("calling releaseOutputBuffer, index=%d, render=%b", Integer.valueOf(i), Boolean.valueOf(z));
        this.b.c();
        try {
            this.a.releaseOutputBuffer(i, z);
        } catch (Exception e) {
            adni.e("Error releasing output buffer, index=%d, render=%b, message=%s", Integer.valueOf(i), Boolean.valueOf(z), e.toString());
        }
        this.b.d();
    }

    public final void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    public int b() {
        return b(this.m);
    }

    public void b(int i) {
        if (i != -1) {
            adni.b("handleDequeueError: %d", Integer.valueOf(i));
            if (i == -2) {
                adni.c("output format changed: %s", this.a.getOutputFormat());
            }
        }
    }

    public int c() {
        long j = this.m;
        Object[] objArr = new Object[1];
        int i = this.h;
        this.h = i + 1;
        objArr[0] = Integer.valueOf(i);
        adni.a("calling dequeueInputBuffer for the: %d time", objArr);
        this.b.c();
        int dequeueInputBuffer = this.a.dequeueInputBuffer(j);
        this.b.d();
        adni.a("Done calling dequeueInputBuffer with ret of %d", Integer.valueOf(dequeueInputBuffer));
        return dequeueInputBuffer;
    }

    public ByteBuffer c(int i) {
        Object outputBuffer = abnl.e ? this.a.getOutputBuffer(i) : this.a.getOutputBuffers()[i];
        Preconditions.checkNotNull(outputBuffer);
        ByteBuffer duplicate = outputBuffer.duplicate();
        duplicate.position(this.g.offset);
        duplicate.limit(this.g.offset + this.g.size);
        return duplicate;
    }

    public final boolean d() {
        return this.j.get() > 0;
    }

    public void e() {
        if (this.f) {
            try {
                this.a.stop();
                this.a.release();
                this.j.set(0);
                this.k = 0;
                this.f = false;
            } catch (Exception e) {
                adni.a("error while releasing mCodec, message: %s", e);
            }
        }
    }

    public boolean f() {
        return (this.g.flags & 2) != 0;
    }

    public BufferInfo g() {
        return this.g;
    }

    public boolean h() {
        return adjr.d(this.g.flags);
    }

    public boolean i() {
        if (d()) {
            return false;
        }
        j();
        return true;
    }

    public void j() {
        if (this.l) {
            this.a.flush();
            this.g = new BufferInfo();
            this.j.set(0);
            this.k = 0;
            this.l = false;
        }
    }

    /* Access modifiers changed, original: protected */
    public int k() {
        return 5;
    }
}
