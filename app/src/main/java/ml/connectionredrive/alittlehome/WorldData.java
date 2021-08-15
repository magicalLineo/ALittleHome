package ml.connectionredrive.alittlehome;

import java.util.Timer;
import java.util.TimerTask;

public class WorldData {
    private int day;
    private int worldLevel;
    private boolean isPlaying;
    private boolean isBuiltHouse;
    private boolean isBuiltFarm;
    private boolean isBuiltFactory;

    public WorldData() {
        day = 0;
        worldLevel = 0;
        isBuiltHouse = false;
        isBuiltFarm = false;
        isBuiltFactory = false;
        isPlaying = false;
    }

    public void play() {
        isPlaying = true;
        TimerTask playTask = new TimerTask() {
            @Override
            public void run() {
                day += 1;
            }
        };
        Timer timer = new Timer();
        timer.schedule(playTask, 0, 24000);
    }

    public void setDay(int day) {
        if (day >= 0) {
            this.day = day;
        }
    }

    public int getDay() {
        return day;
    }

    public void setWorldLevel(int worldLevel) {
        if (worldLevel >= 0) {
            this.worldLevel = worldLevel;
        }
    }

    public int getWorldLevel() {
        return worldLevel;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setBuiltHouse() {
        isBuiltHouse = true;
    }

    public boolean isBuiltHouse() {
        return isBuiltHouse;
    }

    public void setBuiltFarm() {
        isBuiltFarm = true;
    }

    public boolean isBuiltFarm() {
        return isBuiltFarm;
    }

    public void setBuiltFactory() {
        isBuiltFactory = true;
    }

    public boolean isBuiltFactory() {
        return isBuiltFactory;
    }
}
