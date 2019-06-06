package defpackage;

import android.preference.PreferenceManager;
import com.google.common.base.Optional;
import com.google.common.collect.Sets;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.abrm.1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: abrk */
public final class abrk {
    private Set<abrl> a = new HashSet();
    private final abrm b = new abrm(PreferenceManager.getDefaultSharedPreferences(AppContext.get()));
    private final ConcurrentMap<abrl, Optional<Object>> c = new ConcurrentHashMap();

    /* renamed from: abrk$a */
    public static class a {
        public static final abrk a = new abrk();
    }

    public static abrk a() {
        return a.a;
    }

    private Optional<Object> a(abrl abrl) {
        abrm abrm = this.b;
        String a = abrl.a();
        if (!(abrm.a == null ? false : abrm.a.contains(a))) {
            return Optional.absent();
        }
        Object obj = null;
        switch (1.a[abrl.b().ordinal()]) {
            case 1:
                obj = Boolean.valueOf(abrm.a.getBoolean(a, false));
                break;
            case 2:
                obj = Integer.valueOf(abrm.a.getInt(a, 0));
                break;
            case 3:
                obj = Long.valueOf(abrm.a.getLong(a, 0));
                break;
            case 4:
                obj = Float.valueOf(abrm.a.getFloat(a, MapboxConstants.MINIMUM_ZOOM));
                break;
            case 5:
                obj = abrm.a.getString(a, null);
                break;
            case 6:
                obj = abrm.a.getStringSet(a, null);
                if (obj != null) {
                    obj = Sets.newConcurrentHashSet((Iterable) obj);
                    break;
                }
                break;
        }
        return obj == null ? Optional.absent() : Optional.of(obj);
    }

    private <T> T a(abrl abrl, T t) {
        Optional b = b(abrl);
        return b.isPresent() ? b.get() : t;
    }

    private static void a(abro abro, abrq abrq) {
        if (abro.mType != abrq) {
            StringBuilder stringBuilder = new StringBuilder("Attempted to use ");
            stringBuilder.append(abro.name());
            stringBuilder.append(" as ");
            stringBuilder.append(abrq);
            stringBuilder.append(" but this is a ");
            stringBuilder.append(abro.mType);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private Optional<Object> b(abrl abrl) {
        Optional optional = (Optional) this.c.get(abrl);
        if (optional != null) {
            return optional;
        }
        optional = a(abrl);
        this.c.put(abrl, optional);
        return optional;
    }

    private <T> void b(abrl abrl, T t) {
        this.c.put(abrl, Optional.of(t));
        synchronized (this.a) {
            this.a.add(abrl);
        }
    }

    private void e(abro abro) {
        this.c.put(abro, Optional.absent());
    }

    public final String a(abro abro) {
        return a(abro, null);
    }

    public final String a(abro abro, String str) {
        abrk.a(abro, abrq.STRING);
        return (String) a((abrl) abro, (Object) str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x004e in {5, 6, 12, 13, 14, 18} preds:[]
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
    public final void b() {
        /*
        r6 = this;
        r0 = r6.a;
        monitor-enter(r0);
        r1 = r6.a;	 Catch:{ all -> 0x004b }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x0017;	 Catch:{ all -> 0x004b }
        r1 = r6.a;	 Catch:{ all -> 0x004b }
        r1 = com.google.common.collect.ImmutableList.copyOf(r1);	 Catch:{ all -> 0x004b }
        r2 = r6.a;	 Catch:{ all -> 0x004b }
        r2.clear();	 Catch:{ all -> 0x004b }
        goto L_0x0018;	 Catch:{ all -> 0x004b }
        r1 = 0;	 Catch:{ all -> 0x004b }
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x004a;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r1.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0045;
        r2 = r1.next();
        r2 = (defpackage.abrl) r2;
        r3 = new abrp;
        r4 = r2.a();
        r5 = r6.b(r2);
        r2 = r2.b();
        r3.<init>(r4, r5, r2);
        r0.add(r3);
        goto L_0x0024;
        r1 = r6.b;
        r1.b(r0);
        return;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrk.b():void");
    }

    public final boolean b(abro abro) {
        abrk.a(abro, abrq.BOOLEAN);
        return ((Boolean) a((abrl) abro, Boolean.FALSE)).booleanValue();
    }

    public final boolean b(abro abro, String str) {
        abrk.a(abro, abrq.BOOLEAN);
        return ((Boolean) a(new abrn(abro, str), Boolean.FALSE)).booleanValue();
    }

    public final long c(abro abro) {
        abrk.a(abro, abrq.LONG);
        return ((Long) a((abrl) abro, Long.valueOf(0))).longValue();
    }

    public final void c() {
        HashSet hashSet = new HashSet();
        for (abro abro : abro.values()) {
            if (abro.mShouldPersistOnLogout) {
                hashSet.add(abro.mKey);
            }
        }
        Set<String> keySet = this.b.a.getAll().keySet();
        LinkedList linkedList = new LinkedList();
        for (String str : keySet) {
            if (!(hashSet.contains(str) || str.endsWith("has_given_access_to_contacts"))) {
                linkedList.add(str);
            }
        }
        this.b.a(linkedList);
    }

    public final void c(abro abro, String str) {
        abrk.a(abro, abrq.STRING);
        if (str == null) {
            d(abro);
        } else {
            b((abrl) abro, (Object) str);
        }
    }

    public final void d(abro abro) {
        e(abro);
        synchronized (this.a) {
            this.a.add(abro);
        }
    }

    public final void d(abro abro, String str) {
        abrk.a(abro, abrq.BOOLEAN);
        b(new abrn(abro, str), Boolean.TRUE);
    }
}
