package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.record.StoryCorpusSignalsModel.IncrementNumSnapsViewedAndTotalWatchTimeSeconds;
import com.snap.core.db.record.StoryCorpusSignalsModel.IncrementTotalImpressionTimeSeconds;
import com.snap.core.db.record.StoryCorpusSignalsRecord;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateFavoriteStory;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateHideStory;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateLongImpression;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateLongViewsScore;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateNumSnapsViewedScore;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateQualifiedLongImpression;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateShortImpression;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateShortViewsScore;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateTotalImpression;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateTotalWatchTimeScore;
import com.snap.core.db.record.StoryInteractionSignalsModel.UpdateUnfavoriteStory;
import com.snap.core.db.record.StoryInteractionSignalsRecord;
import com.snap.core.db.record.StoryInteractionSignalsRecord.CorpusInteractionFeaturesRecord;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.hbw.a;
import defpackage.hnp.c;
import defpackage.hnp.h;
import defpackage.hnp.i;
import defpackage.hnp.j;
import defpackage.hnp.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* renamed from: hnr */
public final class hnr implements hbw {
    final ConcurrentMap<hjd, a> a = Maps.newConcurrentMap();
    final hnp b;
    private final ajei c;
    private final ajxe d = ajxh.a(new l(this));
    private final zfw e;
    private final abqo f;
    private final abss g;

    /* renamed from: hnr$l */
    static final class l extends akcs implements akbk<ajcx> {
        private /* synthetic */ hnr a;

        l(hnr hnr) {
            this.a = hnr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            long a = (abqo.a() / 1000) - 86400;
            hnp hnp = this.a.b;
            Object b = ajcx.a((ajev) new c(hnp, a)).b(hnp.c());
            akcr.a(b, "Completable.fromAction {… }.subscribeOn(scheduler)");
            return b.d();
        }
    }

    /* renamed from: hnr$a */
    public static final class a {
        int a;
        final Set<String> b = Sets.newConcurrentHashSet();
        final Set<String> c = Sets.newConcurrentHashSet();
        int d;
        long e = -1;
        final Set<String> f = Sets.newConcurrentHashSet();
        private int g = -1;
    }

    /* renamed from: hnr$ae */
    static final class ae implements Runnable {
        private /* synthetic */ hnr a;
        private /* synthetic */ hjd b;
        private /* synthetic */ String c;

        ae(hnr hnr, hjd hjd, String str) {
            this.a = hnr;
            this.b = hjd;
            this.c = str;
        }

        public final void run() {
            Object obj = this.a.a;
            akcr.a(obj, "sectionInteractionMap");
            synchronized (obj) {
                a b = this.a.b(this.b);
                b.b.add(this.c);
                if (b.e == -1) {
                    b.e = abqo.a() / 1000;
                }
            }
        }
    }

    /* renamed from: hnr$af */
    static final class af implements Runnable {
        private /* synthetic */ hnr a;
        private /* synthetic */ hjd b;
        private /* synthetic */ String c;
        private /* synthetic */ boolean d;

        af(hnr hnr, hjd hjd, String str, boolean z) {
            this.a = hnr;
            this.b = hjd;
            this.c = str;
            this.d = z;
        }

        public final void run() {
            Object obj = this.a.a;
            akcr.a(obj, "sectionInteractionMap");
            synchronized (obj) {
                a b = this.a.b(this.b);
                b.c.add(this.c);
                if (this.d) {
                    b.f.add(this.c);
                }
                b.d++;
            }
        }
    }

    /* renamed from: hnr$c */
    static final class c implements Runnable {
        private /* synthetic */ hnr a;

        c(hnr hnr) {
            this.a = hnr;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x003b in {7, 9, 12} preds:[]
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
        public final void run() {
            /*
            r5 = this;
            r0 = r5.a;
            r0 = r0.a;
            r1 = "sectionInteractionMap";
            defpackage.akcr.a(r0, r1);
            monitor-enter(r0);
            r1 = r5.a;	 Catch:{ all -> 0x0038 }
            r1 = r1.a;	 Catch:{ all -> 0x0038 }
            r1 = r1.values();	 Catch:{ all -> 0x0038 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0038 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0038 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0036;	 Catch:{ all -> 0x0038 }
            r2 = r1.next();	 Catch:{ all -> 0x0038 }
            r2 = (defpackage.hnr.a) r2;	 Catch:{ all -> 0x0038 }
            r3 = r2.c;	 Catch:{ all -> 0x0038 }
            r3.clear();	 Catch:{ all -> 0x0038 }
            r3 = r2.b;	 Catch:{ all -> 0x0038 }
            r3.clear();	 Catch:{ all -> 0x0038 }
            r3 = 0;	 Catch:{ all -> 0x0038 }
            r2.d = r3;	 Catch:{ all -> 0x0038 }
            r3 = -1;	 Catch:{ all -> 0x0038 }
            r2.e = r3;	 Catch:{ all -> 0x0038 }
            goto L_0x0018;
            monitor-exit(r0);
            return;
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hnr$c.run():void");
        }
    }

    /* renamed from: hnr$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ hnr a;

        g(hnr hnr) {
            this.a = hnr;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0068 in {6, 9, 12} preds:[]
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
        private java.util.Map<defpackage.hjd, defpackage.hbw.a> a() {
            /*
            r7 = this;
            r0 = r7.a;
            r0 = r0.a;
            r1 = "sectionInteractionMap";
            defpackage.akcr.a(r0, r1);
            monitor-enter(r0);
            r1 = r7.a;	 Catch:{ all -> 0x0065 }
            r1 = r1.a;	 Catch:{ all -> 0x0065 }
            r1 = r1.entrySet();	 Catch:{ all -> 0x0065 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0065 }
            r2 = 10;	 Catch:{ all -> 0x0065 }
            r2 = defpackage.ajyn.a(r1, r2);	 Catch:{ all -> 0x0065 }
            r2 = defpackage.ajzm.a(r2);	 Catch:{ all -> 0x0065 }
            r3 = 16;	 Catch:{ all -> 0x0065 }
            r2 = defpackage.akef.b(r2, r3);	 Catch:{ all -> 0x0065 }
            r3 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0065 }
            r3.<init>(r2);	 Catch:{ all -> 0x0065 }
            r3 = (java.util.Map) r3;	 Catch:{ all -> 0x0065 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0065 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x005f;	 Catch:{ all -> 0x0065 }
            r2 = r1.next();	 Catch:{ all -> 0x0065 }
            r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0065 }
            r4 = r2.getKey();	 Catch:{ all -> 0x0065 }
            r5 = r7.a;	 Catch:{ all -> 0x0065 }
            r2 = r2.getValue();	 Catch:{ all -> 0x0065 }
            r6 = "it.value";	 Catch:{ all -> 0x0065 }
            defpackage.akcr.a(r2, r6);	 Catch:{ all -> 0x0065 }
            r2 = (defpackage.hnr.a) r2;	 Catch:{ all -> 0x0065 }
            r6 = new hnr$o;	 Catch:{ all -> 0x0065 }
            r6.<init>(r5, r2);	 Catch:{ all -> 0x0065 }
            r6 = (defpackage.hbw.a) r6;	 Catch:{ all -> 0x0065 }
            r2 = defpackage.ajxs.a(r4, r6);	 Catch:{ all -> 0x0065 }
            r4 = r2.a;	 Catch:{ all -> 0x0065 }
            r2 = r2.b;	 Catch:{ all -> 0x0065 }
            r3.put(r4, r2);	 Catch:{ all -> 0x0065 }
            goto L_0x002f;	 Catch:{ all -> 0x0065 }
            r1 = defpackage.ajzm.d(r3);	 Catch:{ all -> 0x0065 }
            monitor-exit(r0);
            return r1;
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hnr$g.a():java.util.Map");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: hnr$k */
    static final class k implements Runnable {
        public static final k a = new k();

        k() {
        }

        public final void run() {
            ieg.a("Discover Feed Database Error. Please shake!", true, 0);
        }
    }

    /* renamed from: hnr$m */
    static final class m implements Runnable {
        private /* synthetic */ hnr a;
        private /* synthetic */ hkm b;

        m(hnr hnr, hkm hkm) {
            this.a = hnr;
            this.b = hkm;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0065 in {12, 14, 16, 19} preds:[]
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
        public final void run() {
            /*
            r7 = this;
            r0 = r7.a;
            r0 = r0.a;
            r1 = "sectionInteractionMap";
            defpackage.akcr.a(r0, r1);
            monitor-enter(r0);
            r1 = r7.b;	 Catch:{ all -> 0x0062 }
            r1 = r1.a;	 Catch:{ all -> 0x0062 }
            r1 = r1.entrySet();	 Catch:{ all -> 0x0062 }
            r2 = "storiesDataModels.contents.entries";	 Catch:{ all -> 0x0062 }
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0062 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0062 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0062 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0060;	 Catch:{ all -> 0x0062 }
            r2 = r1.next();	 Catch:{ all -> 0x0062 }
            r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0062 }
            r3 = r2.getKey();	 Catch:{ all -> 0x0062 }
            r3 = (defpackage.hjd) r3;	 Catch:{ all -> 0x0062 }
            r2 = r2.getValue();	 Catch:{ all -> 0x0062 }
            r2 = (defpackage.hkl) r2;	 Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x001d;	 Catch:{ all -> 0x0062 }
            r4 = r2.f;	 Catch:{ all -> 0x0062 }
            r2 = r2.b;	 Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x001d;	 Catch:{ all -> 0x0062 }
            r2 = r2.a();	 Catch:{ all -> 0x0062 }
            r5 = r7.a;	 Catch:{ all -> 0x0062 }
            r6 = "section";	 Catch:{ all -> 0x0062 }
            defpackage.akcr.a(r3, r6);	 Catch:{ all -> 0x0062 }
            r5 = r5.b(r3);	 Catch:{ all -> 0x0062 }
            r3 = defpackage.hkj.a(r4, r3);	 Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x005a;	 Catch:{ all -> 0x0062 }
            r5.a = r2;	 Catch:{ all -> 0x0062 }
            r2 = r5.f;	 Catch:{ all -> 0x0062 }
            r2.clear();	 Catch:{ all -> 0x0062 }
            goto L_0x001d;	 Catch:{ all -> 0x0062 }
            r3 = r5.a;	 Catch:{ all -> 0x0062 }
            r3 = r3 + r2;	 Catch:{ all -> 0x0062 }
            r5.a = r3;	 Catch:{ all -> 0x0062 }
            goto L_0x001d;
            monitor-exit(r0);
            return;
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hnr$m.run():void");
        }
    }

    /* renamed from: hnr$aa */
    static final class aa<T> implements ajfb<ajxm<? extends StoryInteractionSignalsRecord, ? extends StoryCorpusSignalsRecord>> {
        private /* synthetic */ hnr a;
        private /* synthetic */ Double b;
        private /* synthetic */ Double c;
        private /* synthetic */ hio d;
        private /* synthetic */ int e;
        private /* synthetic */ Integer f;
        private /* synthetic */ boolean g;
        private /* synthetic */ Long h;

        aa(hnr hnr, Double d, Double d2, hio hio, int i, Integer num, boolean z, Long l) {
            this.a = hnr;
            this.b = d;
            this.c = d2;
            this.d = hio;
            this.e = i;
            this.f = num;
            this.g = z;
            this.h = l;
        }

        public final /* synthetic */ void accept(Object obj) {
            hnr hnr;
            long c;
            long c2;
            double a;
            hnp hnp;
            long _id;
            UpdateLongViewsScore updateLongViewsScore;
            ajxm ajxm;
            double d;
            ajxm ajxm2 = (ajxm) obj;
            StoryInteractionSignalsRecord storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) ajxm2.a;
            Double d2 = this.b;
            double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            d2 = this.c;
            double doubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Object obj2 = (doubleValue > 5.0d || (doubleValue > 0.0d && doubleValue2 > 0.0d && doubleValue / doubleValue2 > 0.5d)) ? 1 : null;
            long a2;
            if (obj2 != null) {
                hnr = this.a;
                c = this.d.b().c();
                c2 = this.d.b().c();
                a = hnr.a(storyInteractionSignalsRecord.longViewsScore(), storyInteractionSignalsRecord.longViewsScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
                hnp = hnr.b;
                _id = storyInteractionSignalsRecord._id();
                a2 = abqo.a() / 1000;
                updateLongViewsScore = new UpdateLongViewsScore(hnp.b());
                updateLongViewsScore.bind(a, a2, c, c2, a2, _id);
            } else {
                double a3 = hnr.a(storyInteractionSignalsRecord.shortViewsScore(), storyInteractionSignalsRecord.shortViewsScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
                hnp = this.a.b;
                a2 = storyInteractionSignalsRecord._id();
                c2 = abqo.a() / 1000;
                updateLongViewsScore = new UpdateShortViewsScore(hnp.b());
                updateLongViewsScore.bind(a3, c2, c2, a2);
            }
            hnp.a(updateLongViewsScore);
            hnp = this.a.b;
            c2 = storyInteractionSignalsRecord._id();
            a = hnr.a(storyInteractionSignalsRecord.numSnapsViewedScore(), storyInteractionSignalsRecord.numSnapsViewedScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
            c = abqo.a() / 1000;
            UpdateNumSnapsViewedScore updateNumSnapsViewedScore = new UpdateNumSnapsViewedScore(hnp.b());
            updateNumSnapsViewedScore.bind(a, c, c, c2);
            hnp.a(updateNumSnapsViewedScore);
            hnr = this.a;
            Double d3 = this.b;
            double doubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
            int i = this.e;
            Double d4 = this.c;
            double doubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
            Integer num = this.f;
            int intValue = num != null ? num.intValue() : 0;
            Object obj3 = (this.g || this.d.r()) ? 1 : null;
            long j = (long) this.e;
            intValue++;
            double a4 = hnr.a(storyInteractionSignalsRecord.totalWatchTimeScore(), storyInteractionSignalsRecord.totalWatchTimeScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
            double maxSnapCompletionPercent = storyInteractionSignalsRecord.maxSnapCompletionPercent();
            if (obj3 == 1) {
                ajxm = ajxm2;
                d = 1.0d;
            } else if (obj3 == null) {
                if ((i == 0 ? 1 : null) == 1) {
                    ajxm = ajxm2;
                    d = 0.0d;
                } else {
                    ajxm = ajxm2;
                    d = (double) intValue;
                    double d5 = (double) i;
                    Double.isNaN(d);
                    Double.isNaN(d5);
                    d /= d5;
                }
            } else {
                throw new ajxk();
            }
            double min = Math.min(Math.max(maxSnapCompletionPercent, d), 1.0d);
            hnp hnp2 = hnr.b;
            long _id2 = storyInteractionSignalsRecord._id();
            double maxTotalTimeWatched = storyInteractionSignalsRecord.maxTotalTimeWatched() + doubleValue3;
            long numWatches = storyInteractionSignalsRecord.numWatches() + 1;
            long j2 = (long) intValue;
            long j3 = j2;
            long max = Math.max(storyInteractionSignalsRecord.numSnapsViewedFromLatestVersion(), j2);
            long a5 = abqo.a() / 1000;
            long j4 = a5;
            _id = a5;
            UpdateTotalWatchTimeScore updateTotalWatchTimeScore = r1;
            UpdateTotalWatchTimeScore updateTotalWatchTimeScore2 = new UpdateTotalWatchTimeScore(hnp2.b());
            updateTotalWatchTimeScore.bind(a4, _id, maxTotalTimeWatched, numWatches, (long) doubleValue4, max, min, j3, j, j4, _id2);
            hnp2.a(updateTotalWatchTimeScore2);
            hnr hnr2 = this.a;
            StoryCorpusSignalsRecord storyCorpusSignalsRecord = (StoryCorpusSignalsRecord) ajxm.b;
            Long l = this.h;
            long longValue = l != null ? l.longValue() : 0;
            Double d6 = this.b;
            double doubleValue5 = d6 != null ? d6.doubleValue() : 0.0d;
            hnp hnp3 = hnr2.b;
            long _id3 = storyCorpusSignalsRecord._id();
            IncrementNumSnapsViewedAndTotalWatchTimeSeconds incrementNumSnapsViewedAndTotalWatchTimeSeconds = new IncrementNumSnapsViewedAndTotalWatchTimeSeconds(hnp3.b());
            incrementNumSnapsViewedAndTotalWatchTimeSeconds.bind((double) longValue, doubleValue5, _id3);
            hnp3.a(incrementNumSnapsViewedAndTotalWatchTimeSeconds);
        }
    }

    /* renamed from: hnr$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ hnr a;
        private /* synthetic */ Set b;

        b(hnr hnr, Set set) {
            this.a = hnr;
            this.b = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, EventType.RESPONSE);
            Map linkedHashMap = new LinkedHashMap();
            Iterable<StoryCorpusSignalsRecord> iterable = list;
            Map linkedHashMap2 = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (StoryCorpusSignalsRecord storyCorpusSignalsRecord : iterable) {
                linkedHashMap2.put(Long.valueOf(storyCorpusSignalsRecord.corpus()), new n(storyCorpusSignalsRecord));
            }
            linkedHashMap.putAll(linkedHashMap2);
            for (Number longValue : this.b) {
                long longValue2 = longValue.longValue();
                if (!linkedHashMap.containsKey(Long.valueOf(longValue2))) {
                    linkedHashMap.put(Long.valueOf(longValue2), new e());
                }
            }
            return linkedHashMap;
        }
    }

    /* renamed from: hnr$d */
    public static final class d implements hcg {
        private /* synthetic */ hio a;

        d(hio hio) {
            this.a = hio;
        }

        public final float a() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float a(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float a(hio hio) {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float b() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float b(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float b(hio hio) {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float c() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float c(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float d(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final int d() {
            return 0;
        }

        public final float e() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float e(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float f() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float f(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float g(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float h(abqo abqo) {
            akcr.b(abqo, "clock");
            return MapboxConstants.MINIMUM_ZOOM;
        }
    }

    /* renamed from: hnr$e */
    public static final class e implements hce {
        e() {
        }

        public final float a() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float b() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float c() {
            return MapboxConstants.MINIMUM_ZOOM;
        }
    }

    /* renamed from: hnr$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<StoryInteractionSignalsRecord> iterable = list;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (StoryInteractionSignalsRecord storyInteractionSignalsRecord : iterable) {
                linkedHashMap.put(storyInteractionSignalsRecord.storyId(), storyInteractionSignalsRecord);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: hnr$i */
    static final class i<T, R> implements ajfc<T, R> {
        private /* synthetic */ hnr a;
        private /* synthetic */ List b;

        i(hnr hnr, List list) {
            this.a = hnr;
            this.b = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            akcr.b(map, "signalsMap");
            Iterable<hio> iterable = this.b;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (hio hio : iterable) {
                StoryInteractionSignalsRecord storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) map.get(hio.af().b());
                linkedHashMap.put(hio, storyInteractionSignalsRecord != null ? new p(this.a, storyInteractionSignalsRecord) : new d(hio));
            }
            return linkedHashMap;
        }
    }

    /* renamed from: hnr$n */
    public static final class n implements hce {
        private /* synthetic */ StoryCorpusSignalsRecord a;

        n(StoryCorpusSignalsRecord storyCorpusSignalsRecord) {
            this.a = storyCorpusSignalsRecord;
        }

        public final float a() {
            return (float) this.a.numSnapsViewed();
        }

        public final float b() {
            return (float) this.a.totalWatchTimeSeconds();
        }

        public final float c() {
            return (float) this.a.totalImpressionTimeSeconds();
        }
    }

    /* renamed from: hnr$o */
    public static final class o implements a {
        private /* synthetic */ hnr a;
        private /* synthetic */ a b;

        o(hnr hnr, a aVar) {
            this.a = hnr;
            this.b = aVar;
        }

        public final int a() {
            return this.b.a;
        }

        public final int b() {
            return this.b.b.size();
        }

        public final int c() {
            return this.b.c.size();
        }

        public final int d() {
            return this.b.d;
        }

        public final float e() {
            return ((this.b.e > -1 ? 1 : (this.b.e == -1 ? 0 : -1)) == 0 ? 1 : 0) == 1 ? -1.0f : (float) ((abqo.a() / 1000) - this.b.e);
        }
    }

    /* renamed from: hnr$p */
    public static final class p implements hcg {
        private /* synthetic */ hnr a;
        private /* synthetic */ StoryInteractionSignalsRecord b;

        p(hnr hnr, StoryInteractionSignalsRecord storyInteractionSignalsRecord) {
            this.a = hnr;
            this.b = storyInteractionSignalsRecord;
        }

        public final float a() {
            return (float) this.b.lastFavoriteTimestampSecs();
        }

        public final float a(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.shortViewsScore(), this.b.shortViewsScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final float a(hio hio) {
            akcr.b(hio, UnlockablesModel.DATA);
            return ((hio.b().c() > this.b.lastLongImpressionVersion() ? 1 : (hio.b().c() == this.b.lastLongImpressionVersion() ? 0 : -1)) == 0 ? 1 : 0) == 1 ? MapboxConstants.MINIMUM_ZOOM : 1.0f;
        }

        public final float b() {
            return (float) this.b.lastHideTimestampSecs();
        }

        public final float b(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.longViewsScore(), this.b.longViewsScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final float b(hio hio) {
            akcr.b(hio, UnlockablesModel.DATA);
            return ((hio.b().c() > this.b.lastViewVersion() ? 1 : (hio.b().c() == this.b.lastViewVersion() ? 0 : -1)) == 0 ? 1 : 0) == 1 ? MapboxConstants.MINIMUM_ZOOM : 1.0f;
        }

        public final float c() {
            return (float) this.b.lastUnfavoriteTimestampSecs();
        }

        public final float c(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.shortImpressionScore(), this.b.shortImpressionScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final float d(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.longImpressionsScore(), this.b.longViewsScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final int d() {
            return (int) this.b.numSnapsViewedFromLatestVersion();
        }

        public final float e() {
            return (float) this.b.maxTotalTimeWatched();
        }

        public final float e(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.qualifiedLongImpressionScore(), this.b.qualifiedLongImpressionScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final float f() {
            return (float) this.b.totalImpressionTime();
        }

        public final float f(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.numSnapsViewedScore(), this.b.numSnapsViewedScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final float g(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.totalWatchTimeScore(), this.b.totalWatchTimeScoreTimestampSecs(), abqo.a() / 1000);
        }

        public final float h(abqo abqo) {
            akcr.b(abqo, "clock");
            return (float) hnr.a(this.b.totalImpressionTimeScore(), this.b.totalImpressionTimeScoreTimestampSecs(), abqo.a() / 1000);
        }
    }

    /* renamed from: hnr$u */
    static final class u<T> implements ajfb<ajxm<? extends StoryInteractionSignalsRecord, ? extends StoryCorpusSignalsRecord>> {
        private /* synthetic */ hnr a;
        private /* synthetic */ hio b;
        private /* synthetic */ double c;

        u(hnr hnr, hio hio, double d) {
            this.a = hnr;
            this.b = hio;
            this.c = d;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            hnr hnr = this.a;
            StoryInteractionSignalsRecord storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) ajxm.a;
            long c = this.b.b().c();
            double a = hnr.a(storyInteractionSignalsRecord.longImpressionsScore(), storyInteractionSignalsRecord.longImpressionsScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
            hnp hnp = hnr.b;
            long _id = storyInteractionSignalsRecord._id();
            long lastVersionLongImpressionCount = storyInteractionSignalsRecord.lastVersionLongImpressionCount() + 1;
            long a2 = abqo.a() / 1000;
            UpdateLongImpression updateLongImpression = new UpdateLongImpression(hnp.b());
            updateLongImpression.bind(a, a2, c, lastVersionLongImpressionCount, a2, _id);
            hnp.a(updateLongImpression);
            hnr = this.a;
            storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) ajxm.a;
            StoryCorpusSignalsRecord storyCorpusSignalsRecord = (StoryCorpusSignalsRecord) ajxm.b;
            double d = this.c;
            double a3 = hnr.a(storyInteractionSignalsRecord.totalImpressionTimeScore(), storyInteractionSignalsRecord.totalImpressionTimeScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
            hnp hnp2 = hnr.b;
            long _id2 = storyInteractionSignalsRecord._id();
            double totalImpressionTime = storyInteractionSignalsRecord.totalImpressionTime() + d;
            long a4 = abqo.a() / 1000;
            UpdateTotalImpression updateTotalImpression = new UpdateTotalImpression(hnp2.b());
            updateTotalImpression.bind(totalImpressionTime, a3, a4, a4, _id2);
            hnp2.a(updateTotalImpression);
            hnp = hnr.b;
            long _id3 = storyCorpusSignalsRecord._id();
            IncrementTotalImpressionTimeSeconds incrementTotalImpressionTimeSeconds = new IncrementTotalImpressionTimeSeconds(hnp.b());
            incrementTotalImpressionTimeSeconds.bind(d, _id3);
            hnp.a(incrementTotalImpressionTimeSeconds);
        }
    }

    /* renamed from: hnr$w */
    static final class w<T> implements ajfb<StoryInteractionSignalsRecord> {
        private /* synthetic */ hnr a;

        w(hnr hnr) {
            this.a = hnr;
        }

        public final /* synthetic */ void accept(Object obj) {
            StoryInteractionSignalsRecord storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) obj;
            hnp hnp = this.a.b;
            long _id = storyInteractionSignalsRecord._id();
            double a = hnr.a(storyInteractionSignalsRecord.qualifiedLongImpressionScore(), storyInteractionSignalsRecord.qualifiedLongImpressionScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
            long a2 = abqo.a() / 1000;
            UpdateQualifiedLongImpression updateQualifiedLongImpression = new UpdateQualifiedLongImpression(hnp.b());
            updateQualifiedLongImpression.bind(a, a2, a2, _id);
            hnp.a(updateQualifiedLongImpression);
        }
    }

    /* renamed from: hnr$y */
    static final class y<T> implements ajfb<StoryInteractionSignalsRecord> {
        private /* synthetic */ hnr a;

        y(hnr hnr) {
            this.a = hnr;
        }

        public final /* synthetic */ void accept(Object obj) {
            StoryInteractionSignalsRecord storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) obj;
            hnp hnp = this.a.b;
            long _id = storyInteractionSignalsRecord._id();
            double a = hnr.a(storyInteractionSignalsRecord.shortImpressionScore(), storyInteractionSignalsRecord.shortImpressionScoreTimestampSecs(), abqo.a() / 1000) + 1.0d;
            long a2 = abqo.a() / 1000;
            UpdateShortImpression updateShortImpression = new UpdateShortImpression(hnp.b());
            updateShortImpression.bind(a, a2, a2, _id);
            hnp.a(updateShortImpression);
        }
    }

    /* renamed from: hnr$ab */
    static final class ab extends akcq implements akbl<Throwable, ajxw> {
        ab(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$ac */
    static final class ac extends akcq implements akbl<Long, ajxw> {
        ac(hnp hnp) {
            super(1, hnp);
        }

        public final String getName() {
            return "updateUnfavoriteStory";
        }

        public final akej getOwner() {
            return akde.a(hnp.class);
        }

        public final String getSignature() {
            return "updateUnfavoriteStory(J)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            hnp hnp = (hnp) this.receiver;
            long a = abqo.a() / 1000;
            UpdateUnfavoriteStory updateUnfavoriteStory = new UpdateUnfavoriteStory(hnp.b());
            updateUnfavoriteStory.bind(a, a, longValue);
            hnp.a(updateUnfavoriteStory);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$ad */
    static final class ad extends akcq implements akbl<Throwable, ajxw> {
        ad(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$f */
    static final class f extends akcq implements akbl<Long, ajdx<StoryCorpusSignalsRecord>> {
        f(hnp hnp) {
            super(1, hnp);
        }

        public final String getName() {
            return "getSignalCorpus";
        }

        public final akej getOwner() {
            return akde.a(hnp.class);
        }

        public final String getSignature() {
            return "getSignalCorpus(J)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            hnp hnp = (hnp) this.receiver;
            DbClient a = hnp.a();
            Object selectSignal = StoryCorpusSignalsRecord.FACTORY.selectSignal(longValue);
            akcr.a(selectSignal, "StoryCorpusSignalsRecord…CTORY.selectSignal(rowId)");
            obj = a.queryAndMapToOne(selectSignal, new h(StoryCorpusSignalsRecord.MAPPER)).e().b(hnp.c());
            akcr.a(obj, "dbClient.queryAndMapToOn…  .subscribeOn(scheduler)");
            return obj;
        }
    }

    /* renamed from: hnr$j */
    static final class j extends akcq implements akbl<Long, ajdx<StoryInteractionSignalsRecord>> {
        j(hnp hnp) {
            super(1, hnp);
        }

        public final String getName() {
            return "getSignalsByRowId";
        }

        public final akej getOwner() {
            return akde.a(hnp.class);
        }

        public final String getSignature() {
            return "getSignalsByRowId(J)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            hnp hnp = (hnp) this.receiver;
            DbClient a = hnp.a();
            Object selectSignalByRowId = StoryInteractionSignalsRecord.FACTORY.selectSignalByRowId(longValue);
            akcr.a(selectSignalByRowId, "StoryInteractionSignalsR…electSignalByRowId(rowId)");
            obj = a.queryAndMapToOne(selectSignalByRowId, new l(StoryInteractionSignalsRecord.SELECT_SIGNALS_MAPPER)).e().b(hnp.c());
            akcr.a(obj, "dbClient.queryAndMapToOn…  .subscribeOn(scheduler)");
            return obj;
        }
    }

    /* renamed from: hnr$q */
    static final class q extends akcq implements akbl<Long, ajxw> {
        q(hnp hnp) {
            super(1, hnp);
        }

        public final String getName() {
            return "updateFavoriteStory";
        }

        public final akej getOwner() {
            return akde.a(hnp.class);
        }

        public final String getSignature() {
            return "updateFavoriteStory(J)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            hnp hnp = (hnp) this.receiver;
            long a = abqo.a() / 1000;
            UpdateFavoriteStory updateFavoriteStory = new UpdateFavoriteStory(hnp.b());
            updateFavoriteStory.bind(a, a, longValue);
            hnp.a(updateFavoriteStory);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$r */
    static final class r extends akcq implements akbl<Throwable, ajxw> {
        r(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$s */
    static final class s extends akcq implements akbl<Long, ajxw> {
        s(hnp hnp) {
            super(1, hnp);
        }

        public final String getName() {
            return "updateHideStory";
        }

        public final akej getOwner() {
            return akde.a(hnp.class);
        }

        public final String getSignature() {
            return "updateHideStory(J)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            hnp hnp = (hnp) this.receiver;
            long a = abqo.a() / 1000;
            UpdateHideStory updateHideStory = new UpdateHideStory(hnp.b());
            updateHideStory.bind(a, a, longValue);
            hnp.a(updateHideStory);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$t */
    static final class t extends akcq implements akbl<Throwable, ajxw> {
        t(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$v */
    static final class v extends akcq implements akbl<Throwable, ajxw> {
        v(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$x */
    static final class x extends akcq implements akbl<Throwable, ajxw> {
        x(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    /* renamed from: hnr$z */
    static final class z extends akcq implements akbl<Throwable, ajxw> {
        z(hnr hnr) {
            super(1, hnr);
        }

        public final String getName() {
            return "handleError";
        }

        public final akej getOwner() {
            return akde.a(hnr.class);
        }

        public final String getSignature() {
            return "handleError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            hnr.a((hnr) this.receiver, th);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hnr.class), "initializeCompletable", "getInitializeCompletable()Lio/reactivex/Completable;");
    }

    public hnr(hnp hnp, zfw zfw, abqo abqo, gpu gpu, abss abss) {
        akcr.b(hnp, "signalsRepository");
        akcr.b(zfw, "schedulers");
        akcr.b(abqo, "clock");
        akcr.b(gpu, "userSession");
        akcr.b(abss, "releaseManager");
        this.b = hnp;
        this.e = zfw;
        this.f = abqo;
        this.g = abss;
        ajei ajei = new ajei();
        gpu.a.a((ajej) ajei);
        this.c = ajei;
    }

    static double a(double d, long j, long j2) {
        double d2 = (double) j2;
        double d3 = (double) j;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.exp(((d2 - d3) / 86400.0d) * -4.0d) * d;
    }

    private final ajdx<StoryCorpusSignalsRecord> a(long j) {
        hnp hnp = this.b;
        Object b = ajdx.c((Callable) new i(hnp, j)).a((ajfc) new j(hnp, j)).b(hnp.c());
        akcr.a(b, "Single.fromCallable {\n  …  .subscribeOn(scheduler)");
        b = b.a((ajfc) new hnt(new f(this.b)));
        akcr.a(b, "signalsRepository.getSig…ository::getSignalCorpus)");
        return b;
    }

    private static vit a(CorpusInteractionFeaturesRecord corpusInteractionFeaturesRecord) {
        vit vit = new vit();
        vit.a((int) corpusInteractionFeaturesRecord.corpus());
        vit.a((float) corpusInteractionFeaturesRecord.sumLongImpressionScore());
        vit.b((float) corpusInteractionFeaturesRecord.sumShortImpressionScore());
        vit.c((float) corpusInteractionFeaturesRecord.sumShortViewsScore());
        vit.d((float) corpusInteractionFeaturesRecord.sumLongImpressionScore());
        vit.b((int) corpusInteractionFeaturesRecord.numHides());
        vit.c((int) corpusInteractionFeaturesRecord.numSubscribes());
        return vit;
    }

    private static viw a(StoryInteractionSignalsRecord storyInteractionSignalsRecord) {
        viw viw = new viw();
        viw.a(storyInteractionSignalsRecord.tapStoryKey());
        viw.a((int) storyInteractionSignalsRecord.numWatches());
        viw.b((int) (storyInteractionSignalsRecord.maxSnapCompletionPercent() * 100.0d));
        int i = 0;
        int i2 = (storyInteractionSignalsRecord.lastStoryLengthSeconds() <= 0 || storyInteractionSignalsRecord.maxTotalTimeWatched() <= 0.0d) ? 0 : 1;
        if (i2 == 1) {
            i = (int) ((((float) storyInteractionSignalsRecord.maxTotalTimeWatched()) / ((float) storyInteractionSignalsRecord.lastStoryLengthSeconds())) * 100.0f);
        }
        viw.c(i);
        viw.d((int) storyInteractionSignalsRecord.lastViewNumSnapsInStory());
        viw.e((int) storyInteractionSignalsRecord.lastStoryLengthSeconds());
        viw.a(storyInteractionSignalsRecord.isSubscribed());
        viw.b(storyInteractionSignalsRecord.isHidden());
        viw.f((int) storyInteractionSignalsRecord.totalImpressionTimeScore());
        return viw;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0069 in {4, 8, 10, 12} preds:[]
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
    private final defpackage.viw[] e() {
        /*
        r8 = this;
        r0 = r8.b;	 Catch:{ all -> 0x0067 }
        r0 = r0.a();	 Catch:{ all -> 0x0067 }
        r1 = com.snap.core.db.record.StoryInteractionSignalsRecord.FACTORY;	 Catch:{ all -> 0x0067 }
        r2 = 4617315517961601024; // 0x4014000000000000 float:0.0 double:5.0;	 Catch:{ all -> 0x0067 }
        r4 = 0;	 Catch:{ all -> 0x0067 }
        r6 = 100;	 Catch:{ all -> 0x0067 }
        r1 = r1.getUserStoryInteractionFeatures(r2, r4, r6);	 Catch:{ all -> 0x0067 }
        r2 = "StoryInteractionSignalsR…                   limit)";	 Catch:{ all -> 0x0067 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0067 }
        r2 = com.snap.core.db.record.StoryInteractionSignalsRecord.FACTORY;	 Catch:{ all -> 0x0067 }
        r2 = r2.selectAllSignalsMapper();	 Catch:{ all -> 0x0067 }
        r3 = "StoryInteractionSignalsR….selectAllSignalsMapper()";	 Catch:{ all -> 0x0067 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0067 }
        r2 = (defpackage.ainw) r2;	 Catch:{ all -> 0x0067 }
        r0 = r0.query(r1, r2);	 Catch:{ all -> 0x0067 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0067 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0067 }
        r2 = 10;	 Catch:{ all -> 0x0067 }
        r2 = defpackage.ajyn.a(r0, r2);	 Catch:{ all -> 0x0067 }
        r1.<init>(r2);	 Catch:{ all -> 0x0067 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0067 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0067 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0067 }
        if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x0067 }
        r2 = r0.next();	 Catch:{ all -> 0x0067 }
        r2 = (com.snap.core.db.record.StoryInteractionSignalsRecord) r2;	 Catch:{ all -> 0x0067 }
        r2 = defpackage.hnr.a(r2);	 Catch:{ all -> 0x0067 }
        r1.add(r2);	 Catch:{ all -> 0x0067 }
        goto L_0x003b;	 Catch:{ all -> 0x0067 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0067 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0067 }
        r0 = 0;	 Catch:{ all -> 0x0067 }
        r0 = new defpackage.viw[r0];	 Catch:{ all -> 0x0067 }
        r0 = r1.toArray(r0);	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x005f;	 Catch:{ all -> 0x0067 }
        r0 = (defpackage.viw[]) r0;	 Catch:{ all -> 0x0067 }
        return r0;	 Catch:{ all -> 0x0067 }
        r0 = new ajxt;	 Catch:{ all -> 0x0067 }
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x0067 }
        r0.<init>(r1);	 Catch:{ all -> 0x0067 }
        throw r0;	 Catch:{ all -> 0x0067 }
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnr.e():viw[]");
    }

    private final ajdx<Long> f(hio hio) {
        Object b = hio.af().b();
        hnp hnp = this.b;
        akcr.a(b, "storyId");
        Object b2 = hnp.a(b, hio.b().c()).b((ajeb) this.b.a(b, (long) hio.af().a(), hio.b().c(), hio.g().f(), hio.q()));
        akcr.a(b2, "signalsRepository.maybeR…  cardData.isSubscribed))");
        return b2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0062 in {4, 8, 10, 12} preds:[]
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
    private final defpackage.vit[] f() {
        /*
        r4 = this;
        r0 = r4.b;	 Catch:{ all -> 0x0060 }
        r0 = r0.a();	 Catch:{ all -> 0x0060 }
        r1 = com.snap.core.db.record.StoryInteractionSignalsRecord.FACTORY;	 Catch:{ all -> 0x0060 }
        r2 = "StoryInteractionSignalsRecord.FACTORY";	 Catch:{ all -> 0x0060 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0060 }
        r1 = r1.getCorpusInteractionFeatures();	 Catch:{ all -> 0x0060 }
        r2 = "StoryInteractionSignalsR…corpusInteractionFeatures";	 Catch:{ all -> 0x0060 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0060 }
        r2 = com.snap.core.db.record.StoryInteractionSignalsRecord.CORPUS_INTERACTION_FEATURES_MAPPER;	 Catch:{ all -> 0x0060 }
        r3 = "StoryInteractionSignalsR…TERACTION_FEATURES_MAPPER";	 Catch:{ all -> 0x0060 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0060 }
        r0 = r0.query(r1, r2);	 Catch:{ all -> 0x0060 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0060 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0060 }
        r2 = 10;	 Catch:{ all -> 0x0060 }
        r2 = defpackage.ajyn.a(r0, r2);	 Catch:{ all -> 0x0060 }
        r1.<init>(r2);	 Catch:{ all -> 0x0060 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0060 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0060 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0060 }
        if (r2 == 0) goto L_0x0048;	 Catch:{ all -> 0x0060 }
        r2 = r0.next();	 Catch:{ all -> 0x0060 }
        r2 = (com.snap.core.db.record.StoryInteractionSignalsRecord.CorpusInteractionFeaturesRecord) r2;	 Catch:{ all -> 0x0060 }
        r2 = defpackage.hnr.a(r2);	 Catch:{ all -> 0x0060 }
        r1.add(r2);	 Catch:{ all -> 0x0060 }
        goto L_0x0034;	 Catch:{ all -> 0x0060 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0060 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0060 }
        r0 = 0;	 Catch:{ all -> 0x0060 }
        r0 = new defpackage.vit[r0];	 Catch:{ all -> 0x0060 }
        r0 = r1.toArray(r0);	 Catch:{ all -> 0x0060 }
        if (r0 == 0) goto L_0x0058;	 Catch:{ all -> 0x0060 }
        r0 = (defpackage.vit[]) r0;	 Catch:{ all -> 0x0060 }
        return r0;	 Catch:{ all -> 0x0060 }
        r0 = new ajxt;	 Catch:{ all -> 0x0060 }
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ all -> 0x0060 }
        r0.<init>(r1);	 Catch:{ all -> 0x0060 }
        throw r0;	 Catch:{ all -> 0x0060 }
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnr.f():vit[]");
    }

    private final ajdx<StoryInteractionSignalsRecord> g(hio hio) {
        Object a = f(hio).a((ajfc) new hnt(new j(this.b)));
        akcr.a(a, "getRowIdByCard(cardData)…itory::getSignalsByRowId)");
        return a;
    }

    private final ajdx<ajxm<StoryInteractionSignalsRecord, StoryCorpusSignalsRecord>> h(hio hio) {
        return hbl.a(g(hio), a((long) hio.af().a()));
    }

    public final ajcx D_() {
        return (ajcx) this.d.b();
    }

    public final void E_() {
    }

    public final void F_() {
    }

    public final void G_() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x00fc in {3, 7, 11, 13} preds:[]
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
    public final defpackage.ajdx<java.util.Map<defpackage.hio, defpackage.hcg>> a(java.util.List<? extends defpackage.hio> r10) {
        /*
        r9 = this;
        r0 = "dataModels";
        defpackage.akcr.b(r10, r0);
        r0 = r10;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = 10;
        r3 = defpackage.ajyn.a(r0, r2);
        r1.<init>(r3);
        r1 = (java.util.Collection) r1;
        r3 = r0.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0042;
        r4 = r3.next();
        r4 = (defpackage.hio) r4;
        r5 = new ajxm;
        r6 = r4.af();
        r6 = r6.b();
        r4 = r4.b();
        r7 = r4.c();
        r4 = java.lang.Long.valueOf(r7);
        r5.<init>(r6, r4);
        r1.add(r5);
        goto L_0x0019;
        r1 = (java.util.List) r1;
        r3 = new java.util.ArrayList;
        r2 = defpackage.ajyn.a(r0, r2);
        r3.<init>(r2);
        r3 = (java.util.Collection) r3;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x006b;
        r2 = r0.next();
        r2 = (defpackage.hio) r2;
        r2 = r2.af();
        r2 = r2.b();
        r3.add(r2);
        goto L_0x0053;
        r3 = (java.util.List) r3;
        r3 = (java.util.Collection) r3;
        r0 = 0;
        r0 = new java.lang.String[r0];
        r0 = r3.toArray(r0);
        if (r0 == 0) goto L_0x00f4;
        r0 = (java.lang.String[]) r0;
        r2 = r9.b;
        r3 = "storyIdVersionPairList";
        defpackage.akcr.b(r1, r3);
        r3 = r2.a();
        r4 = new hnp$q;
        r4.<init>(r2, r1);
        r4 = (defpackage.akbl) r4;
        r1 = "df:maybeResetSignalsForNewVersions";
        r1 = r3.runInTransaction(r1, r4);
        r2 = r2.c();
        r1 = r1.b(r2);
        r2 = "dbClient.runInTransactio… }.subscribeOn(scheduler)";
        defpackage.akcr.a(r1, r2);
        r2 = r9.b;
        r3 = "storyIds";
        defpackage.akcr.b(r0, r3);
        r3 = r2.a();
        r4 = com.snap.core.db.record.StoryInteractionSignalsRecord.FACTORY;
        r0 = r4.bulkSelectSignals(r0);
        r4 = "StoryInteractionSignalsR…lkSelectSignals(storyIds)";
        defpackage.akcr.a(r0, r4);
        r4 = new hnp$m;
        r5 = com.snap.core.db.record.StoryInteractionSignalsRecord.BULK_SELECT_SIGNALS_MAPPER;
        r4.<init>(r5);
        r4 = (defpackage.akbl) r4;
        r5 = "df:getSignalsByStoryIds";
        r0 = r3.queryAndMapToList(r5, r0, r4);
        r0 = r0.e();
        r2 = r2.c();
        r0 = r0.b(r2);
        r2 = "dbClient.queryAndMapToLi…  .subscribeOn(scheduler)";
        defpackage.akcr.a(r0, r2);
        r0 = (defpackage.ajeb) r0;
        r0 = r1.b(r0);
        r1 = defpackage.hnr.h.a;
        r1 = (defpackage.ajfc) r1;
        r0 = r0.f(r1);
        r1 = new hnr$i;
        r1.<init>(r9, r10);
        r1 = (defpackage.ajfc) r1;
        r10 = r0.f(r1);
        r0 = "signalsRepository.maybeR…     })\n                }";
        defpackage.akcr.a(r10, r0);
        return r10;
        r10 = new ajxt;
        r0 = "null cannot be cast to non-null type kotlin.Array<T>";
        r10.<init>(r0);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnr.a(java.util.List):ajdx");
    }

    public final ajdx<Map<Long, hce>> a(Set<Long> set) {
        akcr.b(set, "set");
        hnp hnp = this.b;
        List k = ajyu.k(set);
        akcr.b(k, "corpora");
        DbClient a = hnp.a();
        Object storyCorpusBulkSelectSignals = StoryCorpusSignalsRecord.FACTORY.storyCorpusBulkSelectSignals(ajyu.g((Collection) k));
        akcr.a(storyCorpusBulkSelectSignals, "StoryCorpusSignalsRecord…ls(corpora.toLongArray())");
        Object b = a.queryAndMapToList("df:bulkSelectStoryCorpusSignals", storyCorpusBulkSelectSignals, new hnp.a(StoryCorpusSignalsRecord.MAPPER)).e().b(hnp.c());
        akcr.a(b, "dbClient.queryAndMapToLi…  .subscribeOn(scheduler)");
        Object f = b.f(new b(this, set));
        akcr.a(f, "signalsRepository.bulkSe… result\n                }");
        return f;
    }

    public final List<Long> a() {
        DbClient a = this.b.a();
        Object recentTapsWithLongView = StoryInteractionSignalsRecord.FACTORY.getRecentTapsWithLongView(50);
        akcr.a(recentTapsWithLongView, "StoryInteractionSignalsR…ntTapsWithLongView(limit)");
        Object obj = StoryInteractionSignalsRecord.FACTORY;
        akcr.a(obj, "StoryInteractionSignalsRecord.FACTORY");
        obj = obj.getRecentTapsWithLongViewMapper();
        akcr.a(obj, "StoryInteractionSignalsR…entTapsWithLongViewMapper");
        return a.query(recentTapsWithLongView, obj);
    }

    public final void a(double d, double d2, zyr zyr, hjd hjd) {
        akcr.b(hjd, "discoverFeedSection");
    }

    public final void a(hio hio) {
        akcr.b(hio, "baseCardData");
    }

    public final void a(hio hio, double d) {
        akcr.b(hio, UnlockablesModel.DATA);
        ajej a = g(hio).b((ajdw) this.e.f()).a((ajfb) new w(this), (ajfb) new hns(new x(this)));
        akcr.a((Object) a, "getSignalsByCard(data)\n …        }, ::handleError)");
        ajvv.a(a, this.c);
    }

    public final void a(hio hio, long j, float f, abpq abpq) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(abpq, "cardSize");
    }

    public final void a(hio hio, abey abey, zyr zyr) {
        akcr.b(hio, "baseCardData");
        akcr.b(abey, "storyFeedActionType");
    }

    public final void a(hio hio, String str) {
        akcr.b(hio, "baseCardData");
    }

    public final void a(hio hio, String str, float f) {
    }

    public final void a(hio hio, String str, Long l) {
    }

    public final void a(hio hio, String str, Long l, aajr aajr, aajv aajv, aasc aasc, Double d, Double d2, Long l2, Long l3, Long l4, Double d3, abfl abfl, abfh abfh, String str2, int i, String str3) {
    }

    public final void a(hio hio, zyr zyr, double d, double d2, double d3, Boolean bool, abfh abfh, String str, int i, String str2) {
        akcr.b(hio, UnlockablesModel.DATA);
        ajej a = h(hio).b((ajdw) this.e.f()).a((ajfb) new u(this, hio, d3), (ajfb) new hns(new v(this)));
        akcr.a((Object) a, "getInteractionAndCorpusS…         },::handleError)");
        ajvv.a(a, this.c);
    }

    public final void a(hio hio, zyr zyr, Boolean bool, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
        ajej a = g(hio).b((ajdw) this.e.f()).a((ajfb) new y(this), (ajfb) new hns(new z(this)));
        akcr.a((Object) a, "getSignalsByCard(data)\n …        }, ::handleError)");
        ajvv.a(a, this.c);
    }

    public final void a(hio hio, zyr zyr, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
    }

    public final void a(hio hio, zyr zyr, String str, Long l, abfb abfb, String str2, abfh abfh) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
        ajej a = f(hio).a((ajfb) new hns(new q(this.b)), (ajfb) new hns(new r(this)));
        akcr.a((Object) a, "getRowIdByCard(data)\n   …riteStory, ::handleError)");
        ajvv.a(a, this.c);
    }

    public final void a(hio hio, zyr zyr, String str, Long l, abfh abfh) {
    }

    public final void a(hio hio, zyr zyr, String str, Long l, String str2) {
        akcr.b(hio, "baseCardData");
    }

    public final void a(hio hio, zza zza, zyz zyz, abpq abpq) {
        akcr.b(hio, "baseCardData");
        akcr.b(zyz, "exitType");
    }

    public final void a(hio hio, boolean z, Double d, Double d2, Double d3, Long l, Integer num, int i, int i2, boolean z2, int i3) {
        hio hio2 = hio;
        akcr.b(hio, UnlockablesModel.DATA);
        Object k = hio.g().k();
        akcr.a(k, "data.cardLoggingInfo().discoverFeedSection()");
        Object c = hio.c();
        akcr.a(c, "data.cardId()");
        boolean z3 = z2 || hio.r();
        this.e.f().a((Runnable) new af(this, k, c, z3));
        ajej a = h(hio).b((ajdw) this.e.f()).a((ajfb) new aa(this, d, d3, hio, i3, num, z2, l), (ajfb) new hns(new ab(this)));
        akcr.a((Object) a, "getInteractionAndCorpusS…        }, ::handleError)");
        ajvv.a(a, this.c);
    }

    public final void a(hjd hjd) {
        akcr.b(hjd, "section");
    }

    public final void a(hjd hjd, zyr zyr) {
        akcr.b(hjd, "section");
    }

    public final void a(hkm hkm) {
        akcr.b(hkm, "storiesDataModels");
        this.e.f().a((Runnable) new m(this, hkm));
    }

    public final void a(Double d, zyr zyr) {
    }

    public final void a(boolean z, boolean z2) {
    }

    /* Access modifiers changed, original: final */
    public final a b(hjd hjd) {
        a aVar;
        Object obj = this.a;
        akcr.a(obj, "sectionInteractionMap");
        synchronized (obj) {
            if (!this.a.containsKey(hjd)) {
                Object obj2 = this.a;
                akcr.a(obj2, "sectionInteractionMap");
                ((Map) obj2).put(hjd, new a());
            }
            Object obj3 = this.a.get(hjd);
            if (obj3 == null) {
                akcr.a();
            }
            aVar = (a) obj3;
        }
        return aVar;
    }

    public final viu b() {
        viu viu = new viu();
        viu.a = e();
        viu.b = f();
        return viu;
    }

    public final void b(hio hio) {
        akcr.b(hio, "baseCardData");
    }

    public final void b(hio hio, String str) {
        akcr.b(hio, "baseCardData");
    }

    public final void b(hio hio, zyr zyr, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
    }

    public final void b(hio hio, zyr zyr, String str, Long l, abfb abfb, String str2, abfh abfh) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
        ajej a = f(hio).a((ajfb) new hns(new ac(this.b)), (ajfb) new hns(new ad(this)));
        akcr.a((Object) a, "getRowIdByCard(data)\n   …riteStory, ::handleError)");
        ajvv.a(a, this.c);
    }

    public final /* synthetic */ void b(hio hio, zyr zyr, String str, Long l, String str2) {
        l.longValue();
        akcr.b(hio, "baseCardData");
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
        akcr.b(str, "subItemId");
    }

    public final void b(Double d, zyr zyr) {
    }

    public final ajdx<Map<hjd, a>> c() {
        Object b = ajdx.c((Callable) new g(this)).b((ajdw) this.e.f());
        akcr.a(b, "Single.fromCallable {\n  …scribeOn(schedulers.io())");
        return b;
    }

    public final void c(hio hio) {
        akcr.b(hio, "baseCardData");
    }

    public final void c(hio hio, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
    }

    public final void c(hio hio, zyr zyr, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
        ajej a = f(hio).a((ajfb) new hns(new s(this.b)), (ajfb) new hns(new t(this)));
        akcr.a((Object) a, "getRowIdByCard(data)\n   …HideStory, ::handleError)");
        ajvv.a(a, this.c);
    }

    public final void d() {
        this.e.f().a((Runnable) new c(this));
    }

    public final void d(hio hio) {
        akcr.b(hio, UnlockablesModel.DATA);
        Object k = hio.g().k();
        akcr.a(k, "data.cardLoggingInfo().discoverFeedSection()");
        Object c = hio.c();
        akcr.a(c, "data.cardId()");
        this.e.f().a((Runnable) new ae(this, k, c));
    }

    public final void d(hio hio, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
    }

    public final void d(hio hio, zyr zyr, String str) {
        akcr.b(hio, UnlockablesModel.DATA);
        akcr.b(zyr, MapboxEvent.KEY_GESTURE_ID);
    }

    public final void e(hio hio) {
    }
}
