package jp.nemi.catlib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = CatLibCore.MOD_ID,
        name = CatLibCore.MOD_NAME,
        version = CatLibCore.VERSION
)
public class CatLibCore {

    public static final String MOD_ID = "catlib";
    public static final String MOD_NAME = "Catlib";
    public static final String VERSION = "1.12.2-1A0N0";

    public CatLibCore() {}
}
