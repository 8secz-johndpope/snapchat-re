package defpackage;

import com.google.common.base.Optional;
import com.snap.framework.developer.BuildConfigInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: fzk */
public final class fzk implements aiqc<List<saa>> {
    private final ajwy<gcz> a;
    private final ajwy<Set<List<akhn>>> b;
    private final ajwy<sau> c;
    private final ajwy<Optional<sau>> d;
    private final ajwy<Optional<sae>> e;
    private final ajwy<BuildConfigInfo> f;
    private final ajwy<gdc> g;
    private final ajwy<abss> h;
    private final ajwy<gkf> i;
    private final ajwy<gkk> j;
    private final ajwy<gkg> k;
    private final ajwy<Optional<ftk>> l;

    public static List<saa> a(gcz gcz, Set<List<akhn>> set, aipn<sau> aipn, Optional<sau> optional, Optional<sae> optional2, BuildConfigInfo buildConfigInfo, gdc gdc, abss abss, ajwy<gkf> ajwy, ajwy<gkk> ajwy2, ajwy<gkg> ajwy3, Optional<ftk> optional3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gcx(gcz));
        for (List<akhn> it : set) {
            for (akhn akhn : it) {
                if (akhn instanceof saa) {
                    arrayList.add((saa) akhn);
                }
            }
        }
        arrayList.add(new gkj(ajwy2));
        arrayList.add(new gke(ajwy));
        arrayList.add(new sby());
        arrayList.add(new gkm(optional3));
        arrayList.add(ajwy3.get());
        if (buildConfigInfo.LOGGING_FILTER && buildConfigInfo.DEBUG) {
            arrayList.add(new sbz());
        }
        if (buildConfigInfo.DEBUG && optional2.isPresent()) {
            arrayList.add(optional2.get());
        }
        arrayList.add(new gkl(abss));
        arrayList.add(optional.isPresent() ? (sau) optional.get() : aipn.get());
        return (List) aiqf.a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        ajwy ajwy7 = this.g;
        ajwy ajwy8 = this.h;
        ajwy ajwy9 = this.i;
        ajwy ajwy10 = this.j;
        ajwy ajwy11 = this.k;
        ajwy ajwy12 = this.l;
        gcz gcz = (gcz) ajwy.get();
        Set set = (Set) ajwy2.get();
        aipn b = aiqb.b(ajwy3);
        gcz gcz2 = gcz;
        ajwy = ajwy11;
        ajwy2 = ajwy10;
        ajwy3 = ajwy9;
        return fzk.a(gcz2, set, b, (Optional) ajwy4.get(), (Optional) ajwy5.get(), (BuildConfigInfo) ajwy6.get(), (gdc) ajwy7.get(), (abss) ajwy8.get(), ajwy3, ajwy2, ajwy, (Optional) ajwy12.get());
    }
}
