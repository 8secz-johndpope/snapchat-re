package defpackage;

import defpackage.mhs.b;
import java.util.Set;

/* renamed from: loa */
final class loa {
    static {
        loa loa = new loa();
    }

    private loa() {
    }

    public static final lnx a(mwe mwe) {
        akcr.b(mwe, "lensRepository");
        return new lnt(mwe);
    }

    public static final lof a(ajdp<mmt> ajdp, loj loj) {
        akcr.b(ajdp, "lensCore");
        akcr.b(loj, "useCase");
        return new lof(ajdp, loj);
    }

    public static final loi a(mok<? super moc> mok, lnx lnx) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(lnx, "manifestItemProvider");
        return new lok(mok, lnx);
    }

    public static final loj a(loi loi, nay nay, mwe mwe, ajdp<Set<b>> ajdp, lop lop) {
        akcr.b(loi, "remoteAssetsRepository");
        akcr.b(nay, "userDataRepository");
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp, "friendUserIds");
        akcr.b(lop, "bitmojiDataRepository");
        return new lnu(loi, nay, ajdp, mwe, lop);
    }
}
