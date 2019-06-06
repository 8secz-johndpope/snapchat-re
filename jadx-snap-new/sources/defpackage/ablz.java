package defpackage;

import android.os.Build.VERSION;

/* renamed from: ablz */
public interface ablz {

    /* renamed from: ablz$a */
    public static class a implements ablz {
        private static Long b() {
            String str = VERSION.SDK_INT >= 21 ? "android.system" : "libcore.io";
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".OsConstants");
                int i = Class.forName(stringBuilder.toString()).getField("_SC_CLK_TCK").getInt(null);
                Object obj = Class.forName("libcore.io.Libcore").getField("os").get(null);
                return (Long) obj.getClass().getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
        public final java.lang.Long a() {
            /*
            r6 = this;
            r0 = android.os.Process.myPid();
            r1 = new java.lang.StringBuilder;
            r2 = "/proc/";
            r1.<init>(r2);
            r1.append(r0);
            r0 = "/stat";
            r1.append(r0);
            r0 = r1.toString();
            r1 = 0;
            r2 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x004e, all -> 0x0048 }
            r3 = new java.io.FileReader;	 Catch:{ Exception -> 0x004e, all -> 0x0048 }
            r3.<init>(r0);	 Catch:{ Exception -> 0x004e, all -> 0x0048 }
            r2.<init>(r3);	 Catch:{ Exception -> 0x004e, all -> 0x0048 }
            r0 = r2.readLine();	 Catch:{ Exception -> 0x004f, all -> 0x0046 }
            if (r0 == 0) goto L_0x0041;
        L_0x0028:
            r3 = ") ";
            r3 = r0.lastIndexOf(r3);	 Catch:{ Exception -> 0x004f, all -> 0x0046 }
            r0 = r0.substring(r3);	 Catch:{ Exception -> 0x004f, all -> 0x0046 }
            r3 = " ";
            r0 = r0.split(r3);	 Catch:{ Exception -> 0x004f, all -> 0x0046 }
            r3 = 20;
            r0 = r0[r3];	 Catch:{ Exception -> 0x004f, all -> 0x0046 }
            r0 = java.lang.Long.valueOf(r0);	 Catch:{ Exception -> 0x004f, all -> 0x0046 }
            goto L_0x0042;
        L_0x0041:
            r0 = r1;
        L_0x0042:
            defpackage.abqt.a(r2);
            goto L_0x0053;
        L_0x0046:
            r0 = move-exception;
            goto L_0x004a;
        L_0x0048:
            r0 = move-exception;
            r2 = r1;
        L_0x004a:
            defpackage.abqt.a(r2);
            throw r0;
        L_0x004e:
            r2 = r1;
        L_0x004f:
            defpackage.abqt.a(r2);
            r0 = r1;
        L_0x0053:
            if (r0 != 0) goto L_0x0056;
        L_0x0055:
            return r1;
        L_0x0056:
            r1 = defpackage.ablz.a.b();
            if (r1 != 0) goto L_0x0062;
        L_0x005c:
            r1 = 100;
            r1 = java.lang.Long.valueOf(r1);
        L_0x0062:
            r2 = r0.longValue();
            r4 = 1000000000; // 0x3b9aca00 float:0.0047237873 double:4.94065646E-315;
            r2 = r2 * r4;
            r0 = r1.longValue();
            r2 = r2 / r0;
            r0 = java.lang.Long.valueOf(r2);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ablz$a.a():java.lang.Long");
        }
    }

    Long a();
}
