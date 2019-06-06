package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;

@TargetApi(21)
public final class PlatformScheduler {

    public static final class PlatformSchedulerService extends JobService {
        /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00f4  */
        /* JADX WARNING: Missing block: B:18:0x004f, code skipped:
            if (r11 == null) goto L_0x0037;
     */
        /* JADX WARNING: Missing block: B:25:0x0060, code skipped:
            if (r10.isRoaming() == false) goto L_0x001c;
     */
        /* JADX WARNING: Missing block: B:37:0x007d, code skipped:
            if (r3 == false) goto L_0x001c;
     */
        /* JADX WARNING: Missing block: B:55:0x00b1, code skipped:
            if (r2 != 5) goto L_0x00b4;
     */
        public final boolean onStartJob(android.app.job.JobParameters r13) {
            /*
            r12 = this;
            r0 = r13.getExtras();
            r1 = new brs;
            r2 = "requirements";
            r2 = r0.getInt(r2);
            r1.<init>(r2);
            r2 = r1.a;
            r3 = 7;
            r2 = r2 & r3;
            r4 = 2;
            r5 = 23;
            r6 = 16;
            r7 = 0;
            r8 = 1;
            if (r2 != 0) goto L_0x001e;
        L_0x001c:
            r3 = 1;
            goto L_0x008b;
        L_0x001e:
            r9 = "connectivity";
            r9 = r12.getSystemService(r9);
            r9 = (android.net.ConnectivityManager) r9;
            r10 = r9.getActiveNetworkInfo();
            if (r10 == 0) goto L_0x008a;
        L_0x002c:
            r11 = r10.isConnected();
            if (r11 != 0) goto L_0x0033;
        L_0x0032:
            goto L_0x008a;
        L_0x0033:
            r11 = defpackage.bzo.a;
            if (r11 >= r5) goto L_0x0039;
        L_0x0037:
            r11 = 1;
            goto L_0x0053;
        L_0x0039:
            r11 = r9.getActiveNetwork();
            if (r11 == 0) goto L_0x0052;
        L_0x003f:
            r11 = r9.getNetworkCapabilities(r11);
            if (r11 == 0) goto L_0x004e;
        L_0x0045:
            r11 = r11.hasCapability(r6);
            if (r11 != 0) goto L_0x004c;
        L_0x004b:
            goto L_0x004e;
        L_0x004c:
            r11 = 0;
            goto L_0x004f;
        L_0x004e:
            r11 = 1;
        L_0x004f:
            if (r11 != 0) goto L_0x0052;
        L_0x0051:
            goto L_0x0037;
        L_0x0052:
            r11 = 0;
        L_0x0053:
            if (r11 != 0) goto L_0x0056;
        L_0x0055:
            goto L_0x008a;
        L_0x0056:
            if (r2 != r8) goto L_0x0059;
        L_0x0058:
            goto L_0x001c;
        L_0x0059:
            r11 = 3;
            if (r2 != r11) goto L_0x0063;
        L_0x005c:
            r2 = r10.isRoaming();
            if (r2 != 0) goto L_0x008a;
        L_0x0062:
            goto L_0x001c;
        L_0x0063:
            r11 = defpackage.bzo.a;
            if (r11 < r6) goto L_0x006c;
        L_0x0067:
            r3 = r9.isActiveNetworkMetered();
            goto L_0x007b;
        L_0x006c:
            r9 = r10.getType();
            if (r9 == r8) goto L_0x007a;
        L_0x0072:
            if (r9 == r3) goto L_0x007a;
        L_0x0074:
            r3 = 9;
            if (r9 == r3) goto L_0x007a;
        L_0x0078:
            r3 = 1;
            goto L_0x007b;
        L_0x007a:
            r3 = 0;
        L_0x007b:
            if (r2 != r4) goto L_0x0080;
        L_0x007d:
            if (r3 != 0) goto L_0x008a;
        L_0x007f:
            goto L_0x001c;
        L_0x0080:
            r9 = 4;
            if (r2 != r9) goto L_0x0084;
        L_0x0083:
            goto L_0x008b;
        L_0x0084:
            r13 = new java.lang.IllegalStateException;
            r13.<init>();
            throw r13;
        L_0x008a:
            r3 = 0;
        L_0x008b:
            if (r3 == 0) goto L_0x00f1;
        L_0x008d:
            r2 = r1.a;
            r2 = r2 & r6;
            if (r2 == 0) goto L_0x0094;
        L_0x0092:
            r2 = 1;
            goto L_0x0095;
        L_0x0094:
            r2 = 0;
        L_0x0095:
            if (r2 != 0) goto L_0x0099;
        L_0x0097:
            r2 = 1;
            goto L_0x00b5;
        L_0x0099:
            r2 = 0;
            r3 = new android.content.IntentFilter;
            r6 = "android.intent.action.BATTERY_CHANGED";
            r3.<init>(r6);
            r2 = r12.registerReceiver(r2, r3);
            if (r2 == 0) goto L_0x00b4;
        L_0x00a7:
            r3 = -1;
            r6 = "status";
            r2 = r2.getIntExtra(r6, r3);
            if (r2 == r4) goto L_0x0097;
        L_0x00b0:
            r3 = 5;
            if (r2 != r3) goto L_0x00b4;
        L_0x00b3:
            goto L_0x0097;
        L_0x00b4:
            r2 = 0;
        L_0x00b5:
            if (r2 == 0) goto L_0x00f1;
        L_0x00b7:
            r1 = r1.a;
            r1 = r1 & 8;
            if (r1 == 0) goto L_0x00bf;
        L_0x00bd:
            r1 = 1;
            goto L_0x00c0;
        L_0x00bf:
            r1 = 0;
        L_0x00c0:
            if (r1 != 0) goto L_0x00c4;
        L_0x00c2:
            r1 = 1;
            goto L_0x00ed;
        L_0x00c4:
            r1 = "power";
            r1 = r12.getSystemService(r1);
            r1 = (android.os.PowerManager) r1;
            r2 = defpackage.bzo.a;
            if (r2 < r5) goto L_0x00d9;
        L_0x00d0:
            r1 = r1.isDeviceIdleMode();
            if (r1 != 0) goto L_0x00d7;
        L_0x00d6:
            goto L_0x00c2;
        L_0x00d7:
            r1 = 0;
            goto L_0x00ed;
        L_0x00d9:
            r2 = defpackage.bzo.a;
            r3 = 20;
            if (r2 < r3) goto L_0x00e6;
        L_0x00df:
            r1 = r1.isInteractive();
            if (r1 != 0) goto L_0x00d7;
        L_0x00e5:
            goto L_0x00c2;
        L_0x00e6:
            r1 = r1.isScreenOn();
            if (r1 != 0) goto L_0x00d7;
        L_0x00ec:
            goto L_0x00c2;
        L_0x00ed:
            if (r1 == 0) goto L_0x00f1;
        L_0x00ef:
            r1 = 1;
            goto L_0x00f2;
        L_0x00f1:
            r1 = 0;
        L_0x00f2:
            if (r1 == 0) goto L_0x0129;
        L_0x00f4:
            r13 = "service_action";
            r13 = r0.getString(r13);
            r1 = "service_package";
            r0 = r0.getString(r1);
            r1 = new android.content.Intent;
            r1.<init>(r13);
            r1 = r1.setPackage(r0);
            r2 = new java.lang.StringBuilder;
            r3 = "Starting service action: ";
            r2.<init>(r3);
            r2.append(r13);
            r13 = " package: ";
            r2.append(r13);
            r2.append(r0);
            r13 = defpackage.bzo.a;
            r0 = 26;
            if (r13 < r0) goto L_0x0125;
        L_0x0121:
            r12.startForegroundService(r1);
            goto L_0x012c;
        L_0x0125:
            r12.startService(r1);
            goto L_0x012c;
        L_0x0129:
            r12.jobFinished(r13, r8);
        L_0x012c:
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.PlatformScheduler$PlatformSchedulerService.onStartJob(android.app.job.JobParameters):boolean");
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }
}
