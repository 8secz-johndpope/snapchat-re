package defpackage;

import android.text.TextUtils;
import com.brightcove.player.event.Event;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: byz */
public final class byz {
    private static final ArrayList<a> a = new ArrayList();

    /* renamed from: byz$a */
    static final class a {
        public final String a;
        public final String b;
        public final int c;
    }

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    public static boolean a(String str) {
        return "audio".equals(byz.j(str));
    }

    public static boolean b(String str) {
        return Event.VIDEO.equals(byz.j(str));
    }

    public static boolean c(String str) {
        return "text".equals(byz.j(str));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        for (String f : str.split(ppy.b, -1)) {
            String f2 = byz.f(f2);
            if (f2 != null && byz.b(f2)) {
                return f2;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        for (String f : str.split(ppy.b, -1)) {
            String f2 = byz.f(f2);
            if (f2 != null && byz.a(f2)) {
                return f2;
            }
        }
        return null;
    }

    public static String f(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        str = str.trim();
        if (str.startsWith(VisualSampleEntry.TYPE3) || str.startsWith(VisualSampleEntry.TYPE4)) {
            return "video/avc";
        }
        if (str.startsWith(VisualSampleEntry.TYPE7) || str.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (str.startsWith("vp9") || str.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (str.startsWith("vp8") || str.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        int i = 0;
        if (str.startsWith(AudioSampleEntry.TYPE3)) {
            if (str.startsWith("mp4a.")) {
                str = str.substring(5);
                if (str.length() >= 2) {
                    try {
                        str = str.substring(0, 2);
                        str2 = byz.a(Integer.parseInt(str == null ? null : str.toUpperCase(Locale.US), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (str.startsWith(AudioSampleEntry.TYPE8) || str.startsWith(AC3SpecificBox.TYPE)) {
            return "audio/ac3";
        } else {
            if (str.startsWith(AudioSampleEntry.TYPE9) || str.startsWith(EC3SpecificBox.TYPE)) {
                return "audio/eac3";
            }
            if (str.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (str.startsWith("dtsc") || str.startsWith(AudioSampleEntry.TYPE13)) {
                return "audio/vnd.dts";
            }
            if (str.startsWith(AudioSampleEntry.TYPE12) || str.startsWith(AudioSampleEntry.TYPE11)) {
                return "audio/vnd.dts.hd";
            }
            if (str.startsWith("opus")) {
                return "audio/opus";
            }
            if (str.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            int size = a.size();
            while (i < size) {
                a aVar = (a) a.get(i);
                if (str.startsWith(aVar.b)) {
                    return aVar.a;
                }
                i++;
            }
            return null;
        }
    }

    public static int g(String str) {
        return TextUtils.isEmpty(str) ? -1 : byz.a(str) ? 1 : byz.b(str) ? 2 : (byz.c(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) ? 3 : ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) ? 4 : byz.k(str);
    }

    public static int h(java.lang.String r7) {
        /*
        r0 = r7.hashCode();
        r1 = 0;
        r2 = 4;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        r6 = 5;
        switch(r0) {
            case -2123537834: goto L_0x0040;
            case -1095064472: goto L_0x0036;
            case 187078296: goto L_0x002c;
            case 1504578661: goto L_0x0022;
            case 1505942594: goto L_0x0018;
            case 1556697186: goto L_0x000e;
            default: goto L_0x000d;
        };
    L_0x000d:
        goto L_0x004a;
    L_0x000e:
        r0 = "audio/true-hd";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004a;
    L_0x0016:
        r7 = 5;
        goto L_0x004b;
    L_0x0018:
        r0 = "audio/vnd.dts.hd";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004a;
    L_0x0020:
        r7 = 4;
        goto L_0x004b;
    L_0x0022:
        r0 = "audio/eac3";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004a;
    L_0x002a:
        r7 = 1;
        goto L_0x004b;
    L_0x002c:
        r0 = "audio/ac3";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004a;
    L_0x0034:
        r7 = 0;
        goto L_0x004b;
    L_0x0036:
        r0 = "audio/vnd.dts";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004a;
    L_0x003e:
        r7 = 3;
        goto L_0x004b;
    L_0x0040:
        r0 = "audio/eac3-joc";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x004a;
    L_0x0048:
        r7 = 2;
        goto L_0x004b;
    L_0x004a:
        r7 = -1;
    L_0x004b:
        if (r7 == 0) goto L_0x0062;
    L_0x004d:
        if (r7 == r5) goto L_0x0060;
    L_0x004f:
        if (r7 == r4) goto L_0x0060;
    L_0x0051:
        if (r7 == r3) goto L_0x005e;
    L_0x0053:
        if (r7 == r2) goto L_0x005b;
    L_0x0055:
        if (r7 == r6) goto L_0x0058;
    L_0x0057:
        return r1;
    L_0x0058:
        r7 = 14;
        return r7;
    L_0x005b:
        r7 = 8;
        return r7;
    L_0x005e:
        r7 = 7;
        return r7;
    L_0x0060:
        r7 = 6;
        return r7;
    L_0x0062:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byz.h(java.lang.String):int");
    }

    public static int i(String str) {
        return byz.g(byz.f(str));
    }

    private static String j(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(String.valueOf(str)));
    }

    private static int k(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) a.get(i);
            if (str.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }
}
