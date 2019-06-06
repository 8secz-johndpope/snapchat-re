package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: mvy */
public final class mvy {
    public static final mvy c = new mvy(mvb.NONE, ajyy.a);
    public static final mvy d;
    public final mvb a;
    public final Set<muz> b;

    /* renamed from: mvy$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        mvb mvb = mvb.MIXED_FACING;
        Object allOf = EnumSet.allOf(muz.class);
        akcr.a(allOf, "EnumSet.allOf(LensApplicableContext::class.java)");
        d = new mvy(mvb, (Set) allOf);
    }

    public mvy(mvb mvb, Set<? extends muz> set) {
        akcr.b(mvb, "cameraContext");
        akcr.b(set, "applicableContexts");
        this.a = mvb;
        this.b = set;
    }

    public static /* synthetic */ mvy a(mvy mvy, Set set) {
        mvb mvb = mvy.a;
        akcr.b(mvb, "cameraContext");
        akcr.b(set, "applicableContexts");
        return new mvy(mvb, set);
    }

    public final boolean a(mvy mvy) {
        akcr.b(mvy, "lensContext");
        return this.a.a(mvy.a) && (ajyu.b((Iterable) this.b, (Iterable) mvy.b).isEmpty() ^ 1) != 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.mvy;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.mvy) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        mvb mvb = this.a;
        int i = 0;
        int hashCode = (mvb != null ? mvb.hashCode() : 0) * 31;
        Set set = this.b;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensContext(cameraContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", applicableContexts=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
