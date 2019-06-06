package com.snap.identity.ui.profile;

import android.support.v7.widget.RecyclerView;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.query.LegacySearchQueries;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.ajev;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajwm;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.ajyy;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akqq;
import defpackage.gpb;
import defpackage.igs;
import defpackage.ihh;
import defpackage.iqs;
import defpackage.iqz;
import defpackage.irc;
import defpackage.irj;
import defpackage.irm;
import defpackage.isn;
import defpackage.iso;
import defpackage.isp;
import defpackage.isq;
import defpackage.iue;
import defpackage.iyy;
import defpackage.j;
import defpackage.jkc;
import defpackage.jkc.d;
import defpackage.jle;
import defpackage.jlg;
import defpackage.jri;
import defpackage.jtl;
import defpackage.jtn;
import defpackage.jto;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zmy;
import defpackage.zpd;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class MyFriendsPresenter extends zll<MyFriendsFragment> implements k {
    zmh a;
    final zfw b = zgb.a(irc.t.callsite("MyFriendsPresenter"));
    final zms c = new zms(jri.class);
    final zpd d = new zpd();
    ajwm e;
    final ajwl<Set<String>> f;
    final ajwl<Set<String>> g;
    final ajwl<Boolean> h;
    final ajwl<Integer> i;
    iue j;
    irj k;
    Set<String> l;
    final ihh m;
    final iqz n;
    final jkc o;
    final gpb p;
    private zkf q;
    private final ajei r = new ajei();
    private String s;
    private String t;
    private final iqs u;

    static final class a<V> implements Callable<Object> {
        private /* synthetic */ MyFriendsPresenter a;
        private /* synthetic */ irm b;

        a(MyFriendsPresenter myFriendsPresenter, irm irm) {
            this.a = myFriendsPresenter;
            this.b = irm;
        }

        public final /* synthetic */ Object call() {
            ajdp a;
            jkc jkc = this.a.o;
            DbClient a2 = jkc.a();
            Object obj = LegacySearchQueries.FACTORY;
            akcr.a(obj, "LegacySearchQueries.FACTORY");
            obj = obj.getSearchBestFriends();
            akcr.a(obj, "LegacySearchQueries.FACTORY.searchBestFriends");
            Object j = a2.queryAndMapToList(obj, new defpackage.jkc.c(LegacySearchQueries.SELECT_BEST_FRIEND_MAPPER)).b((ajdw) jkc.a.f()).j(ajfu.a);
            String str = "dbClient.queryAndMapToLi…  .distinctUntilChanged()";
            akcr.a(j, str);
            ajdp a3 = igs.a(j);
            if (this.b.d) {
                jkc jkc2 = this.a.o;
                DbClient a4 = jkc2.a();
                Object recentFriends = LegacySearchQueries.FACTORY.getRecentFriends(150);
                akcr.a(recentFriends, "LegacySearchQueries.FACT…entFriends(RECENTS_LIMIT)");
                obj = a4.queryAndMapToList(recentFriends, new d(LegacySearchQueries.SELECT_RECENT_FRIENDS_MAPPER)).b((ajdw) jkc2.a.f()).j(ajfu.a);
                akcr.a(obj, str);
                a = igs.a(obj);
            } else {
                a = ajdp.b((Object) ajyw.a);
                akcr.a((Object) a, "Observable.just(listOf())");
            }
            List c = ajym.c(new jtl());
            zfw zfw = this.a.b;
            MyFriendsFragment myFriendsFragment = (MyFriendsFragment) this.a.getTarget();
            if (myFriendsFragment == null) {
                akcr.a();
            }
            ajdp ajdp = myFriendsFragment.f;
            MyFriendsFragment myFriendsFragment2 = (MyFriendsFragment) this.a.getTarget();
            if (myFriendsFragment2 == null) {
                akcr.a();
            }
            c.add(new jle(zfw, ajdp, myFriendsFragment2.s));
            zfw = this.a.b;
            MyFriendsFragment myFriendsFragment3 = (MyFriendsFragment) this.a.getTarget();
            if (myFriendsFragment3 == null) {
                akcr.a();
            }
            ajdp = myFriendsFragment3.s;
            ajdp b = this.a.o.b();
            ihh ihh = this.a.m;
            iqz iqz = this.a.n;
            zpd zpd = this.a.d;
            gpb gpb = this.a.p;
            obj = (MyFriendsFragment) this.a.getTarget();
            if (obj == null) {
                akcr.a();
            }
            String str2 = "target!!";
            akcr.a(obj, str2);
            obj = obj.getResources().getString(R.string.my_friends_currently_selected);
            String str3 = obj;
            akcr.a(obj, "target!!.resources.getSt…iends_currently_selected)");
            String str4 = str2;
            gpb gpb2 = gpb;
            ajdp ajdp2 = a3;
            zpd zpd2 = zpd;
            ajdp ajdp3 = a;
            ajdp ajdp4 = a;
            jlg jlg = r3;
            zpd zpd3 = zpd2;
            ajdp ajdp5 = a3;
            List list = c;
            jlg jlg2 = new jlg(zfw, ajdp, b, ajdp2, ajdp3, ihh, iqz, zpd3, gpb2, str3, jto.CURRENTLY_SELECTED_FRIENDS, this.a.f, this.a.g, this.a.h, this.a.i, this.b.c);
            list.add(jlg);
            zln zln = this.a;
            zln.bindTo$default(zln, MyFriendsPresenter.a((MyFriendsPresenter) zln).a(jlg), this.a, null, null, 6, null);
            zfw = this.a.b;
            myFriendsFragment3 = (MyFriendsFragment) this.a.getTarget();
            if (myFriendsFragment3 == null) {
                akcr.a();
            }
            list.add(new jlg(zfw, myFriendsFragment3.s, ajdp5, ajdp5, ajdp4, this.a.m, this.a.n, this.a.d, this.a.p, MyFriendsPresenter.b(this.a), jto.BEST_FRIENDS, this.a.f, this.a.g, this.a.h, this.a.i, this.b.c));
            if (this.b.d) {
                zfw = this.a.b;
                myFriendsFragment3 = (MyFriendsFragment) this.a.getTarget();
                if (myFriendsFragment3 == null) {
                    akcr.a();
                }
                list.add(new jlg(zfw, myFriendsFragment3.s, this.a.o.b(), ajdp5, ajdp4, this.a.m, this.a.n, this.a.d, this.a.p, MyFriendsPresenter.c(this.a), jto.RECENT_FRIENDS, this.a.f, this.a.g, this.a.h, this.a.i, this.b.c));
            }
            zfw = this.a.b;
            myFriendsFragment3 = (MyFriendsFragment) this.a.getTarget();
            if (myFriendsFragment3 == null) {
                akcr.a();
            }
            ajdp = myFriendsFragment3.s;
            b = this.a.o.b();
            ihh = this.a.m;
            iqz = this.a.n;
            zpd3 = this.a.d;
            gpb gpb3 = this.a.p;
            obj = (MyFriendsFragment) this.a.getTarget();
            if (obj == null) {
                akcr.a();
            }
            akcr.a(obj, str4);
            obj = obj.getResources().getString(R.string.my_friends);
            str3 = obj;
            akcr.a(obj, "target!!.resources.getString(R.string.my_friends)");
            list.add(new jlg(zfw, ajdp, b, ajdp5, ajdp4, ihh, iqz, zpd3, gpb3, str3, jto.MY_FRIENDS, this.a.f, this.a.g, this.a.h, this.a.i, this.b.c));
            MyFriendsPresenter myFriendsPresenter = this.a;
            zms zms = myFriendsPresenter.c;
            zke a5 = MyFriendsPresenter.a(this.a).a();
            akcr.a((Object) a5, "bus.eventDispatcher");
            ajdw b2 = this.a.b.b();
            ajdw a6 = ajef.a();
            akcr.a((Object) a6, "AndroidSchedulers.mainThread()");
            myFriendsPresenter.a = new zmh(zms, a5, b2, a6, ajyu.k(list), 32);
            MyFriendsPresenter myFriendsPresenter2 = this.a;
            return zln.bindTo$default(myFriendsPresenter2, MyFriendsPresenter.d(myFriendsPresenter2).e(), this.a, null, null, 6, null);
        }
    }

    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ MyFriendsPresenter a;

        b(MyFriendsPresenter myFriendsPresenter) {
            this.a = myFriendsPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            iyy iyy = new iyy();
            Object b = MyFriendsPresenter.b(this.a);
            Object c = MyFriendsPresenter.c(this.a);
            akcr.b(list, "viewModels");
            akcr.b(b, "bestFriendHeaderText");
            akcr.b(c, "recentFriendHeaderText");
            HashMap hashMap = new HashMap();
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                zmy zmy = (zmy) next;
                if (zmy instanceof jtn) {
                    jtn jtn = (jtn) zmy;
                    if ((((CharSequence) jtn.a).length() > 0 ? 1 : null) != null) {
                        Object obj2 = jtn.a;
                        if (akcr.a(obj2, b)) {
                            obj2 = AlphabeticScrollbar.b;
                        } else if (akcr.a(obj2, c)) {
                            obj2 = AlphabeticScrollbar.c;
                        } else {
                            char toUpperCase = Character.toUpperCase(jtn.a.charAt(0));
                            obj2 = iyy.a(toUpperCase) ? String.valueOf(toUpperCase) : AlphabeticScrollbar.e;
                        }
                        if (!hashMap.containsKey(obj2)) {
                            hashMap.put(obj2, Integer.valueOf(i2));
                        }
                    }
                }
                i = i2;
            }
            return hashMap;
        }
    }

    static final class c implements ajev {
        private /* synthetic */ MyFriendsPresenter a;

        c(MyFriendsPresenter myFriendsPresenter) {
            this.a = myFriendsPresenter;
        }

        public final void run() {
            MyFriendsFragment myFriendsFragment = (MyFriendsFragment) this.a.getTarget();
            RecyclerView recyclerView = null;
            RecyclerView a = myFriendsFragment != null ? myFriendsFragment.a() : null;
            if (a == null) {
                akcr.a();
            }
            a.setAdapter(MyFriendsPresenter.d(this.a));
            MyFriendsPresenter myFriendsPresenter = this.a;
            Object i = ajwl.i(ajyw.a);
            akcr.a(i, "BehaviorSubject.createDe…List<AdapterViewModel>())");
            Object p = i.a((ajdw) myFriendsPresenter.b.b()).p(new b(myFriendsPresenter));
            iue iue = myFriendsPresenter.j;
            if (iue == null) {
                akcr.a("scrollBarController");
            }
            zmh zmh = myFriendsPresenter.a;
            if (zmh == null) {
                akcr.a("adapter");
            }
            akcr.a(p, "indexObservable");
            myFriendsFragment = (MyFriendsFragment) myFriendsPresenter.getTarget();
            if (myFriendsFragment != null) {
                recyclerView = myFriendsFragment.a();
            }
            iue.a(zmh, p, i, recyclerView);
        }
    }

    public MyFriendsPresenter(ihh ihh, iqz iqz, jkc jkc, zgb zgb, gpb gpb, iqs iqs) {
        akcr.b(ihh, "clock");
        akcr.b(iqz, "friendmojiApi");
        akcr.b(jkc, "dataProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(iqs, "friendActionDispatcher");
        this.m = ihh;
        this.n = iqz;
        this.o = jkc;
        this.p = gpb;
        this.u = iqs;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.e = ajwm;
        ajwm = ajwl.i(ajyy.a);
        String str = "BehaviorSubject.createDefault(setOf<String>())";
        akcr.a(ajwm, str);
        this.f = ajwm;
        ajwm = ajwl.i(ajyy.a);
        akcr.a(ajwm, str);
        this.g = ajwm;
        ajwm = ajwl.i(Boolean.FALSE);
        akcr.a(ajwm, "BehaviorSubject.createDefault(false)");
        this.h = ajwm;
        ajwm = ajwl.i(Integer.valueOf(3));
        akcr.a(ajwm, "BehaviorSubject.createDe…CTION_INITIAL_ITEM_COUNT)");
        this.i = ajwm;
        this.l = new LinkedHashSet();
    }

    private final void a(String str) {
        if (this.l.contains(str)) {
            this.l.remove(str);
        } else {
            this.l.add(str);
        }
        this.g.a(ajyu.m(this.l));
    }

    public static final /* synthetic */ String b(MyFriendsPresenter myFriendsPresenter) {
        String str = myFriendsPresenter.s;
        if (str == null) {
            akcr.a("bestFriendHeaderText");
        }
        return str;
    }

    public static final /* synthetic */ String c(MyFriendsPresenter myFriendsPresenter) {
        String str = myFriendsPresenter.t;
        if (str == null) {
            akcr.a("recentFriendHeaderText");
        }
        return str;
    }

    public static final /* synthetic */ zmh d(MyFriendsPresenter myFriendsPresenter) {
        zmh zmh = myFriendsPresenter.a;
        if (zmh == null) {
            akcr.a("adapter");
        }
        return zmh;
    }

    /* renamed from: a */
    public final void takeTarget(MyFriendsFragment myFriendsFragment) {
        akcr.b(myFriendsFragment, "target");
        super.takeTarget(myFriendsFragment);
        zkf zkf = new zkf();
        zln.bindTo$default(this, zkf, this, null, null, 6, null);
        this.q = zkf;
        zkf = this.q;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.a(this);
        myFriendsFragment.getLifecycle().a(this);
        Object string = myFriendsFragment.getResources().getString(R.string.my_friends_best_friends);
        akcr.a(string, "target.resources.getStri….my_friends_best_friends)");
        this.s = string;
        string = myFriendsFragment.getResources().getString(R.string.my_friends_recent_friends);
        akcr.a(string, "target.resources.getStri…y_friends_recent_friends)");
        this.t = string;
        this.j = new iue(myFriendsFragment.getContext(), this.b, this.r);
    }

    public final boolean a() {
        return !((Collection) this.l).isEmpty();
    }

    public final void dropTarget() {
        MyFriendsFragment myFriendsFragment = (MyFriendsFragment) getTarget();
        if (myFriendsFragment != null) {
            j lifecycle = myFriendsFragment.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        this.r.a();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        zln.bindTo$default(this, this.e.g(new c(this)), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendAvatarLongClickEvent(isn isn) {
        akcr.b(isn, "event");
        irj irj = this.k;
        if (irj != null) {
            akbl akbl = irj.c;
            if (akbl != null) {
                akbl.invoke(isn);
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendClickAvatarIconEvent(iso iso) {
        akcr.b(iso, "event");
        if (akcr.a((Boolean) this.h.p(), Boolean.TRUE)) {
            String str = iso.a;
            if (str != null) {
                a(str);
                MyFriendsFragment myFriendsFragment = (MyFriendsFragment) getTarget();
                if (myFriendsFragment != null) {
                    myFriendsFragment.b();
                }
            }
            return;
        }
        this.u.a(iso);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendClickEvent(isp isp) {
        akcr.b(isp, "event");
        irj irj = this.k;
        if (irj != null) {
            akbl akbl = irj.a;
            if (akbl != null) {
                akbl.invoke(isp);
            }
        }
        if (akcr.a((Boolean) this.h.p(), Boolean.TRUE)) {
            String str = isp.c;
            if (str != null) {
                a(str);
                MyFriendsFragment myFriendsFragment = (MyFriendsFragment) getTarget();
                if (myFriendsFragment != null) {
                    myFriendsFragment.b();
                }
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendLongClick(isq isq) {
        akcr.b(isq, "event");
        irj irj = this.k;
        if (irj != null) {
            akbl akbl = irj.b;
            if (akbl != null) {
                akbl.invoke(isq);
            }
        }
    }
}
