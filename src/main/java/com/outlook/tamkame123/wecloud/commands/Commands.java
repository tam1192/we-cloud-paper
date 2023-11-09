package com.outlook.tamkame123.wecloud.commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

/**
 * 
 */
public class Commands implements TabExecutor {
    
    // コマンドイベント
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        // プレイヤーでなければ
        if(!(sender instanceof Player)){
            sender.sendMessage("This commands not worked console.");
            // 失敗した
            return false;
        // 引数が足りんぜよ
        } else if (args.length==0) {
            // 失敗した
            sender.sendMessage("You're missing an argument.");
            return false;
        }

        // 第一引数でコマンドを判断する
        switch (args[0]) {
            case "delete":
                Delete.funciton((Player)sender);
                break;
            case "download":
                Download.funciton((Player)sender);
                break;
            case "list":
                List.funciton((Player)sender);
                break;
            case "rename":
                Rename.funciton((Player)sender);
                break;
            case "upload":
                Upload.funciton((Player)sender);
                break;
            default:
                // そんなコマンドは存在せぬ
                sender.sendMessage("No such command exists.");
                return false;
        }
        // 成功した
        return true;
    }

    @Override
    public java.util.List<String> onTabComplete(CommandSender sender, Command command,
            String label, String[] args) {
        // コマンド補完リスト確保
        java.util.List<String> completeList = new ArrayList<String>();
        // コマンド補完リスト作成
        switch (args.length) {
            case 1:
                completeList.add("delete");
                completeList.add("download");
                completeList.add("list");
                completeList.add("rename");
                completeList.add("upload");
                break;
            default:
                // デフォルト
                return null;
        }
        // コマンド補完
        return completeList;
    }

}