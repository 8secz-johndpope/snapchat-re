package com.snap.discover.playback.db.durableJob;

import com.addlive.djinni.LogicError;
import com.snap.core.db.column.FeatureType;
import defpackage.akcr;
import defpackage.gyx;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwi;
import defpackage.hwk;

@hwk(a = "PLAYBACK_SNAPS_CLEANUP_JOB", b = gyx.class)
public final class PlaybackSnapsCleanupJob extends hwg<gyx> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static PlaybackSnapsCleanupJob a(FeatureType featureType, String str) {
            akcr.b(featureType, "type");
            akcr.b(str, "jobTag");
            return new PlaybackSnapsCleanupJob(new hwh(0, null, hwi.REPLACE, str, null, false, false, false, null, null, LogicError.CALL_CANCELED), new gyx(featureType, str));
        }
    }

    static {
        a aVar = new a();
    }

    public PlaybackSnapsCleanupJob(hwh hwh, gyx gyx) {
        akcr.b(hwh, "jobConfig");
        akcr.b(gyx, "jobMeta");
        super(hwh, gyx);
    }
}
