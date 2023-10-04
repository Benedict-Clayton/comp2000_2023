# Iterator Pattern
- Uniformly access different collections of objects.
- arraylist, array, hashmap -> treatos the same way by iterating through them.
- Iterate through the Grid, so what do we iterate?

# Components of the Pattern:
1. Interable/Aggregate = Grid -> extend Interable(Cell)
2. ConcreteIterator(CellIterator) -> extend Iterator(Cell)

# ITERABLE:
- object that a user can Iterate over -> Grid
# Iterator
- object helps us iterate over another iterable object

## Our Case
- CellIterator Object to iterate through the grid

```java
class Persons extends Iterable<Person>{
    ArrayList<Person> p = new ArrayList<>();
}

Persons newP = new Persons();
for(Person p: newp){
    // do something with each Person objects
}


