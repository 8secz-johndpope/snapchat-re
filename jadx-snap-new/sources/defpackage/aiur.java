package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aivw.a;
import java.util.concurrent.TimeoutException;

/* renamed from: aiur */
public final class aiur {
    public static aivw a(aiuq aiuq) {
        Preconditions.checkNotNull(aiuq, "context must not be null");
        if (!aiuq.d()) {
            return null;
        }
        Throwable e = aiuq.e();
        if (e == null) {
            return aivw.c.a("io.grpc.Context was cancelled without error");
        }
        if (e instanceof TimeoutException) {
            return aivw.e.a(e.getMessage()).b(e);
        }
        aivw a = aivw.a(e);
        return (a.UNKNOWN.equals(a.m) && a.o == e) ? aivw.c.a("Context cancelled").b(e) : a.b(e);
    }
}
