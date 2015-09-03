package cc.cygni.commandgen.NBT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import cc.cygni.commandgen.NBT.TAG.TAG;
import cc.cygni.commandgen.NBT.TAG.TAGBoolean;
import cc.cygni.commandgen.NBT.TAG.TAGCompound;
import cc.cygni.commandgen.NBT.TAG.TAGFloat;
import cc.cygni.commandgen.NBT.TAG.TAGInt;
import cc.cygni.commandgen.NBT.TAG.TAGList;
import cc.cygni.commandgen.NBT.TAG.TAGString;
import cc.cygni.commandgen.commands.Entity;
import cc.cygni.commandgen.commands.Type;

public enum NBTTag {
	
	// ALL ENTITIES
	id(new TAGString(""), 					Entity.values()),
	Pos(new TAGList<TAGFloat>(3),			Entity.values()),
	Motion(new TAGList<TAGInt>(3),			Entity.values()),
	Rotation(new TAGList<TAGFloat>(2),		Entity.values()),
	FallDistance(new TAGFloat(0),			Entity.values()),
	Fire(new TAGInt(-1),					Entity.values()),
	Air(new TAGInt(300),					Entity.values()),
	OnGround(new TAGBoolean(true),			Entity.values()),
	Invulnerable(new TAGBoolean(false),		Entity.values()),
	PortalCooldown(new TAGInt(0),			Entity.values()),
	UUIDMost(new TAGInt(0),					Entity.values()),
	UUIDLeast(new TAGInt(0),				Entity.values()),
	CustomName(new TAGString(""),			Entity.values()),
	CustomNameVisible(new TAGBoolean(false),Entity.values()),
	Silent(new TAGBoolean(false),			Entity.values()),
	Riding(new TAGCompound(),				Entity.values()),
	Glowing(new TAGBoolean(false),			Entity.values()),
	Tags(new TAGList<TAGString>(100000),	Entity.values()),
	
	// ALL MOBS
	Health(new TAGFloat(0), 							Entity.getAllWithType(Type.Mob)),
	AbsorptionAmount(new TAGFloat(0),					Entity.getAllWithType(Type.Mob)),
	AttackTime(new TAGInt(0),							Entity.getAllWithType(Type.Mob)),
	HurtTime(new TAGInt(0),								Entity.getAllWithType(Type.Mob)),
	HurtByTimestamp(new TAGInt(0),						Entity.getAllWithType(Type.Mob)),
	DeathTime(new TAGInt(0),							Entity.getAllWithType(Type.Mob)),
	Attributes(new TAGCompound(),						Entity.getAllWithType(Type.Mob)),
	ActiveEffects(new TAGCompound(),					Entity.getAllWithType(Type.Mob)),
	HandItems(new TAGList<TAGCompound>(2),				Entity.getAllWithType(Type.Mob)),
	ArmorItems(new TAGList<TAGCompound>(4),				Entity.getAllWithType(Type.Mob)),
	HandItemsDropChances(new TAGList<TAGFloat>(2),		Entity.getAllWithType(Type.Mob)),
	ArmorItemsDropChances(new TAGList<TAGFloat>(4),		Entity.getAllWithType(Type.Mob)),
	CanPickUpLoot(new TAGBoolean(false),				Entity.getAllWithType(Type.Mob)),
	NoAI(new TAGBoolean(false),							Entity.getAllWithType(Type.Mob)),
	PersistenceRequired(new TAGBoolean(false),			Entity.getAllWithType(Type.Mob)),
	LeftHanded(new TAGBoolean(false),					Entity.getAllWithType(Type.Mob)),
	Team(new TAGString(""),								Entity.getAllWithType(Type.Mob)),
	Leashed(new TAGBoolean(false),						Entity.getAllWithType(Type.Mob)),
	Leash(new TAGCompound(),							Entity.getAllWithType(Type.Mob)),
	
	// BREEDABLE
	InLove(new TAGInt(0),					Entity.getAllWithType(Type.Breedable)),
	Age(new TAGInt(0),						Entity.getAllWithType(Type.Breedable)),
	ForcedAge(new TAGInt(0),				Entity.getAllWithType(Type.Breedable)),
	
	// TAMEABLE
	Owner(new TAGString(""),				Entity.getAllWithType(Type.Tameable)),
	TameOwnerUUID(new TAGString(""),		Entity.getAllWithType(Type.Tameable), "OwnerUUID"),
	Sitting(new TAGBoolean(false),			Entity.getAllWithType(Type.Tameable)),
	
	// MOB SPECIFIC
		//Bat
	BatFlags(new TAGBoolean(false),			new Entity[]{Entity.Bat}),
		//Chicken
	IsChickenJockey(new TAGBoolean(false),	new Entity[]{Entity.Chicken}),
	EggLayTime(new TAGInt(0),				new Entity[]{Entity.Chicken}),
		//Creeper
	powered(new TAGBoolean(false),			new Entity[]{Entity.Creeper}),
	ExplosionRadius(new TAGInt(0),			new Entity[]{Entity.Creeper}),
	Fuse(new TAGInt(0),						new Entity[]{Entity.Creeper}),
	ignited(new TAGBoolean(false),			new Entity[]{Entity.Creeper}),
		//EnderDragon
	DragonPhase(new TAGInt(0),				new Entity[]{Entity.EnderDragon}),
		//Enderman
	carried(new TAGInt(0),					new Entity[]{Entity.Enderman}),
	carriedData(new TAGInt(0),				new Entity[]{Entity.Enderman}),
		//Endermite
	Lifetime(new TAGInt(0),					new Entity[]{Entity.Endermite}),
	PlayerSpawned(new TAGBoolean(false),	new Entity[]{Entity.Endermite}),
		//EntityHorse
	Bred(new TAGBoolean(false),				new Entity[]{Entity.EntityHorse}),
	ChestedHorse(new TAGBoolean(false),		new Entity[]{Entity.EntityHorse}),
	EatingHaystack(new TAGBoolean(false),	new Entity[]{Entity.EntityHorse}),
	Tame(new TAGBoolean(false),				new Entity[]{Entity.EntityHorse}),
	Variant(new TAGInt(0),					new Entity[]{Entity.EntityHorse}),
	HorseOwnerUUID(new TAGInt(0),			new Entity[]{Entity.EntityHorse}, "OwnerUUID"),
	Items(new TAGCompound(),				new Entity[]{Entity.EntityHorse}),
	ArmorItem(new TAGCompound(),			new Entity[]{Entity.EntityHorse}),
	SaddleItem(new TAGCompound(),			new Entity[]{Entity.EntityHorse}),
	HorseSaddle(new TAGBoolean(false),		new Entity[]{Entity.EntityHorse}, "Saddle"),
		//Ghast
	ExplosionPower(new TAGInt(0),			new Entity[]{Entity.Ghast}),
		//Guardian
	Elder(new TAGBoolean(false),			new Entity[]{Entity.Guardian}),
		//Ozelot
	CatType(new TAGInt(0),					new Entity[]{Entity.Ozelot}),
		//Pig
	PigSaddle(new TAGBoolean(false),		new Entity[]{Entity.Pig}, "Saddle"),
		//Rabbit
	RabbitType(new TAGInt(0),				new Entity[]{Entity.Rabbit}),
	MoreCarrotTicks(new TAGInt(0),			new Entity[]{Entity.Rabbit}),
		//Sheep
	Sheared(new TAGBoolean(false),			new Entity[]{Entity.Sheep}),
	Color(new TAGInt(0),					new Entity[]{Entity.Sheep}),
		//Shulker
	Peek(new TAGInt(0),						new Entity[]{Entity.Shulker}),
	AttachFace(new TAGInt(0),				new Entity[]{Entity.Shulker}),
	APX(new TAGInt(0),						new Entity[]{Entity.Shulker}),
	APY(new TAGInt(0),						new Entity[]{Entity.Shulker}),
	APZ(new TAGInt(0),						new Entity[]{Entity.Shulker}),
		//Skeleton
	SkeletonType(new TAGInt(0),				new Entity[]{Entity.Skeleton}),
		//Slime, LavaSlime
	Size(new TAGInt(0),						new Entity[]{Entity.Slime, Entity.LavaSlime}),
	
	
	;
	
	@SuppressWarnings("unused")
	private TAG tag;
	@SuppressWarnings("unused")
	private Entity[] supports;
	private String displayName;

	NBTTag(TAG tag, Entity[] supports) {
		this.tag = tag;
		this.supports = supports;
		this.displayName = this.name();
	}
	
	NBTTag(TAG tag, Entity[] supports, String displayName) {
		this.tag = tag;
		this.supports = supports;
		this.displayName = displayName;
	}
	
	public static Entity[] getAllThatSupport(NBTTag t) {
		Set<Entity> tags = new HashSet<>();
		for (Entity e: Entity.values()) {
			if (Arrays.asList(t.supports).contains(e)) {
				tags.add(e);
			}
		}
		return tags.toArray(new Entity[tags.size()]);
	}
	
//	private NBTTag use(NBTTag tag, Entity[] entities) {
//		
//	}
	
	public String getName() {
		return this.displayName;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
}
