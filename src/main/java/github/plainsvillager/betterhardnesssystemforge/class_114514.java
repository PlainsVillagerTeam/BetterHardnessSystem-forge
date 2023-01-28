package github.plainsvillager.betterhardnesssystemforge;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class class_114514 {
    public static final int BASE = 0;
    public static final int MAX = 114514;

    private int now = 0;

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    @SubscribeEvent
    public void rightClickBlock(PlayerInteractEvent.RightClickBlock event){
        now++;
    }

}
