# Designing a Stack with Special Functionality

## Design a stack. It should support the standard methods (push, pop, and peek) but also an additional method that returns the minimum element in the stack. Push, pop, peek, and min should all operate in O(1) time.

### Method Header:
Java: public int getMin() {}

Ruby: def get_min

### Example:
stack.push(5);

stack.push(6);

stack.push(4);

stack.push(1);

stack.push(3);

stack.pop();

stack.pop();

stack.getMin(); //returns 4