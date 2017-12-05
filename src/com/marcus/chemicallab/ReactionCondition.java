package com.marcus.chemicallab;

/**
 * Created by marcus on 2017/12/5.
 */
public enum ReactionCondition {
    LIGHTING("lighting"), // 点燃
    HEATING("heating"), // 加热
    HIGH_TEMP("high_temp"), // 高温
    CATALYZER("catalyzer");  // 催化剂

    private String displayName;
    private ReactionCondition(String name){
        this.displayName = name;
    }

    public String getDisplayName() {
        return displayName;
    }
}
