package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;
import java.util.Set;

/* renamed from: adiw */
public final class adiw extends adiv {
    public volatile a a;
    private final Set<adiv> b;
    private final adhk c;
    private adne d;

    /* renamed from: adiw$b */
    public enum b {
        HORIZONTAL,
        VERTICAL
    }

    /* renamed from: adiw$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[b.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.adiw.b.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.adiw.b.HORIZONTAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.adiw.b.VERTICAL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adiw$1.<clinit>():void");
        }
    }

    /* renamed from: adiw$a */
    public static class a {
        public final adiv a;
        public final adiv b;
        public final b c;
        public final float d;
        public List<adie> e = null;

        public a(adiv adiv, adiv adiv2, b bVar, float f) {
            this.a = (adiv) Preconditions.checkNotNull(adiv);
            this.b = (adiv) Preconditions.checkNotNull(adiv2);
            this.c = (b) Preconditions.checkNotNull(bVar);
            this.d = Math.min(1.0f, Math.max(MapboxConstants.MINIMUM_ZOOM, f));
        }

        public a(adiv adiv, adiv adiv2, b bVar, List<adie> list) {
            this.a = (adiv) Preconditions.checkNotNull(adiv);
            this.b = (adiv) Preconditions.checkNotNull(adiv2);
            this.c = (b) Preconditions.checkNotNull(bVar);
            this.d = Math.min(1.0f, Math.max(MapboxConstants.MINIMUM_ZOOM, 0.5f));
            this.e = list;
        }
    }

    public adiw(Set<adiv> set, a aVar) {
        this(set, aVar, adhk.a);
    }

    private adiw(Set<adiv> set, a aVar, adhk adhk) {
        Preconditions.checkArgument(set.size() >= 2);
        this.b = set;
        this.c = adhk;
        a(aVar);
    }

    private static void a(adiv adiv, int i, long j, adie adie, int[] iArr, adhu adhu) {
        adhu adhu2 = adhu;
        GLES20.glScissor(iArr[0], iArr[1], iArr[2], iArr[3]);
        adiv.a(i, j, adie, new adhu(adhu2.a, adhu2.b, adhu2.c, adhu2.d, iArr));
    }

    private static int[] a(adhu adhu) {
        if (adhu.e != null) {
            return adhu.e;
        }
        return new int[]{0, 0, adhu.a, adhu.b};
    }

    public final void a(int i, int i2, adic adic) {
        for (adiv a : this.b) {
            a.a(i, i2, adic);
        }
    }

    /* JADX WARNING: Missing block: B:7:0x0068, code skipped:
            if (r1.d < 1.0f) goto L_0x006a;
     */
    /* JADX WARNING: Missing block: B:15:0x00d9, code skipped:
            if (r1.d < 1.0f) goto L_0x006a;
     */
    public final void a(int r23, long r24, defpackage.adie r26, defpackage.adhu r27) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r0.a;
        r2 = 3089; // 0xc11 float:4.329E-42 double:1.526E-320;
        android.opengl.GLES20.glEnable(r2);
        r3 = defpackage.adiw.1.a;
        r4 = r1.c;
        r4 = r4.ordinal();
        r3 = r3[r4];
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 0;
        r6 = 4;
        r7 = 3;
        r8 = 0;
        r9 = 2;
        r10 = 1;
        if (r3 == r10) goto L_0x0090;
    L_0x001d:
        if (r3 != r9) goto L_0x007a;
    L_0x001f:
        r3 = defpackage.adiw.a(r27);
        r11 = r1.d;
        r12 = r3[r7];
        r12 = (float) r12;
        r11 = r11 * r12;
        r11 = (int) r11;
        r14 = new int[r6];
        r12 = r3[r8];
        r14[r8] = r12;
        r12 = r3[r10];
        r14[r10] = r12;
        r12 = r3[r9];
        r14[r9] = r12;
        r14[r7] = r11;
        r12 = r3[r7];
        r12 = r12 - r11;
        r6 = new int[r6];
        r13 = r3[r8];
        r6[r8] = r13;
        r8 = r3[r10];
        r8 = r8 + r11;
        r6[r10] = r8;
        r3 = r3[r9];
        r6[r9] = r3;
        r6[r7] = r12;
        r3 = r1.d;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 <= 0) goto L_0x0064;
    L_0x0054:
        r12 = r1.a;
        r13 = r23;
        r3 = r14;
        r14 = r24;
        r16 = r26;
        r17 = r3;
        r18 = r27;
        defpackage.adiw.a(r12, r13, r14, r16, r17, r18);
    L_0x0064:
        r3 = r1.d;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x00dc;
    L_0x006a:
        r15 = r1.b;
        r16 = r23;
        r17 = r24;
        r19 = r26;
        r20 = r6;
        r21 = r27;
        defpackage.adiw.a(r15, r16, r17, r19, r20, r21);
        goto L_0x00dc;
    L_0x007a:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = "Unsupported orientation: ";
        r3.<init>(r4);
        r1 = r1.c;
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x0090:
        r3 = defpackage.adiw.a(r27);
        r11 = r1.d;
        r12 = r3[r9];
        r12 = (float) r12;
        r11 = r11 * r12;
        r11 = (int) r11;
        r14 = new int[r6];
        r12 = r3[r8];
        r14[r8] = r12;
        r12 = r3[r10];
        r14[r10] = r12;
        r14[r9] = r11;
        r12 = r3[r7];
        r14[r7] = r12;
        r12 = r3[r9];
        r12 = r12 - r11;
        r6 = new int[r6];
        r13 = r3[r8];
        r13 = r13 + r11;
        r6[r8] = r13;
        r8 = r3[r10];
        r6[r10] = r8;
        r6[r9] = r12;
        r3 = r3[r7];
        r6[r7] = r3;
        r3 = r1.d;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 <= 0) goto L_0x00d5;
    L_0x00c5:
        r12 = r1.a;
        r13 = r23;
        r3 = r14;
        r14 = r24;
        r16 = r26;
        r17 = r3;
        r18 = r27;
        defpackage.adiw.a(r12, r13, r14, r16, r17, r18);
    L_0x00d5:
        r3 = r1.d;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x00dc;
    L_0x00db:
        goto L_0x006a;
    L_0x00dc:
        android.opengl.GLES20.glDisable(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adiw.a(int, long, adie, adhu):void");
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        this.d = adne;
        int i3 = 0;
        for (adiv adiv : this.b) {
            adie a;
            int i4;
            if (this.a.e != null) {
                adie adie3 = adie;
                a = ((adie) this.a.e.get(i3)).a(adie);
                i4 = i3 + 1;
            } else {
                i4 = i3;
                a = adie;
            }
            adiv.a(a, adie2, i, i2, adic, adne, adhz);
            i3 = i4;
        }
    }

    public final void a(a aVar) {
        Preconditions.checkArgument(this.b.contains(aVar.a));
        Preconditions.checkArgument(this.b.contains(aVar.b));
        if (aVar.e != null) {
            Preconditions.checkArgument(this.b.size() == aVar.e.size());
        }
        this.a = aVar;
        adne adne = this.d;
        if (adne != null) {
            adne.a();
        }
    }

    public final void e() {
        for (adiv e : this.b) {
            e.e();
        }
    }
}
