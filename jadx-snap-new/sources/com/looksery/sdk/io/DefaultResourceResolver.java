package com.looksery.sdk.io;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.looksery.sdk.LensResource;
import com.looksery.sdk.io.HierarchicalResourceResolver.NodeType;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;

public class DefaultResourceResolver implements HierarchicalResourceResolver {
    private final AssetManager assetManager;
    private final Resources resources;

    public DefaultResourceResolver(AssetManager assetManager, Resources resources) {
        this.assetManager = assetManager;
        this.resources = resources;
    }

    public String[] childNamesForNode(Uri uri) {
        String path = uri.getPath() != null ? uri.getPath() : uri.getSchemeSpecificPart();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.getScheme());
        stringBuilder.append(":");
        String stringBuilder2 = stringBuilder.toString();
        int i = -1;
        int hashCode = stringBuilder2.hashCode();
        if (hashCode != -1408208054) {
            if (hashCode != 3496858) {
                if (hashCode == 97434174 && stringBuilder2.equals("file:")) {
                    i = 0;
                }
            } else if (stringBuilder2.equals(LensResource.SOURCE_ANDROID_RESOURCE)) {
                i = 2;
            }
        } else if (stringBuilder2.equals("asset:")) {
            i = 1;
        }
        if (i == 0) {
            return new File(path).list();
        }
        if (i == 1) {
            return this.assetManager.list(normalizeAndroidAssetPath(path));
        }
        if (i == 2) {
            return null;
        }
        throw new IOException("Unsupported URI: ".concat(String.valueOf(uri)));
    }

    public NodeType nodeType(Uri uri) {
        String path = uri.getPath() != null ? uri.getPath() : uri.getSchemeSpecificPart();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.getScheme());
        stringBuilder.append(":");
        String stringBuilder2 = stringBuilder.toString();
        int i = -1;
        int hashCode = stringBuilder2.hashCode();
        if (hashCode != -1408208054) {
            if (hashCode != 3496858) {
                if (hashCode == 97434174 && stringBuilder2.equals("file:")) {
                    i = 0;
                }
            } else if (stringBuilder2.equals(LensResource.SOURCE_ANDROID_RESOURCE)) {
                i = 2;
            }
        } else if (stringBuilder2.equals("asset:")) {
            i = 1;
        }
        if (i == 0) {
            File file = new File(path);
            return !file.exists() ? null : file.isDirectory() ? NodeType.Directory : NodeType.RegularFile;
        } else if (i == 1) {
            return this.assetManager.list(normalizeAndroidAssetPath(path)) == null ? NodeType.RegularFile : NodeType.Directory;
        } else {
            if (i == 2) {
                return NodeType.RegularFile;
            }
            throw new IOException("Unsupported URI: ".concat(String.valueOf(uri)));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String normalizeAndroidAssetPath(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char c = '/';
        for (char c2 : str.toCharArray()) {
            if (c != '/' || c2 != '/') {
                stringBuilder.append(c2);
                c = c2;
            }
        }
        return stringBuilder.toString();
    }

    public InputStream openResource(Uri uri) {
        String path = uri.getPath() != null ? uri.getPath() : uri.getSchemeSpecificPart();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.getScheme());
        stringBuilder.append(":");
        String stringBuilder2 = stringBuilder.toString();
        int i = -1;
        int hashCode = stringBuilder2.hashCode();
        if (hashCode != -1408208054) {
            if (hashCode != 3496858) {
                if (hashCode == 97434174 && stringBuilder2.equals("file:")) {
                    i = 0;
                }
            } else if (stringBuilder2.equals(LensResource.SOURCE_ANDROID_RESOURCE)) {
                i = 2;
            }
        } else if (stringBuilder2.equals("asset:")) {
            i = 1;
        }
        if (i == 0) {
            return new BufferedInputStream(new FileInputStream(path));
        }
        if (i == 1) {
            return this.assetManager.open(normalizeAndroidAssetPath(path));
        }
        if (i == 2) {
            try {
                return this.resources.openRawResource(Integer.parseInt(path));
            } catch (NotFoundException e) {
                throw new IOException(e);
            }
        }
        throw new IOException("Don't know how to open ".concat(String.valueOf(uri)));
    }

    public AssetFileDescriptor openResourceFd(Uri uri) {
        String path = uri.getPath() != null ? uri.getPath() : uri.getSchemeSpecificPart();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.getScheme());
        stringBuilder.append(":");
        String stringBuilder2 = stringBuilder.toString();
        int i = -1;
        int hashCode = stringBuilder2.hashCode();
        if (hashCode != -1408208054) {
            if (hashCode != 3496858) {
                if (hashCode == 97434174 && stringBuilder2.equals("file:")) {
                    i = 0;
                }
            } else if (stringBuilder2.equals(LensResource.SOURCE_ANDROID_RESOURCE)) {
                i = 2;
            }
        } else if (stringBuilder2.equals("asset:")) {
            i = 1;
        }
        if (i == 0) {
            return new AssetFileDescriptor(ParcelFileDescriptor.open(new File(path), SQLiteDatabase.CREATE_IF_NECESSARY), 0, -1);
        }
        if (i == 1) {
            return this.assetManager.openFd(normalizeAndroidAssetPath(path));
        }
        if (i == 2) {
            try {
                return this.resources.openRawResourceFd(Integer.parseInt(path));
            } catch (NotFoundException e) {
                throw new IOException(e);
            }
        }
        throw new IOException("Don't know how to open fd for ".concat(String.valueOf(uri)));
    }
}
