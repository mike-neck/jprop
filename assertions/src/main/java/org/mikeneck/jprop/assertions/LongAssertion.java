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

public interface LongAssertion {

    Assertion is(final long expected);

    Assertion isNot(final long  notExpected);

    Assertion is0();

    Assertion isNot0();

    Assertion isGreaterThan(final long another);

    Assertion isGreaterThanOrEquals(final long another);

    Assertion isLessThan(final long another);

    Assertion isLessThanOrEquals(final long another);

    Assertion isIn(final long... values);

    Between inRangeFromInclusive(final long minInclusive);

    Between inRangeFromExclusive(final long minExclusive);

    interface Between {
        Assertion toExclusive(final long maxExclusive);
        Assertion toInclusive(final long maxInclusive);
    }
}
