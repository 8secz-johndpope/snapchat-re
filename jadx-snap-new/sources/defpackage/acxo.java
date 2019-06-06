package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.protobuf.nano.MessageNano;
import defpackage.acxv.e;
import defpackage.alim.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: acxo */
public class acxo {
    public final ajdw a;
    final ajdw b;
    public final ajei c;
    public final adbv d;
    public final String e;
    final adce f;
    public alij g;
    public final Context h;
    final b i = new b(this, (byte) 0);
    final Runnable j = new a(this);
    final ajwo<acxq> k = new ajwo();
    final ajdp<acxq> l = this.k.j(ajfu.a).f();
    public final acxu m = new acxu();
    final Map<acxv, alkm> n = new ConcurrentHashMap();
    final Map<acxv, HashSet<adcp>> o = new ConcurrentHashMap();
    final adcl p;
    final ajwy<aclo> q;
    adcp[] r;
    long s;
    int t = 5000;
    int u = 0;

    /* renamed from: acxo$1 */
    public class 1 implements Runnable {
        public final void run() {
            acxo.this.c.a(acxo.this.a.a(new h(acxo.this)));
        }
    }

    /* renamed from: acxo$a */
    static class a implements Runnable {
        private final WeakReference<acxo> a;

        public a(acxo acxo) {
            this.a = new WeakReference(acxo);
        }

        public final void run() {
            acxo acxo = (acxo) this.a.get();
            if (acxo != null) {
                aclo aclo = (aclo) acxo.q.get();
                if (!aclo.m() && !aclo.u.a() && abss.a().b()) {
                    new StringBuilder("Map was not paused when app is already backgrounded: ").append(acxo.e);
                    Toast.makeText(acxo.h, "Please Shake! Map ViewStateManager was not stopped properly.", 1).show();
                } else if (!aclo.m()) {
                    acxo.f.a(acxo.i);
                }
            }
        }
    }

    /* renamed from: acxo$c */
    class c implements Runnable {
        private final alij a;
        private final aczw b;
        private final boolean c;

        public c(alij alij, aczw aczw, boolean z) {
            this.a = alij;
            this.b = aczw;
            this.c = z;
        }

        /* JADX WARNING: Missing block: B:34:0x0086, code skipped:
            if (r5 != null) goto L_0x0096;
     */
        /* JADX WARNING: Missing block: B:35:0x0088, code skipped:
            r14.d.k.a(defpackage.acxr.a);
            defpackage.acxo.a(r14.d);
     */
        /* JADX WARNING: Missing block: B:36:0x0096, code skipped:
            return;
     */
        public final void run() {
            /*
            r14 = this;
            r0 = r14.a;
            if (r0 == 0) goto L_0x009a;
        L_0x0004:
            r0 = r0.a;
            if (r0 != 0) goto L_0x000a;
        L_0x0008:
            goto L_0x009a;
        L_0x000a:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r0 = defpackage.acxo.this;
            monitor-enter(r0);
            r1 = r14.c;	 Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0022;
        L_0x0016:
            r1 = defpackage.acxo.this;	 Catch:{ all -> 0x0097 }
            r1 = r1.n;	 Catch:{ all -> 0x0097 }
            r1 = r1.isEmpty();	 Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0022;
        L_0x0020:
            monitor-exit(r0);	 Catch:{ all -> 0x0097 }
            return;
        L_0x0022:
            r1 = r14.a;	 Catch:{ all -> 0x0097 }
            r1 = r1.a;	 Catch:{ all -> 0x0097 }
            r2 = r1.length;	 Catch:{ all -> 0x0097 }
            r3 = 0;
            r4 = 1;
            r4 = 0;
            r5 = 1;
        L_0x002b:
            if (r4 >= r2) goto L_0x0085;
        L_0x002d:
            r6 = r1[r4];	 Catch:{ all -> 0x0097 }
            r7 = r6.a;	 Catch:{ all -> 0x0097 }
            r7 = r7.a;	 Catch:{ all -> 0x0097 }
            r7 = defpackage.acxv.a(r7);	 Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x0082;
        L_0x0039:
            r8 = defpackage.acxv.HEAT;	 Catch:{ all -> 0x0097 }
            if (r7 != r8) goto L_0x004b;
        L_0x003d:
            r8 = defpackage.acxo.this;	 Catch:{ all -> 0x0097 }
            r8 = r8.q;	 Catch:{ all -> 0x0097 }
            r8 = r8.get();	 Catch:{ all -> 0x0097 }
            r8 = (defpackage.aclo) r8;	 Catch:{ all -> 0x0097 }
            r8 = r8.B;	 Catch:{ all -> 0x0097 }
            if (r8 == 0) goto L_0x0082;
        L_0x004b:
            r8 = defpackage.acxo.this;	 Catch:{ all -> 0x0097 }
            r8 = r8.n;	 Catch:{ all -> 0x0097 }
            r8 = r8.get(r7);	 Catch:{ all -> 0x0097 }
            r8 = (defpackage.alkm) r8;	 Catch:{ all -> 0x0097 }
            if (r8 == 0) goto L_0x007a;
        L_0x0057:
            r9 = r8.a;	 Catch:{ all -> 0x0097 }
            r9 = r9.c;	 Catch:{ all -> 0x0097 }
            r11 = r6.a;	 Catch:{ all -> 0x0097 }
            r11 = r11.c;	 Catch:{ all -> 0x0097 }
            r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
            if (r13 != 0) goto L_0x007a;
        L_0x0063:
            r9 = r8.a;	 Catch:{ all -> 0x0097 }
            r9 = r9.b;	 Catch:{ all -> 0x0097 }
            if (r9 != 0) goto L_0x006c;
        L_0x0069:
            r8 = "default";
            goto L_0x0070;
        L_0x006c:
            r8 = r8.a;	 Catch:{ all -> 0x0097 }
            r8 = r8.b;	 Catch:{ all -> 0x0097 }
        L_0x0070:
            r9 = r6.a;	 Catch:{ all -> 0x0097 }
            r9 = r9.b;	 Catch:{ all -> 0x0097 }
            r8 = r8.equals(r9);	 Catch:{ all -> 0x0097 }
            if (r8 != 0) goto L_0x0082;
        L_0x007a:
            r5 = defpackage.acxo.this;	 Catch:{ all -> 0x0097 }
            r5 = r5.n;	 Catch:{ all -> 0x0097 }
            r5.put(r7, r6);	 Catch:{ all -> 0x0097 }
            r5 = 0;
        L_0x0082:
            r4 = r4 + 1;
            goto L_0x002b;
        L_0x0085:
            monitor-exit(r0);	 Catch:{ all -> 0x0097 }
            if (r5 != 0) goto L_0x0096;
        L_0x0088:
            r0 = defpackage.acxo.this;
            r0 = r0.k;
            r1 = defpackage.acxr.a;
            r0.a(r1);
            r0 = defpackage.acxo.this;
            defpackage.acxo.a(r0);
        L_0x0096:
            return;
        L_0x0097:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0097 }
            throw r1;
        L_0x009a:
            r0 = defpackage.acxo.this;
            r0 = r0.k;
            r1 = new acxp;
            r2 = r14.b;
            r1.<init>(r2);
            r0.a(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acxo$c.run():void");
        }
    }

    /* renamed from: acxo$d */
    class d implements Runnable {
        private final alin a;
        private final aczw b;
        private final Map<acxv, alkm> c;
        private final Map<acxv, List<alkj>> d;

        public d(alin alin, aczw aczw, Map<acxv, alkm> map, Map<acxv, List<alkj>> map2) {
            this.a = alin;
            this.b = aczw;
            this.c = map;
            this.d = map2;
        }

        public final void run() {
            acxo acxo = acxo.this;
            acxo.u--;
            acxo.a(acxo.this);
            for (Object obj : acxv.values()) {
                List<alkj> list = (List) this.d.get(obj);
                if (list != null) {
                    HashSet hashSet = (HashSet) acxo.this.o.get(obj);
                    if (hashSet != null) {
                        for (alkj adcp : list) {
                            hashSet.remove(new adcp(adcp));
                        }
                    }
                }
            }
            alin alin = this.a;
            if (alin == null || alin.a == null) {
                acxo.this.k.a(new acxp(this.b));
                return;
            }
            e eVar = new e();
            int i = 0;
            for (alki alki : this.a.a) {
                if (alki.b != null) {
                    acxv a = acxv.a(alki.b.a);
                    if (a != null && this.c.containsKey(a)) {
                        a.a(eVar, acxo.this.m, new adcp(alki.a), ((alkm) this.c.get(a)).a, alki);
                        i++;
                    }
                }
            }
            if (i > 0) {
                ((aclo) acxo.this.q.get()).d();
            }
        }
    }

    /* renamed from: acxo$e */
    public static class e implements Runnable {
        private final WeakReference<acxo> a;
        private final Context b;
        private final String c;

        public e(String str, acxo acxo, Context context) {
            this.a = new WeakReference(acxo);
            this.b = context.getApplicationContext();
            this.c = str;
        }

        public final void run() {
            System.currentTimeMillis();
            synchronized (acxo.class) {
                try {
                    File file = new File(adbp.a(this.b), "last_tileset.proto");
                    if (file.exists()) {
                        if (file.isFile()) {
                            if (System.currentTimeMillis() - file.lastModified() > 3600000) {
                                file.delete();
                                try {
                                    return;
                                } catch (Throwable th) {
                                }
                            } else {
                                acxo acxo = (acxo) this.a.get();
                                if (acxo != null) {
                                    acxo.f.a(new c((alij) acxo.a(file, alij.class), null, true));
                                }
                            }
                        }
                    }
                    return;
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: acxo$f */
    class f implements Runnable {
        private final adcp[] b;

        public f(adcp... adcpArr) {
            this.b = adcpArr;
        }

        public final void run() {
            if (acxo.this.u >= 2) {
                acxo.this.r = this.b;
                return;
            }
            final EnumMap enumMap = new EnumMap(acxv.class);
            if (!acxo.this.n.isEmpty()) {
                enumMap.putAll(acxo.this.n);
            }
            final EnumMap enumMap2 = new EnumMap(acxv.class);
            int i = 0;
            Object obj = null;
            for (Entry entry : enumMap.entrySet()) {
                alkl alkl = ((alkm) entry.getValue()).a;
                acxv acxv = (acxv) entry.getKey();
                HashSet hashSet = (HashSet) acxo.this.o.get(acxv);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    acxo.this.o.put(acxv, hashSet);
                }
                ArrayList arrayList = new ArrayList();
                Object obj2 = obj;
                for (adcp adcp : this.b) {
                    if (!(acxv.a(acxo.this.m, adcp, alkl) || hashSet.contains(adcp))) {
                        hashSet.add(adcp);
                        arrayList.add(adcp.a());
                        obj2 = 1;
                    }
                }
                enumMap2.put(acxv, arrayList);
                obj = obj2;
            }
            if (obj != null) {
                acxo acxo = acxo.this;
                acxo.u++;
                StringBuilder stringBuilder = new StringBuilder();
                a[] aVarArr = new a[enumMap2.size()];
                for (Entry entry2 : enumMap2.entrySet()) {
                    List list = (List) entry2.getValue();
                    alkm alkm = (alkm) enumMap.get(entry2.getKey());
                    if (alkm != null) {
                        alkl alkl2 = alkm.a;
                        a aVar = new a();
                        aVar.a = alkl2;
                        aVar.b = new alkj[list.size()];
                        list.toArray(aVar.b);
                        int i2 = i + 1;
                        aVarArr[i] = aVar;
                        i = i2;
                    }
                }
                alim alim = new alim();
                alim.a = aVarArr;
                acxo.this.p.a(alim, new aczq<alin>() {
                    public final /* synthetic */ void a(Object obj, aczw aczw) {
                        acxo.this.f.a(new d((alin) obj, aczw, enumMap, enumMap2));
                    }
                });
            }
        }
    }

    /* renamed from: acxo$g */
    public static class g implements Runnable {
        private final alij a;
        private final Context b;
        private final String c;

        public g(String str, alij alij, Context context) {
            this.a = alij;
            this.c = str;
            this.b = context.getApplicationContext();
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0084 */
        public final void run() {
            /*
            r11 = this;
            java.lang.System.currentTimeMillis();
            r0 = defpackage.acxo.class;
            monitor-enter(r0);
            r1 = new java.io.File;	 Catch:{ IOException -> 0x0084 }
            r2 = r11.b;	 Catch:{ IOException -> 0x0084 }
            r2 = defpackage.adbp.a(r2);	 Catch:{ IOException -> 0x0084 }
            r3 = "last_tileset.proto";
            r1.<init>(r2, r3);	 Catch:{ IOException -> 0x0084 }
            r2 = r11.a;	 Catch:{ IOException -> 0x0084 }
            r3 = r2.getSerializedSize();	 Catch:{ Throwable -> 0x0079 }
            r4 = r1.getParentFile();	 Catch:{ Throwable -> 0x0079 }
            r5 = r4.exists();	 Catch:{ Throwable -> 0x0079 }
            if (r5 != 0) goto L_0x0026;
        L_0x0023:
            r4.mkdirs();	 Catch:{ Throwable -> 0x0079 }
        L_0x0026:
            r4 = android.os.Environment.getDataDirectory();	 Catch:{ Throwable -> 0x0079 }
            r5 = new android.os.StatFs;	 Catch:{ Throwable -> 0x0079 }
            r4 = r4.getPath();	 Catch:{ Throwable -> 0x0079 }
            r5.<init>(r4);	 Catch:{ Throwable -> 0x0079 }
            r4 = r5.getBlockSize();	 Catch:{ Throwable -> 0x0079 }
            r6 = (long) r4;	 Catch:{ Throwable -> 0x0079 }
            r4 = r5.getAvailableBlocks();	 Catch:{ Throwable -> 0x0079 }
            r4 = (long) r4;	 Catch:{ Throwable -> 0x0079 }
            r4 = r4 * r6;
            r6 = (long) r3;	 Catch:{ Throwable -> 0x0079 }
            r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r8 <= 0) goto L_0x0058;
        L_0x0043:
            r8 = new byte[r3];	 Catch:{ Throwable -> 0x0079 }
            r9 = 0;
            r10 = com.google.protobuf.nano.CodedOutputByteBufferNano.newInstance(r8, r9, r3);	 Catch:{ Throwable -> 0x0079 }
            r2.writeTo(r10);	 Catch:{ Throwable -> 0x0079 }
            r10.checkNoSpaceLeft();	 Catch:{ Throwable -> 0x0079 }
            r2 = new java.io.ByteArrayInputStream;	 Catch:{ Throwable -> 0x0079 }
            r2.<init>(r8, r9, r3);	 Catch:{ Throwable -> 0x0079 }
            defpackage.abrg.a(r2, r1);	 Catch:{ Throwable -> 0x0079 }
        L_0x0058:
            r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r1 <= 0) goto L_0x005d;
        L_0x005c:
            goto L_0x0084;
        L_0x005d:
            r1 = new java.io.IOException;	 Catch:{ IOException -> 0x0084 }
            r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0084 }
            r6 = "Not enough space left to save this proto, require: ";
            r2.<init>(r6);	 Catch:{ IOException -> 0x0084 }
            r2.append(r3);	 Catch:{ IOException -> 0x0084 }
            r3 = " left ";
            r2.append(r3);	 Catch:{ IOException -> 0x0084 }
            r2.append(r4);	 Catch:{ IOException -> 0x0084 }
            r2 = r2.toString();	 Catch:{ IOException -> 0x0084 }
            r1.<init>(r2);	 Catch:{ IOException -> 0x0084 }
            throw r1;	 Catch:{ IOException -> 0x0084 }
        L_0x0079:
            r1 = move-exception;
            r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0084 }
            r3 = "Failed to serialize proto.";
            r2.<init>(r3, r1);	 Catch:{ IOException -> 0x0084 }
            throw r2;	 Catch:{ IOException -> 0x0084 }
        L_0x0082:
            r1 = move-exception;
            goto L_0x0086;
        L_0x0084:
            monitor-exit(r0);	 Catch:{ all -> 0x0082 }
            return;
        L_0x0086:
            monitor-exit(r0);	 Catch:{ all -> 0x0082 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acxo$g.run():void");
        }
    }

    /* renamed from: acxo$h */
    static class h implements Runnable {
        private final WeakReference<acxo> a;

        public h(acxo acxo) {
            this.a = new WeakReference(acxo);
        }

        public final void run() {
            acxo acxo = (acxo) this.a.get();
            if (acxo != null) {
                acxo.i.run();
            }
        }
    }

    /* renamed from: acxo$b */
    class b implements aczq<alij>, Runnable {
        private b() {
        }

        /* synthetic */ b(acxo acxo, byte b) {
            this();
        }

        public final /* synthetic */ void a(Object obj, aczw aczw) {
            alij alij = (alij) obj;
            if (!((aclo) acxo.this.q.get()).m()) {
                synchronized (acxo.this) {
                    acxo.this.s = 0;
                    acxo.this.t = 5000;
                    if (!(alij == null || alij.a == null)) {
                        acxo.this.g = alij;
                    }
                }
                acxo.this.f.a(new c(alij, aczw, false));
                acxo.this.c.a(acxo.this.b.a(acxo.this.j, 60000, TimeUnit.MILLISECONDS));
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x005d in {2, 8, 12, 15, 18, 21} preds:[]
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
        public final void run() {
            /*
            r8 = this;
            r0 = defpackage.acxo.this;
            r0 = r0.q;
            r0 = r0.get();
            r0 = (defpackage.aclo) r0;
            r0 = r0.m();
            if (r0 == 0) goto L_0x0011;
            return;
            r0 = defpackage.acxo.this;
            monitor-enter(r0);
            r1 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x005a }
            r3 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            r3 = r3.s;	 Catch:{ all -> 0x005a }
            r5 = 0;	 Catch:{ all -> 0x005a }
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ all -> 0x005a }
            if (r7 != 0) goto L_0x0027;	 Catch:{ all -> 0x005a }
            r3 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            r3.s = r1;	 Catch:{ all -> 0x005a }
            goto L_0x004a;	 Catch:{ all -> 0x005a }
            r3 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            r3 = r3.s;	 Catch:{ all -> 0x005a }
            r3 = r1 - r3;	 Catch:{ all -> 0x005a }
            r5 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            r5 = r5.t;	 Catch:{ all -> 0x005a }
            r5 = (long) r5;	 Catch:{ all -> 0x005a }
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ all -> 0x005a }
            if (r7 <= 0) goto L_0x0058;	 Catch:{ all -> 0x005a }
            r3 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;	 Catch:{ all -> 0x005a }
            r5 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            r5 = r5.t;	 Catch:{ all -> 0x005a }
            r5 = r5 << 1;	 Catch:{ all -> 0x005a }
            r4 = java.lang.Math.min(r4, r5);	 Catch:{ all -> 0x005a }
            r3.t = r4;	 Catch:{ all -> 0x005a }
            r3 = defpackage.acxo.this;	 Catch:{ all -> 0x005a }
            goto L_0x0024;	 Catch:{ all -> 0x005a }
            monitor-exit(r0);	 Catch:{ all -> 0x005a }
            r0 = new alii;
            r0.<init>();
            r1 = defpackage.acxo.this;
            r1 = r1.p;
            r1.a(r0, r8);
            return;
            monitor-exit(r0);	 Catch:{ all -> 0x005a }
            return;	 Catch:{ all -> 0x005a }
            r1 = move-exception;	 Catch:{ all -> 0x005a }
            monitor-exit(r0);	 Catch:{ all -> 0x005a }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acxo$b.run():void");
        }
    }

    public acxo(adcl adcl, ajwy<aclo> ajwy, Context context, ajei ajei, adbv adbv, acli acli, adce adce) {
        this.p = adcl;
        this.q = ajwy;
        this.d = adbv;
        zfw a = zgb.a(adcw.b.callsite("TileFetcher"));
        this.a = zfx.a((ajdw) a.f(), 1);
        this.b = a.l();
        this.h = context.getApplicationContext();
        this.c = ajei;
        this.f = adce;
        StringBuilder stringBuilder = new StringBuilder("TileFetcher_");
        stringBuilder.append(acli.a);
        this.e = stringBuilder.toString();
    }

    static <T extends MessageNano> T a(File file, Class<T> cls) {
        try {
            return abqx.a(cls, acxo.a(file));
        } catch (abqx.a e) {
            throw new IOException(e);
        }
    }

    private static byte[] a(File file) {
        abmr.a("This method must not be called from the Main Thread.");
        byte[] fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 16384);
        try {
            fileInputStream = file.length();
            if (fileInputStream <= 2147483647L) {
                int i = (int) fileInputStream;
                fileInputStream = new byte[i];
                bufferedInputStream.read(fileInputStream, 0, i);
                return fileInputStream;
            }
            throw new IOException("Cannot read files larger than 2147483647 bytes");
        } finally {
            bufferedInputStream.close();
        }
    }

    public final alkm a(acxv acxv) {
        return (alkm) this.n.get(acxv);
    }

    public final void a(adcp... adcpArr) {
        this.f.a(new f(adcpArr));
    }

    public final alkl b(acxv acxv) {
        alkm alkm = (alkm) this.n.get(acxv);
        return alkm != null ? alkm.a : null;
    }
}
