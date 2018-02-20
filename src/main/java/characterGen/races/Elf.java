package characterGen.races;

import characterGen.Alignment;
import characterGen.Race;
import characterGen.Würfel;
import characterGen.attributes.Attribute;
import characterGen.attributes.AttributeName;
import characterGen.attributes.SpecialAttributeName;

import java.util.List;

public class Elf extends Race {

    public Elf(String name, List<Attribute> attributes, List<Attribute> extraAttributes) {
        super(name, attributes, extraAttributes);
    }

    public Elf() {
        name = "Elf";
        attributes.add(new Attribute(AttributeName.INTELLIGENCE, new Würfel(3, 6, 1)));
        attributes.add(new Attribute(AttributeName.MENTAL_STRENGTH, new Würfel(2, 6, 0)));
        attributes.add(new Attribute(AttributeName.CHARISMA, new Würfel(2, 6, 0)));
        attributes.add(new Attribute(AttributeName.STRENGTH, new Würfel(3, 6, 0)));
        attributes.add(new Attribute(AttributeName.DEXTERITY, new Würfel(4, 6, 0)));
        attributes.add(new Attribute(AttributeName.CONSTITUTION, new Würfel(3, 6, 0)));
        attributes.add(new Attribute(AttributeName.BEAUTY, new Würfel(5, 6, 0)));
        attributes.add(new Attribute(AttributeName.SPEED, new Würfel(3, 6, 0)));
        attributes.add(new Attribute(AttributeName.PERCEPTION, new Würfel(3, 6,3)));



        alignmentDistribution.put(Alignment.ANARCHIST, 90);
        alignmentDistribution.put(Alignment.DIABOLIC, 10);
    }


}
