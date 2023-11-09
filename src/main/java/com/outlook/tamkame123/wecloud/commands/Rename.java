package com.outlook.tamkame123.wecloud.commands;

import java.util.UUID;

import org.bukkit.entity.Player;

/**
 * Rename the schema of the stored in the cloud
 */
public class Rename {
    
    public static boolean funciton(Player player){
        UUID uuid = player.getUniqueId();
        player.sendMessage("rename"); 
        player.sendMessage("your uuid:" + uuid.toString());
        return true;
    }
}
