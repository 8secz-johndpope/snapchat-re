package defpackage;

import android.util.ArrayMap;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.snapchat.android.R;
import defpackage.zob.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zod */
public final class zod {
    static ArrayList<ViewGroup> a = new ArrayList();
    private static zob b = new znx();
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<zob>>>> c = new ThreadLocal();

    /* renamed from: zod$a */
    static class a implements OnAttachStateChangeListener, OnPreDrawListener {
        zob a;
        ViewGroup b;
        private ViewTreeObserver c = this.b.getViewTreeObserver();

        /* renamed from: zod$a$1 */
        class 1 extends zoc {
            private /* synthetic */ ArrayMap a;

            1(ArrayMap arrayMap) {
                this.a = arrayMap;
            }

            public final void a(zob zob) {
                ((ArrayList) this.a.get(a.this.b)).remove(zob);
                a.this.a.b((b) this);
            }
        }

        a(zob zob, ViewGroup viewGroup) {
            this.a = zob;
            this.b = viewGroup;
        }

        private void a() {
            (this.c.isAlive() ? this.c : this.b.getViewTreeObserver()).removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0087 in {5, 8, 14, 15, 17, 20} preds:[]
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
        public final boolean onPreDraw() {
            /*
            r4 = this;
            r0 = "TransitionManager:onPreDraw";	 Catch:{ all -> 0x0082 }
            defpackage.in.a(r0);	 Catch:{ all -> 0x0082 }
            r4.a();	 Catch:{ all -> 0x0082 }
            r0 = defpackage.zod.a;	 Catch:{ all -> 0x0082 }
            r1 = r4.b;	 Catch:{ all -> 0x0082 }
            r0 = r0.remove(r1);	 Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x007d;	 Catch:{ all -> 0x0082 }
            r0 = defpackage.zod.a();	 Catch:{ all -> 0x0082 }
            r1 = r4.b;	 Catch:{ all -> 0x0082 }
            r1 = r0.get(r1);	 Catch:{ all -> 0x0082 }
            r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x0082 }
            r2 = 0;	 Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x002c;	 Catch:{ all -> 0x0082 }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0082 }
            r1.<init>();	 Catch:{ all -> 0x0082 }
            r3 = r4.b;	 Catch:{ all -> 0x0082 }
            r0.put(r3, r1);	 Catch:{ all -> 0x0082 }
            goto L_0x0037;	 Catch:{ all -> 0x0082 }
            r3 = r1.size();	 Catch:{ all -> 0x0082 }
            if (r3 <= 0) goto L_0x0037;	 Catch:{ all -> 0x0082 }
            r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0082 }
            r2.<init>(r1);	 Catch:{ all -> 0x0082 }
            r3 = r4.a;	 Catch:{ all -> 0x0082 }
            r1.add(r3);	 Catch:{ all -> 0x0082 }
            r1 = r4.a;	 Catch:{ all -> 0x0082 }
            r3 = new zod$a$1;	 Catch:{ all -> 0x0082 }
            r3.<init>(r0);	 Catch:{ all -> 0x0082 }
            r1.a(r3);	 Catch:{ all -> 0x0082 }
            r0 = "capture";	 Catch:{ all -> 0x0082 }
            defpackage.in.a(r0);	 Catch:{ all -> 0x0082 }
            r0 = r4.a;	 Catch:{ all -> 0x0082 }
            r1 = r4.b;	 Catch:{ all -> 0x0082 }
            r3 = 0;	 Catch:{ all -> 0x0082 }
            r0.a(r1, r3);	 Catch:{ all -> 0x0082 }
            defpackage.in.a();	 Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x006e;	 Catch:{ all -> 0x0082 }
            r0 = r2.iterator();	 Catch:{ all -> 0x0082 }
            r1 = r0.hasNext();	 Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x0082 }
            r1 = r0.next();	 Catch:{ all -> 0x0082 }
            r1 = (defpackage.zob) r1;	 Catch:{ all -> 0x0082 }
            r2 = r4.b;	 Catch:{ all -> 0x0082 }
            r1.d(r2);	 Catch:{ all -> 0x0082 }
            goto L_0x005c;	 Catch:{ all -> 0x0082 }
            r0 = "play";	 Catch:{ all -> 0x0082 }
            defpackage.in.a(r0);	 Catch:{ all -> 0x0082 }
            r0 = r4.a;	 Catch:{ all -> 0x0082 }
            r1 = r4.b;	 Catch:{ all -> 0x0082 }
            r0.a(r1);	 Catch:{ all -> 0x0082 }
            defpackage.in.a();	 Catch:{ all -> 0x0082 }
            defpackage.in.a();
            r0 = 1;
            return r0;
            r0 = move-exception;
            defpackage.in.a();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zod$a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            a();
            zod.a.remove(this.b);
            ArrayList arrayList = (ArrayList) zod.a().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zob) it.next()).d(this.b);
                }
            }
            this.a.a(true);
        }
    }

    static ArrayMap<ViewGroup, ArrayList<zob>> a() {
        ArrayMap arrayMap;
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference != null) {
            arrayMap = (ArrayMap) weakReference.get();
            if (arrayMap != null) {
                return arrayMap;
            }
        }
        arrayMap = new ArrayMap();
        c.set(new WeakReference(arrayMap));
        return arrayMap;
    }

    public static void a(ViewGroup viewGroup) {
        a.remove(viewGroup);
        ArrayList arrayList = (ArrayList) zod.a().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((zob) arrayList2.get(size)).b(viewGroup);
            }
        }
    }

    public static void a(ViewGroup viewGroup, zob zob) {
        if (!a.contains(viewGroup) && viewGroup.isLaidOut()) {
            a.add(viewGroup);
            if (zob == null) {
                zob = b;
            }
            zob = zob.clone();
            zod.c(viewGroup, zob);
            viewGroup.setTag(R.id.current_scene, null);
            zod.b(viewGroup, zob);
        }
    }

    public static void a(zoa zoa, zob zob) {
        ViewGroup viewGroup = zoa.b;
        if (!a.contains(viewGroup)) {
            if (zob == null) {
                zoa.b();
                return;
            }
            a.add(viewGroup);
            in.a("clone");
            zob = zob.clone();
            in.a();
            in.a("set");
            zob.c(viewGroup);
            in.a();
            zoa a = zoa.a(viewGroup);
            if (a != null) {
                if ((a.a > 0 ? 1 : null) != null) {
                    zob.b(true);
                }
            }
            in.a("change");
            zod.c(viewGroup, zob);
            in.a();
            in.a("enter");
            zoa.b();
            in.a();
            zod.b(viewGroup, zob);
        }
    }

    private static void b(ViewGroup viewGroup, zob zob) {
        if (zob != null && viewGroup != null) {
            a aVar = new a(zob, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void c(ViewGroup viewGroup, zob zob) {
        ArrayList arrayList = (ArrayList) zod.a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zob) it.next()).c((View) viewGroup);
            }
        }
        if (zob != null) {
            zob.a(viewGroup, true);
        }
        zoa a = zoa.a(viewGroup);
        if (a != null) {
            zoa.a(a.b);
        }
    }
}
