package johnnycena.noreduceddebuginfo.mixin;

import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Options.class)
public class OptionsMixin {
	@Overwrite
	public OptionInstance<Boolean> reducedDebugInfo() {
		return OptionInstance.createBoolean("", false);
	}
}