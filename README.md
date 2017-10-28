Seven Property Based Test
===

Property based testing framework for Java7, which runs on JUnit4.

Usage
===

```java
import static org.mikeneck.seven.PropertyBasedTest.describe;
import static org.mikeneck.seven.lang.IntGen.ints;
import static org.mikeneck.seven.util.ListGen.listOf;

public class SomeTest {
  @SuppressWarnings("WeakerAccess")
  @Rule
  public PropertyBasedTest test = new PropertyBasedTest();

  @Test
  public void testForSomething() {
    test
        .describe("reverse of a reversed list should be same as the original list.")
        .forAll(listOf(ints))
        .satisfies(reverseOfReversedListShouldBeSaneAsTheOriginalList);
  }

  private PropertyDescription<List<Integer>> reverseOfReversedListShouldBeSaneAsTheOriginalList =
      new PropertyDescription<>() {
          @Override
          public Assert<?> property(final List<Integer> value) {
            final List<Integer> list = new ArrayList(value);
            Collections.reverse(list);
            Collections.reverse(list);
            return Assert.that(list).is(value);
          }
      };
}
```


