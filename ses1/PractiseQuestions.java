package ses1;
// Parent Class
abstract class Game {
    abstract void startGame();
}

// Child Classes

class videoGame extends Game {
    @Override
    void startGame() {
        System.out.println("Starting a video game: Loading graphics...");
    }
}

class boardGame extends Game {
    @Override
    void startGame() {
        System.out.println("Starting a board game: Setting up pieces...");
    }
}

public class PractiseQuestions {
    public static void main(String[] args) {
        boardGame myGame = new boardGame();
        myGame.startGame();
    }
}