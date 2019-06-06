package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import defpackage.cdi;
import defpackage.cds;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AbstractDescriptorBox extends AbstractFullBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static Logger log = Logger.getLogger(AbstractDescriptorBox.class.getName());
    protected ByteBuffer data;
    protected cdi descriptor;

    static {
        ajc$preClinit();
    }

    public AbstractDescriptorBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AbstractDescriptorBox.java", AbstractDescriptorBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", UnlockablesModel.DATA, "", "void"), 70);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        String str = "Error parsing ObjectDescriptor";
        parseVersionAndFlags(byteBuffer);
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.data.rewind();
            this.descriptor = cds.a(-1, this.data);
        } catch (IOException | IndexOutOfBoundsException e) {
            log.log(Level.WARNING, str, e);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    public long getContentSize() {
        return (long) (this.data.limit() + 4);
    }

    public ByteBuffer getData() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.data;
    }

    public cdi getDescriptor() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.descriptor;
    }

    public String getDescriptorAsString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.descriptor.toString();
    }

    public void setData(ByteBuffer byteBuffer) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, (Object) byteBuffer));
        this.data = byteBuffer;
    }

    public void setDescriptor(cdi cdi) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) cdi));
        this.descriptor = cdi;
    }
}
