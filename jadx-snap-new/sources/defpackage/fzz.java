package defpackage;

import com.google.common.base.Optional;
import defpackage.fzb.1;

/* renamed from: fzz */
public final class fzz implements aiqc<Optional<ifk>> {
    private final ajwy<Optional<gqr>> a;

    public static Optional<ifk> a(Optional<gqr> optional) {
        return (Optional) aiqf.a(!optional.isPresent() ? Optional.absent() : Optional.of(new 1(optional)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fzz.a((Optional) this.a.get());
    }
}
