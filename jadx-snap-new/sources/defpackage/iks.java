package defpackage;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.query.FriendFiltersModel.GetFriendInfoCreator;
import com.snap.core.db.query.FriendFiltersModel.GetFriendInfoModel;

/* renamed from: iks */
final class iks implements GetFriendInfoCreator<ikt> {
    public final /* synthetic */ GetFriendInfoModel create(String str, String str2, Long l, CalendarDate calendarDate) {
        return new ikt(str, str2, l, calendarDate);
    }
}
