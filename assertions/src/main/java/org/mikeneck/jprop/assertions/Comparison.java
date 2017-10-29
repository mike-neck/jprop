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

public class Comparison {

    private static final String SEPARATOR = System.lineSeparator();

    private final Sample actual;
    private final Sample expected;

    public Comparison(final Sample actual, final Sample expected) {
        this.actual = actual;
        this.expected = expected;
    }

    String getDescription() {
        return "comparing result:" + SEPARATOR +
                "expected : " + expected.getValue() + SEPARATOR +
                "actual   : " + actual.getValue() + SEPARATOR;
    }
}
