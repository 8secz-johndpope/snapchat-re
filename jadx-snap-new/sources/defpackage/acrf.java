package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: acrf */
public final class acrf {

    /* renamed from: acrf$a */
    public static final class a {

        /* renamed from: acrf$a$a */
        static final class a<T> implements Comparator<T> {
            private /* synthetic */ Map a;
            private /* synthetic */ acqt b;
            private /* synthetic */ String c;

            a(Map map, acqt acqt, String str) {
                this.a = map;
                this.b = acqt;
                this.c = str;
            }

            /* JADX WARNING: Missing block: B:55:0x00db, code skipped:
            if (r0 == null) goto L_0x00dd;
     */
            public final /* synthetic */ int compare(java.lang.Object r11, java.lang.Object r12) {
                /*
                r10 = this;
                r11 = (defpackage.alhq) r11;
                r12 = (defpackage.alhq) r12;
                r0 = "f1";
                defpackage.akcr.a(r11, r0);
                r0 = r11.b();
                r0 = (java.lang.CharSequence) r0;
                r1 = 0;
                r2 = 1;
                if (r0 == 0) goto L_0x001c;
            L_0x0013:
                r0 = r0.length();
                if (r0 != 0) goto L_0x001a;
            L_0x0019:
                goto L_0x001c;
            L_0x001a:
                r0 = 0;
                goto L_0x001d;
            L_0x001c:
                r0 = 1;
            L_0x001d:
                if (r0 != 0) goto L_0x0110;
            L_0x001f:
                r0 = "f2";
                defpackage.akcr.a(r12, r0);
                r0 = r12.b();
                r0 = (java.lang.CharSequence) r0;
                if (r0 == 0) goto L_0x0035;
            L_0x002c:
                r0 = r0.length();
                if (r0 != 0) goto L_0x0033;
            L_0x0032:
                goto L_0x0035;
            L_0x0033:
                r0 = 0;
                goto L_0x0036;
            L_0x0035:
                r0 = 1;
            L_0x0036:
                r3 = -1;
                if (r0 == 0) goto L_0x003a;
            L_0x0039:
                return r3;
            L_0x003a:
                r0 = r10.a;
                r4 = r11.b();
                r0 = r0.get(r4);
                r0 = (java.lang.String) r0;
                r4 = 0;
                r5 = "f1.userId";
                if (r0 != 0) goto L_0x0060;
            L_0x004b:
                r0 = r10.b;
                r6 = r11.b();
                defpackage.akcr.a(r6, r5);
                r7 = r10.c;
                r0 = r0.a(r6, r7, r11);
                if (r0 == 0) goto L_0x005f;
            L_0x005c:
                r0 = r0.a;
                goto L_0x0060;
            L_0x005f:
                r0 = r4;
            L_0x0060:
                r6 = r10.a;
                r7 = r12.b();
                r6 = r6.get(r7);
                r6 = (java.lang.String) r6;
                r7 = "f2.userId";
                if (r6 != 0) goto L_0x0084;
            L_0x0070:
                r6 = r10.b;
                r8 = r12.b();
                defpackage.akcr.a(r8, r7);
                r9 = r10.c;
                r6 = r6.a(r8, r9, r12);
                if (r6 == 0) goto L_0x0085;
            L_0x0081:
                r4 = r6.a;
                goto L_0x0085;
            L_0x0084:
                r4 = r6;
            L_0x0085:
                r6 = r10.a;
                r8 = r11.b();
                defpackage.akcr.a(r8, r5);
                r6.put(r8, r0);
                r5 = r10.a;
                r6 = r12.b();
                defpackage.akcr.a(r6, r7);
                r5.put(r6, r4);
                r0 = (java.lang.CharSequence) r0;
                if (r0 == 0) goto L_0x00aa;
            L_0x00a1:
                r5 = r0.length();
                if (r5 != 0) goto L_0x00a8;
            L_0x00a7:
                goto L_0x00aa;
            L_0x00a8:
                r5 = 0;
                goto L_0x00ab;
            L_0x00aa:
                r5 = 1;
            L_0x00ab:
                if (r5 != 0) goto L_0x00bf;
            L_0x00ad:
                r5 = r4;
                r5 = (java.lang.CharSequence) r5;
                if (r5 == 0) goto L_0x00bb;
            L_0x00b2:
                r5 = r5.length();
                if (r5 != 0) goto L_0x00b9;
            L_0x00b8:
                goto L_0x00bb;
            L_0x00b9:
                r5 = 0;
                goto L_0x00bc;
            L_0x00bb:
                r5 = 1;
            L_0x00bc:
                if (r5 == 0) goto L_0x00bf;
            L_0x00be:
                return r3;
            L_0x00bf:
                r4 = (java.lang.CharSequence) r4;
                if (r4 == 0) goto L_0x00cc;
            L_0x00c3:
                r4 = r4.length();
                if (r4 != 0) goto L_0x00ca;
            L_0x00c9:
                goto L_0x00cc;
            L_0x00ca:
                r4 = 0;
                goto L_0x00cd;
            L_0x00cc:
                r4 = 1;
            L_0x00cd:
                if (r4 != 0) goto L_0x00dd;
            L_0x00cf:
                if (r0 == 0) goto L_0x00da;
            L_0x00d1:
                r0 = r0.length();
                if (r0 != 0) goto L_0x00d8;
            L_0x00d7:
                goto L_0x00da;
            L_0x00d8:
                r0 = 0;
                goto L_0x00db;
            L_0x00da:
                r0 = 1;
            L_0x00db:
                if (r0 != 0) goto L_0x0110;
            L_0x00dd:
                r0 = r11.f();
                if (r0 == 0) goto L_0x00ea;
            L_0x00e3:
                r0 = r12.f();
                if (r0 != 0) goto L_0x00ea;
            L_0x00e9:
                return r3;
            L_0x00ea:
                r0 = r11.f();
                if (r0 != 0) goto L_0x00f6;
            L_0x00f0:
                r0 = r12.f();
                if (r0 != 0) goto L_0x0110;
            L_0x00f6:
                r4 = r11.e();
                r6 = r12.e();
                r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
                if (r0 <= 0) goto L_0x0103;
            L_0x0102:
                return r3;
            L_0x0103:
                r3 = r11.e();
                r11 = r12.e();
                r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
                if (r0 != 0) goto L_0x0110;
            L_0x010f:
                return r1;
            L_0x0110:
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acrf$a$a.compare(java.lang.Object, java.lang.Object):int");
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }
}
