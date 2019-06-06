package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.query.AddFriendsSearchModel.SelectAddFriendsSearchModel;
import com.snap.core.db.query.ContactsNotOnSnapchatModel.SelectContactsNotOnSnapchatModel;
import com.snap.core.db.query.LegacyAddFriendsSearchQueries.WithDisplayInfo;
import com.snap.core.db.record.UnlockablesModel;
import com.snapchat.android.R;
import defpackage.iyi.b;
import defpackage.iyi.c;
import defpackage.jkd.g;
import defpackage.jkd.i;
import defpackage.jkd.j;
import defpackage.jkd.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jjz */
public final class jjz extends ajed implements zma, zmb {
    final ajxe a = ajxh.a(new f(this));
    final Set<String> b = new LinkedHashSet();
    final ajxe c = ajxh.a(new g(this));
    final ajxe d;
    final ajxe e;
    final ajxe f;
    final ira g;
    final idj h;
    final String i;
    final zfw j;
    final Resources k;
    final jth l;
    final ajwl<Long> m;
    final ixj n;
    final zpd o;
    final ith p;
    private final ajxe q = ajxh.a(new i(this));
    private final usd r;
    private final ypo s;

    /* renamed from: jjz$a */
    public static final class a<T> {
        public final String a;
        public final String b;
        public final T c;

        public a(String str, String str2, T t) {
            akcr.b(str, "term");
            this.a = str;
            this.b = str2;
            this.c = t;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.jjz.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.jjz.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jjz$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Object obj = this.c;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DisplayInfoContainer(term=");
            stringBuilder.append(this.a);
            stringBuilder.append(", displayName=");
            stringBuilder.append(this.b);
            stringBuilder.append(", item=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: jjz$b */
    public enum b {
        QUICK_ADD(1),
        CONTACTS_ON_SNAPCHAT(2),
        CONTACTS_NOT_ON_SNAPCHAT(3),
        REMOTE_SEARCH(4),
        MY_SEARCH(5);
        
        final long value;

        private b(long j) {
            this.value = j;
        }
    }

    /* renamed from: jjz$c */
    public static final class c<T> {
        final T a;
        final akbw<T, jre, zmy> b;

        public c(T t, akbw<? super T, ? super jre, ? extends zmy> akbw) {
            akcr.b(akbw, "dataToViewModel");
            this.a = t;
            this.b = akbw;
        }
    }

    /* renamed from: jjz$d */
    static final class d extends akcs implements akbk<ajdp<List<? extends c<? extends Object>>>> {
        final /* synthetic */ jjz a;
        private /* synthetic */ jkd b;
        private /* synthetic */ ajdp c;

        /* renamed from: jjz$d$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                znh znh = (znh) obj;
                akcr.b(znh, "it");
                Iterable<SelectAddFriendsSearchModel> iterable = znh;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (SelectAddFriendsSearchModel selectAddFriendsSearchModel : iterable) {
                    Object username = selectAddFriendsSearchModel.username();
                    akcr.a(username, "item.username()");
                    arrayList.add(new a(username, selectAddFriendsSearchModel.displayName(), selectAddFriendsSearchModel));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jjz$d$4 */
        static final class 4<T, R> implements ajfc<T, R> {
            final /* synthetic */ d a;

            /* renamed from: jjz$d$4$a */
            static final class a extends akcs implements akbw<SelectAddFriendsSearchModel, jre, zmy> {
                private /* synthetic */ int a;
                private /* synthetic */ 4 b;

                a(int i, 4 4) {
                    this.a = i;
                    this.b = 4;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    SelectAddFriendsSearchModel selectAddFriendsSearchModel = (SelectAddFriendsSearchModel) obj;
                    jre jre = (jre) obj2;
                    akcr.b(selectAddFriendsSearchModel, UnlockablesModel.DATA);
                    akcr.b(jre, "corner");
                    jjz jjz = this.b.a.a;
                    int i = this.a;
                    zmy jvh;
                    if (selectAddFriendsSearchModel.addedMe_isAdded() != null) {
                        itm a = defpackage.itm.a.a(new defpackage.iyi.a(selectAddFriendsSearchModel), false);
                        Object p = jjz.m.p();
                        if (p == null) {
                            akcr.a();
                        }
                        akcr.a(p, "lastSeenAddedMeSectionTimestamp.value!!");
                        jrx jrx = new jrx(a, ((Number) p).longValue(), irc.a, irc.t.getName(), jre, iqt.PROFILE, jjz.p, jjz.l);
                    } else if (selectAddFriendsSearchModel.suggested_isAdded() != null) {
                        jvh = new jvh(defpackage.itp.a.a(new c(selectAddFriendsSearchModel), false), i, jjz.l, irc.a, irc.t.getName(), iqt.PROFILE, jjz.p, jre, b.QUICK_ADD.value, false, jri.QUICK_ADD_LIST_ITEM_V2, false, ItemAnimator.FLAG_MOVED);
                    } else {
                        jvh = new jsl(new b(selectAddFriendsSearchModel), irc.a, irc.t.getName(), iqt.PROFILE, jjz.p, jjz.k.getString(R.string.in_your_address_book), jre, b.CONTACTS_ON_SNAPCHAT.value);
                    }
                    return r1;
                }
            }

            4(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable iterable = list;
                Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
                int i = 0;
                for (Object next : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ajym.a();
                    }
                    arrayList.add(new c((SelectAddFriendsSearchModel) next, new a(i, this)));
                    i = i2;
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jjz$d$3 */
        static final class 3 extends akcs implements akbw<List<? extends SelectAddFriendsSearchModel>, Long, List<? extends SelectAddFriendsSearchModel>> {
            private /* synthetic */ d a;

            3(d dVar) {
                this.a = dVar;
                super(2);
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x0016 A:{SYNTHETIC} */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
                /*
                r8 = this;
                r9 = (java.util.List) r9;
                r10 = (java.lang.Long) r10;
                r0 = "data";
                defpackage.akcr.b(r9, r0);
                r9 = (java.lang.Iterable) r9;
                r0 = new java.util.ArrayList;
                r0.<init>();
                r0 = (java.util.Collection) r0;
                r9 = r9.iterator();
            L_0x0016:
                r1 = r9.hasNext();
                if (r1 == 0) goto L_0x0073;
            L_0x001c:
                r1 = r9.next();
                r2 = r1;
                r2 = (com.snap.core.db.query.AddFriendsSearchModel.SelectAddFriendsSearchModel) r2;
                r3 = r2.addedTimestamp();
                if (r3 == 0) goto L_0x006c;
            L_0x0029:
                r3 = r2.addedTimestamp();
                if (r3 != 0) goto L_0x0030;
            L_0x002f:
                goto L_0x003a;
            L_0x0030:
                r3 = r3.longValue();
                r5 = 0;
                r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
                if (r7 == 0) goto L_0x006c;
            L_0x003a:
                r3 = r2.reverseAddedTimestamp();
                if (r3 == 0) goto L_0x0064;
            L_0x0040:
                r3 = r3.longValue();
                r5 = "timestamp";
                defpackage.akcr.a(r10, r5);
                r5 = r10.longValue();
                r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
                if (r7 > 0) goto L_0x006c;
            L_0x0051:
                r3 = r8.a;
                r3 = r3.a;
                r3 = r3.b;
                r2 = r2.userId();
                r2 = r3.contains(r2);
                if (r2 == 0) goto L_0x0062;
            L_0x0061:
                goto L_0x006c;
            L_0x0062:
                r2 = 0;
                goto L_0x006d;
            L_0x0064:
                r9 = new ajxt;
                r10 = "null cannot be cast to non-null type kotlin.Long";
                r9.<init>(r10);
                throw r9;
            L_0x006c:
                r2 = 1;
            L_0x006d:
                if (r2 == 0) goto L_0x0016;
            L_0x006f:
                r0.add(r1);
                goto L_0x0016;
            L_0x0073:
                r0 = (java.util.List) r0;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jjz$d$3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: jjz$d$2 */
        static final class 2 extends akcq implements akbw<List<? extends a<SelectAddFriendsSearchModel>>, String, List<? extends SelectAddFriendsSearchModel>> {
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

        d(jjz jjz, jkd jkd, ajdp ajdp) {
            this.a = jjz;
            this.b = jkd;
            this.c = ajdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp p = this.b.a(FriendSuggestionPlacement.ADD_FRIENDS_FOOTER).p(new 1(this));
            akcr.a((Object) p, "dataProvider.getAddFrien…::displayInfoContainer) }");
            ajdp a = this.c.a((ajdw) this.a.j.h());
            akcr.a((Object) a, "searchTextObservable.obs…dulers.userInteractive())");
            return igs.a(igs.a(p, a, (akbw) 2.a), (ajdp) this.a.m, (akbw) new 3(this)).p(new 4(this));
        }
    }

    /* renamed from: jjz$e */
    static final class e extends akcs implements akbk<ajdp<List<? extends c<? extends Object>>>> {
        final /* synthetic */ jjz a;
        private /* synthetic */ jkd b;
        private /* synthetic */ ajdp c;

        /* renamed from: jjz$e$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<SelectContactsNotOnSnapchatModel> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (SelectContactsNotOnSnapchatModel selectContactsNotOnSnapchatModel : iterable) {
                    Object phone = selectContactsNotOnSnapchatModel.phone();
                    akcr.a(phone, "item.phone()");
                    arrayList.add(new a(phone, selectContactsNotOnSnapchatModel.displayName(), selectContactsNotOnSnapchatModel));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jjz$e$3 */
        static final class 3<T, R> implements ajfc<T, R> {
            private /* synthetic */ e a;

            /* renamed from: jjz$e$3$a */
            static final class a extends akcq implements akbw<SelectContactsNotOnSnapchatModel, jre, zmy> {
                a(jjz jjz) {
                    super(2, jjz);
                }

                public final String getName() {
                    return "contactsNotOnSnapchatToViewModel";
                }

                public final akej getOwner() {
                    return akde.a(jjz.class);
                }

                public final String getSignature() {
                    return "contactsNotOnSnapchatToViewModel(Lcom/snap/core/db/query/ContactsNotOnSnapchatModel$SelectContactsNotOnSnapchatModel;Lcom/snap/identity/ui/shared/CornerType;)Lcom/snap/ui/recycling/viewmodel/AdapterViewModel;";
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    SelectContactsNotOnSnapchatModel selectContactsNotOnSnapchatModel = (SelectContactsNotOnSnapchatModel) obj;
                    jre jre = (jre) obj2;
                    akcr.b(selectContactsNotOnSnapchatModel, "p1");
                    akcr.b(jre, "p2");
                    return new jsf(selectContactsNotOnSnapchatModel, irc.a, irc.t.getName(), ((jjz) this.receiver).k.getString(R.string.invite_to_snapchat), jre, b.CONTACTS_NOT_ON_SNAPCHAT.value);
                }
            }

            3(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                Iterable<SelectContactsNotOnSnapchatModel> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (SelectContactsNotOnSnapchatModel cVar : iterable) {
                    arrayList.add(new c(cVar, new a(this.a.a)));
                }
                return (List) arrayList;
            }
        }

        /* renamed from: jjz$e$2 */
        static final class 2 extends akcq implements akbw<List<? extends a<SelectContactsNotOnSnapchatModel>>, String, List<? extends SelectContactsNotOnSnapchatModel>> {
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

        e(jjz jjz, jkd jkd, ajdp ajdp) {
            this.a = jjz;
            this.b = jkd;
            this.c = ajdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp p = this.b.d().p(new 1(this));
            akcr.a((Object) p, "dataProvider.getContacts…::displayInfoContainer) }");
            ajdp a = this.c.a((ajdw) this.a.j.h());
            akcr.a((Object) a, "searchTextObservable.obs…dulers.userInteractive())");
            return igs.a(p, a, (akbw) 2.a).p(new 3(this));
        }
    }

    /* renamed from: jjz$f */
    static final class f extends akcs implements akbk<znh<zmy>> {
        private /* synthetic */ jjz a;

        f(jjz jjz) {
            this.a = jjz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object string = this.a.k.getString(R.string.search_header_title);
            akcr.a(string, "resources.getString(R.string.search_header_title)");
            return znk.a(new jrz(string));
        }
    }

    /* renamed from: jjz$g */
    static final class g extends akcs implements akbk<jub> {
        private /* synthetic */ jjz a;

        g(jjz jjz) {
            this.a = jjz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jub(this.a.k.getString(R.string.no_results_text, new Object[]{abqi.a(abpz.POOP)}));
        }
    }

    /* renamed from: jjz$h */
    static final class h extends akcs implements akbk<ajdp<List<? extends c<? extends Object>>>> {
        final /* synthetic */ jjz a;
        final /* synthetic */ jkd b;
        private /* synthetic */ ajdp c;

        /* renamed from: jjz$h$1 */
        static final class 1<T> implements ajfl<String> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                String str = (String) obj;
                akcr.b(str, "it");
                return ((CharSequence) str).length() > 0;
            }
        }

        /* renamed from: jjz$h$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ h a;

            /* renamed from: jjz$h$2$a */
            public static final class a<T1, T2, T3, T4, R> implements ajfe<T1, T2, T3, T4, R> {
                final /* synthetic */ 2 a;

                /* renamed from: jjz$h$2$a$a */
                static final class a extends akcs implements akbw<ito, jre, zmy> {
                    private /* synthetic */ ito a;
                    private /* synthetic */ a b;

                    a(ito ito, a aVar) {
                        this.a = ito;
                        this.b = aVar;
                        super(2);
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        ito ito = (ito) obj;
                        jre jre = (jre) obj2;
                        akcr.b(ito, UnlockablesModel.DATA);
                        akcr.b(jre, "corner");
                        jjz jjz = this.b.a.a.a;
                        jjz jjz2 = this.b.a.a.a;
                        ito ito2 = this.a;
                        boolean z = ajyu.a((Iterable) ajym.b((Object[]) new FriendLinkType[]{FriendLinkType.MUTUAL, FriendLinkType.OUTGOING, FriendLinkType.FOLLOWING}), (Object) jjz2.n.b(ito2.a)) && jjz2.b.contains(ito2.c);
                        return new jvm(ito, jjz.o.a(ito.a), jjz.h, jjz.i, z, b.REMOTE_SEARCH.value, jre, jjz.p);
                    }
                }

                public a(2 2) {
                    this.a = 2;
                }

                public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                    List list = (List) t4;
                    List list2 = (List) t3;
                    Object obj = (List) t1;
                    Iterable<WithDisplayInfo> iterable = (znh) t2;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (WithDisplayInfo username : iterable) {
                        arrayList.add(username.username());
                    }
                    List list3 = (List) arrayList;
                    Collection arrayList2 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (true) {
                        int i = 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((itn) next).b != FriendLinkType.BLOCKED) {
                            i = 0;
                        }
                        if (i != 0) {
                            arrayList2.add(next);
                        }
                    }
                    Iterable<itn> iterable2 = (List) arrayList2;
                    Collection arrayList3 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                    for (itn itn : iterable2) {
                        arrayList3.add(itn.a);
                    }
                    List d = ajyu.d((Collection) ajyu.d((Collection) list3, (Iterable) list), (Iterable) (List) arrayList3);
                    akcr.a(obj, "serverFriends");
                    arrayList3 = new ArrayList();
                    for (Object next2 : (Iterable) obj) {
                        if ((d.contains(((ito) next2).a) ^ 1) != 0) {
                            arrayList3.add(next2);
                        }
                    }
                    Iterable<ito> iterable3 = (List) arrayList3;
                    Collection arrayList4 = new ArrayList(ajyn.a((Iterable) iterable3, 10));
                    for (ito ito : iterable3) {
                        arrayList4.add(new c(ito, new a(ito, this)));
                    }
                    return (List) arrayList4;
                }
            }

            /* renamed from: jjz$h$2$b */
            static final class b<T, R> implements ajfc<T, R> {
                public static final b a = new b();

                b() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akxa akxa = (akxa) obj;
                    akcr.b(akxa, "it");
                    return (agzo) fst.a(akxa);
                }
            }

            /* renamed from: jjz$h$2$c */
            static final class c<T> implements ajfb<Throwable> {
                public static final c a = new c();

                c() {
                }

                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }

            /* renamed from: jjz$h$2$d */
            static final class d<T, R> implements ajfc<Throwable, ajeb<? extends agzo>> {
                public static final d a = new d();

                d() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "it");
                    return ajvo.a(ajsn.a);
                }
            }

            /* renamed from: jjz$h$2$e */
            static final class e<T, R> implements ajfc<T, R> {
                private /* synthetic */ 2 a;

                e(2 2) {
                    this.a = 2;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    agzo agzo = (agzo) obj;
                    akcr.b(agzo, "it");
                    jjz jjz = this.a.a.a;
                    ArrayList arrayList = new ArrayList();
                    List<aemj> list = agzo.b;
                    if (list != null) {
                        for (aemj aemj : list) {
                            aejy aejy = (aejy) ajyu.g(ajyu.k(aemj.f.values()));
                            String str = aejy != null ? aejy.b : null;
                            Object obj2 = aemj.b;
                            akcr.a(obj2, "officialUser.username");
                            arrayList.add(new ito(obj2, aemj.c, aemj.a, null, true, str, aemj.i, aemj.k, aemj.j, null, null, 3584));
                        }
                    }
                    if (!(agzo.a == null || agzo.a.isEmpty() || ((agzk) agzo.a.get(0)).a == null)) {
                        aelf aelf = ((agzk) agzo.a.get(0)).a;
                        Object obj3 = aelf.a;
                        akcr.a(obj3, "name");
                        String str2 = aelf.d;
                        String str3 = aelf.b;
                        String string = jjz.k.getString(R.string.search_add_reason);
                        String str4 = aelf.E;
                        String str5 = aelf.H;
                        ito ito = r4;
                        ito ito2 = new ito(obj3, str2, str3, string, false, null, null, null, null, str5, str4, 2496);
                        arrayList.add(ito);
                    }
                    return arrayList;
                }
            }

            2(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str = (String) obj;
                akcr.b(str, "searchQuery");
                obj = this.a.a.g.i(str).a((ajdw) this.a.a.j.b()).f(b.a).d((ajfb) c.a).h(d.a).f(new e(this)).i();
                akcr.a(obj, "remoteFriends");
                ajdp a = this.a.b.a(FriendSuggestionPlacement.ADD_FRIENDS_FOOTER);
                jkd jkd = this.a.b;
                ajdp j = ajdp.a((Callable) new i(jkd)).b((ajdw) jkd.b().i()).j(ajfu.a);
                String str2 = "Observable\n             …  .distinctUntilChanged()";
                akcr.a((Object) j, str2);
                ajdp e = jkd.a().e();
                akcr.a((Object) e, "friendRepository.friendsWithActionsInProgress()");
                Object p = igs.a(j, e, (akbw) j.a).a((ajdw) jkd.b().i()).p(k.a);
                akcr.a(p, "Observable\n             …     .map { it.toList() }");
                jkd jkd2 = this.a.b;
                Object j2 = ajdp.a((Callable) new g(jkd2)).b((ajdw) jkd2.b().i()).j(ajfu.a);
                akcr.a(j2, str2);
                ajdp a2 = ajdp.a((ajdt) obj, (ajdt) a, (ajdt) p, (ajdt) j2, (ajfe) new a(this));
                if (a2 == null) {
                    akcr.a();
                }
                return a2;
            }
        }

        h(jjz jjz, ajdp ajdp, jkd jkd) {
            this.a = jjz;
            this.c = ajdp;
            this.b = jkd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.c.a((ajfl) 1.a).u(new 2(this));
        }
    }

    /* renamed from: jjz$i */
    static final class i extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ jjz a;

        /* renamed from: jjz$i$a */
        public static final class a<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
            private /* synthetic */ i a;

            public a(i iVar) {
                this.a = iVar;
            }

            public final R apply(T1 t1, T2 t2, T3 t3) {
                znh a;
                List d = ajyu.d((Collection) ajyu.d((Collection) (List) t1, (Iterable) (List) t2), (Iterable) (List) t3);
                znh znh = (znh) this.a.a.a.b();
                if (d.isEmpty()) {
                    a = znk.a((jub) this.a.a.c.b());
                } else {
                    Iterable iterable = d;
                    Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
                    int i = 0;
                    for (Object next : iterable) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ajym.a();
                        }
                        c cVar = (c) next;
                        jre a2 = jrf.a(true, i, d.size());
                        akcr.b(a2, "cornerStyle");
                        arrayList.add((zmy) cVar.b.invoke(cVar.a, a2));
                        i = i2;
                    }
                    a = znk.a((List) arrayList);
                }
                return znk.a(znh, a);
            }
        }

        i(jjz jjz) {
            this.a = jjz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp a = ajdp.a((ajdt) (ajdp) this.a.e.b(), (ajdt) (ajdp) this.a.f.b(), (ajdt) (ajdp) this.a.d.b(), (ajfd) new a(this));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jjz.class), "headerViewModel", "getHeaderViewModel()Lcom/snap/ui/seeking/Seekable;"), new akdc(akde.a(jjz.class), "noResultViewModel", "getNoResultViewModel()Lcom/snap/identity/ui/shared/nofriends/NoFriendsViewModel;"), new akdc(akde.a(jjz.class), "searchViewModels", "getSearchViewModels()Lio/reactivex/Observable;"), new akdc(akde.a(jjz.class), "remoteSearch", "getRemoteSearch()Lio/reactivex/Observable;"), new akdc(akde.a(jjz.class), "filteredAddFriendsSearch", "getFilteredAddFriendsSearch()Lio/reactivex/Observable;"), new akdc(akde.a(jjz.class), "filteredContactsNotOnSnapchat", "getFilteredContactsNotOnSnapchat()Lio/reactivex/Observable;")};
    }

    public jjz(ira ira, ajdp<String> ajdp, idj idj, String str, zfw zfw, Resources resources, jkd jkd, jth jth, ajwl<Long> ajwl, ixj ixj, zpd zpd, usd usd, ypo ypo, ith ith) {
        akcr.b(ira, "identityApi");
        akcr.b(ajdp, "searchTextObservable");
        akcr.b(idj, "uiPage");
        akcr.b(str, "featureName");
        akcr.b(zfw, "schedulers");
        akcr.b(resources, "resources");
        akcr.b(jkd, "dataProvider");
        akcr.b(jth, "addedMeAndQuickAddSeenLogger");
        akcr.b(ajwl, "lastSeenAddedMeSectionTimestamp");
        akcr.b(ixj, "friendRepository");
        akcr.b(zpd, "dataIdMapper");
        akcr.b(usd, "unifiedProfileLauncher");
        akcr.b(ypo, "publicUserStoriesSyncableSection");
        akcr.b(ith, "analyticsSource");
        this.g = ira;
        this.h = idj;
        this.i = str;
        this.j = zfw;
        this.k = resources;
        this.l = jth;
        this.m = ajwl;
        this.n = ixj;
        this.o = zpd;
        this.r = usd;
        this.s = ypo;
        this.p = ith;
        this.d = ajxh.a(new h(this, ajdp, jkd));
        this.e = ajxh.a(new d(this, jkd, ajdp));
        this.f = ajxh.a(new e(this, jkd, ajdp));
    }

    public final void a(View view, zmy zmy) {
        this.s.a(view, zmy);
    }

    public final void b(View view, zmy zmy) {
        this.s.b(view, zmy);
    }

    public final ajdp<znh<zmy>> c() {
        return (ajdp) this.q.b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.b.add(isj.b);
    }

    public final void onDispose() {
        this.s.dispose();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSearchFriendLongClickEvent(jvn jvn) {
        akcr.b(jvn, "event");
        this.r.a(new usq(usg.FRIEND_PROFILE, jvn.a, jvn.b, abbd.SEARCH_CONTACT, null, 16));
    }
}
