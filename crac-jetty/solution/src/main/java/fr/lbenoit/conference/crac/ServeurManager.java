package fr.lbenoit.conference.crac;

import javax.crac.Context;
import javax.crac.Core;
import javax.crac.Resource;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;

class ServeurManager implements Resource {
    Server server;
    Thread preventExitThread;

    public ServeurManager(int port, Handler handler) throws Exception {
        server = new Server(8080);
        server.setHandler(handler);
        server.start();
        Core.getGlobalContext().register(this);

        // permet de prévenir l'arrêt de la JVM.
        preventExitThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1_000_000);
                } catch (InterruptedException e) {
                }
            }
        });
        preventExitThread.start();
    }

    @Override
    public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
        server.stop();
    }

    @Override
    public void afterRestore(Context<? extends Resource> context) throws Exception {
        server.start();
    }
}