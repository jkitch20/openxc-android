package com.openxc.measurements;

import com.openxc.units.Degree;
import com.openxc.util.Range;

/**
 * HeadingDegrees Measurement is the GPS heading in degrees. 
 */
public class Heading extends BaseMeasurement<Degree> {
    private final static Range<Degree> RANGE =
        new Range<Degree>(new Degree(-600), new Degree(600));
    public final static String ID = "heading";

    public Heading(Number value) {
        super(new Degree(value), RANGE);
    }

    public Heading(Degree value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}