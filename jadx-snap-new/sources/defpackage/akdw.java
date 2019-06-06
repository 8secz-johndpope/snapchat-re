package defpackage;

import java.util.Iterator;

/* renamed from: akdw */
public class akdw implements akdh, Iterable<Integer> {
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: akdw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static akdw a(int i, int i2, int i3) {
            return new akdw(i, i2, i3);
        }
    }

    static {
        a aVar = new a();
    }

    public akdw(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.a = i;
            this.b = akau.a(i, i2, i3);
            this.c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean a() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            if (r2.c == r3.c) goto L_0x0027;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof defpackage.akdw;
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r0 = r2.a();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (defpackage.akdw) r0;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.a;
        r3 = (defpackage.akdw) r3;
        r1 = r3.a;
        if (r0 != r1) goto L_0x0029;
    L_0x001b:
        r0 = r2.b;
        r1 = r3.b;
        if (r0 != r1) goto L_0x0029;
    L_0x0021:
        r0 = r2.c;
        r3 = r3.c;
        if (r0 != r3) goto L_0x0029;
    L_0x0027:
        r3 = 1;
        return r3;
    L_0x0029:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdw.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return a() ? -1 : (((this.a * 31) + this.b) * 31) + this.c;
    }

    public /* synthetic */ Iterator iterator() {
        return new akdx(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder stringBuilder;
        int i;
        String str = " step ";
        if (this.c > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("..");
            stringBuilder.append(this.b);
            stringBuilder.append(str);
            i = this.c;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.b);
            stringBuilder.append(str);
            i = -this.c;
        }
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
