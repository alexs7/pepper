package com.recklesscoding.abode.core.plan.reader;

import com.recklesscoding.abode.util.IReader;

/**
 * Author: @Andreas.
 * Date : @29/12/2015
 */
public abstract class PlanReader implements IReader {

    @Override
    public abstract void readFile(String fileName);

}
