/**
 * This file is part of Prism, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015 Helion3 http://helion3.com/
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.helion3.prism.api.query;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.spongepowered.api.data.DataQuery;

final public class Condition {
    private final DataQuery dataQuery;
    private final MatchRule matchRule;
    private final Object value;

    /**
     * Build a condition for use with querying the storage.
     *
     * @param dataQuery DataQuery matching the field name.
     * @param rule MatchRule describing comparison of values.
     * @param list List of String or Number values.
     */
    public Condition(DataQuery dataQuery, MatchRule matchRule, List<?> list) {
        checkNotNull(dataQuery);
        checkNotNull(matchRule);
        checkNotNull(list);
        this.dataQuery = dataQuery;
        this.matchRule = matchRule;
        this.value = list;
    }

    /**
     * Returns the DataQuery name for the field
     * this condition applies to.
     *
     * @return DataQuery DataQuery field name.
     */
    public DataQuery getDataQuery() {
        return dataQuery;
    }

    /**
     * Returns the match rule for the given values.
     *
     * @return MatchRule Match rule for condition's value.
     */
    public MatchRule getMatchRule() {
        return matchRule;
    }

    /**
     * Returns the value to be used in the condition. How it's
     * compared depends on the MatchRule.
     *
     * @return Object Any value of List, String, Number
     */
    public Object getValue() {
        return value;
    }
}
