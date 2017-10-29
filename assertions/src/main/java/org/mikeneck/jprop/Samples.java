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
package org.mikeneck.jprop;

import org.mikeneck.jprop.assertions.Sample;

final class Samples {

    private Samples() {}

    static class BooleanSample {
        static final Sample ofTrue = new TrueSample();
        static final Sample ofFalse = new FalseSample();
    }

    static class TrueSample implements Sample {

        private TrueSample() {}

        @Override
        public String getValue() {
            return "true";
        }
    }

    static class FalseSample implements Sample {

        private FalseSample() {}

        @Override
        public String getValue() {
            return "false";
        }
    }

    static class IntSample implements Sample {

        private final int value;

        IntSample(final int value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return Integer.toString(value);
        }
    }

    static class LongSample implements Sample {

        private final long value;

        LongSample(final long value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return Long.toString(value);
        }
    }

    static class StringSample implements Sample {

        private final String value;

        StringSample(final String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    static class ReferenceSample<T> implements Sample {

        private final T value;

        ReferenceSample(final T value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value.toString();
        }
    }
}
