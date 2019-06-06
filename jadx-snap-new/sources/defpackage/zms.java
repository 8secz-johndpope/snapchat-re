package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.support.v7.widget.RecyclerView.RecycledViewPool;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: zms */
public class zms {
    public static final int DEFAULT_CONTAINER = 0;
    private static final String TAG = "ViewFactory";
    private final zlx mBindingContext;
    private WeakReference<LayoutInflater> mLayoutInflaterRef;
    private final RecycledViewPool mRecycledViewPool;
    private zmw mViewHolderPrefetcher;
    private zmx mViewPrefetcher;
    private final List<Class<? extends zlv>> mViewTypeClasses;
    private final List<zlv[]> mViewTypeValues;

    /* renamed from: zms$a */
    static class a implements zlx {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public zms(Class<? extends zlv> cls) {
        this(new a(), Collections.singleton(cls));
    }

    public zms(Collection<Class<? extends zlv>> collection) {
        this(new a(), (Collection) collection);
    }

    public zms(zlx zlx, Class<? extends zlv> cls) {
        this(zlx, Collections.singleton(cls));
    }

    public zms(zlx zlx, Collection<Class<? extends zlv>> collection) {
        this.mViewTypeValues = new ArrayList();
        this.mViewTypeClasses = new ArrayList();
        this.mLayoutInflaterRef = new WeakReference(null);
        this.mRecycledViewPool = new RecycledViewPool();
        this.mBindingContext = zlx;
        setAvailableViewTypes(collection);
    }

    private void addAdapterViewTypes(Class<? extends zlv> cls) {
        this.mViewTypeValues.add((zlv[]) cls.getEnumConstants());
        this.mViewTypeClasses.add(cls);
    }

    public static View createView(Context context, zlv zlv, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int layoutId = zlv.getLayoutId();
        if (layoutId == 0) {
            return new FrameLayout(context);
        }
        try {
            return layoutInflater.inflate(layoutId, viewGroup, false);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to create view for type: ");
            stringBuilder.append(zlv);
            stringBuilder.append(" On Layout ");
            stringBuilder.append(layoutId);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public static zmt createViewHolderForType(zms zms, zlv zlv, View view) {
        if (!(zlv instanceof zlw)) {
            return new zmt(view);
        }
        try {
            Class viewBindingClass = ((zlw) zlv).getViewBindingClass();
            if (viewBindingClass == null) {
                return new zmt(view);
            }
            if (zly.class.isAssignableFrom(viewBindingClass)) {
                zly zly = (zly) viewBindingClass.newInstance();
                zly.a(zms.mBindingContext, zms, view);
                return new zmq(view, zly);
            }
            zmd zmd = (zmd) viewBindingClass.newInstance();
            zmd.create(view);
            return new zmq(view, zmd);
        } catch (Exception e) {
            throw new RuntimeException("View hierarchy: ".concat(String.valueOf(zms.getViewHierarchy(view))), e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0036 in {5, 6, 8} preds:[]
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
    private defpackage.zlv getAdapterViewType(int r6) {
        /*
        r5 = this;
        r0 = r5.mViewTypeClasses;
        r0 = r0.size();
        r1 = 0;
        r2 = 0;
        if (r1 >= r0) goto L_0x0026;
        r3 = r5.mViewTypeValues;
        r3 = r3.get(r1);
        r3 = (defpackage.zlv[]) r3;
        r3 = r3.length;
        r4 = r6 - r2;
        if (r4 >= r3) goto L_0x0022;
        r6 = r5.mViewTypeValues;
        r6 = r6.get(r1);
        r6 = (defpackage.zlv[]) r6;
        r6 = r6[r4];
        return r6;
        r2 = r2 + r3;
        r1 = r1 + 1;
        goto L_0x0008;
        r0 = new java.lang.IllegalStateException;
        r6 = java.lang.String.valueOf(r6);
        r1 = "Invalid viewType index ";
        r6 = r1.concat(r6);
        r0.<init>(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zms.getAdapterViewType(int):zlv");
    }

    private LayoutInflater getLayoutInflater(Context context) {
        if (this.mLayoutInflaterRef.get() == null) {
            this.mLayoutInflaterRef = new WeakReference(LayoutInflater.from(context));
        }
        return (LayoutInflater) this.mLayoutInflaterRef.get();
    }

    private static String getViewHierarchy(View view) {
        StringBuilder stringBuilder = new StringBuilder();
        zms.getViewHierarchy(view, stringBuilder, 0);
        return stringBuilder.toString();
    }

    private static void getViewHierarchy(View view, StringBuilder stringBuilder, int i) {
        stringBuilder.append(zms.getViewMessage(view, i));
        if (view instanceof ViewGroup) {
            i++;
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                zms.getViewHierarchy(viewGroup.getChildAt(i2), stringBuilder, i);
            }
        }
    }

    private static String getViewMessage(View view, int i) {
        String replace = new String(new char[i]).replace("\u0000", "  ");
        try {
            String resourceName = view.getResources() != null ? view.getId() > 0 ? view.getResources().getResourceName(view.getId()) : "no_id" : "no_resources";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(replace);
            stringBuilder.append('[');
            stringBuilder.append(view.getClass().getSimpleName());
            stringBuilder.append("] ");
            stringBuilder.append(resourceName);
            stringBuilder.append(10);
            return stringBuilder.toString();
        } catch (NotFoundException unused) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(replace);
            stringBuilder2.append('[');
            stringBuilder2.append(view.getClass().getSimpleName());
            stringBuilder2.append("] name_not_found\n");
            return stringBuilder2.toString();
        }
    }

    public zmt createViewHolder(Context context, int i, ViewGroup viewGroup) {
        zlv adapterViewType = getAdapterViewType(i);
        "RC:create: ".concat(String.valueOf(adapterViewType));
        if (this.mViewHolderPrefetcher != null) {
            zmt a = this.mViewHolderPrefetcher.a(adapterViewType);
            if (a != null) {
                return a;
            }
        }
        return zms.createViewHolderForType(this, adapterViewType, getOrCreateView(context, adapterViewType, viewGroup));
    }

    public View getOrCreateView(Context context, zlv zlv, ViewGroup viewGroup) {
        int layoutId = zlv.getLayoutId();
        zmx zmx = this.mViewPrefetcher;
        if (zmx != null) {
            View a = zmx.a(layoutId);
            if (a != null) {
                return a;
            }
        }
        return zms.createView(context, zlv, viewGroup, getLayoutInflater(context));
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycledViewPool;
    }

    public zmw getViewHolderPrefetcher() {
        return this.mViewHolderPrefetcher;
    }

    public zmx getViewPrefetcher() {
        return this.mViewPrefetcher;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x005a in {8, 9, 10, 11, 13} preds:[]
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
    public int getViewTypeId(defpackage.zlv r9) {
        /*
        r8 = this;
        r0 = r8.mViewTypeClasses;
        r0 = r0.size();
        r1 = 0;
        r2 = 0;
        r3 = 0;
        if (r2 >= r0) goto L_0x0042;
        r4 = r8.mViewTypeClasses;
        r4 = r4.get(r2);
        r4 = (java.lang.Class) r4;
        r5 = r9.getClass();
        r4 = r5.isAssignableFrom(r4);
        if (r4 == 0) goto L_0x0035;
        r4 = r8.mViewTypeValues;
        r4 = r4.get(r2);
        r4 = (defpackage.zlv[]) r4;
        r5 = r4.length;
        r6 = r3;
        r3 = 0;
        if (r3 >= r5) goto L_0x0034;
        r7 = r4[r3];
        if (r9 != r7) goto L_0x002f;
        return r6;
        r6 = r6 + 1;
        r3 = r3 + 1;
        goto L_0x0028;
        r3 = r6;
        r4 = r8.mViewTypeValues;
        r4 = r4.get(r2);
        r4 = (defpackage.zlv[]) r4;
        r4 = r4.length;
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L_0x0009;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "AdapterViewType not registered: ";
        r1.<init>(r2);
        r9 = r9.getClass();
        r1.append(r9);
        r9 = r1.toString();
        r0.<init>(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zms.getViewTypeId(zlv):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0032 in {8, 10, 13, 16} preds:[]
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
    synchronized void setAvailableViewTypes(java.util.Collection<java.lang.Class<? extends defpackage.zlv>> r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r2.isEmpty();	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x0027;	 Catch:{ all -> 0x002f }
        r0 = r1.mViewTypeValues;	 Catch:{ all -> 0x002f }
        r0.clear();	 Catch:{ all -> 0x002f }
        r0 = r1.mViewTypeClasses;	 Catch:{ all -> 0x002f }
        r0.clear();	 Catch:{ all -> 0x002f }
        r2 = r2.iterator();	 Catch:{ all -> 0x002f }
        r0 = r2.hasNext();	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x002f }
        r0 = r2.next();	 Catch:{ all -> 0x002f }
        r0 = (java.lang.Class) r0;	 Catch:{ all -> 0x002f }
        r1.addAdapterViewTypes(r0);	 Catch:{ all -> 0x002f }
        goto L_0x0015;
        monitor-exit(r1);
        return;
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x002f }
        r0 = "viewTypes must not be empty";	 Catch:{ all -> 0x002f }
        r2.<init>(r0);	 Catch:{ all -> 0x002f }
        throw r2;	 Catch:{ all -> 0x002f }
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zms.setAvailableViewTypes(java.util.Collection):void");
    }

    public void setViewHolderPrefetcher(zmw zmw) {
        this.mViewHolderPrefetcher = zmw;
    }

    public void setViewPrefetcher(zmx zmx) {
        this.mViewPrefetcher = zmx;
    }
}
