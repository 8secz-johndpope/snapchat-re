package defpackage;

import android.os.Bundle;
import com.brightcove.player.event.Event;

/* renamed from: ebp */
public abstract class ebp {

    /* renamed from: ebp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x007f in {2, 4, 7, 10, 12, 15, 18, 20} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static defpackage.ebp a(android.os.Bundle r4) {
            /*
            r0 = "bundle";
            defpackage.akcr.b(r4, r0);
            r0 = "MEDIA_TYPE";
            r1 = r4.get(r0);
            r2 = "image";
            r2 = defpackage.akcr.a(r1, r2);
            r3 = "isSnappable";
            if (r2 == 0) goto L_0x0021;
            r0 = new ebp$c;
            r4 = r4.getBoolean(r3);
            r0.<init>(r4);
            r0 = (defpackage.ebp) r0;
            return r0;
            r2 = "video";
            r2 = defpackage.akcr.a(r1, r2);
            if (r2 == 0) goto L_0x0039;
            r0 = new ebp$f;
            r1 = "isMultiSnap";
            r1 = r4.getBoolean(r1);
            r4 = r4.getBoolean(r3);
            r0.<init>(r1, r4);
            goto L_0x001e;
            r2 = "ImageSpectacle";
            r2 = defpackage.akcr.a(r1, r2);
            if (r2 == 0) goto L_0x0049;
            r4 = new ebp$b;
            r4.<init>();
            r4 = (defpackage.ebp) r4;
            return r4;
            r2 = "VideoSpectacle";
            r2 = defpackage.akcr.a(r1, r2);
            if (r2 == 0) goto L_0x0057;
            r4 = new ebp$e;
            r4.<init>();
            goto L_0x0046;
            r2 = "mixed";
            r1 = defpackage.akcr.a(r1, r2);
            if (r1 == 0) goto L_0x0065;
            r4 = new ebp$d;
            r4.<init>();
            goto L_0x0046;
            r1 = new java.lang.IllegalArgumentException;
            r2 = new java.lang.StringBuilder;
            r3 = "unexpected value ";
            r2.<init>(r3);
            r4 = r4.get(r0);
            r2.append(r4);
            r4 = r2.toString();
            r1.<init>(r4);
            r1 = (java.lang.Throwable) r1;
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ebp$a.a(android.os.Bundle):ebp");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0070 in {4, 6, 10, 11, 12, 13, 14, 16} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static defpackage.ebp a(java.util.Collection<? extends defpackage.aesf> r2, boolean r3, boolean r4) {
            /*
            r0 = "mediaTypeList";
            defpackage.akcr.b(r2, r0);
            r0 = r2.isEmpty();
            r1 = 1;
            r0 = r0 ^ r1;
            if (r0 == 0) goto L_0x0062;
            r0 = r2.size();
            if (r0 <= r1) goto L_0x001b;
            r2 = new ebp$d;
            r2.<init>();
            r2 = (defpackage.ebp) r2;
            return r2;
            r0 = r2;
            r0 = (java.lang.Iterable) r0;
            r0 = defpackage.ajyu.d(r0);
            r0 = (defpackage.aesf) r0;
            r1 = defpackage.ebq.a;
            r0 = r0.ordinal();
            r0 = r1[r0];
            switch(r0) {
                case 1: goto L_0x005c;
                case 2: goto L_0x0056;
                case 3: goto L_0x0056;
                case 4: goto L_0x0050;
                case 5: goto L_0x0050;
                case 6: goto L_0x0050;
                case 7: goto L_0x0050;
                case 8: goto L_0x0050;
                case 9: goto L_0x0050;
                case 10: goto L_0x0050;
                case 11: goto L_0x0050;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x004a;
                default: goto L_0x002f;
            };
            r3 = new java.lang.IllegalArgumentException;
            r4 = new java.lang.StringBuilder;
            r0 = "unexpected media type ";
            r4.<init>(r0);
            r4.append(r2);
            r2 = "[0]";
            r4.append(r2);
            r2 = r4.toString();
            r3.<init>(r2);
            r3 = (java.lang.Throwable) r3;
            throw r3;
            r2 = new ebp$b;
            r2.<init>();
            goto L_0x0018;
            r2 = new ebp$e;
            r2.<init>();
            goto L_0x0018;
            r2 = new ebp$f;
            r2.<init>(r3, r4);
            goto L_0x0018;
            r2 = new ebp$c;
            r2.<init>(r4);
            goto L_0x0018;
            r2 = new java.lang.IllegalStateException;
            r3 = "mediaTypeList can't be empty when generating MediaTypeConfig";
            r3 = r3.toString();
            r2.<init>(r3);
            r2 = (java.lang.Throwable) r2;
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ebp$a.a(java.util.Collection, boolean, boolean):ebp");
        }
    }

    /* renamed from: ebp$c */
    public static final class c extends ebp {
        final boolean a;

        /* renamed from: ebp$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public c(boolean z) {
            super();
            this.a = z;
        }

        public final void a(Bundle bundle) {
            akcr.b(bundle, "bundle");
            bundle.putString("MEDIA_TYPE", "image");
            bundle.putBoolean("isSnappable", this.a);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    if ((this.a == ((c) obj).a ? 1 : null) != null) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.a;
            return z ? 1 : z;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ImageStartUpConfiguration(isSnappable=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ebp$f */
    public static final class f extends ebp {
        public final boolean a;
        final boolean b;

        /* renamed from: ebp$f$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public f(boolean z, boolean z2) {
            super();
            this.a = z;
            this.b = z2;
        }

        public final void a(Bundle bundle) {
            akcr.b(bundle, "bundle");
            bundle.putString("MEDIA_TYPE", Event.VIDEO);
            bundle.putBoolean("isMultiSnap", this.a);
            bundle.putBoolean("isSnappable", this.b);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if ((this.a == fVar.a ? 1 : null) != null) {
                        if ((this.b == fVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            boolean z = this.b;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("VideoStartUpConfiguration(isMultiSnap=");
            stringBuilder.append(this.a);
            stringBuilder.append(", isSnappable=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ebp$d */
    public static final class d extends ebp {

        /* renamed from: ebp$d$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public d() {
            super();
        }

        public final void a(Bundle bundle) {
            akcr.b(bundle, "bundle");
            bundle.putString("MEDIA_TYPE", "mixed");
        }
    }

    /* renamed from: ebp$b */
    public static final class b extends ebp {

        /* renamed from: ebp$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public b() {
            super();
        }

        public final void a(Bundle bundle) {
            akcr.b(bundle, "bundle");
            bundle.putString("MEDIA_TYPE", "ImageSpectacle");
        }
    }

    /* renamed from: ebp$e */
    public static final class e extends ebp {

        /* renamed from: ebp$e$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public e() {
            super();
        }

        public final void a(Bundle bundle) {
            akcr.b(bundle, "bundle");
            bundle.putString("MEDIA_TYPE", "VideoSpectacle");
        }
    }

    static {
        a aVar = new a();
    }

    private ebp() {
    }

    public /* synthetic */ ebp(byte b) {
        this();
    }

    public abstract void a(Bundle bundle);

    public final boolean a() {
        return ((this instanceof c) && ((c) this).a) || ((this instanceof f) && ((f) this).b);
    }
}
