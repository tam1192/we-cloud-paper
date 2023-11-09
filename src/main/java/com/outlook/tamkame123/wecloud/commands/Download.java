package com.outlook.tamkame123.wecloud.commands;

import java.util.UUID;

import org.bukkit.entity.Player;

/**
 * Download the schema from the cloud
 */
public class Download {
    public static boolean funciton(Player player){
        UUID uuid = player.getUniqueId();
        player.sendMessage("download"); 
        player.sendMessage("your uuid:" + uuid.toString());
        return true;
    }
}
