package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

/* renamed from: bmv */
public final class bmv {
    public byte[] a;
    public int[] b;
    public int[] c;
    public final CryptoInfo d;
    private byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final a j;

    @TargetApi(24)
    /* renamed from: bmv$a */
    static final class a {
        final CryptoInfo a;
        final Pattern b;

        private a(CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new Pattern(0, 0);
        }

        /* synthetic */ a(CryptoInfo cryptoInfo, byte b) {
            this(cryptoInfo);
        }
    }

    public bmv() {
        a aVar = null;
        this.d = bzo.a >= 16 ? new CryptoInfo() : null;
        if (bzo.a >= 24) {
            aVar = new a(this.d, (byte) 0);
        }
        this.j = aVar;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.g = i;
        this.b = iArr;
        this.c = iArr2;
        this.e = bArr;
        this.a = bArr2;
        this.f = i2;
        this.h = i3;
        this.i = i4;
        if (bzo.a >= 16) {
            CryptoInfo cryptoInfo = this.d;
            cryptoInfo.numSubSamples = this.g;
            cryptoInfo.numBytesOfClearData = this.b;
            cryptoInfo.numBytesOfEncryptedData = this.c;
            cryptoInfo.key = this.e;
            cryptoInfo.iv = this.a;
            cryptoInfo.mode = this.f;
            if (bzo.a >= 24) {
                a aVar = this.j;
                aVar.b.set(this.h, this.i);
                aVar.a.setPattern(aVar.b);
            }
        }
    }
}
