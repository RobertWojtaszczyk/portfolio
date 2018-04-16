package com.rw.rps;

import com.rw.rps.game.Game;
import com.rw.rps.game.UserDialogs;
import com.rw.rps.game.definitions.CHOICE;

public class RpsRunner {
    public static void main(String[] args) {
        String name = UserDialogs.getPlayerName();
        int numberOfWins = UserDialogs.getNumberOfWins();
        Game game = new Game(name, numberOfWins);
        boolean end = false;
        CHOICE playersChoice = UserDialogs.readChoice(name);
        while (!end) {
            end = (playersChoice == CHOICE.END);
            switch (playersChoice) {
                case CONTINUE:
                    playersChoice = UserDialogs.readChoice(name);
                    break;
                case END:
                    System.out.println("Thank You for playing!");
                    break;
                case NEW:
                    name = UserDialogs.getPlayerName();
                    numberOfWins = UserDialogs.getNumberOfWins();
                    game = new Game(name, numberOfWins);
                    playersChoice = CHOICE.CONTINUE;
                    break;
                case AGAIN:
                    numberOfWins = UserDialogs.getNumberOfWins();
                    game = new Game(name, numberOfWins);
                    playersChoice = CHOICE.CONTINUE;
                    break;
                case WIN:
                    UserDialogs.showFinalStats(game);
                    playersChoice = UserDialogs.readChoicePlayAgain(name);
                    break;
                default:
                    playersChoice = game.playRound(playersChoice);
                    UserDialogs.showRoundStats(game);
            }
        }
    }
}