package com.merakianalytics.orianna.types.core.staticdata;

import com.google.common.base.Function;
import com.merakianalytics.orianna.types.common.GameMode;
import com.merakianalytics.orianna.types.common.Map;
import com.merakianalytics.orianna.types.core.OriannaObject;

public class RecommendedItems extends OriannaObject.ListProxy<ItemSet, com.merakianalytics.orianna.types.data.staticdata.ItemSet, com.merakianalytics.orianna.types.data.staticdata.RecommendedItems> {
    private static final long serialVersionUID = 7485737031964917542L;

    public RecommendedItems(final com.merakianalytics.orianna.types.data.staticdata.RecommendedItems coreData) {
        super(coreData, new Function<com.merakianalytics.orianna.types.data.staticdata.ItemSet, ItemSet>() {
            @Override
            public ItemSet apply(final com.merakianalytics.orianna.types.data.staticdata.ItemSet set) {
                return new ItemSet(set);
            }
        }, com.merakianalytics.orianna.types.data.staticdata.RecommendedItems.class);
    }

    public Map getMap() {
        return coreData.getMap();
    }

    public GameMode getMode() {
        return coreData.getMode();
    }

    public String getTitle() {
        return coreData.getTitle();
    }

    public String getType() {
        return coreData.getType();
    }

    public boolean isPriority() {
        return coreData.isPriority();
    }
}
