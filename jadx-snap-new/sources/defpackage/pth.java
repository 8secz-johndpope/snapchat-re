package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import org.opencv.imgproc.Imgproc;

/* renamed from: pth */
public final class pth {
    public final gcn a;
    public final Long b;
    public final Long c;
    public final ptg d;
    public String e;
    public String f;
    public Long g;
    public ptd h;
    public final String i;
    public final long j;
    public final aayx k;
    public final String l;
    public boolean m;
    public final String n;

    /* renamed from: pth$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static aasc a(String str, zub zub) {
            akcr.b(str, "messageType");
            if (akcr.a((Object) str, aesq.TEXT.a())) {
                return aasc.TEXT;
            }
            if (akcr.a((Object) str, aesq.VIDEO_NOTE.a())) {
                return aasc.VIDEO;
            }
            if (akcr.a((Object) str, aesq.AUDIO_NOTE.a())) {
                return aasc.AUDIO;
            }
            if (akcr.a((Object) str, aesq.SPEEDWAY_STORY.a()) || akcr.a((Object) str, aesq.SPEEDWAY_STORY_V2.a()) || akcr.a((Object) str, aesq.SEARCH_SHARE_STORY.a())) {
                return aasc.STORY;
            }
            if (!akcr.a((Object) str, aesq.DISCOVER_SHARE_V2.a()) && !akcr.a((Object) str, aesq.BATCHED_MEDIA.a()) && !akcr.a((Object) str, aesq.MEDIA_V4.a()) && !akcr.a((Object) str, aesq.MEDIA_V2.a()) && !akcr.a((Object) str, aesq.MEDIA_V3.a()) && !akcr.a((Object) str, aesq.MEDIA.a())) {
                return null;
            }
            aesf aesf = zub != null ? zub.a : null;
            if (aesf != null) {
                switch (pti.a[aesf.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return aasc.IMAGE;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return aasc.VIDEO;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        return aasc.VIDEO_NO_SOUND;
                    case 15:
                        return aasc.AUDIO;
                    case 16:
                        return aasc.GIF;
                }
            }
            return null;
        }

        public static aasd a(String str, boolean z) {
            akcr.b(str, "type");
            return akcr.a((Object) str, aesq.TEXT.a()) ? aasd.TEXT : akcr.a((Object) str, aesq.STICKER_V3.a()) ? aasd.CUSTOM_STICKER : akcr.a((Object) str, aesq.DISCOVER_SHARE_V2.a()) ? aasd.DISCOVER_SHARE : akcr.a((Object) str, aesq.NYC_SHARE.a()) ? aasd.MAP_STORY_SNAP_SHARE : (akcr.a((Object) str, aesq.VIDEO_NOTE.a()) || akcr.a((Object) str, aesq.AUDIO_NOTE.a())) ? aasd.NOTE : akcr.a((Object) str, aesq.STORY_SHARE.a()) ? aasd.STORY_SHARE : (akcr.a((Object) str, aesq.SEARCH_SHARE_STORY.a()) || akcr.a((Object) str, aesq.SEARCH_SHARE_STORY_SNAP.a())) ? aasd.SEARCH_STORY_SHARE : akcr.a((Object) str, aesq.SNAPCHATTER.a()) ? aasd.SNAPCHATTER : (akcr.a((Object) str, aesq.STORY_REPLY.a()) || akcr.a((Object) str, aesq.STORY_REPLY_V2.a())) ? aasd.STORY_REPLY : (akcr.a((Object) str, aesq.STICKER_V3.a()) || akcr.a((Object) str, aesq.STICKER.a()) || akcr.a((Object) str, aesq.STICKER_V2.a())) ? aasd.STICKER : (akcr.a((Object) str, aesq.SPEEDWAY_SNAP.a()) || akcr.a((Object) str, aesq.SPEEDWAY_SNAP_V2.a()) || akcr.a((Object) str, aesq.SPEEDWAY_STORY.a()) || akcr.a((Object) str, aesq.SPEEDWAY_STORY_V2.a())) ? aasd.SPEEDWAY : (akcr.a((Object) str, aesq.BATCHED_MEDIA.a()) || akcr.a((Object) str, aesq.MEDIA_V4.a()) || akcr.a((Object) str, aesq.MEDIA_V2.a()) || akcr.a((Object) str, aesq.MEDIA_V3.a()) || akcr.a((Object) str, aesq.MEDIA.a())) ? z ? aasd.CUSTOM_STICKER : aasd.MEDIA : null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0072 A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0085 A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x010f A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x010a A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x011c A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x012a A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x013a A:{Catch:{ IOException -> 0x0162 }} */
        /* JADX WARNING: Missing block: B:41:0x012e, code skipped:
            if (r0 == null) goto L_0x0130;
     */
        public static defpackage.pth a(byte[] r42, defpackage.gqr r43) {
            /*
            r0 = r43;
            r1 = "flatBuff.snapSource()";
            r2 = "flatBuff.sourceType()";
            r3 = "exceptionTracker";
            defpackage.akcr.b(r0, r3);
            if (r42 == 0) goto L_0x016d;
        L_0x000d:
            r3 = java.nio.ByteBuffer.wrap(r42);	 Catch:{ IOException -> 0x0162 }
            r3 = defpackage.acjv.a(r3);	 Catch:{ IOException -> 0x0162 }
            r4 = r3.b();	 Catch:{ IOException -> 0x0162 }
            if (r4 == 0) goto L_0x0158;
        L_0x001b:
            r4 = r3.b();	 Catch:{ IOException -> 0x0162 }
            defpackage.akcr.a(r4, r2);	 Catch:{ IOException -> 0x0162 }
            r4 = (java.lang.CharSequence) r4;	 Catch:{ IOException -> 0x0162 }
            r4 = r4.length();	 Catch:{ IOException -> 0x0162 }
            r5 = 1;
            r6 = 0;
            if (r4 != 0) goto L_0x002e;
        L_0x002c:
            r4 = 1;
            goto L_0x002f;
        L_0x002e:
            r4 = 0;
        L_0x002f:
            if (r4 != 0) goto L_0x0158;
        L_0x0031:
            r4 = r3.b();	 Catch:{ IOException -> 0x0162 }
            defpackage.akcr.a(r4, r2);	 Catch:{ IOException -> 0x0162 }
            r2 = defpackage.abbd.valueOf(r4);	 Catch:{ IOException -> 0x0162 }
            r4 = r3.f();	 Catch:{ IOException -> 0x0162 }
            r7 = 0;
            if (r4 == 0) goto L_0x0063;
        L_0x0043:
            r4 = r3.f();	 Catch:{ IOException -> 0x0162 }
            defpackage.akcr.a(r4, r1);	 Catch:{ IOException -> 0x0162 }
            r4 = (java.lang.CharSequence) r4;	 Catch:{ IOException -> 0x0162 }
            r4 = r4.length();	 Catch:{ IOException -> 0x0162 }
            if (r4 != 0) goto L_0x0053;
        L_0x0052:
            goto L_0x0054;
        L_0x0053:
            r5 = 0;
        L_0x0054:
            if (r5 == 0) goto L_0x0057;
        L_0x0056:
            goto L_0x0063;
        L_0x0057:
            r4 = r3.f();	 Catch:{ IOException -> 0x0162 }
            defpackage.akcr.a(r4, r1);	 Catch:{ IOException -> 0x0162 }
            r1 = defpackage.abaw.valueOf(r4);	 Catch:{ IOException -> 0x0162 }
            goto L_0x0064;
        L_0x0063:
            r1 = r7;
        L_0x0064:
            r9 = defpackage.gcn.a.a(r2, r1);	 Catch:{ IOException -> 0x0162 }
            r1 = r3.c();	 Catch:{ IOException -> 0x0162 }
            r4 = -1;
            r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
            if (r6 == 0) goto L_0x007c;
        L_0x0072:
            r1 = r3.c();	 Catch:{ IOException -> 0x0162 }
            r1 = java.lang.Long.valueOf(r1);	 Catch:{ IOException -> 0x0162 }
            r10 = r1;
            goto L_0x007d;
        L_0x007c:
            r10 = r7;
        L_0x007d:
            r1 = r3.d();	 Catch:{ IOException -> 0x0162 }
            r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
            if (r6 == 0) goto L_0x008d;
        L_0x0085:
            r1 = r3.d();	 Catch:{ IOException -> 0x0162 }
            r7 = java.lang.Long.valueOf(r1);	 Catch:{ IOException -> 0x0162 }
        L_0x008d:
            r11 = r7;
            r1 = r3.e();	 Catch:{ IOException -> 0x0162 }
            if (r1 == 0) goto L_0x00ee;
        L_0x0094:
            r1 = r3.e();	 Catch:{ IOException -> 0x0162 }
            r2 = "flatBuff.previewEditsAnalytics()";
            defpackage.akcr.a(r1, r2);	 Catch:{ IOException -> 0x0162 }
            r2 = "flatBuffer";
            defpackage.akcr.b(r1, r2);	 Catch:{ IOException -> 0x0162 }
            r2 = new ptg;	 Catch:{ IOException -> 0x0162 }
            r13 = r1.b();	 Catch:{ IOException -> 0x0162 }
            r15 = r1.c();	 Catch:{ IOException -> 0x0162 }
            r17 = r1.d();	 Catch:{ IOException -> 0x0162 }
            r19 = r1.e();	 Catch:{ IOException -> 0x0162 }
            r20 = r1.f();	 Catch:{ IOException -> 0x0162 }
            r22 = r1.g();	 Catch:{ IOException -> 0x0162 }
            r24 = r1.h();	 Catch:{ IOException -> 0x0162 }
            r26 = r1.i();	 Catch:{ IOException -> 0x0162 }
            r28 = r1.j();	 Catch:{ IOException -> 0x0162 }
            r30 = r1.k();	 Catch:{ IOException -> 0x0162 }
            r32 = r1.l();	 Catch:{ IOException -> 0x0162 }
            r34 = r1.m();	 Catch:{ IOException -> 0x0162 }
            r36 = r1.n();	 Catch:{ IOException -> 0x0162 }
            r37 = r1.o();	 Catch:{ IOException -> 0x0162 }
            r38 = r1.p();	 Catch:{ IOException -> 0x0162 }
            r40 = r1.q();	 Catch:{ IOException -> 0x0162 }
            r41 = r1.r();	 Catch:{ IOException -> 0x0162 }
            r12 = r2;
            r12.<init>(r13, r15, r17, r19, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37, r38, r40, r41);	 Catch:{ IOException -> 0x0162 }
            r12 = r2;
            goto L_0x00f4;
        L_0x00ee:
            r1 = new ptg;	 Catch:{ IOException -> 0x0162 }
            r1.<init>();	 Catch:{ IOException -> 0x0162 }
            r12 = r1;
        L_0x00f4:
            r13 = r3.g();	 Catch:{ IOException -> 0x0162 }
            r14 = r3.h();	 Catch:{ IOException -> 0x0162 }
            r1 = r3.i();	 Catch:{ IOException -> 0x0162 }
            r15 = java.lang.Long.valueOf(r1);	 Catch:{ IOException -> 0x0162 }
            r1 = r3.j();	 Catch:{ IOException -> 0x0162 }
            if (r1 == 0) goto L_0x010f;
        L_0x010a:
            r0 = defpackage.ptd.a.a(r1, r0);	 Catch:{ IOException -> 0x0162 }
            goto L_0x0114;
        L_0x010f:
            r0 = new ptd;	 Catch:{ IOException -> 0x0162 }
            r0.<init>();	 Catch:{ IOException -> 0x0162 }
        L_0x0114:
            r16 = r0;
            r0 = r3.k();	 Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x011e;
        L_0x011c:
            r0 = "";
        L_0x011e:
            r17 = r0;
            r18 = r3.l();	 Catch:{ IOException -> 0x0162 }
            r0 = r3.m();	 Catch:{ IOException -> 0x0162 }
            if (r0 == 0) goto L_0x0130;
        L_0x012a:
            r0 = defpackage.aayx.valueOf(r0);	 Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x0132;
        L_0x0130:
            r0 = defpackage.aayx.USER_INITIATED;	 Catch:{ IOException -> 0x0162 }
        L_0x0132:
            r20 = r0;
            r0 = r3.o();	 Catch:{ IOException -> 0x0162 }
            if (r0 != 0) goto L_0x0147;
        L_0x013a:
            r0 = defpackage.iig.a();	 Catch:{ IOException -> 0x0162 }
            r0 = r0.toString();	 Catch:{ IOException -> 0x0162 }
            r1 = "UUIDGenerator.nonCryptoRandomUUID().toString()";
            defpackage.akcr.a(r0, r1);	 Catch:{ IOException -> 0x0162 }
        L_0x0147:
            r21 = r0;
            r22 = r3.n();	 Catch:{ IOException -> 0x0162 }
            r23 = r3.p();	 Catch:{ IOException -> 0x0162 }
            r0 = new pth;	 Catch:{ IOException -> 0x0162 }
            r8 = r0;
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23);	 Catch:{ IOException -> 0x0162 }
            return r0;
        L_0x0158:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0162 }
            r1 = "null sourceType";
            r0.<init>(r1);	 Catch:{ IOException -> 0x0162 }
            r0 = (java.lang.Throwable) r0;	 Catch:{ IOException -> 0x0162 }
            throw r0;	 Catch:{ IOException -> 0x0162 }
        L_0x0162:
            r0 = move-exception;
            r1 = new java.lang.IllegalArgumentException;
            r0 = (java.lang.Throwable) r0;
            r1.<init>(r0);
            r1 = (java.lang.Throwable) r1;
            throw r1;
        L_0x016d:
            r0 = new pth;
            r3 = defpackage.gcn.SEND_TO;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 16382; // 0x3ffe float:2.2956E-41 double:8.094E-320;
            r2 = r0;
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pth$a.a(byte[], gqr):pth");
        }
    }

    static {
        a aVar = new a();
        ajzt.a((Object[]) new String[]{aesq.TEXT.a(), aesq.MEDIA.a(), aesq.SCREENSHOT.a(), aesq.DISCOVER_SHARE_V2.a(), aesq.STORY_REPLY.a(), aesq.STORY_REPLY_V2.a(), aesq.STICKER.a(), aesq.STICKER_V2.a(), aesq.STICKER_V3.a(), aesq.MEDIA_V2.a(), aesq.AUDIO_NOTE.a(), aesq.VIDEO_NOTE.a(), aesq.BATCHED_MEDIA.a(), aesq.MEDIA_V3.a(), aesq.MEDIA_V4.a(), aesq.SPEEDWAY_STORY.a(), aesq.SPEEDWAY_STORY_V2.a(), aesq.SPEEDWAY_SNAP.a(), aesq.SPEEDWAY_SNAP_V2.a(), aesq.STORY_SHARE.a(), aesq.SNAPCHATTER.a(), aesq.SNAP.a(), aesq.KHALEESI_SHARE.a(), aesq.NYC_SHARE.a(), aesq.SEARCH_SHARE_STORY_SNAP.a(), aesq.SEARCH_SHARE_STORY.a(), aesq.AD_SHARE.a()});
    }

    public pth(gcn gcn, Long l, Long l2, ptg ptg, String str, String str2, Long l3, ptd ptd, String str3, long j, aayx aayx, String str4, boolean z, String str5) {
        gcn gcn2 = gcn;
        String str6 = str3;
        aayx aayx2 = aayx;
        String str7 = str4;
        akcr.b(gcn, "sendSessionSource");
        akcr.b(str3, "userActionId");
        akcr.b(aayx2, "sendMessageAttemptType");
        akcr.b(str7, "sendMessageAttemptId");
        this.a = gcn2;
        this.b = l;
        this.c = l2;
        this.d = ptg;
        this.e = str;
        this.f = str2;
        this.g = l3;
        this.h = ptd;
        this.i = str6;
        this.j = j;
        this.k = aayx2;
        this.l = str7;
        this.m = z;
        this.n = str5;
    }

    public /* synthetic */ pth(gcn gcn, ptg ptg, String str, long j, aayx aayx, String str2, String str3, int i) {
        String uuid;
        String str4;
        String str5;
        int i2 = i;
        ptg ptg2 = (i2 & 8) != 0 ? null : ptg;
        String str6 = "UUIDGenerator.nonCryptoRandomUUID().toString()";
        if ((i2 & 256) != 0) {
            uuid = iig.a().toString();
            akcr.a((Object) uuid, str6);
            str4 = uuid;
        } else {
            str4 = str;
        }
        long currentTimeMillis = (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? System.currentTimeMillis() : j;
        aayx aayx2 = (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? aayx.USER_INITIATED : aayx;
        if ((i2 & ItemAnimator.FLAG_MOVED) != 0) {
            uuid = iig.a().toString();
            akcr.a((Object) uuid, str6);
            str5 = uuid;
        } else {
            str5 = str2;
        }
        this(gcn, null, null, ptg2, null, null, null, null, str4, currentTimeMillis, aayx2, str5, false, (i2 & 8192) != 0 ? null : str3);
    }

    public pth(pth pth, aayx aayx) {
        pth pth2 = pth;
        akcr.b(pth2, "otherAnalytics");
        aayx aayx2 = aayx;
        akcr.b(aayx2, "sendMessageAttemptType");
        gcn gcn = pth2.a;
        Long l = pth2.b;
        Long l2 = pth2.c;
        ptg ptg = pth2.d;
        String str = pth2.e;
        String str2 = pth2.f;
        Long l3 = pth2.g;
        ptd ptd = pth2.h;
        String str3 = pth2.i;
        long j = pth2.j;
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        this(gcn, l, l2, ptg, str, str2, l3, ptd, str3, j, aayx2, uuid, pth2.m, pth2.n);
    }

    public pth(pth pth, aayx aayx, String str, long j) {
        pth pth2 = pth;
        akcr.b(pth2, "otherAnalytics");
        aayx aayx2 = aayx;
        akcr.b(aayx2, "sendMessageAttemptType");
        String str2 = str;
        akcr.b(str2, "userActionId");
        gcn gcn = pth2.a;
        Long l = pth2.b;
        Long l2 = pth2.c;
        ptg ptg = pth2.d;
        String str3 = pth2.e;
        String str4 = pth2.f;
        Long l3 = pth2.g;
        ptd ptd = pth2.h;
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        this(gcn, l, l2, ptg, str3, str4, l3, ptd, str2, j, aayx2, uuid, pth2.m, pth2.n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
    public final byte[] a() {
        /*
        r41 = this;
        r0 = r41;
        r1 = new ccc;
        r1.<init>();
        r2 = r0.a;
        r2 = r2.sourceType;
        r2 = r2.name();
        r2 = (java.lang.CharSequence) r2;
        r31 = r1.a(r2);
        r2 = r0.b;
        r32 = -1;
        if (r2 == 0) goto L_0x0022;
    L_0x001b:
        r2 = r2.longValue();
        r34 = r2;
        goto L_0x0024;
    L_0x0022:
        r34 = r32;
    L_0x0024:
        r2 = r0.c;
        if (r2 == 0) goto L_0x002f;
    L_0x0028:
        r2 = r2.longValue();
        r36 = r2;
        goto L_0x0031;
    L_0x002f:
        r36 = r32;
    L_0x0031:
        r2 = r0.d;
        if (r2 != 0) goto L_0x003a;
    L_0x0035:
        r2 = new ptg;
        r2.<init>();
    L_0x003a:
        r15 = r2;
        r2 = "flatMapBuilder";
        defpackage.akcr.b(r1, r2);
        r2 = "previewEditsAnalytics";
        defpackage.akcr.b(r15, r2);
        r2 = r15.a;
        r4 = r15.b;
        r6 = r15.c;
        r8 = r15.d;
        r9 = r15.e;
        r11 = r15.f;
        r13 = r15.g;
        r38 = r1;
        r0 = r15.h;
        r39 = r2;
        r2 = r15;
        r15 = r0;
        r0 = r2.i;
        r17 = r0;
        r0 = r2.j;
        r19 = r0;
        r0 = r2.k;
        r21 = r0;
        r0 = r2.l;
        r23 = r0;
        r0 = r2.m;
        r25 = r0;
        r0 = r2.n;
        r26 = r0;
        r0 = r2.o;
        r27 = r0;
        r0 = r2.p;
        r29 = r0;
        r0 = r2.q;
        r30 = r0;
        r0 = r38;
        r1 = r0;
        r2 = r39;
        r7 = defpackage.acjs.a(r1, r2, r4, r6, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r26, r27, r29, r30);
        r15 = r41;
        r1 = r15.a;
        r1 = r1.snapSource;
        r2 = "";
        if (r1 == 0) goto L_0x009b;
    L_0x0092:
        r1 = r1.name();
        if (r1 == 0) goto L_0x009b;
    L_0x0098:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x009e;
    L_0x009b:
        r1 = r2;
        r1 = (java.lang.CharSequence) r1;
    L_0x009e:
        r8 = r0.a(r1);
        r1 = r15.e;
        if (r1 == 0) goto L_0x00a9;
    L_0x00a6:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x00ac;
    L_0x00a9:
        r1 = r2;
        r1 = (java.lang.CharSequence) r1;
    L_0x00ac:
        r9 = r0.a(r1);
        r1 = r15.f;
        if (r1 == 0) goto L_0x00b7;
    L_0x00b4:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x00ba;
    L_0x00b7:
        r1 = r2;
        r1 = (java.lang.CharSequence) r1;
    L_0x00ba:
        r10 = r0.a(r1);
        r1 = r15.g;
        if (r1 == 0) goto L_0x00c8;
    L_0x00c2:
        r3 = r1.longValue();
        r11 = r3;
        goto L_0x00ca;
    L_0x00c8:
        r11 = r32;
    L_0x00ca:
        r1 = r15.h;
        if (r1 == 0) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00d4;
    L_0x00cf:
        r1 = new ptd;
        r1.<init>();
    L_0x00d4:
        r1 = r1.a(r0);
        r13 = r1;
        r1 = r15.i;
        r1 = (java.lang.CharSequence) r1;
        r14 = r0.a(r1);
        r5 = r15.j;
        r1 = r15.k;
        r1 = r1.name();
        r1 = (java.lang.CharSequence) r1;
        r17 = r0.a(r1);
        r3 = r15.m;
        r1 = r15.l;
        r1 = (java.lang.CharSequence) r1;
        r19 = r0.a(r1);
        r1 = r15.n;
        if (r1 == 0) goto L_0x0100;
    L_0x00fd:
        r1 = (java.lang.CharSequence) r1;
        goto L_0x0103;
    L_0x0100:
        r1 = r2;
        r1 = (java.lang.CharSequence) r1;
    L_0x0103:
        r20 = r0.a(r1);
        r1 = r0;
        r2 = r31;
        r18 = r3;
        r3 = r34;
        r21 = r5;
        r5 = r36;
        r15 = r21;
        r1 = defpackage.acjv.a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20);
        r0.e(r1);
        r0 = r0.e();
        r1 = "builder.dataBuffer()";
        defpackage.akcr.a(r0, r1);
        r0 = defpackage.ptf.a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pth.a():byte[]");
    }
}
