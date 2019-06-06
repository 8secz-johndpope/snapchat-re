package defpackage;

import android.os.Build;
import com.looksery.sdk.DeviceClass;

/* renamed from: mor */
public interface mor extends akbl<abpq, abpq> {

    /* renamed from: mor$c */
    public static final class c implements mor {
        volatile DeviceClass a;
        volatile mor b;
        final akbl<DeviceClass, mor> c;
        private final DeviceClass d;

        /* renamed from: mor$c$1 */
        static final class 1 extends akcs implements akbl<DeviceClass, a> {
            public static final 1 a = new 1();

            1() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DeviceClass deviceClass = (DeviceClass) obj;
                akcr.b(deviceClass, "it");
                return new a(deviceClass);
            }
        }

        public /* synthetic */ c() {
            this(1.a, DeviceClass.HIGH_END);
        }

        private c(akbl<? super DeviceClass, ? extends mor> akbl, DeviceClass deviceClass) {
            akcr.b(akbl, "deviceClassSizeMapperFactory");
            akcr.b(deviceClass, "defaultDeviceClass");
            this.c = akbl;
            this.d = deviceClass;
            this.a = this.d;
            this.b = (mor) this.c.invoke(this.a);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.mor.c;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.mor.c) r3;
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.d;
            r3 = r3.d;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mor$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            akbl akbl = this.c;
            int i = 0;
            int hashCode = (akbl != null ? akbl.hashCode() : 0) * 31;
            DeviceClass deviceClass = this.d;
            if (deviceClass != null) {
                i = deviceClass.hashCode();
            }
            return hashCode + i;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abpq abpq = (abpq) obj;
            akcr.b(abpq, "input");
            return (abpq) this.b.invoke(abpq);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MutableDeviceClassToProcessingSize(deviceClassSizeMapperFactory=");
            stringBuilder.append(this.c);
            stringBuilder.append(", defaultDeviceClass=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mor$a */
    public static final class a implements mor {
        private final DeviceClass a;
        private final String b;

        public /* synthetic */ a(DeviceClass deviceClass) {
            this(deviceClass, Build.MODEL);
        }

        private a(DeviceClass deviceClass, String str) {
            akcr.b(deviceClass, "deviceClass");
            this.a = deviceClass;
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.mor.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.mor.a) r3;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mor$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            DeviceClass deviceClass = this.a;
            int i = 0;
            int hashCode = (deviceClass != null ? deviceClass.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.abpq) r9;
            r0 = "input";
            defpackage.akcr.b(r9, r0);
            r0 = r8.b;
            r1 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
            if (r0 != 0) goto L_0x000e;
        L_0x000d:
            goto L_0x003b;
        L_0x000e:
            r2 = r0.hashCode();
            r3 = -997098160; // 0xffffffffc4917d50 float:-1163.916 double:NaN;
            r4 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
            if (r2 == r3) goto L_0x002d;
        L_0x0019:
            r3 = -556680045; // 0xffffffffded1bc93 float:-7.556558E18 double:NaN;
            if (r2 == r3) goto L_0x001f;
        L_0x001e:
            goto L_0x003b;
        L_0x001f:
            r2 = "BBB100-1";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x003b;
        L_0x0027:
            r0 = new abpq;
            r0.<init>(r1, r4);
            goto L_0x003c;
        L_0x002d:
            r2 = "Blackberry KEYONE";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x003b;
        L_0x0035:
            r0 = new abpq;
            r0.<init>(r1, r4);
            goto L_0x003c;
        L_0x003b:
            r0 = 0;
        L_0x003c:
            if (r0 == 0) goto L_0x003f;
        L_0x003e:
            return r0;
        L_0x003f:
            r0 = r8.a;
            r2 = defpackage.mos.a;
            r3 = r0.ordinal();
            r2 = r2[r3];
            r3 = 1;
            r4 = 4;
            r5 = 2;
            if (r2 == r3) goto L_0x007b;
        L_0x004e:
            if (r2 == r5) goto L_0x007b;
        L_0x0050:
            r1 = 3;
            if (r2 == r1) goto L_0x0071;
        L_0x0053:
            if (r2 != r4) goto L_0x005f;
        L_0x0055:
            r0 = new abpq;
            r1 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
            r2 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
            r0.<init>(r1, r2);
            goto L_0x0082;
        L_0x005f:
            r9 = new java.lang.IllegalArgumentException;
            r0 = java.lang.String.valueOf(r0);
            r1 = "Unexpected DeviceClass: ";
            r0 = r1.concat(r0);
            r9.<init>(r0);
            r9 = (java.lang.Throwable) r9;
            throw r9;
        L_0x0071:
            r0 = new abpq;
            r1 = 960; // 0x3c0 float:1.345E-42 double:4.743E-321;
            r2 = 540; // 0x21c float:7.57E-43 double:2.67E-321;
            r0.<init>(r1, r2);
            goto L_0x0082;
        L_0x007b:
            r0 = new abpq;
            r2 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
            r0.<init>(r2, r1);
        L_0x0082:
            r1 = r0.a();
            r0 = r0.b();
            r1 = r1 * r0;
            r0 = (double) r1;
            r2 = r9.a();
            r3 = r9.b();
            r2 = r2 * r3;
            r2 = (double) r2;
            r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r6 >= 0) goto L_0x009b;
        L_0x009a:
            return r9;
        L_0x009b:
            java.lang.Double.isNaN(r0);
            java.lang.Double.isNaN(r2);
            r0 = r0 / r2;
            r0 = java.lang.Math.sqrt(r0);
            r2 = r9.a();
            r2 = (double) r2;
            java.lang.Double.isNaN(r2);
            r2 = r2 * r0;
            r2 = (int) r2;
            r2 = r2 / r4;
            r2 = r2 << r5;
            r9 = r9.b();
            r6 = (double) r9;
            java.lang.Double.isNaN(r6);
            r6 = r6 * r0;
            r9 = (int) r6;
            r9 = r9 / r4;
            r9 = r9 << r5;
            r0 = new abpq;
            r0.<init>(r2, r9);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mor$a.invoke(java.lang.Object):java.lang.Object");
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DeviceClassToProcessingSize(deviceClass=");
            stringBuilder.append(this.a);
            stringBuilder.append(", deviceBuildModel=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mor$b */
    public static final class b implements mor {
        public static final b a = new b();

        private b() {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abpq abpq = (abpq) obj;
            akcr.b(abpq, "input");
            return abpq;
        }
    }
}
