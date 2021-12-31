package hu.crackpixel.skyboard.skyboard.scoreboards;

import java.util.ArrayList;

public class CustomScoreboard {
    public String title;
    public ArrayList<String> lines;

    public CustomScoreboard(String title, ArrayList<String> lines) { // we also have a renderer class
        this.title = title;
        this.lines = lines;
    }

    public CustomScoreboard(String title) {
        this.title = title;
        this.lines = new ArrayList<>();
    }



    public void addLine(String line) {
        lines.add(line);
    }

    public void removeLine(int index) {
        lines.remove(index);
    }

    public void removeLine(String line) {
        lines.remove(line);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
