package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: akou */
public abstract class akou {
    static final String a = "akou";

    /* renamed from: akou$a */
    public static class a {
        protected final akpa a;

        /* renamed from: akou$a$1 */
        class 1 implements Comparator<akow> {
            1() {
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                akow akow = (akow) obj;
                akow akow2 = (akow) obj2;
                String str = "Fallback-Cronet-Provider";
                return str.equals(akow.b()) ? 1 : str.equals(akow2.b()) ? -1 : -a.a(akow.c(), akow2.c());
            }
        }

        public a(akpa akpa) {
            this.a = akpa;
        }

        public a(Context context) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
            String str = "org.chromium.net.impl.JavaCronetProvider";
            String str2 = "org.chromium.net.impl.NativeCronetProvider";
            String str3 = "com.google.android.gms.net.GmsCoreCronetProvider";
            String str4 = "com.google.android.gms.net.PlayServicesCronetProvider";
            if (identifier != 0) {
                String string = context.getResources().getString(identifier);
                if (!(string == null || string.equals(str4) || string.equals(str3) || string.equals(str) || string.equals(str2) || akow.a(context, string, linkedHashSet, true))) {
                    String str5 = akow.a;
                    StringBuilder stringBuilder = new StringBuilder("Unable to instantiate Cronet implementation class ");
                    stringBuilder.append(string);
                    stringBuilder.append(" that is listed as in the app string resource file under CronetProviderClassName key");
                    Log.e(str5, stringBuilder.toString());
                }
            }
            akow.a(context, str4, linkedHashSet, false);
            akow.a(context, str3, linkedHashSet, false);
            akow.a(context, str2, linkedHashSet, false);
            akow.a(context, str, linkedHashSet, false);
            akow akow = (akow) a.a(new ArrayList(Collections.unmodifiableList(new ArrayList(linkedHashSet)))).get(0);
            if (Log.isLoggable(akou.a, 3)) {
                Log.d(akou.a, String.format("Using '%s' provider for creating CronetEngine.Builder.", new Object[]{akow}));
            }
            this(akow.a().a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x005d in {11, 12, 15, 17, 19} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        static int a(java.lang.String r5, java.lang.String r6) {
            /*
            if (r5 == 0) goto L_0x0055;
            if (r6 == 0) goto L_0x0055;
            r0 = "\\.";
            r5 = r5.split(r0);
            r6 = r6.split(r0);
            r0 = 0;
            r1 = r5.length;
            if (r0 >= r1) goto L_0x004d;
            r1 = r6.length;
            if (r0 >= r1) goto L_0x004d;
            r1 = r5[r0];	 Catch:{ NumberFormatException -> 0x002c }
            r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x002c }
            r2 = r6[r0];	 Catch:{ NumberFormatException -> 0x002c }
            r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x002c }
            if (r1 == r2) goto L_0x0029;	 Catch:{ NumberFormatException -> 0x002c }
            r1 = r1 - r2;	 Catch:{ NumberFormatException -> 0x002c }
            r5 = java.lang.Integer.signum(r1);	 Catch:{ NumberFormatException -> 0x002c }
            return r5;
            r0 = r0 + 1;
            goto L_0x000f;
            r1 = move-exception;
            r2 = new java.lang.IllegalArgumentException;
            r3 = new java.lang.StringBuilder;
            r4 = "Unable to convert version segments into integers: ";
            r3.<init>(r4);
            r5 = r5[r0];
            r3.append(r5);
            r5 = " & ";
            r3.append(r5);
            r5 = r6[r0];
            r3.append(r5);
            r5 = r3.toString();
            r2.<init>(r5, r1);
            throw r2;
            r5 = r5.length;
            r6 = r6.length;
            r5 = r5 - r6;
            r5 = java.lang.Integer.signum(r5);
            return r5;
            r5 = new java.lang.IllegalArgumentException;
            r6 = "The input values cannot be null";
            r5.<init>(r6);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akou$a.a(java.lang.String, java.lang.String):int");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0033 in {5, 9, 11, 13} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private static java.util.List<defpackage.akow> a(java.util.List<defpackage.akow> r2) {
            /*
            r0 = r2.size();
            if (r0 == 0) goto L_0x002b;
            r0 = r2.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0014;
            r0.next();
            goto L_0x000a;
            r0 = r2.size();
            if (r0 == 0) goto L_0x0023;
            r0 = new akou$a$1;
            r0.<init>();
            java.util.Collections.sort(r2, r0);
            return r2;
            r2 = new java.lang.RuntimeException;
            r0 = "All available Cronet providers are disabled. A provider should be enabled before it can be used.";
            r2.<init>(r0);
            throw r2;
            r2 = new java.lang.RuntimeException;
            r0 = "Unable to find any Cronet provider. Have you included all necessary jars?";
            r2.<init>(r0);
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akou$a.a(java.util.List):java.util.List");
        }

        public final a a() {
            this.a.a();
            return this;
        }

        public a a(int i, long j) {
            this.a.a(i, j);
            return this;
        }

        public a a(String str) {
            this.a.b(str);
            return this;
        }

        public a a(String str, int i, int i2) {
            this.a.a(str, i, i2);
            return this;
        }

        public a a(String str, Set<byte[]> set, boolean z, Date date) {
            this.a.a(str, set, z, date);
            return this;
        }

        public a a(boolean z) {
            this.a.c(z);
            return this;
        }

        public a b(boolean z) {
            this.a.a(z);
            return this;
        }

        public a c(boolean z) {
            this.a.b(z);
            return this;
        }
    }

    public abstract void a();
}
