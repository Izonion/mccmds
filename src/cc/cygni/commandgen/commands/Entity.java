package cc.cygni.commandgen.commands;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import cc.cygni.commandgen.NBT.NBTTag;


public enum Entity {
	Bat(				Type.Mob),
	Chicken(			new Type[]{Type.Mob, Type.Breedable}),
	Creeper(			Type.Mob),
	EnderDragon(		Type.Mob),
	Enderman(			Type.Mob),
	Endermite(			Type.Mob),
	EntityHorse(		new Type[]{Type.Mob, Type.Breedable, Type.Tameable}),
	Ghast(				Type.Mob),
	Guardian(			Type.Mob),
	Ozelot(				new Type[]{Type.Mob, Type.Breedable, Type.Tameable}),
	Pig(				new Type[]{Type.Mob, Type.Breedable}),
	Rabbit(				new Type[]{Type.Mob, Type.Breedable}),
	Sheep(				new Type[]{Type.Mob, Type.Breedable}),
	Shulker(			Type.Mob),
	Skeleton(			Type.Mob),
	Slime(				Type.Mob),
	LavaSlime(			Type.Mob),
	WitherBoss(			Type.Mob),
	Wolf(				new Type[]{Type.Mob, Type.Breedable, Type.Tameable}),
	Villager(			new Type[]{Type.Mob, Type.Breedable}),
	VillagerGolem(		Type.Mob),
	Zombie(				Type.Mob),
	PigZombie(			Type.Mob);
	
	private Type[] types;
	
	Entity(Type[] type) {
		this.types = type;
	}
	
	Entity(Type type) {
		this.types = new Type[]{type};
	}
	
	public Type[] getType() {
		return this.types;
	}
	
	public static Entity[] getAllWithType(Type t) {
		Set<Entity> entities = new HashSet<>();
		for (Entity e: Entity.values()) {
			if (Arrays.asList(e.types).contains(t)) {
				entities.add(e);
			}
		}
		return entities.toArray(new Entity[entities.size()]);
	}
	
}