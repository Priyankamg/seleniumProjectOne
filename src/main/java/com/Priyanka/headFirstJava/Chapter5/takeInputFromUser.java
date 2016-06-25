package com.Priyanka.headFirstJava.Chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Priyanka on 6/24/2016.
 */
public class takeInputFromUser {
    public String getUserInput(String question) {
        String inputLine = null;
        System.out.println(question + " ");
        try {
            /*
            BUFFERED READER
            Reads text from a character input stream, buffering characters so as to provide
            for the efficient reading of characters, arrays and lines. The buffer size may be
            specified, or the default size may be used. The default is large enough for many purposes.

            Each read request made of a reader causes a corresponding read request to be made
            of the underlying character or byte stream. It is therefore advisable to wrap a
            BufferedReader around any reader whose Read() options may be costly.

            Without buffering, each invocation of read() or readLine() could cause bytes to be
            read from the file, converted into characters, and then returned, which can be very inefficient.
             */

            /*
            INPUT STREAM READER
            An InputStreamReader reads bytes and decodes them into characters using a specified charset.
            public InputStreamReader(InputStream in) - Creates an InputStreamReader that uses the default charset
            in - An InputStream
            For top efficiency, consider wrapping an InputStreamReader within a BufferedReader
             */

            /*
            public static final InputStream in
            The "standard" input stream. This stream is already open and ready to supply input data.
            Typically this stream corresponds to keyboard input or another input source specified
            by the host environment or user
             */
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            /*
            public String readLine() throws IOException
            -> Reads a line of text. A line is considered to be terminated by any one of a line feed ('\n'),
            a carriage return ('\r') or a carriage return followed immediately by a linefeed

            Returns
            A string containing the contents of the line, not including any line termination characters
            or null if the end of the stream has been reached

            Throws
            IOException - If an I/O error occurs
             */
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }
}
