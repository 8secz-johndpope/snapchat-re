package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.snap.core.db.record.PublisherSnapPageModel;
import com.snapchat.android.R;
import defpackage.acix.a;
import defpackage.acix.b;

/* renamed from: aciv */
public final class aciv<T extends achg, C extends achd<T, C>> {
    public final int a;
    final acix b = new acix();
    public final C c;
    public final ViewGroup d;
    public acit e;

    /* renamed from: aciv$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        static {
            /*
            r0 = defpackage.acix.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.acix.a.ON_ADDED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.acix.a.ON_STACKED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.acix.a.ON_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.acix.a.ON_PARTIALLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = defpackage.acix.a.ON_VISIBLE_FROM_PARTIALLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = defpackage.acix.a.ON_PARTIALLY_HIDDEN;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = defpackage.acix.a.ON_HIDDEN_FROM_PARTIALLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = defpackage.acix.a.ON_HIDDEN;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = defpackage.acix.a.ON_UNSTACKED;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = defpackage.acix.a.ON_REMOVED;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r2 = 10;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aciv$1.<clinit>():void");
        }
    }

    public aciv(int i, C c, ViewGroup viewGroup) {
        if (i < 0) {
            i = View.generateViewId();
        }
        this.a = i;
        this.c = c;
        this.d = viewGroup;
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 != null) {
            viewGroup2.setTag(R.id.page_type, this.c.getDeckPageType());
            this.d.setTag(R.id.page_id, Integer.valueOf(this.a));
        }
    }

    public static <PT extends achg, PC extends achd<PT, PC>> aciv<PT, PC> a(achc<PT, PC> achc, PT pt) {
        aciv aciv = new aciv(-1, achc.b(pt), null);
        aciv.a(b.ADDED, null);
        return aciv;
    }

    public final b a() {
        return this.b.a;
    }

    /* Access modifiers changed, original: final */
    public final void a(achi<T, C> achi) {
        if (achi.l) {
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
        this.c.onPageNavigate(achi);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00a8 in {9, 11, 13, 15, 17, 19, 21, 23, 24, 26} preds:[]
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
    public final void a(defpackage.acix.b r9, defpackage.achi<T, C> r10) {
        /*
        r8 = this;
        r0 = r8.b;
        r1 = new -$$Lambda$aciv$tBqHMJ2PwfjekEr95UFSQuh7tso;
        r1.<init>(r10);
        r2 = defpackage.acix.a.values();
        r3 = r2.length;
        r4 = 0;
        if (r4 >= r3) goto L_0x006f;
        r5 = r2[r4];
        r6 = r5.mStart;
        r7 = r0.a;
        if (r6 != r7) goto L_0x006c;
        r6 = r5.mEnd;
        if (r6 != r9) goto L_0x006c;
        r0.a = r9;
        r9 = defpackage.aciv.1.a;
        r0 = r5.ordinal();
        r9 = r9[r0];
        switch(r9) {
            case 1: goto L_0x0066;
            case 2: goto L_0x0060;
            case 3: goto L_0x0054;
            case 4: goto L_0x0048;
            case 5: goto L_0x0048;
            case 6: goto L_0x0048;
            case 7: goto L_0x0048;
            case 8: goto L_0x003c;
            case 9: goto L_0x0036;
            case 10: goto L_0x0030;
            default: goto L_0x0028;
        };
        r9 = new java.lang.IllegalStateException;
        r10 = "unexpected state transition";
        r9.<init>(r10);
        throw r9;
        r9 = r8.c;
        r9.onPageRemoved();
        return;
        r9 = r8.c;
        r9.onPageUnstacked();
        return;
        r9 = r8.c;
        r10 = com.google.common.base.Preconditions.checkNotNull(r10);
        r10 = (defpackage.achi) r10;
        r9.onPageHidden(r10);
        return;
        r9 = r8.c;
        r10 = com.google.common.base.Preconditions.checkNotNull(r10);
        r10 = (defpackage.achi) r10;
        r9.onPagePartialVisibilityChanged(r10, r5);
        return;
        r9 = r8.c;
        r10 = com.google.common.base.Preconditions.checkNotNull(r10);
        r10 = (defpackage.achi) r10;
        r9.onPageVisible(r10);
        return;
        r9 = r8.c;
        r9.onPageStacked();
        return;
        r9 = r8.c;
        r9.onPageAdded();
        return;
        r4 = r4 + 1;
        goto L_0x000d;
        r10 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r3 = "Invalid PageState transition from ";
        r2.<init>(r3);
        r0 = r0.a;
        r0 = r0.name();
        r2.append(r0);
        r0 = " to ";
        r2.append(r0);
        r9 = r9.name();
        r2.append(r9);
        r9 = 32;
        r2.append(r9);
        r9 = new java.lang.Object;
        r9.<init>();
        r9 = r1.apply(r9);
        r9 = (java.lang.String) r9;
        r2.append(r9);
        r9 = r2.toString();
        r10.<init>(r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aciv.a(acix$b, achi):void");
    }

    public final ViewGroup b() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final void b(achi<T, C> achi) {
        this.c.onPageNavigateUnsuccessful(achi);
    }

    public final View c() {
        return this.e.getContentView();
    }

    public final C d() {
        return this.c;
    }

    public final T e() {
        return this.c.getDeckPageType();
    }

    public final int f() {
        return this.a;
    }

    public final String toString() {
        akmf a = new akmf(this).a("pageType", e());
        int i = this.a;
        akmg akmg = a.d;
        StringBuffer stringBuffer = a.b;
        akmg.a(stringBuffer, PublisherSnapPageModel.PAGEID);
        stringBuffer.append(i);
        akmg.b(stringBuffer);
        return a.a("pageState", this.b.a).a("isPlaceholderPage", this.d == null).toString();
    }
}
