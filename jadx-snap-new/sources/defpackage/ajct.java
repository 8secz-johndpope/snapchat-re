package defpackage;

import com.google.common.base.Preconditions;
import java.text.ParseException;

/* renamed from: ajct */
public abstract class ajct {
    static final a a = new a();

    /* renamed from: ajct$a */
    static final class a extends ajct {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final ajci a(byte[] bArr) {
            Preconditions.checkNotNull(bArr, "bytes");
            return ajci.b;
        }

        public final byte[] a(ajci ajci) {
            Preconditions.checkNotNull(ajci, "spanContext");
            return new byte[0];
        }
    }

    @Deprecated
    private ajci b(byte[] bArr) {
        try {
            return a(bArr);
        } catch (ajcv e) {
            throw new ParseException(e.toString(), 0);
        }
    }

    public ajci a(byte[] bArr) {
        try {
            return b(bArr);
        } catch (ParseException e) {
            throw new ajcv("Error while parsing.", e);
        }
    }

    public byte[] a(ajci ajci) {
        return a(ajci);
    }
}
