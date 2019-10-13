package serverSide;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.net.ServerSocket;
import java.net.Socket;

    /**
     * A TCP server that runs on port 7070. When a client connects, it
     * sends the client the current date and time, then closes the
     * connection with that client.
     */

    public class ServerOriginal
    {
        /**
         * Runs the server.
         */

        public static void main(String[] args) throws IOException
        {

            /**
             * Create the socket listner
             * using ServerSocket Java class
             * for Listening on a socket.
             * Use port 7070
             */

            ServerSocket server = new ServerSocket(7070);

            System.out.println("ServerSocket running on port 7070");

            try
            {
                while (true)
                {
                    /**
                     * To Do
                     * Accept client connection here
                     */

                    Socket client = server.accept();

                    try
                    {
                        System.out.println("Now listening on port 9090");
                        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                        out.println(new Date().toString());
                    }
                    finally
                    {
                        System.out.println("terminated running on port 9090");

                        /**
                         * close the communication channel here
                         */

                        server.close();
                    }
                }
            }
            finally
            {
                /**
                 * close the communication channel here
                 */

                server.close();
            }
        }
    }

