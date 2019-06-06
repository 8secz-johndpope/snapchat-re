package com.snap.profilesavedmedia.network;

import defpackage.aegj;
import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.vap;
import java.util.List;

public interface ProfileSavedMessagesHttpInterface {
    @akxy(a = "/loq/get_group_saved_messages_by_type")
    ajdx<akws<List<aegj>>> getGroupSavedMessagesByType(@akxk vap vap);

    @akxy(a = "/loq/get_saved_messages_by_type")
    ajdx<akws<List<aegj>>> getSavedMessagesByType(@akxk vap vap);
}
