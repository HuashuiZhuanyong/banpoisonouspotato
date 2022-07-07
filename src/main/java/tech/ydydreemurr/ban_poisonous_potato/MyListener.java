package tech.ydydreemurr.ban_poisonous_potato;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class MyListener implements Listener {
    @EventHandler
    public void onUse(PlayerItemConsumeEvent e){//监听玩家交互
        /*如果右键毒马铃薯*/
        if(e.getItem().getType() == Material.POISONOUS_POTATO){
            e.setCancelled(true);
        }
    }
}
