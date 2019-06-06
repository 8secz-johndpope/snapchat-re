package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: akfq */
final class akfq implements akez<akdy> {
    final CharSequence a;
    final int b = 0;
    final int c;
    final akbw<CharSequence, Integer, ajxm<Integer, Integer>> d;

    /* renamed from: akfq$a */
    public static final class a implements akdh, Iterator<akdy> {
        private int a = -1;
        private int b;
        private int c;
        private akdy d;
        private int e;
        private /* synthetic */ akfq f;

        a(akfq akfq) {
            this.f = akfq;
            this.b = akef.d(0, akfq.a.length());
            this.c = this.b;
        }

        /* JADX WARNING: Missing block: B:7:0x001e, code skipped:
            if (r6.e < r6.f.c) goto L_0x0020;
     */
        private final void a() {
            /*
            r6 = this;
            r0 = r6.c;
            r1 = 0;
            if (r0 >= 0) goto L_0x000b;
        L_0x0005:
            r6.a = r1;
            r0 = 0;
            r6.d = r0;
            return;
        L_0x000b:
            r0 = r6.f;
            r0 = r0.c;
            r2 = -1;
            r3 = 1;
            if (r0 <= 0) goto L_0x0020;
        L_0x0013:
            r0 = r6.e;
            r0 = r0 + r3;
            r6.e = r0;
            r0 = r6.e;
            r4 = r6.f;
            r4 = r4.c;
            if (r0 >= r4) goto L_0x002c;
        L_0x0020:
            r0 = r6.c;
            r4 = r6.f;
            r4 = r4.a;
            r4 = r4.length();
            if (r0 <= r4) goto L_0x0040;
        L_0x002c:
            r0 = r6.b;
            r1 = new akdy;
            r4 = r6.f;
            r4 = r4.a;
            r4 = defpackage.akgc.d(r4);
            r1.<init>(r0, r4);
        L_0x003b:
            r6.d = r1;
        L_0x003d:
            r6.c = r2;
            goto L_0x0088;
        L_0x0040:
            r0 = r6.f;
            r0 = r0.d;
            r4 = r6.f;
            r4 = r4.a;
            r5 = r6.c;
            r5 = java.lang.Integer.valueOf(r5);
            r0 = r0.invoke(r4, r5);
            r0 = (defpackage.ajxm) r0;
            if (r0 != 0) goto L_0x0066;
        L_0x0056:
            r0 = r6.b;
            r1 = new akdy;
            r4 = r6.f;
            r4 = r4.a;
            r4 = defpackage.akgc.d(r4);
            r1.<init>(r0, r4);
            goto L_0x003b;
        L_0x0066:
            r2 = r0.a;
            r2 = (java.lang.Number) r2;
            r2 = r2.intValue();
            r0 = r0.b;
            r0 = (java.lang.Number) r0;
            r0 = r0.intValue();
            r4 = r6.b;
            r4 = defpackage.akef.a(r4, r2);
            r6.d = r4;
            r2 = r2 + r0;
            r6.b = r2;
            r2 = r6.b;
            if (r0 != 0) goto L_0x0086;
        L_0x0085:
            r1 = 1;
        L_0x0086:
            r2 = r2 + r1;
            goto L_0x003d;
        L_0x0088:
            r6.a = r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akfq$a.a():void");
        }

        public final boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        public final /* synthetic */ Object next() {
            if (this.a == -1) {
                a();
            }
            if (this.a != 0) {
                akdy akdy = this.d;
                if (akdy != null) {
                    this.d = null;
                    this.a = -1;
                    return akdy;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public akfq(CharSequence charSequence, int i, akbw<? super CharSequence, ? super Integer, ajxm<Integer, Integer>> akbw) {
        akcr.b(charSequence, "input");
        akcr.b(akbw, "getNextMatch");
        this.a = charSequence;
        this.c = i;
        this.d = akbw;
    }

    public final Iterator<akdy> iterator() {
        return new a(this);
    }
}
