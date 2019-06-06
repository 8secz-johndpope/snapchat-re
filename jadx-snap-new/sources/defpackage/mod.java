package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: mod */
public abstract class mod {
    private final float a;

    /* renamed from: mod$b */
    public static final class b extends mod {
        public static final b a = new b();

        private b() {
            super(1.0f, (byte) 0);
        }
    }

    /* renamed from: mod$c */
    public static final class c extends mod {
        public static final c a = new c();

        private c() {
            super(0.5f, (byte) 0);
        }
    }

    /* renamed from: mod$a */
    public static final class a extends mod {
        public static final a a = new a();

        private a() {
            super(0.75f, (byte) 0);
        }
    }

    /* renamed from: mod$d */
    public static final class d extends mod {
        private final float a;

        public d(float f) {
            super(f, (byte) 0);
            this.a = f;
            f = this.a;
            if (f < MapboxConstants.MINIMUM_ZOOM || f > 1.0f) {
                throw new IllegalArgumentException("Importance should be in between 0 and 1");
            }
        }

        public final float a() {
            return this.a;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (java.lang.Float.compare(r1.a, ((defpackage.mod.d) r2).a) == 0) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.mod.d;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.mod.d) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = java.lang.Float.compare(r0, r2);
            if (r2 != 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mod$d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithCustomImportance(importance=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private mod(float f) {
        this.a = f;
    }

    public /* synthetic */ mod(float f, byte b) {
        this(f);
    }

    public float a() {
        return this.a;
    }
}
