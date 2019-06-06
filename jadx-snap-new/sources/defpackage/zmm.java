package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.LruCache;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.mh.a;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zmm */
final class zmm extends Adapter<zmt> implements zml {
    final LinkedHashMap<zmb, znh<zmy>> a;
    int b;
    final c c;
    final Handler d;
    final LinkedList<a> e;
    final AtomicBoolean f;
    final Runnable g;
    private final zms h;
    private final zke i;
    private final zmn j;
    private final ajwo<zkd> k;

    /* renamed from: zmm$c */
    class c extends LruCache<Integer, b> {
        private zms a;
        private AtomicReference<b> b = new AtomicReference();

        c(zms zms) {
            super(50);
            this.a = zms;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0082 in {2, 8, 9, 10, 13, 15} preds:[]
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
        protected final /* synthetic */ java.lang.Object create(java.lang.Object r10) {
            /*
            r9 = this;
            r10 = (java.lang.Integer) r10;
            r0 = r9.b;
            r1 = 0;
            r0 = r0.getAndSet(r1);
            r0 = (defpackage.zmm.b) r0;
            if (r0 != 0) goto L_0x0012;
            r0 = new zmm$b;
            r0.<init>();
            r10 = r10.intValue();
            r2 = defpackage.zmm.this;
            r2 = r2.a;
            r2 = r2.entrySet();
            r2 = r2.iterator();
            r3 = 0;
            r4 = 0;
            r5 = r2.hasNext();
            if (r5 == 0) goto L_0x0054;
            r5 = r2.next();
            r5 = (java.util.Map.Entry) r5;
            r6 = r10 - r3;
            r7 = r5.getValue();
            r7 = (defpackage.znh) r7;
            r8 = r7.a();
            if (r6 >= r8) goto L_0x004c;
            r10 = r5.getKey();
            r1 = r10;
            r1 = (defpackage.zmb) r1;
            r10 = r7.a(r6);
            r10 = (defpackage.zmy) r10;
            goto L_0x0055;
            r5 = r7.a();
            r3 = r3 + r5;
            r4 = r4 + 1;
            goto L_0x0024;
            r10 = r1;
            if (r10 == 0) goto L_0x007c;
            r0.b = r10;
            r2 = r9.a;
            r10 = r10.getType();
            r10 = r2.getViewTypeId(r10);
            r0.a = r10;
            r0.c = r1;
            r10 = r0.b;
            r1 = r0.a;
            r2 = r10.getId();
            r4 = (long) r4;
            r10 = 40;
            r4 = r4 << r10;
            r2 = r2 ^ r4;
            r4 = (long) r1;
            r10 = 52;
            r4 = r4 << r10;
            r2 = r2 ^ r4;
            r0.d = r2;
            return r0;
            r10 = new java.lang.IllegalStateException;
            r10.<init>();
            throw r10;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zmm$c.create(java.lang.Object):java.lang.Object");
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            this.b.set((b) obj2);
        }
    }

    /* renamed from: zmm$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            long nanoTime = System.nanoTime();
            while (true) {
                a aVar = (a) zmm.this.e.poll();
                if (aVar == null) {
                    break;
                }
                zmt zmt = aVar.a;
                if (!aVar.d) {
                    int adapterPosition = zmt.getAdapterPosition();
                    if (adapterPosition != -1) {
                        zmm.this.onBindViewHolder(zmt, adapterPosition);
                        long nanoTime2 = System.nanoTime();
                        if (aVar.b) {
                            zmt.itemView.setVisibility(0);
                            if (TimeUnit.MILLISECONDS.convert(nanoTime2 - aVar.c, TimeUnit.NANOSECONDS) > 150) {
                                zmt.itemView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                                zmt.itemView.animate().alpha(1.0f).withLayer().setDuration(100);
                            }
                        }
                        if (TimeUnit.MILLISECONDS.convert(nanoTime2 - nanoTime, TimeUnit.NANOSECONDS) > 12) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (zmm.this.e.isEmpty()) {
                zmm.this.f.set(false);
            } else {
                zmm.this.d.post(zmm.this.g);
            }
        }
    }

    /* renamed from: zmm$d */
    static class d extends a {
        private final znh<zmy> a;
        private final znh<zmy> b;
        private final int c;
        private final int d;
        private final int e;
        private final int f = this.a.a();
        private final int g = this.b.a();

        d(int i, znh<zmy> znh, znh<zmy> znh2, int i2, int i3) {
            this.c = i;
            this.a = znh;
            this.b = znh2;
            this.d = i2;
            this.e = i3;
        }

        private boolean c(int i, int i2) {
            int i3 = this.c;
            return i >= i3 && i < this.f + i3 && i2 >= i3 && i2 < i3 + this.g;
        }

        public final int a() {
            return this.d;
        }

        public final Object a(int i) {
            return this.a.a(i - this.c);
        }

        public final boolean a(int i, int i2) {
            if (c(i, i2)) {
                return ((zmy) this.a.a(i - this.c)).areItemsTheSame((zmy) this.b.a(i2 - this.c));
            }
            int i3 = this.c;
            if (i < i3) {
                return i == i2;
            } else {
                int i4 = this.f;
                return i >= i3 + i4 && i2 == (i - i4) + this.g;
            }
        }

        public final int b() {
            return this.e;
        }

        public final boolean b(int i, int i2) {
            return !c(i, i2) ? true : ((zmy) this.a.a(i - this.c)).areContentsTheSame((zmy) this.b.a(i2 - this.c));
        }
    }

    /* renamed from: zmm$b */
    static class b {
        int a;
        zmy b;
        zmb c;
        long d;

        b() {
        }
    }

    /* renamed from: zmm$a */
    static class a {
        final zmt<?> a;
        final boolean b;
        final long c;
        boolean d;
    }

    private zmm(zms zms, zke zke, zmn zmn) {
        this.a = new LinkedHashMap();
        this.d = new Handler(Looper.getMainLooper());
        this.e = new LinkedList();
        this.k = new ajwo();
        this.f = new AtomicBoolean(false);
        this.g = new 1();
        this.h = zms;
        this.i = zke;
        this.j = zmn;
        this.c = new c(zms);
        setHasStableIds(true);
    }

    public zmm(zms zms, zke zke, zmn zmn, List<? extends zmb> list) {
        this(zms, zke, null);
        for (zmb put : list) {
            this.a.put(put, znk.a);
        }
        this.b = a();
        a(0, znk.a, znk.a, 0, this.b);
    }

    private zmt a(ViewGroup viewGroup, int i) {
        try {
            viewGroup = this.h.createViewHolder(viewGroup.getContext(), i, viewGroup);
            return viewGroup;
        } catch (Exception e) {
            zmn zmn = this.j;
            if (zmn != null) {
                viewGroup.getContext();
                return zmn.d();
            }
            throw e;
        }
    }

    private boolean a(zmt zmt) {
        try {
            return zmt.b();
        } catch (Exception e) {
            if (this.j != null) {
                return true;
            }
            throw e;
        }
    }

    private b c(int i) {
        return (b) this.c.get(Integer.valueOf(i));
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        int i = 0;
        for (znh a : this.a.values()) {
            i += a.a();
        }
        return i;
    }

    public final zmy a(int i) {
        try {
            return c(i).b;
        } catch (Exception e) {
            if (this.j != null) {
                zmo zmo = new zmo(i);
                return this.j.c();
            }
            throw e;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, znh<zmy> znh, znh<zmy> znh2, int i2, int i3) {
        mh.a(new d(i, znh, znh2, i2, i3), false).a((Adapter) this);
    }

    /* Access modifiers changed, original: final */
    public final void a(zmb zmb, znh<zmy> znh) {
        Object obj = null;
        int i = 0;
        for (Entry entry : this.a.entrySet()) {
            if (zmb == entry.getKey()) {
                obj = 1;
                break;
            }
            i += ((znh) entry.getValue()).a();
        }
        int i2 = this.b;
        znh znh2 = (znh) this.a.put(zmb, znh);
        this.b = a();
        if (obj != null) {
            this.c.evictAll();
        }
        if (znh2 == null) {
            znh2 = znk.a;
        }
        a(i, znh2, znh, i2, this.b);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: a */
    public final void onBindViewHolder(zmt zmt, int i) {
        try {
            b c = c(i);
            zmt.a(c.b, this.i, c.c);
        } catch (Exception e) {
            if (this.j != null) {
                zmo zmo = new zmo(i);
                return;
            }
            throw e;
        }
    }

    public final zlv b(int i) {
        try {
            i = c(i).b.getType();
            return i;
        } catch (Exception e) {
            if (this.j != null) {
                zmo zmo = new zmo(i);
                return this.j.b();
            }
            throw e;
        }
    }

    public final int getItemCount() {
        return this.b;
    }

    public final long getItemId(int i) {
        try {
            return c(i).d;
        } catch (Exception e) {
            if (this.j != null) {
                zmo zmo = new zmo(i);
                return this.j.e();
            }
            throw e;
        }
    }

    public final int getItemViewType(int i) {
        try {
            return c(i).a;
        } catch (Exception e) {
            if (this.j != null) {
                zmo zmo = new zmo(i);
                return this.j.a();
            }
            throw e;
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.k.a(new zkd(1, recyclerView));
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.k.a(new zkd(2, recyclerView));
    }

    public final /* synthetic */ boolean onFailedToRecycleView(ViewHolder viewHolder) {
        return a((zmt) viewHolder);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0027 in {8, 10, 14, 15} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final /* synthetic */ void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder r4) {
        /*
        r3 = this;
        r4 = (defpackage.zmt) r4;
        r0 = r3.e;	 Catch:{ Exception -> 0x0020 }
        r0 = r0.iterator();	 Catch:{ Exception -> 0x0020 }
        r1 = r0.hasNext();	 Catch:{ Exception -> 0x0020 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ Exception -> 0x0020 }
        r1 = r0.next();	 Catch:{ Exception -> 0x0020 }
        r1 = (defpackage.zmm.a) r1;	 Catch:{ Exception -> 0x0020 }
        r2 = r1.a;	 Catch:{ Exception -> 0x0020 }
        if (r2 != r4) goto L_0x0008;	 Catch:{ Exception -> 0x0020 }
        r4 = 1;	 Catch:{ Exception -> 0x0020 }
        r1.d = r4;	 Catch:{ Exception -> 0x0020 }
        return;	 Catch:{ Exception -> 0x0020 }
        r4.a();	 Catch:{ Exception -> 0x0020 }
        return;
        r4 = move-exception;
        r0 = r3.j;
        if (r0 == 0) goto L_0x0026;
        return;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmm.onViewRecycled(android.support.v7.widget.RecyclerView$ViewHolder):void");
    }
}
