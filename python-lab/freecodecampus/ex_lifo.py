class Stack:
    def __init__(stack_t):
        stack_t._items = []
    
    def push(stack_t, item):
        stack_t._items.append(item)
    
    def pop(stack_t):
        try:
            return stack_t._items.pop()
        except IndexError:
            print("Stack is empty, all items deleted")
        
    def __len__(stack_t):
        return len(stack_t._items)
    
    def __repr__(stack_t):
        return f"stack ({stack_t._items})"


stack = Stack()

# Push items onto the top of the stack
stack.push(3)
stack.push(5)
stack.push(8)
stack.push(99)

# Print Stack
print(stack)

# Find the length of the stack
print("Length of stack is: ", len(stack))

# Pop items from the stack
print("popping last item")
stack.pop()
print(stack)

print("popping last item again")
stack.pop()
print(stack)

print("Finally the stack is")
print(stack)