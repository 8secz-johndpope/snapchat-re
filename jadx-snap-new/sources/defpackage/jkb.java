package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.core.db.column.FriendmojiCategory;
import com.snap.core.db.query.LegacySearchQueries.Friend;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiDict;
import com.snapchat.android.R;
import defpackage.jjz.a;
import defpackage.jjz.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jkb */
public final class jkb extends ajed implements zma {
    final ajxe a = ajxh.a(new b(this));
    final Resources b;
    final ajwl<Integer> c;
    final ihh d;
    final iqz e;
    final zfw f;
    final zpd g;
    private final ajxe h = ajxh.a(a.a);
    private final ajxe i;

    /* renamed from: jkb$a */
    static final class a extends akcs implements akbk<Map<String, String>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FriendmojiCategory[] values = FriendmojiCategory.values();
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(values.length), 16));
            for (FriendmojiCategory friendmojiCategory : values) {
                linkedHashMap.put(friendmojiCategory.getCategory(), friendmojiCategory.getEmoji());
            }
            return ajzm.d(linkedHashMap);
        }
    }

    /* renamed from: jkb$b */
    static final class b extends akcs implements akbk<ajdp<Map<String, ? extends String>>> {
        final /* synthetic */ jkb a;

        /* renamed from: jkb$b$1 */
        static final class 1<T, R> implements ajfc<List<? extends FriendmojiDict>, Map<String, ? extends String>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List<FriendmojiDict> list = (List) obj;
                akcr.b(list, Event.LIST);
                for (FriendmojiDict friendmojiDict : list) {
                    Object emoji = friendmojiDict.emoji();
                    if (emoji != null) {
                        Map a = ((Map) this.a.a.h.b());
                        Object category = friendmojiDict.category();
                        akcr.a(category, "it.category()");
                        akcr.a(emoji, FriendmojiModel.EMOJI);
                        a.put(category, emoji);
                    }
                }
                return ((Map) this.a.a.h.b());
            }
        }

        b(jkb jkb) {
            this.a = jkb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.a().p(new 1(this));
        }
    }

    /* renamed from: jkb$c */
    static final class c extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ jkb a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ ajdp c;

        /* renamed from: jkb$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<Friend> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Friend friend : iterable) {
                    Object username = friend.username();
                    akcr.a(username, "item.username()");
                    arrayList.add(new a(username, friend.displayName(), friend));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jkb$c$4 */
        static final class 4<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            4(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                jkb jkb = this.a.a;
                if (list.isEmpty()) {
                    return znk.a;
                }
                Object string = jkb.b.getString(R.string.search_my_friends);
                akcr.a(string, "resources.getString(sectionHeadingResource)");
                return znk.a(znk.a(new jrz(string)), znk.a(list));
            }
        }

        /* renamed from: jkb$c$2 */
        static final class 2 extends akcq implements akbw<List<? extends a<Friend>>, String, List<? extends Friend>> {
            public static final 2 a = new 2();

            2() {
                super(2);
            }

            public final String getName() {
                return "filterByQuery";
            }

            public final akej getOwner() {
                return akde.a(jka.class, "identity_release");
            }

            public final String getSignature() {
                return "filterByQuery(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                List list = (List) obj;
                String str = (String) obj2;
                akcr.b(list, "p1");
                akcr.b(str, "p2");
                return jka.a(list, str);
            }
        }

        c(jkb jkb, ajdp ajdp, ajdp ajdp2) {
            this.a = jkb;
            this.b = ajdp;
            this.c = ajdp2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp p = this.b.p(new 1(this));
            akcr.a((Object) p, "allMyFriends\n           …::displayInfoContainer) }");
            ajdp a = this.c.a((ajdw) this.a.f.h());
            akcr.a((Object) a, "searchTextObservable.obs…dulers.userInteractive())");
            p = igs.a(igs.a(p, a, (akbw) 2.a), (ajdp) this.a.a.b(), (akbw) new akbw<List<? extends Friend>, Map<String, ? extends String>, List<? extends zmy>>(this.a) {
                public final String getName() {
                    return "myFriendToViewModels";
                }

                public final akej getOwner() {
                    return akde.a(jkb.class);
                }

                public final String getSignature() {
                    return "myFriendToViewModels(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;";
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    List list = (List) obj;
                    Map map = (Map) obj2;
                    akcr.b(list, "p1");
                    akcr.b(map, "p2");
                    jkb jkb = (jkb) this.receiver;
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
                    int i = 0;
                    for (Object next : iterable) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ajym.a();
                        }
                        Friend friend = (Friend) next;
                        jtv jtv = r1;
                        Collection collection = arrayList;
                        jkb jkb2 = jkb;
                        Map map2 = map;
                        jtv jtv2 = new jtv(friend, jkb.g.a(friend.username()), irc.a, irc.t.getName(), jkb.d, map, jrf.a(true, i, list.size()), b.MY_SEARCH.value, jri.MY_FRIEND_ITEM, null, false, false, false, 15360);
                        Collection collection2 = collection;
                        collection2.add(jtv);
                        arrayList = collection2;
                        i = i2;
                        jkb = jkb2;
                    }
                    return (List) arrayList;
                }
            }).p(new 4(this));
            akcr.a((Object) p, "allMyFriends\n           …ring.search_my_friends) }");
            return igs.a(p, (ajdp) this.a.c, (akbw) new akbw<znh<zmy>, Integer, znh<zmy>>(this.a) {
                public final String getName() {
                    return "prepareViewMore";
                }

                public final akej getOwner() {
                    return akde.a(jkb.class);
                }

                public final String getSignature() {
                    return "prepareViewMore(Lcom/snap/ui/seeking/Seekable;I)Lcom/snap/ui/seeking/Seekable;";
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    znh znh = (znh) obj;
                    int intValue = ((Number) obj2).intValue();
                    akcr.b(znh, "p1");
                    return znh.a() > intValue ? znk.a(znk.a(ajyu.k(znh).subList(0, intValue)), znk.a(new jve())) : znh;
                }
            });
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jkb.class), "defaultFriendMojiMap", "getDefaultFriendMojiMap()Ljava/util/Map;"), new akdc(akde.a(jkb.class), "friendmojiMap", "getFriendmojiMap()Lio/reactivex/Observable;"), new akdc(akde.a(jkb.class), "myFriendViewModels", "getMyFriendViewModels()Lio/reactivex/Observable;")};
    }

    public jkb(Resources resources, ajdp<String> ajdp, ajwl<Integer> ajwl, ajdp<List<Friend>> ajdp2, ihh ihh, iqz iqz, zfw zfw, zpd zpd) {
        akcr.b(resources, "resources");
        akcr.b(ajdp, "searchTextObservable");
        akcr.b(ajwl, "itemCount");
        akcr.b(ajdp2, "allMyFriends");
        akcr.b(ihh, "clock");
        akcr.b(iqz, "friendmojiApi");
        akcr.b(zfw, "schedulers");
        akcr.b(zpd, "dataIdMapper");
        this.b = resources;
        this.c = ajwl;
        this.d = ihh;
        this.e = iqz;
        this.f = zfw;
        this.g = zpd;
        this.i = ajxh.a(new c(this, ajdp2, ajdp));
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return (ajdp) this.i.b();
    }

    public final void onDispose() {
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendsViewMoreClick(iss iss) {
        akcr.b(iss, "event");
        ajwl ajwl = this.c;
        Object p = ajwl.p();
        if (p == null) {
            akcr.a();
        }
        ajwl.a(Integer.valueOf(((Number) p).intValue() + 7));
    }
}
