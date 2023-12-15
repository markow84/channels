package vatiaz.chaneels.managers;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import vatiaz.chaneels.main.Main;

import org.bukkit.entity.Player;

public class SendServer {
    public static void sendtoserver(Player p, String server) {
        ByteArrayDataOutput dataOutput = ByteStreams.newDataOutput();
        dataOutput.writeUTF("Connect");
        dataOutput.writeUTF(server);
        p.sendPluginMessage(Main.getInstance(), "BungeeCord", dataOutput.toByteArray());
    }
}
