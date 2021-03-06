package org.skywalking.apm.agent.core.context.tag;

import org.skywalking.apm.agent.core.context.trace.AbstractSpan;

/**
 * Do the same thing as {@link StringTag}, just with a {@link Integer} value.
 * <p>
 * Created by wusheng on 2017/2/18.
 */
public class IntTag extends AbstractTag<Integer> {
    public IntTag(String key) {
        super(key);
    }

    @Override
    public void set(AbstractSpan span, Integer tagValue) {
        span.setTag(super.key, tagValue);
    }

}
