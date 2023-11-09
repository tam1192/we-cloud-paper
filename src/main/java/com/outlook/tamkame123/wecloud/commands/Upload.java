package com.outlook.tamkame123.wecloud.commands;

import java.util.UUID;

import org.bukkit.entity.Player;

/**
 * Upload the schema to the cloud
 */
public class Upload {
    
    public static boolean funciton(Player player){
        UUID uuid = player.getUniqueId();
        player.sendMessage("upload"); 
        player.sendMessage("your uuid:" + uuid.toString());
        return true;
    }
}
