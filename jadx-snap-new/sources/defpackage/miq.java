package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: miq */
public abstract class miq {

    /* renamed from: miq$b */
    public static final class b extends miq {
        public static final b a = new b();

        private b() {
            super();
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* renamed from: miq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static a a(String str) {
            akcr.b(str, MessageMediaRefModel.URI);
            if (mir.a(str, "file")) {
                return new a(str);
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot create Uri.Local.File from [");
            stringBuilder.append(str);
            stringBuilder.append("] without a file protocol");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0073 in {1, 3, 6, 9, 11, 14, 17, 20, 23, 25} preds:[]
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
        public static defpackage.miq b(java.lang.String r3) {
            /*
            if (r3 != 0) goto L_0x0007;
            r3 = defpackage.miq.b.a;
            r3 = (defpackage.miq) r3;
            return r3;
            r0 = r3;
            r0 = (java.lang.CharSequence) r0;
            r0 = defpackage.akgb.a(r0);
            if (r0 == 0) goto L_0x0011;
            goto L_0x0002;
            r0 = "http";
            r0 = defpackage.mir.a(r3, r0);
            if (r0 == 0) goto L_0x0021;
            r0 = new miq$f$a;
            r0.<init>(r3);
            r0 = (defpackage.miq) r0;
            return r0;
            r0 = "https";
            r0 = defpackage.mir.a(r3, r0);
            if (r0 == 0) goto L_0x002f;
            r0 = new miq$f$b;
            r0.<init>(r3);
            goto L_0x001e;
            r0 = "file";
            r0 = defpackage.mir.a(r3, r0);
            if (r0 == 0) goto L_0x003d;
            r0 = new miq$c$a;
            r0.<init>(r3);
            goto L_0x001e;
            r0 = "android.resource";
            r0 = defpackage.mir.a(r3, r0);
            if (r0 == 0) goto L_0x004b;
            r0 = new miq$c$b;
            r0.<init>(r3);
            goto L_0x001e;
            r0 = "content";
            r0 = defpackage.mir.a(r3, r0);
            if (r0 == 0) goto L_0x0058;
            r3 = defpackage.miq.a.c(r3);
            goto L_0x0004;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r2 = "Uri ";
            r1.<init>(r2);
            r1.append(r3);
            r3 = " has not supported protocol";
            r1.append(r3);
            r3 = r1.toString();
            r0.<init>(r3);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$a.b(java.lang.String):miq");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:37:0x00bb in {7, 8, 10, 11, 12, 15, 16, 24, 25, 27, 28, 31, 32, 34, 36} preds:[]
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
        private static defpackage.miq.d.a c(java.lang.String r10) {
            /*
            r0 = "uri";
            defpackage.akcr.b(r10, r0);
            r0 = "content";
            r0 = defpackage.mir.a(r10, r0);
            if (r0 == 0) goto L_0x00a0;
            r0 = r10.length();
            r1 = 0;
            r2 = 0;
            r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            r4 = 58;
            r5 = 1;
            if (r2 >= r0) goto L_0x0030;
            r6 = r10.charAt(r2);
            if (r6 == r4) goto L_0x0022;
            r6 = 1;
            goto L_0x0023;
            r6 = 0;
            if (r6 != 0) goto L_0x002d;
            r0 = r10.substring(r1, r2);
            defpackage.akcr.a(r0, r3);
            goto L_0x0031;
            r2 = r2 + 1;
            goto L_0x0013;
            r0 = r10;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r2.append(r0);
            r2.append(r4);
            r2 = r2.toString();
            r2 = (java.lang.CharSequence) r2;
            r2 = defpackage.akgc.a(r10, r2);
            r6 = "//";
            r6 = defpackage.akgb.b(r2, r6, r1);
            if (r6 == 0) goto L_0x004f;
            goto L_0x0050;
            r2 = 0;
            if (r2 == 0) goto L_0x0080;
            r6 = 2;
            r2 = defpackage.akge.a(r2, r6);
            if (r2 == 0) goto L_0x0080;
            r6 = r2.length();
            r7 = 0;
            if (r7 >= r6) goto L_0x0078;
            r8 = r2.charAt(r7);
            r9 = 47;
            if (r8 == r9) goto L_0x006a;
            r8 = 1;
            goto L_0x006b;
            r8 = 0;
            if (r8 != 0) goto L_0x0075;
            r2 = r2.substring(r1, r7);
            defpackage.akcr.a(r2, r3);
            goto L_0x0078;
            r7 = r7 + 1;
            goto L_0x005e;
            if (r2 == 0) goto L_0x0080;
            r1 = defpackage.mir.a(r2);
            if (r1 != 0) goto L_0x0082;
            r1 = "";
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r2.append(r0);
            r2.append(r4);
            r2.append(r1);
            r0 = r2.toString();
            r0 = (java.lang.CharSequence) r0;
            r10 = defpackage.akgc.a(r10, r0);
            r0 = new miq$d$a;
            r0.<init>(r1, r10);
            return r0;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r2 = "Cannot create Uri.Mixed.Content from [";
            r1.<init>(r2);
            r1.append(r10);
            r10 = "] without content protocol";
            r1.append(r10);
            r10 = r1.toString();
            r0.<init>(r10);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$a.c(java.lang.String):miq$d$a");
        }
    }

    /* renamed from: miq$c */
    public static abstract class c extends miq implements e {

        /* renamed from: miq$c$a */
        public static final class a extends c implements e {
            public final String a;

            public a(String str) {
                akcr.b(str, MessageMediaRefModel.URI);
                super();
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.miq.c.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.miq.c.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.miq.c.a) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$c$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                return str != null ? str.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("File(uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: miq$c$b */
        public static final class b extends c implements e {
            private final String a;

            public b(String str) {
                akcr.b(str, MessageMediaRefModel.URI);
                super();
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.miq.c.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.miq.c.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.miq.c.b) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$c$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                return str != null ? str.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Resource(uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private c() {
            super();
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: miq$e */
    public interface e {
        String a();
    }

    /* renamed from: miq$f */
    public static abstract class f extends miq implements e {

        /* renamed from: miq$f$b */
        public static final class b extends f {
            public final String a;

            public b(String str) {
                akcr.b(str, MessageMediaRefModel.URI);
                super();
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.miq.f.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.miq.f.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.miq.f.b) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$f$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                return str != null ? str.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Https(uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: miq$f$a */
        public static final class a extends f {
            private final String a;

            public a(String str) {
                akcr.b(str, MessageMediaRefModel.URI);
                super();
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.miq.f.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.miq.f.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.miq.f.a) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$f$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                return str != null ? str.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Http(uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private f() {
            super();
        }

        public /* synthetic */ f(byte b) {
            this();
        }
    }

    /* renamed from: miq$d */
    public static abstract class d extends miq implements e {

        /* renamed from: miq$d$a */
        public static final class a extends d {
            private final String a;
            private final String b;

            public a(String str, String str2) {
                akcr.b(str, "authority");
                akcr.b(str2, "path");
                super();
                this.a = str;
                this.b = str2;
            }

            private static a a(String str, String str2) {
                akcr.b(str, "authority");
                akcr.b(str2, "path");
                return new a(str, str2);
            }

            public final String a() {
                StringBuilder stringBuilder = new StringBuilder("content:");
                stringBuilder.append(this.a);
                stringBuilder.append(this.b);
                return stringBuilder.toString();
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.miq.d.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.miq.d.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r3 = 0;
                return r3;
            L_0x001f:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miq$d$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Content(authority=");
                stringBuilder.append(this.a);
                stringBuilder.append(", path=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private d() {
            super();
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private miq() {
    }

    public /* synthetic */ miq(byte b) {
        this();
    }
}
