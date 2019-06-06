package defpackage;

import com.looksery.sdk.domain.uriservice.LensTextInputConstants;

/* renamed from: aitf */
abstract class aitf extends aiqx {
    public aitf(aiqo aiqo, String str, String str2, aisx aisx, int i) {
        super(aiqo, str, str2, aisx, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c1  */
    private defpackage.aisw a(defpackage.aisw r9, defpackage.aiti r10) {
        /*
        r8 = this;
        r0 = "Failed to close app icon InputStream.";
        r1 = r10.b;
        r2 = 0;
        r3 = "app[identifier]";
        r9 = r9.a(r3, r2, r1);
        r1 = r10.f;
        r3 = "app[name]";
        r9 = r9.a(r3, r2, r1);
        r1 = r10.c;
        r3 = "app[display_version]";
        r9 = r9.a(r3, r2, r1);
        r1 = r10.d;
        r3 = "app[build_version]";
        r9 = r9.a(r3, r2, r1);
        r1 = r10.g;
        r1 = java.lang.Integer.valueOf(r1);
        r3 = "app[source]";
        r9 = r9.a(r3, r1);
        r1 = r10.h;
        r3 = "app[minimum_sdk_version]";
        r9 = r9.a(r3, r2, r1);
        r1 = r10.i;
        r3 = "app[built_sdk_version]";
        r9 = r9.a(r3, r2, r1);
        r1 = r10.e;
        r1 = defpackage.airf.a(r1);
        if (r1 != 0) goto L_0x004e;
    L_0x0047:
        r1 = r10.e;
        r3 = "app[instance_identifier]";
        r9.a(r3, r2, r1);
    L_0x004e:
        r1 = r10.j;
        if (r1 == 0) goto L_0x00bd;
    L_0x0052:
        r1 = r8.b;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
        r1 = r1.f;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
        r1 = r1.getResources();	 Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
        r3 = r10.j;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
        r3 = r3.b;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
        r1 = r1.openRawResource(r3);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
        r3 = "app[icon][hash]";
        r4 = r10.j;	 Catch:{ NotFoundException -> 0x0092 }
        r4 = r4.a;	 Catch:{ NotFoundException -> 0x0092 }
        r3 = r9.a(r3, r2, r4);	 Catch:{ NotFoundException -> 0x0092 }
        r4 = "app[icon][data]";
        r5 = "icon.png";
        r6 = "application/octet-stream";
        r3 = r3.a(r4, r5, r6, r1);	 Catch:{ NotFoundException -> 0x0092 }
        r4 = "app[icon][width]";
        r5 = r10.j;	 Catch:{ NotFoundException -> 0x0092 }
        r5 = r5.c;	 Catch:{ NotFoundException -> 0x0092 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NotFoundException -> 0x0092 }
        r3 = r3.a(r4, r5);	 Catch:{ NotFoundException -> 0x0092 }
        r4 = "app[icon][height]";
        r5 = r10.j;	 Catch:{ NotFoundException -> 0x0092 }
        r5 = r5.d;	 Catch:{ NotFoundException -> 0x0092 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NotFoundException -> 0x0092 }
        r3.a(r4, r5);	 Catch:{ NotFoundException -> 0x0092 }
        goto L_0x00b4;
    L_0x0092:
        r3 = move-exception;
        goto L_0x0099;
    L_0x0094:
        r9 = move-exception;
        r1 = r2;
        goto L_0x00b9;
    L_0x0097:
        r3 = move-exception;
        r1 = r2;
    L_0x0099:
        r4 = defpackage.aiqj.a();	 Catch:{ all -> 0x00b8 }
        r5 = "Fabric";
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b8 }
        r7 = "Failed to find app icon with resource ID: ";
        r6.<init>(r7);	 Catch:{ all -> 0x00b8 }
        r7 = r10.j;	 Catch:{ all -> 0x00b8 }
        r7 = r7.b;	 Catch:{ all -> 0x00b8 }
        r6.append(r7);	 Catch:{ all -> 0x00b8 }
        r6 = r6.toString();	 Catch:{ all -> 0x00b8 }
        r4.c(r5, r6, r3);	 Catch:{ all -> 0x00b8 }
    L_0x00b4:
        defpackage.airf.a(r1, r0);
        goto L_0x00bd;
    L_0x00b8:
        r9 = move-exception;
    L_0x00b9:
        defpackage.airf.a(r1, r0);
        throw r9;
    L_0x00bd:
        r0 = r10.k;
        if (r0 == 0) goto L_0x00fc;
    L_0x00c1:
        r10 = r10.k;
        r10 = r10.iterator();
    L_0x00c7:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x00fc;
    L_0x00cd:
        r0 = r10.next();
        r0 = (defpackage.aiqq) r0;
        r1 = java.util.Locale.US;
        r3 = 1;
        r4 = new java.lang.Object[r3];
        r5 = r0.a;
        r6 = 0;
        r4[r6] = r5;
        r5 = "app[build][libraries][%s][version]";
        r1 = java.lang.String.format(r1, r5, r4);
        r4 = r0.b;
        r9.a(r1, r2, r4);
        r1 = java.util.Locale.US;
        r3 = new java.lang.Object[r3];
        r4 = r0.a;
        r3[r6] = r4;
        r4 = "app[build][libraries][%s][type]";
        r1 = java.lang.String.format(r1, r4, r3);
        r0 = r0.c;
        r9.a(r1, r2, r0);
        goto L_0x00c7;
    L_0x00fc:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitf.a(aisw, aiti):aisw");
    }

    public boolean a(aiti aiti) {
        aisw a = a(a().a("X-CRASHLYTICS-API-KEY", aiti.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a()), aiti);
        aiqr a2 = aiqj.a();
        StringBuilder stringBuilder = new StringBuilder("Sending app info to ");
        stringBuilder.append(this.a);
        String str = "Fabric";
        a2.a(str, stringBuilder.toString());
        if (aiti.j != null) {
            a2 = aiqj.a();
            stringBuilder = new StringBuilder("App icon hash is ");
            stringBuilder.append(aiti.j.a);
            a2.a(str, stringBuilder.toString());
            a2 = aiqj.a();
            stringBuilder = new StringBuilder("App icon size is ");
            stringBuilder.append(aiti.j.c);
            stringBuilder.append("x");
            stringBuilder.append(aiti.j.d);
            a2.a(str, stringBuilder.toString());
        }
        int b = a.b();
        String str2 = LensTextInputConstants.REQUEST_METHOD.equals(a.a().getRequestMethod()) ? "Create" : "Update";
        aiqr a3 = aiqj.a();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str2);
        stringBuilder2.append(" app request ID: ");
        stringBuilder2.append(a.b("X-REQUEST-ID"));
        a3.a(str, stringBuilder2.toString());
        aiqj.a().a(str, "Result was ".concat(String.valueOf(b)));
        return airp.a(b) == 0;
    }
}
