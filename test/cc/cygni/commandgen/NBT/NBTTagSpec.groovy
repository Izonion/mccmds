package cc.cygni.commandgen.NBT

import static cc.cygni.commandgen.commands.Entity.*
import static NBTTag.*
import spock.lang.Specification
import spock.lang.Unroll

class NBTTagSpec extends Specification {

	@Unroll
	def "get getAllThatSupport with various options"() {
		when:
		def supported = NBTTag.getAllThatSupport(tag)
		
		then:"expected is an ordered set"
		supported as TreeSet == expected as TreeSet
		
		where:
		tag | expected
		ArmorItem | [EntityHorse]
		PortalCooldown | [Creeper, LavaSlime, PigZombie, Endermite, EnderDragon, Enderman, Skeleton, Villager, Ozelot, Zombie, Ghast, Pig, VillagerGolem, Sheep, Guardian, Bat, EntityHorse, Rabbit, Chicken, Shulker, WitherBoss, Slime, Wolf]
		TameOwnerUUID | [EntityHorse, Wolf, Ozelot]
	}

}
