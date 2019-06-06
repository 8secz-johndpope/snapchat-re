package defpackage;

/* renamed from: ajuj */
public final class ajuj<T> {
    public final Object[] a = new Object[5];
    private int b = 4;
    private Object[] c = this.a;
    private int d;

    /* renamed from: ajuj$a */
    public interface a<T> extends ajfl<T> {
        boolean test(T t);
    }

    public final void a(a<? super T> aVar) {
        for (Object[] objArr = this.a; objArr != null; objArr = (Object[]) objArr[4]) {
            int i = 0;
            while (i < 4) {
                Object obj = objArr[i];
                if (obj == null) {
                    continue;
                    break;
                } else if (!aVar.test(obj)) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(T t) {
        int i = this.d;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.c[4] = objArr;
            this.c = objArr;
            i = 0;
        }
        this.c[i] = t;
        this.d = i + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036 A:{LOOP_END, LOOP:1: B:4:0x0006->B:22:0x0036} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0035 A:{SYNTHETIC} */
    public final <U> boolean a(defpackage.akux<? super U> r7) {
        /*
        r6 = this;
        r0 = r6.a;
    L_0x0002:
        r1 = 0;
        if (r0 == 0) goto L_0x003e;
    L_0x0005:
        r2 = 0;
    L_0x0006:
        r3 = 4;
        if (r2 >= r3) goto L_0x0039;
    L_0x0009:
        r4 = r0[r2];
        if (r4 == 0) goto L_0x0039;
    L_0x000d:
        r3 = defpackage.ajuu.COMPLETE;
        r5 = 1;
        if (r4 != r3) goto L_0x0017;
    L_0x0012:
        r7.a();
    L_0x0015:
        r3 = 1;
        goto L_0x0033;
    L_0x0017:
        r3 = r4 instanceof defpackage.ajuu.b;
        if (r3 == 0) goto L_0x0023;
    L_0x001b:
        r4 = (defpackage.ajuu.b) r4;
        r3 = r4.a;
        r7.a(r3);
        goto L_0x0015;
    L_0x0023:
        r3 = r4 instanceof defpackage.ajuu.c;
        if (r3 == 0) goto L_0x002f;
    L_0x0027:
        r4 = (defpackage.ajuu.c) r4;
        r3 = r4.a;
        r7.a(r3);
        goto L_0x0032;
    L_0x002f:
        r7.a(r4);
    L_0x0032:
        r3 = 0;
    L_0x0033:
        if (r3 == 0) goto L_0x0036;
    L_0x0035:
        return r5;
    L_0x0036:
        r2 = r2 + 1;
        goto L_0x0006;
    L_0x0039:
        r0 = r0[r3];
        r0 = (java.lang.Object[]) r0;
        goto L_0x0002;
    L_0x003e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuj.a(akux):boolean");
    }
}
