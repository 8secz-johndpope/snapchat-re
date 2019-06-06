package defpackage;

import defpackage.szw.b;

/* renamed from: yhy */
public final class yhy extends ide {
    public static final zjm a;
    public static final idl b;
    public static final zjm c;
    public static final idl d;
    public static final b<yof> e = new b("story_management_params");
    public static final zjm f;
    public static final idl g;
    public static final zjm h;
    public static final zjm i;
    public static final yhy j;

    static {
        yhy yhy = new yhy();
        j = yhy;
        ide ide = yhy;
        zjm zjm = new zjm(ide, "story_management", false, false, true, false, null, false, false, false, false, null, 4076);
        a = zjm;
        b = zjm.d.b;
        acgu.a(acis.d, (achg) a, true).j();
        zjm = new zjm(ide, "our_stories", false, false, true, false, null, false, false, false, false, null, 4076);
        c = zjm;
        d = zjm.d.b;
        ide ide2 = ide;
        zjm = new zjm(ide2, "profile_stories", false, false, true, false, null, false, false, false, false, null, 4076);
        f = zjm;
        g = zjm.d.b;
        h = new zjm(ide2, "mob_action_menu", false, false, true, false, null, false, false, false, false, null, 4076);
        i = new zjm(ide2, "stories_action_menu", false, false, true, false, null, false, false, false, false, null, 4076);
    }

    private yhy() {
        super("Stories", idi.STORIES);
    }

    public static final idl a(idk idk, String str, String str2) {
        akcr.b(idk, "typedUiPageFactory");
        akcr.b(str, "storyId");
        yhy yhy = j;
        String[] strArr = new String[2];
        strArr[0] = str;
        if (str2 == null) {
            str2 = "null";
        }
        strArr[1] = str2;
        return yhy.typedUiPage(idk, strArr);
    }
}
