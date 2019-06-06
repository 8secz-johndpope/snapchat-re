package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.TreeTraverser;
import com.google.common.graph.SuccessorsFunction;
import defpackage.ppy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class Files {
    private static final SuccessorsFunction<File> FILE_TREE = new SuccessorsFunction<File>() {
    };
    private static final TreeTraverser<File> FILE_TREE_TRAVERSER = new TreeTraverser<File>() {
        public final String toString() {
            return "Files.fileTreeTraverser()";
        }
    };

    static final class FileByteSource extends ByteSource {
        private final File file;

        private FileByteSource(File file) {
            this.file = (File) Preconditions.checkNotNull(file);
        }

        /* synthetic */ FileByteSource(File file, AnonymousClass1 anonymousClass1) {
            this(file);
        }

        public final FileInputStream openStream() {
            return new FileInputStream(this.file);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Files.asByteSource(");
            stringBuilder.append(this.file);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.common.io.Files$1 */
    static class AnonymousClass1 {
    }

    static final class FileByteSink extends ByteSink {
        private final File file;
        private final ImmutableSet<FileWriteMode> modes;

        private FileByteSink(File file, FileWriteMode... fileWriteModeArr) {
            this.file = (File) Preconditions.checkNotNull(file);
            this.modes = ImmutableSet.copyOf((Object[]) fileWriteModeArr);
        }

        /* synthetic */ FileByteSink(File file, FileWriteMode[] fileWriteModeArr, AnonymousClass1 anonymousClass1) {
            this(file, fileWriteModeArr);
        }

        public final FileOutputStream openStream() {
            return new FileOutputStream(this.file, this.modes.contains(FileWriteMode.APPEND));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Files.asByteSink(");
            stringBuilder.append(this.file);
            stringBuilder.append(ppy.d);
            stringBuilder.append(this.modes);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static ByteSink asByteSink(File file, FileWriteMode... fileWriteModeArr) {
        return new FileByteSink(file, fileWriteModeArr, null);
    }

    public static ByteSource asByteSource(File file) {
        return new FileByteSource(file, null);
    }

    public static CharSink asCharSink(File file, Charset charset, FileWriteMode... fileWriteModeArr) {
        return asByteSink(file, fileWriteModeArr).asCharSink(charset);
    }

    public static void copy(File file, File file2) {
        Preconditions.checkArgument(file.equals(file2) ^ 1, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        asByteSource(file).copyTo(asByteSink(file2, new FileWriteMode[0]));
    }

    public static void move(File file, File file2) {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file2);
        Preconditions.checkArgument(file.equals(file2) ^ 1, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        if (!file.renameTo(file2)) {
            copy(file, file2);
            if (!file.delete()) {
                String str = "Unable to delete ";
                if (file2.delete()) {
                    throw new IOException(str.concat(String.valueOf(file)));
                }
                throw new IOException(str.concat(String.valueOf(file2)));
            }
        }
    }

    public static void write(byte[] bArr, File file) {
        asByteSink(file, new FileWriteMode[0]).write(bArr);
    }
}
