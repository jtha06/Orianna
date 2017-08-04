package com.merakianalytics.orianna.types.data.championmastery;

import com.merakianalytics.orianna.types.common.Platform;
import com.merakianalytics.orianna.types.data.CoreData;

public class ChampionMasteries extends CoreData.ListProxy<ChampionMastery> {
    private static final long serialVersionUID = -8451430384670102120L;
    private Platform platform;
    private long summonerId;

    public ChampionMasteries() {
        super();
    }

    public ChampionMasteries(final int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(!super.equals(obj)) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final ChampionMasteries other = (ChampionMasteries)obj;
        if(platform != other.platform) {
            return false;
        }
        if(summonerId != other.summonerId) {
            return false;
        }
        return true;
    }

    /**
     * @return the platform
     */
    public Platform getPlatform() {
        return platform;
    }

    /**
     * @return the summonerId
     */
    public long getSummonerId() {
        return summonerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + (int)(summonerId ^ summonerId >>> 32);
        return result;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final Platform platform) {
        this.platform = platform;
    }

    /**
     * @param summonerId
     *        the summonerId to set
     */
    public void setSummonerId(final long summonerId) {
        this.summonerId = summonerId;
    }
}
