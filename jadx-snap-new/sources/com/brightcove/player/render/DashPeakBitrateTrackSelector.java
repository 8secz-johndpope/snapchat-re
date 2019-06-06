package com.brightcove.player.render;

import android.content.Context;
import defpackage.bdm;
import defpackage.bdm.a;
import defpackage.bdu;
import java.util.List;

public class DashPeakBitrateTrackSelector implements bdm {
    static final String a = "DashPeakBitrateTrackSelector";
    int b;
    private Context c;
    private bdm d;

    public DashPeakBitrateTrackSelector(Context context, int i, bdm bdm) {
        this.c = context;
        this.b = i;
        this.d = bdm;
    }

    static /* synthetic */ int[] a(List list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    public void selectTracks(bdu bdu, int i, final a aVar) {
        this.d.selectTracks(bdu, i, new a() {
            public final void a(bdu bdu, int i, int i2, int i3) {
                aVar.a(bdu, i, i2, i3);
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
            public final void a(defpackage.bdu r11, int r12, int r13, int[] r14) {
                /*
                r10 = this;
                r0 = new java.util.ArrayList;
                r0.<init>();
                r1 = r11.a(r12);
                r2 = 0;
                r3 = -1;
                if (r1 == 0) goto L_0x0055;
            L_0x000d:
                r1 = r1.b;
                r1 = r1.get(r13);
                r1 = (defpackage.bdp) r1;
                if (r1 == 0) goto L_0x0055;
            L_0x0017:
                r4 = 0;
                r6 = r4;
                r4 = 0;
                r5 = -1;
            L_0x001b:
                r7 = r1.b;
                r7 = r7.size();
                if (r4 >= r7) goto L_0x0056;
            L_0x0023:
                r7 = r1.b;
                r7 = r7.get(r4);
                r7 = (defpackage.bdy) r7;
                if (r7 == 0) goto L_0x0052;
            L_0x002d:
                r8 = r7.a;
                r8 = r8.d;
                r9 = com.brightcove.player.render.DashPeakBitrateTrackSelector.this;
                r9 = r9.b;
                if (r8 > r9) goto L_0x003e;
            L_0x0037:
                r8 = java.lang.Integer.valueOf(r4);
                r0.add(r8);
            L_0x003e:
                r8 = r0.isEmpty();
                if (r8 == 0) goto L_0x0052;
            L_0x0044:
                if (r6 == 0) goto L_0x0050;
            L_0x0046:
                r8 = r7.a;
                r8 = r8.d;
                r9 = r6.a;
                r9 = r9.d;
                if (r8 >= r9) goto L_0x0052;
            L_0x0050:
                r5 = r4;
                r6 = r7;
            L_0x0052:
                r4 = r4 + 1;
                goto L_0x001b;
            L_0x0055:
                r5 = -1;
            L_0x0056:
                r1 = r0.isEmpty();
                if (r1 != 0) goto L_0x0066;
            L_0x005c:
                r14 = r5;
                r0 = com.brightcove.player.render.DashPeakBitrateTrackSelector.a(r0);
                r14.a(r11, r12, r13, r0);
                return;
            L_0x0066:
                if (r5 == r3) goto L_0x008a;
            L_0x0068:
                r14 = com.brightcove.player.render.DashPeakBitrateTrackSelector.a;
                r0 = new java.lang.StringBuilder;
                r1 = "All representations are higher than the peak bitrate: ";
                r0.<init>(r1);
                r1 = com.brightcove.player.render.DashPeakBitrateTrackSelector.this;
                r1 = r1.b;
                r0.append(r1);
                r0 = r0.toString();
                android.util.Log.w(r14, r0);
                r14 = r5;
                r0 = 1;
                r0 = new int[r0];
                r0[r2] = r5;
                r14.a(r11, r12, r13, r0);
                return;
            L_0x008a:
                r0 = com.brightcove.player.render.DashPeakBitrateTrackSelector.a;
                r1 = new java.lang.StringBuilder;
                r2 = "Unable to select tracks below the peak bitrate: ";
                r1.<init>(r2);
                r2 = com.brightcove.player.render.DashPeakBitrateTrackSelector.this;
                r2 = r2.b;
                r1.append(r2);
                r1 = r1.toString();
                android.util.Log.e(r0, r1);
                r0 = r5;
                r0.a(r11, r12, r13, r14);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.render.DashPeakBitrateTrackSelector$AnonymousClass1.a(bdu, int, int, int[]):void");
            }
        });
    }
}
