package defpackage;

import com.samsung.android.sdk.camera.SCamera;
import com.snapchat.android.R;

/* renamed from: wol */
public enum wol {
    EVERYONE(R.id.contact_me_everyone, "0", wno.EVERYONE, R.string.settings_everyone),
    MY_FRIEND(R.id.contact_me_my_friend, SCamera.CAMERA_ID_FRONT, wno.MY_FRIEND, R.string.settings_my_friend);
    
    public final int contentString;
    public final int optionId;
    public final wno privacyOption;
    public final String syncData;

    private wol(int i, String str, wno wno, int i2) {
        akcr.b(str, "syncData");
        akcr.b(wno, "privacyOption");
        this.optionId = i;
        this.syncData = str;
        this.privacyOption = wno;
        this.contentString = i2;
    }
}
