package com.outlook.tamkame123.wecloud.commands;

import java.util.UUID;

import org.bukkit.entity.Player;

/**
 * Delete the schema from the cloud
 */
public class Delete {
    public static boolean funciton(Player player){
        UUID uuid = player.getUniqueId();
        player.sendMessage("delete"); 
        player.sendMessage("your uuid:" + uuid.toString());
        return true;
    }
}
