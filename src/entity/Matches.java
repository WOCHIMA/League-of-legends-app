package entity;

import java.util.ArrayList;

public interface Matches {
    ArrayList<Match> getAllMatches();

    Match getMatchByID(String matchid);
}
