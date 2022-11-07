package validator;

import java.io.StringBufferInputStream;

public class PassId {

    public boolean checkRightLength(String ln) {

        return ln.length() == 14;
    }

}
