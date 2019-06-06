package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: ajab */
public class ajab {
    public static final Logger a = Logger.getLogger(ajab.class.getName());
    public static final ajab b = ajab.b();
    private static final String[] d = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public final Provider c;

    /* renamed from: ajab$a */
    static class a extends ajab {
        private final ajaa<Socket> d;
        private final ajaa<Socket> e;
        private final Method f;
        private final Method g;
        private final ajaa<Socket> h;
        private final ajaa<Socket> i;
        private final int j;

        public a(ajaa<Socket> ajaa, ajaa<Socket> ajaa2, Method method, Method method2, ajaa<Socket> ajaa3, ajaa<Socket> ajaa4, Provider provider, int i) {
            super(provider);
            this.d = ajaa;
            this.e = ajaa2;
            this.f = method;
            this.g = method2;
            this.h = ajaa3;
            this.i = ajaa4;
            this.j = i;
        }

        public final int a() {
            return this.j;
        }

        public final void a(SSLSocket sSLSocket, String str, List<ajac> list) {
            if (str != null) {
                this.d.a(sSLSocket, Boolean.TRUE);
                this.e.a(sSLSocket, str);
            }
            if (this.i.a((Object) sSLSocket)) {
                this.i.b(sSLSocket, ajab.a((List) list));
            }
        }

        public final String b(SSLSocket sSLSocket) {
            if (!this.h.a((Object) sSLSocket)) {
                return null;
            }
            byte[] bArr = (byte[]) this.h.b(sSLSocket, new Object[0]);
            return bArr != null ? new String(bArr, ajae.b) : null;
        }
    }

    /* renamed from: ajab$1 */
    class 1 implements PrivilegedExceptionAction<Method> {
        1() {
        }

        public final /* synthetic */ Object run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: ajab$2 */
    class 2 implements PrivilegedExceptionAction<Method> {
        2() {
        }

        public final /* synthetic */ Object run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
        }
    }

    /* renamed from: ajab$3 */
    class 3 implements PrivilegedExceptionAction<Method> {
        3() {
        }

        public final /* synthetic */ Object run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: ajab$d */
    static class d implements InvocationHandler {
        boolean a;
        String b;
        private final List<String> c;

        public d(List<String> list) {
            this.c = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class returnType = method.getReturnType();
            if (objArr == null) {
                objArr = ajae.a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.c.contains(list.get(i))) {
                            obj = list.get(i);
                            break;
                        }
                    }
                    obj = this.c.get(0);
                    name = (String) obj;
                    this.b = name;
                    return name;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.b = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: ajab$b */
    static class b extends ajab {
        private final Method d;
        private final Method e;

        private b(Provider provider, Method method, Method method2) {
            super(provider);
            this.d = method;
            this.e = method2;
        }

        /* synthetic */ b(Provider provider, Method method, Method method2, byte b) {
            this(provider, method, method2);
        }

        public final int a() {
            return 1;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0050 in {5, 9, 12, 15} preds:[]
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
        public final void a(javax.net.ssl.SSLSocket r5, java.lang.String r6, java.util.List<defpackage.ajac> r7) {
            /*
            r4 = this;
            r6 = r5.getSSLParameters();
            r0 = new java.util.ArrayList;
            r1 = r7.size();
            r0.<init>(r1);
            r7 = r7.iterator();
            r1 = r7.hasNext();
            if (r1 == 0) goto L_0x0029;
            r1 = r7.next();
            r1 = (defpackage.ajac) r1;
            r2 = defpackage.ajac.HTTP_1_0;
            if (r1 == r2) goto L_0x0011;
            r1 = r1.toString();
            r0.add(r1);
            goto L_0x0011;
            r7 = r4.d;	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r1 = 1;	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r2 = 0;	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r3 = r0.size();	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r3 = new java.lang.String[r3];	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r0 = r0.toArray(r3);	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r1[r2] = r0;	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r7.invoke(r6, r1);	 Catch:{ IllegalAccessException -> 0x0049, InvocationTargetException -> 0x0042 }
            r5.setSSLParameters(r6);
            return;
            r5 = move-exception;
            r6 = new java.lang.RuntimeException;
            r6.<init>(r5);
            throw r6;
            r5 = move-exception;
            r6 = new java.lang.RuntimeException;
            r6.<init>(r5);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajab$b.a(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        public final String b(SSLSocket sSLSocket) {
            try {
                return (String) this.e.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: ajab$c */
    static class c extends ajab {
        private final Method d;
        private final Method e;
        private final Method f;
        private final Class<?> g;
        private final Class<?> h;

        public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.d = method;
            this.e = method2;
            this.f = method3;
            this.g = cls;
            this.h = cls2;
        }

        public final int a() {
            return 1;
        }

        public final void a(SSLSocket sSLSocket) {
            try {
                this.f.invoke(null, new Object[]{sSLSocket});
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x005b in {4, 5, 8, 11, 14} preds:[]
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
        public final void a(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<defpackage.ajac> r8) {
            /*
            r5 = this;
            r7 = new java.util.ArrayList;
            r0 = r8.size();
            r7.<init>(r0);
            r0 = r8.size();
            r1 = 0;
            r2 = 0;
            if (r2 >= r0) goto L_0x0025;
            r3 = r8.get(r2);
            r3 = (defpackage.ajac) r3;
            r4 = defpackage.ajac.HTTP_1_0;
            if (r3 == r4) goto L_0x0022;
            r3 = r3.toString();
            r7.add(r3);
            r2 = r2 + 1;
            goto L_0x000f;
            r8 = defpackage.ajab.class;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r8 = r8.getClassLoader();	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r0 = 2;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r2 = new java.lang.Class[r0];	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r3 = r5.g;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r2[r1] = r3;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r3 = r5.h;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r4 = 1;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r2[r4] = r3;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r3 = new ajab$d;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r3.<init>(r7);	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r7 = java.lang.reflect.Proxy.newProxyInstance(r8, r2, r3);	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r8 = r5.d;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r2 = 0;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r0 = new java.lang.Object[r0];	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r0[r1] = r6;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r0[r4] = r7;	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            r8.invoke(r2, r0);	 Catch:{ InvocationTargetException -> 0x0054, IllegalAccessException -> 0x004d }
            return;
            r6 = move-exception;
            r7 = new java.lang.AssertionError;
            r7.<init>(r6);
            throw r7;
            r6 = move-exception;
            r7 = new java.lang.AssertionError;
            r7.<init>(r6);
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajab$c.a(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        public final String b(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.e.invoke(null, new Object[]{sSLSocket}));
                if (dVar.a || dVar.b != null) {
                    return dVar.a ? null : dVar.b;
                } else {
                    a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
            } catch (InvocationTargetException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
    }

    public ajab(Provider provider) {
        this.c = provider;
    }

    public static byte[] a(List<ajac> list) {
        akkd akkd = new akkd();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ajac ajac = (ajac) list.get(i);
            if (ajac != ajac.HTTP_1_0) {
                akkd.j(ajac.toString().length());
                akkd.b(ajac.toString());
            }
        }
        return akkd.q();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:58:0x01a3 in {2, 10, 11, 12, 13, 21, 22, 25, 27, 34, 37, 40, 41, 43, 48, 51, 54, 57} preds:[]
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
    private static defpackage.ajab b() {
        /*
        r0 = defpackage.aixo.a;
        r1 = 0;
        r2 = 0;
        if (r0 == 0) goto L_0x000c;
        r0 = defpackage.ajab.e();
        r12 = r0;
        goto L_0x0047;
        r0 = java.security.Security.getProviders();
        r3 = r0.length;
        r4 = 0;
        if (r4 >= r3) goto L_0x003d;
        r5 = r0[r4];
        r6 = d;
        r7 = 0;
        r8 = 5;
        if (r7 >= r8) goto L_0x003a;
        r8 = r6[r7];
        r9 = r5.getClass();
        r9 = r9.getName();
        r9 = r8.equals(r9);
        if (r9 == 0) goto L_0x0037;
        r0 = a;
        r3 = java.util.logging.Level.FINE;
        r4 = "Found registered provider {0}";
        r0.log(r3, r4, r8);
        r12 = r5;
        goto L_0x0047;
        r7 = r7 + 1;
        goto L_0x0019;
        r4 = r4 + 1;
        goto L_0x0012;
        r0 = a;
        r3 = java.util.logging.Level.WARNING;
        r4 = "Unable to find Conscrypt";
        r0.log(r3, r4);
        r12 = r1;
        r0 = 2;
        r3 = 1;
        if (r12 == 0) goto L_0x00e2;
        r6 = new ajaa;
        r4 = new java.lang.Class[r3];
        r5 = java.lang.Boolean.TYPE;
        r4[r2] = r5;
        r5 = "setUseSessionTickets";
        r6.<init>(r1, r5, r4);
        r7 = new ajaa;
        r4 = new java.lang.Class[r3];
        r5 = java.lang.String.class;
        r4[r2] = r5;
        r5 = "setHostname";
        r7.<init>(r1, r5, r4);
        r10 = new ajaa;
        r4 = byte[].class;
        r5 = new java.lang.Class[r2];
        r8 = "getAlpnSelectedProtocol";
        r10.<init>(r4, r8, r5);
        r11 = new ajaa;
        r4 = new java.lang.Class[r3];
        r5 = byte[].class;
        r4[r2] = r5;
        r5 = "setAlpnProtocols";
        r11.<init>(r1, r5, r4);
        r4 = "android.net.TrafficStats";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r5 = "tagSocket";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r8 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r9 = java.net.Socket.class;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r8[r2] = r9;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r5 = r4.getMethod(r5, r8);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009c }
        r8 = "untagSocket";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009d }
        r9 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009d }
        r13 = java.net.Socket.class;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009d }
        r9[r2] = r13;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009d }
        r1 = r4.getMethod(r8, r9);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x009d }
        goto L_0x009d;
        r5 = r1;
        r9 = r1;
        r8 = r5;
        r1 = defpackage.aixo.a;
        if (r1 == 0) goto L_0x00a5;
        r13 = 1;
        goto L_0x00db;
        r1 = r12.getName();
        r2 = "GmsCore_OpenSSL";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00a3;
        r1 = r12.getName();
        r2 = "Conscrypt";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00a3;
        r1 = r12.getName();
        r2 = "Ssl_Guard";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00ca;
        goto L_0x00a3;
        r1 = defpackage.ajab.c();
        if (r1 == 0) goto L_0x00d1;
        goto L_0x00a3;
        r1 = defpackage.ajab.d();
        if (r1 == 0) goto L_0x00d9;
        r13 = 2;
        goto L_0x00db;
        r0 = 3;
        r13 = 3;
        r0 = new ajab$a;
        r5 = r0;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13);
        return r0;
        r4 = javax.net.ssl.SSLContext.getDefault();	 Catch:{ NoSuchAlgorithmException -> 0x019c }
        r4 = r4.getProvider();	 Catch:{ NoSuchAlgorithmException -> 0x019c }
        r5 = "TLS";	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = javax.net.ssl.SSLContext.getInstance(r5, r4);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5.init(r1, r1, r1);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r1 = r5.createSSLEngine();	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = new ajab$1;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5.<init>();	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = java.security.AccessController.doPrivileged(r5);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = (java.lang.reflect.Method) r5;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r6 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5.invoke(r1, r6);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r1 = new ajab$2;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r1.<init>();	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r1 = java.security.AccessController.doPrivileged(r1);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r1 = (java.lang.reflect.Method) r1;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = new ajab$3;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5.<init>();	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = java.security.AccessController.doPrivileged(r5);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r5 = (java.lang.reflect.Method) r5;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r6 = new ajab$b;	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        r6.<init>(r4, r1, r5, r2);	 Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x0123 }
        return r6;
    L_0x0123:
        r1 = "org.eclipse.jetty.alpn.ALPN";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r5 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6.<init>();	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6.append(r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = "$Provider";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6.append(r7);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6 = r6.toString();	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7.<init>();	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7.append(r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r8 = "$ClientProvider";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7.append(r8);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = r7.toString();	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r9 = java.lang.Class.forName(r7);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7.<init>();	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7.append(r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1 = "$ServerProvider";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7.append(r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1 = r7.toString();	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r10 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1 = "put";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r0 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r0[r2] = r7;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r0[r3] = r6;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r6 = r5.getMethod(r1, r0);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r0 = "get";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1[r2] = r7;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r7 = r5.getMethod(r0, r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r0 = "remove";	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r3 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r1[r2] = r3;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r8 = r5.getMethod(r0, r1);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r0 = new ajab$c;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r5 = r0;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r11 = r4;	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        r5.<init>(r6, r7, r8, r9, r10, r11);	 Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0196 }
        return r0;
        r0 = new ajab;
        r0.<init>(r4);
        return r0;
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajab.b():ajab");
    }

    private static boolean c() {
        try {
            ajab.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            a.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    private static boolean d() {
        try {
            ajab.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            a.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    private static Provider e() {
        try {
            return (Provider) Class.forName("org.conscrypt.OpenSSLProvider").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException("Unable to load conscrypt security provider", th);
        }
    }

    public int a() {
        return 3;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<ajac> list) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }
}
