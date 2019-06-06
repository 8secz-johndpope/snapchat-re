package defpackage;

import android.content.Context;
import com.snap.core.db.record.PlaybackSnapViewModel.SelectAllFromPlaybakcSnapViewModel;
import java.io.File;
import java.util.List;

/* renamed from: tmy */
public final class tmy implements abov {
    private final tmu a;
    private final tmq b;

    public tmy(tmu tmu, tmq tmq) {
        akcr.b(tmu, "playStateRepository");
        akcr.b(tmq, "playStateChecker");
        this.a = tmu;
        this.b = tmq;
    }

    public final File a(Context context, File file) {
        String str;
        akcr.b(file, "outputFile");
        List<SelectAllFromPlaybakcSnapViewModel> c = this.a.c(ajyu.m(ajyu.c((Iterable) ajyu.h((Iterable) this.b.a()), 100)));
        if (c.isEmpty()) {
            str = "No records in table";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\ntype\tsnapRowId\tsnapId\tsnapExpirationTimestampMs\tstoryId\tstoryRowId");
            for (SelectAllFromPlaybakcSnapViewModel selectAllFromPlaybakcSnapViewModel : c) {
                StringBuilder stringBuilder2 = new StringBuilder("\n ");
                stringBuilder2.append(selectAllFromPlaybakcSnapViewModel.type());
                stringBuilder2.append(9);
                stringBuilder2.append(selectAllFromPlaybakcSnapViewModel.snapRowId());
                stringBuilder2.append(9);
                stringBuilder2.append(selectAllFromPlaybakcSnapViewModel.snapId());
                stringBuilder2.append(9);
                stringBuilder2.append(selectAllFromPlaybakcSnapViewModel.snapExpirationTimestampMillis());
                stringBuilder2.append(9);
                stringBuilder2.append(selectAllFromPlaybakcSnapViewModel.storyId());
                stringBuilder2.append(9);
                stringBuilder2.append(selectAllFromPlaybakcSnapViewModel.storyRowId());
                stringBuilder.append(stringBuilder2.toString());
            }
            str = stringBuilder.toString();
            akcr.a((Object) str, "stringBuilder.toString()");
        }
        akbd.a(file, str);
        return file;
    }

    public final String a() {
        return "discover_feed_view_state_dump.txt";
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return 10;
    }
}
