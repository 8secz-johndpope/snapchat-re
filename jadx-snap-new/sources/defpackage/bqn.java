package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.android.linearallocexpander.LaExpander;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.opencv.imgproc.Imgproc;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: bqn */
public final class bqn {
    static final bqk a = new bqk("OMX.google.raw.decoder", null, null, true, false, false);
    public static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    public static final Map<String, Integer> c;
    private static final HashMap<a, List<bqk>> d = new HashMap();
    private static final SparseIntArray e;
    private static final SparseIntArray f;
    private static int g = -1;

    /* renamed from: bqn$c */
    interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, CodecCapabilities codecCapabilities);

        boolean b();
    }

    /* renamed from: bqn$b */
    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }

        /* synthetic */ b(Throwable th, byte b) {
            this(th);
        }
    }

    @TargetApi(21)
    /* renamed from: bqn$e */
    static final class e implements c {
        private final int a;
        private MediaCodecInfo[] b;

        public e(boolean z) {
            this.a = z;
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }

        public final int a() {
            c();
            return this.b.length;
        }

        public final MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        public final boolean a(String str, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: bqn$a */
    static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                return TextUtils.equals(this.a, aVar.a) && this.b == aVar.b;
            }
        }

        public final int hashCode() {
            String str = this.a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
        }
    }

    /* renamed from: bqn$d */
    static final class d implements c {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public final boolean a(String str, CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        public final boolean b() {
            return false;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(66, 1);
        e.put(77, 2);
        e.put(88, 4);
        e.put(100, 8);
        sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        sparseIntArray.put(10, 1);
        f.put(11, 4);
        f.put(12, 8);
        f.put(13, 16);
        f.put(20, 32);
        f.put(21, 64);
        f.put(22, 128);
        f.put(30, 256);
        f.put(31, RasterSource.DEFAULT_TILE_SIZE);
        f.put(32, Imgproc.INTER_TAB_SIZE2);
        f.put(40, ItemAnimator.FLAG_MOVED);
        f.put(41, 4096);
        f.put(42, 8192);
        f.put(50, 16384);
        f.put(51, 32768);
        f.put(52, Imgproc.FLOODFILL_FIXED_RANGE);
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("L30", Integer.valueOf(1));
        c.put("L60", Integer.valueOf(4));
        c.put("L63", Integer.valueOf(16));
        c.put("L90", Integer.valueOf(64));
        c.put("L93", Integer.valueOf(256));
        c.put("L120", Integer.valueOf(Imgproc.INTER_TAB_SIZE2));
        c.put("L123", Integer.valueOf(4096));
        c.put("L150", Integer.valueOf(16384));
        c.put("L153", Integer.valueOf(Imgproc.FLOODFILL_FIXED_RANGE));
        c.put("L156", Integer.valueOf(262144));
        c.put("L180", Integer.valueOf(1048576));
        c.put("L183", Integer.valueOf(4194304));
        c.put("L186", Integer.valueOf(LaExpander.DEFAULT_KITKAT_LINEAR_ALLOC_SIZE));
        c.put("H30", Integer.valueOf(2));
        c.put("H60", Integer.valueOf(8));
        c.put("H63", Integer.valueOf(32));
        c.put("H90", Integer.valueOf(128));
        c.put("H93", Integer.valueOf(RasterSource.DEFAULT_TILE_SIZE));
        c.put("H120", Integer.valueOf(ItemAnimator.FLAG_MOVED));
        c.put("H123", Integer.valueOf(8192));
        c.put("H150", Integer.valueOf(32768));
        c.put("H153", Integer.valueOf(Imgproc.FLOODFILL_MASK_ONLY));
        c.put("H156", Integer.valueOf(524288));
        c.put("H180", Integer.valueOf(2097152));
        c.put("H183", Integer.valueOf(8388608));
        c.put("H186", Integer.valueOf(33554432));
    }

    public static int a() {
        if (g == -1) {
            int i = 0;
            bqk a = bqn.a("video/avc", false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = a2[i].level;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i3 = 101376;
                                break;
                            case 64:
                                i3 = 202752;
                                break;
                            case 128:
                            case 256:
                                i3 = 414720;
                                break;
                            case RasterSource.DEFAULT_TILE_SIZE /*512*/:
                                i3 = 921600;
                                break;
                            case Imgproc.INTER_TAB_SIZE2 /*1024*/:
                                i3 = 1310720;
                                break;
                            case ItemAnimator.FLAG_MOVED /*2048*/:
                            case 4096:
                                i3 = 2097152;
                                break;
                            case 8192:
                                i3 = 2228224;
                                break;
                            case 16384:
                                i3 = 5652480;
                                break;
                            case 32768:
                            case Imgproc.FLOODFILL_FIXED_RANGE /*65536*/:
                                i3 = 9437184;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                    }
                    i3 = 25344;
                    i2 = Math.max(i3, i2);
                    i++;
                }
                i = Math.max(i2, bzo.a >= 21 ? 345600 : 172800);
            }
            g = i;
        }
        return g;
    }

    public static Pair<Integer, Integer> a(String str, String[] strArr) {
        String str2 = "Ignoring malformed AVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length >= 2) {
            try {
                Integer valueOf;
                Integer num;
                String str4;
                if (strArr[1].length() == 6) {
                    Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                    valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                    num = valueOf2;
                } else if (strArr.length >= 3) {
                    num = Integer.valueOf(Integer.parseInt(strArr[1]));
                    valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                } else {
                    Log.w(str3, str2.concat(String.valueOf(str)));
                    return null;
                }
                int i = e.get(num.intValue(), -1);
                if (i == -1) {
                    str = String.valueOf(num);
                    str4 = "Unknown AVC profile: ";
                } else {
                    int i2 = f.get(valueOf.intValue(), -1);
                    if (i2 != -1) {
                        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    str = String.valueOf(valueOf);
                    str4 = "Unknown AVC level: ";
                }
                str = str4.concat(str);
            } catch (NumberFormatException unused) {
            }
            Log.w(str3, str);
            return null;
        }
        str = str2.concat(String.valueOf(str));
        Log.w(str3, str);
        return null;
    }

    public static bqk a(String str, boolean z) {
        List b = bqn.b(str, z);
        return b.isEmpty() ? null : (bqk) b.get(0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:213:0x033b in {11, 25, 26, 31, 42, 71, 84, 92, 111, 130, 137, 142, 143, 144, 161, 165, 166, 168, 169, 173, 178, 179, 186, 188, 189, 191, 193, 194, 195, 203, 205, 206, 207, 208, 209, 212} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static java.util.ArrayList<defpackage.bqk> a(defpackage.bqn.a r18, defpackage.bqn.c r19, java.lang.String r20) {
        /*
        r1 = r18;
        r2 = r19;
        r4 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0333 }
        r4.<init>();	 Catch:{ Exception -> 0x0333 }
        r5 = r1.a;	 Catch:{ Exception -> 0x0333 }
        r6 = r19.a();	 Catch:{ Exception -> 0x0333 }
        r7 = r19.b();	 Catch:{ Exception -> 0x0333 }
        r8 = 0;	 Catch:{ Exception -> 0x0333 }
        if (r8 >= r6) goto L_0x0332;	 Catch:{ Exception -> 0x0333 }
        r9 = r2.a(r8);	 Catch:{ Exception -> 0x0333 }
        r10 = r9.getName();	 Catch:{ Exception -> 0x0333 }
        r0 = r9.isEncoder();	 Catch:{ Exception -> 0x0333 }
        r11 = ".secure";
        if (r0 != 0) goto L_0x0065;
        if (r7 != 0) goto L_0x002f;
        r0 = r10.endsWith(r11);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        r13 = 21;	 Catch:{ Exception -> 0x0333 }
        if (r0 >= r13) goto L_0x0069;	 Catch:{ Exception -> 0x0333 }
        r0 = "CIPAACDecoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "CIPMP3Decoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "CIPVorbisDecoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "CIPAMRNBDecoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "AACDecoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "MP3Decoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0069;	 Catch:{ Exception -> 0x0333 }
        r13 = r20;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0248;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        r13 = 18;	 Catch:{ Exception -> 0x0333 }
        if (r0 >= r13) goto L_0x0078;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.SEC.MP3.Decoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0078;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        if (r0 >= r13) goto L_0x00a3;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.MTK.AUDIO.DECODER.AAC";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x00a3;	 Catch:{ Exception -> 0x0333 }
        r0 = "a70";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "Xiaomi";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.c;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x00a3;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r13 = "HM";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x00a3;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        r13 = 16;	 Catch:{ Exception -> 0x0333 }
        if (r0 != r13) goto L_0x012b;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.qcom.audio.decoder.mp3";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x012b;	 Catch:{ Exception -> 0x0333 }
        r0 = "dlxu";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "protou";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "ville";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "villeplus";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "villec2";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r14 = "gee";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C6602";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C6603";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C6606";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C6616";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "L36h";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "SO-02E";	 Catch:{ Exception -> 0x0333 }
        r14 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x012b;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        if (r0 != r13) goto L_0x0161;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.qcom.audio.decoder.aac";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0161;	 Catch:{ Exception -> 0x0333 }
        r0 = "C1504";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C1505";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C1604";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "C1605";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0161;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        r13 = 24;
        r14 = "samsung";
        if (r0 >= r13) goto L_0x01d3;
        r0 = "OMX.SEC.aac.dec";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0179;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.Exynos.AAC.Decoder";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x01d3;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.c;	 Catch:{ Exception -> 0x0333 }
        r0 = r14.equals(r0);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x01d3;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r13 = "zeroflte";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r13 = "zerolte";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r13 = "zenlte";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "SC-05G";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "marinelteatt";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "404SC";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "SC-04G";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "SCV31";	 Catch:{ Exception -> 0x0333 }
        r13 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x01d3;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        r13 = "jflte";
        r15 = 19;
        if (r0 > r15) goto L_0x021d;
        r0 = "OMX.SEC.vp8.dec";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x021d;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.c;	 Catch:{ Exception -> 0x0333 }
        r0 = r14.equals(r0);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x021d;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r14 = "d2";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r14 = "serrano";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r14 = "santos";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 != 0) goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r14 = "t0";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r14);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x021d;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        if (r0 > r15) goto L_0x0233;	 Catch:{ Exception -> 0x0333 }
        r0 = defpackage.bzo.b;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.startsWith(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0233;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.qcom.video.decoder.vp8";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0233;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0333 }
        r0 = "audio/eac3-joc";	 Catch:{ Exception -> 0x0333 }
        r13 = r20;	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r13);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0246;	 Catch:{ Exception -> 0x0333 }
        r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3";	 Catch:{ Exception -> 0x0333 }
        r0 = r0.equals(r10);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0246;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0248;	 Catch:{ Exception -> 0x0333 }
        r0 = 1;	 Catch:{ Exception -> 0x0333 }
        goto L_0x0249;	 Catch:{ Exception -> 0x0333 }
        r0 = 0;	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x0328;	 Catch:{ Exception -> 0x0333 }
        r14 = r9.getSupportedTypes();	 Catch:{ Exception -> 0x0333 }
        r15 = r14.length;	 Catch:{ Exception -> 0x0333 }
        r12 = 0;	 Catch:{ Exception -> 0x0333 }
        if (r12 >= r15) goto L_0x0328;	 Catch:{ Exception -> 0x0333 }
        r3 = r14[r12];	 Catch:{ Exception -> 0x0333 }
        r0 = r3.equalsIgnoreCase(r5);	 Catch:{ Exception -> 0x0333 }
        if (r0 == 0) goto L_0x031a;
        r0 = r9.getCapabilitiesForType(r3);	 Catch:{ Exception -> 0x02d0 }
        r16 = r6;
        r6 = r2.a(r5, r0);	 Catch:{ Exception -> 0x02ce }
        r2 = defpackage.bzo.a;	 Catch:{ Exception -> 0x02ce }
        r17 = r9;
        r9 = 22;
        if (r2 > r9) goto L_0x0295;
        r2 = "ODROID-XU3";	 Catch:{ Exception -> 0x0293 }
        r9 = defpackage.bzo.d;	 Catch:{ Exception -> 0x0293 }
        r2 = r2.equals(r9);	 Catch:{ Exception -> 0x0293 }
        if (r2 != 0) goto L_0x0281;	 Catch:{ Exception -> 0x0293 }
        r2 = "Nexus 10";	 Catch:{ Exception -> 0x0293 }
        r9 = defpackage.bzo.d;	 Catch:{ Exception -> 0x0293 }
        r2 = r2.equals(r9);	 Catch:{ Exception -> 0x0293 }
        if (r2 == 0) goto L_0x0295;	 Catch:{ Exception -> 0x0293 }
        r2 = "OMX.Exynos.AVC.Decoder";	 Catch:{ Exception -> 0x0293 }
        r2 = r2.equals(r10);	 Catch:{ Exception -> 0x0293 }
        if (r2 != 0) goto L_0x0291;	 Catch:{ Exception -> 0x0293 }
        r2 = "OMX.Exynos.AVC.Decoder.secure";	 Catch:{ Exception -> 0x0293 }
        r2 = r2.equals(r10);	 Catch:{ Exception -> 0x0293 }
        if (r2 == 0) goto L_0x0295;	 Catch:{ Exception -> 0x0293 }
        r2 = 1;	 Catch:{ Exception -> 0x0293 }
        goto L_0x0296;	 Catch:{ Exception -> 0x0293 }
        r0 = move-exception;	 Catch:{ Exception -> 0x0293 }
        goto L_0x02d5;	 Catch:{ Exception -> 0x0293 }
        r2 = 0;	 Catch:{ Exception -> 0x0293 }
        if (r7 == 0) goto L_0x029f;	 Catch:{ Exception -> 0x0293 }
        r9 = r1.b;	 Catch:{ Exception -> 0x0293 }
        if (r9 == r6) goto L_0x029d;	 Catch:{ Exception -> 0x0293 }
        goto L_0x029f;	 Catch:{ Exception -> 0x0293 }
        r6 = 0;	 Catch:{ Exception -> 0x0293 }
        goto L_0x02a6;	 Catch:{ Exception -> 0x0293 }
        if (r7 != 0) goto L_0x02ae;	 Catch:{ Exception -> 0x0293 }
        r9 = r1.b;	 Catch:{ Exception -> 0x0293 }
        if (r9 != 0) goto L_0x02ae;	 Catch:{ Exception -> 0x0293 }
        goto L_0x029d;	 Catch:{ Exception -> 0x0293 }
        r0 = defpackage.bqk.a(r10, r5, r0, r2, r6);	 Catch:{ Exception -> 0x0293 }
        r4.add(r0);	 Catch:{ Exception -> 0x0293 }
        goto L_0x031e;	 Catch:{ Exception -> 0x0293 }
        if (r7 != 0) goto L_0x02cc;	 Catch:{ Exception -> 0x0293 }
        if (r6 == 0) goto L_0x02cc;	 Catch:{ Exception -> 0x0293 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0293 }
        r6.<init>();	 Catch:{ Exception -> 0x0293 }
        r6.append(r10);	 Catch:{ Exception -> 0x0293 }
        r6.append(r11);	 Catch:{ Exception -> 0x0293 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0293 }
        r9 = 1;
        r0 = defpackage.bqk.a(r6, r5, r0, r2, r9);	 Catch:{ Exception -> 0x02ca }
        r4.add(r0);	 Catch:{ Exception -> 0x02ca }
        return r4;
        r0 = move-exception;
        goto L_0x02d6;
        r9 = 1;
        goto L_0x031e;
        r0 = move-exception;
        goto L_0x02d3;
        r0 = move-exception;
        r16 = r6;
        r17 = r9;
        r9 = 1;
        r2 = defpackage.bzo.a;	 Catch:{ Exception -> 0x0333 }
        r6 = 23;
        r9 = "MediaCodecUtil";
        if (r2 > r6) goto L_0x02fb;
        r2 = r4.isEmpty();	 Catch:{ Exception -> 0x0333 }
        if (r2 != 0) goto L_0x02fb;	 Catch:{ Exception -> 0x0333 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0333 }
        r2 = "Skipping codec ";	 Catch:{ Exception -> 0x0333 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0333 }
        r0.append(r10);	 Catch:{ Exception -> 0x0333 }
        r2 = " (failed to query capabilities)";	 Catch:{ Exception -> 0x0333 }
        r0.append(r2);	 Catch:{ Exception -> 0x0333 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0333 }
        android.util.Log.e(r9, r0);	 Catch:{ Exception -> 0x0333 }
        goto L_0x031e;	 Catch:{ Exception -> 0x0333 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0333 }
        r2 = "Failed to query codec ";	 Catch:{ Exception -> 0x0333 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0333 }
        r1.append(r10);	 Catch:{ Exception -> 0x0333 }
        r2 = " (";	 Catch:{ Exception -> 0x0333 }
        r1.append(r2);	 Catch:{ Exception -> 0x0333 }
        r1.append(r3);	 Catch:{ Exception -> 0x0333 }
        r2 = ")";	 Catch:{ Exception -> 0x0333 }
        r1.append(r2);	 Catch:{ Exception -> 0x0333 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x0333 }
        android.util.Log.e(r9, r1);	 Catch:{ Exception -> 0x0333 }
        throw r0;	 Catch:{ Exception -> 0x0333 }
        r16 = r6;
        r17 = r9;
        r12 = r12 + 1;
        r2 = r19;
        r6 = r16;
        r9 = r17;
        goto L_0x0251;
        r16 = r6;
        r8 = r8 + 1;
        r2 = r19;
        r6 = r16;
        goto L_0x0014;
        return r4;
        r0 = move-exception;
        r1 = new bqn$b;
        r2 = 0;
        r1.<init>(r0, r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqn.a(bqn$a, bqn$c, java.lang.String):java.util.ArrayList");
    }

    private static void a(List<bqk> list) {
        if (bzo.a < 26) {
            int i = 1;
            if (list.size() > 1) {
                if ("OMX.MTK.AUDIO.DECODER.RAW".equals(((bqk) list.get(0)).a)) {
                    while (i < list.size()) {
                        bqk bqk = (bqk) list.get(i);
                        if ("OMX.google.raw.decoder".equals(bqk.a)) {
                            list.remove(i);
                            list.add(0, bqk);
                            return;
                        }
                        i++;
                    }
                }
            }
        }
    }

    private static synchronized List<bqk> b(String str, boolean z) {
        synchronized (bqn.class) {
            a aVar = new a(str, z);
            List list = (List) d.get(aVar);
            if (list != null) {
                return list;
            }
            c eVar = bzo.a >= 21 ? new e(z) : new d();
            ArrayList a = bqn.a(aVar, eVar, str);
            if (z && a.isEmpty() && 21 <= bzo.a && bzo.a <= 23) {
                eVar = new d();
                a = bqn.a(aVar, eVar, str);
                if (!a.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder("MediaCodecList API didn't list secure decoder for: ");
                    stringBuilder.append(str);
                    stringBuilder.append(". Assuming: ");
                    stringBuilder.append(((bqk) a.get(0)).a);
                    Log.w("MediaCodecUtil", stringBuilder.toString());
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                a.addAll(bqn.a(new a("audio/eac3", aVar.b), eVar, str));
            }
            bqn.a(a);
            List unmodifiableList = Collections.unmodifiableList(a);
            d.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }
}
