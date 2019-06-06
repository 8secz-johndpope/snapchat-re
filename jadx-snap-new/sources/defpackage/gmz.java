package defpackage;

import android.os.Environment;
import java.io.File;

/* renamed from: gmz */
public final class gmz {
	// Get external storage dir
	public static final String a() {
		Object externalStorageDirectory = Environment.getExternalStorageDirectory();
		akcr.a(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
		externalStorageDirectory = externalStorageDirectory.getAbsolutePath();
		akcr.a(externalStorageDirectory, "Environment.getExternalS…eDirectory().absolutePath");
		return externalStorageDirectory;
	}

	// Path concat
	public static final String a(String str, String str2) {
		akcr.b(str, "receiver$0");
		akcr.b(str2, "subDir");
		Object absolutePath = new File(str, str2).getAbsolutePath();
		akcr.a(absolutePath, "file.getAbsolutePath()");
		return absolutePath;
	}
}
