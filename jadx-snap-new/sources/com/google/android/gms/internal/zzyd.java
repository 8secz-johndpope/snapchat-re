package com.google.android.gms.internal;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzf;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Set;

@zzabh
public final class zzyd extends zzyn {
    private static Set<String> zzcky = zzf.zzb(Property.TEXT_ANCHOR_TOP_LEFT, Property.TEXT_ANCHOR_TOP_RIGHT, "top-center", "center", Property.TEXT_ANCHOR_BOTTOM_LEFT, Property.TEXT_ANCHOR_BOTTOM_RIGHT, "bottom-center");
    private final Object mLock = new Object();
    private int zzalt = -1;
    private int zzalu = -1;
    private zzyo zzcco;
    private final zzaof zzcct;
    private final Activity zzckp;
    private String zzckz = Property.TEXT_ANCHOR_TOP_RIGHT;
    private boolean zzcla = true;
    private int zzclb = 0;
    private int zzclc = 0;
    private int zzcld = 0;
    private int zzcle = 0;
    private zzaqa zzclf;
    private ImageView zzclg;
    private LinearLayout zzclh;
    private PopupWindow zzcli;
    private RelativeLayout zzclj;
    private ViewGroup zzclk;

    public zzyd(zzaof zzaof, zzyo zzyo) {
        super(zzaof, "resize");
        this.zzcct = zzaof;
        this.zzckp = zzaof.zztj();
        this.zzcco = zzyo;
    }

    private final void zza(int i, int i2) {
        zzb(i, i2 - zzbt.zzel().zzh(this.zzckp)[0], this.zzalt, this.zzalu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARNING: Missing block: B:52:0x00f7, code skipped:
            if ((r5 + 50) <= r1[1]) goto L_0x00fa;
     */
    private final int[] zzne() {
        /*
        r12 = this;
        r0 = com.google.android.gms.ads.internal.zzbt.zzel();
        r1 = r12.zzckp;
        r0 = r0.zzg(r1);
        r1 = com.google.android.gms.ads.internal.zzbt.zzel();
        r2 = r12.zzckp;
        r1 = r1.zzh(r2);
        r2 = 0;
        r3 = r0[r2];
        r4 = 1;
        r0 = r0[r4];
        r5 = r12.zzalt;
        r6 = 2;
        r7 = 50;
        if (r5 < r7) goto L_0x00ff;
    L_0x0021:
        if (r5 <= r3) goto L_0x0025;
    L_0x0023:
        goto L_0x00ff;
    L_0x0025:
        r8 = r12.zzalu;
        if (r8 < r7) goto L_0x00fc;
    L_0x0029:
        if (r8 <= r0) goto L_0x002d;
    L_0x002b:
        goto L_0x00fc;
    L_0x002d:
        if (r8 != r0) goto L_0x0035;
    L_0x002f:
        if (r5 != r3) goto L_0x0035;
    L_0x0031:
        r0 = "Cannot resize to a full-screen ad.";
        goto L_0x0101;
    L_0x0035:
        r0 = r12.zzcla;
        if (r0 == 0) goto L_0x00fa;
    L_0x0039:
        r0 = r12.zzckz;
        r5 = -1;
        r8 = r0.hashCode();
        r9 = 5;
        r10 = 4;
        r11 = 3;
        switch(r8) {
            case -1364013995: goto L_0x0079;
            case -1012429441: goto L_0x006f;
            case -655373719: goto L_0x0065;
            case 1163912186: goto L_0x005b;
            case 1288627767: goto L_0x0051;
            case 1755462605: goto L_0x0047;
            default: goto L_0x0046;
        };
    L_0x0046:
        goto L_0x0082;
    L_0x0047:
        r8 = "top-center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0082;
    L_0x004f:
        r5 = 1;
        goto L_0x0082;
    L_0x0051:
        r8 = "bottom-center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0082;
    L_0x0059:
        r5 = 4;
        goto L_0x0082;
    L_0x005b:
        r8 = "bottom-right";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0082;
    L_0x0063:
        r5 = 5;
        goto L_0x0082;
    L_0x0065:
        r8 = "bottom-left";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0082;
    L_0x006d:
        r5 = 3;
        goto L_0x0082;
    L_0x006f:
        r8 = "top-left";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0082;
    L_0x0077:
        r5 = 0;
        goto L_0x0082;
    L_0x0079:
        r8 = "center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0082;
    L_0x0081:
        r5 = 2;
    L_0x0082:
        if (r5 == 0) goto L_0x00e5;
    L_0x0084:
        if (r5 == r4) goto L_0x00d9;
    L_0x0086:
        if (r5 == r6) goto L_0x00c2;
    L_0x0088:
        if (r5 == r11) goto L_0x00b3;
    L_0x008a:
        if (r5 == r10) goto L_0x00a7;
    L_0x008c:
        if (r5 == r9) goto L_0x009d;
    L_0x008e:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
        r5 = r12.zzalt;
        r0 = r0 + r5;
        r0 = r0 - r7;
    L_0x0097:
        r5 = r12.zzclc;
        r8 = r12.zzcle;
        r5 = r5 + r8;
        goto L_0x00eb;
    L_0x009d:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
        r5 = r12.zzalt;
        r0 = r0 + r5;
        r0 = r0 - r7;
        goto L_0x00b8;
    L_0x00a7:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
        r5 = r12.zzalt;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        goto L_0x00b8;
    L_0x00b3:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
    L_0x00b8:
        r5 = r12.zzclc;
        r8 = r12.zzcle;
        r5 = r5 + r8;
        r8 = r12.zzalu;
        r5 = r5 + r8;
        r5 = r5 - r7;
        goto L_0x00eb;
    L_0x00c2:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
        r5 = r12.zzalt;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        r5 = r12.zzclc;
        r8 = r12.zzcle;
        r5 = r5 + r8;
        r8 = r12.zzalu;
        r8 = r8 / r6;
        r5 = r5 + r8;
        r5 = r5 + -25;
        goto L_0x00eb;
    L_0x00d9:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
        r5 = r12.zzalt;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        goto L_0x0097;
    L_0x00e5:
        r0 = r12.zzclb;
        r5 = r12.zzcld;
        r0 = r0 + r5;
        goto L_0x0097;
    L_0x00eb:
        if (r0 < 0) goto L_0x0104;
    L_0x00ed:
        r0 = r0 + r7;
        if (r0 > r3) goto L_0x0104;
    L_0x00f0:
        r0 = r1[r2];
        if (r5 < r0) goto L_0x0104;
    L_0x00f4:
        r5 = r5 + r7;
        r0 = r1[r4];
        if (r5 <= r0) goto L_0x00fa;
    L_0x00f9:
        goto L_0x0104;
    L_0x00fa:
        r0 = 1;
        goto L_0x0105;
    L_0x00fc:
        r0 = "Height is too small or too large.";
        goto L_0x0101;
    L_0x00ff:
        r0 = "Width is too small or too large.";
    L_0x0101:
        com.google.android.gms.internal.zzaky.zzcz(r0);
    L_0x0104:
        r0 = 0;
    L_0x0105:
        if (r0 != 0) goto L_0x0109;
    L_0x0107:
        r0 = 0;
        return r0;
    L_0x0109:
        r0 = r12.zzcla;
        if (r0 == 0) goto L_0x011e;
    L_0x010d:
        r0 = new int[r6];
        r1 = r12.zzclb;
        r3 = r12.zzcld;
        r1 = r1 + r3;
        r0[r2] = r1;
        r1 = r12.zzclc;
        r2 = r12.zzcle;
        r1 = r1 + r2;
        r0[r4] = r1;
        return r0;
    L_0x011e:
        r0 = com.google.android.gms.ads.internal.zzbt.zzel();
        r1 = r12.zzckp;
        r0 = r0.zzg(r1);
        r1 = com.google.android.gms.ads.internal.zzbt.zzel();
        r3 = r12.zzckp;
        r1 = r1.zzh(r3);
        r0 = r0[r2];
        r3 = r12.zzclb;
        r5 = r12.zzcld;
        r3 = r3 + r5;
        r5 = r12.zzclc;
        r7 = r12.zzcle;
        r5 = r5 + r7;
        if (r3 >= 0) goto L_0x0142;
    L_0x0140:
        r0 = 0;
        goto L_0x014b;
    L_0x0142:
        r7 = r12.zzalt;
        r8 = r3 + r7;
        if (r8 <= r0) goto L_0x014a;
    L_0x0148:
        r0 = r0 - r7;
        goto L_0x014b;
    L_0x014a:
        r0 = r3;
    L_0x014b:
        r3 = r1[r2];
        if (r5 >= r3) goto L_0x0152;
    L_0x014f:
        r5 = r1[r2];
        goto L_0x015e;
    L_0x0152:
        r3 = r12.zzalu;
        r7 = r5 + r3;
        r8 = r1[r4];
        if (r7 <= r8) goto L_0x015e;
    L_0x015a:
        r1 = r1[r4];
        r5 = r1 - r3;
    L_0x015e:
        r1 = new int[r6];
        r1[r2] = r0;
        r1[r4] = r5;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzyd.zzne():int[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:142:0x032d in {7, 12, 17, 22, 25, 28, 31, 34, 37, 40, 45, 46, 50, 55, 60, 67, 68, 71, 72, 75, 78, 81, 84, 87, 90, 93, 104, 105, 106, 107, 108, 109, 110, 111, 112, 119, 122, 126, 127, 130, 132, 135, 138, 141} preds:[]
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
    public final void execute(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r1.mLock;
        monitor-enter(r2);
        r3 = r1.zzckp;	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x0012;	 Catch:{ all -> 0x032a }
        r0 = "Not an activity context. Cannot resize.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r3 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r3 = r3.zzty();	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x0021;	 Catch:{ all -> 0x032a }
        r0 = "Webview is not yet available, size is not set.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r3 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r3 = r3.zzty();	 Catch:{ all -> 0x032a }
        r3 = r3.zzvl();	 Catch:{ all -> 0x032a }
        if (r3 == 0) goto L_0x0034;	 Catch:{ all -> 0x032a }
        r0 = "Is interstitial. Cannot resize an interstitial.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r3 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r3 = r3.zzud();	 Catch:{ all -> 0x032a }
        if (r3 == 0) goto L_0x0043;	 Catch:{ all -> 0x032a }
        r0 = "Cannot resize an expanded banner.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r3 = "width";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x032a }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x0062;	 Catch:{ all -> 0x032a }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x032a }
        r3 = "width";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x032a }
        r3 = com.google.android.gms.internal.zzaij.zzcj(r3);	 Catch:{ all -> 0x032a }
        r1.zzalt = r3;	 Catch:{ all -> 0x032a }
        r3 = "height";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x032a }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x0081;	 Catch:{ all -> 0x032a }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x032a }
        r3 = "height";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x032a }
        r3 = com.google.android.gms.internal.zzaij.zzcj(r3);	 Catch:{ all -> 0x032a }
        r1.zzalu = r3;	 Catch:{ all -> 0x032a }
        r3 = "offsetX";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x032a }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x00a0;	 Catch:{ all -> 0x032a }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x032a }
        r3 = "offsetX";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x032a }
        r3 = com.google.android.gms.internal.zzaij.zzcj(r3);	 Catch:{ all -> 0x032a }
        r1.zzcld = r3;	 Catch:{ all -> 0x032a }
        r3 = "offsetY";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x032a }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x00bf;	 Catch:{ all -> 0x032a }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x032a }
        r3 = "offsetY";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x032a }
        r3 = com.google.android.gms.internal.zzaij.zzcj(r3);	 Catch:{ all -> 0x032a }
        r1.zzcle = r3;	 Catch:{ all -> 0x032a }
        r3 = "allowOffscreen";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x032a }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x00db;	 Catch:{ all -> 0x032a }
        r3 = "allowOffscreen";	 Catch:{ all -> 0x032a }
        r3 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x032a }
        r3 = java.lang.Boolean.parseBoolean(r3);	 Catch:{ all -> 0x032a }
        r1.zzcla = r3;	 Catch:{ all -> 0x032a }
        r3 = "customClosePosition";	 Catch:{ all -> 0x032a }
        r0 = r0.get(r3);	 Catch:{ all -> 0x032a }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x032a }
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x032a }
        if (r3 != 0) goto L_0x00eb;	 Catch:{ all -> 0x032a }
        r1.zzckz = r0;	 Catch:{ all -> 0x032a }
        r0 = r1.zzalt;	 Catch:{ all -> 0x032a }
        r3 = 1;	 Catch:{ all -> 0x032a }
        r4 = 0;	 Catch:{ all -> 0x032a }
        if (r0 < 0) goto L_0x00f7;	 Catch:{ all -> 0x032a }
        r0 = r1.zzalu;	 Catch:{ all -> 0x032a }
        if (r0 < 0) goto L_0x00f7;	 Catch:{ all -> 0x032a }
        r0 = 1;	 Catch:{ all -> 0x032a }
        goto L_0x00f8;	 Catch:{ all -> 0x032a }
        r0 = 0;	 Catch:{ all -> 0x032a }
        if (r0 != 0) goto L_0x0101;	 Catch:{ all -> 0x032a }
        r0 = "Invalid width and height options. Cannot resize.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r0 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r0 = r0.getWindow();	 Catch:{ all -> 0x032a }
        if (r0 == 0) goto L_0x0323;	 Catch:{ all -> 0x032a }
        r5 = r0.getDecorView();	 Catch:{ all -> 0x032a }
        if (r5 != 0) goto L_0x0111;	 Catch:{ all -> 0x032a }
        goto L_0x0323;	 Catch:{ all -> 0x032a }
        r5 = r16.zzne();	 Catch:{ all -> 0x032a }
        if (r5 != 0) goto L_0x011e;	 Catch:{ all -> 0x032a }
        r0 = "Resize location out of screen or close button is not visible.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ all -> 0x032a }
        r6 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r7 = r1.zzalt;	 Catch:{ all -> 0x032a }
        r6 = com.google.android.gms.internal.zzako.zza(r6, r7);	 Catch:{ all -> 0x032a }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ all -> 0x032a }
        r7 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r8 = r1.zzalu;	 Catch:{ all -> 0x032a }
        r7 = com.google.android.gms.internal.zzako.zza(r7, r8);	 Catch:{ all -> 0x032a }
        r8 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r8 = r8.getView();	 Catch:{ all -> 0x032a }
        r8 = r8.getParent();	 Catch:{ all -> 0x032a }
        if (r8 == 0) goto L_0x031c;	 Catch:{ all -> 0x032a }
        r9 = r8 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x031c;	 Catch:{ all -> 0x032a }
        r9 = r8;	 Catch:{ all -> 0x032a }
        r9 = (android.view.ViewGroup) r9;	 Catch:{ all -> 0x032a }
        r10 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r10 = r10.getView();	 Catch:{ all -> 0x032a }
        r9.removeView(r10);	 Catch:{ all -> 0x032a }
        r9 = r1.zzcli;	 Catch:{ all -> 0x032a }
        if (r9 != 0) goto L_0x0183;	 Catch:{ all -> 0x032a }
        r8 = (android.view.ViewGroup) r8;	 Catch:{ all -> 0x032a }
        r1.zzclk = r8;	 Catch:{ all -> 0x032a }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x032a }
        r8 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r8 = r8.getView();	 Catch:{ all -> 0x032a }
        r8 = com.google.android.gms.internal.zzaij.zzr(r8);	 Catch:{ all -> 0x032a }
        r9 = new android.widget.ImageView;	 Catch:{ all -> 0x032a }
        r10 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r9.<init>(r10);	 Catch:{ all -> 0x032a }
        r1.zzclg = r9;	 Catch:{ all -> 0x032a }
        r9 = r1.zzclg;	 Catch:{ all -> 0x032a }
        r9.setImageBitmap(r8);	 Catch:{ all -> 0x032a }
        r8 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r8 = r8.zzty();	 Catch:{ all -> 0x032a }
        r1.zzclf = r8;	 Catch:{ all -> 0x032a }
        r8 = r1.zzclk;	 Catch:{ all -> 0x032a }
        r9 = r1.zzclg;	 Catch:{ all -> 0x032a }
        r8.addView(r9);	 Catch:{ all -> 0x032a }
        goto L_0x0188;	 Catch:{ all -> 0x032a }
        r8 = r1.zzcli;	 Catch:{ all -> 0x032a }
        r8.dismiss();	 Catch:{ all -> 0x032a }
        r8 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x032a }
        r9 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r8.<init>(r9);	 Catch:{ all -> 0x032a }
        r1.zzclj = r8;	 Catch:{ all -> 0x032a }
        r8 = r1.zzclj;	 Catch:{ all -> 0x032a }
        r8.setBackgroundColor(r4);	 Catch:{ all -> 0x032a }
        r8 = r1.zzclj;	 Catch:{ all -> 0x032a }
        r9 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x032a }
        r9.<init>(r6, r7);	 Catch:{ all -> 0x032a }
        r8.setLayoutParams(r9);	 Catch:{ all -> 0x032a }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x032a }
        r8 = r1.zzclj;	 Catch:{ all -> 0x032a }
        r8 = com.google.android.gms.internal.zzaij.zza(r8, r6, r7, r4);	 Catch:{ all -> 0x032a }
        r1.zzcli = r8;	 Catch:{ all -> 0x032a }
        r8 = r1.zzcli;	 Catch:{ all -> 0x032a }
        r8.setOutsideTouchable(r3);	 Catch:{ all -> 0x032a }
        r8 = r1.zzcli;	 Catch:{ all -> 0x032a }
        r8.setTouchable(r3);	 Catch:{ all -> 0x032a }
        r8 = r1.zzcli;	 Catch:{ all -> 0x032a }
        r9 = r1.zzcla;	 Catch:{ all -> 0x032a }
        if (r9 != 0) goto L_0x01bd;	 Catch:{ all -> 0x032a }
        r9 = 1;	 Catch:{ all -> 0x032a }
        goto L_0x01be;	 Catch:{ all -> 0x032a }
        r9 = 0;	 Catch:{ all -> 0x032a }
        r8.setClippingEnabled(r9);	 Catch:{ all -> 0x032a }
        r8 = r1.zzclj;	 Catch:{ all -> 0x032a }
        r9 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r9 = r9.getView();	 Catch:{ all -> 0x032a }
        r10 = -1;	 Catch:{ all -> 0x032a }
        r8.addView(r9, r10, r10);	 Catch:{ all -> 0x032a }
        r8 = new android.widget.LinearLayout;	 Catch:{ all -> 0x032a }
        r9 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r8.<init>(r9);	 Catch:{ all -> 0x032a }
        r1.zzclh = r8;	 Catch:{ all -> 0x032a }
        r8 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x032a }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ all -> 0x032a }
        r9 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r11 = 50;	 Catch:{ all -> 0x032a }
        r9 = com.google.android.gms.internal.zzako.zza(r9, r11);	 Catch:{ all -> 0x032a }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ all -> 0x032a }
        r12 = r1.zzckp;	 Catch:{ all -> 0x032a }
        r11 = com.google.android.gms.internal.zzako.zza(r12, r11);	 Catch:{ all -> 0x032a }
        r8.<init>(r9, r11);	 Catch:{ all -> 0x032a }
        r9 = r1.zzckz;	 Catch:{ all -> 0x032a }
        r11 = r9.hashCode();	 Catch:{ all -> 0x032a }
        r12 = 5;	 Catch:{ all -> 0x032a }
        r13 = 4;	 Catch:{ all -> 0x032a }
        r14 = 3;	 Catch:{ all -> 0x032a }
        r15 = 2;	 Catch:{ all -> 0x032a }
        switch(r11) {
            case -1364013995: goto L_0x022f;
            case -1012429441: goto L_0x0225;
            case -655373719: goto L_0x021b;
            case 1163912186: goto L_0x0211;
            case 1288627767: goto L_0x0207;
            case 1755462605: goto L_0x01fd;
            default: goto L_0x01fc;
        };	 Catch:{ all -> 0x032a }
        goto L_0x0238;	 Catch:{ all -> 0x032a }
        r11 = "top-center";	 Catch:{ all -> 0x032a }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x0238;	 Catch:{ all -> 0x032a }
        r10 = 1;	 Catch:{ all -> 0x032a }
        goto L_0x0238;	 Catch:{ all -> 0x032a }
        r11 = "bottom-center";	 Catch:{ all -> 0x032a }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x0238;	 Catch:{ all -> 0x032a }
        r10 = 4;	 Catch:{ all -> 0x032a }
        goto L_0x0238;	 Catch:{ all -> 0x032a }
        r11 = "bottom-right";	 Catch:{ all -> 0x032a }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x0238;	 Catch:{ all -> 0x032a }
        r10 = 5;	 Catch:{ all -> 0x032a }
        goto L_0x0238;	 Catch:{ all -> 0x032a }
        r11 = "bottom-left";	 Catch:{ all -> 0x032a }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x0238;	 Catch:{ all -> 0x032a }
        r10 = 3;	 Catch:{ all -> 0x032a }
        goto L_0x0238;	 Catch:{ all -> 0x032a }
        r11 = "top-left";	 Catch:{ all -> 0x032a }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x0238;	 Catch:{ all -> 0x032a }
        r10 = 0;	 Catch:{ all -> 0x032a }
        goto L_0x0238;	 Catch:{ all -> 0x032a }
        r11 = "center";	 Catch:{ all -> 0x032a }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x032a }
        if (r9 == 0) goto L_0x0238;	 Catch:{ all -> 0x032a }
        r10 = 2;	 Catch:{ all -> 0x032a }
        r9 = 9;	 Catch:{ all -> 0x032a }
        r11 = 10;	 Catch:{ all -> 0x032a }
        if (r10 == 0) goto L_0x026e;	 Catch:{ all -> 0x032a }
        r4 = 14;	 Catch:{ all -> 0x032a }
        if (r10 == r3) goto L_0x026a;	 Catch:{ all -> 0x032a }
        if (r10 == r15) goto L_0x0264;	 Catch:{ all -> 0x032a }
        r15 = 12;	 Catch:{ all -> 0x032a }
        if (r10 == r14) goto L_0x025d;	 Catch:{ all -> 0x032a }
        if (r10 == r13) goto L_0x0259;	 Catch:{ all -> 0x032a }
        r4 = 11;	 Catch:{ all -> 0x032a }
        if (r10 == r12) goto L_0x0255;	 Catch:{ all -> 0x032a }
        r8.addRule(r11);	 Catch:{ all -> 0x032a }
        r8.addRule(r4);	 Catch:{ all -> 0x032a }
        goto L_0x0272;	 Catch:{ all -> 0x032a }
        r8.addRule(r15);	 Catch:{ all -> 0x032a }
        goto L_0x0251;	 Catch:{ all -> 0x032a }
        r8.addRule(r15);	 Catch:{ all -> 0x032a }
        goto L_0x0251;	 Catch:{ all -> 0x032a }
        r8.addRule(r15);	 Catch:{ all -> 0x032a }
        r8.addRule(r9);	 Catch:{ all -> 0x032a }
        goto L_0x0272;	 Catch:{ all -> 0x032a }
        r4 = 13;	 Catch:{ all -> 0x032a }
        r8.addRule(r4);	 Catch:{ all -> 0x032a }
        goto L_0x0272;	 Catch:{ all -> 0x032a }
        r8.addRule(r11);	 Catch:{ all -> 0x032a }
        goto L_0x0251;	 Catch:{ all -> 0x032a }
        r8.addRule(r11);	 Catch:{ all -> 0x032a }
        goto L_0x0260;	 Catch:{ all -> 0x032a }
        r4 = r1.zzclh;	 Catch:{ all -> 0x032a }
        r9 = new com.google.android.gms.internal.zzye;	 Catch:{ all -> 0x032a }
        r9.<init>(r1);	 Catch:{ all -> 0x032a }
        r4.setOnClickListener(r9);	 Catch:{ all -> 0x032a }
        r4 = r1.zzclh;	 Catch:{ all -> 0x032a }
        r9 = "Close button";	 Catch:{ all -> 0x032a }
        r4.setContentDescription(r9);	 Catch:{ all -> 0x032a }
        r4 = r1.zzclj;	 Catch:{ all -> 0x032a }
        r9 = r1.zzclh;	 Catch:{ all -> 0x032a }
        r4.addView(r9, r8);	 Catch:{ all -> 0x032a }
        r4 = r1.zzcli;	 Catch:{ RuntimeException -> 0x02d4 }
        r0 = r0.getDecorView();	 Catch:{ RuntimeException -> 0x02d4 }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ RuntimeException -> 0x02d4 }
        r8 = r1.zzckp;	 Catch:{ RuntimeException -> 0x02d4 }
        r9 = 0;	 Catch:{ RuntimeException -> 0x02d4 }
        r10 = r5[r9];	 Catch:{ RuntimeException -> 0x02d4 }
        r8 = com.google.android.gms.internal.zzako.zza(r8, r10);	 Catch:{ RuntimeException -> 0x02d4 }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ RuntimeException -> 0x02d4 }
        r9 = r1.zzckp;	 Catch:{ RuntimeException -> 0x02d4 }
        r10 = r5[r3];	 Catch:{ RuntimeException -> 0x02d4 }
        r9 = com.google.android.gms.internal.zzako.zza(r9, r10);	 Catch:{ RuntimeException -> 0x02d4 }
        r10 = 0;	 Catch:{ RuntimeException -> 0x02d4 }
        r4.showAtLocation(r0, r10, r8, r9);	 Catch:{ RuntimeException -> 0x02d4 }
        r0 = r5[r10];	 Catch:{ all -> 0x032a }
        r4 = r5[r3];	 Catch:{ all -> 0x032a }
        r8 = r1.zzcco;	 Catch:{ all -> 0x032a }
        if (r8 == 0) goto L_0x02bc;	 Catch:{ all -> 0x032a }
        r8 = r1.zzcco;	 Catch:{ all -> 0x032a }
        r9 = r1.zzalt;	 Catch:{ all -> 0x032a }
        r10 = r1.zzalu;	 Catch:{ all -> 0x032a }
        r8.zza(r0, r4, r9, r10);	 Catch:{ all -> 0x032a }
        r0 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r4 = com.google.android.gms.internal.zzaqa.zzi(r6, r7);	 Catch:{ all -> 0x032a }
        r0.zza(r4);	 Catch:{ all -> 0x032a }
        r0 = 0;	 Catch:{ all -> 0x032a }
        r0 = r5[r0];	 Catch:{ all -> 0x032a }
        r3 = r5[r3];	 Catch:{ all -> 0x032a }
        r1.zza(r0, r3);	 Catch:{ all -> 0x032a }
        r0 = "resized";	 Catch:{ all -> 0x032a }
        r1.zzbo(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r0 = move-exception;	 Catch:{ all -> 0x032a }
        r3 = "Cannot show popup window: ";	 Catch:{ all -> 0x032a }
        r0 = r0.getMessage();	 Catch:{ all -> 0x032a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x032a }
        r4 = r0.length();	 Catch:{ all -> 0x032a }
        if (r4 == 0) goto L_0x02ea;	 Catch:{ all -> 0x032a }
        r0 = r3.concat(r0);	 Catch:{ all -> 0x032a }
        goto L_0x02ef;	 Catch:{ all -> 0x032a }
        r0 = new java.lang.String;	 Catch:{ all -> 0x032a }
        r0.<init>(r3);	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        r0 = r1.zzclj;	 Catch:{ all -> 0x032a }
        r3 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r3 = r3.getView();	 Catch:{ all -> 0x032a }
        r0.removeView(r3);	 Catch:{ all -> 0x032a }
        r0 = r1.zzclk;	 Catch:{ all -> 0x032a }
        if (r0 == 0) goto L_0x031a;	 Catch:{ all -> 0x032a }
        r0 = r1.zzclk;	 Catch:{ all -> 0x032a }
        r3 = r1.zzclg;	 Catch:{ all -> 0x032a }
        r0.removeView(r3);	 Catch:{ all -> 0x032a }
        r0 = r1.zzclk;	 Catch:{ all -> 0x032a }
        r3 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r3 = r3.getView();	 Catch:{ all -> 0x032a }
        r0.addView(r3);	 Catch:{ all -> 0x032a }
        r0 = r1.zzcct;	 Catch:{ all -> 0x032a }
        r3 = r1.zzclf;	 Catch:{ all -> 0x032a }
        r0.zza(r3);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r0 = "Webview is detached, probably in the middle of a resize or expand.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r0 = "Activity context is not ready, cannot get window or decor view.";	 Catch:{ all -> 0x032a }
        r1.zzbm(r0);	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        return;	 Catch:{ all -> 0x032a }
        r0 = move-exception;	 Catch:{ all -> 0x032a }
        monitor-exit(r2);	 Catch:{ all -> 0x032a }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzyd.execute(java.util.Map):void");
    }

    public final void zza(int i, int i2, boolean z) {
        synchronized (this.mLock) {
            this.zzclb = i;
            this.zzclc = i2;
            if (this.zzcli != null && z) {
                int[] zzne = zzne();
                if (zzne != null) {
                    PopupWindow popupWindow = this.zzcli;
                    zzlc.zzij();
                    int zza = zzako.zza(this.zzckp, zzne[0]);
                    zzlc.zzij();
                    popupWindow.update(zza, zzako.zza(this.zzckp, zzne[1]), this.zzcli.getWidth(), this.zzcli.getHeight());
                    zza(zzne[0], zzne[1]);
                } else {
                    zzm(true);
                }
            }
        }
    }

    public final void zzb(int i, int i2) {
        this.zzclb = i;
        this.zzclc = i2;
    }

    public final void zzm(boolean z) {
        synchronized (this.mLock) {
            if (this.zzcli != null) {
                this.zzcli.dismiss();
                this.zzclj.removeView(this.zzcct.getView());
                if (this.zzclk != null) {
                    this.zzclk.removeView(this.zzclg);
                    this.zzclk.addView(this.zzcct.getView());
                    this.zzcct.zza(this.zzclf);
                }
                if (z) {
                    zzbo("default");
                    if (this.zzcco != null) {
                        this.zzcco.zzct();
                    }
                }
                this.zzcli = null;
                this.zzclj = null;
                this.zzclk = null;
                this.zzclh = null;
            }
        }
    }

    public final boolean zznf() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcli != null;
        }
        return z;
    }
}
