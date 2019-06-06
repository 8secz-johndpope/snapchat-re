package defpackage;

import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.FriendmojiCategory;
import com.snap.core.db.query.LegacySearchQueries.Friend;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiDict;
import defpackage.jjz.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jlg */
public final class jlg extends ajed implements zma {
    final ajxe a = ajxh.a(d.a);
    final zfw b;
    final ajdp<String> c;
    final ajdp<List<Friend>> d;
    final ajdp<List<Friend>> e;
    final ajdp<List<Friend>> f;
    final ihh g;
    final iqz h;
    final zpd i;
    final gpb j;
    final jto k;
    final ajdp<Set<String>> l;
    final ajdp<Set<String>> m;
    final ajdp<Boolean> n;
    final ajwl<Integer> o;
    final boolean p;
    private final ajxe q = ajxh.a(a.a);
    private final ajxe r = ajxh.a(new b(this));
    private final ajxe s = ajxh.a(new c(this));
    private final String t;

    /* renamed from: jlg$a */
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

    /* renamed from: jlg$b */
    static final class b extends akcs implements akbk<ajdp<Map<String, ? extends String>>> {
        final /* synthetic */ jlg a;

        /* renamed from: jlg$b$1 */
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
                        Map a = ((Map) this.a.a.q.b());
                        Object category = friendmojiDict.category();
                        akcr.a(category, "it.category()");
                        akcr.a(emoji, FriendmojiModel.EMOJI);
                        a.put(category, emoji);
                    }
                }
                return ((Map) this.a.a.q.b());
            }
        }

        b(jlg jlg) {
            this.a = jlg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.h.a().p(new 1(this));
        }
    }

    /* renamed from: jlg$c */
    static final class c extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ jlg a;

        /* renamed from: jlg$c$10 */
        static final class 10<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            10(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<Friend> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Friend a : iterable) {
                    arrayList.add(jlg.a(a));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jlg$c$12 */
        static final class 12<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            12(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<Friend> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Friend a : iterable) {
                    arrayList.add(jlg.a(a));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jlg$c$14 */
        static final class 14<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            14(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return jlg.a(this.a.a, list);
            }
        }

        /* renamed from: jlg$c$16 */
        static final class 16<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            16(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List<Friend> list = (List) obj;
                akcr.b(list, "it");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                for (Friend friend : list) {
                    String a = iek.a(friend.displayName());
                    if (a == null) {
                        a = friend.username();
                        akcr.a((Object) a, "myFriend.username()");
                    }
                    char toUpperCase = Character.toUpperCase(a.charAt(0));
                    if ('A' <= toUpperCase && 'Z' >= toUpperCase) {
                        char toUpperCase2 = Character.toUpperCase(a.charAt(0));
                        if (!linkedHashMap.containsKey(Character.valueOf(toUpperCase2))) {
                            linkedHashMap.put(Character.valueOf(toUpperCase2), new ArrayList());
                        }
                        Object obj2 = linkedHashMap.get(Character.valueOf(toUpperCase2));
                        if (obj2 == null) {
                            akcr.a();
                        }
                        ((ArrayList) obj2).add(friend);
                    } else {
                        arrayList.add(friend);
                    }
                }
                if (arrayList.size() > 0) {
                    linkedHashMap.put(Character.valueOf('#'), arrayList);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: jlg$c$18 */
        static final class 18<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            18(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Map map = (Map) obj;
                akcr.b(map, "it");
                if (map.isEmpty()) {
                    return znk.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Entry entry : map.entrySet()) {
                    arrayList.add(znk.a(znk.a(new jtn(String.valueOf(((Character) entry.getKey()).charValue()))), znk.a(ajyu.k((List) entry.getValue()))));
                }
                return znk.b(arrayList);
            }
        }

        /* renamed from: jlg$c$19 */
        static final class 19<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            19(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<Friend> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Friend a : iterable) {
                    arrayList.add(jlg.a(a));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jlg$c$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            2(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return jlg.a(this.a.a, list);
            }
        }

        /* renamed from: jlg$c$3 */
        static final class 3<T, R> implements ajfc<T, R> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "friendList");
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    if ((((Friend) next).friendLinkType() == FriendLinkType.MUTUAL ? 1 : null) != null) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jlg$c$5 */
        static final class 5<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            5(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<Friend> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Friend a : iterable) {
                    arrayList.add(jlg.a(a));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jlg$c$8 */
        static final class 8<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            8(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return jlg.a(this.a.a, list);
            }
        }

        c(jlg jlg) {
            this.a = jlg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp ajdp;
            14 18;
            int i = jlh.a[this.a.k.ordinal()];
            String str = "userAuthStore.observeUserSession()";
            String str2 = "source\n                 …::displayInfoContainer) }";
            String str3 = "searchTextObservable.obs…dulers.userInteractive())";
            ajdp c;
            ajdp a;
            ajdp b;
            ajdp ajdp2;
            ajdp ajdp3;
            ajdp b2;
            if (i == 1) {
                ajdp = this.a.d;
                c = this.a.j.c();
                akcr.a((Object) c, str);
                ajdp = igs.a(ajdp, c, (akbw) new akbw<List<? extends Friend>, abkq, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterMySelfAndTeamSnapchat";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterMySelfAndTeamSnapchat(Ljava/util/List;Lcom/snapchat/android/core/user/UserSession;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        List list = (List) obj;
                        abkq abkq = (abkq) obj2;
                        akcr.b(list, "p1");
                        akcr.b(abkq, "p2");
                        return jlg.a(list, abkq);
                    }
                }).p(new 12(this));
                akcr.a((Object) ajdp, str2);
                c = this.a.c.a((ajdw) this.a.b.h());
                akcr.a((Object) c, str3);
                ajdp a2 = this.a.e.a((ajdw) this.a.b.h());
                akcr.a((Object) a2, "bestFriends.observeOn(sc…dulers.userInteractive())");
                a = this.a.f.a((ajdw) this.a.b.h());
                akcr.a((Object) a, "recentFriends.observeOn(…dulers.userInteractive())");
                ajdp = igs.a(ajdp, c, a2, a, (akcb) new akcb<List<? extends a<Friend>>, String, List<? extends Friend>, List<? extends Friend>, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterByQueryAndBestOrRecentFriend";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterByQueryAndBestOrRecentFriend(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        List list = (List) obj;
                        String str = (String) obj2;
                        List list2 = (List) obj3;
                        List list3 = (List) obj4;
                        akcr.b(list, "p1");
                        akcr.b(str, "p2");
                        akcr.b(list2, "p3");
                        akcr.b(list3, "p4");
                        Iterable<Friend> iterable = list2;
                        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (Friend username : iterable) {
                            arrayList.add(username.username());
                        }
                        List list4 = (List) arrayList;
                        Iterable<Friend> iterable2 = list3;
                        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                        for (Friend username2 : iterable2) {
                            arrayList2.add(username2.username());
                        }
                        list2 = (List) arrayList2;
                        Collection arrayList3 = new ArrayList();
                        for (Object next : jlg.a(list, str)) {
                            a aVar = (a) next;
                            Object obj5 = 1;
                            if ((((CharSequence) str).length() > 0 ? 1 : null) == null || !(list4.contains(aVar.a) || list2.contains(aVar.a))) {
                                obj5 = null;
                            }
                            if (obj5 == null) {
                                arrayList3.add(next);
                            }
                        }
                        Iterable<a> iterable3 = (List) arrayList3;
                        Collection arrayList4 = new ArrayList(ajyn.a((Iterable) iterable3, 10));
                        for (a aVar2 : iterable3) {
                            arrayList4.add(aVar2.c);
                        }
                        return (List) arrayList4;
                    }
                }).p(new 16(this));
                akcr.a((Object) ajdp, "source\n                 … splitByFirstLetter(it) }");
                ajdp = igs.a(ajdp, ((ajdp) this.a.r.b()), this.a.m, this.a.n, (akcb) new akcb<Map<Character, ? extends List<? extends Friend>>, Map<String, ? extends String>, Set<? extends String>, Boolean, Map<Character, ? extends List<? extends jtv>>>(this.a) {
                    public final String getName() {
                        return "myFriendToViewModels";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "myFriendToViewModels(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Z)Ljava/util/Map;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        Map map = (Map) obj;
                        Map map2 = (Map) obj2;
                        Set set = (Set) obj3;
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        akcr.b(map, "p1");
                        akcr.b(map2, "p2");
                        akcr.b(set, "p3");
                        jlg jlg = (jlg) this.receiver;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Entry entry : map.entrySet()) {
                            Set set2;
                            Map map3;
                            jlg jlg2;
                            char charValue = ((Character) entry.getKey()).charValue();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList();
                            int i = 0;
                            for (Object next : list) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    ajym.a();
                                }
                                Friend friend = (Friend) next;
                                jtv jtv = r1;
                                long j = 0;
                                ArrayList arrayList2 = arrayList;
                                jlg jlg3 = jlg;
                                Object obj5 = null;
                                set2 = set;
                                Map map4 = map2;
                                map3 = map2;
                                jlg2 = jlg3;
                                jtv jtv2 = new jtv(friend, jlg.i.a(friend.username()), irc.a, irc.t.getName(), jlg.g, map4, jrf.a(true, i, list.size()), 0, jri.PROFILE_MY_FRIEND_ITEM, null, booleanValue, ajyu.a((Iterable) set, (Object) friend.userId()), jlg3.p, 1280);
                                ArrayList arrayList3 = arrayList2;
                                arrayList3.add(jtv);
                                arrayList = arrayList3;
                                i = i2;
                                set = set2;
                                map2 = map3;
                                jlg = jlg2;
                            }
                            set2 = set;
                            jlg2 = jlg;
                            map3 = map2;
                            linkedHashMap.put(Character.valueOf(charValue), arrayList);
                        }
                        return linkedHashMap;
                    }
                });
                18 = new 18(this);
            } else if (i == 2) {
                ajdp = this.a.d.p(new 19(this));
                akcr.a((Object) ajdp, str2);
                c = this.a.c.a((ajdw) this.a.b.h());
                akcr.a((Object) c, str3);
                a = igs.a(ajdp, c, (akbw) new akbw<List<? extends a<Friend>>, String, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterByQueryThenGetItem";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterByQueryThenGetItem(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        List list = (List) obj;
                        String str = (String) obj2;
                        akcr.b(list, "p1");
                        akcr.b(str, "p2");
                        return jlg.b(list, str);
                    }
                });
                b = ((ajdp) this.a.r.b());
                ajdp2 = this.a.m;
                ajdp3 = this.a.n;
                b2 = ajdp.b(jto.BEST_FRIENDS);
                akcr.a((Object) b2, "Observable.just(MyFriend…SectionType.BEST_FRIENDS)");
                ajdp = igs.a(a, b, ajdp2, ajdp3, b2, (akcc) new akcc<List<? extends Friend>, Map<String, ? extends String>, Set<? extends String>, Boolean, jto, List<? extends zmy>>(this.a) {
                    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        List list = (List) obj;
                        Map map = (Map) obj2;
                        Set set = (Set) obj3;
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        jto jto = (jto) obj5;
                        akcr.b(list, "p1");
                        akcr.b(map, "p2");
                        akcr.b(set, "p3");
                        akcr.b(jto, "p5");
                        return jlg.a((jlg) this.receiver, list, map, set, booleanValue, jto);
                    }

                    public final String getName() {
                        return "myBestOrRecentFriendToViewModels";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "myBestOrRecentFriendToViewModels(Ljava/util/List;Ljava/util/Map;Ljava/util/Set;ZLcom/snap/identity/ui/shared/myfriend/MyFriendsPageSectionType;)Ljava/util/List;";
                    }
                });
                18 = new 2(this);
            } else if (i == 3) {
                ajdp = this.a.d.p(3.a);
                akcr.a((Object) ajdp, "source\n                 …FriendLinkType.MUTUAL } }");
                c = this.a.l.a((ajdw) this.a.b.h());
                akcr.a((Object) c, "preselectedFriendsObserv…dulers.userInteractive())");
                ajdp = igs.a(ajdp, c, (akbw) new akbw<List<? extends Friend>, Set<? extends String>, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterByPreselectedFriends";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterByPreselectedFriends(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        List list = (List) obj;
                        Set set = (Set) obj2;
                        akcr.b(list, "p1");
                        akcr.b(set, "p2");
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            if (ajyu.a((Iterable) set, (Object) ((Friend) next).userId())) {
                                arrayList.add(next);
                            }
                        }
                        return (List) arrayList;
                    }
                }).p(new 5(this));
                akcr.a((Object) ajdp, str2);
                c = this.a.c.a((ajdw) this.a.b.h());
                akcr.a((Object) c, str3);
                ajdp = igs.a(igs.a(ajdp, c, (akbw) new akbw<List<? extends a<Friend>>, String, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterByQueryThenGetItem";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterByQueryThenGetItem(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        List list = (List) obj;
                        String str = (String) obj2;
                        akcr.b(list, "p1");
                        akcr.b(str, "p2");
                        return jlg.b(list, str);
                    }
                }), this.a.m, this.a.n, (ajdp) this.a.o, (akcb) new akcb<List<? extends Friend>, Set<? extends String>, Boolean, Integer, List<? extends zmy>>(this.a) {
                    public final String getName() {
                        return "currentlySelectedFriendToViewModels";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "currentlySelectedFriendToViewModels(Ljava/util/List;Ljava/util/Set;ZI)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        List list = (List) obj;
                        Set set = (Set) obj2;
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        int intValue = ((Number) obj4).intValue();
                        akcr.b(list, "p1");
                        akcr.b(set, "p2");
                        jlg jlg = (jlg) this.receiver;
                        boolean z = true;
                        int i = 0;
                        Object obj5 = list.size() > intValue ? 1 : null;
                        Iterable subList = obj5 != null ? list.subList(0, intValue) : list;
                        Collection arrayList = new ArrayList(ajyn.a(subList, 10));
                        for (Object next : subList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                ajym.a();
                            }
                            Friend friend = (Friend) next;
                            List list2 = list;
                            Set set2 = set;
                            jlg jlg2 = jlg;
                            Collection collection = arrayList;
                            collection.add(new jtv(friend, jlg.i.a(friend.username()), irc.a, irc.t.getName(), jlg.g, ajyx.a, jrf.a(z, i, list.size()), 0, jri.PROFILE_MY_FRIEND_ITEM, jto.CURRENTLY_SELECTED_FRIENDS, booleanValue, ajyu.a((Iterable) set, (Object) friend.userId()), jlg.p, 256));
                            list = list2;
                            jlg = jlg2;
                            arrayList = collection;
                            i = i2;
                            z = true;
                            set = set2;
                        }
                        List list3 = (List) arrayList;
                        return obj5 != null ? ajyu.a((Collection) list3, (Object) (jve) jlg.a.b()) : list3;
                    }
                });
                18 = new 8(this);
            } else if (i == 4) {
                ajdp = this.a.f;
                c = this.a.j.c();
                akcr.a((Object) c, str);
                ajdp = igs.a(ajdp, c, (akbw) new akbw<List<? extends Friend>, abkq, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterMySelfAndTeamSnapchat";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterMySelfAndTeamSnapchat(Ljava/util/List;Lcom/snapchat/android/core/user/UserSession;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        List list = (List) obj;
                        abkq abkq = (abkq) obj2;
                        akcr.b(list, "p1");
                        akcr.b(abkq, "p2");
                        return jlg.a(list, abkq);
                    }
                }).p(new 10(this));
                akcr.a((Object) ajdp, "recentFriends\n          …::displayInfoContainer) }");
                c = this.a.c.a((ajdw) this.a.b.h());
                akcr.a((Object) c, str3);
                a = igs.a(ajdp, c, (akbw) new akbw<List<? extends a<Friend>>, String, List<? extends Friend>>(this.a) {
                    public final String getName() {
                        return "filterByQueryThenGetItem";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "filterByQueryThenGetItem(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;";
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        List list = (List) obj;
                        String str = (String) obj2;
                        akcr.b(list, "p1");
                        akcr.b(str, "p2");
                        return jlg.b(list, str);
                    }
                });
                b = ((ajdp) this.a.r.b());
                ajdp2 = this.a.m;
                ajdp3 = this.a.n;
                b2 = ajdp.b(jto.RECENT_FRIENDS);
                akcr.a((Object) b2, "Observable.just(MyFriend…ctionType.RECENT_FRIENDS)");
                ajdp = igs.a(a, b, ajdp2, ajdp3, b2, (akcc) new akcc<List<? extends Friend>, Map<String, ? extends String>, Set<? extends String>, Boolean, jto, List<? extends zmy>>(this.a) {
                    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        List list = (List) obj;
                        Map map = (Map) obj2;
                        Set set = (Set) obj3;
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        jto jto = (jto) obj5;
                        akcr.b(list, "p1");
                        akcr.b(map, "p2");
                        akcr.b(set, "p3");
                        akcr.b(jto, "p5");
                        return jlg.a((jlg) this.receiver, list, map, set, booleanValue, jto);
                    }

                    public final String getName() {
                        return "myBestOrRecentFriendToViewModels";
                    }

                    public final akej getOwner() {
                        return akde.a(jlg.class);
                    }

                    public final String getSignature() {
                        return "myBestOrRecentFriendToViewModels(Ljava/util/List;Ljava/util/Map;Ljava/util/Set;ZLcom/snap/identity/ui/shared/myfriend/MyFriendsPageSectionType;)Ljava/util/List;";
                    }
                });
                18 = new 14(this);
            } else {
                throw new ajxk();
            }
            return ajdp.p(18);
        }
    }

    /* renamed from: jlg$d */
    static final class d extends akcs implements akbk<jve> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jve(jri.MY_FRIENDS_VIEW_ALL);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jlg.class), "defaultFriendMojiMap", "getDefaultFriendMojiMap()Ljava/util/Map;"), new akdc(akde.a(jlg.class), "friendmojiMap", "getFriendmojiMap()Lio/reactivex/Observable;"), new akdc(akde.a(jlg.class), "myFriendViewModels", "getMyFriendViewModels()Lio/reactivex/Observable;"), new akdc(akde.a(jlg.class), "viewAllModel", "getViewAllModel()Lcom/snap/identity/ui/shared/quickadd/viewmodel/FriendsViewMoreViewModel;")};
    }

    public jlg(zfw zfw, ajdp<String> ajdp, ajdp<List<Friend>> ajdp2, ajdp<List<Friend>> ajdp3, ajdp<List<Friend>> ajdp4, ihh ihh, iqz iqz, zpd zpd, gpb gpb, String str, jto jto, ajdp<Set<String>> ajdp5, ajdp<Set<String>> ajdp6, ajdp<Boolean> ajdp7, ajwl<Integer> ajwl, boolean z) {
        zfw zfw2 = zfw;
        ajdp<String> ajdp8 = ajdp;
        ajdp<List<Friend>> ajdp9 = ajdp2;
        ajdp<List<Friend>> ajdp10 = ajdp3;
        ajdp<List<Friend>> ajdp11 = ajdp4;
        ihh ihh2 = ihh;
        iqz iqz2 = iqz;
        zpd zpd2 = zpd;
        gpb gpb2 = gpb;
        String str2 = str;
        jto jto2 = jto;
        ajdp<Set<String>> ajdp12 = ajdp5;
        ajdp<Set<String>> ajdp13 = ajdp6;
        ajdp<Boolean> ajdp14 = ajdp7;
        ajwl<Integer> ajwl2 = ajwl;
        akcr.b(zfw2, "schedulers");
        akcr.b(ajdp8, "searchTextObservable");
        akcr.b(ajdp9, "source");
        akcr.b(ajdp10, "bestFriends");
        akcr.b(ajdp11, "recentFriends");
        akcr.b(ihh2, "clock");
        akcr.b(iqz2, "friendmojiApi");
        akcr.b(zpd2, "dataIdMapper");
        akcr.b(gpb2, "userAuthStore");
        akcr.b(str2, "headerText");
        akcr.b(jto2, "myFriendsSectionType");
        akcr.b(ajdp12, "preselectedFriendsObservable");
        akcr.b(ajdp13, "selectedFriendsObservable");
        akcr.b(ajdp14, "multiSelectObservable");
        akcr.b(ajwl2, "currentlySelectedSectionInitialItemCountObservable");
        this.b = zfw2;
        this.c = ajdp8;
        this.d = ajdp9;
        this.e = ajdp10;
        this.f = ajdp11;
        this.g = ihh2;
        this.h = iqz2;
        this.i = zpd2;
        this.j = gpb2;
        this.t = str2;
        this.k = jto2;
        this.l = ajdp12;
        this.m = ajdp13;
        this.n = ajdp14;
        this.o = ajwl2;
        this.p = z;
    }

    static <T> List<a<T>> a(List<a<T>> list, String str) {
        abmr.a("Can't filter the friends list on the UI thread.");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            a aVar = (a) next;
            List arrayList2 = new ArrayList();
            arrayList2.add(aVar.a);
            if (aVar.b != null) {
                Object a = vxg.a(aVar.b);
                akcr.a(a, "SearchTextUtil.makeSearchable(record.displayName)");
                arrayList2.add(a);
            }
            Object obj = 1;
            if ((((CharSequence) str).length() == 0 ? 1 : null) == null && vxf.a(str, arrayList2) == -1) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public static final /* synthetic */ List a(jlg jlg, List list, Map map, Set set, boolean z, jto jto) {
        jlg jlg2 = jlg;
        Iterable iterable = list;
        Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                ajym.a();
            }
            Friend friend = (Friend) next;
            Map map2 = map;
            arrayList.add(new jtv(friend, jlg2.i.a(friend.username()), irc.a, irc.t.getName(), jlg2.g, map2, jrf.a(true, i, list.size()), 0, jri.PROFILE_MY_FRIEND_ITEM, jto, z, ajyu.a((Iterable) set, (Object) friend.userId()), jlg2.p, 256));
            i = i2;
        }
        return (List) arrayList;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return (ajdp) this.s.b();
    }

    public final void onDispose() {
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendsViewMoreClick(iss iss) {
        akcr.b(iss, "event");
        this.o.a(Integer.valueOf(Integer.MAX_VALUE));
    }
}
