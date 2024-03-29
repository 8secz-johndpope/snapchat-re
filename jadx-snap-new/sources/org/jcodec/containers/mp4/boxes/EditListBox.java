package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class EditListBox extends FullBox {
    private List<Edit> edits;

    public EditListBox(Header header) {
        super(header);
    }

    public static EditListBox createEditListBox(List<Edit> list) {
        EditListBox editListBox = new EditListBox(new Header(fourcc()));
        editListBox.edits = list;
        return editListBox;
    }

    public static String fourcc() {
        return com.coremedia.iso.boxes.EditListBox.TYPE;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.edits.size());
        for (Edit edit : this.edits) {
            byteBuffer.putInt((int) edit.getDuration());
            byteBuffer.putInt((int) edit.getMediaTime());
            byteBuffer.putInt((int) (edit.getRate() * 65536.0f));
        }
    }

    public int estimateSize() {
        return (this.edits.size() * 12) + 16;
    }

    public List<Edit> getEdits() {
        return this.edits;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.edits = new ArrayList();
        long j = (long) byteBuffer.getInt();
        for (int i = 0; ((long) i) < j; i++) {
            float f = ((float) byteBuffer.getInt()) / 65536.0f;
            this.edits.add(new Edit((long) byteBuffer.getInt(), (long) byteBuffer.getInt(), f));
        }
    }
}
