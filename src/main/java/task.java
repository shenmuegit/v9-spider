import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class task {

    public static void main (String[] args) throws IOException {
        ReadableByteChannel readableByteChannel = Channels.newChannel(new URL("11").openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("D:/aaa.mp4");
        FileChannel fileChannel = fileOutputStream.getChannel();
        fileOutputStream.getChannel()
                .transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
    }
}