package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ainf */
public interface ainf {

    /* renamed from: ainf$a */
    public static abstract class a {
        static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akcv(akde.a(a.class), "successful", "getSuccessful$sqldelight_runtime()Z"), new akcv(akde.a(a.class), "childrenSuccessful", "getChildrenSuccessful$sqldelight_runtime()Z"), new akcv(akde.a(a.class), "transacter", "getTransacter$sqldelight_runtime()Lcom/squareup/sqldelight/Transacter;")};
        private final AtomicBoolean childrenSuccessful$delegate = new AtomicBoolean(true);
        private final Set<akbk<akbk<ajxw>>> postCommitHooks = ainr.b();
        private final Set<akbk<akbk<ajxw>>> postRollbackHooks = ainr.b();
        private final Set<ainb<?>> queriesToUpdate = ainr.b();
        private final AtomicBoolean successful$delegate = new AtomicBoolean(false);
        private final AtomicReference transacter$delegate = new AtomicReference(null);

        public final void afterCommit(akbk<ajxw> akbk) {
            akcr.b(akbk, "function");
            this.postCommitHooks.add(ainr.a(akbk));
        }

        public final void afterRollback(akbk<ajxw> akbk) {
            akcr.b(akbk, "function");
            this.postRollbackHooks.add(ainr.a(akbk));
        }

        public final a enclosingTransaction$sqldelight_runtime() {
            return getEnclosingTransaction();
        }

        public abstract void endTransaction(boolean z);

        public final void endTransaction$sqldelight_runtime() {
            boolean z = getSuccessful$sqldelight_runtime() && getChildrenSuccessful$sqldelight_runtime();
            endTransaction(z);
        }

        public final boolean getChildrenSuccessful$sqldelight_runtime() {
            return ainq.a(this.childrenSuccessful$delegate, $$delegatedProperties[1]);
        }

        public abstract a getEnclosingTransaction();

        public final Set<akbk<akbk<ajxw>>> getPostCommitHooks$sqldelight_runtime() {
            return this.postCommitHooks;
        }

        public final Set<akbk<akbk<ajxw>>> getPostRollbackHooks$sqldelight_runtime() {
            return this.postRollbackHooks;
        }

        public final Set<ainb<?>> getQueriesToUpdate$sqldelight_runtime() {
            return this.queriesToUpdate;
        }

        public final boolean getSuccessful$sqldelight_runtime() {
            return ainq.a(this.successful$delegate, $$delegatedProperties[0]);
        }

        public final ainf getTransacter$sqldelight_runtime() {
            AtomicReference atomicReference = this.transacter$delegate;
            Object obj = $$delegatedProperties[2];
            akcr.b(atomicReference, "receiver$0");
            akcr.b(obj, "prop");
            return (ainf) atomicReference.get();
        }

        public final Void rollback() {
            throw new aind();
        }

        public final void setChildrenSuccessful$sqldelight_runtime(boolean z) {
            ainq.a(this.childrenSuccessful$delegate, $$delegatedProperties[1], z);
        }

        public final void setSuccessful$sqldelight_runtime(boolean z) {
            ainq.a(this.successful$delegate, $$delegatedProperties[0], z);
        }

        public final void setTransacter$sqldelight_runtime(ainf ainf) {
            AtomicReference atomicReference = this.transacter$delegate;
            Object obj = $$delegatedProperties[2];
            akcr.b(atomicReference, "receiver$0");
            akcr.b(obj, "prop");
            atomicReference.set(ainf);
        }

        public final void transaction(akbl<? super a, ajxw> akbl) {
            akcr.b(akbl, Tags.BODY);
            ainf transacter$sqldelight_runtime = getTransacter$sqldelight_runtime();
            if (transacter$sqldelight_runtime == null) {
                akcr.a();
            }
            transacter$sqldelight_runtime.a(akbl);
        }
    }

    void a(akbl<? super a, ajxw> akbl);
}
