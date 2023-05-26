package GuessMyNumber;

import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;
public class GuessFilter extends PlainDocument {
    private final int limit = 2;

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (getLength() + str.length() <= limit) {
            super.insertString(offset, str, attr);
        }
    }

    @Override
    public void replace(int offset, int length, String str, AttributeSet attrs) throws BadLocationException {
        if (getLength() - length + str.length() <= limit) {
            super.replace(offset, length, str, attrs);
        }
    }
}