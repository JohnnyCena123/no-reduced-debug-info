package johnnycena.noreduceddebuginfo.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Minecraft.class)
public class MinecraftMixin {
	@Overwrite
	public boolean showOnlyReducedInfo() {
		return false;
	}
}