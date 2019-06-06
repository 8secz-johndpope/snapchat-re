package defpackage;

import defpackage.abln.d;

/* renamed from: qxa */
public interface qxa {

    /* renamed from: qxa$a */
    public enum a implements d {
        BEGIN_RECORDING("begin_recording"),
        FETCH_DELTA_INFO("fetch_delta_info"),
        UFS_REQUEST("ufs_request"),
        DESERIALIZE_SOJU_RESPONSE("deserialize_soju_response"),
        PROCESS_INDIVIDUAL_SOURCES("process_individual_sources"),
        PROCESS_FEED_ITEMS("process_feed_items"),
        RANKING("ranking"),
        PROPAGATE_CHANGE_TO_UI("propagate_change_to_ui"),
        END_RECORDING("end_recording");
        
        final String stepName;

        private a(String str) {
            akcr.b(str, "stepName");
            this.stepName = str;
        }

        public final String a() {
            return this.stepName;
        }
    }

    void a();

    void a(a aVar);

    void a(a aVar, long j);

    void a(qxi qxi);

    void a(boolean z);

    void a(boolean z, String str);

    void b();

    void c();

    boolean d();
}
