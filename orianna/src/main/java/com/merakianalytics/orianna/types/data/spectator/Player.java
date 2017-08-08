package com.merakianalytics.orianna.types.data.spectator;

import java.util.Map;

import com.merakianalytics.orianna.types.common.Team;
import com.merakianalytics.orianna.types.data.CoreData;

public class Player extends CoreData {
    private static final long serialVersionUID = -8251450200432275083L;
    private boolean bot;
    private Map<Integer, Integer> masteries, runes;
    private int profileIconId, championId, summonerSpellDId, summonerSpellFId;
    private long summonerId;
    private String summonerName;
    private Team team;

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player)obj;
        if(bot != other.bot) {
            return false;
        }
        if(championId != other.championId) {
            return false;
        }
        if(masteries == null) {
            if(other.masteries != null) {
                return false;
            }
        } else if(!masteries.equals(other.masteries)) {
            return false;
        }
        if(profileIconId != other.profileIconId) {
            return false;
        }
        if(runes == null) {
            if(other.runes != null) {
                return false;
            }
        } else if(!runes.equals(other.runes)) {
            return false;
        }
        if(summonerId != other.summonerId) {
            return false;
        }
        if(summonerName == null) {
            if(other.summonerName != null) {
                return false;
            }
        } else if(!summonerName.equals(other.summonerName)) {
            return false;
        }
        if(summonerSpellDId != other.summonerSpellDId) {
            return false;
        }
        if(summonerSpellFId != other.summonerSpellFId) {
            return false;
        }
        if(team != other.team) {
            return false;
        }
        return true;
    }

    /**
     * @return the championId
     */
    public int getChampionId() {
        return championId;
    }

    /**
     * @return the masteries
     */
    public Map<Integer, Integer> getMasteries() {
        return masteries;
    }

    /**
     * @return the profileIconId
     */
    public int getProfileIconId() {
        return profileIconId;
    }

    /**
     * @return the runes
     */
    public Map<Integer, Integer> getRunes() {
        return runes;
    }

    /**
     * @return the summonerId
     */
    public long getSummonerId() {
        return summonerId;
    }

    /**
     * @return the summonerName
     */
    public String getSummonerName() {
        return summonerName;
    }

    /**
     * @return the summonerSpellDId
     */
    public int getSummonerSpellDId() {
        return summonerSpellDId;
    }

    /**
     * @return the summonerSpellFId
     */
    public int getSummonerSpellFId() {
        return summonerSpellFId;
    }

    /**
     * @return the team
     */
    public Team getTeam() {
        return team;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (bot ? 1231 : 1237);
        result = prime * result + championId;
        result = prime * result + (masteries == null ? 0 : masteries.hashCode());
        result = prime * result + profileIconId;
        result = prime * result + (runes == null ? 0 : runes.hashCode());
        result = prime * result + (int)(summonerId ^ summonerId >>> 32);
        result = prime * result + (summonerName == null ? 0 : summonerName.hashCode());
        result = prime * result + summonerSpellDId;
        result = prime * result + summonerSpellFId;
        result = prime * result + (team == null ? 0 : team.hashCode());
        return result;
    }

    /**
     * @return the bot
     */
    public boolean isBot() {
        return bot;
    }

    /**
     * @param bot
     *        the bot to set
     */
    public void setBot(final boolean bot) {
        this.bot = bot;
    }

    /**
     * @param championId
     *        the championId to set
     */
    public void setChampionId(final int championId) {
        this.championId = championId;
    }

    /**
     * @param masteries
     *        the masteries to set
     */
    public void setMasteries(final Map<Integer, Integer> masteries) {
        this.masteries = masteries;
    }

    /**
     * @param profileIconId
     *        the profileIconId to set
     */
    public void setProfileIconId(final int profileIconId) {
        this.profileIconId = profileIconId;
    }

    /**
     * @param runes
     *        the runes to set
     */
    public void setRunes(final Map<Integer, Integer> runes) {
        this.runes = runes;
    }

    /**
     * @param summonerId
     *        the summonerId to set
     */
    public void setSummonerId(final long summonerId) {
        this.summonerId = summonerId;
    }

    /**
     * @param summonerName
     *        the summonerName to set
     */
    public void setSummonerName(final String summonerName) {
        this.summonerName = summonerName;
    }

    /**
     * @param summonerSpellDId
     *        the summonerSpellDId to set
     */
    public void setSummonerSpellDId(final int summonerSpellDId) {
        this.summonerSpellDId = summonerSpellDId;
    }

    /**
     * @param summonerSpellFId
     *        the summonerSpellFId to set
     */
    public void setSummonerSpellFId(final int summonerSpellFId) {
        this.summonerSpellFId = summonerSpellFId;
    }

    /**
     * @param team
     *        the team to set
     */
    public void setTeam(final Team team) {
        this.team = team;
    }
}
