package me.leolin.shortcutbadger.impl;

import android.content.pm.ResolveInfo;
import defpackage.akgg;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class XiaomiHomeBadger implements akgg {
    private ResolveInfo a;

    public final List<String> a() {
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            r3.set(r2, java.lang.Integer.valueOf(r10));
     */
    public final void a(android.content.Context r8, android.content.ComponentName r9, int r10) {
        /*
        r7 = this;
        r0 = "";
        r1 = 1;
        r2 = "android.app.MiuiNotification";
        r2 = java.lang.Class.forName(r2);	 Catch:{ Exception -> 0x0032 }
        r2 = r2.newInstance();	 Catch:{ Exception -> 0x0032 }
        r3 = r2.getClass();	 Catch:{ Exception -> 0x0032 }
        r4 = "messageCount";
        r3 = r3.getDeclaredField(r4);	 Catch:{ Exception -> 0x0032 }
        r3.setAccessible(r1);	 Catch:{ Exception -> 0x0032 }
        if (r10 != 0) goto L_0x001e;
    L_0x001c:
        r4 = r0;
        goto L_0x0022;
    L_0x001e:
        r4 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x002a }
    L_0x0022:
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x002a }
        r3.set(r2, r4);	 Catch:{ Exception -> 0x002a }
        goto L_0x006e;
    L_0x002a:
        r4 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x0032 }
        r3.set(r2, r4);	 Catch:{ Exception -> 0x0032 }
        goto L_0x006e;
    L_0x0032:
        r2 = new android.content.Intent;
        r3 = "android.intent.action.APPLICATION_MESSAGE_UPDATE";
        r2.<init>(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r9.getPackageName();
        r3.append(r4);
        r4 = "/";
        r3.append(r4);
        r9 = r9.getClassName();
        r3.append(r9);
        r9 = r3.toString();
        r3 = "android.intent.extra.update_application_component_name";
        r2.putExtra(r3, r9);
        if (r10 != 0) goto L_0x005e;
    L_0x005c:
        r9 = r0;
        goto L_0x0062;
    L_0x005e:
        r9 = java.lang.Integer.valueOf(r10);
    L_0x0062:
        r9 = java.lang.String.valueOf(r9);
        r3 = "android.intent.extra.update_application_message_text";
        r2.putExtra(r3, r9);
        defpackage.akgr.b(r8, r2);	 Catch:{ akgh -> 0x006e }
    L_0x006e:
        r9 = android.os.Build.MANUFACTURER;
        r2 = "Xiaomi";
        r9 = r9.equalsIgnoreCase(r2);
        if (r9 == 0) goto L_0x00f2;
    L_0x0078:
        r9 = r7.a;
        if (r9 != 0) goto L_0x0094;
    L_0x007c:
        r9 = new android.content.Intent;
        r2 = "android.intent.action.MAIN";
        r9.<init>(r2);
        r2 = "android.intent.category.HOME";
        r9.addCategory(r2);
        r2 = r8.getPackageManager();
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r9 = r2.resolveActivity(r9, r3);
        r7.a = r9;
    L_0x0094:
        r9 = r7.a;
        if (r9 == 0) goto L_0x00f2;
    L_0x0098:
        r9 = "notification";
        r9 = r8.getSystemService(r9);
        r9 = (android.app.NotificationManager) r9;
        r2 = new android.app.Notification$Builder;
        r2.<init>(r8);
        r8 = r2.setContentTitle(r0);
        r8 = r8.setContentText(r0);
        r0 = r7.a;
        r0 = r0.getIconResource();
        r8 = r8.setSmallIcon(r0);
        r8 = r8.build();
        r0 = r8.getClass();	 Catch:{ Exception -> 0x00e9 }
        r2 = "extraNotification";
        r0 = r0.getDeclaredField(r2);	 Catch:{ Exception -> 0x00e9 }
        r0 = r0.get(r8);	 Catch:{ Exception -> 0x00e9 }
        r2 = r0.getClass();	 Catch:{ Exception -> 0x00e9 }
        r3 = "setMessageCount";
        r4 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x00e9 }
        r5 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00e9 }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ Exception -> 0x00e9 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x00e9 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x00e9 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x00e9 }
        r1[r6] = r10;	 Catch:{ Exception -> 0x00e9 }
        r2.invoke(r0, r1);	 Catch:{ Exception -> 0x00e9 }
        r9.notify(r6, r8);	 Catch:{ Exception -> 0x00e9 }
        return;
    L_0x00e9:
        r8 = move-exception;
        r9 = new akgh;
        r10 = "not able to set badge";
        r9.<init>(r10, r8);
        throw r9;
    L_0x00f2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.XiaomiHomeBadger.a(android.content.Context, android.content.ComponentName, int):void");
    }
}
