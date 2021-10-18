package com.core;

import java.util.List;

public class Round {
    private Question question;
    private List<Player> players;
    private Variant[] playersAnswers;
    private boolean isAnswered;
    private int winner;

    public Round(Question question, List<Player> players) {
        this.question = question;
        this.players = players;
        playersAnswers = new Variant[players.size()];
        isAnswered = false;
        winner = -1;
    }

    // ход игрока передается в данный метод
    public void setPlayersAnswer(int playerIndex, Variant variant) {
        playersAnswers[playerIndex] = variant;
        if (!isAnswered && question.checkAnswer(variant)) {
            isAnswered = true;
            winner = playerIndex;
        }
    }

    public Variant[] getPlayersAnswers() {
        return playersAnswers;
    }

    public int finish() {
        return winner;
    }

}
