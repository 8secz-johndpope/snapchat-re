package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.brightcove.player.event.Event;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.opencv.imgproc.Imgproc;

/* renamed from: awj */
public final class awj {
    private static final FileFilter a = new 1();

    /* renamed from: awj$1 */
    static class 1 implements FileFilter {
        1() {
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int a = awj.a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = awj.a("/sys/devices/system/cpu/present");
            }
            i = a == -1 ? new File("/sys/devices/system/cpu/").listFiles(a).length : a;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    private static int a(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null) {
                if (readLine.matches("0-[\\d]+$")) {
                    return Integer.valueOf(readLine.substring(2)).intValue() + 1;
                }
            }
        } catch (IOException unused) {
        }
        return -1;
    }

    private static int a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[Imgproc.INTER_TAB_SIZE2];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == (byte) 10 || i == 0) {
                    if (bArr[i] == (byte) 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < Imgproc.INTER_TAB_SIZE2 && bArr[i2] != (byte) 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < Imgproc.INTER_TAB_SIZE2 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    @TargetApi(16)
    public static long a(Context context) {
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            ((ActivityManager) context.getSystemService(Event.ACTIVITY)).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j = -1;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            j = ((long) awj.a("MemTotal", fileInputStream)) << 10;
            fileInputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            fileInputStream.close();
        }
        return j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0059 */
    public static int b() {
        /*
        r0 = 0;
        r1 = -1;
        r2 = 0;
        r3 = -1;
    L_0x0004:
        r4 = defpackage.awj.a();	 Catch:{ IOException -> 0x0085 }
        if (r2 >= r4) goto L_0x0065;
    L_0x000a:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0085 }
        r5 = "/sys/devices/system/cpu/cpu";
        r4.<init>(r5);	 Catch:{ IOException -> 0x0085 }
        r4.append(r2);	 Catch:{ IOException -> 0x0085 }
        r5 = "/cpufreq/cpuinfo_max_freq";
        r4.append(r5);	 Catch:{ IOException -> 0x0085 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0085 }
        r5 = new java.io.File;	 Catch:{ IOException -> 0x0085 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x0085 }
        r4 = r5.exists();	 Catch:{ IOException -> 0x0085 }
        if (r4 == 0) goto L_0x0062;
    L_0x0028:
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = new byte[r4];	 Catch:{ IOException -> 0x0085 }
        r7 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0085 }
        r7.<init>(r5);	 Catch:{ IOException -> 0x0085 }
        r7.read(r6);	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        r5 = 0;
    L_0x0035:
        r8 = r6[r5];	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        r8 = java.lang.Character.isDigit(r8);	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        if (r8 == 0) goto L_0x0042;
    L_0x003d:
        if (r5 >= r4) goto L_0x0042;
    L_0x003f:
        r5 = r5 + 1;
        goto L_0x0035;
    L_0x0042:
        r4 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        r4.<init>(r6, r0, r5);	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        r5 = r4.intValue();	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
        if (r5 <= r3) goto L_0x0059;
    L_0x0055:
        r3 = r4.intValue();	 Catch:{ NumberFormatException -> 0x0059, all -> 0x005d }
    L_0x0059:
        r7.close();	 Catch:{ IOException -> 0x0085 }
        goto L_0x0062;
    L_0x005d:
        r0 = move-exception;
        r7.close();	 Catch:{ IOException -> 0x0085 }
        throw r0;	 Catch:{ IOException -> 0x0085 }
    L_0x0062:
        r2 = r2 + 1;
        goto L_0x0004;
    L_0x0065:
        if (r3 != r1) goto L_0x0084;
    L_0x0067:
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0085 }
        r2 = "/proc/cpuinfo";
        r0.<init>(r2);	 Catch:{ IOException -> 0x0085 }
        r2 = "cpu MHz";
        r2 = defpackage.awj.a(r2, r0);	 Catch:{ all -> 0x007f }
        r2 = r2 * 1000;
        if (r2 <= r3) goto L_0x0079;
    L_0x0078:
        goto L_0x007a;
    L_0x0079:
        r2 = r3;
    L_0x007a:
        r0.close();	 Catch:{ IOException -> 0x0085 }
        r1 = r2;
        goto L_0x0085;
    L_0x007f:
        r2 = move-exception;
        r0.close();	 Catch:{ IOException -> 0x0085 }
        throw r2;	 Catch:{ IOException -> 0x0085 }
    L_0x0084:
        r1 = r3;
    L_0x0085:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awj.b():int");
    }
}
