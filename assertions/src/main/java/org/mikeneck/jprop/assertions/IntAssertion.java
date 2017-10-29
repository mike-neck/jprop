/*
 * Copyright 2017 Shinya Mochida
 * 
 * Licensed under the Apache License,Version2.0(the"License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,software
 * Distributed under the License is distributed on an"AS IS"BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mikeneck.jprop.assertions;

import org.mikeneck.jprop.Assertion;

public interface IntAssertion {

    Assertion is(final int expected);

    Assertion isNot(final int notExpected);

    Assertion is0();

    Assertion isNot0();

    Assertion isGreaterThan(final int another);

    Assertion isGreaterThanOrEquals(final int another);

    Assertion isLessThan(final int another);

    Assertion isLessThanOrEquals(final int another);

    Assertion isIn(final int... values);

    Between isInRangeFromInclusive(final int minInclusive);

    Between isInRangeFromExclusive(final int minExclusive);

    interface Between {
        Assertion toExclusive(final int maxExclusive);
        Assertion toInclusive(final int maxInclusive);
    }
}
