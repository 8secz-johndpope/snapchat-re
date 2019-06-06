package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.query.AddedMeFriendsModel.SelectAddedMeFriendsModel;
import com.snap.core.db.query.ContactsNotOnSnapchatModel.SelectContactsNotOnSnapchatModel;
import com.snap.core.db.query.FriendsFeedSuggestedFriendsModel.SelectSuggestedFriendsModel;
import com.snap.core.db.query.LegacyAddFriendsSearchQueries;
import com.snap.core.db.query.LegacyAddedMeFriendsQueries;
import com.snap.core.db.query.LegacyAddedMeFriendsQueries.WithDisplayInfo;
import com.snap.core.db.query.LegacyContactsNotOnSnapchatQueries;
import com.snap.core.db.query.LegacyContactsQueries;
import com.snap.core.db.query.LegacyFriendsFeedSuggestedFriendQueries;
import com.snap.core.db.query.LegacySearchQueries;
import com.snap.core.db.query.LegacySearchQueries.Friend;
import com.snap.core.db.query.LegacySearchQueries.FriendsStatus;
import com.snap.core.db.query.SearchModel.GetAllFriendsStatusModel;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.FeedRecord;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;
import defpackage.itm.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: jkd */
public final class jkd {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;

    /* renamed from: jkd$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ SnapDb a;

        a(SnapDb snapDb) {
            this.a = snapDb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.getDbClient((ide) irc.t);
        }
    }

    /* renamed from: jkd$b */
    static final class b extends akcs implements akbk<ixj> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ixj) this.a.get();
        }
    }

    /* renamed from: jkd$u */
    static final class u extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        u(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(irc.t.callsite("ProfileAddFriendsDataProvider"));
        }
    }

    /* renamed from: jkd$p */
    static final class p<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        p(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            Object countMutualFriends = FriendRecord.FACTORY.countMutualFriends();
            akcr.a(countMutualFriends, "FriendRecord.FACTORY.countMutualFriends()");
            return ((DbClient) this.a.a.b()).queryAndMapToOneOrDefault(countMutualFriends, new akbl<Cursor, Long>(FriendRecord.COUNT_MUTUAL_FRIENDS_MAPPER) {
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
            }, Long.valueOf(0)).i();
        }
    }

    /* renamed from: jkd$f */
    static final class f extends akcs implements akbw<List<? extends WithDisplayInfo>, Set<String>, List<? extends itm>> {
        public static final f a = new f();

        f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (List) obj;
            Set set = (Set) obj2;
            akcr.a(obj, "addedMeFriends");
            Iterable<Object> iterable = (Iterable) obj;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj3 : iterable) {
                akcr.a(obj3, DdmlDataModel.RECORD);
                arrayList.add(a.a((SelectAddedMeFriendsModel) obj3, set.contains(obj3.userId())));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: jkd$e */
    static final class e<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        e(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            Object selectAddedMeFriends = LegacyAddedMeFriendsQueries.FACTORY.selectAddedMeFriends();
            akcr.a(selectAddedMeFriends, "LegacyAddedMeFriendsQuer…RY.selectAddedMeFriends()");
            return ((DbClient) this.a.a.b()).queryAndMapToList("profile:addedMe", selectAddedMeFriends, new akbl<Cursor, WithDisplayInfo>(LegacyAddedMeFriendsQueries.ADDED_ME_FRIENDS_MAPPER) {
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
            });
        }
    }

    /* renamed from: jkd$c */
    static final class c<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;
        private /* synthetic */ FriendSuggestionPlacement b;

        c(jkd jkd, FriendSuggestionPlacement friendSuggestionPlacement) {
            this.a = jkd;
            this.b = friendSuggestionPlacement;
        }

        public final /* synthetic */ Object call() {
            Object selectAddFriendsSearch = LegacyAddFriendsSearchQueries.FACTORY.selectAddFriendsSearch(SuggestedFriendPlacementRecord.FACTORY, this.b);
            akcr.a(selectAddFriendsSearch, "LegacyAddFriendsSearchQu…riendSuggestionPlacement)");
            return ((DbClient) this.a.a.b()).queryAndMapToList("profile:addFriendsSearch", selectAddFriendsSearch, new akbl<Cursor, LegacyAddFriendsSearchQueries.WithDisplayInfo>(LegacyAddFriendsSearchQueries.ADD_FRIENDS_SEARCH_MAPPER) {
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
                    return (LegacyAddFriendsSearchQueries.WithDisplayInfo) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$g */
    public static final class g<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        public g(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            DbClient a = ((DbClient) this.a.a.b());
            Object obj = LegacyAddFriendsSearchQueries.FACTORY;
            akcr.a(obj, "LegacyAddFriendsSearchQueries.FACTORY");
            obj = obj.getAllAddedFriendNames();
            akcr.a(obj, "LegacyAddFriendsSearchQu…CTORY.allAddedFriendNames");
            return a.queryAndMapToList(obj, new akbl<Cursor, String>(LegacyAddFriendsSearchQueries.ALL_ADDED_FRIEND_NAMES_MAPPER) {
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
                    return (String) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$h */
    public static final class h<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        public h(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            DbClient a = ((DbClient) this.a.a.b());
            Object obj = LegacySearchQueries.FACTORY;
            akcr.a(obj, "LegacySearchQueries.FACTORY");
            obj = obj.getAllAddedFriends();
            akcr.a(obj, "LegacySearchQueries.FACTORY.allAddedFriends");
            return a.queryAndMapToList(obj, new akbl<Cursor, Friend>(LegacySearchQueries.SELECT_ALL_ADDED_FRIENDS_MAPPER) {
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
                    return (Friend) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$i */
    public static final class i<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        public i(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            DbClient a = ((DbClient) this.a.a.b());
            Object obj = LegacySearchQueries.FACTORY;
            akcr.a(obj, "LegacySearchQueries.FACTORY");
            obj = obj.getAllFriendsStatus();
            akcr.a(obj, "LegacySearchQueries.FACTORY.allFriendsStatus");
            return a.queryAndMapToList(obj, new akbl<Cursor, FriendsStatus>(LegacySearchQueries.SELECT_ALL_FRIENDS_STATUS_MAPPER) {
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
                    return (FriendsStatus) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$l */
    static final class l<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        l(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            Object selectContactsNotOnSnapchat = LegacyContactsNotOnSnapchatQueries.FACTORY.selectContactsNotOnSnapchat();
            akcr.a(selectContactsNotOnSnapchat, "LegacyContactsNotOnSnapc…ctContactsNotOnSnapchat()");
            return ((DbClient) this.a.a.b()).queryAndMapToList("profile:getContactsNotOnSnapchat", selectContactsNotOnSnapchat, new akbl<Cursor, LegacyContactsNotOnSnapchatQueries.WithDisplayInfo>(LegacyContactsNotOnSnapchatQueries.CONTACTS_NOT_ON_SNAPCHAT_MAPPER) {
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
                    return (LegacyContactsNotOnSnapchatQueries.WithDisplayInfo) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$n */
    public static final class n<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        public n(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            Object selectContactsOnSnapchat = LegacyContactsQueries.FACTORY.selectContactsOnSnapchat();
            akcr.a(selectContactsOnSnapchat, "LegacyContactsQueries.FA…electContactsOnSnapchat()");
            return ((DbClient) this.a.a.b()).queryAndMapToList("profile:getContactsOnSnapchat", selectContactsOnSnapchat, new akbl<Cursor, LegacyContactsQueries.WithDisplayInfo>(LegacyContactsQueries.CONTACTS_ON_SNAPCHAT_MAPPER) {
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
                    return (LegacyContactsQueries.WithDisplayInfo) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$q */
    public static final class q<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;
        private /* synthetic */ FriendSuggestionPlacement b;

        public q(jkd jkd, FriendSuggestionPlacement friendSuggestionPlacement) {
            this.a = jkd;
            this.b = friendSuggestionPlacement;
        }

        public final /* synthetic */ Object call() {
            Object selectSuggestedFriends = LegacyFriendsFeedSuggestedFriendQueries.FACTORY.selectSuggestedFriends(SuggestedFriendPlacementRecord.FACTORY, this.b);
            akcr.a(selectSuggestedFriends, "LegacyFriendsFeedSuggest…riendSuggestionPlacement)");
            return ((DbClient) this.a.a.b()).queryAndMapToList("profile:suggested", selectSuggestedFriends, new akbl<Cursor, LegacyFriendsFeedSuggestedFriendQueries.WithDisplayInfo>(LegacyFriendsFeedSuggestedFriendQueries.ALL_SUGGESTED_IN_PLACEMENT_MAPPER) {
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
                    return (LegacyFriendsFeedSuggestedFriendQueries.WithDisplayInfo) ((ainw) this.receiver).map(cursor);
                }
            });
        }
    }

    /* renamed from: jkd$s */
    public static final class s<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        public s(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            DbClient a = ((DbClient) this.a.a.b());
            Object obj = FeedRecord.FACTORY;
            String str = "FeedRecord.FACTORY";
            akcr.a(obj, str);
            obj = obj.getGroupCount();
            akcr.a(obj, "FeedRecord.FACTORY.groupCount");
            Object obj2 = FeedRecord.FACTORY;
            akcr.a(obj2, str);
            return a.queryAndMapToOne(obj, new akbl<Cursor, Long>(obj2.getGroupCountMapper()) {
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
            });
        }
    }

    /* renamed from: jkd$t */
    public static final class t<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ jkd a;

        public t(jkd jkd) {
            this.a = jkd;
        }

        public final /* synthetic */ Object call() {
            Object countMutualFriends = FriendRecord.FACTORY.countMutualFriends();
            akcr.a(countMutualFriends, "FriendRecord.FACTORY.countMutualFriends()");
            return ((DbClient) this.a.a.b()).queryAndMapToOne(countMutualFriends, new akbl<Cursor, Long>(FriendRecord.COUNT_MUTUAL_FRIENDS_MAPPER) {
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
            });
        }
    }

    /* renamed from: jkd$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    /* renamed from: jkd$k */
    public static final class k<T, R> implements ajfc<T, R> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            znh znh = (znh) obj;
            akcr.b(znh, "it");
            return ajyu.k(znh);
        }
    }

    /* renamed from: jkd$m */
    static final class m<T, R> implements ajfc<T, R> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return ajyu.k(list);
        }
    }

    /* renamed from: jkd$o */
    public static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return ajyu.k(list);
        }
    }

    /* renamed from: jkd$j */
    public static final class j extends akcs implements akbw<List<? extends FriendsStatus>, Set<String>, znh<itn>> {
        public static final j a = new j();

        j() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (List) obj;
            Set set = (Set) obj2;
            akcr.a(obj, "allFriendsStatus");
            Iterable<Object> iterable = (Iterable) obj;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj3 : iterable) {
                akcr.a(obj3, DdmlDataModel.RECORD);
                GetAllFriendsStatusModel getAllFriendsStatusModel = (GetAllFriendsStatusModel) obj3;
                boolean contains = set.contains(obj3.userId());
                akcr.b(getAllFriendsStatusModel, "dbAllFriendsStatus");
                long _id = getAllFriendsStatusModel._id();
                Object username = getAllFriendsStatusModel.username();
                akcr.a(username, "dbAllFriendsStatus.username()");
                arrayList.add(new itn(_id, username, getAllFriendsStatusModel.friendLinkType(), getAllFriendsStatusModel.userId(), contains));
            }
            return znk.a((List) arrayList);
        }
    }

    /* renamed from: jkd$r */
    public static final class r extends akcs implements akbw<List<? extends LegacyFriendsFeedSuggestedFriendQueries.WithDisplayInfo>, Set<String>, znh<itp>> {
        public static final r a = new r();

        r() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (List) obj;
            Set set = (Set) obj2;
            akcr.a(obj, "suggestedFriends");
            Iterable<Object> iterable = (Iterable) obj;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj3 : iterable) {
                akcr.a(obj3, DdmlDataModel.RECORD);
                arrayList.add(itp.a.a((SelectSuggestedFriendsModel) obj3, set.contains(obj3.userId())));
            }
            return znk.a((List) arrayList);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jkd.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(jkd.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/db/FriendRepository;"), new akdc(akde.a(jkd.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public jkd(SnapDb snapDb, ajwy<ixj> ajwy, ajwy<zgb> ajwy2) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "friendRepositoryProvider");
        akcr.b(ajwy2, "schedulersProvider");
        this.a = ajxh.a(new a(snapDb));
        this.b = ajxh.a(new b(ajwy));
        this.c = ajxh.a(new u(ajwy2));
    }

    public final ajdp<znh<LegacyAddFriendsSearchQueries.WithDisplayInfo>> a(FriendSuggestionPlacement friendSuggestionPlacement) {
        akcr.b(friendSuggestionPlacement, "friendSuggestionPlacement");
        Object p = ajdp.a((Callable) new c(this, friendSuggestionPlacement)).b((ajdw) b().i()).a((ajdw) b().i()).p(d.a);
        akcr.a(p, "Observable\n             … { Seekables.copyOf(it) }");
        return p;
    }

    public final ixj a() {
        return (ixj) this.b.b();
    }

    public final zfw b() {
        return (zfw) this.c.b();
    }

    public final ajdp<List<itm>> c() {
        ajdp b = ajdp.a((Callable) new e(this)).b((ajdw) b().i());
        String str = "Observable\n             …eOn(schedulers.queries())";
        akcr.a((Object) b, str);
        ajdp e = a().e();
        akcr.a((Object) e, "friendRepository.friendsWithActionsInProgress()");
        Object a = igs.a(b, e, (akbw) f.a).a((ajdw) b().i());
        akcr.a(a, str);
        return a;
    }

    public final ajdp<List<SelectContactsNotOnSnapchatModel>> d() {
        Object p = ajdp.a((Callable) new l(this)).b((ajdw) b().i()).p(m.a);
        akcr.a(p, "Observable\n             …     .map { it.toList() }");
        return p;
    }

    public final ajdp<Long> e() {
        Object b = ajdp.a((Callable) new p(this)).b((ajdw) b().i());
        akcr.a(b, "Observable\n             …eOn(schedulers.queries())");
        return b;
    }
}
