package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: djj */
public final class djj implements diz {
    private ftl a;

    public djj(ftl ftl) {
        this.a = ftl;
    }

    public final boolean a() {
        return this.a.a(djg.RELIABLE_UPLOADS);
    }

    public final List<String> b() {
        try {
            return Arrays.asList(new String[]{this.a.j(djg.QUEUES_DISABLE_UPLOAD_WITHOUT_NETWORK)});
        } catch (Exception unused) {
            return ImmutableList.of();
        }
    }

    public final List<String> c() {
        try {
            return Arrays.asList(new String[]{this.a.j(djg.QUEUES_DISABLE_UPLOAD_IN_BACKGROUND)});
        } catch (Exception unused) {
            return ImmutableList.of();
        }
    }

    public final boolean d() {
        return this.a.a(djg.DURABLE_JOB);
    }

    public final void e() {
        this.a.a(djg.DURABLE_JOB);
        this.a.w(djg.DURABLE_JOB);
    }

    public final boolean f() {
        return d() && g() > 0;
    }

    public final int g() {
        return this.a.f(djg.DURABLE_JOB_PERIOD_MINUTES);
    }

    public final Set<String> h() {
        String j = this.a.j(djg.DURABLE_JOB_PERIODIC_QUEUES);
        String str = "";
        if (j.equals(str)) {
            return null;
        }
        String[] split = j.split(ppy.b);
        Collection hashSet = new HashSet();
        for (String str2 : split) {
            if (str2.equals("gae")) {
                hashSet.add(str);
            } else {
                hashSet.add(str2);
            }
        }
        return ImmutableSet.copyOf(hashSet);
    }

    public final boolean i() {
        return d() && j() > 0;
    }

    public final int j() {
        return this.a.f(djg.DURABLE_JOB_DELAY_SECONDS_ON_BACKGROUND);
    }

    public final boolean k() {
        return d() && this.a.a(djg.DURABLE_JOB_IN_FOREGROUND);
    }

    public final int l() {
        return this.a.f(djg.DURABLE_JOB_FOREGROUND_DELAY_SECONDS);
    }

    public final boolean m() {
        return this.a.a(djg.BATCH_SEQUENCE_ID_WRITES);
    }

    public final boolean n() {
        return this.a.a(djg.ENABLE_UPLOADER_V2);
    }
}
