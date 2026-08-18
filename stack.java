class stack
{
    int top;
    int maxsize;
    int[] stackarray;

    stack(int size)
    {
        maxsize = size;
        stackarray = new int[maxsize];
        top = -1;
    }

    void push(int value)
    {
        if (top == maxsize - 1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            stackarray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stackarray[top--];
        }
    }

    int peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stackarray[top];
        }
    }

    boolean isEmpty()
    {
        return (top == -1);
    }

    boolean isFull()
    {
        return (top == maxsize - 1);
    }
}