package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/* renamed from: aklj */
public interface aklj extends FileFilter, FilenameFilter {
    boolean accept(File file);

    boolean accept(File file, String str);
}
