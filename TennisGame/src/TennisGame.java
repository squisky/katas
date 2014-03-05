/**
 * Created by evie.cameron on 3/5/14.
 */


public class TennisGame {

    private static class Player {

        public Player(String name) {
            this.name = name;
        }
        String name;
        int score = 0;
    }

    Player playerOne;
    Player playerTwo;


    public TennisGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void playerPoint(TennisGame game, Player player) {
            player.score++;
            printScore(game);
    }

    public static void main(String[] args) {

        Player playerOne = new Player("John Spradlin");
        Player playerTwo = new Player("Jeremy Reeder");
        TennisGame tennisGame = new TennisGame(playerOne, playerTwo);
        tennisGame.playRound(tennisGame, playerOne);
        tennisGame.playRound(tennisGame, playerTwo);
        tennisGame.playRound(tennisGame, playerOne);
        tennisGame.playRound(tennisGame, playerTwo);
        tennisGame.playRound(tennisGame, playerOne);
        tennisGame.playRound(tennisGame, playerTwo);
        tennisGame.playRound(tennisGame, playerOne);
        tennisGame.playRound(tennisGame, playerTwo);
        tennisGame.playRound(tennisGame, playerOne);
        tennisGame.playRound(tennisGame, playerTwo);
        tennisGame.playRound(tennisGame, playerTwo);
        tennisGame.playRound(tennisGame, playerTwo);

        tennisGame.gameOver();

    }

    public boolean gameOver() {
        if (this.playerOne.score >= 4 && this.playerOne.score >= (this.playerTwo.score + 2)) {
            System.out.println("Player one wins!");
            return true;
        }
        if (this.playerTwo.score >= 4 && this.playerTwo.score >= (this.playerOne.score + 2)) {
            System.out.println("Player two wins!");
            return true;
        }
        return false;
    }

    public void playRound(TennisGame game, Player winner) {
        playerPoint(game, winner);
    }

    private void printScore(TennisGame game) {
        if (game.playerOne.score >= 3 && game.playerOne == game.playerTwo) {
            System.out.println("Deuce");

        }
        else if (game.playerOne.score >= 3 && game.playerOne == game.playerTwo) {
            System.out.println("Advantage " + playerOne );
        } else  {
            System.out.printf("%d to %d%n", game.playerOne.score, game.playerTwo.score);
        }

    }
}
