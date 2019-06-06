package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.snapchat.deck.views.DeckView;
import defpackage.acix.b;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ache */
public abstract class ache<T extends achg, C extends achd<T, C>> {
    private final Map<T, aciv<T, C>> a;
    private final Map<T, aciv<T, C>> b;
    private final fz c;
    private final achf<T, C> d;
    public Deque<C> g;

    protected ache(fz fzVar) {
        this(fzVar, new acgz());
    }

    protected ache(fz fzVar, achf<T, C> achf) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.g = new ArrayDeque();
        this.c = fzVar;
        this.d = achf;
    }

    private static void a(DeckView deckView, aciv<T, C> aciv) {
        ViewGroup viewGroup = aciv.d;
        viewGroup.setVisibility(8);
        deckView.addView(viewGroup);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0048 in {2, 4, 7, 9} preds:[]
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
    private void a(com.snapchat.deck.views.DeckView r2, defpackage.aciv<T, C> r3, defpackage.acih r4) {
        /*
        r1 = this;
        defpackage.ache.a(r2, r3);
        r2 = r3.c;
        r2 = r2 instanceof defpackage.acha;
        if (r2 == 0) goto L_0x0024;
        r2 = r3.c;
        r2 = (defpackage.acha) r2;
        r2 = r2.c();
        r0 = r1.c;
        defpackage.ache.a(r2, r3, r0, r4);
        r1.a(r2);
        r2.getClass();
        r4 = new -$$Lambda$PZZB5mXwqfRagjT7l-qMIpi14P8;
        r4.<init>(r2);
        r3.e = r4;
        return;
        r2 = r3.c;
        r2 = r2 instanceof defpackage.acgx;
        if (r2 == 0) goto L_0x0040;
        r2 = r3.c;
        r2 = (defpackage.acgx) r2;
        r4 = r2.getContentView();
        r0 = r3.d;
        r0.addView(r4);
        r2.getClass();
        r4 = new -$$Lambda$Af_fgg1r9Bej9COkndFINV7e0d0;
        r4.<init>(r2);
        goto L_0x0021;
        r2 = new java.lang.RuntimeException;
        r3 = "PageController must implement a provider";
        r2.<init>(r3);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ache.a(com.snapchat.deck.views.DeckView, aciv, acih):void");
    }

    private static void a(fv fvVar, aciv<?, ?> aciv, fz fzVar, acih acih) {
        if (acih instanceof Parcelable) {
            Bundle arguments = fvVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putParcelable(acih.g, (Parcelable) acih);
            fvVar.setArguments(arguments);
        }
        ache.a(fzVar.a().a(aciv.d.getId(), fvVar, String.valueOf(aciv.a)), fzVar, fvVar);
    }

    private static void a(fv fvVar, fz fzVar) {
        ache.a(fzVar.a().a(fvVar), fzVar, fvVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00f6 in {2, 19, 20, 22, 23, 25, 27, 28, 30} preds:[]
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
    private static void a(defpackage.gg r9, defpackage.fz r10, defpackage.fv r11) {
        /*
        r9.e();	 Catch:{ ClassCastException -> 0x0004 }
        return;
        r9 = move-exception;
        r0 = r10.getClass();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r1 = "mContainer";	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r0 = r0.getDeclaredField(r1);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r1 = 1;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r0.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r0 = r0.get(r10);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r0 = (defpackage.fw) r0;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2 = defpackage.fv.class;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r3 = "mContainerId";	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2 = r2.getDeclaredField(r3);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r3 = new java.util.ArrayList;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r10 = r10.d();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r3.<init>(r10);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r3.add(r11);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r10 = r3.iterator();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = r10.hasNext();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        if (r11 == 0) goto L_0x00b5;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = r10.next();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = (defpackage.fv) r11;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r3 = r0.a();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        if (r3 == 0) goto L_0x00b5;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r3 = r2.getInt(r11);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r4 = r0.a(r3);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r5 = r4 instanceof android.view.ViewGroup;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        if (r5 != 0) goto L_0x0034;
        r10 = "";
        r0 = -1;
        if (r4 == 0) goto L_0x0084;
        r2 = r4.getParent();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2 = (android.view.ViewGroup) r2;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        if (r2 == 0) goto L_0x0084;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r4 = r2.getClass();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r4 = r4.getName();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r5 = r2.getId();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r6 = r2.getChildCount();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2 = r2.getParent();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2 = (android.view.ViewGroup) r2;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        if (r2 == 0) goto L_0x0087;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r10 = r2.getClass();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r10 = r10.getName();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r0 = r2.getId();	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        goto L_0x0087;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r4 = r10;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r5 = -1;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r6 = -1;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r2 = "Sceneroot for fragment %s is not a ViewGroup. ContainerId=%s ParentView=%s ParentId=%s SiblingViewCount=%s GrandParentView=%s GrandParentId=%s";	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7 = 7;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7 = new java.lang.Object[r7];	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r8 = 0;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r8] = r11;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = java.lang.Integer.valueOf(r3);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r1] = r11;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = 2;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r11] = r4;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = 3;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r1 = java.lang.Integer.valueOf(r5);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r11] = r1;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = 4;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r1 = java.lang.Integer.valueOf(r6);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r11] = r1;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = 5;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r11] = r10;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r10 = 6;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r11 = java.lang.Integer.valueOf(r0);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r7[r10] = r11;	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        r10 = java.lang.String.format(r2, r7);	 Catch:{ NoSuchFieldException -> 0x00c5, IllegalAccessException -> 0x00b8 }
        goto L_0x00d8;
        r10 = "Unable to detect problematic view :(";
        goto L_0x00d8;
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;
        r0 = "Reflection error, IllegalAccessException";
        r11.<init>(r0);
        r10 = r10.getMessage();
        goto L_0x00d1;
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;
        r0 = "Reflection error, NoSuchFieldException";
        r11.<init>(r0);
        r10 = r10.getMessage();
        r11.append(r10);
        r10 = r11.toString();
        r11 = new acgy;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r9 = r9.getMessage();
        r0.append(r9);
        r9 = 32;
        r0.append(r9);
        r0.append(r10);
        r9 = r0.toString();
        r11.<init>(r9);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ache.a(gg, fz, fv):void");
    }

    public abstract C a(T t);

    /* Access modifiers changed, original: protected */
    public aciv<T, C> a(DeckView deckView, C c, int i) {
        if ((c instanceof acha) && (c instanceof acgx)) {
            throw new RuntimeException("PageController cannot implement more than one provider");
        }
        acjf acjf = new acjf(deckView.getContext(), c);
        acjf.setLayoutParams(new LayoutParams(-1, -1));
        acjf.setId(View.generateViewId());
        return new aciv(i, c, acjf);
    }

    public final aciv<T, C> a(DeckView deckView, T t) {
        achd a;
        if (this.g.isEmpty() || !((achd) this.g.peek()).getDeckPageType().equals(t)) {
            Map map;
            if (this.a.containsKey(t)) {
                map = this.a;
            } else if (this.b.containsKey(t)) {
                map = this.b;
            } else {
                a = a((achg) t);
            }
            return (aciv) map.get(t);
        }
        a = (achd) this.g.pop();
        aciv a2 = a(deckView, a, -1);
        this.b.put(t, a2);
        return a2;
    }

    public final aciv<T, C> a(DeckView deckView, T t, int i, acjd<T, C> acjd, acih acih) {
        aciv aciv;
        if (this.a.containsKey(t)) {
            aciv = (aciv) this.a.remove(t);
            ache.a(deckView, aciv);
        } else {
            if (this.b.containsKey(t)) {
                aciv = (aciv) this.b.remove(t);
            } else {
                aciv = a(deckView, a((achg) t), i);
                if (acjd != null) {
                    acjd.b(aciv);
                }
            }
            a(deckView, aciv, acih);
        }
        aciv.a(b.ADDED, null);
        return aciv;
    }

    public final aciv<T, C> a(DeckView deckView, T t, acih acih) {
        return a(deckView, t, -1, null, acih);
    }

    public final Set<T> a() {
        return ImmutableSet.copyOf(this.a.keySet());
    }

    public final void a(T t, C c, DeckView deckView) {
        Preconditions.checkArgument(c.getDeckPageType().e() ^ 1);
        this.b.put(t, a(deckView, (achd) c, -1));
    }

    public final void a(ViewGroup viewGroup, aciv<T, C> aciv) {
        viewGroup.removeView(aciv.d);
        aciv.a(b.UNADDED, null);
        if (this.d.a(aciv)) {
            this.a.put(aciv.e(), aciv);
            return;
        }
        if (aciv.c instanceof acha) {
            ache.a(((acha) aciv.c).c(), this.c);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(fv fvVar) {
    }

    public final void b(T t) {
        aciv aciv = (aciv) this.a.get(t);
        if (aciv != null) {
            if (aciv.c instanceof acha) {
                ache.a(((acha) aciv.c).c(), this.c);
            }
            this.a.remove(t);
        }
    }
}
