
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

@FunctionalInterface
public interface JFunction2$mcIID$sp extends JFunction2 {
    abstract int apply$mcIID$sp(int v1, double v2);

    default Object apply(Object v1, Object v2) { return (Integer) apply$mcIID$sp((Integer) v1, (Double) v2); }
}
