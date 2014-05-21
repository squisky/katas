import java.util.ArrayList;
import java.util.List;

/**
 * Bowling Kata
 */
public class Game {

    List<Frame> frames = new ArrayList<Frame>();

    public int calculateScore() {
        int score = 0;
        for (int i = 0;i<10;i++) {
            if (frames.get(i).throw2 != null)
                score += frames.get(i).throw1 + frames.get(i).throw2;
            else
                score += frames.get(i).throw1;

            if (frames.get(i).throw1 == 10) { // strike
                // add next two throws
                Frame nextFrame = frames.get(i+1);
                score += nextFrame.throw1;
                if (nextFrame.throw2 != null)
                    score += nextFrame.throw2;
                else {
                    nextFrame = frames.get(i+2);
                    score += nextFrame.throw1;


                }
            } else if (frames.get(i).throw1 + frames.get(i).throw2 == 10) { // spare
                // add next throw
                Frame nextFrame = frames.get(i+1);
                score += nextFrame.throw1;
            }
        }
        return score;
    }

    public void start() {
        for (int i=0; i<12; ++i) {
            frames.add(new Frame(5,5));
        }
        System.out.println(calculateScore());
    }

    public class Frame {
        int throw1;
        Integer throw2;

        public Frame(int throw1, Integer throw2) {
            this.throw1 = throw1;
            this.throw2 = throw2;
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }


}
