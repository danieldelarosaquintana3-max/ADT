package Tests;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class MiObjectOutputStream extends ObjectOutputStream {
    public MiObjectOutputStream (OutputStream out, boolean append) throws IOException {
        super(out);
        this.append = append;
    }

    private boolean append;

    @Override
    protected void writeStreamHeader() throws IOException {
        if (!append) {
            super.writeStreamHeader();
        } else {
            reset(); // Evita escribir el header en modo append
        }
    }
}	
