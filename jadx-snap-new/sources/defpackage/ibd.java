package defpackage;

import android.text.TextUtils;
import com.brightcove.player.event.Event;
import com.brightcove.player.media.ErrorFields;
import com.looksery.sdk.listener.AnalyticsListener;
import java.util.Random;

/* renamed from: ibd */
public final class ibd implements hyk {
    private final abss a;
    private final hyo b;
    private final ial c;
    private final dib d;
    private final hys e;
    private final zfw f = zgb.a(hyn.a.callsite("DefaultFideliusEventLogger"));
    private final Random g = new Random();

    public ibd(abss abss, hyo hyo, ial ial, dib dib, hys hys) {
        this.a = abss;
        this.b = hyo;
        this.c = ial;
        this.d = dib;
        this.e = hys;
    }

    private void a(aajt aajt) {
        this.d.a(aajt);
    }

    private /* synthetic */ void g(String str, String str2) {
    }

    private boolean h() {
        return this.g.nextFloat() < 0.01f;
    }

    public final void a() {
        a(this.e.a(hyt.FIDELIUS_IDENTITY_KEYS_MISMATCH));
        aajt aala = new aala();
        aala.a = aalb.IDENTITY_KEYS_MISMATCH;
        a(aala);
    }

    public final void a(int i, int i2, int i3) {
        hyr a = this.e.a(hyt.FIDELIUS_REDUNDANT_USER_DBS_DELETED);
        Integer.valueOf(i);
        hyr a2 = a.a("all_user_dbs");
        Integer.valueOf(i2);
        a2 = a2.a("redundant_user_dbs");
        Integer.valueOf(i3);
        a(a2.a("deleted"));
    }

    public final void a(long j) {
        a(this.e.a(hyt.FIDELIUS_DB_LOAD_LISTENER_LATENCY).a(j));
        aajt aalh = new aalh();
        aalh.a = aali.DB_LOAD_LISTENER_LATENCY;
        aalh.b = Long.valueOf(j);
        a(aalh);
    }

    public final void a(long j, long j2, long j3) {
        hyr a = this.e.a(hyt.FIDELIUS_DB_SIZE);
        Long.valueOf(j);
        a = a.a(Event.SIZE);
        Long.valueOf(j2);
        a = a.a("total_size");
        Long.valueOf(j3);
        a.a("num_dbs").d();
        aajt aakq = new aakq();
        aakq.a = aakr.DB_SIZE;
        aakq.d = Long.valueOf(j);
        aakq.e = Long.valueOf(j2);
        aakq.f = Long.valueOf(j3);
        a(aakq);
    }

    public final void a(long j, long j2, String str) {
        String str2 = "success:";
        hyr a = this.e.a(hyt.FIDELIUS_FRIEND_ADDED).a("result", str2.concat(String.valueOf(str)));
        Long.valueOf(j);
        a = a.a("prev_device_count");
        Long.valueOf(j2);
        a(a.a("new_device_count"));
        if (h()) {
            aajt aaku = new aaku();
            aaku.a = str2.concat(String.valueOf(str));
            aaku.c = Long.valueOf(j);
            aaku.b = Long.valueOf(j2);
            a(aaku);
        }
    }

    public final void a(hyr hyr) {
        if (this.a.f()) {
            String e = hyr.e();
            String f = hyr.f();
            if (!(TextUtils.isEmpty(e) || TextUtils.isEmpty(f))) {
                this.f.b().a(new -$$Lambda$ibd$EyF-vSX8WHjTaMTzq_jARvWW-YE(this, e, f));
                if (this.b.b()) {
                    ieg.a(f, true, 0);
                }
            }
        }
        hyr.d();
    }

    public final void a(hyr hyr, long j) {
        long b = hyr.b();
        String str = "success";
        hyr = hyr.a("result", str);
        Long.valueOf(j);
        a(hyr.a(AnalyticsListener.ANALYTICS_COUNT_KEY));
        if (h()) {
            aajt aakm = new aakm();
            aakm.a = aakn.SECRET_BATCH_GENERATE;
            aakm.b = str;
            aakm.e = Long.valueOf(j);
            aakm.g = j > 0 ? Long.valueOf(b / j) : null;
            a(aakm);
        }
    }

    public final void a(hyr hyr, String str) {
        long b = hyr.b();
        a(hyr.a("source", str).a("result", "success"));
        aajt aaky = new aaky();
        aaky.a = aakz.FIDELIUS_EXISTING_IDENTITY_INIT;
        aaky.b = Boolean.TRUE;
        aaky.e = Long.valueOf(b);
        a(aaky);
    }

    public final void a(hyr hyr, String str, long j, long j2) {
        long b = hyr.b();
        String str2 = "failure";
        hyr = hyr.a("result", str2).a("reason");
        Long.valueOf(j);
        hyr = hyr.a(AnalyticsListener.ANALYTICS_COUNT_KEY);
        Long.valueOf(j2);
        a(hyr.a("failures"));
        aajt aakm = new aakm();
        aakm.a = aakn.SECRET_BATCH_GENERATE;
        aakm.b = str2;
        aakm.c = str;
        aakm.e = Long.valueOf(j - j2);
        aakm.f = Long.valueOf(j2);
        aakm.g = j > 0 ? Long.valueOf(b / j) : null;
        a(aakm);
    }

    public final void a(hyr hyr, String str, String str2, String str3) {
        long b = hyr.b();
        a(hyr.a("source", str).a("result", str2).a(ErrorFields.MESSAGE));
        aajt aaky = new aaky();
        aaky.a = aakz.FIDELIUS_EXISTING_IDENTITY_INIT;
        aaky.b = Boolean.FALSE;
        aaky.c = str2;
        aaky.d = str3;
        aaky.e = Long.valueOf(b);
        a(aaky);
    }

    public final void a(hyr hyr, String str, String str2, boolean z) {
        long b = hyr.b();
        a(hyr.a("result", str).a(ErrorFields.MESSAGE));
        aajt aaky = new aaky();
        aaky.a = aakz.FIDELIUS_NEW_IDENTITY_INIT;
        aaky.b = Boolean.FALSE;
        aaky.c = str;
        aaky.d = str2;
        aaky.e = Long.valueOf(b);
        aaky.f = Boolean.valueOf(z);
        a(aaky);
    }

    public final void a(hyr hyr, boolean z) {
        long b = hyr.b();
        a(hyr.a("result", "success"));
        aajt aaky = new aaky();
        aaky.a = aakz.FIDELIUS_NEW_IDENTITY_INIT;
        aaky.b = Boolean.TRUE;
        aaky.e = Long.valueOf(b);
        aaky.f = Boolean.valueOf(z);
        a(aaky);
    }

    public final void a(hyr hyr, boolean z, long j, long j2, long j3) {
        hyr.a("new_identity", Boolean.valueOf(z)).d();
        aajt aaks = new aaks();
        aaks.a = Boolean.valueOf(z);
        aaks.b = Long.valueOf(j);
        aaks.c = Long.valueOf(j2);
        aaks.d = Long.valueOf(j3);
        a(aaks);
    }

    public final void a(hyr hyr, boolean z, Boolean bool, boolean z2, boolean z3, boolean z4, String str, String str2, String str3) {
        long b = hyr.b();
        hyr = hyr.a("result", z ? "success" : "failure").a("data_ready");
        Boolean.valueOf(z2);
        hyr = hyr.a("using_backup_betas").a("retried", Boolean.valueOf(z3));
        Boolean.valueOf(z4);
        a(hyr.a("cleartext").a("reason", str).a(ErrorFields.MESSAGE).a("source"));
        aajt aalp = new aalp();
        aalp.a = Boolean.valueOf(z);
        aalp.b = bool;
        aalp.c = Boolean.valueOf(z2);
        aalp.d = Boolean.valueOf(z3);
        aalp.e = Boolean.valueOf(z4);
        aalp.f = str;
        aalp.g = str2;
        int i = -1;
        int hashCode = str3.hashCode();
        if (hashCode != -711108402) {
            if (hashCode != 222813243) {
                if (hashCode == 223105530 && str3.equals("snap_view")) {
                    i = 0;
                }
            } else if (str3.equals("snap_load")) {
                i = 1;
            }
        } else if (str3.equals("snap_insert")) {
            i = 2;
        }
        aalc aalc = i != 0 ? i != 1 ? i != 2 ? null : aalc.SNAP_RECEIVE : aalc.SNAP_LOAD : aalc.SNAP_VIEW;
        aalp.h = aalc;
        aalp.i = Long.valueOf(b);
        a(aalp);
    }

    public final void a(hyr hyr, boolean z, String str, long j, long j2) {
        long b = hyr.b();
        if (!TextUtils.isEmpty(str)) {
            hyr.a("reason");
        }
        String str2 = "success";
        String str3 = "failure";
        hyr = hyr.a("result", z ? str2 : str3);
        Long.valueOf(j2);
        hyr = hyr.a("failures");
        if (j > 0) {
            Long.valueOf(b / j);
        }
        hyr = hyr.a("avg_persist_time");
        Long.valueOf(j);
        a(hyr.a(AnalyticsListener.ANALYTICS_COUNT_KEY));
        if (!z || h()) {
            aajt aakm = new aakm();
            aakm.a = aakn.MYSTIQUE_BATCH_PERSIST;
            if (!z) {
                str2 = str3;
            }
            aakm.b = str2;
            aakm.c = str;
            aakm.e = Long.valueOf(j - j2);
            aakm.f = Long.valueOf(j2);
            aakm.g = j > 0 ? Long.valueOf(b / j) : null;
            a(aakm);
        }
    }

    public final void a(hyr hyr, boolean z, String str, String str2, long j, long j2, Boolean bool, long j3, long j4) {
        String str3 = str;
        String str4 = str2;
        long b = hyr.b();
        hyr hyr2 = hyr;
        hyr a = hyr.a("result", str).a("reason", str2);
        Long.valueOf(j);
        a = a.a("total_keys");
        Long.valueOf(j2);
        a = a.a("num_generated").a("data_ready");
        Long.valueOf(j3);
        a = a.a("num_wrapped_devices");
        Long.valueOf(j4);
        a(a.a("average_time"));
        aajt aalq = new aalq();
        aalq.a = str3;
        aalq.d = Boolean.valueOf(z);
        aalq.b = str4;
        aalq.h = Long.valueOf(j);
        aalq.i = Long.valueOf(j2);
        aalq.c = bool;
        aalq.e = Long.valueOf(j3);
        aalq.f = Long.valueOf(b);
        aalq.g = Long.valueOf(j4);
        a(aalq);
    }

    public final void a(String str) {
        a(str, null);
    }

    public final void a(String str, long j, long j2) {
        hyr a = this.e.a(hyt.FIDELIUS_KEYS_RECEIVED).a("source", str);
        Long.valueOf(j);
        a = a.a("friend_keys_received");
        Long.valueOf(j2);
        a(a.a("keys_count"));
        aajt aald = new aald();
        aald.a = aale.KEYS_RECEIVED;
        aald.e = Long.valueOf(j);
        aald.c = Long.valueOf(j2);
        aald.b = str;
        a(aald);
    }

    public final void a(String str, long j, long j2, long j3) {
        hyr a = this.e.a(hyt.FIDELIUS_KEYS_FETCHED).a("source");
        Long.valueOf(j);
        a = a.a("friend_keys_requested");
        Long.valueOf(j2);
        a = a.a("friend_keys_received");
        Long.valueOf(j3);
        a(a.a("keys_count"));
        aajt aald = new aald();
        aald.a = aale.KEYS_FETCHED;
        aald.d = Long.valueOf(j);
        aald.e = Long.valueOf(j2);
        aald.c = Long.valueOf(j3);
        aald.b = str;
        a(aald);
    }

    public final void a(String str, Boolean bool) {
        a(this.e.a(hyt.FIDELIUS_IDENTITY_KEYS_SAVE).a("result", str).a("deleted", bool));
        aajt aala = new aala();
        aala.a = aalb.IDENTITY_KEYS_SAVE;
        aala.b = str;
        a(aala);
    }

    public final void a(String str, String str2) {
        hyr a = this.e.a(hyt.FIDELIUS_FATAL_ERROR).a("reason", str);
        if (!TextUtils.isEmpty(str2)) {
            a.a(ErrorFields.MESSAGE);
        }
        a(a);
        aajt aakv = new aakv();
        aakv.a = aakw.FATAL_ERROR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(str2);
        aakv.b = stringBuilder.toString();
        a(aakv);
    }

    public final void a(String str, String str2, String str3) {
        a(this.e.a(hyt.FIDELIUS_WRAP).a("result", str).a("reason", str2).a(ErrorFields.MESSAGE));
        aajt aalk = new aalk();
        aalk.a = aall.SNAP_WRAP;
        aalk.b = str;
        aalk.c = str2;
        aalk.d = str3;
        a(aalk);
    }

    public final void a(String str, boolean z, String str2) {
        a(this.e.a(hyt.FIDELIUS_UNWRAPPED_KEYS_CHECK).a("source", str).a("result", z ? "success" : "failure").a("reason", str2));
        aajt aalr = new aalr();
        aalr.a = Boolean.valueOf(z);
        aalr.c = str2;
        aalr.b = str;
        a(aalr);
    }

    public final void a(String str, boolean z, boolean z2) {
        String str2 = "background";
        a(this.e.a(hyt.FIDELIUS_RETRY_CLEAR).a("source", str).a("clear", Boolean.valueOf(z)).a(str2, Boolean.valueOf(z2)));
        aajt aakj = new aakj();
        aakj.a = aakk.RETRY_CLEAR;
        aakj.c = Boolean.valueOf(z);
        aakj.b = Boolean.valueOf(z2);
        a(aakj);
    }

    public final void a(boolean z) {
        a(this.e.a(hyt.FIDELIUS_SAVE_SEK).a("success", Boolean.valueOf(z)));
        aajt aalm = new aalm();
        aalm.a = aaln.SAVE_SEK;
        aalm.b = Boolean.valueOf(z);
        a(aalm);
    }

    public final void a(boolean z, int i) {
        hyr a = this.e.a(hyt.FIDELIUS_GRAPH_READ).a("found", Boolean.valueOf(z));
        Integer.valueOf(i);
        a(a.a("num_device_users_in_cache"));
        aajt aakx = new aakx();
        aakx.a = Boolean.valueOf(z);
        a(aakx);
    }

    public final void a(boolean z, long j) {
        hyr a = this.e.a(hyt.FIDELIUS_USER_IDENTITY_CREATED).a("purged", Boolean.valueOf(z));
        Long.valueOf(j);
        a(a.a("num_other_identities"));
        aajt aals = new aals();
        aals.a = Boolean.valueOf(z);
        aals.b = Long.valueOf(j);
        a(aals);
    }

    public final void a(boolean z, long j, boolean z2) {
        String str = "backup_beta";
        a(this.e.a(hyt.FIDELIUS_SERVER_BETA_MATCH).a("matched", Boolean.valueOf(z)).a(str, Boolean.valueOf(z2)));
        aajt aalo = new aalo();
        aalo.a = Boolean.valueOf(z);
        aalo.b = Long.valueOf(j);
        if (!z2) {
            str = "manager_ready";
        }
        aalo.c = str;
        a(aalo);
    }

    public final void a(boolean z, String str, long j, long j2) {
        String str2 = "success";
        String str3 = "failure";
        hyr a = this.e.a(hyt.FIDELIUS_SECRET_BATCH_COMPUTE).a("result", z ? str2 : str3).a("reason", str);
        Long.valueOf(j2);
        a = a.a("failures");
        Long.valueOf(j);
        a(a.a(AnalyticsListener.ANALYTICS_COUNT_KEY));
        if (!z || h()) {
            aajt aakm = new aakm();
            aakm.a = aakn.SECRET_BATCH_COMPUTE;
            if (!z) {
                str2 = str3;
            }
            aakm.b = str2;
            aakm.c = str;
            aakm.e = Long.valueOf(j - j2);
            aakm.f = Long.valueOf(j2);
            a(aakm);
        }
    }

    public final void a(boolean z, String str, String str2, String str3) {
        a(this.e.a(hyt.FIDELIUS_LOCAL_LOAD).a("source", str2).a("result", str).a("action").a(ErrorFields.MESSAGE));
        aajt aakl = new aakl();
        aakl.a = Boolean.valueOf(z);
        aakl.b = str;
        aakl.d = str3;
        aakl.c = "local_load_".concat(String.valueOf(str2));
        a(aakl);
    }

    public final void a(boolean z, boolean z2) {
        hyr a = this.e.a(hyt.FIDELIUS_DEVICE_USER_INVALID_LOAD);
        Boolean.valueOf(z);
        hyr a2 = a.a("hashedOutBetaEmpty");
        Boolean.valueOf(z2);
        a(a2.a("databaseNameEmpty"));
    }

    public final void b() {
        a(this.e.a(hyt.FIDELIUS_SERVER_BETA_MISMATCH_LOCAL_NULL));
        aajt aakv = new aakv();
        aakv.a = aakw.SERVER_BETA_MISMATCH_LOCAL_NULL;
        a(aakv);
    }

    public final void b(hyr hyr) {
        long b = hyr.b();
        a(hyr);
        aajt aalh = new aalh();
        aalh.a = aali.SUPPRESS_FILTER_LATENCY;
        aalh.b = Long.valueOf(b);
        a(aalh);
    }

    public final void b(hyr hyr, boolean z) {
        hyr.a("new_identity", Boolean.valueOf(z)).d();
    }

    public final void b(String str) {
        a(this.e.a(hyt.FIDELIUS_LOAD_IWEK_FAILED).a("source"));
        aajt aala = new aala();
        aala.a = aalb.LOAD_IWEK_FAILURE;
        aala.c = str;
        a(aala);
    }

    public final void b(String str, String str2) {
        a(this.e.a(hyt.FIDELIUS_POST_SERVER_INIT).a("source", str).a("result", str2));
        aajt aalj = new aalj();
        aalj.b = str;
        aalj.a = str2;
        a(aalj);
    }

    public final void b(String str, String str2, String str3) {
        a(this.e.a(hyt.FIDELIUS_WRAP_MYSTIQUE_GEN).a("result", str).a("reason", str2).a(ErrorFields.MESSAGE));
        aajt aakm = new aakm();
        aakm.a = aakn.WRAP_MYSTIQUE_GEN;
        aakm.b = str;
        aakm.c = str2;
        aakm.d = str3;
        a(aakm);
    }

    public final void b(String str, boolean z, String str2) {
        hyr a = this.e.a(hyt.FIDELIUS_CLIENT_SNAP_SUPPRESSED).a("source", str);
        Boolean.valueOf(z);
        a(a.a("cleartext").a("recipient_out_beta"));
        aajt aakp = new aakp();
        aakp.a = str;
        aakp.b = Boolean.valueOf(z);
        aakp.c = str2;
        a(aakp);
    }

    public final void b(String str, boolean z, boolean z2) {
        String str2 = "background";
        a(this.e.a(hyt.FIDELIUS_RETRY_PROCESSED).a("source", str).a("clear", Boolean.valueOf(z)).a(str2, Boolean.valueOf(z2)));
        aajt aakj = new aakj();
        aakj.a = aakk.RETRY_PROCESSED;
        aakj.c = Boolean.valueOf(z);
        aakj.b = Boolean.valueOf(z2);
        a(aakj);
    }

    public final void b(boolean z) {
        a(this.e.a(hyt.FIDELIUS_DELETE_SEK).a("success", Boolean.valueOf(z)));
        aajt aalm = new aalm();
        aalm.a = aaln.DELETE_SEK;
        aalm.b = Boolean.valueOf(z);
        a(aalm);
    }

    public final void c() {
        a(this.e.a(hyt.FIDELIUS_DB_LOAD_LISTENER_REGISTER));
    }

    public final void c(hyr hyr) {
        long b = hyr.b();
        a(hyr);
        aajt aalh = new aalh();
        aalh.a = aali.EC_GENERATE_KEY_PAIR_LATENCY;
        aalh.b = Long.valueOf(b);
        a(aalh);
    }

    public final void c(hyr hyr, boolean z) {
        hyr.a("new_identity", Boolean.valueOf(z)).d();
    }

    public final void c(String str) {
        a(this.e.a(hyt.FIDELIUS_LOAD_BACKUP_BETAS_FAILED).a("source"));
        aajt aala = new aala();
        aala.a = aalb.LOAD_BACKUP_BETAS_FAILURE;
        aala.c = str;
        a(aala);
    }

    public final void c(String str, String str2) {
        String str3 = "failure";
        a(this.e.a(hyt.FIDELIUS_SECRET_COMPUTE_FAILURE).a("result", str3).a("reason", str).a(ErrorFields.MESSAGE));
        aajt aakm = new aakm();
        aakm.a = aakn.SECRET_BATCH_COMPUTE;
        aakm.b = str3;
        aakm.c = str;
        aakm.d = str2;
        aakm.f = Long.valueOf(1);
        aakm.e = Long.valueOf(0);
        a(aakm);
    }

    public final void c(String str, String str2, String str3) {
        a(this.e.a(hyt.FIDELIUS_UNWRAP).a("result", str).a("reason", str2).a(ErrorFields.MESSAGE));
        aajt aalk = new aalk();
        aalk.a = aall.SNAP_UNWRAP;
        aalk.b = str;
        aalk.c = str2;
        aalk.d = str3;
        a(aalk);
    }

    public final void d() {
        String str = "success";
        a(this.e.a(hyt.FIDELIUS_SECRET_CONFIG_CREATE).a("result", str));
        if (h()) {
            aajt aakm = new aakm();
            aakm.a = aakn.SECRET_CONFIG_CREATE;
            aakm.b = str;
            a(aakm);
        }
    }

    public final void d(hyr hyr) {
        long b = hyr.b();
        a(hyr);
        if (h()) {
            aajt aalh = new aalh();
            aalh.a = aali.ECDH_GENERATE_SECRET_LATENCY;
            aalh.b = Long.valueOf(b);
            a(aalh);
        }
    }

    public final void d(hyr hyr, boolean z) {
        hyr.a("new_identity", Boolean.valueOf(z)).d();
    }

    public final void d(String str) {
        a(this.e.a(hyt.FIDELIUS_TEMP_IDENTITY_GENERATE_ATTEMPT).a("source", str));
        aajt aala = new aala();
        aala.a = aalb.TEMP_IDENTITY_GENERATE_ATTEMPT;
        aala.c = str;
        a(aala);
    }

    public final void d(String str, String str2) {
        a(this.e.a(hyt.FIDELIUS_ADAPTER_PUT_ITEM_GSE).a("table", str).a("exception"));
        aajt aakq = new aakq();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":PUT");
        aakq.b = stringBuilder.toString();
        aakq.c = str2;
        a(aakq);
    }

    public final void e() {
        a(this.e.a(hyt.FIDELIUS_KEYS_ALREADY_PROCESSED));
        if (h()) {
            aajt aald = new aald();
            aald.a = aale.KEYS_ALREADY_PROCESSED;
            a(aald);
        }
    }

    public final void e(hyr hyr) {
        long b = hyr.b();
        a(hyr);
        aajt aalh = new aalh();
        aalh.a = aali.HMAC_TAG_LATENCY;
        aalh.b = Long.valueOf(b);
        a(aalh);
    }

    public final void e(String str) {
        a(this.e.a(hyt.FIDELIUS_IDENTITY_REGEN).a("action", str));
        aajt aakl = new aakl();
        aakl.c = "identity_resync";
        aakl.d = str;
        a(aakl);
    }

    public final void e(String str, String str2) {
        a(this.e.a(hyt.FIDELIUS_ADAPTER_GET_ITEM_GSE).a("table", str).a("exception"));
        aajt aakq = new aakq();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":GET");
        aakq.b = stringBuilder.toString();
        aakq.c = str2;
        a(aakq);
    }

    public final void f() {
        a(this.e.a(hyt.FIDELIUS_REMOVED_DEVICE_DURING_ADD));
    }

    public final void f(hyr hyr) {
        long b = hyr.b();
        a(hyr);
        aajt aalh = new aalh();
        aalh.a = aali.HKDF_LATENCY;
        aalh.b = Long.valueOf(b);
        a(aalh);
    }

    public final void f(String str) {
        String str2 = "failure";
        a(this.e.a(hyt.FIDELIUS_SECRET_CONFIG_CREATE).a("result", str2).a("reason", str));
        aajt aakm = new aakm();
        aakm.a = aakn.SECRET_CONFIG_CREATE;
        aakm.b = str2;
        aakm.c = str;
        a(aakm);
    }

    public final void f(String str, String str2) {
        a(this.e.a(hyt.FIDELIUS_ADAPTER_REMOVE_ITEM_GSE).a("table", str).a("exception"));
        aajt aakq = new aakq();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":REMOVE");
        aakq.b = stringBuilder.toString();
        aakq.c = str2;
        a(aakq);
    }

    public final void g() {
        a(this.e.a(hyt.FIDELIUS_RESET_DB));
    }

    public final void g(String str) {
        a(this.e.a(hyt.FIDELIUS_FRIEND_ADDED).a("result", str));
        aajt aaku = new aaku();
        aaku.a = str;
        a(aaku);
    }

    public final void h(String str) {
        String str2 = "failure";
        a(this.e.a(hyt.FIDELIUS_MYSTIQUE_PERSIST).a("result", str2).a("reason", str));
        aajt aakm = new aakm();
        aakm.a = aakn.MYSTIQUE_PERSIST;
        aakm.b = str2;
        aakm.c = str;
        a(aakm);
    }

    public final void i(String str) {
        a(this.e.a(hyt.FIDELIUS_CLIENT_RETRY_INIT).a("source", str));
        aajt aako = new aako();
        aako.a = str;
        a(aako);
    }

    public final void j(String str) {
        a(this.e.a(hyt.FIDELIUS_FETCH_CONV).a("source", str));
        aajt aakt = new aakt();
        aakt.a = str;
        a(aakt);
    }

    public final void k(String str) {
        a(this.e.a(hyt.FIDELIUS_APP_NOT_READY).a("action", str));
        aajt aalf = new aalf();
        aalf.a = aalg.NOT_FULL_READY;
        aalf.b = str;
        a(aalf);
    }

    public final void l(String str) {
        a(this.e.a(hyt.FIDELIUS_MISSING_FRIEND_USER_ID).a("source", str));
        aajt aalf = new aalf();
        aalf.a = aalg.FRIEND_INFO_NOT_READY;
        aalf.b = str;
        a(aalf);
    }

    public final void m(String str) {
        a(this.e.a(hyt.FIDELIUS_DEFAULT_DB_SQL_EXC).a(ErrorFields.MESSAGE));
        aajt aakq = new aakq();
        aakq.b = "default_db";
        aakq.c = str;
        a(aakq);
    }

    public final void n(String str) {
        a(this.e.a(hyt.FIDELIUS_INIT_ENCRYPTED_DB_FAIL).a(ErrorFields.MESSAGE));
        aajt aakq = new aakq();
        aakq.b = "encrypted_db";
        aakq.c = str;
        a(aakq);
    }
}
