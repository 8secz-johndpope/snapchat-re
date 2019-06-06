package defpackage;

import java.util.UUID;

/* renamed from: dof */
public interface dof {

    /* renamed from: dof$a */
    public enum a {
        SNAP_ACTION,
        START_RECORDING,
        RECORDING_STARTED,
        STOP_RECORDING,
        RECORDING_SUCCESS,
        RECORDING_TOO_SHORT,
        VIDEO_CREATION,
        IMAGE_CREATION
    }

    void a(a aVar);

    void a(dqu dqu);

    void a(String str, aasc aasc, String str2);

    void a(UUID uuid, aaig aaig, String str, aaif aaif, boolean z);
}
