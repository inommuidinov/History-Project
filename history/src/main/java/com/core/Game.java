package com.core;

import java.util.Collections;
import java.util.List;

public class Game {
    private List<Player> players;
    private List<Question> questions;
    private int currentRoundIndex;
    private Round currentRound;
    private int[] points;

    //нужно создать игру после чего каждый раунд запускать и заканчивать
    public Game(List<Player> players, List<Question> questions) {
        this.players = players;
        this.questions = questions;
        Collections.shuffle(questions);
        currentRoundIndex = 0;
        points = new int[players.size()];
    }

    public void startRound() {
        currentRound = new Round(questions.get(currentRoundIndex), players);
    }

    private void endRound() {
        int winner = currentRound.finish();
        if (winner != -1) {
            points[winner]++;
        }
    }

    public int[] getPoints() {
        return points;
    }
}

