package defpackage;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LocationSharingModel.GetFriendsLinkTypeCreator;
import com.snap.core.db.query.LocationSharingModel.GetFriendsLinkTypeModel;

/* renamed from: actp */
final class actp implements GetFriendsLinkTypeCreator<actm> {
    public final /* synthetic */ GetFriendsLinkTypeModel create(String str, String str2, String str3, FriendLinkType friendLinkType) {
        akcr.b(str2, "username");
        return new actm(str, str2, str3, friendLinkType);
    }
}
