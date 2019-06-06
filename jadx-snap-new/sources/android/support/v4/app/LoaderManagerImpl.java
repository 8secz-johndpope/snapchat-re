package android.support.v4.app;

import android.arch.lifecycle.LiveData;
import android.os.Bundle;
import android.os.Looper;
import defpackage.gl;
import defpackage.hb;
import defpackage.iy;
import defpackage.ji;
import defpackage.l;
import defpackage.q;
import defpackage.r;
import defpackage.w;
import defpackage.x;
import defpackage.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

public final class LoaderManagerImpl extends gl {
    public final LoaderViewModel a;
    private final l b;
    private boolean c;

    public static class a<D> extends q<D> implements defpackage.hb.b<D> {
        private final int f = 100;
        private final Bundle g = null;
        private final hb<D> h;
        private l i;
        private b<D> j;
        private hb<D> k;

        a(int i, Bundle bundle, hb<D> hbVar) {
            this.h = hbVar;
            this.k = null;
            hb hbVar2 = this.h;
            if (hbVar2.e == null) {
                hbVar2.e = this;
                hbVar2.d = 100;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        /* Access modifiers changed, original: final */
        public final hb<D> a(l lVar, defpackage.gl.a<D> aVar) {
            b bVar = new b(this.h, aVar);
            a(lVar, bVar);
            b bVar2 = this.j;
            if (bVar2 != null) {
                a(bVar2);
            }
            this.i = lVar;
            this.j = bVar;
            return this.h;
        }

        public final void a() {
            this.h.i();
        }

        public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            StringBuilder stringBuilder;
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f);
            printWriter.print(" mArgs=");
            printWriter.println(this.g);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.h);
            hb hbVar = this.h;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            String str2 = "  ";
            stringBuilder2.append(str2);
            hbVar.a(stringBuilder2.toString(), fileDescriptor, printWriter, strArr);
            if (this.j != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.j);
                b bVar = this.j;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str2);
                printWriter.print(stringBuilder.toString());
                printWriter.print("mDeliveredData=");
                printWriter.println(bVar.a);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            Object obj = this.d;
            if (obj == LiveData.b) {
                obj = null;
            }
            stringBuilder = new StringBuilder(64);
            iy.a(obj, stringBuilder);
            stringBuilder.append("}");
            printWriter.println(stringBuilder.toString());
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(this.c > 0);
        }

        public final void a(r<D> rVar) {
            super.a((r) rVar);
            this.i = null;
            this.j = null;
        }

        public final void b() {
            this.h.l();
        }

        public final void b(D d) {
            super.b(d);
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            l lVar = this.i;
            b bVar = this.j;
            if (lVar != null && bVar != null) {
                super.a((r) bVar);
                a(lVar, bVar);
            }
        }

        public final void c(D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                super.b(d);
            } else {
                a(d);
            }
        }

        /* Access modifiers changed, original: final */
        public final hb<D> d() {
            this.h.j();
            this.h.h = true;
            b bVar = this.j;
            if (bVar != null) {
                a(bVar);
                bVar.a();
            }
            this.h.a(this);
            this.h.m();
            return null;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f);
            stringBuilder.append(" : ");
            iy.a(this.h, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    public static class LoaderViewModel extends w {
        static final defpackage.x.a a = new defpackage.x.a() {
            public final <T extends w> T a() {
                return new LoaderViewModel();
            }
        };
        ji<a> b = new ji();

        LoaderViewModel() {
        }

        public final void a() {
            int i;
            super.a();
            int b = this.b.b();
            for (i = 0; i < b; i++) {
                ((a) this.b.c(i)).d();
            }
            ji jiVar = this.b;
            i = jiVar.d;
            Object[] objArr = jiVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            jiVar.d = 0;
            jiVar.a = false;
        }

        public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("    ");
                String stringBuilder2 = stringBuilder.toString();
                for (int i = 0; i < this.b.b(); i++) {
                    a aVar = (a) this.b.c(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.b(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final <D> a<D> b() {
            return (a) this.b.a(100, null);
        }

        public final void c() {
            int b = this.b.b();
            for (int i = 0; i < b; i++) {
                ((a) this.b.c(i)).c();
            }
        }
    }

    static class b<D> implements r<D> {
        boolean a = false;
        private final hb<D> b;
        private final defpackage.gl.a<D> c;

        b(hb<D> hbVar, defpackage.gl.a<D> aVar) {
            this.b = hbVar;
            this.c = aVar;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            if (this.a) {
                this.c.a(this.b);
            }
        }

        public final void a(D d) {
            this.c.a(this.b, d);
            this.a = true;
        }

        public final String toString() {
            return this.c.toString();
        }
    }

    public LoaderManagerImpl(l lVar, y yVar) {
        this.b = lVar;
        x xVar = new x(yVar, LoaderViewModel.a);
        Class cls = LoaderViewModel.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            canonicalName = "android.arch.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName));
            w wVar = (w) xVar.b.a.get(canonicalName);
            if (!cls.isInstance(wVar)) {
                wVar = xVar.a.a();
                xVar.b.a(canonicalName, wVar);
            }
            this.a = (LoaderViewModel) wVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    private <D> hb<D> b(defpackage.gl.a<D> aVar) {
        try {
            this.c = true;
            hb a = aVar.a();
            if (a.getClass().isMemberClass()) {
                if (!Modifier.isStatic(a.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(a)));
                }
            }
            a aVar2 = new a(100, null, a);
            this.a.b.b(100, aVar2);
            return aVar2.a(this.b, aVar);
        } finally {
            this.c = false;
        }
    }

    public final <D> hb<D> a(defpackage.gl.a<D> aVar) {
        if (this.c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a b = this.a.b();
            return b == null ? b(aVar) : b.a(this.b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void a() {
        if (this.c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a b = this.a.b();
            if (b != null) {
                b.d();
                this.a.b.a(100);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.a(str, fileDescriptor, printWriter, strArr);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        iy.a(this.b, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
