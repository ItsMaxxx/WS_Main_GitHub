package GameOneMain;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable {
    private static final long serialVersionUID = 2069533396258311923L;
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private Thread thread;
    private boolean running = false;
    private Random r;
    private Handler handler;
    private HUD hud;
    public static int score = 0;
    public static int numberOfEnemies = 1;
    public static Window window;

    public Game() {
        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));

        window = new Window(WIDTH, HEIGHT, "Fake Cube Game", this);
        hud = new HUD();
        r = new Random();

        handler.addObject(new Player(WIDTH / 2 - 32, HEIGHT / 2 - 32, ID.Player, handler));
        handler.addObject(new BasicEnemy(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.BasicEnemy, handler));
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            // ".join is basically killing off the thread, stopping it"
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This is a gameloop, it is basically the heartbeat of the game. You need a
     * gameloop or else the game is not able to update itself. Every game has some
     * sort of a gameloop in itself.
     **/
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running)
                render();
            frames++;

            if (System.currentTimeMillis() - timer > 100) {
                timer += 100;
                System.out.println("FPS: " + frames);
                frames = 0;
            }

        } // end while(running)

        stop();

    }

    private void tick() {
        handler.tick();
        hud.tick();
    }

    // Look into this
    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        handler.render(g);
        hud.render(g);

        score++;
        if (score / 2000 > numberOfEnemies) {
            handler.addObject(new BasicEnemy(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.BasicEnemy, handler));
            numberOfEnemies++;
        }

        g.dispose();
        bs.show();
    }

    // guckt einfach, dass die var nicht über/unter max/min ist
    public static int clamp(int var, int min, int max) {
        if (var >= max)
            return var = max;
        else if (var <= min)
            return var = min;
        else
            return var;
    }

    public static void main(String args[]) {
        new Game();
    }

}
