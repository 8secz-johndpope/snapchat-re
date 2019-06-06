package defpackage;

import android.media.MediaFormat;

/* renamed from: adnk */
public final class adnk {
    private static final String[] a = new String[]{"mime"};
    private static final String[] b = new String[]{"bitrate"};
    private static final String[] c;
    private static final String[] d;
    private static final String[] e = new String[]{"channel-count", "sample-rate"};

    static {
        String str = "frame-rate";
        c = new String[]{"width", "height", str};
        d = new String[]{str};
    }

    public static boolean a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (!adnk.c(mediaFormat, mediaFormat2)) {
            return false;
        }
        String str;
        String[] strArr = c;
        int i = 0;
        while (i < 3) {
            str = strArr[i];
            try {
                if (mediaFormat.getInteger(str) != mediaFormat2.getInteger(str)) {
                    return false;
                }
                i++;
            } catch (RuntimeException e) {
                adni.c("cannot getInteger", e);
            }
        }
        strArr = d;
        i = 0;
        while (i <= 0) {
            str = strArr[0];
            try {
                if (Math.abs(mediaFormat.getFloat(str) - mediaFormat2.getFloat(str)) > 1.0E-10f) {
                    return false;
                }
                i++;
            } catch (RuntimeException e2) {
                adni.c("cannot getFloat", e2);
            }
        }
        return true;
    }

    public static boolean b(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (!adnk.c(mediaFormat, mediaFormat2)) {
            return false;
        }
        String[] strArr = e;
        int i = 0;
        while (i < 2) {
            String str = strArr[i];
            try {
                if (mediaFormat.getInteger(str) != mediaFormat2.getInteger(str)) {
                    return false;
                }
                i++;
            } catch (RuntimeException e) {
                adni.c("cannot getInteger", e);
            }
        }
        return true;
    }

    private static boolean c(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        String[] strArr = a;
        int i = 0;
        while (true) {
            int i2 = 1;
            String str;
            if (i <= 0) {
                str = strArr[0];
                try {
                    i2 = mediaFormat.getString(str).equals(mediaFormat2.getString(str));
                    if (i2 == 0) {
                        return false;
                    }
                    i++;
                } catch (RuntimeException e) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = e;
                    adni.c("cannot getString", objArr);
                }
            } else {
                strArr = b;
                i = 0;
                while (i <= 0) {
                    str = strArr[0];
                    try {
                        if (mediaFormat.getInteger(str) != mediaFormat2.getInteger(str)) {
                            return false;
                        }
                        i++;
                    } catch (RuntimeException e2) {
                        adni.c("cannot getInteger", e2);
                    }
                }
                return true;
            }
        }
    }
}
