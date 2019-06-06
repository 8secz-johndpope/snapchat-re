package defpackage;

import defpackage.ily.a;

/* renamed from: ioa */
public enum ioa implements ily {
    FATAL_ERROR,
    POST_SERVER_INIT,
    EXISTING_IDENTITY_INIT,
    NEW_IDENTITY_INIT,
    USER_IDENTITY_CREATED,
    LOCAL_LOAD,
    LOAD_IWEK_FAILED,
    LOAD_BACKUP_BETAS_FAILED,
    IDENTITY_KEYS_SAVE,
    IDENTITY_KEYS_MISMATCH,
    SERVER_BETA_MATCH,
    SERVER_BETA_MISMATCH_LOCAL_NULL,
    DB_LOAD_LISTENER_REGISTER,
    DB_LOAD_LISTENER_LATENCY,
    RECREATE_USER_DB,
    TEMP_IDENTITY_GENERATE_ATTEMPT,
    IDENTITY_REGEN,
    GRAPH_READ,
    GRAPH_ADD_FAILED,
    GRAPH_REORDER_FAILED,
    DB_SIZE,
    ENCRYPTED_FDU_LOAD_LATENCY,
    FDU_WRITABLE_DB_LATENCY,
    FDU_USER_IDENTITY_LATENCY,
    FDU_SEK_FILTER_LATENCY,
    REMOVED_DEVICE_DURING_ADD,
    SECRET_BATCH_GENERATE,
    SECRET_CONFIG_CREATE,
    FRIEND_ADDED,
    KEYS_ALREADY_PROCESSED,
    KEYS_RECEIVED,
    KEYS_FETCHED,
    MYSTIQUE_PERSIST,
    MYSTIQUE_BATCH_PERSIST,
    SECRET_COMPUTE_FAILURE,
    SECRET_BATCH_COMPUTE,
    SNAP_PHI,
    SNAP_REWRAP,
    REWRAP_LATENCY,
    STOP_REWRAP,
    WRAP,
    WRAP_MYSTIQUE_GEN,
    UNWRAPPED_KEYS_CHECK,
    SNAP_INVERSE_PHI,
    UNWRAP,
    SERVER_DECRYPT,
    USE_CLIENT_GENERATED_KEY,
    SAVE_SEK,
    DELETE_SEK,
    RETRY_CLEAR,
    RETRY_PROCESSED,
    CLIENT_RETRY_INIT,
    FETCH_CONV,
    CLIENT_SNAP_SUPPRESSED,
    SNAP_SEND_CLEAR,
    RECIPIENT_STATUS_CHANGE,
    SUPPRESS_FILTER_LATENCY,
    APP_NOT_READY,
    MISSING_FRIEND_USER_ID,
    EC_GENERATE_KEY_PAIR_LATENCY,
    ECDH_GENERATE_SECRET_LATENCY,
    HMAC_TAG_LATENCY,
    HKDF_LATENCY,
    DEFAULT_DB_SQL_EXC,
    ADAPTER_PUT_ITEM_GSE,
    ADAPTER_GET_ITEM_GSE,
    ADAPTER_REMOVE_ITEM_GSE,
    INIT_ENCRYPTED_DB_FAIL,
    DEVICE_USER_NULL_LOAD,
    DEVICE_USER_INVALID_LOAD,
    RESET_DB,
    REDUNDANT_USER_DBS_DELETED,
    LOAD_MEDIA_KEY_FAILED,
    KEY_UNWRAP_FAILED;

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a.a((ily) this, str, (Enum) enumR);
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        return a.a((ily) this, str, str2);
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a.a((ily) this, str, z);
    }

    public final ink a() {
        return ink.FIDELIUS;
    }

    public final ilz b() {
        return a.a(this);
    }
}
