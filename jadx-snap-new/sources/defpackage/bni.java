package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: bni */
public final class bni implements bnn {
    private static final Constructor<? extends bnk> a;
    private int b = 1;

    static {
        Constructor constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(bnk.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        a = constructor;
    }

    public final synchronized bnk[] a() {
        bnk[] bnkArr;
        bnkArr = new bnk[(a == null ? 12 : 13)];
        bnkArr[0] = new boe(0);
        bnkArr[1] = new bop((byte) 0);
        bnkArr[2] = new bor((byte) 0);
        bnkArr[3] = new boi((byte) 0);
        bnkArr[4] = new bpm();
        bnkArr[5] = new bpk();
        bnkArr[6] = new bqf(this.b);
        bnkArr[7] = new bnx();
        bnkArr[8] = new bpa();
        bnkArr[9] = new bqa();
        bnkArr[10] = new bqh();
        bnkArr[11] = new bnv();
        if (a != null) {
            try {
                bnkArr[12] = (bnk) a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return bnkArr;
    }
}
