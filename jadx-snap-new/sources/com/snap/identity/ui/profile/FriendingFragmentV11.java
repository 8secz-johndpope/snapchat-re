package com.snap.identity.ui.profile;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abtj;
import defpackage.achi;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.akcr;
import defpackage.cfl;
import defpackage.cfv;
import defpackage.iho;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zmy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FriendingFragmentV11 extends MainPageFragment {
    private boolean a;
    private View b;
    private TextView c;
    private ImageButton d;
    private EditText e;
    private View f;
    float g;
    int h;
    int i;
    float j;
    int k;
    int l;
    float m;
    a n = a.NONE;
    View o;
    SnapFontTextView p;
    View q;
    boolean r;
    final ajwl<String> s;
    final OnScrollListener t;

    public enum a {
        HEADER_ANIMATION_IN_PROGRESS,
        HEADER_ANIMATION_FINISH,
        HEADER_HIDDEN_WITH_RECYCLER_MOVE_UP,
        NONE
    }

    static final class c implements OnClickListener {
        private /* synthetic */ FriendingFragmentV11 a;
        private /* synthetic */ List b;

        c(FriendingFragmentV11 friendingFragmentV11, List list) {
            this.a = friendingFragmentV11;
            this.b = list;
        }

        public final void onClick(View view) {
            FriendingFragmentV11.a(this.a, this.b);
        }
    }

    static final class d implements OnFocusChangeListener {
        private /* synthetic */ FriendingFragmentV11 a;
        private /* synthetic */ List b;

        d(FriendingFragmentV11 friendingFragmentV11, List list) {
            this.a = friendingFragmentV11;
            this.b = list;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                FriendingFragmentV11.a(this.a, this.b);
            }
        }
    }

    static final class h implements OnEditorActionListener {
        private /* synthetic */ EditText a;

        h(EditText editText) {
            this.a = editText;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                jrl.a(this.a.getContext());
            }
            return true;
        }
    }

    public static final class b extends OnScrollListener {
        private /* synthetic */ FriendingFragmentV11 a;

        b(FriendingFragmentV11 friendingFragmentV11) {
            this.a = friendingFragmentV11;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            if (i != 0 && abtj.a(this.a.getContext())) {
                jrl.a(this.a.getContext());
            }
        }

        /* JADX WARNING: Missing block: B:28:0x00f0, code skipped:
            if (r8 < r1.getItemCount()) goto L_0x00f4;
     */
        public final void onScrolled(android.support.v7.widget.RecyclerView r8, int r9, int r10) {
            /*
            r7 = this;
            r0 = "view";
            defpackage.akcr.b(r8, r0);
            r1 = r7.a;
            r1 = r1.r;
            if (r1 != 0) goto L_0x0010;
        L_0x000b:
            if (r9 != 0) goto L_0x0010;
        L_0x000d:
            if (r10 != 0) goto L_0x0010;
        L_0x000f:
            return;
        L_0x0010:
            r9 = r8.computeVerticalScrollOffset();
            r9 = (float) r9;
            r10 = r8.getY();
            r9 = r9 - r10;
            r10 = r7.a;
            r10 = r10.g;
            r10 = java.lang.Math.min(r9, r10);
            r1 = r7.a;
            r1 = r1.g();
            r2 = -1054867456; // 0xffffffffc1200000 float:-10.0 double:NaN;
            r2 = r10 / r2;
            r1.setTranslationY(r2);
            r2 = r7.a;
            r2 = r2.g;
            r2 = r10 / r2;
            r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r2 = r3 - r2;
            r1.setAlpha(r2);
            r1 = r7.a;
            r1 = r1.g();
            r1 = r1.getAlpha();
            r2 = 21;
            r4 = 0;
            r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
            if (r1 != 0) goto L_0x0070;
        L_0x004d:
            r1 = r7.a;
            r1 = r1.i();
            r1 = r1.getTranslationY();
            r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r6 = r7.a;
            r6 = r6.m;
            r6 = r6 * r5;
            r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
            if (r1 == 0) goto L_0x0063;
        L_0x0062:
            goto L_0x0070;
        L_0x0063:
            r10 = android.os.Build.VERSION.SDK_INT;
            if (r10 < r2) goto L_0x00c0;
        L_0x0067:
            r10 = r7.a;
            r1 = -1;
            r2 = r10.j;
            com.snap.identity.ui.profile.FriendingFragmentV11.a(r10, r1, r2);
            goto L_0x00c0;
        L_0x0070:
            r1 = r7.a;
            r1 = r1.i();
            r5 = r7.a;
            r5 = r5.m;
            r5 = java.lang.Math.min(r9, r5);
            r5 = -r5;
            r1.setTranslationY(r5);
            r1 = r7.a;
            r1 = r1.g;
            r10 = r10 / r1;
            r10 = (int) r10;
            r1 = r7.a;
            r1 = r1.k;
            r10 = r10 * r1;
            r1 = r7.a;
            r1 = r1.i();
            r5 = r7.a;
            r5 = r5.i();
            r5 = r5.getLayoutParams();
            if (r5 == 0) goto L_0x0184;
        L_0x009f:
            r5 = (android.widget.RelativeLayout.LayoutParams) r5;
            r6 = r7.a;
            r6 = r6.h;
            r6 = r6 + r10;
            r5.setMarginStart(r6);
            r10 = r7.a;
            r10 = r10.i;
            r5.setMarginEnd(r10);
            r5 = (android.view.ViewGroup.LayoutParams) r5;
            r1.setLayoutParams(r5);
            r10 = android.os.Build.VERSION.SDK_INT;
            if (r10 < r2) goto L_0x00c0;
        L_0x00b9:
            r10 = r7.a;
            r1 = r10.l;
            com.snap.identity.ui.profile.FriendingFragmentV11.a(r10, r1, r4);
        L_0x00c0:
            r10 = r7.a;
            defpackage.akcr.b(r8, r0);
            r0 = r8.getLayoutManager();
            if (r0 == 0) goto L_0x017c;
        L_0x00cb:
            r0 = (android.support.v7.widget.LinearLayoutManager) r0;
            r0 = r0.findFirstCompletelyVisibleItemPosition();
            r1 = r8.getAdapter();
            if (r1 == 0) goto L_0x0174;
        L_0x00d7:
            r1 = (defpackage.zml) r1;
            if (r0 < 0) goto L_0x00f9;
        L_0x00db:
            r2 = r1.getItemCount();
            if (r0 < r2) goto L_0x00e2;
        L_0x00e1:
            goto L_0x00f9;
        L_0x00e2:
            r8 = r8.getTranslationY();
            r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r8 == 0) goto L_0x00f3;
        L_0x00ea:
            r8 = r0 + 1;
            r2 = r1.getItemCount();
            if (r8 >= r2) goto L_0x00f3;
        L_0x00f2:
            goto L_0x00f4;
        L_0x00f3:
            r8 = r0;
        L_0x00f4:
            r8 = r1.a(r8);
            goto L_0x00fa;
        L_0x00f9:
            r8 = 0;
        L_0x00fa:
            r8 = r10.a(r8);
            r10 = r8;
            r10 = (java.lang.CharSequence) r10;
            r0 = 0;
            if (r10 == 0) goto L_0x010d;
        L_0x0104:
            r1 = r10.length();
            if (r1 != 0) goto L_0x010b;
        L_0x010a:
            goto L_0x010d;
        L_0x010b:
            r1 = 0;
            goto L_0x010e;
        L_0x010d:
            r1 = 1;
        L_0x010e:
            if (r1 != 0) goto L_0x013f;
        L_0x0110:
            r1 = r7.a;
            r1 = r1.j();
            r1.setVisibility(r0);
            r0 = r7.a;
            r0 = r0.m;
            r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r0 = r0 / r2;
            r1.setTranslationY(r0);
            r1.setAlpha(r3);
            r0 = r7.a;
            r0 = r0.p;
            if (r0 != 0) goto L_0x0131;
        L_0x012c:
            r1 = "sectionHeader";
            defpackage.akcr.a(r1);
        L_0x0131:
            r0.setText(r10);
            r10 = r7.a;
            if (r8 != 0) goto L_0x013b;
        L_0x0138:
            defpackage.akcr.a();
        L_0x013b:
            r10.a(r8);
            goto L_0x0150;
        L_0x013f:
            r8 = r7.a;
            r8 = r8.j();
            r10 = 8;
            r8.setVisibility(r10);
            r8.setTranslationY(r4);
            r8.setAlpha(r4);
        L_0x0150:
            r8 = r7.a;
            r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
            if (r10 <= 0) goto L_0x015f;
        L_0x0156:
            r10 = r8.m;
            r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
            if (r10 >= 0) goto L_0x015f;
        L_0x015c:
            r9 = com.snap.identity.ui.profile.FriendingFragmentV11.a.HEADER_ANIMATION_IN_PROGRESS;
            goto L_0x016c;
        L_0x015f:
            r10 = r7.a;
            r10 = r10.m;
            r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
            if (r9 <= 0) goto L_0x016a;
        L_0x0167:
            r9 = com.snap.identity.ui.profile.FriendingFragmentV11.a.HEADER_ANIMATION_FINISH;
            goto L_0x016c;
        L_0x016a:
            r9 = com.snap.identity.ui.profile.FriendingFragmentV11.a.NONE;
        L_0x016c:
            r10 = "<set-?>";
            defpackage.akcr.b(r9, r10);
            r8.n = r9;
            return;
        L_0x0174:
            r8 = new ajxt;
            r9 = "null cannot be cast to non-null type com.snap.ui.recycling.adapter.ViewModelAdapter";
            r8.<init>(r9);
            throw r8;
        L_0x017c:
            r8 = new ajxt;
            r9 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager";
            r8.<init>(r9);
            throw r8;
        L_0x0184:
            r8 = new ajxt;
            r9 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
            r8.<init>(r9);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.profile.FriendingFragmentV11$b.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
        }
    }

    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ FriendingFragmentV11 a;

        e(FriendingFragmentV11 friendingFragmentV11) {
            this.a = friendingFragmentV11;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "it");
            FragmentActivity activity = this.a.getActivity();
            if (activity == null) {
                akcr.a();
            }
            activity.onBackPressed();
            return ajxw.a;
        }
    }

    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ FriendingFragmentV11 a;
        private /* synthetic */ List b;

        f(FriendingFragmentV11 friendingFragmentV11, List list) {
            this.a = friendingFragmentV11;
            this.b = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            akcr.b(charSequence, "text");
            this.a.s.a(charSequence.toString());
            View view = this.a.o;
            if (view == null) {
                akcr.a("clearSearchButton");
            }
            int i = 8;
            view.setVisibility((charSequence.length() > 0 ? 1 : null) != null ? 0 : 8);
            this.a.a(charSequence);
            FriendingFragmentV11 friendingFragmentV11 = this.a;
            List<ajxm> list = this.b;
            View view2 = friendingFragmentV11.q;
            if (view2 == null) {
                akcr.a("sectionHeaderContainer");
            }
            if (!(friendingFragmentV11.n == a.HEADER_ANIMATION_FINISH || friendingFragmentV11.n == a.HEADER_HIDDEN_WITH_RECYCLER_MOVE_UP)) {
                i = 0;
            }
            view2.setVisibility(i);
            if (friendingFragmentV11.n == a.HEADER_ANIMATION_FINISH) {
                for (ajxm ajxm : list) {
                    RecyclerView recyclerView = (RecyclerView) ajxm.a;
                    float floatValue = (-friendingFragmentV11.m) + ((Number) ajxm.b).floatValue();
                    recyclerView.scrollToPosition(0);
                    recyclerView.setTranslationY(floatValue);
                    iho.g(recyclerView, (int) floatValue);
                }
                friendingFragmentV11.n = a.HEADER_HIDDEN_WITH_RECYCLER_MOVE_UP;
            }
            return ajxw.a;
        }
    }

    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ FriendingFragmentV11 a;

        g(FriendingFragmentV11 friendingFragmentV11) {
            this.a = friendingFragmentV11;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "it");
            this.a.h().setText("");
            return ajxw.a;
        }
    }

    public FriendingFragmentV11() {
        Object i = ajwl.i("");
        akcr.a(i, "BehaviorSubject.createDefault(\"\")");
        this.s = i;
        this.t = new b(this);
    }

    public static final /* synthetic */ void a(FriendingFragmentV11 friendingFragmentV11, int i, float f) {
        View view = friendingFragmentV11.b;
        if (view == null) {
            akcr.a("headerContainer");
        }
        view.setBackgroundColor(i);
        view.setElevation(f);
        view = friendingFragmentV11.q;
        if (view == null) {
            akcr.a("sectionHeaderContainer");
        }
        view.setBackgroundColor(i);
        view.setElevation(f);
        View view2 = friendingFragmentV11.f;
        if (view2 == null) {
            akcr.a("searchBar");
        }
        view2.setElevation(f);
    }

    public static /* synthetic */ void a(FriendingFragmentV11 friendingFragmentV11, View view, CharSequence charSequence, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        friendingFragmentV11.a(view, charSequence, i, z);
    }

    public static final /* synthetic */ void a(FriendingFragmentV11 friendingFragmentV11, List list) {
        if (friendingFragmentV11.n == a.HEADER_ANIMATION_IN_PROGRESS) {
            for (RecyclerView smoothScrollToPosition : list) {
                smoothScrollToPosition.smoothScrollToPosition(0);
            }
            friendingFragmentV11.n = a.NONE;
        }
    }

    public String a(zmy zmy) {
        return null;
    }

    public final void a(View view, CharSequence charSequence, int i, boolean z) {
        akcr.b(view, "view");
        akcr.b(charSequence, "headerText");
        Object findViewById = view.findViewById(R.id.section_header);
        akcr.a(findViewById, "view.findViewById(R.id.section_header)");
        this.p = (SnapFontTextView) findViewById;
        SnapFontTextView snapFontTextView = this.p;
        if (snapFontTextView == null) {
            akcr.a("sectionHeader");
        }
        snapFontTextView.setTypefaceStyle(i);
        Object findViewById2 = view.findViewById(R.id.header_container);
        akcr.a(findViewById2, "view.findViewById(R.id.header_container)");
        this.b = findViewById2;
        findViewById2 = view.findViewById(R.id.header_dismiss_button);
        akcr.a(findViewById2, "view.findViewById(R.id.header_dismiss_button)");
        this.d = (ImageButton) findViewById2;
        findViewById2 = view.findViewById(R.id.header_title);
        akcr.a(findViewById2, "view.findViewById(R.id.header_title)");
        this.c = (TextView) findViewById2;
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("headerTitle");
        }
        textView.setText(charSequence);
        Object findViewById3 = view.findViewById(R.id.search_bar);
        akcr.a(findViewById3, "view.findViewById(R.id.search_bar)");
        this.f = findViewById3;
        findViewById3 = view.findViewById(R.id.search_text_view);
        akcr.a(findViewById3, "view.findViewById(R.id.search_text_view)");
        this.e = (EditText) findViewById3;
        findViewById3 = view.findViewById(R.id.clear_search_button);
        akcr.a(findViewById3, "view.findViewById(R.id.clear_search_button)");
        this.o = findViewById3;
        Object findViewById4 = view.findViewById(R.id.section_header_container);
        akcr.a(findViewById4, "view.findViewById(R.id.section_header_container)");
        this.q = findViewById4;
        this.m = getResources().getDimension(R.dimen.my_friends_search_bar_pos);
        this.g = getResources().getDimension(R.dimen.my_friends_header_title_y_pos);
        ImageButton imageButton = this.d;
        if (imageButton == null) {
            akcr.a("dismissButton");
        }
        this.k = imageButton.getWidth() + getResources().getDimensionPixelOffset(R.dimen.my_friends_searchbar_backbutton_padding);
        this.j = getResources().getDimension(R.dimen.add_friends_header_elevation);
        this.l = getResources().getColor(R.color.add_friends_background);
        view = this.f;
        String str = "searchBar";
        if (view == null) {
            akcr.a(str);
        }
        String str2 = "receiver$0";
        akcr.b(view, str2);
        MarginLayoutParams f = iho.f(view);
        int i2 = 0;
        this.h = f != null ? f.getMarginStart() : 0;
        view = this.f;
        if (view == null) {
            akcr.a(str);
        }
        akcr.b(view, str2);
        f = iho.f(view);
        if (f != null) {
            i2 = f.getMarginEnd();
        }
        this.i = i2;
        this.r = z;
    }

    public void a(CharSequence charSequence) {
        akcr.b(charSequence, "text");
    }

    public void a(String str) {
        akcr.b(str, "text");
    }

    public final void a(List<? extends ajxm<? extends RecyclerView, Float>> list) {
        akcr.b(list, "viewList");
        ImageButton imageButton = this.d;
        if (imageButton == null) {
            akcr.a("dismissButton");
        }
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, cfl.c(imageButton).p(new e(this)).l(), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
        EditText editText = this.e;
        String str = "searchText";
        if (editText == null) {
            akcr.a(str);
        }
        ScopedFragment.a((ScopedFragment) this, cfv.a(editText).p(new f(this, list)).l(), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
        View view = this.o;
        if (view == null) {
            akcr.a("clearSearchButton");
        }
        ScopedFragment.a((ScopedFragment) this, cfl.c(view).p(new g(this)).l(), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
        Iterable<ajxm> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (ajxm ajxm : iterable) {
            arrayList.add((RecyclerView) ajxm.a);
        }
        List list2 = (List) arrayList;
        EditText editText2 = this.e;
        if (editText2 == null) {
            akcr.a(str);
        }
        editText2.setOnEditorActionListener(new h(editText2));
        editText2.setOnClickListener(new c(this, list2));
        editText2.setOnFocusChangeListener(new d(this, list2));
    }

    public void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        k();
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView g() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("headerTitle");
        }
        return textView;
    }

    /* Access modifiers changed, original: protected|final */
    public final EditText h() {
        EditText editText = this.e;
        if (editText == null) {
            akcr.a("searchText");
        }
        return editText;
    }

    /* Access modifiers changed, original: protected|final */
    public final View i() {
        View view = this.f;
        if (view == null) {
            akcr.a("searchBar");
        }
        return view;
    }

    /* Access modifiers changed, original: protected|final */
    public final View j() {
        View view = this.q;
        if (view == null) {
            akcr.a("sectionHeaderContainer");
        }
        return view;
    }

    /* Access modifiers changed, original: protected|final */
    public final void k() {
        if (this.a && abtj.a(getContext())) {
            jrl.a(getContext());
        }
    }

    public void onStart() {
        super.onStart();
        this.a = true;
    }

    public void onStop() {
        k();
        this.a = false;
        super.onStop();
    }
}
