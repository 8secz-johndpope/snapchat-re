package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: lambda */
/* renamed from: -$$Lambda$wtq$wPyQtAyF_VDJ8s3XeU_ZfMdg_MI */
public final /* synthetic */ class -$$Lambda$wtq$wPyQtAyF_VDJ8s3XeU_ZfMdg_MI implements FilenameFilter {
    public static final /* synthetic */ -$$Lambda$wtq$wPyQtAyF_VDJ8s3XeU_ZfMdg_MI INSTANCE = new -$$Lambda$wtq$wPyQtAyF_VDJ8s3XeU_ZfMdg_MI();

    private /* synthetic */ -$$Lambda$wtq$wPyQtAyF_VDJ8s3XeU_ZfMdg_MI() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("image_attachment");
    }
}
