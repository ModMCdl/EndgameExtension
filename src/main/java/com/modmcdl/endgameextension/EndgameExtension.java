package com.modmcdl.endgameextension;


import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.proxies.CommonProxy;
import com.modmcdl.endgameextension.util.handlers.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;


@Mod.EventBusSubscriber(modid = EndgameExtension.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EndgameExtension 
{
	//References
	public static final String MODID = "endgameextension";
	public static final String NAME = "Endgame Extension";
	public static final String VERSION = "2.0.0";
	public static final String ACCEPTEDVERSIONS = "[1.14.4]";
	
	public static final String CLIENT_PROXY_CLASS = "com.modmcdl.endgameextension.proxies.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.modmcdl.endgameextension.proxies.CommonProxy";
	

	public static final ItemGroup ITEM_GROUP = (new ItemGroup("EndgameExtension")
			{
				@Override
				public ItemStack createIcon() {
				{
					return new ItemStack(ModItems.QUENCHED_STAR);


			};

	//Main
	@Instance
	public static EndgameExtension instance;

	//Proxies
	@SidedProxy(clientSide = EndgameExtension.CLIENT_PROXY_CLASS, serverSide = EndgameExtension.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
	}
	public void init(FMLInitializationEvent event)
	{
		
	}
	public static void (final FMLPostInitializationEvent event)
	{
		System.out.println("We're in the Endgame now... [Endgame Expansion Loaded].");
	}
	
	//ServerInitialization
	public void serverInit(final FMLServerStartingEvent event)
	{
		System.out.println("We're in the Endgame now... [Endgame Expansion Loaded].");
	}
}