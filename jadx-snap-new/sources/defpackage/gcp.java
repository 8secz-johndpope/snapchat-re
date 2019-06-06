package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: gcp */
public enum gcp implements IntegerEnumColumn {
    ;
    
    public static final a Companion = null;
    public static final int NON_MEDIA_SNAP_TYPE = -1;
    public static final gcp[] noSoundSnapTypes = null;
    public static final gcp[] soundSnapTypes = null;
    private final int intValue;
    public final boolean isSpectacles;

    /* renamed from: gcp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static gcp a(Integer num) {
            return num != null ? gcr.a(Integer.valueOf(num.intValue()), true) : gcp.UNKNOWN;
        }

        public static gcp a(String str) {
            akcr.b(str, "name");
            try {
                return gcp.valueOf(str);
            } catch (IllegalArgumentException unused) {
                return gcp.UNKNOWN;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x019a in {4, 5, 12, 13, 17, 19, 21} preds:[]
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
    static {
        /*
        r0 = 21;
        r0 = new defpackage.gcp[r0];
        r1 = new gcp;
        r2 = 0;
        r3 = "IMAGE";
        r1.<init>(r3, r2, r2);
        IMAGE = r1;
        r0[r2] = r1;
        r1 = new gcp;
        r3 = 1;
        r4 = "VIDEO";
        r1.<init>(r4, r3, r3);
        VIDEO = r1;
        r0[r3] = r1;
        r1 = new gcp;
        r4 = 2;
        r5 = "VIDEO_NO_SOUND";
        r1.<init>(r5, r4, r4);
        VIDEO_NO_SOUND = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 3;
        r5 = "FRIEND_DEPRECATED";
        r1.<init>(r5, r4, r4);
        FRIEND_DEPRECATED = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 4;
        r5 = "BLOB";
        r1.<init>(r5, r4, r4);
        BLOB = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 5;
        r5 = "LAGUNA_SOUND";
        r1.<init>(r5, r4, r4, r3);
        LAGUNA_SOUND = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 6;
        r5 = "LAGUNA_NO_SOUND";
        r1.<init>(r5, r4, r4, r3);
        LAGUNA_NO_SOUND = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 7;
        r5 = "GIF";
        r1.<init>(r5, r4, r4);
        GIF = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 8;
        r5 = "FINGERPRINT_HEADER_SIZE";
        r1.<init>(r5, r4, r4);
        FINGERPRINT_HEADER_SIZE = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 9;
        r5 = "AUDIO_STITCH";
        r1.<init>(r5, r4, r4);
        AUDIO_STITCH = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 10;
        r5 = "PSYCHOMANTIS";
        r1.<init>(r5, r4, r4, r3);
        PSYCHOMANTIS = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 11;
        r5 = "SCREAMINGMANTIS";
        r1.<init>(r5, r4, r4, r3);
        SCREAMINGMANTIS = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 12;
        r5 = "MALIBU_SOUND";
        r1.<init>(r5, r4, r4, r3);
        MALIBU_SOUND = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 13;
        r5 = "MALIBU_NO_SOUND";
        r1.<init>(r5, r4, r4, r3);
        MALIBU_NO_SOUND = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = 14;
        r5 = "LAGUNAHD_SOUND";
        r1.<init>(r5, r4, r4, r3);
        LAGUNAHD_SOUND = r1;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = "LAGUNAHD_NO_SOUND";
        r5 = 15;
        r6 = 15;
        r1.<init>(r4, r5, r6, r3);
        LAGUNAHD_NO_SOUND = r1;
        r4 = 15;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = "GHOSTMANTIS";
        r5 = 16;
        r6 = 16;
        r1.<init>(r4, r5, r6, r3);
        GHOSTMANTIS = r1;
        r4 = 16;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = "NEWPORT_SOUND";
        r5 = 17;
        r6 = 17;
        r1.<init>(r4, r5, r6, r3);
        NEWPORT_SOUND = r1;
        r4 = 17;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = "NEWPORT_NO_SOUND";
        r5 = 18;
        r6 = 18;
        r1.<init>(r4, r5, r6, r3);
        NEWPORT_NO_SOUND = r1;
        r4 = 18;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = "AUDIO";
        r5 = 19;
        r6 = 19;
        r1.<init>(r4, r5, r6);
        AUDIO = r1;
        r4 = 19;
        r0[r4] = r1;
        r1 = new gcp;
        r4 = "UNKNOWN";
        r5 = 20;
        r6 = 20;
        r1.<init>(r4, r5, r6);
        UNKNOWN = r1;
        r4 = 20;
        r0[r4] = r1;
        $VALUES = r0;
        r0 = new gcp$a;
        r0.<init>(r2);
        Companion = r0;
        r0 = defpackage.gcp.values();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r4 = r0.length;
        r5 = 0;
        if (r5 >= r4) goto L_0x014b;
        r6 = r0[r5];
        r7 = r6.d();
        if (r7 == 0) goto L_0x0148;
        r1.add(r6);
        r5 = r5 + 1;
        goto L_0x013b;
        r1 = (java.util.List) r1;
        r1 = (java.util.Collection) r1;
        r0 = new defpackage.gcp[r2];
        r0 = r1.toArray(r0);
        if (r0 == 0) goto L_0x0192;
        r0 = (defpackage.gcp[]) r0;
        soundSnapTypes = r0;
        r0 = defpackage.gcp.values();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r4 = r0.length;
        r5 = 0;
        if (r5 >= r4) goto L_0x0179;
        r6 = r0[r5];
        r7 = r6.d();
        r7 = r7 ^ r3;
        if (r7 == 0) goto L_0x0176;
        r1.add(r6);
        r5 = r5 + 1;
        goto L_0x0168;
        r1 = (java.util.List) r1;
        r1 = (java.util.Collection) r1;
        r0 = new defpackage.gcp[r2];
        r0 = r1.toArray(r0);
        if (r0 == 0) goto L_0x018a;
        r0 = (defpackage.gcp[]) r0;
        noSoundSnapTypes = r0;
        return;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";
        r0.<init>(r1);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcp.<clinit>():void");
    }

    private gcp(int i, boolean z) {
        this.intValue = i;
        this.isSpectacles = z;
    }

    public final boolean a() {
        switch (gcq.a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                throw new ajxk();
        }
    }

    public final boolean b() {
        return gcq.b[ordinal()] == 1;
    }

    public final boolean c() {
        switch (gcq.c[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                throw new ajxk();
        }
    }

    public final boolean d() {
        switch (gcq.d[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                throw new ajxk();
        }
    }

    public final boolean e() {
        switch (gcq.e[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                throw new ajxk();
        }
    }

    public final boolean f() {
        int i = gcq.f[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public final boolean g() {
        int i = gcq.g[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final boolean h() {
        int i = gcq.h[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public final aesf i() {
        switch (gcq.i[ordinal()]) {
            case 1:
                return aesf.IMAGE;
            case 2:
                return aesf.VIDEO;
            case 3:
                return aesf.VIDEO_NO_SOUND;
            case 4:
                return aesf.FRIEND_DEPRECATED;
            case 5:
                return aesf.BLOB;
            case 6:
                return aesf.LAGUNA_SOUND;
            case 7:
                return aesf.LAGUNA_NO_SOUND;
            case 8:
                return aesf.GIF;
            case 9:
                return aesf.FINGERPRINT_HEADER_SIZE;
            case 10:
                return aesf.AUDIO_STITCH;
            case 11:
                return aesf.PSYCHOMANTIS;
            case 12:
                return aesf.SCREAMINGMANTIS;
            case 13:
                return aesf.MALIBU_SOUND;
            case 14:
                return aesf.MALIBU_NO_SOUND;
            case 15:
                return aesf.LAGUNAHD_SOUND;
            case 16:
                return aesf.LAGUNAHD_NO_SOUND;
            case 17:
                return aesf.GHOSTMANTIS;
            case 18:
                return aesf.NEWPORT_SOUND;
            case 19:
                return aesf.NEWPORT_NO_SOUND;
            case 20:
                return aesf.VIDEO;
            case 21:
                return aesf.UNRECOGNIZED_VALUE;
            default:
                throw new ajxk();
        }
    }
}
