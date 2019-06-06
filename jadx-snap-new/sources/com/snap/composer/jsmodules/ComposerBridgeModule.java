package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerAction;
import com.snap.composer.exceptions.ComposerException;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.ajdp;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajzl;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

public abstract class ComposerBridgeModule extends ModuleFactory {

    static final class b implements ComposerAction {
        private /* synthetic */ ajej a;

        b(ajej ajej) {
            this.a = ajej;
        }

        public final /* synthetic */ Object perform(Object[] objArr) {
            this.a.dispose();
            return null;
        }
    }

    static final class c<T> implements ajfb<T> {
        private /* synthetic */ ComposerAction a;
        private /* synthetic */ akbk b;

        c(ComposerAction composerAction, akbk akbk) {
            this.a = composerAction;
            this.b = akbk;
        }

        public final void accept(T t) {
            try {
                this.a.perform((Object[]) this.b.invoke());
            } catch (ComposerException unused) {
            }
        }
    }

    static final class a extends akcs implements akbk<Object[]> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return new Object[0];
        }
    }

    public static final /* synthetic */ Object access$observerCallback(ComposerBridgeModule composerBridgeModule, ajdp ajdp, Object[] objArr, akbk akbk) {
        if (objArr.length == 1 && (objArr[0] instanceof ComposerAction)) {
            Object obj = objArr[0];
            if (obj != null) {
                return ajzl.a(ajxs.a("cancel", new b(ajdp.f((ajfb) new c((ComposerAction) obj, akbk)))));
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.composer.actions.ComposerAction");
        }
        throw new ComposerException("Should have a single parameter with a callback");
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> ComposerAction makeBridgeMethod(akbk<? extends T> akbk) {
        akcr.b(akbk, "call");
        return new ComposerBridgeModule$makeBridgeMethod$1(akbk);
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> ComposerAction makeBridgeMethod(akbl<? super Object[], ? extends T> akbl) {
        akcr.b(akbl, "call");
        return new ComposerBridgeModule$makeBridgeMethod$2(akbl);
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> ComposerAction makeObserverMethod(ajdp<T> ajdp) {
        akcr.b(ajdp, "observable");
        return makeObserverMethod(ajdp, a.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> ComposerAction makeObserverMethod(ajdp<T> ajdp, akbk<Object[]> akbk) {
        akcr.b(ajdp, "observable");
        akcr.b(akbk, "callback");
        return new ComposerBridgeModule$makeObserverMethod$$inlined$makeBridgeMethod$1(this, ajdp, akbk);
    }
}
