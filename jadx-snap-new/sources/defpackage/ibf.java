package defpackage;

import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.snap.fidelius.deps.FideliusHttpInterface;
import defpackage.iby.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: ibf */
public final class ibf implements hyp {
    private final ibb a;
    private final hzx b;
    private final Lock c = this.a.d;
    private final Lock d = this.a.e;
    private final ian e;
    private final ajwy<hyk> f;
    private final hys g;
    private final zfw h;
    private final hyo i;
    private final hym j;
    private final FideliusHttpInterface k;
    private final ajei l;
    private final ajdw m;

    ibf(ajwy<hyk> ajwy, ibb ibb, hys hys, ian ian, hyo hyo, hym hym, FideliusHttpInterface fideliusHttpInterface, ajei ajei) {
        this.a = ibb;
        this.b = ibb.c;
        this.e = ian;
        this.f = ajwy;
        this.g = hys;
        this.h = zgb.a(hyn.a.callsite("FideliusIdentityServiceImpl"));
        this.i = hyo;
        this.j = hym;
        this.k = fideliusHttpInterface;
        this.l = ajei;
        this.m = zfx.a((ajdw) this.h.b(), 1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00b4 in {11, 12, 15, 18, 19, 24, 27} preds:[]
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
    private /* synthetic */ void a() {
        /*
        r5 = this;
        r0 = r5.i;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0095;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r5.j;
        r1 = r1.a();
        r1 = r1.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x004a;
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = r5.c;
        r3.lock();
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x0043 }
        if (r3 != 0) goto L_0x003d;	 Catch:{ all -> 0x0043 }
        r3 = r5.b;	 Catch:{ all -> 0x0043 }
        r3 = r3.c(r2);	 Catch:{ all -> 0x0043 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0043 }
        if (r3 == 0) goto L_0x003d;	 Catch:{ all -> 0x0043 }
        r0.add(r2);	 Catch:{ all -> 0x0043 }
        r2 = r5.c;
        r2.unlock();
        goto L_0x0017;
        r0 = move-exception;
        r1 = r5.c;
        r1.unlock();
        throw r0;
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x008f;
        r1 = new ahqn;
        r1.<init>();
        r1.a = r0;
        r2 = r5.l;
        r3 = defpackage.ajdx.b(r1);
        r4 = r5.h;
        r4 = r4.g();
        r4 = (defpackage.ajdw) r4;
        r3 = r3.a(r4);
        r4 = new -$$Lambda$ibf$sQeDPuoPB566b8Fb-nO6rWnCd70;
        r4.<init>(r5, r1);
        r1 = r3.a(r4);
        r3 = r5.h;
        r3 = r3.b();
        r3 = (defpackage.ajdw) r3;
        r1 = r1.b(r3);
        r3 = new -$$Lambda$ibf$hNkq1LtGRjGPwJD43_kRie4uzLA;
        r3.<init>(r5, r0);
        r4 = new -$$Lambda$ibf$HUXpdMmnpbglSIYgx5dLzFT_9n8;
        r4.<init>(r5, r0);
        r0 = r1.a(r3, r4);
        r2.a(r0);
        r0 = r5.i;
        r1 = 0;
        r0.a(r1);
        r0 = r5.c;
        r0.lock();
        r0 = r5.b;	 Catch:{ all -> 0x00ad }
        r0 = r0.b();	 Catch:{ all -> 0x00ad }
        r0 = defpackage.iac.a(r0);	 Catch:{ all -> 0x00ad }
        r1 = r5.c;
        r1.unlock();
        r5.a(r0);
        return;
        r0 = move-exception;
        r1 = r5.c;
        r1.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibf.a():void");
    }

    private void a(List<ice> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ice ice : list) {
            if (ice.c == null) {
                arrayList.add(ice);
            }
        }
        for (List<ice> list2 : Lists.partition(arrayList, 5)) {
            ArrayList arrayList2 = new ArrayList(list2.size());
            for (ice ice2 : list2) {
                String str = ice2.a;
                byte[] b = abne.b(str);
                if (b != null) {
                    a aVar = new a(str, ice2.b, ice2.d.intValue());
                    aVar.c = b;
                    aVar.b = this.a.a.c;
                    arrayList2.add(aVar.a());
                    ((hyk) this.f.get()).d();
                } else {
                    ((hyk) this.f.get()).f("failure_null_friend_out_beta_bytes");
                }
            }
            hyr a = this.g.a(hyt.FIDELIUS_SECRET_BATCH_GENERATE).a();
            Map c = c(arrayList2);
            int size = arrayList2.size();
            if (c == null || c.size() != size) {
                ((hyk) this.f.get()).a(a, "failure_null_mystique", (long) size, (long) (size - (c == null ? 0 : c.size())));
            } else {
                ((hyk) this.f.get()).a(a, (long) size);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00b8 in {7, 8, 10, 15, 16, 18, 22, 24, 27} preds:[]
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
    private void a(java.util.Map<java.lang.String, defpackage.ahql> r12, java.lang.String r13, long r14) {
        /*
        r11 = this;
        r0 = r11.d;
        r0.lock();
        r0 = r12.entrySet();	 Catch:{ all -> 0x00b1 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00b1 }
        r1 = 0;	 Catch:{ all -> 0x00b1 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x00b1 }
        if (r2 == 0) goto L_0x007d;	 Catch:{ all -> 0x00b1 }
        r2 = r0.next();	 Catch:{ all -> 0x00b1 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x00b1 }
        r3 = r2.getKey();	 Catch:{ all -> 0x00b1 }
        r6 = r3;	 Catch:{ all -> 0x00b1 }
        r6 = (java.lang.String) r6;	 Catch:{ all -> 0x00b1 }
        r2 = r2.getValue();	 Catch:{ all -> 0x00b1 }
        r2 = (defpackage.ahql) r2;	 Catch:{ all -> 0x00b1 }
        r3 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x00b1 }
        if (r3 == 0) goto L_0x003b;	 Catch:{ all -> 0x00b1 }
        r2 = r11.f;	 Catch:{ all -> 0x00b1 }
        r2 = r2.get();	 Catch:{ all -> 0x00b1 }
        r2 = (defpackage.hyk) r2;	 Catch:{ all -> 0x00b1 }
        r3 = "failure_empty_friend_user_id";	 Catch:{ all -> 0x00b1 }
        r2.g(r3);	 Catch:{ all -> 0x00b1 }
        goto L_0x000e;	 Catch:{ all -> 0x00b1 }
        if (r2 != 0) goto L_0x0048;	 Catch:{ all -> 0x00b1 }
        r2 = r11.f;	 Catch:{ all -> 0x00b1 }
        r2 = r2.get();	 Catch:{ all -> 0x00b1 }
        r2 = (defpackage.hyk) r2;	 Catch:{ all -> 0x00b1 }
        r3 = "failure_empty_friend_fid_info";	 Catch:{ all -> 0x00b1 }
        goto L_0x0037;	 Catch:{ all -> 0x00b1 }
        r2 = r2.a;	 Catch:{ all -> 0x00b1 }
        if (r2 == 0) goto L_0x0072;	 Catch:{ all -> 0x00b1 }
        r3 = r2.isEmpty();	 Catch:{ all -> 0x00b1 }
        if (r3 == 0) goto L_0x0053;	 Catch:{ all -> 0x00b1 }
        goto L_0x0072;	 Catch:{ all -> 0x00b1 }
        r3 = new ica;	 Catch:{ all -> 0x00b1 }
        r5 = r11.b;	 Catch:{ all -> 0x00b1 }
        r4 = r11.b;	 Catch:{ all -> 0x00b1 }
        r4 = r4.c(r6);	 Catch:{ all -> 0x00b1 }
        r7 = defpackage.iac.a(r4);	 Catch:{ all -> 0x00b1 }
        r9 = r11.f;	 Catch:{ all -> 0x00b1 }
        r10 = 0;	 Catch:{ all -> 0x00b1 }
        r4 = r3;	 Catch:{ all -> 0x00b1 }
        r8 = r2;	 Catch:{ all -> 0x00b1 }
        r4.<init>(r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x00b1 }
        r3.a();	 Catch:{ all -> 0x00b1 }
        r2 = r2.size();	 Catch:{ all -> 0x00b1 }
        r1 = r1 + r2;	 Catch:{ all -> 0x00b1 }
        goto L_0x000e;	 Catch:{ all -> 0x00b1 }
        r2 = r11.f;	 Catch:{ all -> 0x00b1 }
        r2 = r2.get();	 Catch:{ all -> 0x00b1 }
        r2 = (defpackage.hyk) r2;	 Catch:{ all -> 0x00b1 }
        r3 = "failure_empty_friend_fid_devices";	 Catch:{ all -> 0x00b1 }
        goto L_0x0037;
        r0 = r11.d;
        r0.unlock();
        r2 = 0;
        r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x009c;
        r14 = r11.f;
        r14 = r14.get();
        r2 = r14;
        r2 = (defpackage.hyk) r2;
        r12 = r12.size();
        r4 = (long) r12;
        r6 = (long) r1;
        r3 = r13;
        r2.a(r3, r4, r6);
        return;
        r0 = r11.f;
        r0 = r0.get();
        r2 = r0;
        r2 = (defpackage.hyk) r2;
        r12 = r12.size();
        r6 = (long) r12;
        r8 = (long) r1;
        r3 = r13;
        r4 = r14;
        r2.a(r3, r4, r6, r8);
        return;
        r12 = move-exception;
        r13 = r11.d;
        r13.unlock();
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibf.a(java.util.Map, java.lang.String, long):void");
    }

    private Map<String, ahql> b(List<aelf> list) {
        HashMap newHashMap = Maps.newHashMap();
        for (aelf aelf : list) {
            if (aelf.c == null || aelf.c.intValue() != aelf.a.FRIEND.a()) {
                this.b.e(aelf.b);
            } else {
                String str = aelf.b;
                ahql ahql = aelf.J;
                if (!(ahql == null || TextUtils.isEmpty(str))) {
                    newHashMap.put(str, ahql);
                }
            }
        }
        return newHashMap;
    }

    private void b(List<aelf> list, String str) {
        a(b((List) list), str);
    }

    private Map<String, byte[]> c(List<iby.a> list) {
        this.d.lock();
        try {
            Map<String, byte[]> a = new iby(list, this.b, this.f, this.g, this.e).a();
            return a;
        } finally {
            this.d.unlock();
        }
    }

    private /* synthetic */ void c(List list, String str) {
        b(list, str);
    }

    public final void a(aelf aelf) {
        String str = aelf.b;
        if (TextUtils.isEmpty(str)) {
            ((hyk) this.f.get()).l("friend_add");
        } else {
            this.h.f().a(new -$$Lambda$ibf$irel4rcdkV9VexGP-FHk5YHef8w(this, aelf, str));
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((hyk) this.f.get()).l("friend_remove_or_block");
        } else {
            this.h.f().a(new -$$Lambda$ibf$Jz-EVkN92eRVn15WmHJbkFV4il8(this, str));
        }
    }

    public final void a(List<aelf> list, String str) {
        if (list != null) {
            this.h.f().a(new -$$Lambda$ibf$saFKEE5r90DKZH_2FSOecaVwbLw(this, list, str));
        }
    }

    public final void a(Map<String, ahql> map, String str) {
        if (!map.isEmpty()) {
            a(map, str, 0);
        }
        this.m.a(new -$$Lambda$ibf$UgKqXCdQ9jCE5SYcJmyyMwUeBe4(this));
    }
}
