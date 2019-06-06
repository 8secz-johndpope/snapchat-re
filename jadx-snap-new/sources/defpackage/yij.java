package defpackage;

import android.text.TextUtils;
import com.brightcove.player.event.Event;
import com.google.common.base.Optional;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.MobStoryMetadataRecord;
import com.snap.core.db.record.MobStoryMetadataRecord.SelectMobStoryMetadataRecord;
import com.snap.core.db.record.StoryModel.Factory;
import com.snap.core.db.record.StoryNoteRecord;
import com.snap.core.db.record.StoryNoteRecord.SelectStoryNotesViewerSearchRecord;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StoryRecord.PlayableStoryRecord;
import com.snap.core.db.record.StoryRecord.UserManagedStoryRecord;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.BrandFriendliness;
import com.snap.core.db.record.StorySnapRecord.PlayableStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStoryManagementChromeDataRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByStoryRowIdRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByUsernameRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementPlayableStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStoryMetadataRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import defpackage.yip.aa;
import defpackage.yip.ak;
import defpackage.yip.d;
import defpackage.ylo.b;
import defpackage.ylo.c;
import defpackage.ylo.e;
import defpackage.ylo.i;
import defpackage.ylq.f;
import defpackage.ylq.j;
import defpackage.ylq.k;
import defpackage.ylq.n;
import defpackage.ylq.o;
import defpackage.ylq.p;
import defpackage.ylq.q;
import defpackage.ylq.r;
import defpackage.ylq.s;
import defpackage.ylq.u;
import defpackage.ylq.v;
import defpackage.ylq.w;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: yij */
public final class yij implements yhx {
    private final ajxe a;
    private final ajxe b;

    /* renamed from: yij$d */
    static final class d extends akcq implements akbk<yip> {
        d(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yip) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yij$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(yhy.j.callsite("StoriesDataProvider"));
        }
    }

    /* renamed from: yij$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            akcr.b(list, Event.LIST);
            return new zng(znk.a(list));
        }
    }

    /* renamed from: yij$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yij.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/client/StoryRepositoryClient;"), new akdc(akde.a(yij.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public yij(zgb zgb, ajwy<yip> ajwy) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "storyRepositoryProvider");
        this.a = ajxh.a(new d(ajwy));
        this.b = ajxh.a(new b(zgb));
    }

    public final ajdp<List<UserManagedStoryRecord>> a() {
        yip d = d();
        Object d2 = d.h.d((ajfc) new d(d));
        akcr.a(d2, "currentUsername.flatMapO…Stories(it)\n            }");
        d2 = d2.b((ajdw) e().i());
        akcr.a(d2, "storyRepository.currentU…eOn(schedulers.queries())");
        return d2;
    }

    public final ajdp<StoryRecord> a(long j) {
        ylo i = d().i();
        Object selectByStoryRowId = StoryRecord.FACTORY.selectByStoryRowId(j);
        akcr.a(selectByStoryRowId, "StoryRecord.FACTORY.selectByStoryRowId(storyRowId)");
        selectByStoryRowId = i.c.queryAndMapToOne("s:getStoryRecordByRowId", selectByStoryRowId, e.a).b((ajdw) e().i());
        akcr.a(selectByStoryRowId, "storyRepository.getStory…eOn(schedulers.queries())");
        return selectByStoryRowId;
    }

    public final ajdp<znh<SelectStoryNotesViewerSearchRecord>> a(String str, String str2, long j) {
        String str3 = "snapId";
        akcr.b(str, str3);
        String str4 = "viewerSearchSubstring";
        akcr.b(str2, str4);
        yip d = d();
        akcr.b(str, str3);
        akcr.b(str2, str4);
        ylp l = d.l();
        akcr.b(str, str3);
        akcr.b(str2, str4);
        str4 = "%";
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder stringBuilder = new StringBuilder(str4);
            stringBuilder.append(str2);
            stringBuilder.append(str4);
            str4 = stringBuilder.toString();
        }
        Object selectStoryNotesViewerSearch = StoryNoteRecord.FACTORY.selectStoryNotesViewerSearch(Long.valueOf(j), str, str4, str4);
        akcr.a(selectStoryNotesViewerSearch, "StoryNoteRecord.FACTORY.…chPattern, searchPattern)");
        selectStoryNotesViewerSearch = l.a.queryAndMapToList("s:selectStoryNotesViewerSearch", selectStoryNotesViewerSearch, ylp.d.a).p(c.a).b((ajdw) e().i());
        akcr.a(selectStoryNotesViewerSearch, "storyRepository.getStory…eOn(schedulers.queries())");
        return selectStoryNotesViewerSearch;
    }

    public final ajdp<List<StoryManagementStorySnapRecord>> a(List<Long> list, boolean z) {
        String str = "storyRowIds";
        akcr.b(list, str);
        yip d = d();
        akcr.b(list, str);
        ylq h = d.h();
        String str2 = d.k;
        if (str2 == null) {
            akcr.a();
        }
        Object b = h.a((List) list, str2, z).b((ajdw) e().i());
        akcr.a(b, "storyRepository.getStory…eOn(schedulers.queries())");
        return b;
    }

    public final ajdp<SelectStoryManagementChromeDataRecord> a(ylg ylg) {
        String str = "storySnapKey";
        akcr.b(ylg, str);
        yip d = d();
        akcr.b(ylg, str);
        ylq h = d.h();
        akcr.b(ylg, str);
        yle yle = ylg.a;
        Object selectStoryManagementChromeData = StorySnapRecord.FACTORY.selectStoryManagementChromeData(StoryRecord.FACTORY, yle.a, yle.b, ylg.b);
        akcr.a(selectStoryManagementChromeData, "StorySnapRecord.FACTORY.…napKey.clientId\n        )");
        selectStoryManagementChromeData = h.a.queryAndMapToOne("s:getStoryManagementChromeData", selectStoryManagementChromeData, j.a).b((ajdw) e().i());
        akcr.a(selectStoryManagementChromeData, "storyRepository.storyMan…eOn(schedulers.queries())");
        return selectStoryManagementChromeData;
    }

    public final ajdx<List<PlayableStorySnapRecord>> a(String str) {
        String str2 = "username";
        akcr.b(str, str2);
        yip d = d();
        akcr.b(str, str2);
        ylq h = d.h();
        akcr.b(str, str2);
        Object selectFriendStorySnapsForPlaying = StorySnapRecord.FACTORY.selectFriendStorySnapsForPlaying(str);
        akcr.a(selectFriendStorySnapsForPlaying, "StorySnapRecord.FACTORY.…SnapsForPlaying(username)");
        selectFriendStorySnapsForPlaying = h.a.queryAndMapToList("s:getStorySnapsForPlaying_storyRowId", selectFriendStorySnapsForPlaying, ylq.e.a).p(new f(h));
        akcr.a(selectFriendStorySnapsForPlaying, "db.queryAndMapToList(\"s:…            res\n        }");
        selectFriendStorySnapsForPlaying = selectFriendStorySnapsForPlaying.d((Object) ajyw.a).b((ajdw) e().i());
        akcr.a(selectFriendStorySnapsForPlaying, "storyRepository.getPlaya…eOn(schedulers.queries())");
        return selectFriendStorySnapsForPlaying;
    }

    public final ajdx<Map<String, List<BrandFriendliness>>> a(List<String> list) {
        String str = "storyIds";
        akcr.b(list, str);
        yip d = d();
        akcr.b(list, str);
        ylq h = d.h();
        akcr.b(list, str);
        Object f = ajdx.c((Callable) new u(h, list)).f(v.a);
        akcr.a(f, "Single.fromCallable {\n  …it.storyId() }, { it }) }");
        f = f.b((ajdw) e().i());
        akcr.a(f, "storyRepository.getStory…eOn(schedulers.queries())");
        return f;
    }

    public final ajdx<Optional<Long>> a(yle yle) {
        String str = "key";
        akcr.b(yle, str);
        yip d = d();
        akcr.b(yle, str);
        Object c = ajdx.c((Callable) new ak(d, yle));
        akcr.a(c, "Single.fromCallable {\n  …storyKind))\n            }");
        c = c.b((ajdw) e().i());
        akcr.a(c, "storyRepository.storyRow…eOn(schedulers.queries())");
        return c;
    }

    public final ajdp<Long> b() {
        return d().l;
    }

    public final ajdp<Optional<SelectStorySnapForThumbnailByUsernameRecord>> b(String str) {
        String str2 = "username";
        akcr.b(str, str2);
        yip d = d();
        akcr.b(str, str2);
        ylq h = d.h();
        akcr.b(str, str2);
        Object selectStorySnapForThumbnailByUsername = StorySnapRecord.FACTORY.selectStorySnapForThumbnailByUsername(StoryRecord.FACTORY, str, new StoryKind[]{StoryKind.USER_SHARE});
        akcr.a(selectStorySnapForThumbnailByUsername, "StorySnapRecord.FACTORY\n…Of(StoryKind.USER_SHARE))");
        selectStorySnapForThumbnailByUsername = h.a.queryAndMapToList("s:getStorySnapForThumbnail_username", selectStorySnapForThumbnailByUsername, p.a).p(q.a);
        akcr.a(selectStorySnapForThumbnailByUsername, "db.queryAndMapToList(\"s:…l.of(result[0])\n        }");
        selectStorySnapForThumbnailByUsername = selectStorySnapForThumbnailByUsername.b((ajdw) e().i());
        akcr.a(selectStorySnapForThumbnailByUsername, "storyRepository.getStory…eOn(schedulers.queries())");
        return selectStorySnapForThumbnailByUsername;
    }

    public final ajdp<List<StoryManagementStoryMetadataRecord>> b(List<Long> list) {
        String str = "storyRowIds";
        akcr.b(list, str);
        yip d = d();
        akcr.b(list, str);
        ylq h = d.h();
        akcr.b(list, str);
        Object storyManagementStoriesMetadata = StorySnapRecord.FACTORY.getStoryManagementStoriesMetadata(ajyu.g((Collection) list));
        akcr.a(storyManagementStoriesMetadata, "StorySnapRecord.FACTORY.…toryRowIds.toLongArray())");
        storyManagementStoriesMetadata = h.a.queryAndMapToList("s:getStoryManagementStoriesMetadata", storyManagementStoriesMetadata, k.a).b((ajdw) e().i());
        akcr.a(storyManagementStoriesMetadata, "storyRepository.getStory…eOn(schedulers.queries())");
        return storyManagementStoriesMetadata;
    }

    public final ajdp<Optional<StoryRecord>> b(yle yle) {
        String str = "key";
        akcr.b(yle, str);
        yip d = d();
        akcr.b(yle, str);
        ylo i = d.i();
        akcr.b(yle, "storyKey");
        Object selectByStoryKey = StoryRecord.FACTORY.selectByStoryKey(yle.a, yle.b);
        akcr.a(selectByStoryKey, "StoryRecord.FACTORY.sele…ryId, storyKey.storyKind)");
        selectByStoryKey = i.c.queryAndMapToList("s:getStoryRecordByKey", selectByStoryKey, c.a).p(ylo.d.a);
        akcr.a(selectByStoryKey, "dbClient.queryAndMapToLi…      }\n                }");
        selectByStoryKey = selectByStoryKey.b((ajdw) e().i());
        akcr.a(selectByStoryKey, "storyRepository.getStory…eOn(schedulers.queries())");
        return selectByStoryKey;
    }

    public final ajdx<List<PlayableStorySnapRecord>> b(long j) {
        ylq h = d().h();
        Object selectStorySnapsForPlaying = StorySnapRecord.FACTORY.selectStorySnapsForPlaying(j);
        akcr.a(selectStorySnapsForPlaying, "StorySnapRecord.FACTORY.…apsForPlaying(storyRowId)");
        selectStorySnapsForPlaying = h.a.queryAndMapToList("s:getStorySnapsForPlaying_storyRowId", selectStorySnapsForPlaying, w.a).d((Object) ajyw.a).b((ajdw) e().i());
        akcr.a(selectStorySnapsForPlaying, "storyRepository.getPlaya…eOn(schedulers.queries())");
        return selectStorySnapsForPlaying;
    }

    public final ajdp<znh<StoryManagementStorySnapRecord>> c() {
        yip d = d();
        ylo i = d.i();
        StoryKind storyKind = StoryKind.OUR;
        String str = "glssubmittolive";
        akcr.b(str, "storyId");
        akcr.b(storyKind, "kind");
        Object storyRowIdByStoryKey = StoryRecord.FACTORY.getStoryRowIdByStoryKey(str, storyKind);
        akcr.a(storyRowIdByStoryKey, "StoryRecord.FACTORY.getS…ByStoryKey(storyId, kind)");
        Object p = i.c.queryAndMapToList("s:storyRowIdByStoryKey", storyRowIdByStoryKey, ylo.j.a).p(i.a);
        akcr.a(p, "observeResults.map {\n   …)\n            }\n        }");
        Object k = p.k((ajfc) new aa(d));
        akcr.a(k, "storyData.storyRowIdBySt…      }\n                }");
        k = k.p(a.a).b((ajdw) e().i());
        akcr.a(k, "storyRepository.ourStory…eOn(schedulers.queries())");
        return k;
    }

    public final ajdp<Optional<SelectMobStoryMetadataRecord>> c(String str) {
        String str2 = "mobStoryId";
        akcr.b(str, str2);
        yip d = d();
        akcr.b(str, str2);
        yll n = d.n();
        akcr.b(str, "storyId");
        Object selectMobStoryMetadata = MobStoryMetadataRecord.Companion.getFACTORY().selectMobStoryMetadata(str);
        akcr.a(selectMobStoryMetadata, "MobStoryMetadataRecord.F…MobStoryMetadata(storyId)");
        selectMobStoryMetadata = n.a().queryAndMapToList("s:getMobStoryMetadata", selectMobStoryMetadata, yll.c.a).p(yll.d.a);
        akcr.a(selectMobStoryMetadata, "dbClient.queryAndMapToLi…ional.of(it[0])\n        }");
        selectMobStoryMetadata = selectMobStoryMetadata.b((ajdw) e().i());
        akcr.a(selectMobStoryMetadata, "storyRepository.mobStory…eOn(schedulers.queries())");
        return selectMobStoryMetadata;
    }

    public final ajdx<PlayableStorySnapRecord> c(long j) {
        ylq h = d().h();
        Object selectStorySnapForPlayingBySnapRowId = StorySnapRecord.FACTORY.selectStorySnapForPlayingBySnapRowId(j);
        akcr.a(selectStorySnapForPlayingBySnapRowId, "StorySnapRecord.FACTORY.…ingBySnapRowId(snapRowId)");
        selectStorySnapForPlayingBySnapRowId = h.a.queryAndMapToOne("s:getStorySnapsForPlaying_snapRowId", selectStorySnapForPlayingBySnapRowId, o.a).e();
        akcr.a(selectStorySnapForPlayingBySnapRowId, "storySnapData\n          …          .firstOrError()");
        selectStorySnapForPlayingBySnapRowId = selectStorySnapForPlayingBySnapRowId.b((ajdw) e().i());
        akcr.a(selectStorySnapForPlayingBySnapRowId, "storyRepository.getPlaya…eOn(schedulers.queries())");
        return selectStorySnapForPlayingBySnapRowId;
    }

    public final ajdx<PlayableStoryRecord> d(long j) {
        ylo i = d().i();
        Long valueOf = Long.valueOf(j);
        Factory factory = StoryRecord.FACTORY;
        if (valueOf == null) {
            akcr.a();
        }
        Object selectPlayableStory = factory.selectPlayableStory(valueOf.longValue());
        akcr.a(selectPlayableStory, "StoryRecord.FACTORY.sele…ayableStory(storyRowId!!)");
        selectPlayableStory = ajdx.c((Callable) new b(i, selectPlayableStory));
        akcr.a(selectPlayableStory, "Single.fromCallable { db…_PLAYABLE_STORY_MAPPER) }");
        selectPlayableStory = selectPlayableStory.b((ajdw) e().i());
        akcr.a(selectPlayableStory, "storyRepository.getPlaya…eOn(schedulers.queries())");
        return selectPlayableStory;
    }

    public final yip d() {
        return (yip) this.a.b();
    }

    public final ajdp<Optional<SelectStorySnapForThumbnailByStoryRowIdRecord>> e(long j) {
        ylq h = d().h();
        Object selectStorySnapForThumbnailByStoryRowId = StorySnapRecord.FACTORY.selectStorySnapForThumbnailByStoryRowId(j);
        akcr.a(selectStorySnapForThumbnailByStoryRowId, "StorySnapRecord.FACTORY\n…lByStoryRowId(storyRowId)");
        selectStorySnapForThumbnailByStoryRowId = h.a.queryAndMapToList("s:getStorySnapForThumbnail_storyRowId", selectStorySnapForThumbnailByStoryRowId, r.a).p(s.a);
        akcr.a(selectStorySnapForThumbnailByStoryRowId, "db.queryAndMapToList(\"s:…l.of(result[0])\n        }");
        selectStorySnapForThumbnailByStoryRowId = selectStorySnapForThumbnailByStoryRowId.b((ajdw) e().i());
        akcr.a(selectStorySnapForThumbnailByStoryRowId, "storyRepository.getStory…eOn(schedulers.queries())");
        return selectStorySnapForThumbnailByStoryRowId;
    }

    public final zfw e() {
        return (zfw) this.b.b();
    }

    public final ajdx<List<StoryManagementPlayableStorySnapRecord>> f(long j) {
        yip d = d();
        ylq h = d.h();
        String str = d.k;
        if (str == null) {
            akcr.a();
        }
        akcr.b(str, "currentUsername");
        Object storyManagementStorySnapsForPlaying = StorySnapRecord.FACTORY.getStoryManagementStorySnapsForPlaying(j, str);
        akcr.a(storyManagementStorySnapsForPlaying, "StorySnapRecord.FACTORY.…ryRowId, currentUsername)");
        storyManagementStorySnapsForPlaying = h.a.queryAndMapToList("s:getStoryManagementStorySnapsForPlaying_storyRowId", storyManagementStorySnapsForPlaying, n.a).d((Object) ajyw.a).b((ajdw) e().i());
        akcr.a(storyManagementStorySnapsForPlaying, "storyRepository.getStory…eOn(schedulers.queries())");
        return storyManagementStorySnapsForPlaying;
    }

    public final ajdx<List<String>> g(long j) {
        Object c = ajdx.c((Callable) new yip.r(d(), j));
        akcr.a(c, "Single.fromCallable {\n  …storyRowId)\n            }");
        c = c.b((ajdw) e().i());
        akcr.a(c, "storyRepository.failedRe…eOn(schedulers.queries())");
        return c;
    }
}
