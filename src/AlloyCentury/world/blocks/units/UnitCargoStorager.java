package AlloyCentury.world.blocks.units;

import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;

public class UnitCargoStorager extends UnitCargoBlock {
    public UnitCargoStorager(String name){
        super(name);
        hasItems = true;
        itemCapacity = 100;
    }

    public class UnitCargoStoragerBuild extends UnitCargoBlockBuild{
        @Override
        public boolean acceptItem(Building source, Item item){
            return items.get(item) < getMaximumAccepted(item);
        }
    }
}

