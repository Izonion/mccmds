package cc.cygni.commandgen.commands

import static Entity.*
import spock.lang.Specification

class EntitySpec extends Specification {

	def "test getAllWithType"() {
		when:
		def types = Entity.getAllWithType(Type.Breedable)
		
		then:"using an ordered set for comparison"
		types as TreeSet == [Rabbit, Pig, Ozelot, Chicken, Sheep, Wolf, EntityHorse, Villager] as TreeSet
	}
}
