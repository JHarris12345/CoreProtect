package net.coreprotect.event;

import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoreProtectSpawnerRollbackEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final CreatureSpawner spawner;
    private final int rolledBackSpawners;
    private final List<Long> breakTimes;
    private final long rollbackToTime;

    public CoreProtectSpawnerRollbackEvent(CreatureSpawner spawner, int rolledBackSpawners, List<Long> breakTimes, long rollbackToTime) {
        this.spawner = spawner;
        this.rolledBackSpawners = rolledBackSpawners;
        this.breakTimes = breakTimes;
        this.rollbackToTime = rollbackToTime;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public CreatureSpawner getSpawner() {
        return spawner;
    }

    public int getRolledBackSpawners() {
        return rolledBackSpawners;
    }

    public List<Long> getBreakTimes() {
        return breakTimes;
    }

    public long getRollbackToTime() {
        return rollbackToTime;
    }
}
