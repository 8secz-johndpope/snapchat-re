package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.po;

public abstract class ListenableWorker {
    public Context a;
    public WorkerParameters b;
    public boolean c;
    private volatile boolean d;

    public static abstract class a {

        public static final class a extends a {
            public final po a;

            public a() {
                this(po.a);
            }

            private a(po poVar) {
                this.a = poVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return (a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Failure {mOutputData=");
                stringBuilder.append(this.a);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                return this == obj ? true : obj != null && getClass() == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            public final po a;

            public c() {
                this(po.a);
            }

            public c(po poVar) {
                this.a = poVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Success {mOutputData=");
                stringBuilder.append(this.a);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        a() {
        }

        public static a a() {
            return new c();
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.a = context;
            this.b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public abstract ListenableFuture<a> a();

    public final void b() {
        this.d = true;
        c();
    }

    public void c() {
    }
}
