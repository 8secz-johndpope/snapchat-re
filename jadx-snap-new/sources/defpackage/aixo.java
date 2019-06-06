package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import defpackage.aivh.c;
import defpackage.aivl.e;
import defpackage.aivw.a;
import defpackage.aiyy.b;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aixo */
public final class aixo {
    public static final boolean a;
    public static final e<Long> b = e.a("grpc-timeout", new c());
    public static final e<String> c = e.a("grpc-encoding", aivl.a);
    public static final e<byte[]> d = aivd.a("grpc-accept-encoding", new a());
    public static final e<String> e = e.a("content-encoding", aivl.a);
    public static final e<byte[]> f = aivd.a("accept-encoding", new a());
    public static final e<String> g = e.a("content-type", aivl.a);
    public static final e<String> h = e.a("te", aivl.a);
    public static final e<String> i = e.a("user-agent", aivl.a);
    public static final long j = TimeUnit.SECONDS.toNanos(20);
    public static final aiyk k = new aiyl();
    public static final aiyk l = new 1();
    public static final b<ExecutorService> m = new 2();
    public static final b<ScheduledExecutorService> n = new 3();
    public static final Supplier<Stopwatch> o = new 4();
    private static final Logger p = Logger.getLogger(aixo.class.getName());

    /* renamed from: aixo$c */
    static class c implements aivl.b<Long> {
        c() {
        }
    }

    /* renamed from: aixo$a */
    static final class a implements defpackage.aivd.a<byte[]> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: aixo$1 */
    class 1 implements aiyk {
        1() {
        }

        public final aiym a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* renamed from: aixo$2 */
    class 2 implements b<ExecutorService> {
        2() {
        }

        public final /* synthetic */ Object a() {
            return Executors.newCachedThreadPool(aixo.c("grpc-default-executor-%d"));
        }

        public final /* synthetic */ void a(Object obj) {
            ((ExecutorService) obj).shutdown();
        }

        public final String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: aixo$3 */
    class 3 implements b<ScheduledExecutorService> {
        3() {
        }

        private static ScheduledExecutorService b() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, aixo.c("grpc-timer-%d"));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return newScheduledThreadPool;
        }

        public final /* synthetic */ Object a() {
            return 3.b();
        }

        public final /* synthetic */ void a(Object obj) {
            ((ScheduledExecutorService) obj).shutdown();
        }
    }

    /* renamed from: aixo$4 */
    class 4 implements Supplier<Stopwatch> {
        4() {
        }

        public final /* synthetic */ Object get() {
            return Stopwatch.createUnstarted();
        }
    }

    /* renamed from: aixo$b */
    public enum b {
        NO_ERROR(0, aivw.j),
        PROTOCOL_ERROR(1, aivw.i),
        INTERNAL_ERROR(2, aivw.i),
        FLOW_CONTROL_ERROR(3, aivw.i),
        SETTINGS_TIMEOUT(4, aivw.i),
        STREAM_CLOSED(5, aivw.i),
        FRAME_SIZE_ERROR(6, aivw.i),
        REFUSED_STREAM(7, aivw.j),
        CANCEL(8, aivw.c),
        COMPRESSION_ERROR(9, aivw.i),
        CONNECT_ERROR(10, aivw.i),
        ENHANCE_YOUR_CALM(11, aivw.h.a("Bandwidth exhausted")),
        INADEQUATE_SECURITY(12, aivw.f.a("Permission denied as protocol is not secure enough to call")),
        HTTP_1_1_REQUIRED(13, aivw.d);
        
        public static final b[] codeMap = null;
        private final int code;
        public final aivw status;

        static {
            b[] values = b.values();
            b[] bVarArr = new b[(values[values.length - 1].code + 1)];
            int length = values.length;
            int i;
            while (i < length) {
                b bVar = values[i];
                bVarArr[bVar.code] = bVar;
                i++;
            }
            codeMap = bVarArr;
        }

        private b(int i, aivw aivw) {
            this.code = i;
            StringBuilder stringBuilder = new StringBuilder("HTTP/2 error code: ");
            stringBuilder.append(name());
            this.status = aivw.b(stringBuilder.toString());
        }
    }

    static {
        boolean z;
        Charset.forName("US-ASCII");
        if (System.getProperty("com.google.appengine.runtime.environment") != null) {
            if ("1.7".equals(System.getProperty("java.specification.version"))) {
                z = true;
                a = z;
                Splitter.on(',').trimResults();
                TimeUnit.MINUTES.toNanos(1);
                TimeUnit.HOURS.toNanos(2);
                TimeUnit.SECONDS.toNanos(20);
            }
        }
        z = false;
        a = z;
        Splitter.on(',').trimResults();
        TimeUnit.MINUTES.toNanos(1);
        TimeUnit.HOURS.toNanos(2);
        TimeUnit.SECONDS.toNanos(20);
    }

    private aixo() {
    }

    public static aivw a(int i) {
        a aVar;
        if ((i < 100 || i >= Callback.DEFAULT_DRAG_ANIMATION_DURATION) && i != 400) {
            if (i == 401) {
                aVar = a.UNAUTHENTICATED;
            } else if (i == 403) {
                aVar = a.PERMISSION_DENIED;
            } else if (i != 404) {
                if (i != 429) {
                    if (i != 431) {
                        switch (i) {
                            case 502:
                            case 503:
                            case 504:
                                break;
                            default:
                                aVar = a.UNKNOWN;
                                break;
                        }
                    }
                }
                aVar = a.UNAVAILABLE;
            } else {
                aVar = a.UNIMPLEMENTED;
            }
            return aVar.b().a("HTTP status code ".concat(String.valueOf(i)));
        }
        aVar = a.INTERNAL;
        return aVar.b().a("HTTP status code ".concat(String.valueOf(i)));
    }

    static aiwu a(c cVar, boolean z) {
        aivh.e eVar = cVar.b;
        aiwu e = eVar != null ? ((aiwf) eVar).e() : null;
        if (e != null) {
            return e;
        }
        if (!cVar.d.b()) {
            if (cVar.e) {
                return new aixh(cVar.d, 3);
            }
            if (!z) {
                return new aixh(cVar.d, 1);
            }
        }
        return null;
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    static void a(aizc.a aVar) {
        while (true) {
            InputStream a = aVar.a();
            if (a != null) {
                aixo.a(a);
            } else {
                return;
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                p.log(Level.WARNING, "exception caught in closeQuietly", e);
            }
        }
    }

    public static boolean a(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        str = str.toLowerCase();
        if (!str.startsWith("application/grpc")) {
            return false;
        }
        if (str.length() == 16) {
            return true;
        }
        char charAt = str.charAt(16);
        return charAt == '+' || charAt == ';';
    }

    public static URI b(String str) {
        Preconditions.checkNotNull(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str)), e);
        }
    }

    public static ThreadFactory c(String str) {
        return a ? MoreExecutors.platformThreadFactory() : new ThreadFactoryBuilder().setDaemon(true).setNameFormat(str).build();
    }
}
