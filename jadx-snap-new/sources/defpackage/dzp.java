package defpackage;

import android.os.Build;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

/* renamed from: dzp */
public final class dzp {
    private final dpf a;
    private final Supplier<eca> b;

    /* renamed from: dzp$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[edi.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.edi.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.edi.VIDEONOTE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.edi.MAIN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.edi.BACKGROUND;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.edi.VIDEOCHAT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dzp$1.<clinit>():void");
        }
    }

    public dzp(Supplier<eca> supplier) {
        this(dpg.a(), supplier);
    }

    private dzp(dpf dpf, Supplier<eca> supplier) {
        this.a = dpf;
        this.b = supplier;
    }

    public final List<dzo> a(edi edi) {
        Object dzm;
        Builder builder = ImmutableList.builder();
        if (dzj.a.contains(Build.MODEL)) {
            builder.add(new dzj());
        }
        int i = 1.a[edi.ordinal()];
        if (i == 1 || i == 2) {
            builder.add(this.a.H() ? new dzi() : new dzs());
            builder.add(new dzl(this.b));
            builder.add(this.a.J() ? new dzh(this.b) : new dzr(this.b));
            builder.add(new dzg());
            builder.add(new dzk());
            if (this.a.ak()) {
                dzm = new dzm();
            }
            return builder.build();
        } else if (i != 3) {
            if (i == 4) {
                builder.add(this.a.H() ? new dzu() : new dzt());
                dzm = new dzl(this.b);
            }
            return builder.build();
        } else {
            builder.add(this.a.H() ? new dzi() : new dzs());
            dzm = new dzl(this.b);
        }
        builder.add(dzm);
        return builder.build();
    }
}
