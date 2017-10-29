package jmx;

/**
 * Created by Mateusz on 29.10.2017.
 */
public interface GameMBean {

    public void playFootball(String clubName);

    public String getPlayerName();

    public void setPlayerName(String playerName);
}
