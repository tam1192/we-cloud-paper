package com.outlook.tamkame123.wecloud.commands;

import java.util.UUID;

import org.bukkit.entity.Player;

/**
 * Show listings stored in the cloud
 */
public class List {
    
    public static boolean funciton(Player player){
        UUID uuid = player.getUniqueId();
        player.sendMessage("list"); 
        player.sendMessage("your uuid:" + uuid.toString());
        return true;
    }
    
}
