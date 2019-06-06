package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acny */
public final class acny extends Adapter<ViewHolder> {
    final ajwo<Optional<? extends acop>> a = new ajwo();
    private final Object b = new Object();
    private final Context c;
    private final LayoutInflater d;
    private final acnk e;
    private final acpv f;
    private acnn g;
    private List<acov> h;
    private acow i;
    private boolean j;
    private List<String> k;

    public acny(Context context, LayoutInflater layoutInflater, acpv acpv, acnk acnk) {
        this.c = context;
        this.d = layoutInflater;
        this.f = acpv;
        this.e = acnk;
        setHasStableIds(true);
    }

    private boolean d() {
        boolean z;
        synchronized (this.b) {
            int size = this.h.size();
            z = true;
            if (size - this.j <= 1 || size > 32) {
                z = false;
            }
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x003a in {12, 15, 18} preds:[]
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
    private boolean e() {
        /*
        r5 = this;
        r0 = r5.b;
        monitor-enter(r0);
        r1 = r5.h;	 Catch:{ all -> 0x0037 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0037 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0034;	 Catch:{ all -> 0x0037 }
        r2 = r1.next();	 Catch:{ all -> 0x0037 }
        r2 = (defpackage.acov) r2;	 Catch:{ all -> 0x0037 }
        r3 = r2.a;	 Catch:{ all -> 0x0037 }
        r4 = r5.e;	 Catch:{ all -> 0x0037 }
        r4 = r4.c;	 Catch:{ all -> 0x0037 }
        r4 = r4.b();	 Catch:{ all -> 0x0037 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0037 }
        if (r3 != 0) goto L_0x0009;	 Catch:{ all -> 0x0037 }
        r3 = r5.f;	 Catch:{ all -> 0x0037 }
        r2 = r2.a;	 Catch:{ all -> 0x0037 }
        r2 = r3.f(r2);	 Catch:{ all -> 0x0037 }
        r2 = r2.a;	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0009;	 Catch:{ all -> 0x0037 }
        r1 = 1;	 Catch:{ all -> 0x0037 }
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return r1;	 Catch:{ all -> 0x0037 }
        r1 = 0;	 Catch:{ all -> 0x0037 }
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return r1;	 Catch:{ all -> 0x0037 }
        r1 = move-exception;	 Catch:{ all -> 0x0037 }
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acny.e():boolean");
    }

    public final List<acov> a() {
        List list;
        synchronized (this.b) {
            list = this.h;
        }
        return list;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0066 in {8, 18, 22, 24, 28} preds:[]
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
    public final void a(defpackage.acow r5) {
        /*
        r4 = this;
        r0 = r4.b;
        monitor-enter(r0);
        r4.i = r5;	 Catch:{ all -> 0x0063 }
        r5 = r5.a();	 Catch:{ all -> 0x0063 }
        r4.h = r5;	 Catch:{ all -> 0x0063 }
        r5 = 0;	 Catch:{ all -> 0x0063 }
        r4.j = r5;	 Catch:{ all -> 0x0063 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0063 }
        r1 = r4.h;	 Catch:{ all -> 0x0063 }
        r1 = r1.size();	 Catch:{ all -> 0x0063 }
        r5.<init>(r1);	 Catch:{ all -> 0x0063 }
        r1 = r4.h;	 Catch:{ all -> 0x0063 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0063 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0063 }
        if (r2 == 0) goto L_0x003a;	 Catch:{ all -> 0x0063 }
        r2 = r1.next();	 Catch:{ all -> 0x0063 }
        r2 = (defpackage.acov) r2;	 Catch:{ all -> 0x0063 }
        r3 = r2.a;	 Catch:{ all -> 0x0063 }
        r5.add(r3);	 Catch:{ all -> 0x0063 }
        r2 = r2.b();	 Catch:{ all -> 0x0063 }
        if (r2 == 0) goto L_0x001f;	 Catch:{ all -> 0x0063 }
        r2 = 1;	 Catch:{ all -> 0x0063 }
        r4.j = r2;	 Catch:{ all -> 0x0063 }
        goto L_0x001f;	 Catch:{ all -> 0x0063 }
        r4.k = r5;	 Catch:{ all -> 0x0063 }
        monitor-exit(r0);	 Catch:{ all -> 0x0063 }
        r5 = r4.g;
        if (r5 == 0) goto L_0x005f;
        r5 = r4.b;
        monitor-enter(r5);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x005c }
        r1 = r4.k;	 Catch:{ all -> 0x005c }
        r0.<init>(r1);	 Catch:{ all -> 0x005c }
        r1 = r4.j;	 Catch:{ all -> 0x005c }
        monitor-exit(r5);	 Catch:{ all -> 0x005c }
        r5 = r4.g;
        r2 = r4.c;
        r2 = r2.getResources();
        r3 = r4.e;
        r5.a(r2, r0, r1, r3);
        goto L_0x005f;
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x005c }
        throw r0;
        r4.notifyDataSetChanged();
        return;
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0063 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acny.a(acow):void");
    }

    public final acow b() {
        acow acow;
        synchronized (this.b) {
            acow = this.i;
        }
        return acow;
    }

    public final int c() {
        Resources resources;
        int i;
        if (e()) {
            resources = this.c.getResources();
            i = R.dimen.map_carousel_card_height_with_explore;
        } else {
            resources = this.c.getResources();
            i = R.dimen.map_carousel_card_height;
        }
        return resources.getDimensionPixelSize(i);
    }

    public final int getItemCount() {
        int size;
        synchronized (this.b) {
            size = this.h.size() + (d() ? 1 : 0);
        }
        return size;
    }

    public final long getItemId(int i) {
        synchronized (this.b) {
            if (i < this.h.size()) {
                long hashCode = (long) ((acov) this.h.get(i)).hashCode();
                return hashCode;
            }
            return -1;
        }
    }

    public final int getItemViewType(int i) {
        return (d() && i == getItemCount() - 1) ? 1 : 0;
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (viewHolder instanceof acoe) {
            synchronized (this.b) {
                acov acov = (acov) this.h.get(i);
                ((acoe) viewHolder).a(acov.d, acov.e, null);
            }
            return;
        }
        if (viewHolder instanceof acnn) {
            ArrayList arrayList;
            boolean z;
            this.g = (acnn) viewHolder;
            synchronized (this.b) {
                arrayList = new ArrayList(this.k);
                z = this.j;
            }
            this.g.a(this.c.getResources(), arrayList, z, this.e);
        }
    }

    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new acnn(this.d.inflate(R.layout.create_group_button, viewGroup, false), this.e.b);
        }
        if (i == 0) {
            View inflate = this.d.inflate(R.layout.carousel_user_item, viewGroup, false);
            this.e.e.a(this.d, inflate);
            acof acof = new acof(inflate, this.f, this.e, true);
            acof.a(this.a);
            return acof;
        }
        StringBuilder stringBuilder = new StringBuilder("ViewType ");
        stringBuilder.append(i);
        stringBuilder.append(" is not supported by this adapter");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
