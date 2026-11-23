package johnnycena.noreduceddebuginfo.mixin;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Player.class)
public class PlayerMixin {
	@Overwrite
	public boolean isReducedDebugInfo() {
		return false;
	}
}