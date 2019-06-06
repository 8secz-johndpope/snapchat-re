package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.query.FriendsFeedSuggestedFriendsModel.SelectSuggestedFriendsModel;
import com.snap.core.db.query.LegacyFriendsFeedQueries;
import com.snap.core.db.query.LegacyFriendsFeedQueries.PlayableStoryRecord;
import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;
import com.snap.core.db.query.LegacyFriendsFeedSuggestedFriendQueries;
import com.snap.core.db.query.LegacyFriendsFeedSuggestedFriendQueries.WithDisplayInfo;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;
import defpackage.itp.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: qwy */
public final class qwy implements qxm {
    public final ajxe a;
    public final qvg b;
    private final ajxe c;

    /* renamed from: qwy$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.get()).getDbClient((ide) qxo.b);
        }
    }

    /* renamed from: qwy$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<Object> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj2 : iterable) {
                akcr.a(obj2, "suggestedFriend");
                arrayList.add(a.a((SelectSuggestedFriendsModel) obj2, false));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: qwy$c */
    static final class c extends akcq implements akbl<Cursor, WithFriendAndStory> {
        c(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (WithFriendAndStory) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: qwy$f */
    static final class f extends akcq implements akbl<Cursor, WithDisplayInfo> {
        f(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (WithDisplayInfo) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: qwy$d */
    static final class d extends akcq implements akbl<Cursor, Long> {
        d(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (Long) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: qwy$b */
    static final class b extends akcq implements akbk<iqz> {
        b(ajwy ajwy) {
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
            return (iqz) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qwy$e */
    static final class e extends akcq implements akbl<Cursor, PlayableStoryRecord> {
        e(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (PlayableStoryRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qwy.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(qwy.class), "friendmojiApi", "getFriendmojiApi()Lcom/snap/identity/api/FriendmojiApi;")};
    }

    public qwy(ajwy<SnapDb> ajwy, qvg qvg, ajwy<iqz> ajwy2) {
        akcr.b(ajwy, "snapDbProvider");
        akcr.b(qvg, "multiRecipientSendingSnapRepository");
        akcr.b(ajwy2, "friendmojiApiProvider");
        this.b = qvg;
        this.c = ajxh.a(new a(ajwy));
        this.a = ajxh.a(new b(ajwy2));
    }

    private final DbClient c() {
        return (DbClient) this.c.b();
    }

    public final ajdp<List<WithFriendAndStory>> a(int i) {
        Object selectLatest = LegacyFriendsFeedQueries.FACTORY.selectLatest((long) i);
        akcr.a(selectLatest, "LegacyFriendsFeedQueries…test(fetchLimit.toLong())");
        return c().queryAndMapToList("ff:latest", selectLatest, new c(LegacyFriendsFeedQueries.LATEST_FEEDS_MAPPER));
    }

    public final ajdp<List<itp>> a(FriendSuggestionPlacement friendSuggestionPlacement) {
        akcr.b(friendSuggestionPlacement, "friendSuggestionPlacement");
        Object selectSuggestedFriends = LegacyFriendsFeedSuggestedFriendQueries.FACTORY.selectSuggestedFriends(SuggestedFriendPlacementRecord.FACTORY, friendSuggestionPlacement);
        akcr.a(selectSuggestedFriends, "LegacyFriendsFeedSuggest…estionPlacement\n        )");
        selectSuggestedFriends = c().queryAndMapToList("ff:suggested", selectSuggestedFriends, new f(LegacyFriendsFeedSuggestedFriendQueries.ALL_SUGGESTED_IN_PLACEMENT_MAPPER)).p(g.a);
        akcr.a(selectSuggestedFriends, "dbClient.queryAndMapToLi…iend) }\n                }");
        return selectSuggestedFriends;
    }

    public final ajdx<List<PlayableStoryRecord>> a(long j) {
        Object selectStoriesForPlaying = LegacyFriendsFeedQueries.FACTORY.selectStoriesForPlaying(j, Long.valueOf(System.currentTimeMillis()));
        akcr.a(selectStoriesForPlaying, "LegacyFriendsFeedQueries…stem.currentTimeMillis())");
        selectStoriesForPlaying = c().queryAndMapToList("ff:playableStories", selectStoriesForPlaying, new e(LegacyFriendsFeedQueries.PLAYABLE_STORIES_MAPPER)).e();
        akcr.a(selectStoriesForPlaying, "dbClient.queryAndMapToLi…          .firstOrError()");
        return selectStoriesForPlaying;
    }

    public final Long a() {
        Object obj = LegacyFriendsFeedQueries.FACTORY;
        String str = "LegacyFriendsFeedQueries.FACTORY";
        akcr.a(obj, str);
        obj = obj.getEarliestLastInteractionTimestamp();
        akcr.a(obj, "LegacyFriendsFeedQueries…tLastInteractionTimestamp");
        DbClient c = c();
        Object obj2 = LegacyFriendsFeedQueries.FACTORY;
        akcr.a(obj2, str);
        Object earliestLastInteractionTimestampMapper = obj2.getEarliestLastInteractionTimestampMapper();
        akcr.a(earliestLastInteractionTimestampMapper, "LegacyFriendsFeedQueries…nteractionTimestampMapper");
        return (Long) c.queryFirst(obj, earliestLastInteractionTimestampMapper);
    }

    public final ajdx<Long> b() {
        Object countMutualFriends = FriendRecord.FACTORY.countMutualFriends();
        akcr.a(countMutualFriends, "FriendRecord.FACTORY.countMutualFriends()");
        return c().queryAndMapToOneOrDefault(countMutualFriends, new d(FriendRecord.COUNT_MUTUAL_FRIENDS_MAPPER), Long.valueOf(0));
    }
}
