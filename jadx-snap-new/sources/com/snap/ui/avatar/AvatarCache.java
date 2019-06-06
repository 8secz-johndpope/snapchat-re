package com.snap.ui.avatar;

import android.net.Uri;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import defpackage.abkq;
import defpackage.abmr;
import defpackage.afnd;
import defpackage.aipn;
import defpackage.ajed;
import defpackage.ajej;
import defpackage.ajfq;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.dds;
import defpackage.zfw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AvatarCache {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(AvatarCache.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(AvatarCache.class), "myUsername", "getMyUsername()Ljava/lang/String;")};
    private final Map<Long, List<DisposableCallback>> callbacks = new ConcurrentHashMap();
    private final ajxe myUsername$delegate;
    private final ajxe snapDb$delegate;
    private final abkq userSession;
    private final Map<FeedAvatarCacheId, FeedAvatarCacheItem> values = new ConcurrentHashMap();

    final class DisposableCallback extends ajed {
        private final akbw<Long, List<Avatar>, ajxw> callback;
        private final long feedId;
        private final Long lastInteractionTimestamp;
        final /* synthetic */ AvatarCache this$0;

        public DisposableCallback(AvatarCache avatarCache, long j, Long l, akbw<? super Long, ? super List<Avatar>, ajxw> akbw) {
            akcr.b(akbw, "callback");
            this.this$0 = avatarCache;
            this.feedId = j;
            this.lastInteractionTimestamp = l;
            this.callback = akbw;
        }

        public final akbw<Long, List<Avatar>, ajxw> getCallback() {
            return this.callback;
        }

        public final long getFeedId() {
            return this.feedId;
        }

        public final Long getLastInteractionTimestamp() {
            return this.lastInteractionTimestamp;
        }

        public final void onDispose() {
            List list = (List) this.this$0.callbacks.get(Long.valueOf(this.feedId));
            if (list != null) {
                list.remove(this);
            }
        }
    }

    public AvatarCache(abkq abkq, aipn<SnapDb> aipn) {
        akcr.b(abkq, "userSession");
        akcr.b(aipn, "snapDbLazy");
        this.userSession = abkq;
        this.snapDb$delegate = ajxh.a(new AvatarCache$snapDb$2(aipn));
        this.myUsername$delegate = ajxh.a(new AvatarCache$myUsername$2(this));
    }

    private final Avatar getAvatar(String str, String str2, boolean z) {
        if (str2 == null) {
            return new Avatar(str, null, null, null, 12, null);
        }
        Uri a;
        Uri a2 = dds.a(str2, z ? "10232871" : "10225903", afnd.CHAT, false, 0, 24);
        if (z) {
            a = dds.a(str2, "10233061", afnd.CHAT, false, 0, 24);
        } else {
            a = null;
        }
        return new Avatar(str, a2, a, null, 8, null);
    }

    private final String getMyUsername() {
        return (String) this.myUsername$delegate.b();
    }

    private final DbClient getSnapDb() {
        return (DbClient) this.snapDb$delegate.b();
    }

    private final List<Avatar> loadFromCache(FeedAvatarCacheId feedAvatarCacheId, Long l) {
        FeedAvatarCacheItem feedAvatarCacheItem = (FeedAvatarCacheItem) this.values.get(feedAvatarCacheId);
        if (feedAvatarCacheItem != null) {
            Object l2;
            Object lastInteractionTimestamp = feedAvatarCacheItem.getLastInteractionTimestamp();
            if (l2 == null) {
                l2 = feedAvatarCacheItem.getLastInteractionTimestamp();
            }
            if (akcr.a(lastInteractionTimestamp, l2)) {
                return feedAvatarCacheItem.getAvatars();
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:71:0x0138 in {6, 11, 12, 15, 16, 18, 22, 23, 26, 27, 29, 36, 42, 50, 51, 57, 59, 61, 62, 68, 70} preds:[]
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
    private final void loadFromDatabase(long r15, java.lang.String r17, java.lang.String r18, java.lang.Long r19, defpackage.ajdw r20) {
        /*
        r14 = this;
        r9 = r14;
        r0 = r17;
        r10 = r20;
        if (r10 == 0) goto L_0x001c;
        r1 = r9.callbacks;
        r2 = java.lang.Long.valueOf(r15);
        r1 = r1.get(r2);
        r1 = (java.util.List) r1;
        if (r1 == 0) goto L_0x001c;
        r1 = r1.size();
        if (r1 != 0) goto L_0x001c;
        return;
        r1 = new java.util.LinkedHashSet;
        r1.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r7 = r2;
        r7 = (java.util.List) r7;
        r2 = 0;
        r3 = 1;
        r4 = 0;
        if (r0 == 0) goto L_0x0045;
        r5 = r0;
        r5 = (java.lang.CharSequence) r5;
        r5 = r5.length();
        if (r5 != 0) goto L_0x0039;
        r5 = 1;
        goto L_0x003a;
        r5 = 0;
        r5 = r5 ^ r3;
        if (r5 == 0) goto L_0x003f;
        r5 = r0;
        goto L_0x0040;
        r5 = r4;
        if (r5 == 0) goto L_0x0045;
        r1.add(r5);
        if (r18 == 0) goto L_0x0060;
        r5 = r18;
        r5 = (java.lang.CharSequence) r5;
        r5 = r5.length();
        if (r5 != 0) goto L_0x0053;
        r5 = 1;
        goto L_0x0054;
        r5 = 0;
        r5 = r5 ^ r3;
        if (r5 == 0) goto L_0x005a;
        r5 = r18;
        goto L_0x005b;
        r5 = r4;
        if (r5 == 0) goto L_0x0060;
        r1.add(r5);
        r5 = com.snap.core.db.record.FeedMemberRecord.FACTORY;
        r6 = r14.getMyUsername();
        r11 = r15;
        r5 = r5.selectMembersForAvatar(r6, r11);
        r6 = "FeedMemberRecord.FACTORY…vatar(myUsername, feedId)";
        defpackage.akcr.a(r5, r6);
        r6 = r14.getSnapDb();
        r5 = r6.query(r5);
        r5 = (java.io.Closeable) r5;
        r6 = r5;	 Catch:{ Throwable -> 0x0131 }
        r6 = (android.database.Cursor) r6;	 Catch:{ Throwable -> 0x0131 }
        r8 = r6.moveToNext();	 Catch:{ Throwable -> 0x0131 }
        if (r8 == 0) goto L_0x0098;	 Catch:{ Throwable -> 0x0131 }
        r8 = com.snap.core.db.record.LegacyFeedMemberQueries.SELECT_FEED_AVATAR_MEMBERS_MAPPER;	 Catch:{ Throwable -> 0x0131 }
        r8 = r8.map(r6);	 Catch:{ Throwable -> 0x0131 }
        r13 = "LegacyFeedMemberQueries.…EMBERS_MAPPER.map(cursor)";	 Catch:{ Throwable -> 0x0131 }
        defpackage.akcr.a(r8, r13);	 Catch:{ Throwable -> 0x0131 }
        r8 = (com.snap.core.db.record.FeedMemberRecord.FeedAvatarMember) r8;	 Catch:{ Throwable -> 0x0131 }
        r8 = r8.username();	 Catch:{ Throwable -> 0x0131 }
        r1.add(r8);	 Catch:{ Throwable -> 0x0131 }
        goto L_0x007d;
        defpackage.akax.a(r5, r4);
        r1 = (java.lang.Iterable) r1;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r5 = (java.util.Collection) r5;
        r1 = r1.iterator();
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x00c4;
        r6 = r1.next();
        r8 = r6;
        r8 = (java.lang.String) r8;
        r13 = r14.getMyUsername();
        r8 = defpackage.akcr.a(r8, r13);
        r8 = r8 ^ r3;
        if (r8 == 0) goto L_0x00a8;
        r5.add(r6);
        goto L_0x00a8;
        r5 = (java.util.List) r5;
        r5 = (java.lang.Iterable) r5;
        r1 = 3;
        r1 = defpackage.ajyu.c(r5, r1);
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0119;
        r3 = r1.next();
        r3 = (java.lang.String) r3;
        r5 = com.snap.core.db.record.FriendRecord.FACTORY;
        r5 = r5.selectBitmojiForUsername(r3);
        r6 = "FriendRecord.FACTORY.sel…mojiForUsername(username)";
        defpackage.akcr.a(r5, r6);
        r6 = r14.getSnapDb();
        r5 = r6.query(r5);
        r5 = (java.io.Closeable) r5;
        r6 = r5;	 Catch:{ Throwable -> 0x0112 }
        r6 = (android.database.Cursor) r6;	 Catch:{ Throwable -> 0x0112 }
        r8 = r6.moveToFirst();	 Catch:{ Throwable -> 0x0112 }
        if (r8 == 0) goto L_0x010c;	 Catch:{ Throwable -> 0x0112 }
        r8 = defpackage.akcr.a(r3, r0);	 Catch:{ Throwable -> 0x0112 }
        r6 = r6.getString(r2);	 Catch:{ Throwable -> 0x0112 }
        r3 = r14.getAvatar(r3, r6, r8);	 Catch:{ Throwable -> 0x0112 }
        r7.add(r3);	 Catch:{ Throwable -> 0x0112 }
        defpackage.akax.a(r5, r4);
        goto L_0x00d3;
        r0 = move-exception;
        goto L_0x0115;
        r0 = move-exception;
        r4 = r0;
        throw r4;	 Catch:{ all -> 0x0110 }
        defpackage.akax.a(r5, r4);
        throw r0;
        if (r10 == 0) goto L_0x012e;
        r13 = new com.snap.ui.avatar.AvatarCache$loadFromDatabase$8;
        r1 = r13;
        r2 = r14;
        r3 = r15;
        r5 = r17;
        r6 = r18;
        r8 = r19;
        r1.<init>(r2, r3, r5, r6, r7, r8);
        r13 = (java.lang.Runnable) r13;
        r10.a(r13);
        return;
        r0 = move-exception;
        goto L_0x0134;
        r0 = move-exception;
        r4 = r0;
        throw r4;	 Catch:{ all -> 0x012f }
        defpackage.akax.a(r5, r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.avatar.AvatarCache.loadFromDatabase(long, java.lang.String, java.lang.String, java.lang.Long, ajdw):void");
    }

    private final void notifyObservers(long j, String str, String str2, List<Avatar> list, Long l) {
        abmr.a();
        this.values.put(new FeedAvatarCacheId(j, str, str2), new FeedAvatarCacheItem(l, list));
        List list2 = (List) this.callbacks.get(Long.valueOf(j));
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                DisposableCallback disposableCallback = (DisposableCallback) it.next();
                Object lastInteractionTimestamp = disposableCallback.getLastInteractionTimestamp();
                if (lastInteractionTimestamp == null) {
                    lastInteractionTimestamp = l;
                }
                if (akcr.a(lastInteractionTimestamp, (Object) l)) {
                    disposableCallback.getCallback().invoke(Long.valueOf(j), list);
                    it.remove();
                }
            }
        }
    }

    public ajej loadAvatarsForFeed(long j, String str, String str2, Long l, zfw zfw, akbw<? super Long, ? super List<Avatar>, ajxw> akbw) {
        akbw<? super Long, ? super List<Avatar>, ajxw> akbw2 = akbw;
        akcr.b(zfw, "schedulers");
        akcr.b(akbw2, "callback");
        abmr.a();
        List loadFromCache = loadFromCache(new FeedAvatarCacheId(j, str, str2), l);
        if (loadFromCache != null) {
            akbw2.invoke(Long.valueOf(j), loadFromCache);
            Object obj = ajfq.INSTANCE;
            akcr.a(obj, "Disposables.disposed()");
            return obj;
        }
        DisposableCallback disposableCallback = new DisposableCallback(this, j, l, akbw);
        Map map = this.callbacks;
        Long valueOf = Long.valueOf(j);
        Object obj2 = map.get(valueOf);
        if (obj2 == null) {
            obj2 = new ArrayList();
            map.put(valueOf, obj2);
        }
        ((List) obj2).add(disposableCallback);
        zfw.i().a((Runnable) new AvatarCache$loadAvatarsForFeed$$inlined$apply$lambda$1(this, j, zfw, str, str2, l));
        return disposableCallback;
    }
}
