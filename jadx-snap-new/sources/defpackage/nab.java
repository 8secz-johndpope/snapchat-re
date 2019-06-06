package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: nab */
public interface nab extends ajfb<a> {

    /* renamed from: nab$a */
    public static abstract class a implements mis<mih, a> {

        /* renamed from: nab$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mih) obj, "p1");
                return this;
            }
        }

        /* renamed from: nab$a$b */
        public static final class b extends a {
            public final akbw<View, MotionEvent, Boolean> a;
            public final mih b;

            public /* synthetic */ b(akbw akbw) {
                this(akbw, mih.e);
            }

            private b(akbw<? super View, ? super MotionEvent, Boolean> akbw, mih mih) {
                akcr.b(akbw, "touchHandler");
                akcr.b(mih, "windowRect");
                super();
                this.a = akbw;
                this.b = mih;
            }

            private static b a(akbw<? super View, ? super MotionEvent, Boolean> akbw, mih mih) {
                akcr.b(akbw, "touchHandler");
                akcr.b(mih, "windowRect");
                return new b(akbw, mih);
            }

            public static /* synthetic */ b a(b bVar, akbw akbw, mih mih, int i) {
                if ((i & 1) != 0) {
                    akbw = bVar.a;
                }
                if ((i & 2) != 0) {
                    mih = bVar.b;
                }
                return b.a(akbw, mih);
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.nab.a.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.nab.a.b) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nab$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                akbw akbw = this.a;
                int i = 0;
                int hashCode = (akbw != null ? akbw.hashCode() : 0) * 31;
                mih mih = this.b;
                if (mih != null) {
                    i = mih.hashCode();
                }
                return hashCode + i;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (mih) obj;
                akcr.b(obj, "value");
                return (akcr.a(this.b, obj) ^ 1) != 0 ? b.a(this, null, obj, 1) : this;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Interactive(touchHandler=");
                stringBuilder.append(this.a);
                stringBuilder.append(", windowRect=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
