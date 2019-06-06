package com.brightcove.player.render;

import android.content.Context;
import android.util.Log;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent.RendererBuilderCallback;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import defpackage.bdq;
import defpackage.bdu;
import defpackage.beb;
import defpackage.bec.b;
import defpackage.bek;
import defpackage.bel;
import defpackage.bjq;
import defpackage.bjr;
import defpackage.bjx;
import defpackage.bkh;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class DashRendererBuilder extends AbstractRendererBuilder {
    private final Context a;
    private final String b;
    private final String c;
    private final Map<String, String> d;
    private final bek e;
    private a f;

    final class a implements b, bkh.b<bdu> {
        final ExoPlayerVideoDisplayComponent a;
        final bkh<bdu> b;
        boolean c;
        private final Context d;
        private final String e;
        private final Map<String, String> f;
        private final bek g;
        private final RendererBuilderCallback h;
        private final bjx i;
        private bdu j;
        private long k;

        public a(Context context, String str, String str2, Map<String, String> map, bek bek, ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, RendererBuilderCallback rendererBuilderCallback) {
            this.d = context;
            this.e = str;
            this.f = map;
            this.g = bek;
            this.a = exoPlayerVideoDisplayComponent;
            this.h = rendererBuilderCallback;
            bjx bjq = new bjq(str, null, DashRendererBuilder.this.b(), DashRendererBuilder.this.a());
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    bjq.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            bdq bdq = new bdq();
            this.i = new bjr(context, null, bjq);
            this.b = new bkh(str2, this.i, bdq);
        }

        private static int a(bel bel) {
            String b = bel.b("securityLevel");
            return b.equals("L1") ? 1 : b.equals("L3") ? 3 : -1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x01a6  */
        private void a() {
            /*
            r18 = this;
            r1 = r18;
            r0 = r1.j;
            r2 = 0;
            r0 = r0.a(r2);
            r3 = r1.a;
            r3 = r3.getMainHandler();
            r14 = new bbv;
            r4 = new bjo;
            r4.<init>();
            r14.<init>(r4);
            r4 = r1.a;
            r4 = r4.getBandwidthMeter();
            if (r4 != 0) goto L_0x0028;
        L_0x0021:
            r4 = new bjp;
            r5 = r1.a;
            r4.<init>(r3, r5);
        L_0x0028:
            r15 = r4;
            r4 = 0;
            r5 = 0;
        L_0x002b:
            r6 = r0.b;
            r6 = r6.size();
            if (r4 >= r6) goto L_0x0048;
        L_0x0033:
            r6 = r0.b;
            r6 = r6.get(r4);
            r6 = (defpackage.bdp) r6;
            r7 = r6.a;
            r8 = -1;
            if (r7 == r8) goto L_0x0045;
        L_0x0040:
            r6 = r6.a();
            r5 = r5 | r6;
        L_0x0045:
            r4 = r4 + 1;
            goto L_0x002b;
        L_0x0048:
            r0 = 0;
            r13 = 1;
            if (r5 == 0) goto L_0x0080;
        L_0x004c:
            r0 = defpackage.bku.a;
            r4 = 18;
            if (r0 >= r4) goto L_0x005d;
        L_0x0052:
            r0 = r1.h;
            r2 = new bem;
            r2.<init>();
            r0.onRenderersError(r2);
            return;
        L_0x005d:
            r0 = r1.a;	 Catch:{ bem -> 0x0079 }
            r0 = r0.getPlaybackLooper();	 Catch:{ bem -> 0x0079 }
            r4 = r1.g;	 Catch:{ bem -> 0x0079 }
            r5 = r1.a;	 Catch:{ bem -> 0x0079 }
            r5 = r5.getMainHandler();	 Catch:{ bem -> 0x0079 }
            r6 = r1.a;	 Catch:{ bem -> 0x0079 }
            r0 = defpackage.bel.a(r0, r4, r5, r6);	 Catch:{ bem -> 0x0079 }
            r4 = a(r0);	 Catch:{ bem -> 0x0079 }
            if (r4 == r13) goto L_0x0080;
        L_0x0077:
            r4 = 1;
            goto L_0x0081;
        L_0x0079:
            r0 = move-exception;
            r2 = r1.h;
            r2.onRenderersError(r0);
            return;
        L_0x0080:
            r4 = 0;
        L_0x0081:
            r5 = new bjq;
            r6 = r1.e;
            r7 = com.brightcove.player.render.DashRendererBuilder.this;
            r7 = r7.b();
            r8 = com.brightcove.player.render.DashRendererBuilder.this;
            r8 = r8.a();
            r5.<init>(r6, r15, r7, r8);
            r6 = r1.f;
            if (r6 == 0) goto L_0x00bc;
        L_0x0098:
            r6 = r6.entrySet();
            r6 = r6.iterator();
        L_0x00a0:
            r7 = r6.hasNext();
            if (r7 == 0) goto L_0x00bc;
        L_0x00a6:
            r7 = r6.next();
            r7 = (java.util.Map.Entry) r7;
            r8 = r7.getKey();
            r8 = (java.lang.String) r8;
            r7 = r7.getValue();
            r7 = (java.lang.String) r7;
            r5.a(r8, r7);
            goto L_0x00a0;
        L_0x00bc:
            r7 = new bjr;
            r6 = r1.d;
            r7.<init>(r6, r15, r5);
            r5 = r1.d;
            r4 = defpackage.bdo.a(r5, r4);
            r5 = r1.a;
            r5 = r5.getPeakBitrate();
            if (r5 <= 0) goto L_0x00d9;
        L_0x00d1:
            r6 = new com.brightcove.player.render.DashPeakBitrateTrackSelector;
            r8 = r1.d;
            r6.<init>(r8, r5, r4);
            goto L_0x00da;
        L_0x00d9:
            r6 = r4;
        L_0x00da:
            r16 = new bdk;
            r5 = r1.b;
            r8 = new bde$a;
            r8.<init>(r15);
            r9 = r1.k;
            r12 = r1.a;
            r17 = 0;
            r4 = r16;
            r11 = r3;
            r2 = 1;
            r13 = r17;
            r4.<init>(r5, r6, r7, r8, r9, r11, r12, r13);
            r11 = new bcz;
            r7 = 13107200; // 0xc80000 float:1.8367099E-38 double:6.475817E-317;
            r9 = r1.a;
            r10 = 0;
            r4 = r11;
            r5 = r16;
            r6 = r14;
            r8 = r3;
            r4.<init>(r5, r6, r7, r8, r9, r10);
            r16 = new bch;
            r5 = r1.d;
            r7 = defpackage.bce.a;
            r9 = 1;
            r12 = r1.a;
            r4 = r16;
            r6 = r11;
            r8 = r0;
            r10 = r3;
            r11 = r12;
            r4.<init>(r5, r6, r7, r8, r9, r10, r11);
            r4 = new bjq;
            r5 = r1.e;
            r6 = com.brightcove.player.render.DashRendererBuilder.this;
            r6 = r6.b();
            r7 = com.brightcove.player.render.DashRendererBuilder.this;
            r7 = r7.a();
            r4.<init>(r5, r15, r6, r7);
            r5 = r1.f;
            if (r5 == 0) goto L_0x014e;
        L_0x012a:
            r5 = r5.entrySet();
            r5 = r5.iterator();
        L_0x0132:
            r6 = r5.hasNext();
            if (r6 == 0) goto L_0x014e;
        L_0x0138:
            r6 = r5.next();
            r6 = (java.util.Map.Entry) r6;
            r7 = r6.getKey();
            r7 = (java.lang.String) r7;
            r6 = r6.getValue();
            r6 = (java.lang.String) r6;
            r4.a(r7, r6);
            goto L_0x0132;
        L_0x014e:
            r7 = new bjr;
            r5 = r1.d;
            r7.<init>(r5, r15, r4);
            r17 = new bdk;
            r5 = r1.b;
            r6 = defpackage.bdo.a();
            r8 = 0;
            r9 = r1.k;
            r12 = r1.a;
            r13 = 1;
            r4 = r17;
            r11 = r3;
            r4.<init>(r5, r6, r7, r8, r9, r11, r12, r13);
            r11 = new bcz;
            r7 = 3932160; // 0x3c0000 float:5.51013E-39 double:1.942745E-317;
            r9 = r1.a;
            r10 = 1;
            r4 = r11;
            r5 = r17;
            r6 = r14;
            r8 = r3;
            r4.<init>(r5, r6, r7, r8, r9, r10);
            r17 = new bcd;
            r5 = new defpackage.bcm[r2];
            r4 = 0;
            r5[r4] = r11;
            r6 = defpackage.bce.a;
            r9 = r1.a;
            r4 = r1.d;
            r10 = defpackage.bcs.a(r4);
            r4 = r17;
            r7 = r0;
            r4.<init>(r5, r6, r7, r8, r9, r10);
            r0 = new bjq;
            r4 = r1.e;
            r5 = com.brightcove.player.render.DashRendererBuilder.this;
            r5 = r5.b();
            r6 = com.brightcove.player.render.DashRendererBuilder.this;
            r6 = r6.a();
            r0.<init>(r4, r15, r5, r6);
            r4 = r1.f;
            if (r4 == 0) goto L_0x01ca;
        L_0x01a6:
            r4 = r4.entrySet();
            r4 = r4.iterator();
        L_0x01ae:
            r5 = r4.hasNext();
            if (r5 == 0) goto L_0x01ca;
        L_0x01b4:
            r5 = r4.next();
            r5 = (java.util.Map.Entry) r5;
            r6 = r5.getKey();
            r6 = (java.lang.String) r6;
            r5 = r5.getValue();
            r5 = (java.lang.String) r5;
            r0.a(r6, r5);
            goto L_0x01ae;
        L_0x01ca:
            r7 = new bjr;
            r4 = r1.d;
            r7.<init>(r4, r15, r0);
            r0 = new bdk;
            r5 = r1.b;
            r6 = defpackage.bdo.b();
            r8 = 0;
            r9 = r1.k;
            r12 = r1.a;
            r13 = 2;
            r4 = r0;
            r11 = r3;
            r4.<init>(r5, r6, r7, r8, r9, r11, r12, r13);
            r11 = new bcz;
            r7 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
            r9 = r1.a;
            r10 = 2;
            r4 = r11;
            r5 = r0;
            r6 = r14;
            r8 = r3;
            r4.<init>(r5, r6, r7, r8, r9, r10);
            r0 = new bii;
            r4 = new defpackage.bcm[r2];
            r5 = 0;
            r4[r5] = r11;
            r6 = r1.a;
            r3 = r3.getLooper();
            r0.<init>(r4, r6, r3);
            r3 = 4;
            r3 = new defpackage.bcq[r3];
            r3[r5] = r16;
            r3[r2] = r17;
            r2 = 2;
            r3[r2] = r0;
            r0 = r1.h;
            r0.onRenderers(r3, r15);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.render.DashRendererBuilder$a.a():void");
        }

        public final void a(long j) {
            if (!this.c) {
                this.k = j;
                a();
            }
        }

        public final void a(beb beb, IOException iOException) {
            if (!this.c) {
                StringBuilder stringBuilder = new StringBuilder("Failed to resolve UtcTiming element [");
                stringBuilder.append(beb);
                stringBuilder.append("]");
                Log.e("DashRendererBuilder", stringBuilder.toString(), iOException);
                a();
            }
        }

        public final void a(IOException iOException) {
            if (!this.c) {
                this.h.onRenderersError(iOException);
            }
        }
    }

    static {
        new String[]{AudioSampleEntry.TYPE9, AudioSampleEntry.TYPE8};
    }

    public DashRendererBuilder(Context context, String str, String str2, Map<String, String> map, bek bek) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = bek;
    }

    public void buildRenderers(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, RendererBuilderCallback rendererBuilderCallback) {
        this.f = new a(this.a, this.b, this.c, this.d, this.e, exoPlayerVideoDisplayComponent, rendererBuilderCallback);
        bkh.b bVar = this.f;
        bVar.b.a(bVar.a.getMainHandler().getLooper(), bVar);
    }

    public void cancel() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.c = true;
            this.f = null;
        }
    }
}
