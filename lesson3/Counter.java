package exception.lesson3;

import java.io.IOException;

public class Counter implements AutoCloseable{

        Integer count = 0;
        public void add() throws IOException{
            if (count == null)
                throw new IOException("Error");
            this.count++;
        }

        @Override
        public void close() {
            this.count = null;
        }

}
