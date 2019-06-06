package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.IOException;

/* renamed from: akud */
public final class akud {
    private static final double a = Math.log(10.0d);

    public static int a(long j) {
        int a;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                return 20;
            }
            a = akud.a(-j);
        } else if (j < 10) {
            return 1;
        } else {
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < TelemetryConstants.FLUSH_DELAY_MS) {
                return 4;
            }
            a = (int) (Math.log((double) j) / a);
        }
        return a + 1;
    }

    static int a(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - 48;
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }

    static String a(String str, int i) {
        StringBuilder stringBuilder;
        int i2 = i + 32;
        String concat = str.length() <= i2 + 3 ? str : str.substring(0, i2).concat("...");
        String str2 = "Invalid format: \"";
        if (i <= 0) {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(concat);
        } else if (i >= str.length()) {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(concat);
            stringBuilder.append("\" is too short");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(concat);
            stringBuilder.append("\" is malformed at \"");
            stringBuilder.append(concat.substring(i));
        }
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }

    public static void a(Appendable appendable, int i) {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        } else {
            appendable.append(Integer.toString(i));
        }
    }

    public static void a(Appendable appendable, int i, int i2) {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        } else {
            int log = i < MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / a)) + 1;
            while (i2 > log) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
        }
    }

    public static void a(StringBuffer stringBuffer, int i, int i2) {
        try {
            akud.a((Appendable) stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }
}
