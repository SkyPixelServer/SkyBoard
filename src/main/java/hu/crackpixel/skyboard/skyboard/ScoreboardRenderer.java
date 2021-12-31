package hu.crackpixel.skyboard.skyboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;
import hu.crackpixel.skyboard.skyboard.scoreboards.*;

public class ScoreboardRenderer {
    public void renderScoreboardFor(Player player, Scoreboard scoreboard) { //also there will only be  main scoreboard with the stuff like location,balance and stuff but it wont be very diffrent
        player.setScoreboard(scoreboard);
    }

    public void renderScoreboardFor(Player player,CustomScoreboard scoreboard) {
        renderScoreboardFor(player,CustomScoreboardToBukkitScoreboard(scoreboard));
    }

    public Scoreboard CustomScoreboardToBukkitScoreboard(CustomScoreboard scoreboard) {
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        
        Objective objective = board.registerNewObjective(scoreboard.title, "dummy");
        objective.setDisplayName(scoreboard.title);
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        for (int i=0; i<scoreboard.lines.size(); i++) {
            String obj = scoreboard.lines.get(i);
            int num = scoreboard.lines.size()-i;

            Score score = objective.getScore(obj);
            score.setScore(num);
        }
        return board;
    }
}
